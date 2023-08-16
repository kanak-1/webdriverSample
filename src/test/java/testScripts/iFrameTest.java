package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class iFrameTest {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
	String strLbl = driver.findElement(By.xpath("//label//span")).getText();
	System.out.println(strLbl);
	driver.switchTo().frame("frame1"); //main page to frame 1
	driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Hello");
	//frame 1 to frame3
	//driver.switchTo().frame("frame3");
	driver.switchTo().frame(0); // index starts with 0 if 1 is used no such frame exception
	driver.findElement(By.xpath("//input[@type='checkbox']")).click();
	//frame 3 to frame1
	driver.switchTo().parentFrame();
	driver.findElement(By.xpath("//input[@type='text']")).clear();
	driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Hello World");
	
	//frame1 to main page
	driver.switchTo().defaultContent(); //can come back to main page from any frame
	strLbl = driver.findElement(By.xpath("//label//span")).getText();
	System.out.println(strLbl);
	driver.switchTo().frame("frame2");
	WebElement dropdown = driver.findElement(By.id("animals"));
	Select option=new Select(dropdown);
	option.selectByIndex(2);
//	Select option1=(Select) driver.findElement(By.id("animals"));
//	option1.selectByValue("cat");	
	
	
}
}
