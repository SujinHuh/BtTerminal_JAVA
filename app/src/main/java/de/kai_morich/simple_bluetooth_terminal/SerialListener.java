package de.kai_morich.simple_bluetooth_terminal;

interface SerialListener {
    void onSerialConnect      ();
    void onSerialConnectError (Exception e);
    Integer onSerialRead         (byte[] data);
    void onSerialIoError      (Exception e);
}
