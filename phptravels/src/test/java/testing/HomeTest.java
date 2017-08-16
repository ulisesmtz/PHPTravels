package testing;

import org.testng.annotations.Test;

import pageObjects.HomePage;

public class HomeTest extends FunctionalTest {

	@Test
	public void test() {
		driver.get("http://www.phptravels.net");
		HomePage homePage = new HomePage(driver);
		homePage.checkIn();
	}	
	
} 
