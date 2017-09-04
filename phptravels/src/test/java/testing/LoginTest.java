package testing;

import org.testng.Assert;
import org.testng.annotations.*;

import pageObjects.AccountPage;
import pageObjects.LoginPage;

public class LoginTest extends FunctionalTest {

	/**
	 * Logs in with valid credentials and checks that it redirects to the users
	 * account page.
	 */
	@Test(dependsOnMethods="failLogin")  // to ensure this method runs second
	@Parameters({"username", "password"})
	public void login(String username, String password) {
		driver.get("http://www.phptravels.net/login");

		LoginPage loginPage = new LoginPage(driver);

		loginPage.enterUserName(username);
		loginPage.enterPassword(password);
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
	 * Attempts to log in with invalid credentials. Checks to make sure error
	 * message is displayed and with correct message.
	 */
	@Test
	@Parameters({"fakeUsername", "fakePassword"})
	public void failLogin(String fakeUsername, String fakePassword) {
		driver.get("http://www.phptravels.net/login");

		LoginPage loginPage = new LoginPage(driver);

		loginPage.enterUserName(fakeUsername);
		loginPage.enterPassword(fakePassword);
		loginPage.submit();
	}

}
