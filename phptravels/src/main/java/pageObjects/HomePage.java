package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage extends PageObject{
		
	public HomePage(WebDriver driver) {
		super(driver); 
	}

	/**
	 * Used to select the check in date for hotel. Will go to next month and click on second week on Friday
	 */
	public void checkIn() {

		// used to open the calendar for check in
		WebElement calendar = driver.findElement(By.xpath("//input[@class='form input-lg dpd1']"));
		
		// used to click on the arrow to change to next month
		WebElement nextMonth = driver.findElement(By.xpath("(//div[@class='datepicker-days']//th[last()])[1]"));
		
		// used to get second week, Friday
		WebElement date = driver.findElement(By.xpath("/html/body/div[13]/div[1]/table/tbody/tr[2]/td[6]"));

		calendar.click();
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		nextMonth.click();
		date.click();
	}
}
