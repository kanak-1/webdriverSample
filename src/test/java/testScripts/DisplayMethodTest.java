package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DisplayMethodTest {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://automationbookstore.dev/");
	driver.findElement(By.id("searchBar")).sendKeys("Test");
	
	WebElement closeIcon = driver.findElement(By.cssSelector("a[title='Clear text']"));
	if(closeIcon.isDisplayed()) {
		closeIcon.click();
	}
	
	
	
}
}
