package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import basepackage.Base;

public class Customerspage extends Base {

	/////////CustomerDetails
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]")
	WebElement customers;

	@FindBy(xpath="//*[@class='material-icons 28 md-dark ']")

	WebElement add;

	@FindBy(xpath="//input[@name='CustomerName']")
	WebElement customername;

	@FindBy(xpath="//input[@name='CustomerEmail']")
	WebElement customeremail;

	@FindBy(xpath="//input[@name='customerPhone']")
	WebElement customerphone;

	@FindBy(xpath="//input[@name='address1']")
	WebElement address1;

	@FindBy(xpath="//input[@name='address2']")
	WebElement address2;

	@FindBy(xpath="//input[@name='city']")
	WebElement city;

	@FindBy(xpath="//input[@name='state']")
	WebElement state;

	@FindBy(xpath="//input[@name='country']")
	WebElement country;

	@FindBy(xpath="//input[@name='zipcode']")
	WebElement zipcode;

	@FindBy(xpath="//input[@name='latitude']")
	WebElement latitude;

	@FindBy(xpath="//input[@name='longitude']")
	WebElement longitude;

	@FindBy(xpath="//input[@name='customerdomainname']")
	WebElement cdn;

	@FindBy(xpath="//button[@class='app-button app-secondary'][1]")
	WebElement addcustomerbtn;


	////////Users
	@FindBy(xpath="//*[@class='addUserBtn']")
	WebElement addusersbtn;

	@FindBy(xpath="//input[@name='firstName']")
	WebElement firstname;

	@FindBy(xpath="//input[@name='lastName']")
	WebElement lastname;

	@FindBy(xpath="//input[@name='emailTo']")
	WebElement email;

	@FindBy(xpath="//input[@name='phoneNo']")
	WebElement phonenumber;

	@FindBy(xpath="//*[@class='css-8mmkcg']")
	WebElement usertype;

	@FindBy(xpath="//*[@class='css-d7l1ni-option-0']")
	WebElement citizen;

	@FindBy(xpath="//input[@id='loginId']")
	WebElement userloginid;

	@FindBy(xpath="//input[@id='usrPswd']")
	WebElement userpswd;
	
	@FindBy(xpath="//*[@class=//*[@class='app-button app-secondary']")
	WebElement submituserbtn;



	public Customerspage() {
		PageFactory.initElements(driver, this);
	}



	////////////Customer details
	public void customers() {
		customers.click();
	}
	public void add() {
		add.click();
	}

	public void customername() {
		customername.sendKeys("customer1");
	}

	public void customeremail() {
		customeremail.sendKeys("customer1@gmail.com");

	}

	public void customerphone() {
		customerphone.sendKeys("9999988888");
	}

	public void address1() {
		address1.sendKeys("new123");
	}

	public void address2() {
		address2.sendKeys("new123");
	}

	public void city() {
		city.sendKeys("London");
	}

	public void state() {
		state.sendKeys("London");
	}

	public void country() {
		country.sendKeys("Unitedkingdom");
	}

	public void zipcode() {
		zipcode.sendKeys("88888");
	}

	public void latitude() {
		latitude.sendKeys("27.931782");
	}

	public void longitude() {
		longitude.sendKeys("82.72390221");
	}

	public void cdn() {
		cdn.sendKeys("customer1");
	}


	public void addcustomerbtn() throws InterruptedException {
		scrollToElement(addcustomerbtn);
		Thread.sleep(3000);
		addcustomerbtn.click();
	}

	private static void scrollToElement(WebElement addcustomerbtn) {
		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;

		// Use JavaScript to scroll to the element
		jsExecutor.executeScript("arguments[0].scrollIntoView(true);", addcustomerbtn);
	}


	////////Users


	public void adduserbtn() {
		addusersbtn.click();
	}

	public void firstname(String cfirstname) {
		firstname.sendKeys(cfirstname);
	}

	public void lastname() {
		lastname.sendKeys("Neo1");
	}

	public void email() {
		email.sendKeys("naveen@gmail.com");
	}

	public void phoneno() {
		phonenumber.sendKeys("8998998992");
	}
	public void usertye() {
		usertype.click();
	}

	public void citizen() {
		citizen.click();
	}
	public void userloginid() {
		userloginid.sendKeys("sensadmin1");
	}


	public void userpswd() {
		userpswd.sendKeys("sensadmin1");
	}
	
	public void submituserbtn() {
		submituserbtn.click();
	}




}
