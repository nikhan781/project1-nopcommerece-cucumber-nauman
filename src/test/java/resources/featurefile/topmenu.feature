Feature: TopMenu
  As user I want to click select top menu options

  @sanity @regression
  Scenario: User Should navigate to selected page
    Given I am on homepage
    When I select an top menu option
    And I click on submenu option
    Then I should see selected page name


