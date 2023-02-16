package stepdefinition;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;


public class DataTablewithoutheaderStepDefn {
	WebDriver driver;
	
	@Given("You Open the URL oh HRM")
	public void the_user_opens_the_orange_hrm_url() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		System.setProperty("webdriver.chrome.driver", "D:\\SeleniumTraining\\chromedriver_win32 (1)\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}
	
	@When("You enter the valid credentials")
	public void use_this_credentials(DataTable dataTable) throws Throwable {
		
	
		List<String> credentials = dataTable.asList(String.class);
		String username = credentials.get(0);
		String password = credentials.get(1);
		Thread.sleep(6000);
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(username);
		//System.out.println("Good");
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input")).sendKeys(password);
		
	}
	
	@When("you click login button")
	public void click_the_signin_button() throws Throwable {
		
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
 
	}
	
}
