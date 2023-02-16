package Testcases;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import CommonFunctions.Common;
import PageObjects.DashBoard_pom;
import PageObjects.Login_pom;
import dev.failsafe.internal.util.Assert;

public class Test_TodayLeave extends Common {
	String ActualMessage;
	public void login() {
		
		PageFactory.initElements(driver, Login_pom.class);
		Login_pom.username.sendKeys(props.getProperty("username"));
		Login_pom.password.sendKeys(props.getProperty("password"));
		Login_pom.Login_Btn.click();
	}
	
	public void getEmployeesOnLeaveToday() {
		PageFactory.initElements(driver, DashBoard_pom.class);
		ActualMessage=DashBoard_pom.EmployeesOnLeave.getText();
	}
	
@Test
public void verifyEmployeeOnLeaveToday() {
	
	login();
	getEmployeesOnLeaveToday();
	assertEquals(ActualMessage, "No Employees are on Leave Today");
	
} 

}
