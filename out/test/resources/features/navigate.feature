Feature: Home Page
@navigate
  Scenario: Check Home Page is displayed
    Given User launches Chrome Browser
    When User open PhoneBook HomePage
    Then User verifies Home component is displayed
    And User quites browser