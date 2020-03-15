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
	
	
	@FindBy(xpath="//label[@class='radioset_live ui-button ui-widget ui-state-default ui-button-text-only ui-corner-right ui-state-hover']//span[@class='ui-button-text']")
	WebElement tollsTab;
	
	
	@FindBy(xpath="//input[@id='txtSearchIncidentsingapore']")
	WebElement searchIncidents;
	
	
	@FindBy(xpath= "//input[@id='txtSearchCamerasrilanka']")
	WebElement searchCameras;
	
	

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

}