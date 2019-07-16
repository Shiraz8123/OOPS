package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import TestBase.TestBase;



public class LoginPage extends TestBase {

	//Page Factory	

	@FindBy(id="login-input")
	WebElement userlogin;

	@FindBy(id="password-input")
	WebElement password;
	
	@FindBy(id="BSign")
	WebElement letmein;
	
	
	//Initializing the page objects
	public  LoginPage(){
		PageFactory.initElements(driver, this);
	}
	
	//Actions
	public String validateLoginPageTitle(){
		return driver.getTitle();
	}
	
	public PendingList LoginNew(String un,String pwd){
		userlogin.sendKeys(prop.getProperty("username"));
		password.sendKeys(prop.getProperty("password"));
		letmein.click();
		 return new PendingList();
	}
}