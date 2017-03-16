## Gherkin Java Demo

# Configuring Pulse

Test Case Library Template:

```
Feature: ${ testCase.name }
  ${ testCase.description }

  Scenario: ${ testCase.name }
    Given ${ testCase.preCondition }
    When ${ testCase.steps[0].description }
    Then ${ testCase.steps[0].expectedResult }
```

Generated Src Tempate:

```
package com.pulsedemo.steps;

import org.junit.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

@Given("^${testCase.preCondition}$")
public void ${testCase.preCondition} throws Throwable {
    throw new PendingException();
}

@When("^${testCase.steps[0].description}$")
public void ${testCase.steps[0].description}$ throws Throwable {
    throw new PendingException();
}

@Then ("^${testCase.steps[0].expectedResult}$")
public void ${testCase.steps[0].expectedResult} throws Throwable {
    assertEquals("${testCase.steps[0].expectedResult}", "${actualResult}");
}
```

# Running Tests

1. install gradle
2. `gradle build`
3. `gradle test`
4. (in your favorite browser) open the test results in the build/results directory to see test results
