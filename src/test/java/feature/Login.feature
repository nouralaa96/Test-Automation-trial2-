
Feature: User Login
  I want to check that the user can login

  Scenario Outline: User Login
    Given the user in the home page
    When I click on authentication form
    And I entered "<username>" , "<password>"
    Then The secure page displayed successfully

    Examples:
      | username | password |
      | tomsmith | SuperSecretPassword! |
