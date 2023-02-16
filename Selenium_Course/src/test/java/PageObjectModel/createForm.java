package PageObjectModel;

import javax.xml.xpath.XPath;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class createForm {
	
	public static void main(String[] args) {
	        
		createForm f = new createForm();
		f.DropDown1();
		}
	
	// login
	
		@FindBy (id = "user")
		public static WebElement username;
		
		@FindBy(id = "pass")
		public static WebElement password;
		
		@FindBy(className = "btn_log")
		public static WebElement login;
		
	//Create form
		@FindBy (xpath = "//*[@id=\"user_bar\"]/ul/li[2]/a")
		public static WebElement newwizard;
		
		@FindBy (xpath = "//*[@id=\"center_col\"]/form/div/input")
		public static WebElement startwizard;
		
	// form 1
		@FindBy (name = "formname")
		public static WebElement formname;
		
		@FindBy (id = "referrer")
		public static WebElement webaddress;
		
		@FindBy (id = "format")
		public static WebElement dropdown;
		

		private void DropDown1() {
			 Select drop = new Select(dropdown);
		      drop.selectByValue("0");
		}
		
		@FindBy (id = "empty")
		public static WebElement dropdown1;
		

		private void DropDown2() {
			 Select drop = new Select(dropdown1);
		      drop.selectByValue("0");
		}
		
		@FindBy(id =  "Submit")
		public static WebElement sub;
		
		// form 2  step 3
		
		// //*[@id="center_col"]/form/div[3]/label
		
		@FindBy (xpath = "//*[@id=\"center_col\"]/form/div[2]/input")
		public static WebElement emailSub;
		
		// step 4
		
		@FindBy (name = "autosub")
		public static WebElement subject;
		
		@FindBy (id = "autotext")
		public static WebElement autoresponse;
		
		// step 5
		
		@FindBy (id = "numquestions")
		public static WebElement numberofques;
		
		@FindBy(xpath  = "//*[@name='question[]']")
		public static WebElement qus_1;
		
		//@FindBy(name = "question[]" )
		//public static WebElement qus_2;
	
		//@FindBy(id = "question[]" )
		//public static WebElement qus_3;
		
		//@FindBy(className = "long_txt" )
		//public static WebElement qus_4;
		
		//@FindBy(xpath = "//*[@id=\"question[]\"]" )
		//public static WebElement qus_5;
		
	    @FindBy(name = "allowed")
	    public static WebElement characters;
	    
	    @FindBy (name = "initialvalue")
	    public static WebElement initialvalue;
	    
	    @FindBy (name = "mandatorycheck")
	    public static WebElement required;
	    
	    
		// step 7
	    @FindBy(id = "redirectpage")
	    public static WebElement url;
	    
	    // step 8
	    @FindBy (name = "font")
	    public static WebElement font;
	    
	    @FindBy (name = "fontcolor")
	    public static WebElement fontcolor;
	    
	    @FindBy (name = "fontsize")
	    public static WebElement fontsize;
	    
	    @FindBy (name = "bold")
	    public static WebElement bold;
	    
	    @FindBy (name = "italic")
	    public static WebElement italic;
	    
	    @FindBy (name = "underline")
	    public static WebElement underline;
	    
	    // step 10
	    
	    @FindBy (xpath = "//*[@id=\"center_col\"]/form/div[6]")
	    public static WebElement linkstyle;
	    
	    // step 12
	    @FindBy (name = "printbut")
	    public static WebElement printbutton;
	    
	    // step 13
	    
	    @FindBy (name = "sitecat")
	    public static WebElement sitecategory;
	    

		// logout
		
		@FindBy(xpath = "//*[@id=\"user_bar\"]/ul/li[1]/a" )
		public static WebElement logout;
		
		
		
}
