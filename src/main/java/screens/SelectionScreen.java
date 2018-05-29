package screens;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

public class SelectionScreen extends BaseScreen {

    public SelectionScreen(AndroidDriver driver) {
        super(driver);
    }

    //Mobile Elements
    String isAriyorumButtonId = "com.isinolsun.app:id/bluecollar_type_button";


    public void selectIsAriyorum () {
        waitAndClick(By.id(isAriyorumButtonId));
    }

}
