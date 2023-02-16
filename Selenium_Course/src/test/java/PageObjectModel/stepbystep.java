package PageObjectModel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class stepbystep {

		// sign up
		
		/*@FindBy(xpath = "//*[@routerlink='/register']")
		public static WebElement signup;
		
		@FindBy(xpath = "/html/body/app-root/app-auth-page/div/div/div/div/form/fieldset/fieldset[1]/input")
		public static WebElement username;
		
		@FindBy(xpath = "/html/body/app-root/app-auth-page/div/div/div/div/form/fieldset/fieldset[2]/input")
		public static WebElement email;
		
		@FindBy(xpath = "/html/body/app-root/app-auth-page/div/div/div/div/form/fieldset/fieldset[3]/input")
		public static WebElement password;
		
		@FindBy(xpath = "/html/body/app-root/app-auth-page/div/div/div/div/form/fieldset/button")
		public static WebElement signup_but;*/
	
	    // sign in
	
	    @FindBy(xpath = "//*[@routerlink='/login']")
	    public static WebElement signin;
	    
	    @FindBy(xpath = "//*[@formcontrolname='email']")
	    public static WebElement emailadd;
	    
	    @FindBy(xpath = "//*[@formcontrolname='password']")
	    public static WebElement pass_word;
	    
	    @FindBy(xpath = "//*[@type='submit']")
	    public static WebElement signin_but;
	    
	    // new article
	    
	    //Actions actions = new Actions(driver);
	   // @FindBy(xpath = "//a[@routerlink='/editor']" )
		//public static WebElement article1;
		
	    @FindBy (xpath = "//a[@routerlink='/editor']" )
		public static WebElement article;
		
		@FindBy (xpath = "/html/body/app-root/app-editor-page/div/div/div/div/form/fieldset/fieldset[1]/input" )
		public static WebElement title;
			
		@FindBy (xpath = "/html/body/app-root/app-editor-page/div/div/div/div/form/fieldset/fieldset[2]/input" )
		public static WebElement sub;
		
		@FindBy (xpath = "/html/body/app-root/app-editor-page/div/div/div/div/form/fieldset/fieldset[3]/textarea" )
		public static WebElement content;
		
		@FindBy (xpath = "/html/body/app-root/app-editor-page/div/div/div/div/form/fieldset/fieldset[4]/input" )
		public static WebElement tags;
		
		@FindBy (xpath = "/html/body/app-root/app-editor-page/div/div/div/div/form/fieldset/button" )
		public static WebElement publish;
		
		// Delete Article
		
		@FindBy(xpath = "/html/body/app-root/app-article-page/div/div[1]/div/app-article-meta/div/span[1]/button")
		public static WebElement delete;
		
		// sign out
		
		@FindBy(xpath = "/html/body/app-root/app-layout-header/nav/div/ul/li[4]/a")
		public static WebElement user;
		
		@FindBy(xpath = "/html/body/app-root/app-profile-page/div/div[1]/div/div/div/a")
		public static WebElement edit;
		
		@FindBy(xpath = "/html/body/app-root/app-settings-page/div/div/div/div/button")
		public static WebElement logout_but;
			
	}


