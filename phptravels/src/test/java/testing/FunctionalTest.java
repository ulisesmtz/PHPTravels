package testing;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.*;

/**
 * Basic steps for initialization/destruction of WebDriver. All test files will extend this class.
 * @author UlisesM
 *
 */
public class FunctionalTest {
	
	protected RemoteWebDriver driver;
	
	@Parameters("browser")
	@BeforeClass
	public void setupDriver(String browser) throws MalformedURLException {
		// will handle 2 major browsers: FireFox & Chrome
		DesiredCapabilities dc = null;
		
		if (browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "/phptravels/src/main/resources/chromedriver.exe");
			dc = DesiredCapabilities.chrome();
			dc.setBrowserName("chrome");
			
		} else if (browser.equalsIgnoreCase("firefox")) {
			dc = DesiredCapabilities.firefox();
			dc.setBrowserName("firefox");
		}
		
		dc.setPlatform(Platform.WIN8_1);
		driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), dc);
	}
	
	@AfterClass
	public void quitDriver() {
		driver.quit();
	}

}
