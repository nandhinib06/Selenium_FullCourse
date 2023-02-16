package com.lao.step_defn;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.lao.Page_objects.LoginPage;
import com.lao.constants.constants;
import com.lao.webdriver.DriverManager;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class VerifyCEOName_step_defn {
	
	//public static WebDriver driver;

	private static final Logger LOGGER = Logger.getLogger(Browser_Common_Step_Defn.class);
	
	@Given("the user is logged in successfully and is on Home Page")
	public void the_user_is_logged_in_successfully_and_is_on_home_page() {
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\chromedriver_win32\\chromedriver.exe");
		//driver = new ChromeDriver();
		
		DriverManager.getDriver().get(constants.APP_URL);
		LoginPage.USERNAME.sendKeys(constants.UserName);
		LoginPage.PASSWORD.sendKeys(constants.Password);
		LoginPage.LOGIN_BUTTON.click();
		
		String url = DriverManager.getDriver().getCurrentUrl();
		
		if(url.contains("dashboard")) {
			LOGGER.info("the used logged in successfully and is on Home Page");
		}
	    System.out.println("the user is logged in successfully and is on Home Page");
	}

	@When("the user clicks on the directory option from the Menu bar")
	public void the_user_clicks_on_the_directory_option_from_the_menu_bar() {
	    System.out.println("the user clicks on the directory option from the Menu bar");
	}

	@When("the user selects the job title as {string} from the drop down")
	public void the_user_selects_the_job_title_as_from_the_drop_down(String string) {
	    System.out.println("the user selects the job title as {string} from the drop down");
	}

	@When("clicks the search button")
	public void clicks_the_search_button() {
	   System.out.println("clicks the search button");
	}

	@Then("the user should see the CEO names as {string}")
	public void the_user_should_see_the_ceo_names_as(String string) {
	   System.out.println("the user should see the CEO names as Smith");
	}
}
