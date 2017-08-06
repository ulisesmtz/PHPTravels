package phptravels;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

public class WebDriverTest {

	private WebDriver driver;
	
	@BeforeSuite
	public void initDriver() {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\UlisesM\\Downloads\\Drivers\\geckodriver.exe");
		driver = new FirefoxDriver();
	}
	
	@AfterSuite
	public void quitDriver() {
		driver.quit();
	}
	
	@BeforeClass
	public void goToHomePage() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://www.phptravels.net");
        Assert.assertEquals("PHPTRAVELS | Travel Technology Partner", driver.getTitle());
 
	}
	
	@Test
	public void login() {
		
	}

}
