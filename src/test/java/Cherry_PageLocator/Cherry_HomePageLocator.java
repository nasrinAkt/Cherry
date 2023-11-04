package Cherry_PageLocator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Cherry_Utility.Cherry_Base;

public class Cherry_HomePageLocator extends Cherry_Base {

	public Cherry_HomePageLocator() {
		PageFactory.initElements(driver, this);
		
		
	}
	@FindBy(xpath ="//ul[contains(@class,'menu menu-horizontal w-full px-5')]//a[contains(@class,'justify-between')][normalize-space()='Academics']")
	public WebElement mouseHover;
	
	@FindBy(linkText ="Examinations")
	public WebElement clExam;
	
	@FindBy(linkText ="Library")
	public WebElement clL;
}
