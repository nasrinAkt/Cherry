package Cherry_PageAction;

import org.testng.Assert;

import Cherry_PageLocator.Cherry_ExamPageLocator;
import Cherry_Utility.Cherry_Base;

public class Cherry_ExamPageAction extends Cherry_Base {
	
	Cherry_ExamPageLocator cherry_ExamPageLocator = new Cherry_ExamPageLocator();
	
	public void Verifysigninpagedisplayafterclickexaminationlink() throws Exception {
		Thread.sleep(2000);
	boolean tr = cherry_ExamPageLocator.verify.isDisplayed();
		Assert.assertTrue(tr);
		
	}
	
	
	
}
