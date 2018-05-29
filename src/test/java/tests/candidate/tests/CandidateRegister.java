package tests.candidate.tests;

import org.apache.tools.ant.taskdefs.Sleep;
import org.testng.annotations.Test;
import screens.*;
import tests.BaseTest;
import tests.ThreadLocalDriver;

public class CandidateRegister extends BaseTest {

    public CandidateRegisterScreen candidateRegisterScreen;


    @Test
    public void candidateLogin_Successful () throws InterruptedException {
        candidateRegisterScreen = new CandidateRegisterScreen(ThreadLocalDriver.getTLDriver());

        splashScreen.skipSplashScreen();
        tutorialScreen.skipTutorial();
        selectionScreen.selectIsAriyorum();
        candidateMainScreen.allowNotification();
        candidateMainScreen.clickToProfile();
        candidateRegisterScreen.clickRegister();
        candidateRegisterScreen.addPhoto();

       Thread.sleep(6000);



        System.out.println("PASSED! --> candidateLogin_Successful test passed!");
    }




}
