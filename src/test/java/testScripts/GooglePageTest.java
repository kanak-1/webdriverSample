package testScripts;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GooglePageTest {
	public static void main(String[] args) throws InterruptedException {
		//my token = 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
		//my new token for practice=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
		WebDriver driver=new ChromeDriver();	
		driver.manage().window().maximize();
		//driver.get("https://www.google.com/");		
		driver.navigate().to("https://www.google.com/");
		//WebElement srcBox=driver.findElement(By.id("APjFqb"));
		//WebElement srcBox=driver.findElement(By.name("q"));
		//WebElement srcBox=driver.findElement(By.tagName("textarea"));
		WebElement srcBox=driver.findElement(By.className("gLFyf"));
		srcBox.sendKeys("Java Tutorial");
		Thread.sleep(2000);
		List<WebElement> items=driver.findElements(By.xpath("(//ul[@class='G43f7e'])[1]//li//descendant::div[@class='wM6W7d']"));
		System.out.println("No. of items=" + items.size());
		for(int i=0;i<items.size();i++) {
			System.out.println(items.get(i).getText());
			if(items.get(i).getText().equalsIgnoreCase("kanak")){
				items.get(i).click();
				break;
			}
		}
		//srcBox.sendKeys(Keys.ENTER);
		//String strTitle=driver.getTitle();
		//System.out.println("Page Title-" + strTitle );
		//System.out.println("Page URL"+ driver.getCurrentUrl() );
		//driver.navigate().back();
		//driver.navigate().forward();
		System.out.println("Page Title-" + driver.getTitle());
		//driver.navigate().to("https://the-internet.herokuapp.com/login");
	//driver.findElement(By.id("username")).sendKeys("tomsmith");
		//driver.findElement(By.xpath("//input[@name='username']")).sendKeys("tomsmith");
		//driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");
		//driver.findElement(By.xpath("//input[@name='password']")).sendKeys("SuperSecretPassword!");
//		driver.findElement(By.className("radius")).click();
//		driver.findElement(By.xpath("//button[@class='radius']")).click();
		
//		driver.close();
		
	}

}
