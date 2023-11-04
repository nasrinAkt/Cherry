package Cherry_PageLocator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Cherry_Utility.Cherry_Base;

public class Cherry_ExamPageLocator extends Cherry_Base{

	public Cherry_ExamPageLocator() {
		PageFactory.initElements(driver, this);
		
		
	}
	@FindBy(xpath ="//h1[text()='Sign in']")
	public WebElement verify;
	
	
}
