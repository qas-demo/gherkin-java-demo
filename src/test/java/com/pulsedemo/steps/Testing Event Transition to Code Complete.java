package com.pulsedemo.steps;

import org.junit.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

@Given("^$")
public void  throws Throwable {
    throw new PendingException();
}

@When("^Move issue to code complete$")
public void Move issue to code complete$ throws Throwable {
    throw new PendingException();
}

@Then ("^Work item moves to Execute$")
public void Work item moves to Execute throws Throwable {
    assertEquals("Work item moves to Execute", "");
}

