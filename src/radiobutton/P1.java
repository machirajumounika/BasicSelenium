package radiobutton;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P1 {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\srini\\Downloads\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	
	driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-automate-radio-button-in.html");
List<WebElement> radio=	driver.findElements(By.xpath("//input[@name='lang'and @type='radio']"));

	

for(int i=0;i<radio.size();i++)
{
	WebElement local_radio=radio.get(i);
	String value=local_radio.getAttribute("value");
	System.out.println("Values from the radiobuttons are=====>"+value);
	if(value.equalsIgnoreCase("RUBY"))
	{
		local_radio.click();	
	}
	
}
List <WebElement> Checkbox= driver.findElements(By.xpath("//input[@type='checkbox']"));
for(int i=0;i<Checkbox.size();i++)
{
WebElement ele =Checkbox.get(i);
String id=ele.getAttribute("id");

if(id.equalsIgnoreCase("code"))
{
	ele.click();	
	break;
}
	
}

	}

}
