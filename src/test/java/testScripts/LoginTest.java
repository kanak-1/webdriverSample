package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://the-internet.herokuapp.com/login");
	//driver.findElement(By.linkText("Elemental Selenium")).click();
	//driver.findElement(By.partialLinkText("Selenium")).click();
	driver.findElement(By.id("username")).sendKeys("tomsmith");
	driver.findElement(By.name("password")).sendKeys("SuperSecretPassword!");
	driver.findElement(By.className("radius")).click();
	//fsdfsdfsdf
}
}
