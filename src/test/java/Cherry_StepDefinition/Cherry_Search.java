package Cherry_StepDefinition;

import Cherry_PageAction.Cherry_ExamPageAction;
import Cherry_PageAction.Cherry_HomePageAction;
import Cherry_Utility.Cherry_Base;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Cherry_Search extends Cherry_Base {
	Cherry_HomePageAction cherry_HomePageAction = new Cherry_HomePageAction();
	Cherry_ExamPageAction cherry_ExamPageAction = new Cherry_ExamPageAction();
	
	@Given("^open <\"([^\"]*)\"> cher$")
	public void open_cher(String URL) throws Throwable {
		CherLaunchURL(URL);
	}

	@Then("^mouse hover on Academics link cher$")
	public void mouse_hover_on_Academics_link_cher() throws Throwable {
		cherry_HomePageAction.mousehoveronAcademicslinkcher();  
	}

	@Then("^click examinations link cher$")
	public void click_examinations_link_cher() throws Throwable {
		cherry_HomePageAction.clickexaminationslinkcher(); 
	}

	@Then("^Verify sign in page display after click examination link$")
	public void verify_sign_in_page_display_after_click_examination_link() throws Throwable {
		cherry_ExamPageAction.Verifysigninpagedisplayafterclickexaminationlink();
	}


	
	
	
	
}
