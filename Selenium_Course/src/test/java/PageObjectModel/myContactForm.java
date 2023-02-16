package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class myContactForm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\SeleniumTraining\\chromedriver_win32 (1)\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
        driver.get("https://www.mycontactform.com/");
        
        PageFactory.initElements(driver, createForm.class);
        
        
     // login
		
        createForm.username.sendKeys("prabhu123");
        createForm.password.sendKeys("12345");
        createForm.login.click();
     		
     		
     	// create form
    		
        createForm.newwizard.click();
        createForm.startwizard.click();
        
        // form 1
        
        createForm.formname.sendKeys("!My Contact Form!");
        createForm.webaddress.sendKeys("www.google.co.in");
        createForm.dropdown.click();
        createForm.dropdown1.click();
        
        createForm.sub.click();
        
        // form 2
        
        createForm.sub.click();
        
        // form 3
        
        createForm.sub.click();
        
        // form 4- step 3
        
        createForm.emailSub.click();
        createForm.sub.click();
        
        // step 4
        createForm.sub.click();
        
        createForm.subject.sendKeys("Request for classes");
        createForm.autoresponse.sendKeys("Hi all");
        createForm.sub.click();
         
        // step 5
        createForm.sub.click();
        
        createForm.numberofques.sendKeys("1");
        createForm.sub.click();
        createForm.qus_1.sendKeys("Name");
        //createForm.qus_2.sendKeys("Age");
        //createForm.qus_3.sendKeys("Gender");
        //createForm.qus_4.sendKeys("Phone number");
        //createForm.qus_5.sendKeys("city");
        createForm.sub.click();
        
        createForm.characters.sendKeys("100");
        createForm.initialvalue.sendKeys("sdfghjkl");
        createForm.required.click();
        createForm.sub.click();
        
        // step 6
        createForm.sub.click();
        createForm.sub.click();
        // step 7
        createForm.url.sendKeys("www.gmail.com");
        createForm.sub.click();
        
        // step 8
        createForm.sub.click();
        
        createForm.font.sendKeys("Courier");
        createForm.fontcolor.sendKeys("#204020");
        createForm.fontsize.sendKeys("6");
        createForm.bold.click();
        createForm.italic.click();
        createForm.underline.click();
        createForm.sub.click();
        
        createForm.sub.click();
        
        // step 9
        createForm.sub.click();
        createForm.sub.click();
        createForm.sub.click();
        
        // step 10
        createForm.linkstyle.click();
        createForm.sub.click();
         
        // step 11
        createForm.sub.click();
        
        // step 12
        
        createForm.printbutton.click();
        createForm.sub.click();

        // step 13
        
        createForm.sitecategory.sendKeys("Art");
        createForm.sub.click();
        
        //logout
        createForm.logout.click();
	}

}
