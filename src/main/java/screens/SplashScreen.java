package screens;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

public class SplashScreen extends BaseScreen{

    public SplashScreen(AndroidDriver<MobileElement> driver) {
        super(driver);
    }

    //Mobile Elements
    String animationViewId = "com.isinolsun.app:id/animation_view";

    public void skipSplashScreen ()  {
        waitAndClick(By.id(animationViewId));
    }
}
