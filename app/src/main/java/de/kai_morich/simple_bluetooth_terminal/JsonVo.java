package de.kai_morich.simple_bluetooth_terminal;

import android.app.Application;
 
public class JsonVo{

    private Integer length;

    public Integer getLength() {
        return length;
    }

    public void setLength(Integer length) {
        this.length = length;
    }

    private String SensorID;
    private String WindDirection;
    private String WindSpeed;
    private String AirTemperature;
    private String AirPressure;
    private String Rhumidity;
    private String absHumidity;
    private String Temperature_ext;
    private String Humidity_ext;
    private String Lux;
    private String tVOC;
    private String eCO2;
    private String rawH2;
    private String rawEthanol;
    private String tVOC_base;
    private String eCO2_base;
    private String WHeightTop;
    private String WHeightBottom;
    private String WHeightMean;
    private String WDepth;
    private String WTemp;
    private String mc1p0;
    private String mc2p5;
    private String mc4p0;
    private String mc10p0;
    private String nc0p5;
    private String nc1p0;
    private String nc2p5;
    private String nc4p0;
    private String nc10p0;
    private String typPsize;
    private String Vbat;
    private String Ibat;
    private String Jbat;
    private String Vload;
    private String Iload;
    private String Jload;
    private String Veh;
    private String Ieh;
    private String Jeh;
    private String sensorErr;
    private String batteryLow;
    private String packetSendCnt;
    private String RSSI;
    private String RCVTime;
    private String XMITTime;

    @Override
    public String toString() {

        if( length != null){
            return "length : " + length;
        }
        return "JsonVo{" +
                "length=" + length +
                ", SensorID='" + SensorID + '\'' +
                ", WindDirection='" + WindDirection + '\'' +
                ", WindSpeed='" + WindSpeed + '\'' +
                ", AirTemperature='" + AirTemperature + '\'' +
                ", AirPressure='" + AirPressure + '\'' +
                ", Rhumidity='" + Rhumidity + '\'' +
                ", absHumidity='" + absHumidity + '\'' +
                ", Temperature_ext='" + Temperature_ext + '\'' +
                ", Humidity_ext='" + Humidity_ext + '\'' +
                ", Lux='" + Lux + '\'' +
                ", tVOC='" + tVOC + '\'' +
                ", eCO2='" + eCO2 + '\'' +
                ", rawH2='" + rawH2 + '\'' +
                ", rawEthanol='" + rawEthanol + '\'' +
                ", tVOC_base='" + tVOC_base + '\'' +
                ", eCO2_base='" + eCO2_base + '\'' +
                ", WHeightTop='" + WHeightTop + '\'' +
                ", WHeightBottom='" + WHeightBottom + '\'' +
                ", WHeightMean='" + WHeightMean + '\'' +
                ", WDepth='" + WDepth + '\'' +
                ", WTemp='" + WTemp + '\'' +
                ", mc1p0='" + mc1p0 + '\'' +
                ", mc2p5='" + mc2p5 + '\'' +
                ", mc4p0='" + mc4p0 + '\'' +
                ", mc10p0='" + mc10p0 + '\'' +
                ", nc0p5='" + nc0p5 + '\'' +
                ", nc1p0='" + nc1p0 + '\'' +
                ", nc2p5='" + nc2p5 + '\'' +
                ", nc4p0='" + nc4p0 + '\'' +
                ", nc10p0='" + nc10p0 + '\'' +
                ", typPsize='" + typPsize + '\'' +
                ", Vbat='" + Vbat + '\'' +
                ", Ibat='" + Ibat + '\'' +
                ", Jbat='" + Jbat + '\'' +
                ", Vload='" + Vload + '\'' +
                ", Iload='" + Iload + '\'' +
                ", Jload='" + Jload + '\'' +
                ", Veh='" + Veh + '\'' +
                ", Ieh='" + Ieh + '\'' +
                ", Jeh='" + Jeh + '\'' +
                ", sensorErr='" + sensorErr + '\'' +
                ", batteryLow='" + batteryLow + '\'' +
                ", packetSendCnt='" + packetSendCnt + '\'' +
                ", RSSI='" + RSSI + '\'' +
                ", RCVTime='" + RCVTime + '\'' +
                ", XMITTime='" + XMITTime + '\'' +
                '}';
    }

    public String getSensorID() {
        return SensorID;
    }

    public void setSensorID(String sensorID) {
        SensorID = sensorID;
    }

    public String getWindDirection() {
        return WindDirection;
    }

    public void setWindDirection(String windDirection) {
        WindDirection = windDirection;
    }

    public String getWindSpeed() {
        return WindSpeed;
    }

    public void setWindSpeed(String windSpeed) {
        WindSpeed = windSpeed;
    }

    public String getAirTemperature() {
        return AirTemperature;
    }

    public void setAirTemperature(String airTemperature) {
        AirTemperature = airTemperature;
    }

    public String getAirPressure() {
        return AirPressure;
    }

    public void setAirPressure(String airPressure) {
        AirPressure = airPressure;
    }

    public String getRhumidity() {
        return Rhumidity;
    }

    public void setRhumidity(String rhumidity) {
        Rhumidity = rhumidity;
    }

    public String getAbsHumidity() {
        return absHumidity;
    }

    public void setAbsHumidity(String absHumidity) {
        this.absHumidity = absHumidity;
    }

    public String getTemperature_ext() {
        return Temperature_ext;
    }

    public void setTemperature_ext(String temperature_ext) {
        Temperature_ext = temperature_ext;
    }

    public String getHumidity_ext() {
        return Humidity_ext;
    }

