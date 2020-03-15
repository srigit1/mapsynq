package webpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VerticalPane {
	
	 private WebDriver driver;
	
	
	@FindBy(xpath="//input[@id='txtGlobalSearch']")
	WebElement globalSearchBox;
	
	@FindBy(xpath="//span[@class='search_icon sprite']")
	WebElement globalsearch;
	
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
	
	@FindBy(xpath= "//div[@id='OpenLayers_Control_PanZoomBar_ZoombarOpenLayers.Map_5']")
	WebElement zoombar;
	
	@FindBy(xpath= "//div[@id='sp_toggle']")
	WebElement togglebar;
	
	@FindBy(xpath="//a[contains(text(),'Legend')]")
	WebElement legendLink;
	
	
	@FindBy(xpath="//a[contains(text(),'Calendar')]")
	WebElement calendarLink;
	
	
	 public VerticalPane(WebDriver driver){
	       this.driver=driver;
	       //Initialise Elements
	       PageFactory.initElements(driver, this);
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
		     driver.switchTo().window(winHandle); 
		 }
	  incidentpopup.isDisplayed();
	  driver.close();
	  driver.switchTo().window(parentHandle); 
	  
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

 
  public void verifyZoomFunctionality()
  {
	  zoombar.click();
	  
  }
  public void verifyToggleFunctionality()
  {
	  
	 togglebar.click();
	 
	  
  }
  
  public void verifyGlobalSearchFunctionality()
	{
		globalSearchBox.clear();
		globalSearchBox.sendKeys("544268");
		globalsearch.click();
	
			
	}
  public void verifyDirectionsFunctionality()
	{
		fromLocation.clear();
		fromLocation.sendKeys("544268");
		toLocation.clear();
		toLocation.sendKeys("570101");
		getDirections.click();
	}
}