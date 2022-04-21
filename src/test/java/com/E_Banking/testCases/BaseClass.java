package com.E_Banking.testCases;

import java.util.HashMap;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass {
	public String baseurl="https://www.irctc.co.in";
	public static  WebDriver driver;
	public String DriverPath="C:\\CWH\\JAva\\Selinume\\E_Banking\\Drivers\\chromedriver.exe";
	
		
	
	@BeforeClass
	public void setup() {
		// handeled notification popup
		ChromeOptions options= new ChromeOptions();
        HashMap<String,Integer> contentSetting= new HashMap<String,Integer>();
        HashMap <String,Object> profile =new HashMap<String, Object>();
        HashMap <String,Object> prefs =new HashMap<String, Object>();
        contentSetting.put("notifications",1);  //0= Ask | 1= Allow | 2 = block
        profile.put("managed_default_content_settings",contentSetting);
        prefs.put("profile",profile);
        options.setExperimentalOption("prefs",prefs);
        // Handling Popup Notification end
		
		System.setProperty("webdriver.chrome.driver", DriverPath);
		driver =new ChromeDriver();
	}

	@AfterClass
	public void tearDown() {
		driver.quit();
	}
}
