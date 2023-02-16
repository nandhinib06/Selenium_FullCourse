package Testcases;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import CommonFunctions.Common;
import PageObjects.Admin_pom;

public class Test_UserDetail extends Common{
	
	public void movetoAdmin() {
		
		Admin_pom.AdminLink.click();
	}
	
	public void SelectRole() {
		Admin_pom.userRole.click();
		Admin_pom.userAdmin.click();
	
	}
	
	public void SelectStatus() {
		Admin_pom.userStatus.click();
		Admin_pom.selectStatus.click();
	}
	 
	@Test
	public void checkUserRole() {
		
		PageFactory.initElements(driver, Admin_pom.class);
		movetoAdmin();
		SelectRole();
     	SelectStatus();
		Admin_pom.search_btn.click();  
		String ActualRole = Admin_pom.userRoleValue.getText();
		String ActualStatus = Admin_pom.userStatusValue.getText();
		
		Assert.assertEquals(ActualRole, "Admin");
		Assert.assertEquals(ActualStatus, "Enabled");
		
	}
	
}
