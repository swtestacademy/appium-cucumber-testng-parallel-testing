package screens;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

public class ProfileLoginScreen extends BaseScreen {

    public ProfileLoginScreen(AndroidDriver<MobileElement> driver) {
        super(driver);
    }

    //Mobile Elements
    String loginButton = "com.isinolsun.app:id/login";



    public void clickLogin () {
            click(By.id(loginButton));

    }
}
