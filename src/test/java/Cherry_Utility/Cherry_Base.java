package Cherry_Utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;


public class Cherry_Base {

	
	
	public static WebDriver driver;
	public static Properties CherPro;
	
	public Cherry_Base() {
		
		try {
			FileInputStream cherFle = new FileInputStream(System.getProperty("user.dir")+("//src//test//java//Cherry_Config//Cherry_Config.Properties"));
			CherPro = new Properties();
			CherPro.load(cherFle);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("please,look the code");
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void CherBrowser() {
	String CherAllBrowser = CherPro.getProperty("CherBrowser1");
	if(CherAllBrowser.equalsIgnoreCase("Chrome")) {
			
	System.setProperty("Webdriver.chrome.driver", System.getProperty("user.dir")+("//Cherry_ChromeDriver//chromedriver.exe"));
	ChromeOptions wow = new ChromeOptions();
	wow.addArguments("--remote-allow-origins=*"); 
	driver = new ChromeDriver();
	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(Cherry_Utiliti.pageLoadTimeout));
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Cherry_Utiliti.implicitlyWait));
	driver.manage().window().maximize();	
				
			
			
		}
	else if(CherAllBrowser.equalsIgnoreCase("Edge")) {
		
	System.setProperty("Webdriver.edge.driver", System.getProperty("user.dir")+("//Cherry_EdgeDriver//msedgedriver.exe"));
	EdgeOptions wow1 = new EdgeOptions();
	wow1.addArguments("--remote-allow-origins=*"); 
	driver = new EdgeDriver();
	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(Cherry_Utiliti.pageLoadTimeout));
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Cherry_Utiliti.implicitlyWait));
	driver.manage().window().maximize();	
					
				
		
		
	}
		
	}
	
	public static void CherLaunchURL(String URL) {
		
		driver.get(CherPro.getProperty("CherURL"));
		
		
		
	}
	
	
	
}
