package tests.cucumber.steps;

import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.jsoup.Connection;
import org.openqa.selenium.support.ui.WebDriverWait;
import screens.LoginScreen;
import screens.MyProfileScreen;
import screens.PassCodeScreen;
import screens.ProfileLoginScreen;


public class LoginSteps extends BaseSteps {

    //Burada BaseTEst'deki gibi bir setup yapmam lazım. Thread local driver ortak olacak.
    ProfileLoginScreen profileLoginScreen;
    LoginScreen loginScreen;
    PassCodeScreen passCodeScreen;
    MyProfileScreen myProfileScreen;

    //Screen Classes Initialization
    @Before
    public void setupLoginSteps () {
        System.out.println("Cucumber Before-login-test-cucumber");
        setupCucumber();
        profileLoginScreen = new ProfileLoginScreen(driver);
        loginScreen = new LoginScreen(driver);
        passCodeScreen = new PassCodeScreen(driver);
        myProfileScreen = new MyProfileScreen(driver);

    }

    @Given("^I have skipped Splash and Tutorial pages and I am on the job selection pages$")
    public void iHaveSkippedSplashAndTutorialPagesAndIAmOnTheJobSelectionPage() throws Throwable {
        System.out.println("Cucumber Given");
        // Write code here that turns the phrase above into concrete actions
        splashScreen.skipSplashScreen();
        tutorialScreen.skipTutorial();
    }

    @When("^I click İs Ariyorum button$")
    public void iClickİsAriyorumButton() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        selectionScreen.selectIsAriyorum();
        candidateMainScreen.allowNotification();
    }

    @And("^I go to Profilim page$")
    public void iGoToProfilimPage() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        candidateMainScreen.clickToProfile();
    }

    @And("^I click Giris Yap button$")
    public void iClickGirisYapButton() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        profileLoginScreen.clickLogin();
    }

    @And("^I fill \"([^\"]*)\" as my telephone number$")
    public void iFillAsMyTelephoneNumber(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        loginScreen.enterPhoneNumber(arg0);
    }

    @And("^I click Giriş Yap button$")
    public void iClickGirişYapButton() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        loginScreen.clickLogin();
    }

    @And("^I give permission for SMS$")
    public void iGivePermissionForSMS() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        passCodeScreen.allowNotification();
    }


    @And("^I fill \"([^\"]*)\" as a login code$")
    public void iFillAsALoginCode(String arg0) throws Throwable {
        passCodeScreen.sendPassCode();
    }

    @And("^I click Tamam button$")
    public void iClickTamamButton() throws Throwable {
        passCodeScreen.finishLogin();
    }

    @Then("^I should see my profile page$")
    public void iShouldSeeMyProfilePage() throws Throwable {
        myProfileScreen.checkWorkExperienceTitle();
    }

    @After
    public synchronized void teardown () {
       // teardown();
        System.out.println("teardown'a girdi!");
    }
}
