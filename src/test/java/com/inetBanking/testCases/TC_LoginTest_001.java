package com.inetBanking.testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.inetBanking.pageObjects.LoginPage;

//import com.inetBanking.pageObjects.BaseClass;

public class TC_LoginTest_001 extends BaseClass
{
	@Test
	public void loginTest()
	{
		driver.get(baseURL);
		LoginPage lp = new LoginPage(driver);
		lp.setUserName(username);
		lp.setPassword(password);
		lp.clickSubmit();
		
		if (driver.getTitle().equals("Welcome To Manager's Page of Guru99 Bank"))
				{
			
			Assert.assertTrue(true);
				}
				else
					
		{
			Assert.assertTrue(false);
			}
		
		
	}
	
	

}
