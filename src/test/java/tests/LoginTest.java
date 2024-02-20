package tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import basepackage.Base;
import pages.LoginPage;

public class LoginTest extends Base{

	LoginPage lp;

	@BeforeMethod
	public void setup() {
		initialization();
	}


	@AfterMethod
	public void teardown() {
		driver.quit();
	}


	@Test
	public void login() {
		lp = new LoginPage();
		lp.username();
		lp.password();
		lp.loginbtn();
		lp.verifyprofile();
	}


}
