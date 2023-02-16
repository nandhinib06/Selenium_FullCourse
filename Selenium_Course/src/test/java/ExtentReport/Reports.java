package ExtentReport;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;


public class Reports {
	
		long startTime;
		WebDriver driver;
		ExtentReports extentReport;
		ExtentHtmlReporter htmlReport;
		ExtentTest testcase;
		
		
		@Test
		public void openGoogle() throws IOException  {
		
		driver.get("https://www.google.co.in/");
		testcase = extentReport.createTest("Verify the open google");
		String title = driver.getTitle();
		
		if(title.equals("Google")) {
			testcase.log(Status.PASS, "Actual title and expected title are equal");
			System.out.println("Passed");
		}else {
			testcase.log(Status.FAIL, "Actual title and expected title are not equal");
			System.out.println("Failed google");
			TakesScreenshot screenshot = (TakesScreenshot) driver;
		     File soureFile=screenshot.getScreenshotAs(OutputType.FILE);
		     File destinationFile=new File("D:\\ss1.png");
		     FileHandler.copy(soureFile, destinationFile);
			//System.out.println("Failed");
		}
		
	}
		@Test
		public void openBing() throws IOException  {
					
			driver.get("https://www.bing.com/");
			testcase = extentReport.createTest("Verify the open bing");
			String title = driver.getTitle();
			
			if(title.equals("bing")) {
				testcase.log(Status.PASS, "Actual title and expected title are equal");
				System.out.println("Passed");
			}else {
				testcase.log(Status.FAIL, "Actual title and expected title are not equal");
				System.out.println("Failed bing");
				TakesScreenshot screenshot = (TakesScreenshot) driver;
			     File soureFile=screenshot.getScreenshotAs(OutputType.FILE);
			     File destinationFile=new File("D:\\ss2.png");
			     FileHandler.copy(soureFile, destinationFile);
				//System.out.println("Failed");
			}
				
		}
		@Test
		public void openYahoo() throws IOException {
			
			driver.get("https://in.search.yahoo.com/?fr2=inr");
			testcase = extentReport.createTest("Verify the open yahoo");
			
			String title = driver.getTitle();
			if(title.equals("yahoo")) {
				testcase.log(Status.PASS, "Actual title and expected title are equal");
				System.out.println("Passed");
			}else {
				testcase.log(Status.FAIL, "Actual title and expected title are not equal");
				System.out.println("Failed yahoo");
				TakesScreenshot screenshot = (TakesScreenshot) driver;
			     File soureFile=screenshot.getScreenshotAs(OutputType.FILE);
			     File destinationFile=new File("D:\\ss3.png");
			     FileHandler.copy(soureFile, destinationFile);
				//System.out.println("Failed");
			}
			
		}
		
		@BeforeSuite
		public void openBrowser() {
			
			extentReport = new ExtentReports();
			htmlReport = new ExtentHtmlReporter("Extentreport.html");
			extentReport.attachReporter(htmlReport);
			
			startTime = System.currentTimeMillis();
			System.out.println("Start time taken"+startTime);
			
			driver= new ChromeDriver();
			
		}
		
		@AfterSuite
		public void closeBrowse() {
			
	       long endTime = System.currentTimeMillis();
		   long totalTime = endTime-startTime;
		   
		   System.out.println("Total time taken"+ totalTime);
			driver.quit();
			extentReport.flush();
			
		}
		
	}
