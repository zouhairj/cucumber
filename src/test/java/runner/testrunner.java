package runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions
(
		features="/Users/zouhairjemmaa/eclipse-workspace/Cucumber_Selenium/src/test/java/features/",
		glue= {"seleniumgluecode"},
		plugin = {
					"pretty",
					"html:target/cucumber-html-report",
					"json:target/cucumber.json",
					"junit:targe/cucumber.xml",
					"rerun:target/rerun.txt"
				}
)

public class testrunner {
	
	@BeforeClass
	public static void beforeClass() {
		
	}
	
	@AfterClass
	public static void afterClass() {
		
	}

}