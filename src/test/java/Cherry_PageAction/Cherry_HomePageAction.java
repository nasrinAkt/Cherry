package Cherry_PageAction;

import org.openqa.selenium.interactions.Actions;

import Cherry_PageLocator.Cherry_HomePageLocator;
import Cherry_Utility.Cherry_Base;

public class Cherry_HomePageAction extends Cherry_Base {
	
	Cherry_HomePageLocator cherry_HomePageLocator = new Cherry_HomePageLocator();
	
	public void  mousehoveronAcademicslinkcher() throws Exception {
		Actions act = new Actions(driver);
		act.moveToElement(cherry_HomePageLocator.mouseHover).build().perform();
		Thread.sleep(2000);
		
	}
	public void clickexaminationslinkcher() {
		cherry_HomePageLocator.clExam.click();
		
		
	}
	public void clicklibrary() {
		cherry_HomePageLocator.clL.click();	
		
		
		
	}
}
