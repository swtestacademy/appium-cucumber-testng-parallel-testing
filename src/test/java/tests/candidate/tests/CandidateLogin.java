package tests.candidate.tests;

import org.testng.annotations.Test;
import screens.LoginScreen;
import screens.MyProfileScreen;
import screens.PassCodeScreen;
import screens.CandidateLoginScreen;
import tests.BaseTest;
import tests.ThreadLocalDriver;

public class CandidateLogin extends BaseTest {

    public LoginScreen loginScreen;
    public CandidateLoginScreen profileLoginScreen;
    public PassCodeScreen passCodeScreen;
    public MyProfileScreen myProfileScreen;

    @Test
    public void candidateLogin_Successful () {
        loginScreen = new LoginScreen(ThreadLocalDriver.getTLDriver());
        profileLoginScreen = new CandidateLoginScreen(ThreadLocalDriver.getTLDriver());
        passCodeScreen = new PassCodeScreen(ThreadLocalDriver.getTLDriver());
        myProfileScreen = new MyProfileScreen(ThreadLocalDriver.getTLDriver());

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
