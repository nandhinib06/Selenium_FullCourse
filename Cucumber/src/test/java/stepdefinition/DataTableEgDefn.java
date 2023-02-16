package stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class DataTableEgDefn {
	WebDriver driver;
	
	@Given("Go to URL")
	public void go_to_url() {
		System.setProperty("webdriver.chrome.driver", "D:\\SeleniumTraining\\chromedriver_win32 (1)\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}
	@When("enter {string} and {string}")
	public void enter_and(String username, String password) throws InterruptedException {
		Thread.sleep(6000);
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(username);
		System.out.println("Good");
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input")).sendKeys(password);
		
	}
	@When("click login")
	public void click_login() {
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
	}

	
}
