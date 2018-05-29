package screens;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

public class LoginScreen extends BaseScreen {
    public LoginScreen(AndroidDriver driver) {
        super(driver);
    }

    //Mobile Elements
    String telephoneNumber = "com.isinolsun.app:id/login_phone_number";
    String loginButton = "com.isinolsun.app:id/login";



    public void enterPhoneNumber (String cellPhoneNumber) {
        sendText(By.id(telephoneNumber), cellPhoneNumber);
        //hideKeyboard();
    }

    public void clickLogin () {
        waitAndClick(By.id(loginButton));
    }


}
