package screens;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

public class CandidateRegisterScreen extends BaseScreen{
    public CandidateRegisterScreen(AndroidDriver driver) {
        super(driver);
    }

    //Screen Variables
    String registerButton = "com.isinolsun.app:id/register";
    String nameSurname = "com.isinolsun.app:id/blue_collar_register_first_step_edt_names";
    String addPhotoXpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget." +
            "FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.support.v4.widget." +
            "DrawerLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget." +
            "LinearLayout/android.support.v4.view.ViewPager/android.support.v4.view.ViewPager/android.widget." +
            "ScrollView/android.widget.LinearLayout/android.widget." +
            "FrameLayout/android.widget.LinearLayout/android.widget.ImageView";
    String permissionButton = "com.android.packageinstaller:id/permission_allow_button";
    String cameraXpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget." +
            "FrameLayout/android.widget.FrameLayout/android.widget." +
            "LinearLayout/android.widget.ListView/android.widget." +
            "LinearLayout/android.widget.LinearLayout[3]/android.widget." +
            "FrameLayout/android.widget.ImageView";
    String photoButton = "com.lge.camera:id/shutter_bottom_comp_type";



    public void clickRegister () {
        waitVisibility(By.id(registerButton));
        click(By.id(registerButton));
        waitVisibility(By.id(nameSurname));
    }

    public void addPhoto () {
        click(By.xpath(addPhotoXpath));
        click(By.id(permissionButton));
        sleep(500);
        click(By.id(permissionButton));
        click(By.xpath(cameraXpath));
        click(By.id(photoButton));
        sleep(1500);
        click(By.id("com.lge.camera:id/btn_ok"));
        click(By.id("com.isinolsun.app:id/menu_crop"));
    }
}
