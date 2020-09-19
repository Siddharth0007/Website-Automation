$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Login.feature");
formatter.feature({
  "line": 2,
  "name": "validate Login Page",
  "description": "",
  "id": "validate-login-page",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Login"
    }
  ]
});
formatter.scenario({
  "line": 5,
  "name": "To verify Login Page for positive Data Email",
  "description": "",
  "id": "validate-login-page;to-verify-login-page-for-positive-data-email",
  "type": "scenario",
  "keyword": "Scenario"
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
  "name": "user enters the \"valid_email\" name And clicks on contuine",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "user enters the \"valid_password\" name And clicks on Login",
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
  "duration": 12077482111,
  "status": "passed"
});
formatter.match({
  "location": "stepdefination.user_click_on_login_button()"
});
formatter.result({
  "duration": 4119462646,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "valid_email",
      "offset": 17
    }
  ],
  "location": "stepdefination.user_enters_the_name_and_clicks_on_contuine(String)"
});
formatter.result({
  "duration": 6067255485,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "valid_password",
      "offset": 17
    }
  ],
  "location": "stepdefination.user_enters_the_name_and_clicks_on_login(String)"
});
formatter.result({
  "duration": 3407186317,
  "status": "passed"
});
formatter.match({
  "location": "stepdefination.user_close_the_browser()"
});
formatter.result({
  "duration": 246639276,
  "status": "passed"
});
formatter.scenario({
  "line": 12,
  "name": "To verify Login Page for positive Data Mobile number",
  "description": "",
  "id": "validate-login-page;to-verify-login-page-for-positive-data-mobile-number",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 13,
  "name": "user starts the browser and enters the url",
  "keyword": "Given "
});
formatter.step({
  "line": 14,
  "name": "user click on login button",
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "user enters the \"valid_phone\" name And clicks on contuine",
  "keyword": "Then "
});
formatter.step({
  "line": 16,
  "name": "user enters the \"valid_password\" name And clicks on Login",
  "keyword": "Then "
});
formatter.step({
  "line": 17,
  "name": "user close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefination.user_starts_the_browser_and_enters_the_url()"
});
formatter.result({
  "duration": 5958936328,
  "status": "passed"
});
formatter.match({
  "location": "stepdefination.user_click_on_login_button()"
});
formatter.result({
  "duration": 3920704175,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "valid_phone",
      "offset": 17
    }
  ],
  "location": "stepdefination.user_enters_the_name_and_clicks_on_contuine(String)"
});
formatter.result({
  "duration": 3514614067,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "valid_password",
      "offset": 17
    }
  ],
  "location": "stepdefination.user_enters_the_name_and_clicks_on_login(String)"
});
formatter.result({
  "duration": 3362722324,
  "status": "passed"
});
formatter.match({
  "location": "stepdefination.user_close_the_browser()"
});
formatter.result({
  "duration": 231362171,
  "status": "passed"
});
formatter.scenario({
  "line": 19,
  "name": "To verify Login Page with empty data",
  "description": "",
  "id": "validate-login-page;to-verify-login-page-with-empty-data",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 20,
  "name": "user starts the browser and enters the url",
  "keyword": "Given "
});
formatter.step({
  "line": 21,
  "name": "user click on login button",
  "keyword": "Then "
});
formatter.step({
  "line": 22,
  "name": "user clicks on contuine",
  "keyword": "Then "
});
formatter.step({
  "line": 23,
  "name": "user close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefination.user_starts_the_browser_and_enters_the_url()"
});
formatter.result({
  "duration": 4994548686,
  "status": "passed"
});
formatter.match({
  "location": "stepdefination.user_click_on_login_button()"
});
formatter.result({
  "duration": 3962239025,
  "status": "passed"
});
formatter.match({
  "location": "stepdefination.user_clicks_on_contuine()"
});
formatter.result({
  "duration": 4201292281,
  "status": "passed"
});
formatter.match({
  "location": "stepdefination.user_close_the_browser()"
});
formatter.result({
  "duration": 222813821,
  "status": "passed"
});
formatter.scenario({
  "line": 25,
  "name": "To verify Login Page with incorrect emailid",
  "description": "",
  "id": "validate-login-page;to-verify-login-page-with-incorrect-emailid",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 26,
  "name": "user starts the browser and enters the url",
  "keyword": "Given "
});
formatter.step({
  "line": 27,
  "name": "user click on login button",
  "keyword": "Then "
});
formatter.step({
  "line": 28,
  "name": "user enters the \"Invaild_email\"",
  "keyword": "Then "
});
formatter.step({
  "line": 29,
  "name": "user clicks on contuine",
  "keyword": "Then "
});
formatter.step({
  "line": 30,
  "name": "user close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefination.user_starts_the_browser_and_enters_the_url()"
});
formatter.result({
  "duration": 5618917581,
  "status": "passed"
});
formatter.match({
  "location": "stepdefination.user_click_on_login_button()"
});
formatter.result({
  "duration": 4243688322,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Invaild_email",
      "offset": 17
    }
  ],
  "location": "stepdefination.user_enters_the_something(String)"
});
formatter.result({
  "duration": 339946059,
  "status": "passed"
});
formatter.match({
  "location": "stepdefination.user_clicks_on_contuine()"
});
formatter.result({
  "duration": 4223295999,
  "status": "passed"
});
formatter.match({
  "location": "stepdefination.user_close_the_browser()"
});
formatter.result({
  "duration": 197107312,
  "status": "passed"
});
formatter.scenario({
  "line": 32,
  "name": "To verify Login Page for incorrect password",
  "description": "",
  "id": "validate-login-page;to-verify-login-page-for-incorrect-password",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 33,
  "name": "user starts the browser and enters the url",
  "keyword": "Given "
});
formatter.step({
  "line": 34,
  "name": "user click on login button",
  "keyword": "Then "
});
formatter.step({
  "line": 35,
  "name": "user enters the \"valid_email\" name And clicks on contuine",
  "keyword": "Then "
});
formatter.step({
  "line": 36,
  "name": "user enters the \"invalid_password\" name And clicks on Login",
  "keyword": "Then "
});
formatter.step({
  "line": 37,
  "name": "user verify the error message",
  "keyword": "Then "
});
formatter.step({
  "line": 38,
  "name": "user close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefination.user_starts_the_browser_and_enters_the_url()"
});
formatter.result({
  "duration": 5183666407,
  "status": "passed"
});
formatter.match({
  "location": "stepdefination.user_click_on_login_button()"
});
formatter.result({
  "duration": 3942826440,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "valid_email",
      "offset": 17
    }
  ],
  "location": "stepdefination.user_enters_the_name_and_clicks_on_contuine(String)"
});
formatter.result({
  "duration": 3525166903,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "invalid_password",
      "offset": 17
    }
  ],
  "location": "stepdefination.user_enters_the_name_and_clicks_on_login(String)"
});
formatter.result({
  "duration": 3361739062,
  "status": "passed"
});
formatter.match({
  "location": "stepdefination.user_verify_the_error_message()"
});
formatter.result({
  "duration": 108934589,
  "status": "passed"
});
formatter.match({
  "location": "stepdefination.user_close_the_browser()"
});
formatter.result({
  "duration": 248730838,
  "status": "passed"
});
});