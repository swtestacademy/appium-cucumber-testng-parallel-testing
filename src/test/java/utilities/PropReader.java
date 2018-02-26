package utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropReader {

    private static PropReader instance;
    private static final Object lock = new Object();

    private static String deviceName;
    private static String udid;
    private static String platformName;
    private static String platformVersion;
    private static String appPackage;
    private static String appActivity;
    private static String noReset;
    private static String URL;

    private PropReader() {
    }

    public static PropReader GetInstance() {
        if (instance == null) {
            synchronized (lock) {
                if (instance == null) {
                    instance = new PropReader();
                    instance.LoadDeviceData();
                }
            }
        }
        return instance;
    }

    private void LoadDeviceData() {
        Properties prop = new Properties();
        try {
            prop.load(new FileInputStream("device-configuration.properties"));
        } catch (IOException e) {
            System.out.println("Device Configuration properties file cannot be found");
        }
        deviceName = prop.getProperty("DeviceName");
        udid = prop.getProperty("UDID");
        platformName = prop.getProperty("PlatformName");
        platformVersion = prop.getProperty("PlatformVersion");
        appPackage = prop.getProperty("AppPackage");
        appActivity = prop.getProperty("AppActivity");
        noReset = prop.getProperty("NoReset");
        URL = prop.getProperty("URL");
    }

    //Getters (Get Methods)
    public static String getDeviceName(){
        return deviceName;
    }
    public static String getUDID(){
        return udid;
    }
    public static String getPlatformName(){
        return platformName;
    }
    public static String getPlatformVersion(){
        return platformVersion;
    }
    public static String getAppPackage(){
        return appPackage;
    }
    public static String getAppActivity(){
        return appActivity;
    }
    public static String getNoReset(){
        return noReset;
    }
    public static String getURL(){
        return URL;
    }

}
