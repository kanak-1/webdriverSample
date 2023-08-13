package testScripts;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class WebTableTest {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.seleniumeasy.com/table-sort-search-demo.html");
		String strSalary = driver.findElement(By.xpath("//td[contains(text(),'Wagner')]//following-sibling::td[5]")).getText();
		System.out.println("Salary is "+ strSalary);
		String strAge = driver.findElement(By.xpath("//td[contains(text(),'Wagner')]//following-sibling::td[3]")).getText();
		System.out.println("Age is" + strAge);
		
		String position =driver.findElement(with(By.tagName("td"))
				.toRightOf(By.xpath("//td[contains(text(),'Wagner')]")))
				.getText();
		System.out.println("Position is" + position);
		//driver.findElement(with(By.tagName("td")).toLeftOf(By.xpath("//td[contains(text(),'B.Wagner')]"))).getText();
				

		
		//hidden element-- https://automationbookstore.dev/  -- isDisplayed()-- boolean type
	}

	
	}


