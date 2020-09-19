@coupon
Feature: validate Checkout Page with adding coupon


  Scenario: To verify Checkout Page with adding coupon

    Given user starts the browser and enters the url
    Then user click on login button
    Then user enters the "valid_email" name And clicks on contuine
    Then user enters the "valid_password" name And clicks on Login
    Then User Opens a product
    Then user select the size
    Then user click on Add to bag button
    Then user click on cart button
    Then user click on have a coupon 
    Then user entering the "coupon"
    Then user click on select delivery address
    Then user click on address
    Then user click on COD option
    Then user click on Pay with cash button
    Then user close the browser
    
    
    