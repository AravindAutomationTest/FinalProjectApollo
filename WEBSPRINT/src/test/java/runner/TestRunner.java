package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\MGOSETTY\\eclipse-workspace\\WEBSPRINT\\src\\test\\resources\\Apollo_Features\\header.feature",
				 glue = {"Test_Definitions"},
				 dryRun = false,
				 plugin = {"pretty","html:target/HtmlReports/report.html","json:target/JSONReports/report.json","junit:target/JunitReports/report.xml"},

				 monochrome = true)
public class TestRunner
{
	
}
