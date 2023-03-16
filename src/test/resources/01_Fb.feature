
@Feature1
Feature: To validate the login functionality of fb application

 	@Smoke @Scenario1
  Scenario: To validate login with invalid username and invalid password
    When To launch the url of the facebook application
    When To pass the invalid username in email field
    And To pass the ivalid password in password field
    And To click the login button

 	@Regression @Scenario2
  Scenario Outline: To validate login with positive and negative combination
    When To launch the application url
    And To pass the positive or negative data "<username>" to email field
    And To pass the positive or "<password>" negative data to password field
    And To click the login

    Examples: 
      | username           | password |
      | java@gmail.com     | java@123 |
      | selenium@gmail.com | sel@123  |
      | python@gmail.com   | py@123   |
      | sql@gmail.com      | sql@123  |
