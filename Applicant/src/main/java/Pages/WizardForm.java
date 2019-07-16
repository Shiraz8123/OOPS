package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import TestBase.TestBase;

public class WizardForm extends TestBase {
	
    // Slip ID
	@FindBy (id="ctl_eslip_id")
	WebElement eslipID;
	
	@FindBy (id="ctl_eslip_id_2")
	WebElement eslipID2;
	
	//Proposed Insured Information
	@FindBy (id="ctl_insured_first_name")
	WebElement firstName;
	
	@FindBy (id="ctl_insured_last_name")
	WebElement lastName;
	
	@FindBy (id="ctl_insured_gender_id")
	WebElement gender;
	
	//DOB
	@FindBy (name="dt1_ctl_insured_dob")
	WebElement dd;
	
	
	@FindBy (name="dt2_ctl_insured_dob")
	WebElement mm;
	
	@FindBy (name="dt3_ctl_insured_dob")
	WebElement yyyy;
	
	//SSN
	@FindBy (name="ss1_ctl_insured_ssn")
	WebElement ssn3;
	
	@FindBy (name="ss2_ctl_insured_ssn")
	WebElement ssn2;
	
	@FindBy (name="ss3_ctl_insured_ssn")
	WebElement ssn4;
	
	//DriverLicense
	@FindBy (id="ctl_insured_driver_license_known_number")
	WebElement driverLicNo;
	
	@FindBy (name="ctl_insured_driver_license_known_state")
	WebElement driverLicstate;
	
	@FindBy (id="ctl_eslip_is_picture_verified_checkbox")
	WebElement picIDVerify;
	
	//Address
	@FindBy (id="ctl_eslip_insured_address")
	WebElement mailingAdd1;
	
	@FindBy (id="ctl_eslip_insured_city")
	WebElement city;
	
	@FindBy (name="ctl_eslip_insured_state")
	WebElement state;
	
	@FindBy (name="zi1_ctl_eslip_insured_zip")
	WebElement zip;
	
	//Mobile no
	@FindBy (name="ph1_ctl_eslip_insured_phone")
	WebElement phone3;
	
	@FindBy (name="ph2_ctl_eslip_insured_phone")
	WebElement phone3dig;
	
	@FindBy (name="ph3_ctl_eslip_insured_phone")
	WebElement phone4dig;
	
	@FindBy (name="ctl_eslip_insured_cell")
	WebElement cellularyes;
	
	@FindBy (name="ctl_eslip_insured_since_last_ate_drank")
	WebElement lastAte;
	
	// Date and time of specimen
	@FindBy (name="dt1_ctl_eslip_obtained_date")
	WebElement  spe_mm;
	
	@FindBy (name="dt2_ctl_eslip_obtained_date")
	WebElement  spe_dd;
	
	@FindBy (name="dt3_ctl_eslip_obtained_date")
	WebElement  spe_yyyy;
	
	@FindBy (name="ti1ctl_eslip_obtained_time")
	WebElement  spe_hours;
	
	@FindBy (name="dt2_ctl_eslip_obtained_date")
	WebElement  spe_minutes;
	
	@FindBy (id="ctl_eslip_obtained_time_am")
	WebElement  spe_am;
	
	//Blood Pressure
	@FindBy (name="ctl_examiner_measurements_grid_1st*1")
	WebElement  Systolic;
	
	@FindBy (name="ctl_examiner_measurements_grid_1st*2")
	WebElement  Diastolic;
	
	//Examiner/Collector Information
	@FindBy (name="ctl_eslip_examiner_company")
	WebElement  Exam_Company;
	
	@FindBy (name="ctl_eslip_examiner_full_name")
	WebElement  Examiner_Full_Name;
	
	@FindBy (name="ctl_examiner_phone_type_code")
	WebElement  Examiner_phoneType;
	
	@FindBy (name="ph1_ctl_examiner_phone")
	WebElement  Examiner_phone1;
	
	@FindBy (name="ph2_ctl_examiner_phone")
	WebElement  Examiner_phone2;
	
	@FindBy (name="ph3_ctl_examiner_phone")
	WebElement  Examiner_phone3;
	
	//Next button
	@FindBy (name="buttonNext")
	WebElement nextButton;
	
	//save and quit
	@FindBy (id="buttonFinish")
	WebElement SaveandQuit;
	
		
	
}
