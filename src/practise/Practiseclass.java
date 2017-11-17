package practise;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Practiseclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello world");
		LaunchBrowser("chrome");
		
	}
	public static void LaunchBrowser(String browserType) {
		WebDriver driver=null;
		if(browserType.equalsIgnoreCase("Chrome")) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\srini\\Downloads\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.google.com");
		}else if(browserType.equalsIgnoreCase("Firefox")) {
			//instantiate Firefox Browser
	    System.setProperty("webdriver.firefox.marionette", "C:\\Users\\srini\\Downloads\\geckodriver.exe");
     driver=new FirefoxDriver();
     
    
		
}
		
		
		/*System.setProperty("webdriver.chrome.driver", "C:\\Users\\srini\\Downloads\\chromedriver.exe");
		//C:\Users\srini\Downloads
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.google.com");	
		
		
		System.setProperty("webdriver.firefox.marionette", "C:\\Users\\srini\\Downloads\\geckodriver.exe");
		//C:\Users\srini\Downloads
      WebDriver driver2=new FirefoxDriver();
     driver2.get("http://www.amazon.in");	
     
     System.setProperty("webdriver.ie.driver", "C:\\Users\\srini\\Downloads\\IEDriverServer.exe");
		//C:\Users\srini\Downloads
   WebDriver driver3=new InternetExplorerDriver();
  driver3.get("http://mail.google.com");	
     */
     
     
     
     
     
	}

}
