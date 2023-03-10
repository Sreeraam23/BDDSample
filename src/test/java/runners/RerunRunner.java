package runners;

import org.testng.annotations.Test;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
@CucumberOptions(
		features = "@target//reports//rerun.txt",
		glue= {"stepDefs"},
		monochrome=true,
		dryRun=false,
		plugin= {"pretty"}
		)
public class RerunRunner extends AbstractTestNGCucumberTests {
  
}
