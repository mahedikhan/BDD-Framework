package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "C:\\Users\\Mahtab\\eclipse-workspace\\auto\\src\\main\\java\\auto\\com\\feature\\auto.feature",// path of the feature files
		glue = {"auto.com.stepDef"}, //path of the step definition files
		format= {"pretty","html:Test-output"}, //is used generate different types of report
		monochrome = true, //display the console output in a readable format
		strict = true, // will if any step is not defined in step definition file
		dryRun= false // to check the mapping is proper between feature file and step def file
		
		)

public class RunnerClass {

}


