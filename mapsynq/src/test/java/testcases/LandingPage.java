package testcases;

import org.testng.annotations.Test;

import webpages.HomePage;

public class LandingPage extends InitClass {


	/*
	 * 
	 * Testcase 1: Verify MapSynq Page is loaded properly with all the required tabs
	 * and links In this method,it verifies that mapsynq page is loaded properly.
	 * And all the required tabs like signin,register etc and directions,live are
	 * displayed.
	 * 
	 */

	@Test(priority = 0)
	public void checkOptionsLandingPage() throws InterruptedException {

		HomePage homepage = new HomePage(driver);
		homepage.verifymapsynqHeading();
		homepage.verifyHorizontalPaneLinks();
		homepage.verifyVerticalPaneLinks();

	}

}
