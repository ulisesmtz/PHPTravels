package pageObjects;

import org.openqa.selenium.WebDriver;

public class SearchPage extends PageObject{

	public SearchPage(WebDriver driver) {
		super(driver);
	}
	
	public String getTitle() {
		return driver.getTitle();
	}

}
