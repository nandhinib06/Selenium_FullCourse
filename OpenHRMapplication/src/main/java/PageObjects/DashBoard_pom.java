package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DashBoard_pom {


	@FindBy(xpath ="//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[5]/div/div[2]/div/p")
	public static WebElement EmployeesOnLeave;
	
	 
}
