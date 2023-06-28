package com.cydeo.runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = "html:target/cucumber-reports.html",
        features = "src/test/resources/features",
        glue = "com/cydeo/step_definitions",
        dryRun = false,  // when you turn it on, you will be able to only get your snippets without running the entire code
        tags = "@scenarioOutline",
        publish = true // generating a report with public link

)
public class CukesRunner { }
