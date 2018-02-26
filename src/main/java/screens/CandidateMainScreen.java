package screens;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

public class CandidateMainScreen extends BaseScreen {


    public CandidateMainScreen(AndroidDriver<MobileElement> driver) {
        super(driver);
    }

    //Mobile Elements
    String notificationButtonId = "com.android.packageinstaller:id/permission_allow_button";
    String secondNewJobXpath = "//android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.RelativeLayout";
    String profileIconXpath = "//android.widget.LinearLayout[4]/android.widget.ImageView";


    public void allowNotification () {
        if(waitAndFindElements(By.id(notificationButtonId)).size()>0){
            click(By.id(notificationButtonId));
        }
    }

    public void clickToJob () {
        waitAndClick(By.xpath(secondNewJobXpath));
    }

    public void clickToProfile () {
        waitAndClick(By.xpath(profileIconXpath));
    }


}
