$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Login.feature");
formatter.feature({
  "line": 2,
  "name": "User Login",
  "description": "I want to check that the user can login",
  "id": "user-login",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 5,
  "name": "User Login",
  "description": "",
  "id": "user-login;user-login",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 6,
  "name": "the user in the home page",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I click on authentication form",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "I entered \"\u003cusername\u003e\" , \"\u003cpassword\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "The secure page displayed successfully",
  "keyword": "Then "
});
formatter.examples({
  "line": 11,
  "name": "",
  "description": "",
  "id": "user-login;user-login;",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 12,
      "id": "user-login;user-login;;1"
    },
    {
      "cells": [
        "tomsmith",
        "SuperSecretPassword!"
      ],
      "line": 13,
      "id": "user-login;user-login;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 13,
  "name": "User Login",
  "description": "",
  "id": "user-login;user-login;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 6,
  "name": "the user in the home page",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I click on authentication form",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "I entered \"tomsmith\" , \"SuperSecretPassword!\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "The secure page displayed successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.the_user_in_the_home_page()"
});
formatter.result({
  "duration": 11169271000,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.i_click_on_authentication_form()"
});
formatter.result({
  "duration": 1089370900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "tomsmith",
      "offset": 11
    },
    {
      "val": "SuperSecretPassword!",
      "offset": 24
    }
  ],
  "location": "LoginSteps.i_entered(String,String)"
});
formatter.result({
  "duration": 360734000,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.the_secure_page_displayed_successfully()"
});
formatter.result({
  "duration": 877981200,
  "status": "passed"
});
});