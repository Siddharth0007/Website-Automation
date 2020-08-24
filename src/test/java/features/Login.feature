Feature: validate Login Page


  Scenario Outline: To verify Login Page for positive Data

    Given user starts the browser and enters the url
    Then user click on login button
    Then user enters the <username> name And clicks on contuine
    Then user enters the <password> name And clicks on Login
    Then user close the browser

    Examples:
      |username|password|
     |automation.t@gmail.com|123456789|
      
      
      
      
   Scenario Outline: To verify Login Page for Negative Data
      
      Given user starts the browser and enters the url
      Then user click on login button
      Then user enters the <username> name And clicks on contuine
      Then user enters the <password> name And clicks on Login
      Then user close the browser
      
    Examples:
        |username|password|
        |automation.t@gmail.com|12345|