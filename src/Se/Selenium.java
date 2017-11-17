package Se;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium {

	public static void main(String[] args) {
	System.out.println("Hi");
	ChromeDriver driver;
	System.setProperty("webdriver.chrome.driver","");
	WebDriver webdriver= new ChromeDriver();
	webdriver.get("http://www.google.com");
	}
	
	

}
