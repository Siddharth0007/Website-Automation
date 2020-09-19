@nonpromotionalwallet
Feature: validate Checkout Page with non promotional wallet


  Scenario: To verify Checkout Page with non promotional wallet

    Given user starts the browser and enters the url
    Then user click on login button
    Then user enters the "valid_email1" name And clicks on contuine
    Then user enters the "valid_password" name And clicks on Login
    Then User Opens a product
    Then user select the size
    Then user click on Add to bag button
    Then user click on cart button
    Then user click on select delivery address1
    Then user click on address1
    Then user click on confirm button
    Then user close the browser