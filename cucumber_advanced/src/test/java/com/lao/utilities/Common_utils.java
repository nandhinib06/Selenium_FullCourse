package com.lao.utilities;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import com.lao.constants.constants;

import io.cucumber.core.options.Constants;

public class Common_utils {

	
	 public void Loadproperties() throws FileNotFoundException {
		 
		 
		 Properties properties = new Properties();
		 try {
			properties.load(getClass().getResourceAsStream("/config.properties"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		 constants.APP_URL=properties.getProperty("App_URL");
		 constants.Browser=properties.getProperty("Browser");
		 constants.UserName=properties.getProperty("UserName");
		 constants.Password=properties.getProperty("Password");
		 constants.CHROME_DRIVER_LOCATION=properties.getProperty("CHROME_DRIVER_LOCATION");
		 constants.FIREFOX_DRIVER_LOCATION=properties.getProperty("FIREFOX_DRIVER_LOCATION");
		 constants.EDGE_DRIVER_LOCATION=properties.getProperty("EDGE_DRIVER_LOCATION");
		 
		
	}
}
