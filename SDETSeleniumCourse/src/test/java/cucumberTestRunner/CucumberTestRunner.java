package cucumberTestRunner;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
		features = "src/test/resources",
		glue = "stepDefinition", // where is our java code & mapped
		snippets =  SnippetType.CAMELCASE, // to get the code snippet in camel case
		monochrome = true, // to remove the junk chars
		plugin = {"pretty", "html:CucumberReports"}, // report
		dryRun = false// to get the code snippet
		)
public class CucumberTestRunner extends AbstractTestNGCucumberTests{  }
