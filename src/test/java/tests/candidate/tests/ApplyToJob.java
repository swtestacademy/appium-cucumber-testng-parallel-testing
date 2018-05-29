package tests.candidate.tests;

import org.testng.annotations.Test;
import tests.BaseTest;

public class ApplyToJob extends BaseTest {

    @Test
    public void applyToJob () {
        splashScreen.skipSplashScreen();
        tutorialScreen.skipTutorial();
        selectionScreen.selectIsAriyorum();
        candidateMainScreen.allowNotification();
        //candidateMainScreen.clickToJob();
    }
}
