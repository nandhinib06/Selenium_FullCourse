package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class suitexample {
	WebDriver driver;
	long startTime;
	long endTime;
	
	@BeforeSuite
	public void lanchBrower(){
		startTime = System.currentTimeMillis();
		System.setProperty("webdriver.chrome.driver","D:\\SeleniumTraining\\chromedriver_win32 (1)\\chromedriver.exe");
	     driver = new ChromeDriver();
	     
	}
	@Test
	public void openGoogle() {
		
		driver.get("https://www.google.co.in/");
	}
	@Test
    public void openBing() {
		
		driver.get("https://www.bing.com/");
	}
	@Test
    public void openYahoo() {
	
	driver.get("https://in.search.yahoo.com/?fr2=inr");
}
    @AfterSuite
    public void closeBrowser() {
    	driver.quit();
    	endTime = System.currentTimeMillis();
    	long totalTime = endTime - startTime;
    	System.out.println("Total time taken = "+totalTime);
    	
    }
	
}
