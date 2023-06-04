Feature: ContactPage
  @navigate
  Scenario: Check Contacts Page is displayed
    Given User is logged
    When User open PhoneBook ContactsPage
    Then User verifies Contacts component is displayed
    And User quites browser