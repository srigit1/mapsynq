package webpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HorizontalPane {
	
	 private WebDriver driver;
	
	
	
	@FindBy(xpath="//a[contains(text(),'Sign in')]")
	WebElement signinLink;
	
	@FindBy(xpath="//a[contains(text(),'Register')]")
	WebElement registerLink;
	
	@FindBy(xpath="//a[contains(text(),'Mobile App')]")
	WebElement mobileAppLink;
	
	@FindBy(xpath="//a[contains(text(),'Galactio')]")
	WebElement galactioLink;
	
	@FindBy(xpath="//a[contains(text(),'SG GPS Navigation')]")
	WebElement gpsnavigationLink;
	
	
	@FindBy(xpath="//a[contains(text(),'Legend')]")
	WebElement legendLink;
	
	
	@FindBy(xpath="//a[contains(text(),'Calendar')]")
	WebElement calendarLink;
	
		
	@FindBy(xpath= "//a[contains(text(),'or Create Account')]")
	WebElement signInPage;
	
	@FindBy(xpath= "//h5[contains(text(),'Create your mapSYNQ account')]")
	WebElement registerAccountPage;
	
	@FindBy(xpath= "//a[contains(text(),'BACK')]")
	WebElement backLink;
	
	@FindBy(xpath= "//a[contains(text(),'MAPSYNQ')]")
	WebElement mapsynqLink;
	
	@FindBy(xpath= "//input[@id='poi_from']")
	WebElement fromLocation;
	
	@FindBy(xpath= "//input[@id='poi_to']")
	WebElement toLocation;
	
	@FindBy(xpath= " //input[@id='get_direction']")
	WebElement getDirections;
	
	
	@FindBy(xpath= " //a[contains(text(),'Adam Road (Towards Changi)')]")
	WebElement firstcameraAdamRoadLink;
	
	@FindBy(xpath= "//b[contains(text(),'PIE - Adam Road (Towards Changi)')]")
	WebElement cameraMapLocation;
	
	@FindBy(xpath= "//a[contains(text(),'Anson Road')]")
	WebElement tollsAnsonRoadLink;
	

	@FindBy(xpath= "//b[contains(text(),'Anson Road')]")
	WebElement tollsMapLocation;
	
	@FindBy(xpath= "//div[@class='item_time'][contains(text(),'14:17')]")
	WebElement incidentLink;
	
	
	@FindBy(xpath= "//div[@id='popup_contentDiv']")
	WebElement incidentpopup;
	
	@FindBy(xpath= "//span[@id='ui-dialog-title-incidentLegend']")
	WebElement legendPopup;
	
	@FindBy(xpath= " //span[@id='ui-dialog-title-div_events']")
	WebElement calendarPopup;
	
	
	
	 public HorizontalPane(WebDriver driver){
	       this.driver=driver;
	       PageFactory.initElements(driver, this);
	   }
	 
	
	 public void navigationonClick_horizontalPaneLinks() throws InterruptedException
	 {
		 
		 registerLink.click();
		 Thread.sleep(2000);
		 registerAccountPage.isDisplayed();
		 System.out.println("Navigated to register account page");
		 Thread.sleep(2000);
		 backLink.click();
		 String parentHandle = driver.getWindowHandle();
		 mobileAppLink.click();
		 for (String winHandle : driver.getWindowHandles()) {
		     driver.switchTo().window(winHandle); 
		 }
		
		 driver.getTitle().equalsIgnoreCase("mapSYNQ Mobile");
		 System.out.println("Navigated to mobile app  page");
		 Thread.sleep(2000);
		 mapsynqLink.click();
		 driver.switchTo().window(parentHandle); 
		 
		 galactioLink.click();
		 for (String winHandle : driver.getWindowHandles()) {
		     driver.switchTo().window(winHandle); 
		 }
		 driver.getTitle().equalsIgnoreCase("Galactio");
		 System.out.println("Navigated to galactio page");
		 driver.close();
		 driver.switchTo().window(parentHandle); 
		
		 gpsnavigationLink.click();
		 for (String winHandle : driver.getWindowHandles()) {
		     driver.switchTo().window(winHandle); 
		 }
		 driver.getTitle().equalsIgnoreCase("Google Play");
		 driver.close();
		 driver.switchTo().window(parentHandle); 
		 System.out.println("Navigated to gps navigation pages");
		 Thread.sleep(2000);
		 signinLink.click();
		 signInPage.isDisplayed();
		 System.out.println("Navigated to signin  page");
		 backLink.click();
		 Thread.sleep(2000);
		 
	 }
	 
	
}