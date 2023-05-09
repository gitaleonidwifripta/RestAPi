Feature: category
  Scenario: GET  list of category
    Given I set the GET api endpoints
    When I send HTTP api GET request
    Then I receive valid HTTP response code 200 for GET All product category
    And I received valid data for all product category

  Scenario: POST As an admin I have be able to create new product category
    Given I set the POST api endpoints in category
    When I send HTTP api POST request
    Then I receive valid HTTP response code 200 in product category
    And I receive valid data for new product category

  Scenario: GET id product category
    Given I set the GET api endpoints by id
    When I send HTTP api GET request by id
    Then I receive valid HTTP response code 200 for GET id product category
    And I received valid data for id product category

  Scenario: DELETE category
    Given I set the DELETE api endpoints
    When I send HTTP api DELETE request for category
    Then I receive valid HTTP response code 200 for category DELETE