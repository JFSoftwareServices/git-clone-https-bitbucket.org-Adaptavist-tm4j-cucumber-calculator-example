package com.adaptavist.tm4j.examples.cucumber.calculator;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {
    private Calculator c;

    @Given("^a calculator I just turned on$")
    public void aCalculatorIJustTurnedOn() {
        c = new Calculator();
    }

    @When("^I input the number (\\d+)$")
    public void iInputTheNumber(long numberInput) {
        c.input(numberInput);
    }

    @And("^I press the multiplication button$")
    public void iPressTheMultiplicationButton() {
		c.multiply();
    }

    @Then("^I should see the result (\\d+) on the calculator display$")
    public void iShouldSeeTheResultOnTheCalculatorDisplay(long expectedResult) {
        assertEquals(expectedResult, c.getDisplayResult());
    }
}
