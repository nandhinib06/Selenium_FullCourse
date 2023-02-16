package com.lao.step_defn;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.base.CaseFormat;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class Common_step_defn {

	public static WebDriver driver;
	
	@Given("the user should see the chrome browser")
	public void the_user_should_see_the_chrome_browser() {
	    System.out.println("the user should see the chrome browser");
	}

	@When("the user lanch the browser using driver")
	public void the_user_lanch_the_browser_using_driver() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	
}