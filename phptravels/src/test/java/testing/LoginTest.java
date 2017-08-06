package testing;

import org.testng.Assert;
import org.testng.annotations.*;

import pageObjects.AccountPage;
import pageObjects.LoginPage;

public class LoginTest extends FunctionalTest {
	
  @Test
  public void login() {
	  driver.get("http://www.phptravels.net/login");
	  
	  LoginPage loginPage = new LoginPage(driver);
	  
	  loginPage.enterUserName("user@phptravels.com");
	  loginPage.enterPassword("demouser");
	  
	  AccountPage accountPage = loginPage.submit();
  }
  
}
