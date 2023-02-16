package Testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import PageObjectModel.createForm;
import PageObjectModel.stepbystep;

public class Conduit_flow {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","D:\\SeleniumTraining\\chromedriver_win32 (1)\\chromedriver.exe");
	     driver = new ChromeDriver();
        driver.get("https://candidatex:qa-is-cool@qa-task.backbasecloud.com/");
        
        PageFactory.initElements(driver, stepbystep.class);
        
        // sign up
        
        /*stepbystep.signup.click();
        stepbystep.username.sendKeys("Nandhini");
        stepbystep.email.sendKeys("naganandhini@fourbends.com");
        stepbystep.password.sendKeys("Jasmine6");
        stepbystep.signup_but.click();*/
        
        // sign in
        
        stepbystep.signin.click();
        stepbystep.emailadd.sendKeys("naganandhini@fourbends.com");
        stepbystep.pass_word.sendKeys("Jasmine6");
        stepbystep.signin_but.click();
        
     // new article
       
        //stepbystep.article1.
        Thread.sleep(5000);
        stepbystep.article.click();
        stepbystep.title.sendKeys("Management");
        stepbystep.sub.sendKeys("Marketing Management");
        stepbystep.content.sendKeys("A brand audit is a thorough examination of a brand's current position in an industry compared to its competitors and the examination of its effectiveness. ");
        stepbystep.tags.sendKeys("system management");
        stepbystep.publish.click();
        
        // Delete Article
        
        Thread.sleep(5000);
        stepbystep.delete.click();
        
        // sign out
        
        Thread.sleep(5000);
        stepbystep.user.click();
        
        Thread.sleep(5000);
        stepbystep.edit.click();
        stepbystep.logout_but.click();
        
	}

}
