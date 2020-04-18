package com.adaptavist.tm4j.examples.cucumber.calculator;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        strict = true,
        plugin = {"pretty", "html:target/cucumber", "junit:target/cucumber.xml", "json:target/cucumber/calculator.json"},
//        features = "classpath:features",
        features = "src/test/resources/features",
        glue = {"com/adaptavist/tm4j/examples/cucumber/calculator"}
)
public class TestRunner {

}
