package seleniumwebdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstScript {

	public static void main(String[] args) {
		System.setProperty("webdriver.firefox.marionette","C:\\Users\\srini\\Downloads\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.learn-automation.com");
		System.out.println(driver.getTitle());
		driver.quit(); 
	}
}

