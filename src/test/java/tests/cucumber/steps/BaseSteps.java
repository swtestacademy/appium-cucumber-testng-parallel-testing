package tests.cucumber.steps;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import screens.*;
import tests.ThreadLocalDriver;

public class BaseSteps {

    protected SplashScreen splashScreen = null;
    protected TutorialScreen tutorialScreen = null;
    protected SelectionScreen selectionScreen = null;
    protected CandidateMainScreen candidateMainScreen = null;
    protected WebDriverWait wait;

    //Screen Classes Initialization
    protected void setupCucumber () {
        System.out.println("Cucumber Base Test Before-login-test-cucumber");
        wait = new WebDriverWait(ThreadLocalDriver.getTLDriver(), 10);
        splashScreen = new SplashScreen(ThreadLocalDriver.getTLDriver());
        tutorialScreen = new TutorialScreen(ThreadLocalDriver.getTLDriver());
        selectionScreen = new SelectionScreen(ThreadLocalDriver.getTLDriver());
        candidateMainScreen = new CandidateMainScreen(ThreadLocalDriver.getTLDriver());

        /*//Unlock the device if it is locked.
        final Runtime rt = Runtime.getRuntime();
        try {
            rt.exec("adb shell input keyevent 224");
        } catch (IOException e) {
            e.printStackTrace();
        }*/
    }

    protected void teardown(){
        ThreadLocalDriver.getTLDriver().quit();
    }
}
