package Pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import TestBase.TestBase;
import Utilities.Util;

public class ExamLocation extends TestBase {

@FindBy(id="SignCity")
	WebElement signCity;
	
	@FindBy (id="SignState")
	WebElement state;
	
	@FindBy(id="SignSSN")
	WebElement  examID;
	
	@FindBy(id="IsPhotoValid")
	WebElement PhotoIdCheckbox;
	
	@FindBy (id="PictureID")
	WebElement driverlic;
	
	@FindBy (id="NextBtn")
	WebElement okBtn;
	
	public  ExamLocation(){
		PageFactory.initElements(driver, this);
	}
	
	
	public WizardForm ExamLocationConfirm(){
		signCity.sendKeys("Los Angeles");
		Util.dropdown();
		examID.sendKeys(prop.getProperty("Examiner_ID"));
		PhotoIdCheckbox.click();
		driverlic.sendKeys("4569852");
		okBtn.click();
		return  new WizardForm();
	}

	public String validateExamLocTitle(){
		return driver.getTitle();
	}
	
}