Feature: Testing Gherkin Java
  This is intended to test that Gherkin Java is correctly installed.

  Scenario: Testing Gherkin Java
    Given Maven project is initialized with the correct libraries
    When I run a Cucumber Test Case
    Then Test Case Executes Correctly