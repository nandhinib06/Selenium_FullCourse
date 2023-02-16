package com.lao.step_defn;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.lao.constants.constants;
import com.lao.utilities.Common_utils;
import com.lao.webdriver.DriverManager;

//import Log4j.BasicConfiguratorEx;
import io.cucumber.java.Before;

public class Browser_Common_Step_Defn {
	
	public static WebDriver driver;
	
	private static final Logger LOGGER = Logger.getLogger(Browser_Common_Step_Defn.class);
	
	
	@Before
	public void beforeScenario() {
		
		LOGGER.info("Execution Started");
		
		//Logger logger = Logger.getLogger(Browser_Common_Step_Defn.class);
		//logger.info("Log4j properties loaded");
		
		try {
			LOGGER.info("Loading Common Utilis");
			
			Common_utils common_Utils = new Common_utils();
			LOGGER.info("Loading the properties file");
			common_Utils.Loadproperties();
			LOGGER.info("Checking");
			
			if(driver==null) {
				LOGGER.info("Driver is Null");
				DriverManager.lanchBrowser();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}


	
	


