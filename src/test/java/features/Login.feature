Feature: validate Login Page


  Scenario Outline: To verify Login Page for positive Data

    Given user starts the browser and enters the url
    Then user enters the <username> name And clicks on contuine
    Then user enters the <password> name And clicks on Login
   

    Examples:
      |username|password|
      |siddharth.s@bewakoof.com|123456789|
      
      
      
      
   Scenario Outline: To verify Login Page for Negative Data
      
      Given user starts the browser and enters the url
      Then user enters the <username> name And clicks on contuine
      Then user enters the <password> name And clicks on Login
      
    Examples:
        |username|password|
        |siddharth.s@bewakoof.com|12345|