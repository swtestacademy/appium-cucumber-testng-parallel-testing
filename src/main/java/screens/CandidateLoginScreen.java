package screens;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

public class CandidateLoginScreen extends BaseScreen {

    public CandidateLoginScreen(AndroidDriver driver) {
        super(driver);
    }

    //Mobile Elements
    String loginButton = "com.isinolsun.app:id/login";

    public void clickLogin () {
        waitVisibility(By.id(loginButton));
        click(By.id(loginButton));
    }


}
