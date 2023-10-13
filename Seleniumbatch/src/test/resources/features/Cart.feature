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


  @InvalidLogin @Login
  Scenario Outline: Login with invalid credentials
    When User clicks add to cart for "products"
    Then User should be add to "cart"

    Examples:
      |username        |password    |errorMessage                          |
      |locked_out_user |secret_sauce| Sorry, this user has been locked out.|
      |Invalid_user    |secret_sauce|Username and password do not match any user in this service|
