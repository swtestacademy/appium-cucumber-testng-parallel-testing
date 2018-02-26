package tests.candidate.tests;

import org.testng.annotations.Test;
import screens.LoginScreen;
import screens.MyProfileScreen;
import screens.PassCodeScreen;
import screens.ProfileLoginScreen;
import tests.BaseTest;

public class CandidateLogin extends BaseTest {

    public LoginScreen loginScreen;
    public ProfileLoginScreen profileLoginScreen;
    public PassCodeScreen passCodeScreen;
    public MyProfileScreen myProfileScreen;



    @Test
    public void candidateLogin_Successful () {
        loginScreen = new LoginScreen(driver);
        profileLoginScreen = new ProfileLoginScreen(driver);
        passCodeScreen = new PassCodeScreen(driver);
        myProfileScreen = new MyProfileScreen(driver);

        splashScreen.skipSplashScreen();
        tutorialScreen.skipTutorial();
        selectionScreen.selectIsAriyorum();
        candidateMainScreen.allowNotification();
        candidateMainScreen.clickToProfile();
        profileLoginScreen.clickLogin();
        loginScreen.enterPhoneNumber("5910000010");
        loginScreen.clickLogin();
        passCodeScreen.allowNotification();
        passCodeScreen.sendPassCode();
        passCodeScreen.finishLogin();
        myProfileScreen.checkWorkExperienceTitle();
        System.out.println("PASSED! --> candidateLogin_Successful test passed!");
    }

}
