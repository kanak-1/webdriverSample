package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://the-internet.herokuapp.com/login");
	//driver.findElement(By.id("username")).sendKeys("tomsmith");
	//driver.findElement(By.name("password")).sendKeys("SuperSecretPassword!");
	//driver.findElement(By.className("radius")).click();
	//driver.findElement(By.tagName("button")).click();
	//USING xpath
	//driver.findElement(By.xpath("//input[@name='username']")).sendKeys("tomsmith");
	driver.findElement(By.xpath("//input[@id='username' and @type='text']")).sendKeys("tomsmith");
	driver.findElement(By.xpath("//input[@id='password']")).sendKeys("SuperSecretPassword!");
	driver.findElement(By.xpath("//button[@class='radius']")).click();
	//driver.findElement(By.xpath("//i[@class='fa fa-2x fa-sign-in']")).click();
	//driver.findElement(By.linkText("Elemental Selenium")).click();
	//driver.findElement(By.partialLinkText("Selenium")).click();
	//Absolute xpath of user name input field=/html/body/div[2]/div/div/form/div[1]/div/input
	// Absolute xpath of button =/html/body/div[2]/div/div/form/button/i
}
}
