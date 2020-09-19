@Login
Feature: validate Login Page


   Scenario: To verify Login Page for positive Data Email
    Given user starts the browser and enters the url
    Then user click on login button
    Then user enters the "valid_email" name And clicks on contuine
    Then user enters the "valid_password" name And clicks on Login
    Then user close the browser
 
   Scenario: To verify Login Page for positive Data Mobile number
    Given user starts the browser and enters the url
    Then user click on login button
    Then user enters the "valid_phone" name And clicks on contuine
    Then user enters the "valid_password" name And clicks on Login
    Then user close the browser
 
   Scenario: To verify Login Page with empty data 
    Given user starts the browser and enters the url
    Then user click on login button
    Then user clicks on contuine
    Then user close the browser   
  
   Scenario: To verify Login Page with incorrect emailid
    Given user starts the browser and enters the url
    Then user click on login button
    Then user enters the "Invaild_email"
    Then user clicks on contuine   
    Then user close the browser
     
    Scenario: To verify Login Page for incorrect password   
     Given user starts the browser and enters the url
     Then user click on login button
     Then user enters the "valid_email" name And clicks on contuine
     Then user enters the "invalid_password" name And clicks on Login
     Then user verify the error message
     Then user close the browser
     
     
     
    
    #Scenario: To verify Login Page with incorrect emailid
    #Given user starts the browser and enters the url
    #Then user click on login button
    #Then user enters the "Invaild_login_email"
    #Then user clicks on contuine   
    #Then user close the browser
    #
    #Scenario: To verify Login Page with incorrect emailid
    #Given user starts the browser and enters the url
    #Then user click on login button
    #Then user enters the "Invaild_login_phone"
    #Then user clicks on contuine   
    #Then user close the browser
   
   
     
      
        #Scenario Outline: To verify Login Page for Negative Data
      #
      #Given user starts the browser and enters the url
      #Then user click on login button
      #Then user enters the <username> name And clicks on contuine
      #Then user enters the <password> name And clicks on Login
      #Then user verify the error message
      #Then user close the browser
      #
    #Examples:
        #|username|password|
        #|automation.t@gmail.com|12345|