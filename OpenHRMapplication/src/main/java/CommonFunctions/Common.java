package CommonFunctions;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Common {
	public static Properties props;
	public static WebDriver driver;
	
	public void loadpropertyFile() throws IOException {
		
		FileInputStream fileinput = new FileInputStream("config.properties");
		props = new Properties();
		props.load(fileinput);
		return;
		}
   
	@BeforeSuite
	public void lanchBrowser() throws IOException {
	   
	      loadpropertyFile();
		String browser1 = props.getProperty("browser");
		String url1=props.getProperty("url");
		
		
		if(browser1.contentEquals("chrome")) {
			
			driver = new ChromeDriver();
		}
		else if(browser1.equals("firefox")) {
			
			driver= new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.get(url1);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
			}
	
@AfterSuite
	public void closeBrowser() {
	
		//driver.quit();
	}
}
