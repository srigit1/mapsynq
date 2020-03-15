package testcases;


import org.testng.annotations.Test;

import webpages.HorizontalPane;

public class HorizontalPaneFunctionalities extends InitClass {
	
	
	
/*
 * 
 * Testcase 2:This testcase verifies that on click of sign in,register,mobile app ,Galactio,gps navigation links 
 * 
 * are getting navigated to their corresponding pages properly
 * 
 */
	
	
	 @Test
	 public void checkNavigationsofLinks_HorizontalPane() throws InterruptedException
	 {
		 
		 HorizontalPane  hpage=new HorizontalPane(driver);
		
		 hpage.navigationonClick_horizontalPaneLinks();
		

     }
	 
	 
}
 