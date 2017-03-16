Feature: Test Gherkin Langauge Support
  Testing the feature Gherkin Language Support for Java

  Scenario: Test Gherkin Langauge Support
    Given Gherkin must be installed.  Gradle must be installed.
    When Run Gherkin Tests
    Then Correct Report is Generated