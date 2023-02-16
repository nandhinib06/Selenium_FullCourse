package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Login_pom {

	@FindBy(name = "username")
	public static WebElement username;
	
	@FindBy(name = "password")
	public static WebElement password;
	
	@FindBy(xpath = "//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")
	public static WebElement Login_Btn;
	
}
