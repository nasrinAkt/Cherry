package Cherry_TestRunner;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import Cherry_Utility.Cherry_Base;
import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features= {"src/test/resources/Cherry_Features"},
plugin = {"json:target/cucumber.json"},
glue = "Cherry_StepDefinition",tags={"@tag,@tag1"})

public class Cherry_TestRunner extends AbstractTestNGCucumberTests{

	
	@BeforeTest
	public void cherStartURL() {
	Cherry_Base che	= new Cherry_Base();
	che.CherBrowser();
		
		
		
	}
	
	@AfterTest
	public void cherCloseURL() {
	Cherry_Base che	= new Cherry_Base();	
	che.driver.quit();	
		
		
	}
	
	
}
