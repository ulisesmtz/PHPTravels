package testing;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.SearchPage;

public class HomeTest extends FunctionalTest {

	/**
	 * Shows available hotels for next day
	 */
	@Test
	public void nextDayHotel() {
		driver.get("http://www.phptravels.net");
		HomePage homePage = new HomePage(driver);
		homePage.selectNumPeople(3, 1);
		
		SearchPage searchPage = homePage.submit();
		Assert.assertEquals(searchPage.getTitle(), "Search Results");
	}	
	
} 
