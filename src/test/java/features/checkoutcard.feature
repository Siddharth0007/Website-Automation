@Card
Feature: validate Checkout Page with debit card


  Scenario: To verify Checkout Page with debit card

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
    Then user click on credit and debit
    Then user click on card
    Then user had to enter the "cvv"
    Then user click on paynow button
    Then user submit the "otp"
    Then user click on cardsubmit button
    Then user close the browser