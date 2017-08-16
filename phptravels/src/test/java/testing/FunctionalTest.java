package testing;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

/**
 * Basic steps for initialization/destruction of WebDriver. All test files will extend this class.
 * @author UlisesM
 *
 */
public class FunctionalTest {
	
	protected WebDriver driver;
	
	@BeforeClass
	public void setupDriver() {
		// TODO: add multiple browsers capabilities
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\UlisesM\\Downloads\\Drivers\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@AfterClass
	public void quitDriver() {
		driver.quit();
	}

}
