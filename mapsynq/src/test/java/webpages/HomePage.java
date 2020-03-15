package webpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	 private WebDriver driver;
	
	@FindBy(xpath="//a[@class='header_logo sprite']")
	WebElement mapsynqHeadingText;
	
	
	@FindBy(xpath="//input[@id='txtGlobalSearch']")
	WebElement globalSearchBox;
	
	@FindBy(xpath="//span[@class='search_icon sprite']")
	WebElement globalsearch;
	
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
	
	@FindBy(xpath="//a[@class='tab_button directions_tab sprite']")
	WebElement directionsTab;
	
	@FindBy(xpath="//a[@class='tab_button me_tab sprite']")
	WebElement personalTab;
	
	@FindBy(xpath="//a[@class='tab_button live_tab sprite tab_active']")
	WebElement liveTab;
	
	@FindBy(xpath="//h2[contains(text(),'Incidents')]")
	WebElement incidentsTab;
	
	@FindBy(xpath=" //h2[contains(text(),'Cameras')]")
	WebElement CamerasTab;
	
	
	@FindBy(xpath=" //h2[contains(text(),'Tolls')]")
	WebElement tollsTab;
	
	
	@FindBy(xpath="//input[@id='txtSearchIncidentsingapore']")
	WebElement searchIncidents;
	
	
	@FindBy(xpath= "//input[@id='txtSearchCamerasrilanka']")
	WebElement searchCameras;
	
	
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
	
	
	 public HomePage(WebDriver driver){
	       this.driver=driver;
	       //Initialise Elements
	       PageFactory.initElements(driver, this);
	   }
	 
	 public void verifymapsynqHeading()
	 {
		 mapsynqHeadingText.isDisplayed();
		 
	 }
	 
	 public void verifyHorizontalPaneLinks()
	 {
		 signinLink.isDisplayed();
		 registerLink.isDisplayed();
		 mobileAppLink.isDisplayed();
		 galactioLink.isDisplayed();
		 gpsnavigationLink.isDisplayed();
		 gpsnavigationLink.isDisplayed();
		 System.out.println("all options in horizontal pane are displayed");
		 
	 }
	 
	 public void verifyVerticalPaneLinks() throws InterruptedException
	 {
		 Thread.sleep(2000);
		 directionsTab.isDisplayed();
		 personalTab.isDisplayed();
		 liveTab.isDisplayed();
		 System.out.println("all options in v pane are displayed");
	 }
	 
	 public void navigationonClick_horizontalPaneLinks() throws InterruptedException
	 {
		 Thread.sleep(2000);
		 signinLink.click();
		 signInPage.isDisplayed();
		 System.out.println("Navigated to signin  page");
		 backLink.click();
		 Thread.sleep(2000);
		 registerLink.click();
		 Thread.sleep(2000);
		 registerAccountPage.isDisplayed();
		 System.out.println("Navigated to register account page");
		 Thread.sleep(2000);
		 backLink.click();
		 String parentHandle = driver.getWindowHandle();
		 mobileAppLink.click();
		 for (String winHandle : driver.getWindowHandles()) {
		     driver.switchTo().window(winHandle); // switch focus of WebDriver to the next found window handle
		 }
		
		 driver.getTitle().equalsIgnoreCase("mapSYNQ Mobile");
		 System.out.println("Navigated to mobile app  page");
		 Thread.sleep(2000);
		 mapsynqLink.click();
		 driver.switchTo().window(parentHandle); 
		 
		 galactioLink.click();
		 for (String winHandle : driver.getWindowHandles()) {
		     driver.switchTo().window(winHandle); // switch focus of WebDriver to the next found window handle
		 }
		 driver.getTitle().equalsIgnoreCase("Galactio");
		 System.out.println("Navigated to galactio page");
		 driver.close();
		 driver.switchTo().window(parentHandle); 
		
		 gpsnavigationLink.click();
		 for (String winHandle : driver.getWindowHandles()) {
		     driver.switchTo().window(winHandle); // switch focus of WebDriver to the next found window handle
		 }
		 driver.getTitle().equalsIgnoreCase("Google Play");
		 driver.close();
		 driver.switchTo().window(parentHandle); 
		 System.out.println("Navigated to gps navigation pages");
		 
	 }
	 
	public void verifyGlobalSearchFunctionality()
	{
		globalSearchBox.sendKeys("544268");
		globalsearch.click();
		driver.navigate().refresh();
			
	}
	
	public void verifyDirectionsFunctionality()
	{
		fromLocation.clear();
		fromLocation.sendKeys("544268");
		toLocation.clear();
		toLocation.sendKeys("570101");
		getDirections.click();
	}
	 
	 
  public void verifyLiveTabFunctionality()
  {
	  
	  liveTab.click();
	  searchIncidents.clear();
	  searchIncidents.sendKeys("PIE");
	  CamerasTab.click();
	  firstcameraAdamRoadLink.click();
	  driver.switchTo().frame(0);
	  cameraMapLocation.isDisplayed();
	  System.out.println("camera location is displayed in maps");
	  driver.switchTo().defaultContent();
	  tollsTab.click();
	  tollsAnsonRoadLink.click();
	  driver.switchTo().frame(0);
	  tollsMapLocation.isDisplayed();
	  driver.switchTo().defaultContent();
	  System.out.println("tolls location is displayed in maps");
	  
	  
	  
  }
  
  public void verifyIncidentsInMap()
  {
	  String parentHandle = driver.getWindowHandle();
	  incidentLink.click();
	  for (String winHandle : driver.getWindowHandles()) {
		     driver.switchTo().window(winHandle); // switch focus of WebDriver to the next found window handle
		 }
	  incidentpopup.isDisplayed();
	  driver.close();
	  //driver.switchTo().window(parentHandle); 
	  
  }
  
  public void verifyLegendFunctionality()
  {
	  legendLink.click();
	  legendPopup.isDisplayed();
	  System.out.println("legend popup is displayed");
	  
  }
  
  public void verifyCalendarFunctionality()
  {
	  calendarLink.click();
	  calendarPopup.isDisplayed();
	  System.out.println("calendar popup is displayed");
  }


}