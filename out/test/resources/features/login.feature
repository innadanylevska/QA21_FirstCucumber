Feature: login

  @validDate
  Scenario: login with valid data
    Given User launches Chrome Browser
    When User open PhoneBook HomePage
    And User clicks on Login link
    And User enters valid data
    And User clicks on Loggin Button
    Then User Verifies SignOut buttom is disolayed
    And User quites browser

  @wrongPassword
  Scenario Outline: login with wrong password
    Given User launches Chrome Browser
    When User open PhoneBook HomePage
    And User clicks on Login link
    And User enters valid a valid email and wrong password
      | email   | password   |
      | <email> | <password> |
    And User clicks on Loggin Button
    Then User Verifies Alert is appears
    And User quites browser
    Examples:
      | email              | password |
      | innassik@gmail.com | 12345678 |
      | innassik@gmail.com | 123456dh |
      | innassik@gmail.com | 12344$^% |
