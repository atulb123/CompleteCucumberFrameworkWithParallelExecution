package com.test.acceptancetest;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

import java.io.File;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/feature"
        ,glue={"com.test"},tags= {"@Regression"},
        plugin = { "pretty", "html:target/cucumber-reports" }
)
public class TestRunner {
}
