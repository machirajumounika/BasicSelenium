package edureka.basic;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActionsDemo {

	public static void main(String[] args) throws Exception{
		
		//WebDriver driver = CommonDriver.launchBrowser("firefox");
		
		/*driver.get("http://way2automation.com/way2auto_jquery/droppable.php");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Way2AutomationLogin.login(driver);
		
		WebElement interactionele =driver.findElement(By.linkText("Interaction"));
		
		Actions actions = new Actions(driver);
		actions.moveToElement(interactionele);
		
		actions.build().perform();
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("Droppable")));
		
		WebElement droppableEle = driver.findElement(By.linkText("Droppable"));
		actions.click(droppableEle);
		actions.build().perform();
		
		driver.switchTo().frame(0);
		WebElement sourceEle =driver.findElement(By.id("draggable"));
		WebElement targetEle = driver.findElement(By.id("droppable"));
		actions.dragAndDrop(sourceEle, targetEle).build().perform();

		driver.switchTo().defaultContent();

		driver.findElement(By.linkText("Registration")).click();
		WebElement firstNameEle=driver.findElement(By.name("name"));
		WebElement lastNameEle = driver.findElement(By.xpath(".//*[@id='register_form']/fieldset/p[2]/input"));
		actions.sendKeys(firstNameEle, "edureka").build().perform();
		
		actions.keyDown(Keys.CONTROL).sendKeys("a").sendKeys("c").keyUp(Keys.CONTROL).build().perform();
//		actions.keyDown(Keys.CONTROL).sendKeys(lastNameEle,"v").keyUp(Keys.CONTROL).build().perform();
		actions.sendKeys(lastNameEle,Keys.chord(Keys.CONTROL,"v")).build().perform();
		*/
	}

}
