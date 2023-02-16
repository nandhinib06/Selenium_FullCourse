package com.lao.Page_objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
	

	@FindBy(name = "username")
	public static WebElement USERNAME;
	
	@FindBy(name = "password")
	public static WebElement PASSWORD;
	
	@FindBy(xpath = "//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")
	public static WebElement LOGIN_BUTTON;
	
	
	
}
