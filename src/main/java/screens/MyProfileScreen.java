package screens;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

public class MyProfileScreen extends BaseScreen{
    public MyProfileScreen(AndroidDriver<MobileElement> driver) {
        super(driver);
    }

    //Web Elements
    String workExperienceTitleId = "com.isinolsun.app:id/txt_title_job";
    String expectedWorkExperienceTitle = "İş Tecrübeleri";

    //Screen Methods
    public void checkWorkExperienceTitle () {
        waitVisibility(By.id(workExperienceTitleId));
        assertEquals(getText(By.id(workExperienceTitleId)), expectedWorkExperienceTitle);
    }

}
