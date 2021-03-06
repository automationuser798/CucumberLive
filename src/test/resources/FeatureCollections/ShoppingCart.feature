#Author: Amit Patil
#Keywords Summary :
#Feature: List of scenarios for Shopping Cart feature.
#Date Created: 
#ShoppingCart
Feature: Shopping Cart

  Background: user is successfully logged in
    Given user opens the "chrome" browser
    Given user enters the url "http://automationpractice.com/index.php"
    
@Sanity
  Scenario: Verify if user can add Items to the cart
    Given user is on the application login page
    And user clicks on Sign in link
    And an existing user enters an email address as "testuser04@gmail.com"
    And an existing user enters an password as "windows@123"
    And user clicks on SignIn button
    And user clicks on Dresses mega menu
    And user clicks on Summer Dresses mega menu
    And Summer Dresses page opens with text as "SUMMER DRESSES "
    And user clicks on the Printed Summer Dress Item
    And user clicks on the Add to Cart button
    Then A popup message saying "There is 1 item in your cart" is displayed to the user
 
  @Sanity
  Scenario: Verify if user can delete Items from the mini shopping cart
    Given user is on the application login page
    And user clicks on Sign in link
    And an existing user enters an email address as "testuser04@gmail.com"
    And an existing user enters an password as "windows@123"
    And user clicks on SignIn button
    And user clicks on Dresses mega menu
    And user clicks on Summer Dresses mega menu
    And Summer Dresses page opens with text as "SUMMER DRESSES "
    And user clicks on the Printed Summer Dress Item
    And user clicks on the Add to Cart button
    Then A popup message saying "There is 1 item in your cart" is displayed to the user
    And user click on the cancel button on the popup
    And user hover on the mini shopping cart menu
    And user removes the Item from the cart
    Then user clicks on the mini Shopping Cart menu
    Then "Your shopping cart is empty" message is displayed to the user
    
 @Sanity
  Scenario: Verify if delete the Items from the Shopping Cart
    Given user is on the application login page
    And user clicks on Sign in link
    And an existing user enters an email address as "testuser04@gmail.com"
    And an existing user enters an password as "windows@123"
    And user clicks on SignIn button
    And user clicks on Dresses mega menu
    And user clicks on Summer Dresses mega menu
    And Summer Dresses page opens with text as "SUMMER DRESSES "
    And user clicks on the Printed Summer Dress Item
    And user clicks on the Add to Cart button
    Then A popup message saying "There is 1 item in your cart" is displayed to the user
    And user clicks on the Proceed to Checkout button
    And user clicks on the trash icon 
    Then "Your shopping cart is empty" message is displayed to the user