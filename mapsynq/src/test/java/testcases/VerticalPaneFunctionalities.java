package testcases;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.Test;

import webpages.VerticalPane;



public class VerticalPaneFunctionalities extends InitClass {
	
	
	
	
	/* Testcase 3:This verifies the global search functionality by entering pin code and search
	 * 
	 * Also,verified directions tab functionality by entering to and from locations
	 * 
	 * 
	 */
	
	 @Test(priority=4)
	 public void verifyGlobalSearch() throws InterruptedException
	 {
		 
	   VerticalPane vpage=new VerticalPane(driver);
		
		vpage.verifyGlobalSearchFunctionality();
		
	 }
	 
	 @Test(priority=5)
	 public void verifyDirectionsFunctionality() throws InterruptedException
	 {
	
		VerticalPane vpage=new VerticalPane(driver);
	   vpage.verifyDirectionsFunctionality();
		
	 }
	 
	 /* 
	  * Testcase 4: "This verifies Live tab functionality which includes incidents verification in Map.
	  * Also verifies camera locations in map
	  * Also verifies tolls locations in map
	  */
	 
	 @Test(priority=0)
	 public void verifyLiveTabFunctionality() throws InterruptedException
	 {
	
		VerticalPane vpage=new VerticalPane(driver);
		vpage.verifyLiveTabFunctionality();
		
	 }
	 
	 @Test(priority=1)
	 public void verifyIncidentsInMap() throws InterruptedException
	 {
	
		VerticalPane vpage=new VerticalPane(driver);
		vpage.verifyIncidentsInMap();
		
	 }
	 
	 /* This testcase verifies legend,calendar pop ups are displayed properly
	  * 
	  * Also,verifies toggle bar is working
	  */
	 
	 @Test(priority=2)
	 public void verifyLegendandCalendar() throws InterruptedException
	 {
	
		VerticalPane vpage=new VerticalPane(driver);

		vpage.verifyLegendFunctionality();
		vpage.verifyCalendarFunctionality();
	 }   
	 
	 @Test(priority=3)
	 public void verifytoggle() throws InterruptedException
	 {
	
		VerticalPane vpage=new VerticalPane(driver);

		vpage.verifyToggleFunctionality();
	 }
	 
 
	 @AfterSuite
	 public void quit()
	 {
		 driver.quit();
	 }
	 
}
 