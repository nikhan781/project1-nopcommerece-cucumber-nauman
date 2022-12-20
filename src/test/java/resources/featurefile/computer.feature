Feature: Computer Test
  As a user I should be able to order a computer

  @sanity @regression
  Scenario: Product should be arranged in Alphabetical order
    Given I am on homepage
    When I select an top menu option
    And I click on submenu option
    And I select sort by position Name Z to A
    Then I should see products in descending order

  @smoke @regression
  Scenario: Product added to shopping cart successFully
    Given I am on homepage
    When I select an top menu option
    And I click on submenu option
    And I select sort by position Name A to Z
    And I click on the Add to Cart on selected product
    And I click on GHz Intel Pentium Dual-Core using Select class
    And I click  RAM
    And I click on HDD radio"
    And I click OS radio Vista Premium
    And I click on Microsoft Office
    And I click on Total Commander
    And I can verify the price as
    And I click on ADD TO CARD Button
    And I can verify the Message The product has been added to your shopping cart on Top green Bar
    And I click on close the bar clicking on the cross button
    And I hover MouseHover on Shopping cart
    And I click on GO TO CART button.
    And I can see the message Shopping cart
    And I change the Qty to "2"
    And I click on Update shopping cart
    And I can verify the Total price
    And I click on checkbox I agree with the terms of service
    And I click on CHECKOUT
    And I can verify the Text Welcome, Please Sign In!
    And I can click on CHECKOUT AS GUEST Tab
    And I enter First name
    And I enter Last name
    And I enter email
    And I select country
    And I enter city
    And I enter address
    And I enter postcode
    And I enter phone number
    And I click on CONTINUE
    And I click on Radio Button Next Day Air
    And I click on CONTINUE delivery
    And I select Radio Button Credit Card
    And I click on continue
    And I select Master card From Select credit card dropdown
    And I enter Cardholder name
    And I enter card number
    And I select expiry month
    And I select expiry year
    And I enter card code
    And I click on CONTINUE card
    And I verify Payment Method is Credit Card
    And I verify Shipping Method is Next Day Air
    And I verify Total price
    And I click on CONFIRM
    And I verify the Text Thank You
    And I verify the message Your order has been successfully processed!
    And I click on CONTINUE button
    And I verify the text Welcome to our store
    Then I have order th desktop successfully
