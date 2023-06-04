Feature: AddContact

  @validDateContact
  Scenario:
    Given User is logged
    When User open PhoneBook AddPage
    And User clicks on Add link
    And User enters valid data
    And User clicks on Add Button
    Then User Verifies Contacts is displayed in the ContactsPage
