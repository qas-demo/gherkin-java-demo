package com.pulsedemo.steps;

import org.junit.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

@Given("^Maven project is initialized with the correct libraries$")
public void Maven project is initialized with the correct libraries throws Throwable {
    throw new PendingException();
}

@When("^I run a Cucumber Test Case$")
public void I run a Cucumber Test Case$ throws Throwable {
    throw new PendingException();
}

@Then ("^Test Case Executes Correctly$")
public void Test Case Executes Correctly throws Throwable {
    assertEquals("Test Case Executes Correctly", "");
}