    public void setHumidity_ext(String humidity_ext) {
        Humidity_ext = humidity_ext;
    }

    public String getLux() {
        return Lux;
    }

    public void setLux(String lux) {
        Lux = lux;
    }

    public String gettVOC() {
        return tVOC;
    }

    public void settVOC(String tVOC) {
        this.tVOC = tVOC;
    }

    public String geteCO2() {
        return eCO2;
    }

    public void seteCO2(String eCO2) {
        this.eCO2 = eCO2;
    }

    public String getRawH2() {
        return rawH2;
    }

    public void setRawH2(String rawH2) {
        this.rawH2 = rawH2;
    }

    public String getRawEthanol() {
        return rawEthanol;
    }

    public void setRawEthanol(String rawEthanol) {
        this.rawEthanol = rawEthanol;
    }

    public String gettVOC_base() {
        return tVOC_base;
    }

    public void settVOC_base(String tVOC_base) {
        this.tVOC_base = tVOC_base;
    }

    public String geteCO2_base() {
        return eCO2_base;
    }

    public void seteCO2_base(String eCO2_base) {
        this.eCO2_base = eCO2_base;
    }

    public String getWHeightTop() {
        return WHeightTop;
    }

    public void setWHeightTop(String WHeightTop) {
        this.WHeightTop = WHeightTop;
    }

    public String getWHeightBottom() {
        return WHeightBottom;
    }

    public void setWHeightBottom(String WHeightBottom) {
        this.WHeightBottom = WHeightBottom;
    }

    public String getWHeightMean() {
        return WHeightMean;
    }

    public void setWHeightMean(String WHeightMean) {
        this.WHeightMean = WHeightMean;
    }

    public String getWDepth() {
        return WDepth;
    }

    public void setWDepth(String WDepth) {
        this.WDepth = WDepth;
    }

    public String getWTemp() {
        return WTemp;
    }

    public void setWTemp(String WTemp) {
        this.WTemp = WTemp;
    }

    public String getMc1p0() {
        return mc1p0;
    }

    public void setMc1p0(String mc1p0) {
        this.mc1p0 = mc1p0;
    }

    public String getMc2p5() {
        return mc2p5;
    }

    public void setMc2p5(String mc2p5) {
        this.mc2p5 = mc2p5;
    }

    public String getMc4p0() {
        return mc4p0;
    }

    public void setMc4p0(String mc4p0) {
        this.mc4p0 = mc4p0;
    }

    public String getMc10p0() {
        return mc10p0;
    }

    public void setMc10p0(String mc10p0) {
        this.mc10p0 = mc10p0;
    }

    public String getNc0p5() {
        return nc0p5;
    }

    public void setNc0p5(String nc0p5) {
        this.nc0p5 = nc0p5;
    }

    public String getNc1p0() {
        return nc1p0;
    }

    public void setNc1p0(String nc1p0) {
        this.nc1p0 = nc1p0;
    }

    public String getNc2p5() {
        return nc2p5;
    }

    public void setNc2p5(String nc2p5) {
        this.nc2p5 = nc2p5;
    }

    public String getNc4p0() {
        return nc4p0;
    }

    public void setNc4p0(String nc4p0) {
        this.nc4p0 = nc4p0;
    }

    public String getNc10p0() {
        return nc10p0;
    }

    public void setNc10p0(String nc10p0) {
        this.nc10p0 = nc10p0;
    }

    public String getTypPsize() {
        return typPsize;
    }

    public void setTypPsize(String typPsize) {
        this.typPsize = typPsize;
    }

    public String getVbat() {
        return Vbat;
    }

    public void setVbat(String vbat) {
        Vbat = vbat;
    }

    public String getIbat() {
        return Ibat;
    }

    public void setIbat(String ibat) {
        Ibat = ibat;
    }

    public String getJbat() {
        return Jbat;
    }

    public void setJbat(String jbat) {
        Jbat = jbat;
    }

    public String getVload() {
        return Vload;
    }

    public void setVload(String vload) {
        Vload = vload;
    }

    public String getIload() {
        return Iload;
    }

    public void setIload(String iload) {
        Iload = iload;
    }

    public String getJload() {
        return Jload;
    }

    public void setJload(String jload) {
        Jload = jload;
    }

    public String getVeh() {
        return Veh;
    }

    public void setVeh(String veh) {
        Veh = veh;
    }

    public String getIeh() {
        return Ieh;
    }

    public void setIeh(String ieh) {
        Ieh = ieh;
    }

    public String getJeh() {
        return Jeh;
    }

    public void setJeh(String jeh) {
        Jeh = jeh;
    }

    public String getSensorErr() {
        return sensorErr;
    }

    public void setSensorErr(String sensorErr) {
        this.sensorErr = sensorErr;
    }

    public String getBatteryLow() {
        return batteryLow;
    }

    public void setBatteryLow(String batteryLow) {
        this.batteryLow = batteryLow;
    }

    public String getPacketSendCnt() {
        return packetSendCnt;
    }

    public void setPacketSendCnt(String packetSendCnt) {
        this.packetSendCnt = packetSendCnt;
    }

    public String getRSSI() {
        return RSSI;
    }

    public void setRSSI(String RSSI) {
        this.RSSI = RSSI;
    }

    public String getRCVTime() {
        return RCVTime;
    }

    public void setRCVTime(String RCVTime) {
        this.RCVTime = RCVTime;
    }

    public String getXMITTime() {
        return XMITTime;
    }

    public void setXMITTime(String XMITTime) {
        this.XMITTime = XMITTime;
    }
}
