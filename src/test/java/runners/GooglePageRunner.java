package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
	features = "src//test//resources//features//GooglePageTest.feature",
	glue= {"stepDefs"},
	monochrome=true,
	dryRun=false,
	plugin= {"pretty",
			"html:target//reports//htmlreport.html"}
//			"json:target//reports//Jsonreport.json",
//			"usage:target//reports//usagereport.json",
//			"rerun:target//reports//rerun.txt"}
//	tags = "@SmokeTest and @RegressionTest"
//	tags = "@One and @SmokeTest or @Two and @SmokeTest and @RegressionTest"
)
public class GooglePageRunner extends AbstractTestNGCucumberTests{
	
}
