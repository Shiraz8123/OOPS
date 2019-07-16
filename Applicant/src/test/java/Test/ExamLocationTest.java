package Test;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Pages.ExamLocation;
import Pages.LoginPage;
import Pages.PendingList;
import Pages.WizardForm;
import TestBase.TestBase;

public class ExamLocationTest extends TestBase {

	LoginPage loginPage;
	PendingList pendingList;
	ExamLocation examLocation;
	WizardForm wizardForm;
	
	
	public ExamLocationTest(){
		super();
	}
	
	
	
	@BeforeMethod
	public void setUp() throws InterruptedException {
		initilization();
		loginPage= new LoginPage();
		pendingList = new PendingList();
		examLocation = new ExamLocation();
		wizardForm = new WizardForm();
		pendingList= loginPage.LoginNew(prop.getProperty("username"),prop.getProperty("password"));
		examLocation=pendingList.createNewApp();
	}
	
	@Test(priority=1)
	public void locationDetails(){
		wizardForm =examLocation.ExamLocationConfirm();
		String title= examLocation.validateExamLocTitle();
		Assert.assertEquals(title, "Exam Location Confirmation Page");
	}
	
	@AfterMethod
    public void tearDown() {
		driver.quit();
	}
	
}
