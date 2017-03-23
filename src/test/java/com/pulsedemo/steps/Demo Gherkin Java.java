package com.pulsedemo.steps;

import org.junit.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

@Given("^Must have maven and jvm 1.8 installed.$")
public void Must have maven and jvm 1.8 installed. throws Throwable {
    throw new PendingException();
}

@When("^Execute Gherkin Test Cases$")
public void Execute Gherkin Test Cases$ throws Throwable {
    throw new PendingException();
}

@Then ("^Get Results$")
public void Get Results throws Throwable {
    assertEquals("Get Results", "");
}

