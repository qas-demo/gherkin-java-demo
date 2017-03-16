package com.pulsedemo.steps;

import org.junit.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

@Given("^Gherkin must be installed.  Gradle must be installed.$")
public void Gherkin must be installed.  Gradle must be installed. throws Throwable {
    throw new PendingException();
}

@When("^Run Gherkin Tests$")
public void Run Gherkin Tests$ throws Throwable {
    throw new PendingException();
}

@Then ("^Correct Report is Generated$")
public void Correct Report is Generated throws Throwable {
    assertEquals("Correct Report is Generated", "");
}

