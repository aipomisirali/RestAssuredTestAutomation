package StepDephs;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.*;


import org.junit.runner.RunWith;

@RunWith(Cucumber.class)

@CucumberOptions(
        features = {"src/test/resources/Features"},
        tags={"@Smoke"})
public class CucumberRunner {
}
