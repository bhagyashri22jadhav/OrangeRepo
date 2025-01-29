package TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features= "src\\test\\java\\AllFeatureFile",
		glue={"StepDefinition","hooks"},
		dryRun=false
		
		
		
		
		)
public class RunnerTest extends AbstractTestNGCucumberTests {

}
