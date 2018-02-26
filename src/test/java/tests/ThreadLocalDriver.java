package tests;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;


public class ThreadLocalDriver {

    private static ThreadLocal<AndroidDriver<MobileElement>> tlDriver = new ThreadLocal<>();

    //AF: Setting Webdriver to ThreadLocal driver (
    public static synchronized void setTLDriver(AndroidDriver driver) {
        tlDriver.set(driver);
    }

    public static synchronized AndroidDriver getTLDriver() {
        return tlDriver.get();
    }
}
