package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends PageObject {
	
	@FindBy(name = "username")
	private WebElement username;
	
	@FindBy(name = "password")
	private WebElement password;
	
	@FindBy(xpath = "//button[contains(.,'Login')]")
	private WebElement submit;
	

	public LoginPage(WebDriver driver) {	
		super(driver);
	}
	
	
	public void enterUserName(String username) {
		this.username.clear();
		this.username.sendKeys(username);
	}
	
	public void enterPassword(String password) {
		this.password.clear();
		this.password.sendKeys(password);
	}
	
	public AccountPage submit() {
		submit.click();
		return new AccountPage(driver);
	}

}
