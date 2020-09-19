rm -rf allure-results

mvn clean test 

allure serve allure-results