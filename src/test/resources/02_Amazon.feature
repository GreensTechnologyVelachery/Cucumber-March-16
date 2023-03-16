
@Feature2
Feature: To validate the signin functionality of amazon application

	@Sanity @Scenario3 @Scenario4
  Scenario: To validate signin with invalid username and invalid password
    When User has to launch the amazon url
    
    # One Dimentional Map
    When User has to pass the invalid username in email field
      | emailone   | java@gmail.com |
      | emailtwo   | sql@gmail.com  |
      | emailthree | py@gmail.com   |
      
    When User has to click the continue button
    
    # Two Dimentional Map
    And User has to pass the invalid password in password field
      | passwordone  | passwordtwo | passwordthree |
      |      7654345 |     2345432 | Python@123    |
      | cucumber@123 | testng@123  |        763456 |
      
    And User has to click the signin button
