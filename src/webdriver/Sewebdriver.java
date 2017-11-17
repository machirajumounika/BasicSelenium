package webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Sewebdriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("HelloWorld");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\srini\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("http://www.google.com");
		
		
	}

}
