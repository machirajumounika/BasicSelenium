package bootstrap;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BootStrap {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\srini\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("http://seleniumpractise.blogspot.com/2016/08/bootstrap-dropdown-example-for-selenium.html");
		//driver.manage().window().maximize();
		driver.findElement(By.xpath(".//*[@id='menu1']")).click();
		List<WebElement> dd_menu = driver
				.findElements(By.xpath(".//*[@id='post-body-4615304122771162527']/div[1]/div/ul"));
		for (WebElement element : dd_menu) {
			String innerhtml = element.getAttribute("innerHTML");
			if (innerhtml.contentEquals("Javascript"))
				;
			{
				element.click();
				break;
			}
		}
		driver.quit();

	}
}
