package de.kai_morich.simple_bluetooth_terminal;

import android.app.Activity;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothSocket;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.security.InvalidParameterException;
import java.util.Arrays;
import java.util.Date;
import java.util.UUID;
import java.util.concurrent.Executors;

class SerialSocket implements Runnable {

    private static final UUID BLUETOOTH_SPP = UUID.fromString("00001101-0000-1000-8000-00805F9B34FB");

    private final BroadcastReceiver disconnectBroadcastReceiver;

    private final Context context;
    private SerialListener listener;
    private final BluetoothDevice device;
    private BluetoothSocket socket;
    private boolean connected;

    SerialSocket(Context context, BluetoothDevice device) {
        if(context instanceof Activity)
            throw new InvalidParameterException("expected non UI context");
        this.context = context;
        this.device = device;
        disconnectBroadcastReceiver = new BroadcastReceiver() {
            @Override
            public void onReceive(Context context, Intent intent) {
                if(listener != null)
                    listener.onSerialIoError(new IOException("background disconnect"));
                disconnect(); // disconnect now, else would be queued until UI re-attached
            }
        };
    }

    String getName() {
        return device.getName() != null ? device.getName() : device.getAddress();
    }

    /**
     * connect-success and most connect-errors are returned asynchronously to listener
     */
    void connect(SerialListener listener) throws IOException {
        this.listener = listener;
        context.registerReceiver(disconnectBroadcastReceiver, new IntentFilter(Constants.INTENT_ACTION_DISCONNECT));
        Executors.newSingleThreadExecutor().submit(this);
    }

    void disconnect() {
        listener = null; // ignore remaining data and errors
        // connected = false; // run loop will reset connected
        if(socket != null) {
            try {
                socket.close();
            } catch (Exception ignored) {
            }
            socket = null;
        }
        try {
            context.unregisterReceiver(disconnectBroadcastReceiver);
        } catch (Exception ignored) {
        }
    }

    void write(byte[] data) throws IOException {
        if (!connected)
            throw new IOException("not connected");
        socket.getOutputStream().write(data);
    }

    @Override
    public void run() { // connect & read
        try {
            socket = device.createRfcommSocketToServiceRecord(BLUETOOTH_SPP);
            socket.connect();
            if(listener != null)
                listener.onSerialConnect();
        } catch (Exception e) {
            if(listener != null)
                listener.onSerialConnectError(e);
            try {
                socket.close();
            } catch (Exception ignored) {
            }
            socket = null;
            return;
        }
        connected = true;
        try {
            // 여기길이에따라서 짤리는듯. 1024
            byte[] buffer = new byte[4096];
            int len;
            //noinspection InfiniteLoopStatement
            Integer result = null;
            System.out.println("*******");
            // 이쪽에
            int cnt = 0;
            Integer dataLength = null;
            Integer resultLength = null;
            // 커넥션은 한번만 넘기기때문에 이쪽에서 커넥션 맺을때 카운트든 뭐든 유니크값을 남겨야됨.
            // 지금 이앱같은경우는 커넥션을 한번맺어두면 아래 인풋스트림으로 계속해서 작동을해요.
            // 그러니까 한번, 두번 시도를할때마다 카운팅을칠수있는 무언가가필요해
            // 나는 그래서
            Date date = new Date();
            while (true) {
                cnt++;
                System.out.println(11111);
                len = socket.getInputStream().read(buffer);
                byte[] data = Arrays.copyOf(buffer, len);
                if (listener != null) {
                    System.out.println(44);
                    dataLength = listener.onSerialRead(data);
                    System.out.println("dataLength >>> " + dataLength);
//                    if(dataLength != null){
//                        resultLength = dataLength;
//                    }
//                    cnt++;
//
//                    if( resultLength == cnt ){
//                        System.out.println("파일받기 종료.");
//                    }
//                    여기가 실질적인 데이터를 넘기는 곳이니까..
//                    그렇다면 여기에 매개변수를 늘려서 전달전달전달 해서 fileName용용
//                    resultLength = listener.onSerialRead(data);
//                    if(resultLength != null){   // 처음인입했을때만 시작
////                        while 문은 계속반복될거야 왜ㅣ냐 true로 잡고있으니까
////                        그렇기에 우리가 최초실행잡을수있는건 파이썬에서 넘겨준 length로 판단가능.
//                        dataLength = resultLength;
//                    }
//
//                    System.out.println("resultLength >>> " + resultLength);
//
//                    if(dataLength != null){
//                        if( dataLength == ++cnt){
//    //                        계속돌다가 결국에 데이터랭쓰까지다돌면 찍힐곳
//                            System.out.println("데이터 while 완료");
//                            이부분을 생각한건데 return이 여기까지 제대로 전달이안되는게 확인이필요하다는거.
//                        }
//                    }

                }
            }
        } catch (Exception e) {
            connected = false;
            if (listener != null)
                listener.onSerialIoError(e);
            try {
                socket.close();
            } catch (Exception ignored) {
            }
            socket = null;
            e.printStackTrace();
        }finally {
            System.out.println(2222);
        }
    }

}
