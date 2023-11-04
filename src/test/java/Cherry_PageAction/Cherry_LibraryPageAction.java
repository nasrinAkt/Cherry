package Cherry_PageAction;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;

import Cherry_PageLocator.Cherry_LibraryPageLocator;
import Cherry_Utility.Cherry_Base;

public class Cherry_LibraryPageAction extends Cherry_Base{
	Cherry_LibraryPageLocator cherry_LibraryPageLocator = new Cherry_LibraryPageLocator();
	
	public void Verifylibrarypagecher() throws Exception {
		
		((JavascriptExecutor)driver).executeScript("scroll(0,200)");
		Thread.sleep(2000);
		
	boolean veri = cherry_LibraryPageLocator.lPage.isDisplayed();
		Assert.assertTrue(veri);
		
	}
	
}
