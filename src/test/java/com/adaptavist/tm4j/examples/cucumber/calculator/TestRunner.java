package com.adaptavist.tm4j.examples.cucumber.calculator;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/calculatorFeatures"
        ,glue={"com/adaptavist/tm4j/examples/cucumber/calculator"}
        ,plugin = {"json:target/cucumber/calculator.json"}
)
public class TestRunner {

}
