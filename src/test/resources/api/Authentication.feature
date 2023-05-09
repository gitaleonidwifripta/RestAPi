Feature: Authentication

  Scenario: Register using a valid full name, email and password
    Given I register using the correct data
    When I submit a POST request to "/auth/register" with fullname "testing123", email "testing12388@gmail.com" and password "testing123m"
    Then I receive valid HTTP response code register 200
    And register successfully

  Scenario: Login with registered or correct email and password
    Given I have valid credentials
    When I submit a POST request to "/auth/login" with email "gitalee21@gmail.com" and password "gitale88"
    Then I receive valid HTTP response code Login 200


  Scenario: view user information
    Given I set GET endpoints
    When I send GET HTTP request
    Then I receive valid HTTP response code 200 for get user information
    And I receive valid data of the user

