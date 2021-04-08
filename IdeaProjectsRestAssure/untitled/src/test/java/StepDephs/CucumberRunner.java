package StepDephs;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.*;


import org.junit.runner.RunWith;

@RunWith(Cucumber.class)

@CucumberOptions(
        features = {"src/test/resources/Features"},
        glue = {"StepDephs"},
        format = { "pretty", "html:target/site/cucumber-pretty", "json:src/test/resources/json/cucumber.json" },
        tags={"@Smoke"})
public class CucumberRunner {
}
