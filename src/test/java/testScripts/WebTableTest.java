package testScripts;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.with;

import java.util.List;

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
		List<WebElement> empList=driver.findElements(By.xpath("//td[contains(text(),'San Francisco')]//preceding-sibling::td[2]"));
		System.out.println("No. of Employees working in San Francisco=" + empList.size());
		System.out.println("Name of Employee working in San Francisco:" );
		for(int i=0;i<empList.size();i++) {
			
			System.out.println(empList.get(i).getText());
		}
		

		//hidden element-- https://automationbookstore.dev/  -- isDisplayed()-- boolean type
	}

	
	}


