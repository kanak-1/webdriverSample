package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GooglePageTest {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();	
		driver.manage().window().maximize();
		//driver.get("https://www.google.com/");		
		driver.navigate().to("https://www.google.com/");
		//WebElement srcBox=driver.findElement(By.id("APjFqb"));
		//WebElement srcBox=driver.findElement(By.name("q"));
		//WebElement srcBox=driver.findElement(By.tagName("textarea"));
		WebElement srcBox=driver.findElement(By.className("gLFyf"));
		srcBox.sendKeys("Java Tutorial");
		srcBox.sendKeys(Keys.ENTER);
		String strTitle=driver.getTitle();
		System.out.println("Page Title-" + strTitle );
		System.out.println("Page URL"+ driver.getCurrentUrl() );
		driver.navigate().back();
		//driver.navigate().forward();
		System.out.println("Page Title-" + driver.getTitle());
		//driver.navigate().to("https://the-internet.herokuapp.com/login");
	//driver.findElement(By.id("username")).sendKeys("tomsmith");
		//driver.findElement(By.xpath("//input[@name='username']")).sendKeys("tomsmith");
		//driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");
		//driver.findElement(By.xpath("//input[@name='password']")).sendKeys("SuperSecretPassword!");
		//driver.findElement(By.className("radius")).click();
		//driver.findElement(By.xpath("//button[@class='radius']")).click();
		
		//driver.close();
		
	}

}
