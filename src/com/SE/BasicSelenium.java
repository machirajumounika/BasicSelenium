package com.SE;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BasicSelenium {
	static WebDriver driver=null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.firefox.marionette", "C:\\Users\\srini\\Downloads\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.amazon.in/");
		// go and find element with id value as twotabsearchtextbox
		WebElement searchele = driver.findElement(By.id("twotabsearchtextbox"));

		searchele.click();
		searchele.sendKeys("mobiles");

		driver.navigate().to("http://www.google.com");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		driver.quit();
	}

}
