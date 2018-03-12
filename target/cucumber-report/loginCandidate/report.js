$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/tests/cucumber/features/LoginCandidate.feature");
formatter.feature({
  "line": 2,
  "name": "Candidate Successful Login Feature",
  "description": "",
  "id": "candidate-successful-login-feature",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Candidate"
    }
  ]
});
formatter.before({
  "duration": 238355695360,
  "error_message": "java.lang.NullPointerException\r\n\tat com.google.common.base.Preconditions.checkNotNull(Preconditions.java:882)\r\n\tat org.openqa.selenium.support.ui.FluentWait.\u003cinit\u003e(FluentWait.java:96)\r\n\tat org.openqa.selenium.support.ui.WebDriverWait.\u003cinit\u003e(WebDriverWait.java:72)\r\n\tat org.openqa.selenium.support.ui.WebDriverWait.\u003cinit\u003e(WebDriverWait.java:46)\r\n\tat screens.BaseScreen.\u003cinit\u003e(BaseScreen.java:19)\r\n\tat screens.ProfileLoginScreen.\u003cinit\u003e(ProfileLoginScreen.java:10)\r\n\tat tests.cucumber.steps.LoginSteps.setup(LoginSteps.java:24)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\r\n\tat java.lang.reflect.Method.invoke(Method.java:498)\r\n\tat cucumber.runtime.Utils$1.call(Utils.java:40)\r\n\tat cucumber.runtime.Timeout.timeout(Timeout.java:16)\r\n\tat cucumber.runtime.Utils.invoke(Utils.java:34)\r\n\tat cucumber.runtime.java.JavaHookDefinition.execute(JavaHookDefinition.java:60)\r\n\tat cucumber.runtime.Runtime.runHookIfTagsMatch(Runtime.java:224)\r\n\tat cucumber.runtime.Runtime.runHooks(Runtime.java:212)\r\n\tat cucumber.runtime.Runtime.runBeforeHooks(Runtime.java:202)\r\n\tat cucumber.runtime.model.CucumberScenario.run(CucumberScenario.java:40)\r\n\tat cucumber.runtime.model.CucumberFeature.run(CucumberFeature.java:165)\r\n\tat cucumber.api.testng.TestNGCucumberRunner.runCucumber(TestNGCucumberRunner.java:63)\r\n\tat cucumber.api.testng.AbstractTestNGCucumberTests.feature(AbstractTestNGCucumberTests.java:21)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\r\n\tat java.lang.reflect.Method.invoke(Method.java:498)\r\n\tat org.testng.internal.MethodInvocationHelper.invokeMethod(MethodInvocationHelper.java:108)\r\n\tat org.testng.internal.Invoker.invokeMethod(Invoker.java:661)\r\n\tat org.testng.internal.Invoker.invokeTestMethod(Invoker.java:869)\r\n\tat org.testng.internal.Invoker.invokeTestMethods(Invoker.java:1193)\r\n\tat org.testng.internal.TestMethodWorker.invokeTestMethods(TestMethodWorker.java:126)\r\n\tat org.testng.internal.TestMethodWorker.run(TestMethodWorker.java:109)\r\n\tat java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1149)\r\n\tat java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:624)\r\n\tat java.lang.Thread.run(Thread.java:748)\r\n",
  "status": "failed"
});
formatter.scenario({
  "line": 4,
  "name": "Login the app successfully as a candidate",
  "description": "",
  "id": "candidate-successful-login-feature;login-the-app-successfully-as-a-candidate",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "I have skipped Splash and Tutorial pages and I am on the job selection pages",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I click İs Ariyorum button",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I go to Profilim page",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "I click Giris Yap button",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I fill \"5910000010\" as my telephone number",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I click Giriş Yap button",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "I give permission for SMS",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "I fill \"35880\" as a login code",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "I click Tamam button",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "I should see my profile page",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.iHaveSkippedSplashAndTutorialPagesAndIAmOnTheJobSelectionPage()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "LoginSteps.iClickİsAriyorumButton()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "LoginSteps.iGoToProfilimPage()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "LoginSteps.iClickGirisYapButton()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "5910000010",
      "offset": 8
    }
  ],
  "location": "LoginSteps.iFillAsMyTelephoneNumber(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "LoginSteps.iClickGirişYapButton()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "LoginSteps.iGivePermissionForSMS()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "35880",
      "offset": 8
    }
  ],
  "location": "LoginSteps.iFillAsALoginCode(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "LoginSteps.iClickTamamButton()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "LoginSteps.iShouldSeeMyProfilePage()"
});
formatter.result({
  "status": "skipped"
});
});