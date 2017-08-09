package pageObjects;

import org.openqa.selenium.WebDriver;

public class AccountPage extends PageObject {

	public AccountPage(WebDriver driver) {
		super(driver);
	}

	public String getTitle() {
		return driver.getTitle();
	}
}
