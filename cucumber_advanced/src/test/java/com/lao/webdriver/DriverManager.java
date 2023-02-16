package com.lao.webdriver;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.lao.constants.constants;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverManager {
	
	private static final Logger LOGGER = LogManager.getLogger(DriverManager.class);

	private static WebDriver driver = null;
	
public static void lanchBrowser() { 
		
		try {
			
			switch (constants.Browser) {
			case "chrome":
				WebDriverManager.chromedriver().setup();
				LOGGER.info("Lanching" +constants.Browser);
				driver = new ChromeDriver();
				break;
			case "firefox":
				WebDriverManager.firefoxdriver().setup();
				LOGGER.info("Lanching" +constants.Browser);
				driver = new ChromeDriver();
				break;
			case "ie":
				WebDriverManager.iedriver().setup();
				LOGGER.info("Lanching" +constants.Browser);
				driver = new ChromeDriver();
				break;
				

			default:
				WebDriverManager.chromedriver().setup();
				LOGGER.info("Lanching" +constants.Browser);
				driver = new ChromeDriver();
				break;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

public static WebDriver getDriver() {
	return driver;
} 
		
	
}
