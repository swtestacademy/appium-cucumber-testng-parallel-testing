package tests;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import screens.CandidateMainScreen;
import screens.SelectionScreen;
import screens.SplashScreen;
import screens.TutorialScreen;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

public class BaseTest {

    public WebDriverWait wait;
    //private ThreadLocalDriver threadLocalDriver = new ThreadLocalDriver();
    //Base Screens for all cases
    protected SplashScreen splashScreen = null;
    protected TutorialScreen tutorialScreen = null;
    protected SelectionScreen selectionScreen = null;
    protected CandidateMainScreen candidateMainScreen = null;

    @BeforeMethod
    @Parameters({"deviceName", "platformVersion"})
    public void setup (String deviceName, String platformVersion) throws IOException {
        System.out.println("TestNG Before");

        //Unlock the device if it is locked.
        final Runtime rt = Runtime.getRuntime();
        rt.exec("adb shell input keyevent 224");

        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("deviceName", deviceName);
        caps.setCapability("platformVersion", platformVersion);
        caps.setCapability("platformName", "Android");
        caps.setCapability("appPackage", "com.isinolsun.app");
        caps.setCapability("appActivity","com.isinolsun.app.activities.SplashActivity");
        caps.setCapability("noReset","false");
        ThreadLocalDriver.setTLDriver(new AndroidDriver (new URL("http://127.0.0.1:4444/wd/hub"),caps));
        wait = new WebDriverWait(ThreadLocalDriver.getTLDriver(), 10);

        //Base Screen Initialization
        splashScreen = new SplashScreen(ThreadLocalDriver.getTLDriver());
        tutorialScreen = new TutorialScreen(ThreadLocalDriver.getTLDriver());
        selectionScreen = new SelectionScreen(ThreadLocalDriver.getTLDriver());
        candidateMainScreen = new CandidateMainScreen(ThreadLocalDriver.getTLDriver());
    }

    @AfterMethod
    public synchronized void teardown(){
        ThreadLocalDriver.getTLDriver().quit();
    }

}
