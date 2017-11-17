package Ie;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class InternetExplorer {

	public static void main(String[] args) {
	System.setProperty("webdriver.ie.driver","C:\\Users\\srini\\Downloads\\IEDriverServer.exe");
	
	DesiredCapabilities caps = DesiredCapabilities.internetExplorer();
	caps.setCapability("ignoreZoomSetting", true);
	WebDriver driver=new InternetExplorerDriver(caps);
	driver.get("https://www.google.com/");
	System.out.println(driver.getTitle());
	driver.quit();
	
	

	}

}
