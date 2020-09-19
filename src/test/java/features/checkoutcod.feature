@COD
Feature: validate Checkout Page with COD Option


  Scenario: To verify Checkout Page with COD Option

    Given user starts the browser and enters the url
    Then user click on login button
    Then user enters the "valid_email" name And clicks on contuine
    Then user enters the "valid_password" name And clicks on Login
    Then User Opens a product
    Then user select the size
    Then user click on Add to bag button
    Then user click on cart button
    Then user click on select delivery address
    Then user click on address
    Then user click on COD option
    Then user click on Pay with cash button
    Then user close the browser
    
 
 
    
    
   
     
      
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