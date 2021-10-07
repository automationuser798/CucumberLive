$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/FeatureCollections/Login.feature");
formatter.feature({
  "name": "Login Feature",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@Login"
    }
  ]
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
  "name": "Register a user with Valid email address",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Login"
    },
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
  "name": "user enters an email address as \"TestKSamy@gmail.com\"",
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
  "location": "Login.clickOnCreateAnAccountButton()"
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
  "name": "user enters Address as \"First Lane Narhe\"",
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
  "location": "Login.Enter_City(String)"
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
  "location": "Login.Enter_ZipCode(String)"
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
  "location": "Login.Enter_Mobile(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters AliasAddress as \"Test Address\"",
  "keyword": "And "
});
formatter.match({
  "location": "Login.Enter_Alias_Address(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on Register button",
  "keyword": "And "
});
formatter.match({
  "location": "Login.Register_button()"
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