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
	//driver.findElement(By.xpath("//button[@class='radius']")).click();
	//driver.findElement(By.xpath("//i[@class='fa fa-2x fa-sign-in']")).click(); //used for compound class9having more than 1 class0
	driver.findElement(By.cssSelector(".fa.fa-2x.fa-sign-in")).click();
	//driver.findElement(By.linkText("Elemental Selenium")).click();
	//driver.findElement(By.partialLinkText("Selenium")).click();
	//Absolute xpath of user name input field=/html/body/div[2]/div/div/form/div[1]/div/input
	// Absolute xpath of button =/html/body/div[2]/div/div/form/button/i
	//https://www.lambdatest.com/blog/ 
	//indexing in xpath (//div[@class='dropdown rs-dropdown dropdown_blog item_link'])[3]
	//static xpath- have attributes
	//dynamic xpath - elements loaded dynamically not having fixed attributes but have displayed text
	//used methods (contains,text,start-with) and axes method
	//contains method- //p[contains(text(),'Please enter a desired password')]
	//contains can be used with substring - //p[contains(text(),'password')]
	//contains method can be used with indexing -- (//a[contains(text(),'Mobile App Testing')])[3]
	//text method-we have to enter entire text of element- //p[text()='Please enter a desired password']
	//starts-with method-- for e.g. products having multiple items(item id starting with product id
	//start-with ul(unordered list) and use index to loacte particular item
	//-- (//ul[@id='menu-side-menu']//li[starts-with(@id,'menu-item-')])[10]
	
	//axes method - tree structure of DOM -- parent-child-- we use relative position to find the element
	//such as following,preceding,parent,child, ancestor,descendant,sibling
	//https://www.globalsqa.com/samplepagetest/
	//following :-
	//e.g- //input[@id='g2599-name']//following::input[8]
	//preceding :-
	//e.g.- //textarea[@name='g2599-comment']//preceding::input[5] -- in preceding index goes in reverse order
	//following-sibling or preceding-sibling method :-
	//e.g.of following-sibling-- //ul[@id='menu-side-menu']//li[@id='menu-item-1423']//following-sibling::li[5]
	//e.g. of preceding sibling-- //ul[@id='menu-side-menu']//li[@id='menu-item-1423']//preceding-sibling::li[2]
	//ancestor (parent, grand parent, great grand parent and descendant(child,grand child)
	//ancestor e.g.-- //ul[@id='menu-side-menu']//li[@id='menu-item-1423']//ancestor::div
	//descendant e.g.-- 
	
	//CSS Selector-- combination of attributes -- https://www.w3schools.com/cssref/css_selectors.php
	//In CSS, selectors are patterns used to select the element(s) you want to style.
	//by using only class name - preceeds with . -- .radius
	// compund class-- every single class preceeds with .
	// tag+class name -- button.radius
	//tag & id -- id must be preceed with # -- div#bs-example-navbar-collapse-1
	//tag & attribute -- input[placeholder="Business Email*"]
	//select using substring --* symbol -- input[placeholder*="Email*"]
	//starting with  --^ symbol -- input[placeholder^="Business"]
	//https://www.lambdatest.com/blog/ 
	//navigation bar- direct child -- nav div.header__menu__items> div:nth-child(2)
	//direct child of list -- ul.header-icon li>a.item_hover
	//ul.nav li:nth-child(2) -- selecting direct child of li
}
}
