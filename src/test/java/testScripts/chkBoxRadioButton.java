package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class chkBoxRadioButton {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
//		driver.get("http://demo.seleniumeasy.com/basic-checkbox-demo.html");
//		WebElement chkbox1 = driver.findElement(By.xpath("(//input[@type='checkbox'])[2]"));
//		if(chkbox1.isSelected()) {
//			chkbox1.click();
//		}
//		WebElement chkbox2 = driver.findElement(By.xpath("(//input[@type='checkbox'])[3]"));
//		if(!chkbox2.isEnabled()) {
//			System.out.println("true");
//		}
//		WebElement chkBox = driver.findElement(By.xpath("(//input[@class='cb1-element'])[2]"));
//		if(!chkBox.isSelected()) {
//			chkBox.click();
//		}
		driver.get("http://demo.seleniumeasy.com/basic-radiobutton-demo.html");
		driver.findElement(By.xpath("(//input[@name='ageGroup'])[2]")).click();
		
	}

}
