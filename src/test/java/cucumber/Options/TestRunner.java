package cucumber.Options;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;

import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(
		
		features = "src/test/java/features",
		// plugin = {"pretty", "html:target/cucumber", "json:target/cucumber.json"},
//plugin = "pretty",
		plugin = {"pretty","json:target/jsonReports/cucumber-report.json"},
		//plugin = { "pretty", "html:out" },
		// plugin ="json:target/jsonReports/cucumber-report.json",
		//tags = {"@AddPlace", "@DeletePlace" }, 
		glue = { "stepDefinations" }
		
		)

public class TestRunner {

}
