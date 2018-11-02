$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("D:/MyStudy/JITAutomationBdd/src/test/java/com/qa/features/JustRechargeIt.feature");
formatter.feature({
  "line": 1,
  "name": "Just Recharge It feature",
  "description": "",
  "id": "just-recharge-it-feature",
  "keyword": "Feature"
});
formatter.before({
  "duration": 35862483356,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "Sign in to Just recharge it",
  "description": "",
  "id": "just-recharge-it-feature;sign-in-to-just-recharge-it",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "User is on start page of JIT website",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "User clicks on Sign in link",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "User enters username and password to Sign in",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "User clicks on Secure Sign In button",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "User open my accounts page",
  "keyword": "Then "
});
formatter.match({
  "location": "SignInStepDefinition.user_On_start_page()"
});
formatter.result({
  "duration": 756253132,
  "status": "passed"
});
formatter.match({
  "location": "SignInStepDefinition.user_clicks_on_Sign_in_link()"
});
formatter.result({
  "duration": 2371973971,
  "status": "passed"
});
formatter.match({
  "location": "SignInStepDefinition.user_enters_username_and_password_to_Sign_in()"
});
formatter.result({
  "duration": 707842738,
  "status": "passed"
});
formatter.match({
  "location": "SignInStepDefinition.user_clicks_on_Secure_Sign_In_button()"
});
formatter.result({
  "duration": 2583189254,
  "status": "passed"
});
formatter.match({
  "location": "SignInStepDefinition.user_open_my_accounts_page()"
});
formatter.result({
  "duration": 170160664,
  "status": "passed"
});
formatter.after({
  "duration": 276185,
  "status": "passed"
});
formatter.after({
  "duration": 1077812965,
  "status": "passed"
});
});