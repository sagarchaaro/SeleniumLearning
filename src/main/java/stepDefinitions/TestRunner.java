package stepDefinitions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\AutomationCatalogue\\Eclipse\\EclipseWorkspace_1\\SeleniumLearning\\features\\Login.feature",
		glue = {"C:\\AutomationCatalogue\\Eclipse\\EclipseWorkspace_1\\SeleniumLearning\\src\\main\\java\\stepDefinitions\\GmailStepDefinition"},
		tags = "@gmailLogin",
		dryRun = false,
		monochrome = true,
		plugin={"pretty","html:test-outputs","json:target/json-report","junit:target/cucumber-xml"}
)
		
public class TestRunner {

	
}