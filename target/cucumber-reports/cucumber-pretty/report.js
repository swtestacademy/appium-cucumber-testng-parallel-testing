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
  "duration": 95549013,
  "status": "passed"
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
  "duration": 8446189653,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.iClickİsAriyorumButton()"
});
formatter.result({
  "duration": 3077363200,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.iGoToProfilimPage()"
});
formatter.result({
  "duration": 1030724267,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.iClickGirisYapButton()"
});
formatter.result({
  "duration": 855348480,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "5910000010",
      "offset": 8
    }
  ],
  "location": "LoginSteps.iFillAsMyTelephoneNumber(String)"
});fformatter.result({
  "duration": 7253350827,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.iClickGirişYapButton()"
});
formatter.result({
  "duration": 1442021547,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.iGivePermissionForSMS()"
});
formatter.result({
  "duration": 1901761707,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "35880",
      "offset": 8
    }
  ],
  "location": "LoginSteps.iFillAsALoginCode(String)"
});fformatter.result({
  "duration": 6341557760,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.iClickTamamButton()"
});
formatter.result({
  "duration": 1902310400,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.iShouldSeeMyProfilePage()"
});
formatter.result({
  "duration": 1283732053,
  "status": "passed"
});
formatter.after({
  "duration": 97280,
  "status": "passed"
});
});