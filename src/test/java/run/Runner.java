package run;


import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.reporter.JvmReport;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\Acviss\\eclipse-workspace\\Acviss\\Feature\\Dashboard.feature",
glue ={"org.StepDefinition","Hooks"}, monochrome = true, dryRun = false,strict = true,
plugin = {"pretty", "json:C:\\Users\\Acviss\\eclipse-workspace\\Acviss\\target\\\\Report\\newreport.json"})

public class Runner {
	@AfterClass
	public static void report() {
		JvmReport.generateJvmReport("C:\\Users\\Acviss\\eclipse-workspace\\Acviss\\target\\Report\\newreport.json");
	}

}