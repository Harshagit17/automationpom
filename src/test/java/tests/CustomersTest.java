package tests;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import basepackage.Base;
import pages.Customerspage;

public class CustomersTest extends Base {
	Customerspage cp;
	LoginTest lt;

	@BeforeTest
	public void setup() {
		initialization();
	}


	@AfterTest
	public void teardown() {
		driver.quit();
	}

	@Test(priority=0)
	public void customerdetails() throws InterruptedException {
		lt = new LoginTest();
		cp = new Customerspage();
		lt.login();
		Thread.sleep(3000);
		cp.customers();
		Thread.sleep(3000);
		cp.add();
		cp.customername();
		cp.customeremail();
		cp.customerphone();
		cp.address1();
		cp.address2();
		cp.city();
		cp.state();
		cp.country();
		cp.zipcode();
		cp.latitude();
		cp.longitude();
		cp.cdn();
		cp.addcustomerbtn();
		Thread.sleep(3000);
	}


	@Test(priority=1)
	public void users() throws InterruptedException {
		cp.adduserbtn();
		cp.firstname("neo");
		cp.lastname();
		cp.email();
		cp.phoneno();
		cp.usertye();
		Thread.sleep(3000);
		cp.citizen();
		cp.userloginid();
		cp.userpswd();
		cp.submituserbtn();
		Thread.sleep(3000);
		
		

	}

}
