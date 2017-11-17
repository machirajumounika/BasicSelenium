package chromebrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChromebrowser {

	public static void main(String[] args) {
    System.setProperty("webdriver.chrome.driver","C:\\Users\\srini\\Downloads\\chromedriver.exe");
    WebDriver driver=new ChromeDriver();
    driver.get("http://www.amazon.in");
    System.out.println(driver.getTitle());
    driver.quit();
    
    
	}

}
