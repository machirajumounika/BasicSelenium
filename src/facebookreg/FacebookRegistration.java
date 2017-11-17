package facebookreg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookRegistration {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\srini\\Downloads\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.facebook.com");
		//driver.manage().window().maximize();
		driver.findElement(By.xpath(".//*[@id='u_0_9']")).sendKeys("TestSelenium");	
		driver.findElement(By.xpath(".//*[@id='u_0_b']")).sendKeys("Testing7@123456");	
		driver.findElement(By.xpath(".//*[@id='u_0_e']")).sendKeys("testing123456789@gmail.com");
		driver.findElement(By.xpath(".//*[@id='u_0_h']")).sendKeys("testing123456789@gmail.com");
		driver.findElement(By.xpath(".//*[@id='u_0_l']")).sendKeys("Password");
		Select sel1=new Select(driver.findElement(By.xpath(".//*[@id='month']")));
		sel1.selectByVisibleText("Aug");
		Select sel2=new Select(driver.findElement(By.xpath(".//*[@id='day']")));
		sel2.selectByIndex(2);
		Select sel3=new Select(driver.findElement(By.xpath(".//*[@id='year']")));
		sel3.selectByIndex(16);
		driver.findElement(By.xpath(".//*[@id='u_0_6']"));
		driver.findElement(By.xpath(".//*[@id='u_0_p']/span[1]")).click();
		driver.findElement(By.xpath(".//*[@id='u_0_r']")).click();
		
		//select create a page link and clicking on back
		
		driver.findElement(By.xpath(".//*[@id='reg_pages_msg']/a")).click();
		driver.navigate().back();
		driver.quit();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
				
		
	}

	}
