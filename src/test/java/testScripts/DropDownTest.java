package testScripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownTest {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://demo.seleniumeasy.com/basic-select-dropdown-demo.html");
	Select sigSel = new Select(driver.findElement(By.id("select-demo")));
	sigSel.selectByIndex(2);
	Select mulSel = new Select(driver.findElement(By.id("multi-select")));
	mulSel.selectByIndex(3);
	mulSel.selectByValue("Texas");
	mulSel.selectByVisibleText("Ohio");
// to find all elements in list-- 	mulSel.getOptions();
	List<WebElement> items = mulSel.getAllSelectedOptions();
	System.out.println("no. of items selected" + items.size());
	for(int i=0 ;i < items.size(); i++ ) {
		System.out.println(items.get(i).getText());
		
}
	mulSel.deselectByIndex(3);
	mulSel.deselectAll();
	
	//https://demo.opencart.com/ -- for mouse actions

}
}
