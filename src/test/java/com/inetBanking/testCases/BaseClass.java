package com.inetBanking.testCases;
//import org.apache.log4j.PropertyConfigurator;
//import org.apache.logging.log4j.Logger;
//import org.apache.logging.log4j.core.config.properties.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
//import org.testng.log4testng.Logger;
//import org.testng.log4testng.Logger;



public class BaseClass {
	
	public String baseURL="https://demo.guru99.com/v4/index.php";
	public String username ="mngr522274";
	public String password ="tYtAhAz";
	public static WebDriver driver;
	//public static Logger logger;
	
	@BeforeClass
	public void setup()
	{
		
		
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//Drivers//chromedriver.exe");
		driver = new ChromeDriver();
	   //  logger=Logger.getLogger("ebanking");
	
		//	PropertyConfigurator.configure("Log4j.properties");
			
	}
	
	@AfterClass
	
	public void tearDown()
	{
		driver.quit();
	}
	
	
	
	

}
