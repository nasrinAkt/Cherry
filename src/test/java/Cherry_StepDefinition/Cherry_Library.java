package Cherry_StepDefinition;

import Cherry_PageAction.Cherry_HomePageAction;
import Cherry_PageAction.Cherry_LibraryPageAction;
import Cherry_Utility.Cherry_Base;
import cucumber.api.java.en.Then;

public class Cherry_Library extends Cherry_Base {
	
	Cherry_HomePageAction cherry_HomePageAction = new Cherry_HomePageAction();
	Cherry_LibraryPageAction cherry_LibraryPageAction = new Cherry_LibraryPageAction();
	
	@Then("^click library$")
	public void click_library() throws Throwable {
		cherry_HomePageAction.clicklibrary(); 
	}

	@Then("^Verify library page cher$")
	public void verify_library_page_cher() throws Throwable {
		cherry_LibraryPageAction.Verifylibrarypagecher();  
	}


	
	
	
}
