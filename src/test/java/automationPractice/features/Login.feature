@regression
Feature: User login on Automation practice website
  As a user
  I want to see the login page
  So that I can login successfully
  Background:
    Given User is on the home page

  @smoke @validLogin
  Scenario: User can able to login successfully with valid credentials
    When User selects SignIn link
    Then User should be on the login page
    When User enter email as "qamasters@mailinator.com" and password as "Password1"
    And User selects SignIn
    Then User should be login successfully
    And User should see his name as "QA Masters"

  @feedbackMessage @smoke
  Scenario Outline: User should see feedback message, when he provides invalid credentials
    When User selects SignIn link
    Then User should be on the login page
    When User enter email as "<Username>" and password as "<Password>"
    And User selects SignIn
#    Then User should see feedback message as "<Message>"
    Examples:
      | Username              | Password | Message                    |
      | invalid               | dfgfdg   | Invalid email address.     |
      | sdfdsf@dfsdfds.dsfdsf | sdfdsf   | Authentication failed.     |
      |                       |          | An email address required. |




