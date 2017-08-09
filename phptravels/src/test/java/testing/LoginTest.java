package testing;

import org.testng.Assert;
import org.testng.annotations.*;

import pageObjects.AccountPage;
import pageObjects.LoginPage;

public class LoginTest extends FunctionalTest {
	
  /**
 * Logs in with valid credentials and checks that it redirects to the 
 * users account page.
 */
@Test (priority = 1)
  public void login() {
	  driver.get("http://www.phptravels.net/login");
	  
	  LoginPage loginPage = new LoginPage(driver);
	  
	  loginPage.enterUserName("user@phptravels.com");
	  loginPage.enterPassword("demouser");
	  AccountPage accountPage = loginPage.submit();

	  // sleep thread for few seconds so page can redirect
	  try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
	  Assert.assertEquals(accountPage.getTitle(), "My Account");
  }
  
  /**
 * Attempts to log in with invalid credentials. Checks to make sure error message 
 * is displayed and with correct message.
 */
@Test (priority = 0)
  public void failLogin( ) {
	  driver.get("http://www.phptravels.net/login");
	  
	  LoginPage loginPage = new LoginPage(driver);
	  
	  loginPage.enterUserName("fake@phptravels.com");
	  loginPage.enterPassword("fake");
	  loginPage.submit();
	  
	  Assert.assertEquals(loginPage.isErrorVisible(), true);
	  Assert.assertEquals(loginPage.getErrorMessage(), "Invalid Email or Password");
  }
  
}
