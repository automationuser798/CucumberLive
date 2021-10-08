$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/FeatureCollections/Login.feature");
formatter.feature({
  "name": "Login Feature",
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
  "name": "Register a user with valid email address",
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
  "name": "user enters an email address as \"Test1Samy@gmail.com\"",
  "keyword": "And "
});
formatter.match({
  "location": "Login.EnterEmail(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on Create an account button",
  "keyword": "And "
});
formatter.match({
  "location": "Login.ClickOnCreateAnAccountButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user selects title as Mr.",
  "keyword": "And "
});
formatter.match({
  "location": "Login.Title()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters Customer FirstName as \"Amit\"",
  "keyword": "And "
});
formatter.match({
  "location": "Login.EnterFirstName(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters Customer LastName as \"Patil\"",
  "keyword": "And "
});
formatter.match({
  "location": "Login.EnterLastName(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters Password as \"windows@123\"",
  "keyword": "And "
});
formatter.match({
  "location": "Login.EnterPassword(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters Company as \"Yahoo\"",
  "keyword": "And "
});
formatter.match({
  "location": "Login.EnterCompany(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters Address as \"First Lane\"",
  "keyword": "And "
});
formatter.match({
  "location": "Login.EnterAddress(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters City as \"Romulus\"",
  "keyword": "And "
});
formatter.match({
  "location": "Login.EnterCity(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user selects State as \"Alabama\"",
  "keyword": "And "
});
formatter.match({
  "location": "Login.SelectState(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters ZipCode as \"35006\"",
  "keyword": "And "
});
formatter.match({
  "location": "Login.EnterZipCode(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user selects Country as \"United States\"",
  "keyword": "And "
});
formatter.match({
  "location": "Login.SelectCountry(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters Mobile as \"9898989898\"",
  "keyword": "And "
});
formatter.match({
  "location": "Login.EnterMobile(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters AliasAddress as \"Test Address\"",
  "keyword": "And "
});
formatter.match({
  "location": "Login.EnterAliasAddress(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on Register button",
  "keyword": "And "
});
formatter.match({
  "location": "Login.Registerbutton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user lands on the MyAccount page",
  "keyword": "Then "
});
formatter.match({
  "location": "Login.MyAccount()"
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