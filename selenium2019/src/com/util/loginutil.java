package com.util;

import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;




public class loginutil {
	  public static WebDriver driver;
	  public static String baseUrl;
	@BeforeClass
	  public void setUp() throws Exception {
		//  System.setProperty("webdriver.chrome.driver", "./tools/chromedriver.exe");
	   // driver = new ChromeDriver();
		  DesiredCapabilities a=DesiredCapabilities.chrome();
		  WebDriver driver=new RemoteWebDriver(new URL("http://192.168.1.104:4444/wd/hub"),a);
	   
		  baseUrl = "http://localhost:8080/examsys/index.thtml";
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  }  
	  @AfterClass
	  public void tearDown() throws Exception {
		  // driver.quit(); 
	  }
}
