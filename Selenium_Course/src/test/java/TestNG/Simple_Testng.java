package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Simple_Testng {

	WebDriver driver;
	
	@BeforeTest
	public void lanchbrowser() {
		driver = new ChromeDriver();
		driver.get("https://www.leafground.com/window.xhtml");
	}
	
	@Test
	public void print() {
		System.out.println("Print");
	}
	
	@AfterTest
	public void closebrowser() {
		driver.quit();
	}
}
