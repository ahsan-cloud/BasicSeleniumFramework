package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseClass;
import pages.LoginPage;

public class LoginTest extends BaseClass {
	
	@Test
	public void testValidLogin() {
		
		LoginPage loginPage = new LoginPage(driver);
		
		loginPage.enterUsername("Admin");
		loginPage.enterPassword("admin123");
		loginPage.clickLogin();
		//loginPage.clickForgotPassword();
		
		System.out.println("The Title of the page is : "+driver.getTitle());
		Assert.assertEquals(driver.getTitle(), "OrangeHRM");
	}

}
