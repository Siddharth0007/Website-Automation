$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Login.feature");
formatter.feature({
  "line": 1,
  "name": "validate Login Page",
  "description": "",
  "id": "validate-login-page",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 4,
  "name": "To verify Login Page for positive Data",
  "description": "",
  "id": "validate-login-page;to-verify-login-page-for-positive-data",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 6,
  "name": "user starts the browser and enters the url",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "user click on login button",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "user enters the \u003cusername\u003e name And clicks on contuine",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "user enters the \u003cpassword\u003e name And clicks on Login",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "user close the browser",
  "keyword": "Then "
});
formatter.examples({
  "line": 12,
  "name": "",
  "description": "",
  "id": "validate-login-page;to-verify-login-page-for-positive-data;",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 13,
      "id": "validate-login-page;to-verify-login-page-for-positive-data;;1"
    },
    {
      "cells": [
        "automation.t@gmail.com",
        "123456789"
      ],
      "line": 14,
      "id": "validate-login-page;to-verify-login-page-for-positive-data;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 14,
  "name": "To verify Login Page for positive Data",
  "description": "",
  "id": "validate-login-page;to-verify-login-page-for-positive-data;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 6,
  "name": "user starts the browser and enters the url",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "user click on login button",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "user enters the automation.t@gmail.com name And clicks on contuine",
  "matchedColumns": [
    0
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "user enters the 123456789 name And clicks on Login",
  "matchedColumns": [
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "user close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefination.user_starts_the_browser_and_enters_the_url()"
});
formatter.result({
  "duration": 16690259470,
  "status": "passed"
});
formatter.match({
  "location": "stepdefination.user_click_on_login_button()"
});
formatter.result({
  "duration": 3215643219,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "automation.t@gmail.com",
      "offset": 16
    }
  ],
  "location": "stepdefination.user_enters_the_name_and_clicks_on_contuine(String)"
});
formatter.result({
  "duration": 3663723330,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "123456789",
      "offset": 16
    }
  ],
  "location": "stepdefination.user_enters_the_name_and_clicks_on_login(String)"
});
formatter.result({
  "duration": 3235662825,
  "status": "passed"
});
formatter.match({
  "location": "stepdefination.user_close_the_browser()"
});
formatter.result({
  "duration": 287001163,
  "status": "passed"
});
formatter.scenarioOutline({
  "line": 19,
  "name": "To verify Login Page for Negative Data",
  "description": "",
  "id": "validate-login-page;to-verify-login-page-for-negative-data",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 21,
  "name": "user starts the browser and enters the url",
  "keyword": "Given "
});
formatter.step({
  "line": 22,
  "name": "user click on login button",
  "keyword": "Then "
});
formatter.step({
  "line": 23,
  "name": "user enters the \u003cusername\u003e name And clicks on contuine",
  "keyword": "Then "
});
formatter.step({
  "line": 24,
  "name": "user enters the \u003cpassword\u003e name And clicks on Login",
  "keyword": "Then "
});
formatter.step({
  "line": 25,
  "name": "user close the browser",
  "keyword": "Then "
});
formatter.examples({
  "line": 27,
  "name": "",
  "description": "",
  "id": "validate-login-page;to-verify-login-page-for-negative-data;",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 28,
      "id": "validate-login-page;to-verify-login-page-for-negative-data;;1"
    },
    {
      "cells": [
        "automation.t@gmail.com",
        "12345"
      ],
      "line": 29,
      "id": "validate-login-page;to-verify-login-page-for-negative-data;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 29,
  "name": "To verify Login Page for Negative Data",
  "description": "",
  "id": "validate-login-page;to-verify-login-page-for-negative-data;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 21,
  "name": "user starts the browser and enters the url",
  "keyword": "Given "
});
formatter.step({
  "line": 22,
  "name": "user click on login button",
  "keyword": "Then "
});
formatter.step({
  "line": 23,
  "name": "user enters the automation.t@gmail.com name And clicks on contuine",
  "matchedColumns": [
    0
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 24,
  "name": "user enters the 12345 name And clicks on Login",
  "matchedColumns": [
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 25,
  "name": "user close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefination.user_starts_the_browser_and_enters_the_url()"
});
formatter.result({
  "duration": 8556836620,
  "status": "passed"
});
formatter.match({
  "location": "stepdefination.user_click_on_login_button()"
});
formatter.result({
  "duration": 3156400611,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "automation.t@gmail.com",
      "offset": 16
    }
  ],
  "location": "stepdefination.user_enters_the_name_and_clicks_on_contuine(String)"
});
formatter.result({
  "duration": 3735585667,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "12345",
      "offset": 16
    }
  ],
  "location": "stepdefination.user_enters_the_name_and_clicks_on_login(String)"
});
formatter.result({
  "duration": 3251052960,
  "status": "passed"
});
formatter.match({
  "location": "stepdefination.user_close_the_browser()"
});
formatter.result({
  "duration": 133428030,
  "status": "passed"
});
});