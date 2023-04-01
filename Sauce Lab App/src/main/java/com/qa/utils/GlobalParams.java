package com.qa.utils;

@SuppressWarnings("ALL")
public class GlobalParams {
    private static ThreadLocal<String> platformName = new ThreadLocal<>();
    private static ThreadLocal<String> udid = new ThreadLocal<>();
    private static ThreadLocal<String> deviceName = new ThreadLocal<>();
    private static ThreadLocal<String> systemPort = new ThreadLocal<>();
    private static ThreadLocal<String> chromeDriverPort = new ThreadLocal<>();

    // setter method for platformName
    public static void setPlatformName(String platformName) {
        GlobalParams.platformName.set(platformName);
    }
    // get method for platformName
    public static String getPlatformName() {
        return GlobalParams.platformName.get();
    }

    // setter method for udid
    public static void setUdid (String udid) {
        GlobalParams.udid.set(udid);
    }
    // get method for udid
    public static String getUdid() {
        return GlobalParams.udid.get();
    }
    // setter method for deviceName
    public static void setdeviceName(String deviceName){
        GlobalParams.deviceName.set(deviceName);
    }
    // get devise name
    public static String getdeviceName(){
        return GlobalParams.deviceName.get();
    }
    // setter method for systemPort
    public static void setSystemPort(String systemPort){
        GlobalParams.systemPort.set(systemPort);
    }
    // get systemPort
    public static String getSystemPort(){
        return GlobalParams.systemPort.get();
    }
    // setter method for chromeDriverPort
    public static void setChromeDriverPort(String chromeDriverPort){
        GlobalParams.chromeDriverPort.set(chromeDriverPort);
    }
    // get chromeDriverPort
    public static String getChromeDriverPort(){
        return GlobalParams.chromeDriverPort.get();
    }

    public void initializeGlobalParams(){
        GlobalParams params = new GlobalParams();
        params.setPlatformName(System.getProperty("platformName", "Android"));
        params.setUdid(System.getProperty("udid", "emulator-5554"));
        params.setdeviceName(System.getProperty("deviceName", "Pixel_4_API_27"));
        params.setSystemPort(System.getProperty("systemPort", "1000"));
        params.setChromeDriverPort(System.getProperty("chromeDriverPort", "1100"));

    }

}
