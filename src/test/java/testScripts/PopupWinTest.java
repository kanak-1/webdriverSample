package testScripts;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class PopupWinTest {
public static void main(String[] args) {
//	ChromeOptions options=new ChromeOptions();
//	options.addArguments("--remote-allow-origins=*");
	// WebDriver driver=new ChromeDriver(options);
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://stqatools.com/demo/Windows.php");
	String parentWin = driver.getWindowHandle();
	System.out.println("Parent window is" + parentWin);
	driver.findElement(By.xpath("//button[contains(text(),'new Tab')]")).click();
	Set<String> wins =driver.getWindowHandles();
	System.out.println("Windows size" + wins.size());
	for(String tabs : wins) {
		System.out.println(tabs);
		if(!tabs.equalsIgnoreCase(parentWin)) {
			driver.switchTo().window(tabs);
			
			driver.findElement(By.xpath("(//span[contains(text(),'Java')])[1]")).click();
					
		}
		}
	driver.close();
	driver.switchTo().window(parentWin);
	driver.findElement(By.xpath("//button[contains(text(),'new Window ')]")).click();
	//driver.close();
	//driver.quit();
	//driver.switchTo().newWindow(WindowType.TAB); //opens in new tab
	driver.switchTo().newWindow(WindowType.WINDOW); // opens in new window
	driver.get("https://www.selenium.dev/blog/");
	driver.quit();	
	
	
}
}
