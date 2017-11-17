package dropdowns;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdownsdemo {

	public static void main(String s[]) throws InterruptedException {
		// Facebook dropdowns
		System.setProperty("webdriver.firefox.marionette", "C:\\Users\\srini\\Downloads\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		//driver.manage().window().maximize();
		WebElement month_dropdown = driver.findElement(By.id("month"));

		Select month_dd = new Select(month_dropdown);
		month_dd.selectByIndex(8);
		// it will slect August

		Thread.sleep(3000);

		month_dd.selectByValue("10");
		// it will select October

		Thread.sleep(3000);
		month_dd.selectByVisibleText("Aug");
		// it will select August
	
	}
	
}
