package Runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/Features/login.feature",
		glue = {"StepDefinitions"},
		monochrome=true,
		//plugin={"pretty", "html:target/cucumberReport/cucumber-html-report","json:target/cucumberReport/cucumber-report.json"},
		plugin = {"json:target/cucumber.json"},
		tags= "@login or @Regression"
		)

public class TestloginRunner {

}

