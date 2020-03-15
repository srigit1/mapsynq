package testcases;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

import webpages.HomePage;




public class LandingPage {
	
	WebDriver driver;
	
	 @Before
	   public void setup(){
	      
	   	    System. setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\chromedriver_win32\\chromedriver.exe");
	       driver = new ChromeDriver();
	       driver.manage().window().maximize();
	       driver.get("http://www.mapsynq.com");
	       driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	   }
	   
	//Testcase 1:Verify MapSynq Page is displayed and all tabs are displayed 
	 @Test
	 public void checkOptionsLandingPage() throws InterruptedException
	 {
		 
		 HomePage homepage=new HomePage(driver);
		 homepage.verifymapsynqHeading();
		// homepage.verifyHorizontalPaneLinks();
		// homepage.verifyVerticalPaneLinks();
		 homepage.navigationonClick_horizontalPaneLinks();

     }
	 
	/*
	 * @Test
	 * 
	 * public void verifyNavigationPagesOf_HorizontalPaneLinks() throws
	 * InterruptedException { HomePage homepage=new HomePage(driver);
	 * 
	 * }
	 */
	 
	 @After
	 public void quit()
	 {
		 driver.quit();
	 }
	 
}
 