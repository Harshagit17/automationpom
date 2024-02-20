package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import basepackage.Base;

public class LoginPage extends Base {
	@FindBy(xpath="//input[@id='username']")
	WebElement username;

	@FindBy(xpath="//input[@id='password']")
	WebElement password;

	@FindBy(xpath="//button[@id='submit']")
	WebElement loginbtn;

	@FindBy(xpath="//div[@class='header-items'][2]")
	WebElement profile;





	public LoginPage() {
		PageFactory.initElements(driver, this );
	}


	public void username() {
		username.sendKeys(prop.getProperty("username"));
	}
	public void password() {
		password.sendKeys(prop.getProperty("password"));
	}
	public void loginbtn() {
		loginbtn.click();
	}
		
		public void verifyprofile() {
		System.out.println(profile.isDisplayed());

		}


	}
