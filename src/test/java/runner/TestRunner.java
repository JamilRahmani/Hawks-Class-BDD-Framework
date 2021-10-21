package runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		// features tells cucumber where all feature files are located.
		// glue will tells cucumber where all stepDefinitions files are located.
		// With glue, we run one senario or multiple senariosnor entire features.
		// dryRun checks if there are any missing steps in StepDefifnition class for
		// each senario steps in feature file.
		// will makes console readable.
		// will mark senario failed if there are any pending steps.
		// plugin will be used for generating a readable report.
		features = "classpath:features", 
		glue = "stepDefinitions", 
		tags = "@SmokeTest", 
		dryRun = false, 
		monochrome = true, 
		strict = true, 
		plugin = {"pretty"}
		)
public class TestRunner {
	

}
