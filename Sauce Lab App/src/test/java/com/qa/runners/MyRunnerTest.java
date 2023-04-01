package com.qa.runners;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

import static io.cucumber.junit.CucumberOptions.SnippetType.CAMELCASE;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources"},
        glue = {"com.qa.stepdef"},
        plugin = {"pretty", "html:target/cucumber-reports","summary"},
        snippets=CAMELCASE,
        dryRun = false,
        monochrome = true

        //tags = "@smoke"
)

public class MyRunnerTest {


}
