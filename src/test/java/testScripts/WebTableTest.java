package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableTest {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.seleniumeasy.com/table-sort-search-demo.html");
		String strSalary = driver.findElement(By.xpath("//td[contains(text(),'Wagner')]//following-sibling::td[5]")).getText();
		System.out.println("Salary is "+ strSalary);
		String strAge = driver.findElement(By.xpath("//td[contains(text(),'Wagner')]//following-sibling::td[3]")).getText();
		System.out.println("Age is" + strAge);
	}

}
