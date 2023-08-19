package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)

@CucumberOptions(
        features ="./src/test/resources/firstfeaturefile.feature",
        glue ="stepdefinitions",
        tags ="@google_search",
        dryRun = false
)

public class Runner {
}
