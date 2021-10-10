$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/FeatureCollections/Items.feature");
formatter.feature({
  "name": "Items",
  "description": "",
  "keyword": "Feature"
});
formatter.background({
  "name": "user is successfully logged in",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "user opens the \"chrome\" browser",
  "keyword": "Given "
});
formatter.match({
  "location": "Login.OpenBrowser(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters the url \"http://automationpractice.com/index.php\"",
  "keyword": "Given "
});
formatter.match({
  "location": "Login.OpenBrowser1(String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Verify if user can search Item using searchbox \u0026 select",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@SmokeTest"
    }
  ]
});
formatter.step({
  "name": "user is on the application login page",
  "keyword": "Given "
});
formatter.match({
  "location": "Login.LoginPage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on Sign in link",
  "keyword": "And "
});
formatter.match({
  "location": "Login.SignInLink()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "an existing user enters an email address as \"testuser789@gmail.com\"",
  "keyword": "And "
});
formatter.match({
  "location": "Login.EnterExistingUsername(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "an existing user enters an password as \"windows@123\"",
  "keyword": "And "
});
formatter.match({
  "location": "Login.EnterExistingPassword(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "existing user clicks on SignIn button",
  "keyword": "And "
});
formatter.match({
  "location": "Login.ClickExSignInBtn()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user lands on the My Account page",
  "keyword": "Then "
});
formatter.match({
  "location": "MyAccounts.MyAccountpage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on Dresses mega menu",
  "keyword": "And "
});
formatter.match({
  "location": "MyAccounts.ClickOnDressesMegaMenu()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on Summer Dresses mega menu",
  "keyword": "And "
});
formatter.match({
  "location": "MyAccounts.ClickOnSummerDressesMegaMenu()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Summer Dresses page opens with text as \"SUMMER DRESSES \"",
  "keyword": "And "
});
formatter.match({
  "location": "MyAccounts.VerifySummerDressesPageOpens(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters \"Dress\" into the Global Item searchbox",
  "keyword": "Then "
});
formatter.match({
  "location": "Items.SearchAnItem(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user selects Printed Chiffon Item from the list",
  "keyword": "And "
});
formatter.match({
  "location": "Items.SelectItem()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "\"Printed Chiffon Dress\" is displayed in Details view",
  "keyword": "Then "
});
formatter.match({
  "location": "Items.VerifyPrintedChiffonDress(String)"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded0.png", null);
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});