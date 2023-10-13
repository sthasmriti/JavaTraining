@cart
Feature: All test cases for positive & negative scenarios

  Background:
    Given User is in "Suacedemo" homepage "https://www.saucedemo.com/"

  @addToCart
  Scenario: Login with positive/correct credentials
    When User enters correct username "standard_user"
    And User enters correct password "secret_sauce"
    Then User should be able to login
    When User clicks add to cart for "tshirt"
    Then "t-shirt" should be added to cart
