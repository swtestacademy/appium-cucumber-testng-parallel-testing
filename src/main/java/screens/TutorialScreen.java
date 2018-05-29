package screens;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

public class TutorialScreen extends BaseScreen{

    public TutorialScreen (AndroidDriver driver) {
        super(driver);
    }

    //Mobile Elements
    String skipTutorialButtonId = "com.isinolsun.app:id/btn_skip";

    public void skipTutorial () {
        waitAndClick(By.id(skipTutorialButtonId));
    }
}
