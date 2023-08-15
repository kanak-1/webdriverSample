package testScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShadowDOMTest {
public static void main(String[] args) {
	
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://watir.com/examples/shadow-dom.html");
	//shadowHost find -- driver.findElement
	//shadowHost.getshadowRoot();
	//for getting content is shadow DOM in shadow root -- shadowRoot.findElement -- can't find by using driver(no such element found exception)
	//http://demo.seleniumeasy.com/javascript-alert-box-demo.html -- for testing alerts
}
}
