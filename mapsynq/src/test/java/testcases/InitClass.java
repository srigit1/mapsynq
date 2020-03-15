package testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class InitClass {

		 static WebDriver driver;

		 @BeforeSuite
		 public void setup(){

			   System. setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
			   driver = new ChromeDriver();
		       driver.manage().window().maximize();
		       driver.get("http://www.mapsynq.com");
		       driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

		 }

		 @AfterSuite
		 public void tearDown(){
		     driver.quit();
		 }

		 
}
