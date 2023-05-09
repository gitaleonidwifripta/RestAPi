Feature: order
  Scenario: GET All Order
    Given I set the GET api endpoint for order
    When I send HTTP api GET request for order
    Then I receive valid HTTP response code 200 for get all data order
    And I received valid data for all order

  Scenario: POST As admin I have be able to create new order
    Given I set the POST api endpoints in order
    When I send HTTP api POST request for order
    Then I receive a valid HTTP response code 200 on the order POST
    And I receive valid data for create new order

  Scenario: GET As an admin I have be able to get id order
    Given I set the GET api endpoint for order by id
    When I send HTTP api GET request for order by id
    Then I receive valid HTTP response code 200 for get id data order
    And I receive valid data for id order
