Feature: Electronics Test
  As a user I want to order a cell phone

@sanity @regression
  Scenario: User Should Navigate To Cell Phones Page Successfully
    Given I am on homepage
    When I Hover mouse`on Electronics Tab
    And I click on Cell phones
    And Verify the text “Cell phones”
@smoke @regression
  Scenario: ThatTheProductAddedSuccessfullyAndPlaceOrderSuccessfully()
    Given I am on homepage
    When I Hover mouse`on Electronics Tab
    And I click on Cell phones
    And I verify the text “Cell phones”
    And I click on List View Tab
    And I click on  Nokia Lumia link
    And I verify the text Nokia Lumia
    And I can verify the price
    And I change the quantity to "2"
    And I click on ADD TO CARD Button
    And I can verify the Message The product has been added to your shopping cart on Top green Bar
    And I click on close the bar clicking on the cross button
    And I hover MouseHover on Shopping cart
    And I click on GO TO CART button.
    And I can see the message Shopping cart
    And I verify the quantity
    And I can verify the total price
    And I click on checkbox I agree with the terms of service
    And I click on CHECKOUT
    And I can verify the Text Welcome, Please Sign In!
    And I click on REGISTER tab
    And I verify the text “Register”
    And I select on gender
    And I enter first name
    And I enter last name
    And I enter day of birth name
    And I enter month of birth name
    And I enter year of birth name
    And I enter email address
    And I enter password
    And I enter confirm password
    And Click on REGISTER Button
    And Verify the message “Your registration completed”
    And Click on CONTINUE tab
    And I can see the message Shopping cart
    And I click on checkbox I agree with the terms of service
    And I click on CHECKOUT
    And I select country
    And I enter city
    And I enter address
    And I enter postcode
    And I enter phone number
    And I click on CONTINUE
    And Click on Radio Button second Day Air
    And I click on CONTINUE delivery
    And I select Radio Button Credit Card
    And I click on continue
    And I select visa card From Select credit card dropdown
    And I enter Cardholder name
    And I enter card number
    And I select expiry month
    And I select expiry year
    And I enter card code
    And I click on CONTINUE card
    And I verify Payment Method is Credit Card
    And Verify Shipping Method is second Day Air
    And I verify total price
    And I click on CONFIRM
    And I verify the Text Thank You
    And I verify the message Your order has been successfully processed!
    And I click on CONTINUE button
    And I verify the text Welcome to our store
    And Click on Logout link
    And Verify the URL is https://demo.nopcommerce.com/
    Then I have order the cell phone successfully