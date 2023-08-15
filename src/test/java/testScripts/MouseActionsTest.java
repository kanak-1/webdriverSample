package testScripts;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseActionsTest {
public static void main(String[] args) throws InterruptedException, IOException {
	WebDriver driver=new ChromeDriver();
	Actions actions=new Actions(driver);
	driver.manage().window().maximize();
	driver.get("https://demo.opencart.com/");
	WebElement menu = driver.findElement(By.xpath("(//a[@class='nav-link dropdown-toggle'])[3]")); // -- //a[contains(text(),'Components')]
	WebElement menuItem = driver.findElement(By.xpath("//a[contains(text(),'Monitors (2)')]"));
	//actions.moveToElement(menu).perform();
	//actions.click(menuItem).perform();
	actions.moveToElement(menu).click(menuItem).build().perform(); //if we want to perform series of actions in one step and build is used as sequence of actions
	WebElement srcBox = driver.findElement(By.name("search"));
	srcBox.sendKeys("Phone");
	TakesScreenshot screen=(TakesScreenshot) driver;
	File srcFile = screen.getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(srcFile, new File("C:\\Users\\Administrator\\eclipse-workspace\\Screenshot\\FullScreen.png"));
	
	
	//actions.contextClick(srcBox).perform(); //for right click of mouse
	WebElement addToCart = driver.findElement(By.xpath("(//i[@class='fas fa-shopping-cart'])[3]"));
	//actions.scrollToElement(addToCart).perform();
	File eleFile = addToCart.getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(eleFile, new File("C:\\Users\\Administrator\\eclipse-workspace\\Screenshot\\ElementImage.png"));	
	
//	driver.get("https://www.stqatools.com/demo/DoubleClick.php");
//	Thread.sleep(1000);
//	WebElement dblbtn = driver.findElement(By.xpath("//button[contains(text(),'Double')]"));
//	actions.doubleClick(dblbtn).doubleClick(dblbtn).build().perform(); //multiple clicks 
//	
}
}
