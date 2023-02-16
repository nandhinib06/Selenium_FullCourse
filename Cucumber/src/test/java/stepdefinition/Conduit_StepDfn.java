package stepdefinition;


	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.support.PageFactory;

	import io.cucumber.java.en.Given;
	import io.cucumber.java.en.When;

	public class Conduit_StepDfn {
		
		public static WebDriver driver;
		
		@Given("I want to login the conducit website so sign in account")
		public void i_want_to_login_the_conducit_website_so_sign_in_account() {
		    // Write code here that turns the phrase above into concrete actions
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.get("https://candidatex:qa-is-cool@qa-task.backbasecloud.com");
			driver.manage().window().maximize();
		}

		@Given("enter the valid uername and password")
		public void enter_the_valid_uername_and_password() {
		    // Write code here that turns the phrase above into concrete actions
			driver.findElement(By.xpath("/html/body/app-root/app-layout-header/nav/div/ul/li[2]/a")).click();
			driver.findElement(By.xpath("/html/body/app-root/app-auth-page/div/div/div/div/form/fieldset/fieldset[2]/input")).sendKeys("naganandhini@fourbends.com");
			driver.findElement(By.xpath("/html/body/app-root/app-auth-page/div/div/div/div/form/fieldset/fieldset[3]/input")).sendKeys("Jasmine6");
			

		}

		@When("user click the login button")
		public void user_click_the_login_button() throws InterruptedException {
		    // Write code here that turns the phrase above into concrete actions
		    //throw new io.cucumber.java.PendingException();
			driver.findElement(By.xpath("/html/body/app-root/app-auth-page/div/div/div/div/form/fieldset/button")).click();
			Thread.sleep(5000);
		}

		@When("user should create the new article")
		public void user_should_create_the_new_article() {
		    // Write code here that turns the phrase above into concrete actions
		    driver.findElement(By.xpath("/html/body/app-root/app-layout-header/nav/div/ul/li[2]/a")).click();
		}

		@When("user click the article button")
		public void user_click_the_article_button() {
		    // Write code here that turns the phrase above into concrete actions
		    driver.findElement(By.xpath("/html/body/app-root/app-editor-page/div/div/div/div/form/fieldset/fieldset[1]/input")).sendKeys("Article");
		}

		@When("userenter article")
		public void userenter_article() {
		    // Write code here that turns the phrase above into concrete actions
		    driver.findElement(By.xpath("/html/body/app-root/app-editor-page/div/div/div/div/form/fieldset/fieldset[2]/input")).sendKeys("Description");
		}

		@When("user write about the article")
		public void user_write_about_the_article() {
		    // Write code here that turns the phrase above into concrete actions
		    driver.findElement(By.xpath("/html/body/app-root/app-editor-page/div/div/div/div/form/fieldset/fieldset[3]/textarea")).sendKeys("Free");
		    
		}

		@When("user write your article")
		public void user_write_your_article() {
		    // Write code here that turns the phrase above into concrete actions
		    driver.findElement(By.xpath("/html/body/app-root/app-editor-page/div/div/div/div/form/fieldset/fieldset[4]/input")).sendKeys("Art");
		}

		@When("click published button")
		public void click_published_button() {
		    // Write code here that turns the phrase above into concrete actions
		   driver.findElement(By.xpath("/html/body/app-root/app-editor-page/div/div/div/div/form/fieldset/button")).click();
		}
	}


