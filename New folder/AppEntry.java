package com.axa.nba.business;

import java.util.Enumeration;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.axa.generic.common.DateFormats;
import com.axa.generic.common.OrderedHashtable;
import com.axa.generic.common.StringFormats;
import com.axa.generic.common.WebControlOperations;
import com.axa.generic.reporter.ReportGenerator;
import com.axa.nba.driver.DriverScript;
import com.axa.nba.driver.GlobalData;

/**
* <dl>
* <dt><em>Script Name:</dt></em>     <dd>AppEntry</dd>
* <dt><em>Description:</dt></em>     <dd>Business flow of NBA Application</dd>
* <dt><em>Author     :</dt></em>     <dd>Capgemini</dd>
* <dt><em>Generated on:</dt></em>     <dd>29-Jul-2016</dd>               
* <dt><em>History</dt></em>
* <pre>Modified By                      Modified Date                   Comments</pre>
*           </dl>
*/
@SuppressWarnings("rawtypes")
public class AppEntry extends WebControlOperations {
	static String currentScreen = "";
	static String applicationRegion = "";
	static String LAST_NAME = "";
	static String FIRST_NAME = "";
	static String strErrorMessage = "No Images to display";
	static String Premium_Value = "";
	static String REG_DATE = "";
	static String Req_Form = "";
	static String strceasedate= "";
	static String MIPAmount= "";
	
	public static boolean navigateScreens(String screenName, OrderedHashtable objTestData, String browserType, String appRegion) {
		boolean blnStatus = false;
		currentScreen = screenName;
		applicationRegion = appRegion;
				
		switch(screenName) {
			case "Login":
				blnStatus = Login(objTestData, browserType, appRegion);
				break;
			case "WorkItemsActions":
				blnStatus = WorkItemsActions(objTestData);
				break;
				
			case "SearchWorkItems":
				blnStatus = SearchWorkItems(objTestData);
				break;
			case "IndexApplication":
				blnStatus = IndexApplication(objTestData);
				break;	
			case "IndexProducerSearch":
				blnStatus = IndexProducerSearch(objTestData);
				break;
			case "IndexSelectProducer":
				blnStatus = IndexSelectProducer(objTestData);
				break;
			case "ContractApprove":
				blnStatus = ContractApprove(objTestData);
				break;
			case "IndexMiscellaneousMail":
				blnStatus = IndexMiscellaneousMail(objTestData);
				break;
			case "AppInsuredInfo":
				blnStatus = AppInsuredInfo(objTestData);
				break;
			case "BeneficiaryDetails":
				blnStatus = BeneficiaryDetails(objTestData);
				break;
			case "NavigateMenuTabs":
				blnStatus = NavigateMenuTabs(objTestData);
				break;
			case "InsuredInfoA2":
				blnStatus = InsuredInfoA2(objTestData);
				break;
			case "PersonalDetails":
				blnStatus = PersonalDetails(objTestData);
				break;
			case "BusinessDetails":
				blnStatus = BusinessDetails(objTestData);
				break;
			case "UWNIGO_RESOLVE":
				blnStatus = UWNIGO_RESOLVE(objTestData);
				break;
			
			case "UnderwriterRequirements":
				blnStatus = UnderwriterRequirements();
				break;
			
			case "ContractMessages":
				blnStatus = ContractMessages();
				break;
			case "UnderwriterReInsurance":
				blnStatus = UnderwriterReInsurance(objTestData);
				break;
			case "SetContractReinsurance":
				blnStatus = SetContractReinsurance(objTestData);
				break;
			case "InsuredInfoA3":
				blnStatus = InsuredInfoA3(objTestData);
				break;
			case "TobaccoUsageFillInfo":
				blnStatus = TobaccoUsageFillInfo(objTestData);
				break;
			case "InsuredInfoA4ToA5":
				blnStatus = InsuredInfoA4ToA5(objTestData);
				break;
				
			case "Amendment":
				blnStatus = Amendment(objTestData);
				break;
			
			case "SingnaturesTIA":
				blnStatus = SingnaturesTIA(objTestData);
				break;
			case "FPCertNonVar":
				blnStatus = FPCertNonVar(objTestData);
				break;
			case "CommInfoSelectProducer":
				blnStatus = CommInfoSelectProducer(objTestData);
				break;
			case "FPCertVariable":
				blnStatus = FPCertVariable(objTestData);
				break;
			case "Products":
				blnStatus = Products(objTestData);
				break;
			case "ProductAllotment":
				blnStatus = ProductAllotment(objTestData);
				break;
			case "VerifyContract":
				blnStatus = VerifyContract(objTestData);
				break;
			case "Suitability":
				blnStatus = Suitability(objTestData);
				break;
			case "AutomaticTransferService":
				blnStatus = AutomaticTransferService(objTestData);
				break;
			case "ElectronicPayments":
				blnStatus = ElectronicPayments(objTestData);
				break;
			case "HIPAAJI":
				blnStatus = HIPAAJI(objTestData);
				break;
			case "Owner":
				blnStatus = Owner(objTestData);
				break;
			case "OwnerEOS":
				blnStatus = OwnerEOS(objTestData);
				break;
			case "OwnerIndividual":
				blnStatus = OwnerIndividual(objTestData);
				break;
			case "OwnerIncome":
				blnStatus = OwnerIncome(objTestData);
				break;
			case "OwnerPersonalDetails":
				blnStatus = OwnerPersonalDetails(objTestData);
				break;
			case "OwnerBusinessDetails":
				blnStatus = OwnerBusinessDetails(objTestData);
				break;
			case "OwnerSourceOfFunds":
				blnStatus = OwnerSourceOfFunds(objTestData);
				break;
			case "OwnerOtherInsurance":
				blnStatus = OwnerOtherInsurance(objTestData);
				break;
			case "OwnerFATCA":
				blnStatus = OwnerFATCA(objTestData);
				break;
			case "EntityOwnershipSupplement":
				blnStatus = EntityOwnershipSupplement(objTestData);
				break;
			case "MedicalPI":
				blnStatus = MedicalPI(objTestData);
				break;
			case "MedicalJI":
				blnStatus = MedicalJI(objTestData);
				break;
			case "ForeignTravelPI":
				blnStatus = ForeignTravelPI(objTestData);
				break;
			case "ForeignTravelJI":
				blnStatus = ForeignTravelJI(objTestData);
				break;
			case "Financial":
				blnStatus = Financial(objTestData);
				break;
			case "LTC":
				blnStatus = LTC(objTestData);
				break;
			case "LTCCAState":
				blnStatus = LTCCAState(objTestData);
				break;
				
			case"LTCFLState":
				blnStatus = LTCFLState(objTestData);
				break;
			case "CTIR":
				blnStatus = CTIR(objTestData);
				break;
			case "ReplacementNY":
				blnStatus = ReplacementNY(objTestData);
				break;
			case "TCPO":
				blnStatus = TCPO(objTestData);
				break;
			case "TermConversionOPAI":
				blnStatus = TermConversionOPAI(objTestData);
				break;
			case "ProposedInsured2":
				blnStatus = ProposedInsured2(objTestData);
				break;
			case "HIPAAPI":
				blnStatus = HIPAAPI(objTestData);
				break;
			case "TemporaryExpressCommissions":
				blnStatus = TemporaryExpressCommissions(objTestData);
				break;
			case "ProductsISWL":
				blnStatus = ProductsISWL(objTestData);
				break;
			case"ProductsIL":
				blnStatus = ProductsIL(objTestData);
				break;
			case "ProductsTERM":
				blnStatus = ProductsTERM(objTestData);
				break;
			case "ProductsASUL":
				blnStatus = ProductsASUL(objTestData);
				break;
			case "ProductsSILLegacy":
				blnStatus = ProductsSILLegacy(objTestData);
				break;	
			case "TobaccoUsageFillInfoP2":
				blnStatus = TobaccoUsageFillInfoP2(objTestData);
				break;
			case "FinalDispositionRate":
				blnStatus = FinalDispositionRate(objTestData);
				break;
			case "Rateclassreason":
				blnStatus = Rateclassreason(objTestData);
				break;
			case "RateReasonflat":
				blnStatus = RateReasonflat(objTestData);
				break;
			case "Denyclassreason":
				blnStatus = Denyclassreason(objTestData);
				break;
			case "Assignfinaldisposition":
				blnStatus = Assignfinaldisposition(objTestData);
				break;
			case "UWapprovalcheckList":
				blnStatus = UWapprovalcheckList(objTestData);
				break;
			case "AUDreason":
				blnStatus = AUDreason(objTestData);
				break;
			case "TodoList":
				blnStatus = TodoList();
				break;
			case "EpolicyAck":
				blnStatus = EpolicyAck(objTestData);
				break;
			case "IndexOneMiscellaneous":
				blnStatus = IndexOneMiscellaneous(objTestData);
				break;
			case "IndexContractChange":
				blnStatus = IndexContractChange(objTestData);
				break;
			case "ReinsuranceCalculator":
				blnStatus = ReinsuranceCalculator(objTestData);
				break;
			case"ADCAuthorizationForm":
				blnStatus = ADCAuthorizationForm(objTestData);
				break;
			case"ADCBenificiary":
				blnStatus = ADCBenificiary(objTestData);
				break;
			case"ADCSecondaryAddressee":
				blnStatus = ADCSecondaryAddressee(objTestData);
				break;
			case"ADCSelectAgent":
				blnStatus = ADCSelectAgent(objTestData);
				break;
			case"ADCCWA":
				blnStatus = ADCCWA(objTestData);
				break;
			case "UWBusinessRequirements":
				blnStatus = UWBusinessRequirements();
				break;
			case "ContractInformation":
				blnStatus = ContractInformation(objTestData);
				break;
			case "CreateUWRequirements":
				blnStatus = CreateUWRequirements(objTestData);
				break;
			case "NBPAYMENT":
				blnStatus = NBPAYMENT(objTestData);
				break;
			case "VerifyUWandUWCM":
				blnStatus = VerifyUWandUWCM(objTestData);
				break;
			case "Assignment":
				blnStatus = Assignment(objTestData);
				break;
			case "Reassign":
				blnStatus = Reassign(objTestData);
				break;
			case "FinancialMoney":
				blnStatus = FinancialMoney(objTestData);
				break;
			case "ReinsuranceAmount":
				blnStatus = ReinsuranceAmount(objTestData);
				break;
			case "Facultative":
				blnStatus = Facultative(objTestData);
				break;
			case "LoanCarryOver":
				blnStatus = LoanCarryOver(objTestData);
				break;
			case "PremiumValue":
				blnStatus = PremiumValue(objTestData);
				break;
			case "Replacement":
				blnStatus = Replacement(objTestData);
				break;
			case "OverrideAutoClosure":
				blnStatus = OverrideAutoClosure(objTestData);
				break;
			case "RequiremtnSelection":
				blnStatus = RequiremtnSelection(objTestData);
				break;
			case "ContractMessagesVerify":
				blnStatus = ContractMessagesVerify(objTestData);
				break;
			case "CompanionCase":
				blnStatus = CompanionCase(objTestData);
				break;
			case "UWComments":
				blnStatus = UWComments(objTestData);
				break;
			case "ProductsCLR":
				blnStatus = ProductsCLR(objTestData);
				break;
			case "NigoDecision":
				blnStatus = NigoDecision(objTestData);
				break;
			case "ReopenCase":
				blnStatus = ReopenCase(objTestData);
				break;
			case "CreateWork":
				blnStatus = CreateWork(objTestData);
				break;
			case "BGASelectProducer":
				blnStatus = BGASelectProducer(objTestData);
				break;
			case "BGASelectProducerResults":
				blnStatus = BGASelectProducerResults(objTestData);
				break;
			case "AddComments":
				blnStatus = AddComments(objTestData);
				break;
			case "ImagesSummary":
				blnStatus = ImagesSummary(objTestData);
				break;
			case "TCONV1":
				blnStatus = TCONV1(objTestData);
				break;
			case "TCONV2":
				blnStatus = TCONV2(objTestData);
				break;
			case "TCONV3":
				blnStatus = TCONV3(objTestData);
				break;
			case "TCONV4":
				blnStatus = TCONV4(objTestData);
				break;
			case "TCONV5":
				blnStatus = TCONV5(objTestData);
				break;
			case "InsuredInfoJI":
				blnStatus = InsuredInfoJI(objTestData);
				break;
			case "DoctorInformation":
				blnStatus = DoctorInformation(objTestData);
				break;

			case "PrefferdProcessingScreen":
				blnStatus = PrefferdProcessingScreen(objTestData);
				break;
			case "QC_Review":
				blnStatus = QC_Review(objTestData);
				break;
			case "REG60TodoList":
				blnStatus = REG60TodoList(objTestData);
				break;
			case "REG60Review":
				blnStatus = REG60Review(objTestData);
				break;
			case "RETENSION_CALCULATOR":
				blnStatus = RETENSION_CALCULATOR(objTestData);
				break;
			case "Predictive":
				blnStatus = Predictive(objTestData);
				break;
			case "DisagreeWithJet":
				blnStatus = DisagreeWithJet(objTestData);
				break;
			case "PrintPreview":
				blnStatus = PrintPreview(objTestData);
				break;
			case "LtcsrDeny":
				blnStatus = LtcsrDeny(objTestData);
				break;
			case "ReplAppendix":
				blnStatus = ReplAppendix(objTestData);
				break;
			case "Important_Notice":
				blnStatus = Important_Notice(objTestData);
				break;
			case "NOR_1035":
				blnStatus = NOR_1035(objTestData);
				break;
			case "NOR_CRIA":
				blnStatus = NOR_CRIA(objTestData);
				break;
			case "NOR_FL":
				blnStatus = NOR_FL(objTestData);
				break;
			case "NOR_RAF":
				blnStatus = NOR_RAF(objTestData);
				break;
			case "NOR_UseofCash":
				blnStatus = NOR_UseofCash(objTestData);
				break;
			case "Disclosure":
				blnStatus = Disclosure(objTestData);
				break;
			case "SalesMaterialNY":
				blnStatus = SalesMaterialNY(objTestData);
				break;
			case "NOR":
				blnStatus = NOR(objTestData);
				break;
			case "SalesMaterialIPopup":
				blnStatus = SalesMaterialIPopup(objTestData);
				break;
			case "ONEVIEW":
				blnStatus = ONEVIEW(objTestData);
				break;

            case "VMT":
				blnStatus = VMT(objTestData);
				break;	
            case "CSGReview":
				blnStatus = CSGReview(objTestData);
				break;
				
				
			default:
				ReportGenerator.generateTestStep(false, currentScreen, "Call Screen", screenName + " Screen / Method not found in AppEntry class", false);
				break;
		}
		return blnStatus;
	}
	//front door
	private static boolean Login11(OrderedHashtable objTestData, String browserType, String appRegion) {
		boolean blnStatus = false;
		String strHashKey = "", strHashValue = "";
		String strValue = "";
		//int intCounter = 0;
		BrowserType brwType;
		try {
			Enumeration objEnum = objTestData.enumerateKeys();
			while(objEnum.hasMoreElements()) {
				//blnStatus = false;
				strHashKey = objEnum.nextElement().toString();
				strHashValue = objTestData.get(strHashKey).toString();
				
				switch(strHashKey) {
					case "APP_URL":
						switch(browserType) {
							case "CHROME":
								brwType = BrowserType.CHROME;
								break;
							case "FIREFOX":
								brwType = BrowserType.FIREFOX;
								break;
							default:
								brwType = BrowserType.IE;
								break;
						} //end of browser type switch
						blnStatus = navigateURL(brwType, validateInput(strHashValue), currentScreen);
						break;
					case "LOG_IN":
						blnStatus = setValue(WebControl.LINK, IdentifyBy.ID, "header-desktop-login", strHashValue, "Login", currentScreen);
						break;
					case "USER_ID":
						if(DriverScript.gobjCurrentTest.getUserID()!=null) {
							strValue = DriverScript.gobjCurrentTest.getUserID();
							strHashValue = strHashValue.trim() + strValue.trim();
						}
						//
						/*List<WebElement> objDiv = getWebElements(IdentifyBy.ID, "panel-form");
						if(objDiv.size()>0) {
							while(!objDiv.get(0).isDisplayed() && intCounter<30) {
								Thread.sleep(500);
								intCounter++;
							}
							Thread.sleep(500);
						}*/
						
						blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.ID, "loginId", strHashValue, "User Name", currentScreen);
						break;
					case "USER_PASSWORD":
						//if(DriverScript.gobjCurrentTest.getUserPassword()!=null) strHashValue = DriverScript.gobjCurrentTest.getUserPassword();
						
						blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.ID, "loginPassword", strHashValue, "User Password", currentScreen);
						break;
					case "GO":
						blnStatus = setValue(WebControl.LINK, IdentifyBy.ID, "panel-desktop-login", validateInput(strHashValue), "LOGIN", currentScreen);
						//blnStatus = setValue(WebControl.LINK, IdentifyBy.XPATH, "//*[@id='loginPanel']/div[2]/form/div/div/fieldset/div[2]/div[1]/button", validateInput(strHashValue), "Go", currentScreen);
						if(blnStatus) blnStatus = axaCommonNavigation(appRegion, currentScreen);
						break;
					case "default1":
						ReportGenerator.generateTestStep(false, currentScreen, "Field Navigation", strHashKey + " field not available in the current method.", false);
						break;
				} //end of switch
				if(!blnStatus) break;
			} //end of while
			objEnum = null;
		} catch(Exception objExp) {
			ReportGenerator.generateTestStep(false, currentScreen, "Exception occured", "Exception is - " + objExp.getMessage(), false);
			blnStatus = false;
		}
		
		return blnStatus;
	}
	
	//This Function is used for BackDoor ENTRY OF THE APPLICATION
		private static boolean Login(OrderedHashtable objTestData, String browserType, String appRegion) {
			boolean blnStatus = false;
			String strHashKey = "", strHashValue = "";
			String strValue = "";
			//int intCounter = 0;
			BrowserType brwType;
			try {
				Enumeration objEnum = objTestData.enumerateKeys();
				while(objEnum.hasMoreElements()) {
					//blnStatus = false;
					strHashKey = objEnum.nextElement().toString();
					strHashValue = objTestData.get(strHashKey).toString();
					
					switch(strHashKey) {
						case "APP_URL":
							switch(browserType) {
								case "CHROME":
									brwType = BrowserType.CHROME;
									break;
								case "FIREFOX":
									brwType = BrowserType.FIREFOX;
									break;
								default:
									brwType = BrowserType.IE;
									break;
							} //end of browser type switch
							blnStatus = navigateURL(brwType, "http://l52csai2.equitable.com:7220/nbALoginModule/jsp/login4.jsp", currentScreen);
							break;
						case "LOG_IN":
							//blnStatus = setValue(WebControl.LINK, IdentifyBy.CSS_SELECTOR, "a[class='loginBtn medium']", strHashValue, "Login", currentScreen);
							blnStatus=true;
							break;
						case "USER_ID":
							if(DriverScript.gobjCurrentTest.getUserID()!=null) {
								strValue = DriverScript.gobjCurrentTest.getUserID();
								strHashValue = strHashValue.trim() + strValue.trim();
							}
							blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.ID, "user-id", strHashValue, "User Name", currentScreen);
							break;
						case "USER_PASSWORD":
							//if(DriverScript.gobjCurrentTest.getUserPassword()!=null) strHashValue = DriverScript.gobjCurrentTest.getUserPassword();
							
							blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.ID, "loginPassword", strHashValue, "User Password", currentScreen);
							break;
						case "GO":
							//blnStatus = setValue(WebControl.LINK, IdentifyBy.XPATH, "//*[@id='loginPanel']/div[2]/form/div/div/fieldset/div[2]/div[1]/button", validateInput(strHashValue), "Go", currentScreen);
							
							blnStatus = setValue(WebControl.LINK, IdentifyBy.ID, "submitLogin", validateInput(strHashValue), "Go", currentScreen);
							if(blnStatus) blnStatus = axaCommonNavigationBackDoor(appRegion, currentScreen);
							break;
						case "default1":
							ReportGenerator.generateTestStep(false, currentScreen, "Field Navigation", strHashKey + " field not available in the current method.", false);
							break;
					} //end of switch
					if(!blnStatus) break;
				} //end of while
				objEnum = null;
			} catch(Exception objExp) {
				ReportGenerator.generateTestStep(false, currentScreen, "Exception occured", "Exception is - " + objExp.getMessage(), false);
				blnStatus = false;
			}
			
			return blnStatus;
		}
	
	private static boolean WorkItemsActions(OrderedHashtable objTestData) {
		boolean blnStatus = false;
		String strHashKey = "", strHashValue = "";
		try {
			String strFrames = "mainContentFrame" + GlobalData.STRING_SEPARATOR + "contentLeftFrame" + GlobalData.STRING_SEPARATOR + "file"  + GlobalData.STRING_SEPARATOR + "file"  ;
			Enumeration objEnum = objTestData.enumerateKeys();
			
			if(switchToFrame(strFrames, false) && waitForPageLoad(MAX_TIMEOUT)) {
				while(objEnum.hasMoreElements()) {
					//blnStatus = false;
					strHashKey = objEnum.nextElement().toString();
					strHashValue = objTestData.get(strHashKey).toString();
					waitForPageLoad(MAX_TIMEOUT);
					switch(strHashKey) {
						case "SEARCH":
							blnStatus = setValue(WebControl.BUTTON, IdentifyBy.NAME, "inboxForm:_id11", validateInput(strHashValue), "Search", currentScreen);
							Thread.sleep(MIC_TIMEOUT * 1000);
							//waitForPageLoad(MAX_TIMEOUT);
							break;
						case "default1":
							ReportGenerator.generateTestStep(false, currentScreen, "Field Navigation", strHashKey + " field not available in the current method.", false);
							break;
					} //end of switch
					if(!blnStatus) break;
				} //end of while
			}
			else {
				ReportGenerator.generateTestStep(false, currentScreen, "Switch to Frame", "Failed to switch frames " + strFrames.replaceAll(GlobalData.STRING_SEPARATOR, " > "), false);
				blnStatus = false;
			}
			objEnum = null;
		} catch(Exception objExp) {
			ReportGenerator.generateTestStep(false, currentScreen, "Exception occured", "Exception is - " + objExp.getMessage(), false);
			blnStatus = false;
		}
	
		
		return blnStatus;
	}
	
	private static boolean SearchWorkItems(OrderedHashtable objTestData) {
		boolean blnStatus = false;
		String strHashKey = "", strHashValue = "";
		try {
			String strFrames = "FWin0" + GlobalData.STRING_SEPARATOR + "Content0";
			if(switchToFrame(strFrames, false)) {
				gobjWebDriver.manage().timeouts().pageLoadTimeout(MIN_TIMEOUT, TimeUnit.SECONDS);
				blnStatus = setValue(WebControl.BUTTON, IdentifyBy.NAME, "form_searchIntray:btnClear", "", "Clear", currentScreen);
				gobjWebDriver.manage().timeouts().setScriptTimeout(MAX_TIMEOUT, TimeUnit.SECONDS);
			}
			Enumeration objEnum = objTestData.enumerateKeys();
			
				if(switchToFrame(strFrames, false) && waitForPageLoad(MAX_TIMEOUT)) {
					while(objEnum.hasMoreElements()) {
						//blnStatus = false;
						strHashKey = objEnum.nextElement().toString();
						strHashValue = objTestData.get(strHashKey).toString();
						
						switch(strHashKey) {
							case "BUSINESS_AREA":
								blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_searchIntray:searchCriteria:businessAreaDD", validateInput(strHashValue), "Business Area", currentScreen);
								break;
							case "QUEUE":
								blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_searchIntray:searchCriteria:queueDD", validateInput(strHashValue), "Queue", currentScreen);
								break;
							case "WORK_TYPE":
								blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_searchIntray:searchCriteria:workTypeDD", validateInput(strHashValue), "Work Type", currentScreen);
								break;
							case "STATUS":
								blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_searchIntray:searchCriteria:statusDD", validateInput(strHashValue), "Status", currentScreen);
								break;
							case "CONTRACT_NUMBER":
								blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_searchIntray:searchCriteria:contractNumTxt", validateInput(strHashValue), "Contract Number", currentScreen);
								break;
							case "SET_SSN":
								blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_searchIntray:searchCriteria:govtIdTxt", validateInput(strHashValue), "SSN", currentScreen);
								break;
							case "LAST_NAME":
								blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_searchIntray:searchCriteria:lastNameTxt", validateInput(strHashValue), "Last Name", currentScreen);
								break;
							case "FIRST_NAME":
								blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_searchIntray:searchCriteria:firstNameTxt", validateInput(strHashValue), "First Name", currentScreen);
								break;
							case "UNDERWRITER_QUEUE_ID":
								blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_searchIntray:searchCriteria:uwQueueDD", validateInput(strHashValue), "Underwriter Queue ID", currentScreen);
								break;
							case "FROM_DATE":
								blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_searchIntray:searchDates:fromDateTxt", validateInput(strHashValue), "From Date", currentScreen);
								break;
							case "TO_DATE":
								blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_searchIntray:searchDates:toDateTxt", validateInput(strHashValue), "To Date", currentScreen);
								break;
							case "CLEAR":
								blnStatus = setValue(WebControl.BUTTON, IdentifyBy.NAME, "form_searchIntray:btnClear", validateInput(strHashValue), "Clear", currentScreen);
								//waitForPageLoad(MAX_TIMEOUT);
								break;
							case "SEARCH":
								blnStatus = setValue(WebControl.BUTTON, IdentifyBy.NAME, "form_searchIntray:btnSearch", validateInput(strHashValue), "Search", currentScreen);
								waitForPageLoad(MAX_TIMEOUT);
								Thread.sleep(1000);
								break;
							case "WORK_ITEM_LIST":
								if(switchToFrame("FWin1" + GlobalData.STRING_SEPARATOR + "Content1", true)) {
									//System.out.println("Before Click");
								
									gobjWebDriver.findElement(By.name("ok")).sendKeys(Keys.ENTER);
									//System.out.println("After Click");
									Thread.sleep(1000);
								}
								if(switchToFrame("FWin0" + GlobalData.STRING_SEPARATOR + "Content0", false)) {
									blnStatus = selectWorkItem(IdentifyBy.ID, "form_searchIntray:searchResults:searchTable", "", "Work Items", currentScreen);
								}
								break;
							case "OPEN":
								blnStatus = setValue(WebControl.BUTTON, IdentifyBy.NAME, "form_searchIntray:searchResults:btnOpen", validateInput(strHashValue), "Open", currentScreen);
								if(blnStatus) {
									blnStatus = verifyLockedMessage();
								}
								break;
							case "SELECT_BY_QUEUE":
								if(switchToFrame("FWin1" + GlobalData.STRING_SEPARATOR + "Content1", true)) {
									//System.out.println("Before Click");
								
									gobjWebDriver.findElement(By.name("ok")).sendKeys(Keys.ENTER);
									//System.out.println("After Click");
									Thread.sleep(1000);
								}
								if(switchToFrame("FWin0" + GlobalData.STRING_SEPARATOR + "Content0", false)) {
									blnStatus = selectWebtableRow(IdentifyBy.ID, "form_searchIntray:searchResults:searchTable", validateInput(strHashValue), "Queue", currentScreen);
								}
								
								break;
							case "POLICY_NUMBER":
								blnStatus = selectWebtableRow(IdentifyBy.ID, "form_searchIntray:searchResults:searchTable", "GET_POLICY", "Get Policy Number", currentScreen);
								if(DriverScript.gobjCurrentTest.getPolicyNo()!="") {
									ReportGenerator.generateTestStep(true, currentScreen, "Get Policy Number", "Policy Number is " + DriverScript.gobjCurrentTest.getPolicyNo(), false);
								}
								else {
									ReportGenerator.generateTestStep(true, currentScreen, "Get Policy Number", "Failed to get Policy Number", false);
								}
								break;
							case "UNSUSPEND":
								List<WebElement> obj= gobjWebDriver.findElements(By.name("form_searchIntray:searchResults:btnUnsuspend"));
								if(obj.size()>0) {
									if(obj.get(0).isEnabled()){
										try{
											obj.get(0).click();
										}catch(Exception obj1){}
										
										waitForPageLoad(MAX_TIMEOUT);
										ReportGenerator.generateTestStep(true, currentScreen, "Click Unsuspend", "Clicked successfully", false);
									}
								}
								blnStatus = true;
								break;
							case "VERIFY_BY_COLUMN":
								String[] arrHashValue = strHashValue.split(GlobalData.STRING_SEPARATOR);
								blnStatus = selectWebtableRow(IdentifyBy.ID, "form_searchIntray:searchResults:searchTable", Integer.parseInt(arrHashValue[0]), arrHashValue[1], "Verify By Column", currentScreen);
								break;
							
							case "default1":
								ReportGenerator.generateTestStep(false, currentScreen, "Field Navigation", strHashKey + " field not available in the current method.", false);
								break;
						} //end of switch
						if(!blnStatus) break;
					} //end of while
				}
				else {
					ReportGenerator.generateTestStep(false, currentScreen, "Switch to Frame", "Failed to switch frames " + strFrames.replaceAll(GlobalData.STRING_SEPARATOR, " > "), false);
					blnStatus = false;
				}
			//}
			
			objEnum = null;
		} catch(Exception objExp) {
			ReportGenerator.generateTestStep(false, currentScreen, "Exception occured", "Exception is - " + objExp.getMessage(), false);
			blnStatus = false;
		}
		return blnStatus;
	}
	
	private static boolean verifyLockedMessage() {
		boolean blnStatus = true;
		int intRowConter = 0;
		try {
			do {
				
				if(switchToFrame("FWin1" + GlobalData.STRING_SEPARATOR + "Content1", true)) {
					blnStatus = false;
					gobjWebDriver.findElement(By.id("confirmationForm:cancel")).sendKeys(Keys.ENTER);
					
					if(switchToFrame("FWin0" + GlobalData.STRING_SEPARATOR + "Content0", false)) {
						try{
							WebElement objEle = gobjWebDriver.findElement(By.id("form_searchIntray:btnSearch"));
							objEle.click();
						}catch (Exception e) {}
						
						Thread.sleep(2000);
						waitForPageLoad(MAX_TIMEOUT);
						
						WebElement objElement = null;
						List<WebElement> objLock = null;
						objElement = getWebElement(IdentifyBy.ID, "form_searchIntray:searchResults:searchTable");
						if(objElement!=null) {
							List<WebElement> objRows = getWebElements(objElement, IdentifyBy.TAGNAME, "tr");
							if(objRows.size()>0) {
								if(intRowConter<objRows.size()) {
									for(int intCounter=intRowConter;intCounter<objRows.size();intCounter++) {
										List<WebElement> objCols = getWebElements(objRows.get(intCounter), IdentifyBy.TAGNAME, "td");
										if(objCols.size()>0) {
											objLock = objCols.get(0).findElements(By.className("ovViewIcontrue"));
											if(objLock.size()==0) {
												System.out.println("Table data : " + objCols.get(1).getText());
												try{
													gobjWebDriver.manage().timeouts().pageLoadTimeout(MIN_TIMEOUT, TimeUnit.SECONDS);
													objRows.get(intCounter).click();
													intRowConter = intCounter;
													
												}
												catch(Exception objExp){}
												gobjWebDriver.manage().timeouts().setScriptTimeout(MAX_TIMEOUT, TimeUnit.SECONDS);
												Thread.sleep(3000);
												gobjWebDriver.findElement(By.id("form_searchIntray:searchResults:btnOpen")).click();
												Thread.sleep(2000);
												break;
											}
										}
									}
								}
								
							}
							
						}
						
					}
				} else blnStatus=true;
				
			} while(!blnStatus);
			
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}		
		
		return blnStatus;
	}
		
	private static boolean IndexApplication(OrderedHashtable objTestData) {
		boolean blnStatus = false;
		String strHashKey = "", strHashValue = "";
		try {
			
			String strFrames = "mainContentFrame" + GlobalData.STRING_SEPARATOR + "contentRightFrame" + GlobalData.STRING_SEPARATOR + "file";
			Enumeration objEnum = objTestData.enumerateKeys();
			//if(waitForPageLoad(MAX_TIMEOUT)) {
			
				if(switchToFrame(strFrames, false) && waitForPageLoad(MAX_TIMEOUT)) {
					while(objEnum.hasMoreElements()) {
						//blnStatus = false;
						strHashKey = objEnum.nextElement().toString();
						strHashValue = objTestData.get(strHashKey).toString();
						
						switch(strHashKey) {
							case "APPLICATION_ORIGIN":             
								blnStatus = setValue(WebControl.RADIOBOX, IdentifyBy.NAME, "form_indexApplication:indexApplicationForm:appOriginRadio", getAppRadioValues(strHashKey, strHashValue), "Application Origin", currentScreen);
								Thread.sleep(MIC_TIMEOUT*1000);
								blnStatus = setValue(WebControl.RADIOBOX, IdentifyBy.NAME, "form_indexApplication:indexApplicationForm:appOriginRadio", getAppRadioValues(strHashKey, strHashValue), "Application Origin", currentScreen);
								break;
							case "COMPANY":												  
								blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_indexApplication:indexApplicationForm:companyList", validateInput(strHashValue), "Company", currentScreen);
								break;
							case "CONTRACT":
								blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_indexApplication:indexApplicationForm:appContract", validateInput(strHashValue), "Contract", currentScreen);
								break;
							case "PRODUCT_NAME":
								blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_indexApplication:indexApplicationForm:appPlanList", validateInput(strHashValue), "Product Name", currentScreen);
								break;
							case "PRODUCT_SUITE":
								blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_indexApplication:indexApplicationForm:productSuiteList", validateInput(strHashValue), "Product Suite", currentScreen);
								break;
							case "FACE_AMOUNT":
								blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_indexApplication:indexApplicationForm:FaceAmount", validateInput(strHashValue), "Face Amount", currentScreen);
								break;
							case "PI_LAST_NAME":
								blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_indexApplication:indexApplicationForm:lastName", validateInput(strHashValue), "PI Last Name", currentScreen);
								break;
							case "PI_FIRST_NAME":
								blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_indexApplication:indexApplicationForm:firstName", validateInput(strHashValue), "PI First Name", currentScreen);
								break;
							case "PI_MIDDLE_INITIAL":
								blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_indexApplication:indexApplicationForm:middleInitial", validateInput(strHashValue), "PI Middle Initial", currentScreen);
								break;
							case "TAX_INFORMATION":
								blnStatus = setValue(WebControl.RADIOBOX, IdentifyBy.NAME, "form_indexApplication:indexApplicationForm:irstRadio", getAppRadioValues(strHashKey, strHashValue), "Tax Information", currentScreen);
								break;
							case "SOCIAL_SECURITY":
								blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_indexApplication:indexApplicationForm:ssn", validateInput(strHashValue), "SSN", currentScreen);
								break;
							case "TAX_IDENTIFICATION":
								blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_indexApplication:indexApplicationForm:tin", validateInput(strHashValue), "Tax Information", currentScreen);
								break;
							case "SOCIAL_INSURANCE":
								blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_indexApplication:indexApplicationForm:sin", validateInput(strHashValue), "Social Insurance", currentScreen);
								break;
							case "REPLACE_EXCHANGE":
								blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_indexApplication:indexApplicationForm:replaceExchangeLineType", validateInput(strHashValue), "Replace / Exchange", currentScreen);
								break;
							case "FORM":
								blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_indexApplication:indexApplicationForm:formsList", validateInput(strHashValue), "Form", currentScreen);
								break;
							case "APPLICATION_STATE":
								blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_indexApplication:indexApplicationForm:stateProvinceList", validateInput(strHashValue), "State/Province", currentScreen);
								break;
							case "APPLICATION_SIGNED_DATE":
								blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_indexApplication:indexApplicationForm:signedDate", validateInput(strHashValue), "Application Signed Date", currentScreen);
								break;
							case "CAMPANION_CASE_TYPE":
								blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_indexApplication:indexApplicationForm:companionCaseType", validateInput(strHashValue), "Companion Case Type", currentScreen);
								break;
							case "UNDERWRITER_QUEUE":
								blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_indexApplication:indexApplicationForm:underwriterQueueType", validateInput(strHashValue), "Underwriter Queue Type", currentScreen);
								break;
							case "DISTRIBUTION_CHANNEL":
								blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_indexApplication:indexApplicationForm:distChannelList", validateInput(strHashValue), "Distribution Channel", currentScreen);
								break;
							case "SPECIAL_CASE":
								blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_indexApplication:indexApplicationForm:specialCaseList", validateInput(strHashValue), "Special Case", currentScreen);
								break;
							case "DATE_OF_BIRTH":
								blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_indexApplication:indexApplicationForm:dateOfBirth", validateInput(strHashValue), "Date Of Birth", currentScreen);
								break;
							case "GROUP_TYPE":
								blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_indexApplication:indexApplicationForm:groupTypeList", validateInput(strHashValue), "Group Type", currentScreen);
								break;
							case "RECEIPT_DATE":
								blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_indexApplication:indexApplicationForm:receiptDate", validateInput(strHashValue), "Receipt Date", currentScreen);
								break;
							case "default1":
								ReportGenerator.generateTestStep(false, currentScreen, "Field Navigation", strHashKey + " field not available in the current method.", false);
								break;
						} //end of switch
						if(!blnStatus) break;
					} //end of while
				}
				else {
					ReportGenerator.generateTestStep(false, currentScreen, "Switch to Frame", "Failed to switch frames " + strFrames.replaceAll(GlobalData.STRING_SEPARATOR, " > "), false);
					blnStatus = false;
				}
				objEnum = null;
			//}
				
		} catch(Exception objExp) {
			ReportGenerator.generateTestStep(false, currentScreen, "Exception occured", "Exception is - " + objExp.getMessage(), false);
			blnStatus = false;
		}
		return blnStatus;
	}
	
	private static boolean IndexProducerSearch(OrderedHashtable objTestData) {
		boolean blnStatus = false;
		String strHashKey = "", strHashValue = "";
		try {
			String strFrames = "mainContentFrame" + GlobalData.STRING_SEPARATOR + "contentRightFrame" + GlobalData.STRING_SEPARATOR + "file";
			Enumeration objEnum = objTestData.enumerateKeys();
			//if(waitForPageLoad(MAX_TIMEOUT)) {
				if(switchToFrame(strFrames, false) && waitForPageLoad(MAX_TIMEOUT)) {
					while(objEnum.hasMoreElements()) {
						//blnStatus = false;
						strHashKey = objEnum.nextElement().toString();
						strHashValue = objTestData.get(strHashKey).toString();

						switch(strHashKey) {
							case "PERSON_R_ENTITY":
								blnStatus = setValue(WebControl.RADIOBOX, IdentifyBy.NAME, "form_indexApplication:indexApplicationForm:personEntityTypeRB", getAppRadioValues(strHashKey, strHashValue), "Person / Entity", currentScreen);
								break;
							case "ENTITY_TYPE":
								blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_indexApplication:indexApplicationForm:personEntityTypeDD", validateInput(strHashValue), "Entity Type", currentScreen);
								break;
							case "PREFIX":
								blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_indexApplication:indexApplicationForm:prefix_DD", validateInput(strHashValue), "Prefix", currentScreen);
								break;
							case "FIRST_NAME":
								blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_indexApplication:indexApplicationForm:first_EF", validateInput(strHashValue), "First Name", currentScreen);
								break;
							case "MIDDLE_NAME":
								blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_indexApplication:indexApplicationForm:middle_EF", validateInput(strHashValue), "Middle Name", currentScreen);
								break;
							case "LAST_NAME":
								blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_indexApplication:indexApplicationForm:LastName", validateInput(strHashValue), "Last Name", currentScreen);
								break;
							case "SUFFIX":
								blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_indexApplication:indexApplicationForm:suffix_DD", validateInput(strHashValue), "Suffix", currentScreen);
								break;
							case "ENTITY":
								blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_indexApplication:indexApplicationForm:Entity", validateInput(strHashValue), "Entity", currentScreen);
								break;
							case "FINANCIAL_PROFESSIONAL_NUMBER":
								blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_indexApplication:indexApplicationForm:finaProfessionalNumberPercentage_EF", validateInput(strHashValue), "Financial Professional Number", currentScreen);
								break;
							case "FIRM_ID":
								blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_indexApplication:indexApplicationForm:bgaNumber_EF", validateInput(strHashValue), "Submitting Firm ID", currentScreen);
								break;
							case "SEARCH":
								blnStatus = setValue(WebControl.BUTTON, IdentifyBy.NAME, "form_indexApplication:indexApplicationForm:btnProducerSearch", validateInput(strHashValue), "Search", currentScreen);
								break;
							case "CLEAR":
								blnStatus = setValue(WebControl.BUTTON, IdentifyBy.NAME, "form_indexApplication:indexApplicationForm:btnClear", validateInput(strHashValue), "Clear", currentScreen);
								break;
							case "default1":
								ReportGenerator.generateTestStep(false, currentScreen, "Field Navigation", strHashKey + " field not available in the current method.", false);
								break;
						} //end of switch
						if(!blnStatus) break;
					} //end of while
				}
				else {
					ReportGenerator.generateTestStep(false, currentScreen, "Switch to Frame", "Failed to switch frames " + strFrames.replaceAll(GlobalData.STRING_SEPARATOR, " > "), false);
					blnStatus = false;
				}
				objEnum = null;
			//}
				
		} catch(Exception objExp) {
			ReportGenerator.generateTestStep(false, currentScreen, "Exception occured", "Exception is - " + objExp.getMessage(), false);
			blnStatus = false;
		}
		return blnStatus;
	}
	
	private static boolean IndexSelectProducer(OrderedHashtable objTestData) {
		boolean blnStatus = false;
		String strHashKey = "", strHashValue = "";
		try {
			String strFrames = "FWin0" + GlobalData.STRING_SEPARATOR + "Content0";
			Enumeration objEnum = objTestData.enumerateKeys();
			//if(waitForPageLoad(MAX_TIMEOUT)) {
				if(switchToFrame(strFrames, false) && waitForPageLoad(MAX_TIMEOUT)) {
					
					while(objEnum.hasMoreElements()) {
						//blnStatus = false;
						strHashKey = objEnum.nextElement().toString();
						strHashValue = objTestData.get(strHashKey).toString();
						
						switch(strHashKey) {
							case "SELECT_PRODUCER":
								blnStatus = selectWebtableRow(IdentifyBy.ID, "form_ProducerOrAgentSearch:bgaCMDetails_DataTable", "", "Producer", currentScreen);
								break;
							case "ADD":
								blnStatus = setValue(WebControl.BUTTON, IdentifyBy.NAME, "form_ProducerOrAgentSearch:drAdd", validateInput(strHashValue), "Add", currentScreen);
								break;
							case "default1":
								ReportGenerator.generateTestStep(false, currentScreen, "Field Navigation", strHashKey + " field not available in the current method.", false);
								break;
						} //end of switch
						if(!blnStatus) break;
					} //end of while
				}
				else {
					ReportGenerator.generateTestStep(false, currentScreen, "Switch to Frame", "Failed to switch frames " + strFrames.replaceAll(GlobalData.STRING_SEPARATOR, " > "), false);
					blnStatus = false;
				}
				objEnum = null;
			//}
				
		} catch(Exception objExp) {
			ReportGenerator.generateTestStep(false, currentScreen, "Exception occured", "Exception is - " + objExp.getMessage(), false);
			blnStatus = false;
		}
		return blnStatus;
	}
	
	private static boolean BGASelectProducer(OrderedHashtable objTestData) {
		boolean blnStatus = false;
		String strHashKey = "", strHashValue = "";
		try {
			String strFrames = "FWin0" + GlobalData.STRING_SEPARATOR + "Content0";
			Enumeration objEnum = objTestData.enumerateKeys();
			//if(waitForPageLoad(MAX_TIMEOUT)) {
				if(waitForPageLoad(MAX_TIMEOUT) && switchToFrame(strFrames, false)) {
					while(objEnum.hasMoreElements()) {
						//blnStatus = false;
						strHashKey = objEnum.nextElement().toString();
						strHashValue = objTestData.get(strHashKey).toString();
						
						switch(strHashKey) {			
							case "SELECT_PRODUCER":
								blnStatus = setValue(WebControl.BUTTON, IdentifyBy.NAME, "form_bgaResultDetails:bgaResultDetails_DataTable:0:bgaResultDetailsCol1_TA", validateInput(strHashValue), "BGA Producer", currentScreen);
								break;
							case "ADD":
								blnStatus = setValue(WebControl.BUTTON, IdentifyBy.NAME, "form_bgaResultDetails:drAdd", validateInput(strHashValue), "Add", currentScreen);
								break;
							case "default1":
								ReportGenerator.generateTestStep(false, currentScreen, "Field Navigation", strHashKey + " field not available in the current method.", false);
								break;
						} //end of switch
						if(!blnStatus) break;
					} //end of while
				}
				else {
					ReportGenerator.generateTestStep(false, currentScreen, "Switch to Frame", "Failed to switch frames " + strFrames.replaceAll(GlobalData.STRING_SEPARATOR, " > "), false);
					blnStatus = false;
				}
				objEnum = null;
			//}
				
		} catch(Exception objExp) {
			ReportGenerator.generateTestStep(false, currentScreen, "Exception occured", "Exception is - " + objExp.getMessage(), false);
			blnStatus = false;
		}
		return blnStatus;
	}
	
	//Function For Producer Search Results For FPCertNonVar
		private static boolean CommInfoSelectProducer(OrderedHashtable objTestData) {
			boolean blnStatus = false;
			String strHashKey = "", strHashValue = "";
			try {
				String strFrames = "FWin0" + GlobalData.STRING_SEPARATOR + "Content0";
				Enumeration objEnum = objTestData.enumerateKeys();
				//if(waitForPageLoad(MAX_MILSEC_TIMEOUT)) {
					if(switchToFrame(strFrames, false) && waitForPageLoad(MAX_TIMEOUT)) {
						while(objEnum.hasMoreElements()) {
							//blnStatus = false;
							strHashKey = objEnum.nextElement().toString();
							strHashValue = objTestData.get(strHashKey).toString();
							
							switch(strHashKey) {
								case "SELECT_PRODUCER":
									blnStatus = selectWebtableRow(IdentifyBy.ID, "form_ProducerOrAgentSearch:bgaCMDetails_DataTable", "", "Producer", currentScreen);
									break;
								case "ADD":
									blnStatus = setValue(WebControl.BUTTON, IdentifyBy.NAME, "form_ProducerOrAgentSearch:drAdd", validateInput(strHashValue), "Add", currentScreen);
									break;
								case "default1":
									ReportGenerator.generateTestStep(false, currentScreen, "Field Navigation", strHashKey + " field not available in the current method.", false);
									break;
							} //end of switch
							if(!blnStatus) break;
						} //end of while
					}
					else {
						ReportGenerator.generateTestStep(false, currentScreen, "Switch to Frame", "Failed to switch frames " + strFrames.replaceAll(GlobalData.STRING_SEPARATOR, " > "), false);
						blnStatus = false;
					}
					objEnum = null;
				//}
					
			} catch(Exception objExp) {
				ReportGenerator.generateTestStep(false, currentScreen, "Exception occured", "Exception is - " + objExp.getMessage(), false);
				blnStatus = false;
			}
			return blnStatus;
		}
		
	private static boolean IndexMiscellaneousMail(OrderedHashtable objTestData) {
		boolean blnStatus = false;
		String strHashKey = "", strHashValue = "";
		try {
			String strFrames = "mainContentFrame" + GlobalData.STRING_SEPARATOR + "contentRightFrame" + GlobalData.STRING_SEPARATOR + "file";
			Enumeration objEnum = objTestData.enumerateKeys();
			//if(waitForPageLoad(MAX_TIMEOUT)) {
				if(switchToFrame(strFrames, false) && waitForPageLoad(MAX_TIMEOUT)) {
					while(objEnum.hasMoreElements()) {
						//blnStatus = false;
						strHashKey = objEnum.nextElement().toString();
						strHashValue = objTestData.get(strHashKey).toString();
						
						switch(strHashKey) {
							case"OTHER_THAN_PRIMARY_INSURED":
								blnStatus = setValue(WebControl.CHECKBOX, IdentifyBy.NAME, "form_indexApplication:indexMiscellaneousForm:otherThanPInsCheckbox", validateInput(strHashValue), "Other Than Primary Insured", currentScreen);
								break;
							case"LAST_NAME":
								blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_indexApplication:indexMiscellaneousForm:lastNameOther", validateInput(strHashValue), "Last Name", currentScreen);
								break;
							case"FIRST_NAME":
								blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_indexApplication:indexMiscellaneousForm:firstName", validateInput(strHashValue), "First Name", currentScreen);
								break;
							case"DATE_OF_BIRTH":
								gobjWebDriver.findElement(By.name("form_indexApplication:indexMiscellaneousForm:miscDateofBirth")).click();
								blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_indexApplication:indexMiscellaneousForm:miscDateofBirth", validateInput(strHashValue), "D.O.B", currentScreen);
								break;
							case"GENDER":
								blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_indexApplication:indexMiscellaneousForm:miscgenderDD", validateInput(strHashValue), "Gender", currentScreen);
								break;
							case "TAX_INFORMATION":
								blnStatus = setValue(WebControl.RADIOBOX, IdentifyBy.NAME, "form_indexApplication:indexMiscellaneousForm:irstRadioMisc", getAppRadioValues(strHashKey, strHashValue), "Tax Information", currentScreen);
								break;
							case "SOCIAL_SECURITY":
								blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_indexApplication:indexMiscellaneousForm:ssn", validateInput(strHashValue), " Social Security :", currentScreen);
								break;
							case "MISCELLANEOUS_MAIL_NO":
							/*int i = Integer.valueOf(validateInput(strHashValue));
								if (i%3==0){
									gobjWebDriver.getKeyboard().sendKeys(Keys.PAGE_DOWN);
								}
								try{
								gobjWebDriver.findElementById("form_indexApplication:indexSourceTable:indexingOverviewDataTable:"+validateInput(strHashValue)+":image").click();
								}
								catch(Exception exp){
									exp.printStackTrace();
								}
								*/
								blnStatus = selectWebtableRow(IdentifyBy.ID, "form_indexApplication:indexSourceTable:indexingOverviewDataTable", validateInput(strHashValue), "indexing Overview - Miscellaneous Mail", currentScreen);
								break;
							case "MEDICAL_SIGNED_DATE":
								blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_indexApplication:indexMiscellaneousForm:paramedSignDate", validateInput(strHashValue), "Paramed/Medical Signed Date", currentScreen);
								break;
							case "REQUIREMENT_VENDOR":
								blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_indexApplication:indexMiscellaneousForm:requirementVendorList", validateInput(strHashValue), "Requirement Vendor", currentScreen);
								break;
							case "REQUIREMENT_TYPE":
								blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_indexApplication:indexMiscellaneousForm:requirementTypeList", validateInput(strHashValue), "Requirement Type", currentScreen);
								break;
							case "FORM":
								blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_indexApplication:indexMiscellaneousForm:formsList", validateInput(strHashValue), "Form", currentScreen);
								break;
							case "COMMIT":													//Except QA5//form_indexApplication:_id72
								scrollDown();
								blnStatus = setValue(WebControl.BUTTON, IdentifyBy.NAME, "form_indexApplication:_id78", validateInput(strHashValue), "Commit", currentScreen);
								waitForPageClose(MAX_TIMEOUT);

								strFrames = "mainContentFrame" + GlobalData.STRING_SEPARATOR + "contentLeftFrame" + GlobalData.STRING_SEPARATOR + "file"  + GlobalData.STRING_SEPARATOR + "file"  ;
								if(switchToFrame(strFrames, false)) waitForPageLoad(MAX_TIMEOUT);
								
								break;
							case "default1":
								ReportGenerator.generateTestStep(false, currentScreen, "Field Navigation", strHashKey + " field not available in the current method.", false);
								break;
						} //end of switch
						if(!blnStatus) break;
					} //end of while
				}
				else {
					ReportGenerator.generateTestStep(false, currentScreen, "Switch to Frame", "Failed to switch frames " + strFrames.replaceAll(GlobalData.STRING_SEPARATOR, " > "), false);
					blnStatus = false;
				}
				objEnum = null;
			//}
				
		} catch(Exception objExp) {
			ReportGenerator.generateTestStep(false, currentScreen, "Exception occured", "Exception is - " + objExp.getMessage(), false);
			blnStatus = false;
		}
		return blnStatus;
	}
	
	private static boolean AppInsuredInfo(OrderedHashtable objTestData) {
		boolean blnStatus = false;
		String strHashKey = "", strHashValue = "";
		try {
			
			
			String strFrames = "mainContentFrame" + GlobalData.STRING_SEPARATOR + "contentRightFrame" + GlobalData.STRING_SEPARATOR + "file" + GlobalData.STRING_SEPARATOR + "file";
			Enumeration objEnum = objTestData.enumerateKeys();
			//if(waitForPageLoad(MAX_TIMEOUT)) {
			
			
				if(switchToFrame(strFrames, false) && waitForPageLoad(MAX_TIMEOUT)) {
					gobjWebDriver.findElement(By.xpath("//*[contains(text(), 'Distribution Channel')]")).click();
					gobjWebDriver.findElement(By.xpath("//*[contains(text(), 'Distribution Channel')]")).click();
					while(objEnum.hasMoreElements()) {
						//blnStatus = false;
						strHashKey = objEnum.nextElement().toString();
						strHashValue = objTestData.get(strHashKey).toString();
						
						switch(strHashKey) {
							case "PREFIX":
								blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_appEntryLifePage1:ax2ProposedInsured:pInsured_DT:0:pInsured1Prefix_DD", validateInput(strHashValue), "Prefix", currentScreen);
								break;
							case "SUFFIX":
								blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_appEntryLifePage1:ax2ProposedInsured:pInsured_DT:0:pInsured1Suffix_DD", validateInput(strHashValue), "Suffix", currentScreen);
								break;
							case "LAST_NAME":
								blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_appEntryLifePage1:ax2ProposedInsured:pInsured_DT:0:pInsured1Last_EF", validateInput(strHashValue), "PI Last Name", currentScreen);
								break;
							case "FIRST_NAME":
								blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_appEntryLifePage1:ax2ProposedInsured:pInsured_DT:0:pInsured1First_EF", validateInput(strHashValue), "PI First Name", currentScreen);
								break;
							case "MIDDLE_INITIAL":
								blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_appEntryLifePage1:ax2ProposedInsured:pInsured_DT:0:pInsured1Middle_EF", validateInput(strHashValue), "PI Middle Initial", currentScreen);
								break;
							case "AMOUNT_INSURANCE":
								blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_appEntryLifePage1:ax2ApplicationInfo:AmountOfInsurance", validateInput(strHashValue), "Amount of Insurance", currentScreen);
								break;
							case "LEVELIZED_COMMISSION":
								blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_appEntryLifePage1:ax2ApplicationInfo:overrideLevelizedCommission_DD", validateInput(strHashValue), "Levelized Commission", currentScreen);
								break;	
							case "GENDER":
								blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_appEntryLifePage1:ax2ProposedInsured:pInsured_DT:0:pInsured1Gender_DD", validateInput(strHashValue), "Gender", currentScreen);
								break;
							case "PROPOSED_INSURED_OWNER":
								blnStatus = setValue(WebControl.CHECKBOX, IdentifyBy.NAME, "form_appEntryLifePage1:ax2ProposedInsured:pInsured_DT:0:sameOwner_CB", validateInput(strHashValue), "Is Proposed Insured Owner", currentScreen);
								break;
							case "PO_BOX_ADDRESS":
								blnStatus = setValue(WebControl.CHECKBOX, IdentifyBy.NAME, "form_appEntryLifePage1:ax2ProposedInsured:pInsured_DT:0:poBox_CB", validateInput(strHashValue), "P.O. Box Address", currentScreen);
								break;
							case "ADDRESS_TYPE":
								blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_appEntryLifePage1:ax2ProposedInsured:pInsured_DT:0:addressType_DD", validateInput(strHashValue), "Address Type", currentScreen);
								break;
							case "STREET_NO":
								blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_appEntryLifePage1:ax2ProposedInsured:pInsured_DT:0:street_EF", validateInput(strHashValue), "Street No", currentScreen);
								break;
							case "BUILDING_APT_SUITE":
								blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_appEntryLifePage1:ax2ProposedInsured:pInsured_DT:0:BldAptSuite_EF", validateInput(strHashValue), "Building / Apt / Suite", currentScreen);
								break;
							case "CITY":
								blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_appEntryLifePage1:ax2ProposedInsured:pInsured_DT:0:pInsured1City_EF", validateInput(strHashValue), "City", currentScreen);
								break;
							case "COUNTY":
								blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_appEntryLifePage1:ax2ProposedInsured:pInsured_DT:0:pInsured1County_EF", validateInput(strHashValue), "County", currentScreen);
								break;
							case "STATE":
								blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_appEntryLifePage1:ax2ProposedInsured:pInsured_DT:0:pInsured1State_DD", validateInput(strHashValue), "State", currentScreen);
								break;
							case "ZIP":
								blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_appEntryLifePage1:ax2ProposedInsured:pInsured_DT:0:pInsured1Zip_EF", validateInput(strHashValue), "Zip", currentScreen);
								break;
							case "COUNTRY":
								blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_appEntryLifePage1:ax2ProposedInsured:pInsured_DT:0:pInsured1Country_DD", validateInput(strHashValue), "Country", currentScreen);
								break;
							case "ADD":
								blnStatus = setValue(WebControl.BUTTON, IdentifyBy.NAME, "form_appEntryLifePage1:ax2ProposedInsured:pInsured_DT:0:pInsured1AddInfoAdd_CButton", validateInput(strHashValue), "Add Address", currentScreen);
								break;
							case "ADDRESS_SELECT":
								blnStatus = selectWebtableRow(IdentifyBy.ID, "form_appEntryLifePage1:ax2ProposedInsured:pInsured_DT:0:pInsured1_DataTable", 1, strHashValue, "ADDRESS_SELECT", currentScreen);
								Thread.sleep(2000);
								break;
							case "UPDATE":
								blnStatus = setValue(WebControl.BUTTON, IdentifyBy.NAME, "form_appEntryLifePage1:ax2ProposedInsured:pInsured_DT:0:pInsured1AddInfoUpdate_CButton", validateInput(strHashValue), "Update", currentScreen);
								break;
							case "US_CITIZEN":
								blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_appEntryLifePage1:ax2ProposedInsured:pInsured_DT:0:pInsured1Citizen_DD", validateInput(strHashValue), "US Citizen", currentScreen);
								break;
							case "BIRTH_PLACE_COUNTRY":
								blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_appEntryLifePage1:ax2ProposedInsured:pInsured_DT:0:pInsured1BirthCountry_DD", validateInput(strHashValue), "Birth Country", currentScreen);
								break;
							case "BIRTH_PLACE_STATE":
								blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_appEntryLifePage1:ax2ProposedInsured:pInsured_DT:0:lifeBirthState_DD", validateInput(strHashValue), "Birth State", currentScreen);
								break;
							case "EMAIL_ADDRESS":
								blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_appEntryLifePage1:ax2ProposedInsured:pInsured_DT:0:emailAdd_EF", validateInput(strHashValue), "E-Mail", currentScreen);
								break;
							case "HAVE_DRIVING_LICENSE":
								blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_appEntryLifePage1:ax2ProposedInsured:pInsured_DT:0:pInsured1licence_DD", validateInput(strHashValue), "Have Driving License", currentScreen);
								break;
							case "LICENSE_NO":
								blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_appEntryLifePage1:ax2ProposedInsured:pInsured_DT:0:pInsured1licNumber_EF", validateInput(strHashValue), "License No", currentScreen);
								break;
							case "IF_NO_DRIVING_LICENSE":								  
								blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_appEntryLifePage1:ax2ProposedInsured:pInsured_DT:0:pInsur_Govt_id", validateInput(strHashValue), "Have Driving License", currentScreen);
								break;
							case "ISSUE_STATE":
								blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_appEntryLifePage1:ax2ProposedInsured:pInsured_DT:0:pInsured1licenseState_DD", validateInput(strHashValue), "Issue State", currentScreen);
								break;
							case "EXPIRATION_DATE":
								blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_appEntryLifePage1:ax2ProposedInsured:pInsured_DT:0:pInsured1ExpDateLic_EF", validateInput(strHashValue), "Expiration Date", currentScreen);
								break;
							case "CURRENTLY_EMPLOYED":
								blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_appEntryLifePage1:ax2ProposedInsured:pInsured_DT:0:pInsured1Employer_DD", validateInput(strHashValue), "Currently Employed", currentScreen);
								break;
							case "GROSS_EARNED_ANNUAL_INCOME":
								blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_appEntryLifePage1:ax2FinancialDetails:grossEarnedIncomePI1_EF", validateInput(strHashValue), "Gross Earned Annual Income", currentScreen);
								break;
							case "GROSS_ANNUAL_HOUSEHOLD_INCOME":
								blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_appEntryLifePage1:ax2FinancialDetails:grossHouseIncomePI1_EF", validateInput(strHashValue), "Gross Annual Household Income", currentScreen);
								break;
							case "GROSS_UNEARNED_ANNUAL_INCOME":
								blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_appEntryLifePage1:ax2FinancialDetails:grossUnearnedIncomePI1_EF", validateInput(strHashValue), "Gross Unearned Annual Income", currentScreen);
								break;
							case "TOTAL_NET_WORTH":
								blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_appEntryLifePage1:ax2FinancialDetails:totalNetworthPI1_EF", validateInput(strHashValue), "Total Net Worth", currentScreen);
								break;
							case "FILED_BANKRUPTACY":
								blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_appEntryLifePage1:ax2FinancialDetails:bankruptcyDetailsQuestionsTablePane:0:Q61bAns_DD", validateInput(strHashValue), "Filed Bankruptcy", currentScreen);
								break;
							case "BENEFICIARY":
								blnStatus = setValue(WebControl.BUTTON, IdentifyBy.NAME, "form_appEntryLifePage1:ax2BeneficiaryInfo:beneficairy_CButton", validateInput(strHashValue), "Beneficiary", currentScreen);
								break;
							case "DATE_OF_BIRTH":
								blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_appEntryLifePage1:ax2ProposedInsured:pInsured_DT:0:pInsured1DOB_EF", validateInput(strHashValue), "Date Of Birth", currentScreen);
								break;
							case "default1":
								ReportGenerator.generateTestStep(false, currentScreen, "Field Navigation", strHashKey + " field not available in the current method.", false);
								break;
						} //end of switch
						if(!blnStatus) break;
					} //end of while																	
				}
				else {
					ReportGenerator.generateTestStep(false, currentScreen, "Switch to Frame", "Failed to switch frames " + strFrames.replaceAll(GlobalData.STRING_SEPARATOR, " > "), false);
					blnStatus = false;
				}
				objEnum = null;
			//}
				
		} catch(Exception objExp) {
			ReportGenerator.generateTestStep(false, currentScreen, "Exception occured", "Exception is - " + objExp.getMessage(), false);
			blnStatus = false;
		}
		return blnStatus;
	}
	private static boolean ReplAppendix(OrderedHashtable objTestData) {
		boolean blnStatus = false;
		String strHashKey = "", strHashValue = "";
		try {
			
			
			String strFrames = "mainContentFrame" + GlobalData.STRING_SEPARATOR + "contentRightFrame" + GlobalData.STRING_SEPARATOR + "file" + GlobalData.STRING_SEPARATOR + "file" + GlobalData.STRING_SEPARATOR + "file";
			Enumeration objEnum = objTestData.enumerateKeys();
			//if(waitForPageLoad(MAX_TIMEOUT)) {
			
			
				if(switchToFrame(strFrames, false) && waitForPageLoad(MAX_TIMEOUT)) {
					
					while(objEnum.hasMoreElements()) {
						//blnStatus = false;
						strHashKey = objEnum.nextElement().toString();
						strHashValue = objTestData.get(strHashKey).toString();
						
						switch(strHashKey) {
						
						case"Q1":													  
							blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_ReplacementNY:ax2ReplacementNY:agentQueriesTablePane:0:Q61bAns_DD", validateInput(strHashValue), "Question : 1", currentScreen);
							break;
						case"Q2":
							blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_ReplacementNY:ax2ReplacementNY:agentQueriesTablePane:1:Q61bAns_DD", validateInput(strHashValue), "Question : 2 ", currentScreen);
							break;
						case"Q3":
							blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_ReplacementNY:ax2ReplacementNY:agentQueriesTablePane:2:Q61bAns_DD", validateInput(strHashValue), "Question : 3", currentScreen);
							break;
							
						case"Q4":
							blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_ReplacementNY:ax2ReplacementNY:agentQueriesTablePane:3:Q61bAns_DD", validateInput(strHashValue), "Question : 4", currentScreen);
							break;
							
						case"Q5":
							blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_ReplacementNY:ax2ReplacementNY:agentQueriesTablePane:4:Q61bAns_DD", validateInput(strHashValue), "Question : 5", currentScreen);
							break;
						case"Q6":
							blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_ReplacementNY:ax2ReplacementNY:agentQueriesTablePane:5:Q61bAns_DD", validateInput(strHashValue), "Question : 6", currentScreen);
							break;
						case"SIGNATURE_APPLICANT":
						blnStatus = setValue(WebControl.CHECKBOX, IdentifyBy.NAME, "form_ReplacementNY:ax2ReplacementNY:applicantSignPresent_CB", validateInput(strHashValue), "SIGNATURE_APPLICANT", currentScreen);
							break;
							
						case"APPLICANT_DATE":
							blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_ReplacementNY:ax2ReplacementNY:applicantSignDate_EF", validateInput(strHashValue), "DATE", currentScreen);
							break;
						case"SIGNATURE_OWNER":
							blnStatus = setValue(WebControl.CHECKBOX, IdentifyBy.NAME, "form_ReplacementNY:ax2ReplacementNY:applicantSign1Present_CB", validateInput(strHashValue), "SIGNATURE_OWNER", currentScreen);
							break;
							
						case"OWNER_DATE":
							blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_ReplacementNY:ax2ReplacementNY:ProposedInsuredSign1DateEF", validateInput(strHashValue), "OWNER_DATE", currentScreen);
							break;
						case"TOTLE_OF_APPLICANT":
							blnStatus = setValue(WebControl.CHECKBOX, IdentifyBy.NAME, "form_ReplacementNY:ax2ReplacementNY:TitleApplicant_CB", validateInput(strHashValue), "TOTLE_OF_APPLICANT", currentScreen);
							break;
						case"REPLACEMENT_INVOLVED":
							blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_ReplacementNY:ax2ReplacementNY:replacementDecisionAnswer_DD", validateInput(strHashValue), "To the best of my knowledge, a Replacement is involved in this transaction:", currentScreen);
							break;
							
						case"SIGNATURE_AGENT":
							blnStatus = setValue(WebControl.CHECKBOX, IdentifyBy.NAME, "form_ReplacementNY:ax2ReplacementNY:agentSign1Present_CB", validateInput(strHashValue), "SIGNATURE_AGENT", currentScreen);
							break;
						case"AGENT_DATE":
							blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_ReplacementNY:ax2ReplacementNY:agentSign1Date_EF", validateInput(strHashValue), "AGENT_DATE", currentScreen);
							break;
						case "default1":
							ReportGenerator.generateTestStep(false, currentScreen, "Field Navigation", strHashKey + " field not available in the current method.", false);
							break;
						} //end of switch
						if(!blnStatus) break;
					} //end of while																	
				}
				else {
					ReportGenerator.generateTestStep(false, currentScreen, "Switch to Frame", "Failed to switch frames " + strFrames.replaceAll(GlobalData.STRING_SEPARATOR, " > "), false);
					blnStatus = false;
				}
				objEnum = null;
			//}
				
		} catch(Exception objExp) {
			ReportGenerator.generateTestStep(false, currentScreen, "Exception occured", "Exception is - " + objExp.getMessage(), false);
			blnStatus = false;
		}
		return blnStatus;
	}
	private static boolean Important_Notice(OrderedHashtable objTestData) {
		boolean blnStatus = false;
		String strHashKey = "", strHashValue = "";
		try {
			
			
			String strFrames = "mainContentFrame" + GlobalData.STRING_SEPARATOR + "contentRightFrame" + GlobalData.STRING_SEPARATOR + "file" + GlobalData.STRING_SEPARATOR + "file" + GlobalData.STRING_SEPARATOR + "file";
			Enumeration objEnum = objTestData.enumerateKeys();
			//if(waitForPageLoad(MAX_TIMEOUT)) {
			
			
				if(switchToFrame(strFrames, false) && waitForPageLoad(MAX_TIMEOUT)) {
					
					while(objEnum.hasMoreElements()) {
						//blnStatus = false;
						strHashKey = objEnum.nextElement().toString();
						strHashValue = objTestData.get(strHashKey).toString();
						
						switch(strHashKey) {
						case"PAGE1":													
							blnStatus = setValue(WebControl.CHECKBOX, IdentifyBy.NAME, "form_NoticeOfReplacement:noticeOfReplacement1:Page1Received_CB", validateInput(strHashValue), "Page1", currentScreen);
							break;
						case"APPLICANT_SIGN":
							blnStatus = setValue(WebControl.CHECKBOX, IdentifyBy.NAME, "form_NoticeOfReplacement:noticeOfReplacement2:applicantSign_CB", validateInput(strHashValue), "APPLICANT_SIGN", currentScreen);
							break;
						case"APPLICANT_DATE":
							blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_NoticeOfReplacement:noticeOfReplacement2:date_EF", validateInput(strHashValue), "APPLICANT_DATE", currentScreen);
							break;
						case"JOINT_APPLICANT_SIGN":
							blnStatus = setValue(WebControl.CHECKBOX, IdentifyBy.NAME, "form_NoticeOfReplacement:noticeOfReplacement2:jointOwnerApplicantSign_CB", validateInput(strHashValue), "JOINT_APPLICANT_SIGN", currentScreen);
							break;
						case"JOINT_APPLICANT_DATE":
							blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_NoticeOfReplacement:noticeOfReplacement2:jointOwnerDate_EF", validateInput(strHashValue), "JOINT_APPLICANT_DATE", currentScreen);
							break;
						case "default1":
							ReportGenerator.generateTestStep(false, currentScreen, "Field Navigation", strHashKey + " field not available in the current method.", false);
							break;
						} //end of switch
						if(!blnStatus) break;
					} //end of while																	
				}
				else {
					ReportGenerator.generateTestStep(false, currentScreen, "Switch to Frame", "Failed to switch frames " + strFrames.replaceAll(GlobalData.STRING_SEPARATOR, " > "), false);
					blnStatus = false;
				}
				objEnum = null;
			//}
				
		} catch(Exception objExp) {
			ReportGenerator.generateTestStep(false, currentScreen, "Exception occured", "Exception is - " + objExp.getMessage(), false);
			blnStatus = false;
		}
		return blnStatus;
	}
	
	private static boolean NOR_1035(OrderedHashtable objTestData) {
		boolean blnStatus = false;
		String strHashKey = "", strHashValue = "";
		String ExchangeFormNo="";
		try {
			
			
			String strFrames = "mainContentFrame" + GlobalData.STRING_SEPARATOR + "contentRightFrame" + GlobalData.STRING_SEPARATOR + "file" + GlobalData.STRING_SEPARATOR + "file" + GlobalData.STRING_SEPARATOR + "file";
			Enumeration objEnum = objTestData.enumerateKeys();
			//if(waitForPageLoad(MAX_TIMEOUT)) {
			
			
				if(switchToFrame(strFrames, false) && waitForPageLoad(MAX_TIMEOUT)) {
					
					while(objEnum.hasMoreElements()) {
						//blnStatus = false;
						strHashKey = objEnum.nextElement().toString();
						strHashValue = objTestData.get(strHashKey).toString();
											
						switch(strHashKey) 
						
						{
						
						case"1035_FORM_Section":  
							ExchangeFormNo=strHashValue;
							System.out.println(ExchangeFormNo);
							blnStatus=true;
						
							//ReportGenerator.generateTestStep(true, currentScreen, strHashKey, RAfsection+ "is"+, isValidation);
							break;
						case"POLICY_NO":
							System.out.println("form_1035Exhange:ax21035Page1:exch1035_DT:"+ExchangeFormNo+":contractNumber_EF");
							//form_1035Exhange:ax21035Page1:exch1035_DT:0:contractNumber_EF
							blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_1035Exhange:ax21035Page1:exch1035_DT:"+ExchangeFormNo+":contractNumber_EF", validateInput(strHashValue), "Policy No", currentScreen);
							break;
						case"Company_Name":
							blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_1035Exhange:ax21035Page1:exch1035_DT:"+ExchangeFormNo+":InsurerCompanyName_DD", validateInput(strHashValue), "Company_Name", currentScreen);
							break;
						case"INSURED_FirstName":
							blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_1035Exhange:ax21035Page1:exch1035_DT:"+ExchangeFormNo+":InsFirst1_EF", validateInput(strHashValue), "INSURED_FirstName", currentScreen);
							break;
						case"INSURED_LASTName":
							blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_1035Exhange:ax21035Page1:exch1035_DT:"+ExchangeFormNo+":InsLast1_EF", validateInput(strHashValue), "INSURED_LASTName", currentScreen);
							break;
						case"OWNER_ACKNOWLEDGE":
							blnStatus = setValue(WebControl.CHECKBOX, IdentifyBy.NAME, "form_1035Exhange:ax21035Page1:exch1035_DT:"+ExchangeFormNo+":exchgContract_CB", validateInput(strHashValue), "OWNER_ACKNOWLEDGE", currentScreen);
							break;	
						
						case"OWNER_SIGN":
							blnStatus = setValue(WebControl.CHECKBOX, IdentifyBy.NAME, "form_1035Exhange:ax21035Page1:exch1035_DT:"+ExchangeFormNo+":OwnersSign_CB", validateInput(strHashValue), "OWNER_SIGN", currentScreen);
							break;
						case"OWNER_FEDERAL":
							blnStatus = setValue(WebControl.CHECKBOX, IdentifyBy.NAME, "form_1035Exhange:ax21035Page1:exch1035_DT:"+ExchangeFormNo+":OwnerFederalTaxNo_CB", validateInput(strHashValue), "OWNER_FEDERAL", currentScreen);
							break;	
						
						case"JOINTOWNER_SIGN":
							blnStatus = setValue(WebControl.CHECKBOX, IdentifyBy.NAME, "form_1035Exhange:ax21035Page1:exch1035_DT:"+ExchangeFormNo+":jointOwner_CB", validateInput(strHashValue), "JOINTOWNER_SIGN", currentScreen);
							break;	
						case"OWNER_DATE":
							blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_1035Exhange:ax21035Page1:exch1035_DT:"+ExchangeFormNo+":OwnerDateOn_EF", validateInput(strHashValue), "OWNER_DATE", currentScreen);
							break;
							
						case"POLICY_PAGE2_NO":
							blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_1035Exhange:ax21035Page1:exch1035_DT:"+ExchangeFormNo+":contractNumber2_EF", validateInput(strHashValue), "POLICY_PAGE2_NO", currentScreen);
							break;
						case"ON_OR_ABOUTDATE":
							blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_1035Exhange:ax21035Page1:exch1035_DT:"+ExchangeFormNo+":OnAboutDate2_EF", validateInput(strHashValue), "ON_OR_ABOUTDATE", currentScreen);
							break;
						case"OWNER_PAGE2_SIGN1":
							blnStatus = setValue(WebControl.CHECKBOX, IdentifyBy.NAME, "form_1035Exhange:ax21035Page1:exch1035_DT:"+ExchangeFormNo+":Owner1ApplicantSign_CB", validateInput(strHashValue), "OWNER_PAGE2_SIGN1", currentScreen);
							break;
						case"OWNER_PAGE2_SIGN2":
							blnStatus = setValue(WebControl.CHECKBOX, IdentifyBy.NAME, "form_1035Exhange:ax21035Page1:exch1035_DT:"+ExchangeFormNo+":Owner2ApplicantSign2_CB", validateInput(strHashValue), "OWNER_PAGE2_SIGN2", currentScreen);
							break;
						case"ASSIGNEE_SIGN":
							blnStatus = setValue(WebControl.CHECKBOX, IdentifyBy.NAME, "form_1035Exhange:ax21035Page1:exch1035_DT:"+ExchangeFormNo+":SignatureOfAssignee_CB", validateInput(strHashValue), "ASSIGNEE_SIGN", currentScreen);
							break;
						case"OWNER_PAGE2_DATE1":
							blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_1035Exhange:ax21035Page1:exch1035_DT:"+ExchangeFormNo+":Owner1Appdate_EF", validateInput(strHashValue), "OWNER_PAGE2_DATE1", currentScreen);
							break;
						case"OWNER_PAGE2_DATE2":
							blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_1035Exhange:ax21035Page1:exch1035_DT:"+ExchangeFormNo+":Owner22Appdate_EF", validateInput(strHashValue), "OWNER_PAGE2_DATE2", currentScreen);
							break;
						case"ASSIGNEE_DATE":
							blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_1035Exhange:ax21035Page1:exch1035_DT:"+ExchangeFormNo+":SignatureOfAssignee_EF", validateInput(strHashValue), "ASSIGNEE_DATE", currentScreen);
							break;
							
						case"COORPORATION_NAME":
							blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_1035Exhange:ax21035Page1:exch1035_DT:"+ExchangeFormNo+":CorporationOrTrust_EF", validateInput(strHashValue), "COORPORATION_NAME", currentScreen);
							break;
							
						case"OFFICER_PAGE2_SIGN1":
							blnStatus = setValue(WebControl.CHECKBOX, IdentifyBy.NAME, "form_1035Exhange:ax21035Page1:exch1035_DT:"+ExchangeFormNo+":Officer1ApplicantSign_CB", validateInput(strHashValue), "OFFICER_PAGE2_SIGN1", currentScreen);
							break;
						case"OFFICER_PAGE2_SIGN2":
							blnStatus = setValue(WebControl.CHECKBOX, IdentifyBy.NAME, "form_1035Exhange:ax21035Page1:exch1035_DT:"+ExchangeFormNo+":Officer2ApplicantSign2_CB", validateInput(strHashValue), "OFFICER_PAGE2_SIGN2", currentScreen);
							break;
						case"OFFICER_PAGE2_DATE1":
							blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_1035Exhange:ax21035Page1:exch1035_DT:"+ExchangeFormNo+":Officer1Appdate_EF", validateInput(strHashValue), "OFFICER_PAGE2_DATE1", currentScreen);
							break;
						case"OFFICER_PAGE2_DATE2":
							blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_1035Exhange:ax21035Page1:exch1035_DT:"+ExchangeFormNo+":Officer22Appdate_EF", validateInput(strHashValue), "OFFICER_PAGE2_DATE2", currentScreen);
							break;
						case"OFFICER_TITLE":
							blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_1035Exhange:ax21035Page1:exch1035_DT:"+ExchangeFormNo+":TitleOfOfficer_EF", validateInput(strHashValue), "OFFICER_TITLE", currentScreen);
							break;	
							
						case"TRUSTEE_PAGE2_SIGN1":
							blnStatus = setValue(WebControl.CHECKBOX, IdentifyBy.NAME, "form_1035Exhange:ax21035Page1:exch1035_DT:"+ExchangeFormNo+":Trustee1ApplicantSign_CB", validateInput(strHashValue), "TRUSTEE_PAGE2_SIGN1", currentScreen);
							break;
						case"TRUSTEE_PAGE2_SIGN2":
							blnStatus = setValue(WebControl.CHECKBOX, IdentifyBy.NAME, "form_1035Exhange:ax21035Page1:exch1035_DT:"+ExchangeFormNo+":Trustee2ApplicantSign2_CB", validateInput(strHashValue), "TRUSTEE_PAGE2_SIGN2", currentScreen);
							break;
						case"TRUSTEE_PAGE2_DATE1":
							blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_1035Exhange:ax21035Page1:exch1035_DT:"+ExchangeFormNo+":Trustee1Appdate_EF", validateInput(strHashValue), "TRUSTEE_PAGE2_DATE1", currentScreen);
							break;
						case"TRUSTEE_PAGE2_DATE2":
							blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_1035Exhange:ax21035Page1:exch1035_DT:"+ExchangeFormNo+":Trustee22Appdate_EF", validateInput(strHashValue), "TRUSTEE_PAGE2_DATE2", currentScreen);
							break;
						case"TRUSTEE_TITLE":
							blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_1035Exhange:ax21035Page1:exch1035_DT:"+ExchangeFormNo+":TitleOfTrustee_EF", validateInput(strHashValue), "TRUSTEE_TITLE", currentScreen);
							break;
						
						case "default1": 
							ReportGenerator.generateTestStep(false, currentScreen, "Field Navigation", strHashKey + " field not available in the current method.", false);
							break;
						} //end of switch
						if(!blnStatus) break;
					} //end of while																	
				}
				else {
					ReportGenerator.generateTestStep(false, currentScreen, "Switch to Frame", "Failed to switch frames " + strFrames.replaceAll(GlobalData.STRING_SEPARATOR, " > "), false);
					blnStatus = false;
				}
				objEnum = null;
			//}
				
		} catch(Exception objExp) {
			ReportGenerator.generateTestStep(false, currentScreen, "Exception occured", "Exception is - " + objExp.getMessage(), false);
			blnStatus = false;
		}
		return blnStatus;
	}
	
	private static boolean NOR_CRIA(OrderedHashtable objTestData) {
		boolean blnStatus = false;
		String strHashKey = "", strHashValue = "";
		String CRIASection="";
		try {
			
			
			String strFrames = "mainContentFrame" + GlobalData.STRING_SEPARATOR + "contentRightFrame" + GlobalData.STRING_SEPARATOR + "file" + GlobalData.STRING_SEPARATOR + "file";
			Enumeration objEnum = objTestData.enumerateKeys();
			//if(waitForPageLoad(MAX_TIMEOUT)) {
			
			
				if(switchToFrame(strFrames, false) && waitForPageLoad(MAX_TIMEOUT)) {
					
					while(objEnum.hasMoreElements()) {
						//blnStatus = false;
						strHashKey = objEnum.nextElement().toString();
						strHashValue = objTestData.get(strHashKey).toString();
						
						
						switch(strHashKey) 
						
						{
						
						case"CRIA_Section":  
							CRIASection=strHashValue;
							System.out.println(CRIASection);							
							Thread.sleep(1000);
							blnStatus = true;
							
							break;
						case"OWNER_FirstName": 										   
																		
							blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_CRIA:CRIA_PG:cria_DT:"+CRIASection+":OwnerFirst1_EF", validateInput(strHashValue), "OWNER_FirstName", currentScreen);
							break;
						case"OWNER_LastName":
							blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_CRIA:CRIA_PG:cria_DT:"+CRIASection+":OwnerLast1_EF", validateInput(strHashValue), "OWNER_LastName", currentScreen);
							break;
						case"OWNER_SSN":
							blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_CRIA:CRIA_PG:cria_DT:"+CRIASection+":GovtID_Num_I", validateInput(strHashValue), "OWNER_SSN", currentScreen);
							break;
						case"OWNER_DOB":
							blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_CRIA:CRIA_PG:cria_DT:"+CRIASection+":ownerDOB_EF", validateInput(strHashValue), "OWNER_DOB", currentScreen);
							break;
						case"JOINT_OWNER_FirstName":									   
							blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_CRIA:CRIA_PG:cria_DT:"+CRIASection+":JointOwnerFirst1_EF", validateInput(strHashValue), "JOINT_FirstName", currentScreen);
							break;
						case"JOINT_OWNER_LastName":
							blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_CRIA:CRIA_PG:cria_DT:"+CRIASection+":JointOwnerLast1_EF", validateInput(strHashValue), "JOINT_LastName", currentScreen);
							break;
						case"JOINT_OWNER_SSN":
							blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_CRIA:CRIA_PG:cria_DT:"+CRIASection+":jointOwnerGovtID_Num_I", validateInput(strHashValue), "JOINT_OWNER_SSN", currentScreen);
							break;
						case"JOINT_OWNER_DOB":
							blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_CRIA:CRIA_PG:cria_DT:"+CRIASection+":jointOwnerDOB_EF", validateInput(strHashValue), "JOINT_OWNER_DOB", currentScreen);
							break;
						case"INSURED_FirstName":
							blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_CRIA:CRIA_PG:cria_DT:"+CRIASection+":InsFirst1_EF", validateInput(strHashValue), "INSURED_FirstName", currentScreen);
							break;
						case"INSURED_LASTName":
							blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_CRIA:CRIA_PG:cria_DT:"+CRIASection+":InsLast1_EF", validateInput(strHashValue), "INSURED_LASTName", currentScreen);
							break;
						case"INSURED_SSN":
							blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_CRIA:CRIA_PG:cria_DT:"+CRIASection+":insuredGovtID_Num_I", validateInput(strHashValue), "INSURED_SSN", currentScreen);
							break;
						case"INSURED_DOB":
							blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_CRIA:CRIA_PG:cria_DT:"+CRIASection+":insuredDOB_EF", validateInput(strHashValue), "INSURED_DOB", currentScreen);
							break;
						
						case"Company_Name":  
							blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_CRIA:CRIA_PG:cria_DT:"+CRIASection+":existingCarrier_DD", validateInput(strHashValue), "Company_Name", currentScreen);
							break;
						case"POLICY_NO":
							blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_CRIA:CRIA_PG:cria_DT:"+CRIASection+":existingPolicy_IT", validateInput(strHashValue), "POLICY_NO", currentScreen);
							break;
						case"ADD_DETAILS": 
							
							blnStatus = setValue(WebControl.BUTTON, IdentifyBy.NAME, "form_CRIA:CRIA_PG:cria_DT:"+CRIASection+":existContractTableAdd_CButton", validateInput(strHashValue), "ADD_OWNER_DETAILS", currentScreen);
							break;
						case"AGENT_FirstName":
							blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_CRIA:CRIA_PG:cria_DT:"+CRIASection+":FPNameFirst1_EF", validateInput(strHashValue), "AGENT_FirstName", currentScreen);
							break;
						case"AGENT_LastName":
							blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_CRIA:CRIA_PG:cria_DT:"+CRIASection+":FPNameLast1_EF", validateInput(strHashValue), "AGENT_LastName", currentScreen);
							break;

						case"FIRM":
							blnStatus = setValue(WebControl.CHECKBOX, IdentifyBy.NAME, "form_CRIA:CRIA_PG:cria_DT:"+CRIASection+":firm_CB", validateInput(strHashValue), "FIRM", currentScreen);
							break;

						case"PHONE":
							blnStatus = setValue(WebControl.CHECKBOX, IdentifyBy.NAME, "form_CRIA:CRIA_PG:cria_DT:"+CRIASection+":phone_CB", validateInput(strHashValue), "PHONE", currentScreen);
							break;

						case"FAX":
							blnStatus = setValue(WebControl.CHECKBOX, IdentifyBy.NAME, "form_CRIA:CRIA_PG:cria_DT:"+CRIASection+":fax_CB", validateInput(strHashValue), "FAX", currentScreen);
							break;

						case"ADDRESS":
							blnStatus = setValue(WebControl.CHECKBOX, IdentifyBy.NAME, "form_CRIA:CRIA_PG:cria_DT:"+CRIASection+":address_CB", validateInput(strHashValue), "ADDRESS", currentScreen);
							break;
						case"OWNER_SIGN":
							blnStatus = setValue(WebControl.CHECKBOX, IdentifyBy.NAME, "form_CRIA:CRIA_PG:cria_DT:"+CRIASection+":ownerSignDN_CB", validateInput(strHashValue), "OWNER_SIGN", currentScreen);
							break;	
						case"OWNER_DATE":
							blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_CRIA:CRIA_PG:cria_DT:"+CRIASection+":ownerDateDN_EF", validateInput(strHashValue), "OWNER_DATE", currentScreen);
							break;
						case"JOINTOWNER_SIGN":
							blnStatus = setValue(WebControl.CHECKBOX, IdentifyBy.NAME, "form_CRIA:CRIA_PG:cria_DT:"+CRIASection+":jOwnerSignDN_CB", validateInput(strHashValue), "JOINTOWNER_SIGN", currentScreen);
							break;	
						case"JOINTOWNER_DATE":
							blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_CRIA:CRIA_PG:cria_DT:"+CRIASection+":jOwnerDateDN_EF", validateInput(strHashValue), "JOINTOWNER_DATE", currentScreen);
							break;
						case "default1": 
							ReportGenerator.generateTestStep(false, currentScreen, "Field Navigation", strHashKey + " field not available in the current method.", false);
							break;
						} //end of switch
						if(!blnStatus) break;
					} //end of while																	
				}
				else {
					ReportGenerator.generateTestStep(false, currentScreen, "Switch to Frame", "Failed to switch frames " + strFrames.replaceAll(GlobalData.STRING_SEPARATOR, " > "), false);
					blnStatus = false;
				}
				objEnum = null;
			//}
				
		} catch(Exception objExp) {
			ReportGenerator.generateTestStep(false, currentScreen, "Exception occured", "Exception is - " + objExp.getMessage(), false);
			blnStatus = false;
		}
		return blnStatus;
	}
	
	private static boolean NOR_FL(OrderedHashtable objTestData) {
		boolean blnStatus = false;
		String strHashKey = "", strHashValue = "";
		try {
			
			
			String strFrames = "mainContentFrame" + GlobalData.STRING_SEPARATOR + "contentRightFrame" + GlobalData.STRING_SEPARATOR + "file" + GlobalData.STRING_SEPARATOR + "file";
			Enumeration objEnum = objTestData.enumerateKeys();
			//if(waitForPageLoad(MAX_TIMEOUT)) {
			
			
				if(switchToFrame(strFrames, false) && waitForPageLoad(MAX_TIMEOUT)) {
					
					while(objEnum.hasMoreElements()) {
						//blnStatus = false;
						strHashKey = objEnum.nextElement().toString();
						strHashValue = objTestData.get(strHashKey).toString();
						
						switch(strHashKey) {
						
						case"COMPARATIVE_INFO_FORM":
							blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_NoticeOfReplacement:ax2NotiveOfRpl:proposedInsurance_EF", validateInput(strHashValue), "Comparative info form", currentScreen);
							break;
							
						case"APPLICANT_SIGN":   
																										
							blnStatus = setValue(WebControl.CHECKBOX, IdentifyBy.NAME, "form_NoticeOfReplacement:ax2NotiveOfRpl:applicantSign_CB", validateInput(strHashValue), "APPLICANT_SIGN", currentScreen);
							break;
						case"JOINT_OWNER_SIGN":   					//form_NoticeOfReplacement:noticeOfReplacement:ointOwnerApplicantSign_CB--PR state
							
							blnStatus = setValue(WebControl.CHECKBOX, IdentifyBy.NAME, "form_NoticeOfReplacement:ax2NotiveOfRpl:JointOwnerApplicantSign_CB", validateInput(strHashValue), "JOINT_OWNER_SIGN", currentScreen);
							break;

						case"AGENTS_SIGN":
																						
							blnStatus = setValue(WebControl.CHECKBOX, IdentifyBy.NAME, "form_NoticeOfReplacement:ax2NotiveOfRpl:agentSign_CB", validateInput(strHashValue), "AGENTS_SIGN", currentScreen);
							break;
						case"AGENTS_DATE":  										  
							blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_NoticeOfReplacement:ax2NotiveOfRpl:agentDate_EF", validateInput(strHashValue), "AGENTS_DATE", currentScreen);
							break;
						case"APPLICANT_DATE":                                           	
							blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_NoticeOfReplacement:ax2NotiveOfRpl:appDate_EF", validateInput(strHashValue), "APPLICANT_DATE", currentScreen);
							break;																						
						case"JOINT_OWNER_DATE":    									   //form_NoticeOfReplacement:noticeOfReplacement:ointOwnerDate_EF--PR state
							blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_NoticeOfReplacement:ax2NotiveOfRpl:JointOwnerAppdate_EF", validateInput(strHashValue), "JOINT_OWNER_DATE", currentScreen);
							break;
							
						case"AGENT_FIRST_NAME":
							blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_NoticeOfReplacement:ax2NotiveOfRpl:first1_EF", validateInput(strHashValue), "AGENT_FIRST_NAME", currentScreen);
							break;
						case"AGENT_LAST_NAME":
							blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_NoticeOfReplacement:ax2NotiveOfRpl:last1_EF", validateInput(strHashValue), "AGENT_LAST_NAME", currentScreen);
							break;
						case"AGENT_MIDDLE_NAME":
							blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_NoticeOfReplacement:ax2NotiveOfRpl:middle1_EF", validateInput(strHashValue), "AGENT_MIDDLE_NAME", currentScreen);
							break;
						
						case"AGENTS_COMPANY":
																						
							blnStatus = setValue(WebControl.CHECKBOX, IdentifyBy.NAME, "form_NoticeOfReplacement:ax2NotiveOfRpl:agentLicNo_CB", validateInput(strHashValue), "AGENTS_COMPANY", currentScreen);
							break;
						case"AGENTS_ADDRESS":
							
							blnStatus = setValue(WebControl.CHECKBOX, IdentifyBy.NAME, "form_NoticeOfReplacement:ax2NotiveOfRpl:agentAdd_CB", validateInput(strHashValue), "AGENTS_ADDRESS", currentScreen);
							break;
							
							
						case"COMPANY_NAME":
							blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_NoticeOfReplacement:ax2NotiveOfRpl:InsurerCompanyName_DD", validateInput(strHashValue), "COMPANY NAME", currentScreen);
							break;
						case"POLICY_NO":
							blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_NoticeOfReplacement:ax2NotiveOfRpl:contractNumber_EF", validateInput(strHashValue), "POLICY NO", currentScreen);
							break;
						
						case"INSURED_FIRST_NAME":
							blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_NoticeOfReplacement:ax2NotiveOfRpl:pInsured1First_EF", validateInput(strHashValue), "APPLICANT_FIRST_NAME", currentScreen);
							break;
						case"INSURED_LAST_NAME":									   
							blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_NoticeOfReplacement:ax2NotiveOfRpl:pInsured1Last_EF", validateInput(strHashValue), "APPLICANT_LAST_NAME", currentScreen);
							break;
						case"INSURED_MIDDLE_NAME":
							blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_NoticeOfReplacement:ax2NotiveOfRpl:pInsured1Middle_EF", validateInput(strHashValue), "APPLICANT_MIDDLE_NAME", currentScreen);
							break;
							
						case"ADD":
							
							blnStatus = setValue(WebControl.BUTTON, IdentifyBy.NAME, "form_NoticeOfReplacement:ax2NotiveOfRpl:replacementTableAdd_CButton", validateInput(strHashValue), "ADD", currentScreen);
							break;	
						
						
							
						case "default1":
							ReportGenerator.generateTestStep(false, currentScreen, "Field Navigation", strHashKey + " field not available in the current method.", false);
								break;
						} //end of switch
						if(!blnStatus) break;
					} //end of while																	
				}
				else {
					ReportGenerator.generateTestStep(false, currentScreen, "Switch to Frame", "Failed to switch frames " + strFrames.replaceAll(GlobalData.STRING_SEPARATOR, " > "), false);
					blnStatus = false;
				}
				objEnum = null;
			//}
				
		} catch(Exception objExp) {
			ReportGenerator.generateTestStep(false, currentScreen, "Exception occured", "Exception is - " + objExp.getMessage(), false);
			blnStatus = false;
		}
		return blnStatus;
	}
	
	private static boolean NOR(OrderedHashtable objTestData) {
		boolean blnStatus = false;
		String strHashKey = "", strHashValue = "";
		try {
			
			
			String strFrames = "mainContentFrame" + GlobalData.STRING_SEPARATOR + "contentRightFrame" + GlobalData.STRING_SEPARATOR + "file"+ GlobalData.STRING_SEPARATOR + "file"+GlobalData.STRING_SEPARATOR + "file";
			Enumeration objEnum = objTestData.enumerateKeys();
			//if(waitForPageLoad(MAX_TIMEOUT)) {
			
			
				if(switchToFrame(strFrames, false) && waitForPageLoad(MAX_TIMEOUT)) {
					
					while(objEnum.hasMoreElements()) {
						//blnStatus = false;
						strHashKey = objEnum.nextElement().toString();
						strHashValue = objTestData.get(strHashKey).toString();
						
						switch(strHashKey) {
						
						case"DISCONTINUING":   										  //form_NoticeOfReplacement:ax2NoticeRepl:replacementQuestionsTablePane:0:Q55Ans_DD
							//blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_NoticeOfReplacement:ax2SalesIllustration:replacementQuestionsTablePane:0:Q55Ans_DD", validateInput(strHashValue), "Discontinuing", currentScreen);
								blnStatus = setValue(WebControl.SELECT, IdentifyBy.XPATH, "//select[contains(@name,'replacementQuestionsTablePane:0:Q55Ans_DD')]", validateInput(strHashValue), "Discontinuing", currentScreen);
								break;
						case"USING_FUNDS":   														
							blnStatus = setValue(WebControl.SELECT, IdentifyBy.XPATH, "//select[contains(@name,'replacementQuestionsTablePane:1:Q55Ans_DD')]", validateInput(strHashValue), "Using Funds", currentScreen);
							break;
							
						case"COMPANY_NAME":   						
							blnStatus = setValue(WebControl.SELECT, IdentifyBy.XPATH, "//select[contains(@name,'InsurerCompanyName_DD')]", validateInput(strHashValue), "COMPANY_NAME", currentScreen);
							break;
						case"REPLACE_FINANCING":   						
							blnStatus = setValue(WebControl.SELECT, IdentifyBy.XPATH, "//select[contains(@name,'proposedInsurance_EF')]", validateInput(strHashValue), "COMPANY_NAME", currentScreen);
							break;
						case"POLICY_NO":                                       
							blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.XPATH, "//input[contains(@name,'contractNumber_EF')]", validateInput(strHashValue), "POLICY_NO", currentScreen);
							break;
						case"INSURED_FIRST_NAME":    
							blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.XPATH, "//input[contains(@name,'pInsured1First_EF')]", validateInput(strHashValue), "APPLICANT_FIRST_NAME", currentScreen);
							break;
						case"INSURED_LAST_NAME":									  
							blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.XPATH, "//input[contains(@name,'pInsured1Last_EF')]", validateInput(strHashValue), "APPLICANT_LAST_NAME", currentScreen);
							break;
						case"ADD_DETAILS":  
							blnStatus = setValue(WebControl.BUTTON, IdentifyBy.XPATH, "//input[contains(@name,'replacementTableAdd_CButton')]", validateInput(strHashValue), "ADD_DETAILS", currentScreen);
							break;
						case"MAKESURE_FACTS":											 
																	
							blnStatus = setValue(WebControl.CHECKBOX, IdentifyBy.XPATH, "//input[contains(@name,'explForReplacement_CB')]", validateInput(strHashValue), "Make sure facts", currentScreen);
							break;
						case"APPLICANT_SIGN":											 
																
							blnStatus = setValue(WebControl.CHECKBOX, IdentifyBy.XPATH, "//input[contains(@name,'applicantSign_CB')]", validateInput(strHashValue), "APPLICANT_SIGN", currentScreen);
							break;
						case"APPLICANT_DATE":                                         
							blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.XPATH, "//input[ contains(@name,'date_EF')]", validateInput(strHashValue), "APPLICANT_DATE", currentScreen);
							break;
							
						case "APPLICANT_TYPE":
							
							blnStatus = setValue(WebControl.RADIOBOX, IdentifyBy.NAME, "form_NoticeOfReplacement:ax2NoticeRepl:personEntityType_RB", getAppRadioValues(strHashKey, strHashValue), "Application Origin", currentScreen);
							break;	//form_NoticeOfReplacement:ax2NoticeRepl:Entity_EF
						case"APPLICANT_ENTITY":  
							blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.XPATH, "//input[contains(@name,'Entity_EF') ]", validateInput(strHashValue), "APPLICANT_FIRST_NAME", currentScreen);
							break;
						case "JOINT_OWNER_TYPE":
							
							blnStatus = setValue(WebControl.RADIOBOX, IdentifyBy.NAME, "form_NoticeOfReplacement:ax2NoticeRepl:personEntityTypeJI_RB", getAppRadioValues(strHashKey, strHashValue), "Application Origin", currentScreen);
							break;
						case"JOINT_OWNER_ENTITY":  
							blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.XPATH, "//input[contains(@name,'EntityJI_EF') ]", validateInput(strHashValue), "APPLICANT_FIRST_NAME", currentScreen);
							break;
							//form_NoticeOfReplacement:ax2NoticeRepl:EntityJI_EF
							
						case"APPLICANT_FIRST_NAME":  
							blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.XPATH, "//input[contains(@name,'first_EF') ]", validateInput(strHashValue), "APPLICANT_FIRST_NAME", currentScreen);
							break;
						case"APPLICANT_LAST_NAME":									   
							blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.XPATH, "//input[contains(@name,'last_EF')]", validateInput(strHashValue), "APPLICANT_LAST_NAME", currentScreen);
							break;
						case"JOINT_OWNER_SIGN":
																								
							blnStatus = setValue(WebControl.CHECKBOX, IdentifyBy.XPATH, "//input[contains(@name,'jointOwnersSign_CB')]", validateInput(strHashValue), "JOINT_OWNER_SIGN", currentScreen);
							break;
						case"JOINT_OWNER_DATE":  					
							blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.XPATH, "//input[contains(@name,'jointOwnerDateOn_EF')]", validateInput(strHashValue), "JOINT_OWNER_DATE", currentScreen);
							break;
						case"OWNER_FIRST_NAME":  
							blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.XPATH, "//input[contains(@name,'jointOwnersNamefirst1_EF')]", validateInput(strHashValue), "OWNER_FIRST_NAME", currentScreen);
							break;
						case"OWNER_LAST_NAME":  
							blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.XPATH, "//input[contains(@name,'jointOwnersNamelast1_EF')]", validateInput(strHashValue), "OWNER_LAST_NAME", currentScreen);
							break;

						case"AGENTS_SIGN":   
															
							blnStatus = setValue(WebControl.CHECKBOX, IdentifyBy.XPATH, "//input[contains(@name,'finProfOrBrokerSign_CB') ]", validateInput(strHashValue), "AGENTS_SIGN", currentScreen);
							break;
						
						case"AGENTS_DATE":   											
							blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.XPATH, "//input[contains(@name,'dateOn_EF')]", validateInput(strHashValue), "AGENTS_DATE", currentScreen);
							break;
													//form_NoticeOfReplacement:ax2SalesIllustration:first1_EF
						case"AGENT_FIRST_NAME":  //form_NoticeOfReplacement:ax2NoticeRepl:first1_EF
							blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.XPATH, "//input[contains(@name,'ax2NoticeRepl:first1_EF')]", validateInput(strHashValue), "AGENT_FIRST_NAME", currentScreen);
							break;
						case"AGENT_LAST_NAME":  
							blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.XPATH, "//input[contains(@name,'ax2NoticeRepl:last1_EF')]", validateInput(strHashValue), "AGENT_LAST_NAME", currentScreen);
							break;
						
						case"PAGE2":
							//form_NoticeOfReplacement:ax2SalesIllustration:Page2Received_CB												form_NoticeOfReplacement:ax2NoticeRepl:Page2Received_CB
							blnStatus = setValue(WebControl.CHECKBOX, IdentifyBy.NAME, "form_NoticeOfReplacement:ax2NoticeRepl:Page2Received_CB", validateInput(strHashValue), "PAGE2", currentScreen);
							break;	
							
						case "default1":
								ReportGenerator.generateTestStep(false, currentScreen, "Field Navigation", strHashKey + " field not available in the current method.", false);
									break;
						} //end of switch
						if(!blnStatus) break;
					} //end of while																	
				}
				else {
					ReportGenerator.generateTestStep(false, currentScreen, "Switch to Frame", "Failed to switch frames " + strFrames.replaceAll(GlobalData.STRING_SEPARATOR, " > "), false);
					blnStatus = false;
				}
				objEnum = null;
			//}
				
		} catch(Exception objExp) {
			ReportGenerator.generateTestStep(false, currentScreen, "Exception occured", "Exception is - " + objExp.getMessage(), false);
			blnStatus = false;
		}
		return blnStatus;
	}
	
	private static boolean SalesMaterialIPopup(OrderedHashtable objTestData) {
		boolean blnStatus = false;
		String strHashKey = "", strHashValue = "";
		try {
			
			
			String strFrames = "FWin0" + GlobalData.STRING_SEPARATOR + "Content0";
			Enumeration objEnum = objTestData.enumerateKeys();
			//if(waitForPageLoad(MAX_TIMEOUT)) {
			
			
				if(switchToFrame(strFrames, false) && waitForPageLoad(MAX_TIMEOUT)) {
					
					while(objEnum.hasMoreElements()) {
						//blnStatus = false;
						strHashKey = objEnum.nextElement().toString();
						strHashValue = objTestData.get(strHashKey).toString();
						
						switch(strHashKey) {
						
						case"CLIENT_BROUCHER":													
							blnStatus = setValue(WebControl.UNIQUE_CHECKBOX, IdentifyBy.NAME, "form_salesMaterialTypes:salesMaterialUsed_DD", getAppCheckboxValues(strHashKey, strHashValue), "Client Broucher", currentScreen);
							break;
						case"TERM_ANALYSIS":
							blnStatus = setValue(WebControl.UNIQUE_CHECKBOX, IdentifyBy.NAME, "form_salesMaterialTypes:salesMaterialUsed_DD", getAppCheckboxValues(strHashKey, strHashValue), "Term Analysis", currentScreen);
							break;
						case"VALUE_STAY_PARENT":
							blnStatus = setValue(WebControl.UNIQUE_CHECKBOX, IdentifyBy.NAME, "form_salesMaterialTypes:salesMaterialUsed_DD", getAppCheckboxValues(strHashKey, strHashValue), "Value Stay parent", currentScreen);
							break;
						case"LIFE_SEC_GUIDE":
							blnStatus = setValue(WebControl.UNIQUE_CHECKBOX, IdentifyBy.NAME, "form_salesMaterialTypes:salesMaterialUsed_DD", getAppCheckboxValues(strHashKey, strHashValue), "LIFE_SEC_GUIDE", currentScreen);
							break;
						case"LIFE_PRIVATE_RESERVE":
							blnStatus = setValue(WebControl.UNIQUE_CHECKBOX, IdentifyBy.NAME, "form_salesMaterialTypes:salesMaterialUsed_DD", getAppCheckboxValues(strHashKey, strHashValue), "LIFE_PRIVATE_RESERVE", currentScreen);
							break;
						case"BUY_SELL_PAY":
							blnStatus = setValue(WebControl.UNIQUE_CHECKBOX, IdentifyBy.NAME, "form_salesMaterialTypes:salesMaterialUsed_DD", getAppCheckboxValues(strHashKey, strHashValue), "BUY_SELL_PAY", currentScreen);
							break;
						case"ROTH_ALTERNATIVE":
							blnStatus = setValue(WebControl.UNIQUE_CHECKBOX, IdentifyBy.NAME, "form_salesMaterialTypes:salesMaterialUsed_DD", getAppCheckboxValues(strHashKey, strHashValue), "ROTH_ALTERNATIVE", currentScreen);
							break;
						case"SMOOTH_SAILING":
							blnStatus = setValue(WebControl.UNIQUE_CHECKBOX, IdentifyBy.NAME, "form_salesMaterialTypes:salesMaterialUsed_DD", getAppCheckboxValues(strHashKey, strHashValue), "SMOOTH_SAILING", currentScreen);
							break;
						case"FACT":
							blnStatus = setValue(WebControl.UNIQUE_CHECKBOX, IdentifyBy.NAME, "form_salesMaterialTypes:salesMaterialUsed_DD", getAppCheckboxValues(strHashKey, strHashValue), "FACT", currentScreen);
							break;
						case"ROPR":
							blnStatus = setValue(WebControl.UNIQUE_CHECKBOX, IdentifyBy.NAME, "form_salesMaterialTypes:salesMaterialUsed_DD", getAppCheckboxValues(strHashKey, strHashValue), "ROPR", currentScreen);
							break;
						case"Sales_OK":
							blnStatus = setValue(WebControl.BUTTON, IdentifyBy.NAME, "form_salesMaterialTypes:salesTypeOK", validateInput(strHashValue), "Sales OK", currentScreen);
							break;

						case "default1":
							ReportGenerator.generateTestStep(false, currentScreen, "Field Navigation", strHashKey + " field not available in the current method.", false);
							break;
						} //end of switch
						if(!blnStatus) break;
					} //end of while																	
				}
				else {
					ReportGenerator.generateTestStep(false, currentScreen, "Switch to Frame", "Failed to switch frames " + strFrames.replaceAll(GlobalData.STRING_SEPARATOR, " > "), false);
					blnStatus = false;
				}
				objEnum = null;
			//}
				
		} catch(Exception objExp) {
			ReportGenerator.generateTestStep(false, currentScreen, "Exception occured", "Exception is - " + objExp.getMessage(), false);
			blnStatus = false;
		}
		return blnStatus;
	}
	
	private static boolean VMT(OrderedHashtable objTestData) {
		boolean blnStatus = false;
		String strHashKey = "", strHashValue = "";
		try {
			String strFrames = "axaVisualMgmtToolFrame.jsp";
			Enumeration objEnum = objTestData.enumerateKeys();
			//if(waitForPageLoad(MAX_TIMEOUT)) {
				if(gobjWebDriver.switchTo().frame(0) != null) {
					while(objEnum.hasMoreElements()) {
						//blnStatus = false;
						strHashKey = objEnum.nextElement().toString();
						strHashValue = objTestData.get(strHashKey).toString();
						
						switch(strHashKey) {
							case "LEFT_SYMBOL":
								blnStatus = setValue(WebControl.BUTTON, IdentifyBy.XPATH, "//div[@class='flap']", validateInput(strHashValue), "LEFTE_SIDE_SYMBOL", currentScreen);
								break;                                                                                                        
							case "UW_NAME":
								/*gobjWebDriver.switchTo().frame(0);*/
								Thread.sleep(5000);
								blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "vmtMenuForm:userMenu", validateInput(strHashValue), "UW_NAME", currentScreen);
								break;
							case "VIEW":												    
								blnStatus = setValue(WebControl.RADIOBOX, IdentifyBy.NAME, "vmtMenuForm:viewMode", getAppRadioValues(strHashKey, strHashValue), "Application Origin", currentScreen);
								Thread.sleep(MIC_TIMEOUT*1000);
								break;
							
							case "GO":
								blnStatus = setValue(WebControl.BUTTON, IdentifyBy.NAME, "vmtMenuForm:Submit", validateInput(strHashValue), "LEFTE_SIDE_SYMBOL", currentScreen);
								break;
							case "POLICY_NO":
								blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.ID, "globalSearchInput", validateInput(strHashValue), "SEARCH_POLICY", currentScreen);
								waitForPageLoad(MIN_TIMEOUT);
								break;
								
							case "SELECT_POLICY_OPEN_ONEVIEW":
								String policy=strHashValue;
								System.out.println(policy);
								WebElement element = gobjWebDriver.findElement(By.xpath("//td[text()='"+policy+"']"));
								JavascriptExecutor executor = (JavascriptExecutor)gobjWebDriver;
								executor.executeScript("arguments[0].click();", element);
								System.out.println(policy);
								Actions action = new Actions(gobjWebDriver).contextClick(element);
								action.build().perform();//ONE View
								/*WebElement elementt = gobjWebDriver.findElement(By.xpath("//div[text()='ONE View']"));
								JavascriptExecutor executorr = (JavascriptExecutor)gobjWebDriver;
								executorr.executeScript("arguments[0].click();", elementt);	*/
								blnStatus = setValue(WebControl.BUTTON, IdentifyBy.XPATH, "//div[text()='ONE View']", validateInput(strHashValue), "SELECT_POLICY_OPEN_ONEVIEW", currentScreen);
								waitForPageLoad(MAX_TIMEOUT);
								String cHandle = gobjWebDriver.getWindowHandle();
								waitForWindowAndSwitch(cHandle, "ONE View", false);
								waitForPageLoad(MAX_TIMEOUT);
								System.out.println("Sucessfully switched");
								String actualTitle = gobjWebDriver.getTitle();
								System.out.println(actualTitle);
								break;
								
							case "default1":
								ReportGenerator.generateTestStep(false, currentScreen, "Field Navigation", strHashKey + " field not available in the current method.", false);
								break;
						} //end of switch
						if(!blnStatus) break;
					} //end of while
				}
				else {
					ReportGenerator.generateTestStep(false, currentScreen, "Switch to Frame", "Failed to switch frames " + strFrames.replaceAll(GlobalData.STRING_SEPARATOR, " > "), false);
					blnStatus = false;
				}
				objEnum = null;
			//}
				
		} catch(Exception objExp) {
			ReportGenerator.generateTestStep(false, currentScreen, "Exception occured", "Exception is - " + objExp.getMessage(), false);
			blnStatus = false;
		}
		return blnStatus;
	}
	
private static boolean ONEVIEW(OrderedHashtable objTestData) {
		boolean blnStatus = false;
		String strHashKey = "", strHashValue = "";
		try {
			String strFrames = "axaVisualMgmtToolFrame.jsp";
			Enumeration objEnum = objTestData.enumerateKeys();
			//if(waitForPageLoad(MAX_TIMEOUT)) {
				if(gobjWebDriver.switchTo().frame(0) != null) {
					while(objEnum.hasMoreElements()) {
						//blnStatus = false;
						strHashKey = objEnum.nextElement().toString();
						strHashValue = objTestData.get(strHashKey).toString();
						
						switch(strHashKey) {
							                                                                                                  
							case "ADD_REQUIREMENTS":
								blnStatus = setValue(WebControl.BUTTON, IdentifyBy.NAME, "buttonOrdReq", validateInput(strHashValue), "ADD_REQUIREMENTS", currentScreen);
								break;
							case "IMPAIRMENTS":
								blnStatus = setValue(WebControl.BUTTON, IdentifyBy.NAME, "buttonImpairment", validateInput(strHashValue), "IMPAIRMENTS", currentScreen);
								break;										
							case "VIEW_REQUIREMENTS":
								waitForPageLoad(MAX_TIMEOUT);
								WebElement elementf = gobjWebDriver.findElement(By.name("clViewAllReqs"));
								JavascriptExecutor executor = (JavascriptExecutor)gobjWebDriver;
								executor.executeScript("arguments[0].click();", elementf);
								//System.out.println(policy);
								//blnStatus = setValue(WebControl.BUTTON, IdentifyBy.NAME, "clViewAllReqs", validateInput(strHashValue), "VIEW_REQUIREMENTS", currentScreen);
								break;
							case "WORK_COMPLETE":
								blnStatus = setValue(WebControl.BUTTON, IdentifyBy.NAME, "buttonWorkComplete", validateInput(strHashValue), "LEFTE_SIDE_SYMBOL", currentScreen);
								blnStatus = setValue(WebControl.BUTTON, IdentifyBy.ID, "alertOK", validateInput(strHashValue), "LEFTE_SIDE_SYMBOL", currentScreen);
							
								break;
							case "OPEN":
								blnStatus = setValue(WebControl.BUTTON, IdentifyBy.NAME, "buttonOpen", validateInput(strHashValue), "LEFTE_SIDE_SYMBOL", currentScreen);
								break;
							case "CLOSE":
								blnStatus = setValue(WebControl.BUTTON, IdentifyBy.NAME, "buttonClose", validateInput(strHashValue), "CLOSE", currentScreen);
								blnStatus = setValue(WebControl.BUTTON, IdentifyBy.XPATH, "//input[@value='YES']", validateInput(strHashValue), "CLOSEPOPUP", currentScreen);
																	
								break;
							case "SAVE":											
								blnStatus = setValue(WebControl.BUTTON, IdentifyBy.NAME, "buttonSave", validateInput(strHashValue), "SAVE", currentScreen);
								break;      
								
							/*case "SELECT_POLICY_OPEN_ONEVIEW":
								String policy=strHashValue;
								System.out.println(policy);
								WebElement element = gobjWebDriver.findElement(By.xpath("//td[text()='"+policy+"']"));
								JavascriptExecutor executor = (JavascriptExecutor)gobjWebDriver;
								executor.executeScript("arguments[0].click();", element);
								System.out.println(policy);
								Actions action = new Actions(gobjWebDriver).contextClick(element);
								action.build().perform();//ONE View
								WebElement elementt = gobjWebDriver.findElement(By.xpath("//div[text()='ONE View']"));
								JavascriptExecutor executorr = (JavascriptExecutor)gobjWebDriver;
								executorr.executeScript("arguments[0].click();", elementt);	
								blnStatus = setValue(WebControl.BUTTON, IdentifyBy.XPATH, "//div[text()='ONE View']", validateInput(strHashValue), "SELECT_POLICY_OPEN_ONEVIEW", currentScreen);
								
								break;*/
								
							case "default1":
								ReportGenerator.generateTestStep(false, currentScreen, "Field Navigation", strHashKey + " field not available in the current method.", false);
								break;
						} //end of switch
						if(!blnStatus) break;
					} //end of while
				}
				else {
					ReportGenerator.generateTestStep(false, currentScreen, "Switch to Frame", "Failed to switch frames " + strFrames.replaceAll(GlobalData.STRING_SEPARATOR, " > "), false);
					blnStatus = false;
				}
				objEnum = null;
			//}
				
		} catch(Exception objExp) {
			ReportGenerator.generateTestStep(false, currentScreen, "Exception occured", "Exception is - " + objExp.getMessage(), false);
			blnStatus = false;
		}
		return blnStatus;
	}

private static boolean CSGReview(OrderedHashtable objTestData) {
	boolean blnStatus = false;
	String strHashKey = "", strHashValue = "";
	try {
		String strFrames = "FWin0" + GlobalData.STRING_SEPARATOR + "Content0";
		Enumeration objEnum = objTestData.enumerateKeys();
		if(switchToFrame(strFrames, false) && waitForPageLoad(MAX_TIMEOUT)) {
			
			while(objEnum.hasMoreElements()) {
				//blnStatus = false;
				strHashKey = objEnum.nextElement().toString();
				strHashValue = objTestData.get(strHashKey).toString();

				switch(strHashKey) {
				
				case"CSG_REVIEW":
					blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_csgReview:csgReviewDecision", validateInput(strHashValue), "PENDING_CLOSURE_DATE:", currentScreen);
					break;
				
				case"COMMIT":
					blnStatus = setValue(WebControl.BUTTON, IdentifyBy.NAME, "form_csgReview:_id6", validateInput(strHashValue), "Commit", currentScreen);
					waitForPageClose(MAX_TIMEOUT);
					strFrames = "mainContentFrame" + GlobalData.STRING_SEPARATOR + "contentLeftFrame" + GlobalData.STRING_SEPARATOR + "file"  + GlobalData.STRING_SEPARATOR + "file"  ;
					if(switchToFrame(strFrames, false)) waitForPageLoad(MAX_TIMEOUT);
					break;
				case "default1":
					ReportGenerator.generateTestStep(false, currentScreen, "Field Navigation", strHashKey + " field not available in the current method.", false);
					break;
									
				} //end of switch
				if(!blnStatus) break;
			} //end of while
		}
		else {
			ReportGenerator.generateTestStep(false, currentScreen, "Switch to Frame", "Failed to switch frames " + strFrames.replaceAll(GlobalData.STRING_SEPARATOR, " > "), false);
			blnStatus = false;
		}
		objEnum = null;
			
	} catch(Exception objExp) {
		ReportGenerator.generateTestStep(false, currentScreen, "Exception occured", "Exception is - " + objExp.getMessage(), false);
		blnStatus = false;
	}
	return blnStatus;
}
	
	private static boolean NOR_RAF(OrderedHashtable objTestData) {
		boolean blnStatus = false;
		String strHashKey = "", strHashValue = "";
		try {
			
			
			String strFrames = "mainContentFrame" + GlobalData.STRING_SEPARATOR + "contentRightFrame" + GlobalData.STRING_SEPARATOR + "file" + GlobalData.STRING_SEPARATOR + "file" + GlobalData.STRING_SEPARATOR + "file";
			Enumeration objEnum = objTestData.enumerateKeys();
			//if(waitForPageLoad(MAX_TIMEOUT)) {
			
			
				if(switchToFrame(strFrames, false) && waitForPageLoad(MAX_TIMEOUT)) {
					
					while(objEnum.hasMoreElements()) {
						//blnStatus = false;
						strHashKey = objEnum.nextElement().toString();
						strHashValue = objTestData.get(strHashKey).toString();
						
						switch(strHashKey) 
						
						{
						
						
						case"OWNER_FirstName":  									   
							blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_RAF:RAF_PG1:raf_DT:0:OwnerFirst1_EF", validateInput(strHashValue), "OWNER_FirstName", currentScreen);
							break;
						case"OWNER_LastName":
							blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_RAF:RAF_PG1:raf_DT:0:OwnerLast1_EF", validateInput(strHashValue), "OWNER_LastName", currentScreen);
							break;
						case"COOWNER_FirstName":									   
							blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_RAF:RAF_PG1:raf_DT:0:JointOwnerFirst1_EF", validateInput(strHashValue), "COOWNER_FirstName", currentScreen);
							break;
						case"COOWNER_LastName":
							blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_RAF:RAF_PG1:raf_DT:0:JointOwnerLast1_EF", validateInput(strHashValue), "COOWNER_LastName", currentScreen);
							break;
						case"INSURED_FirstName":
							blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_RAF:RAF_PG1:raf_DT:0:InsFirst1_EF", validateInput(strHashValue), "INSURED_FirstName", currentScreen);
							break;
						case"INSURED_LASTName":
							blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_RAF:RAF_PG1:raf_DT:0:InsLast1_EF", validateInput(strHashValue), "INSURED_LASTName", currentScreen);
							break;
						case"PRODUCT_Name":  
							blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_RAF:RAF_PG1:raf_DT:0:proposedInsurance_EF", validateInput(strHashValue), "PRODUCT_Name", currentScreen);
							break;
						case"Company_Name":
							blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_RAF:RAF_PG1:raf_DT:0:InsurerCompanyName_DD", validateInput(strHashValue), "Company_Name", currentScreen);
							break;
						case"POLICY_NO":
							blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_RAF:RAF_PG1:raf_DT:0:contractNumber2_EF", validateInput(strHashValue), "Policy No", currentScreen);
							break;
						case"EXISTING_OWNER_FirstName":
							blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_RAF:RAF_PG1:raf_DT:0:OwnerFirst1Tbl_EF", validateInput(strHashValue), "EXISTING_OWNER_FirstName", currentScreen);
							break;
						case"EXISTING_OWNER_LastName":
							blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_RAF:RAF_PG1:raf_DT:0:OwnerLast1Tbl_EF", validateInput(strHashValue), "EXISTING_OWNER_LastName", currentScreen);
							break;
						case"EXISTING_COOWNER_FirstName":
							blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_RAF:RAF_PG1:raf_DT:0:JointOwnerFirst1Tbl_EF", validateInput(strHashValue), "EXISTING_COOWNER_FirstName", currentScreen);
							break;
						case"EXISTING_COOWNER_LastName":
							blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_RAF:RAF_PG1:raf_DT:0:JointOwnerLast1Tbl_EF", validateInput(strHashValue), "EXISTING_COOWNER_LastName", currentScreen);
							break;
						case"EXISTING_INSURED_FirstName":
							blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_RAF:RAF_PG1:raf_DT:0:InsFirst1Tbl_EF", validateInput(strHashValue), "EXISTING_INSURED_FirstName", currentScreen);
							break;
						case"EXISTING_INSURED_LASTName":
							blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_RAF:RAF_PG1:raf_DT:0:InsLast1Tbl_EF", validateInput(strHashValue), "EXISTING_INSURED_LASTName", currentScreen);
							break;
						case"EXISTING_PRODUCT_Name":  
							blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_RAF:RAF_PG1:raf_DT:0:proposedInsuranceTbl_EF", validateInput(strHashValue), "EXISTING_PRODUCT_Name", currentScreen);
							break;
						case"EXISTING_Company_Name":  
							blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_RAF:RAF_PG1:raf_DT:0:InsurerCompanyNameTbl_DD", validateInput(strHashValue), "EXISTING_Company_Name", currentScreen);
							break;
						case"EXISTING_POLICY_NO":
							blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_RAF:RAF_PG1:raf_DT:0:contractNumber2Tbl_EF", validateInput(strHashValue), "EXISTING_POLICY_NO", currentScreen);
							break;
						case"ADD_DETAILS": 
							//blnStatus = setValue(WebControl.BUTTON, IdentifyBy.NAME, "form_RAF:RAF_PG1:raf_DT:0:replacementTableAdd_CButton", validateInput(strHashValue), "ADD_OWNER_DETAILS", currentScreen);
							JavascriptExecutor executor = (JavascriptExecutor)gobjWebDriver;
							try{
								WebElement element = gobjWebDriver.findElement(By.name("form_RAF:RAF_PG1:raf_DT:0:replacementTableAdd_CButton"));
									
									executor.executeScript("arguments[0].click();", element);
									blnStatus = true;
									waitForPageLoad(MIN_TIMEOUT);
								}
							catch(Exception exp){
								blnStatus = false;
								
							}
							if(blnStatus) {
								ReportGenerator.generateTestStep(true, currentScreen, " Click ADD to list ", strHashValue + " successfully clicked", true);
							}
							else {
								ReportGenerator.generateTestStep(false, currentScreen, "Click ADD to list", strHashValue + " object not displayed in expected time.", true);
							}

							break;	
						case"PRINTED_OWNER_FirstName": 								   
							blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_RAF:RAF_PG1:raf_DT:0:OwnerFirst1Page2_EF", validateInput(strHashValue), "PRINTED_OWNER_FirstName", currentScreen);
							break;
						case"PRINTED_OWNER_LastName":
							blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_RAF:RAF_PG1:raf_DT:0:OwnerLast1Page2_EF", validateInput(strHashValue), "PRINTED_OWNER_LastName", currentScreen);
							break;
						case"PRINTED_POLICY_NO":
							blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_RAF:RAF_PG1:raf_DT:0:replacedPolicyTblTb12l_EF", validateInput(strHashValue), "PRINTED_POLICY_NO", currentScreen);
							break;
						case"ADD_OWNER_DETAILS":  
							blnStatus = setValue(WebControl.BUTTON, IdentifyBy.NAME, "form_RAF:RAF_PG1:raf_DT:0:replacementTableAdd23_CButton", validateInput(strHashValue), "ADD_OWNER_DETAILS", currentScreen);
							break;
						case"OWNER_SIGN":
							blnStatus = setValue(WebControl.CHECKBOX, IdentifyBy.NAME, "form_RAF:RAF_PG1:raf_DT:0:OwnerApplicantSign_CB", validateInput(strHashValue), "OWNER_SIGN", currentScreen);
							break;	
						case"OWNER_DATE":
							blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_RAF:RAF_PG1:raf_DT:0:OwnerAppdate_EF", validateInput(strHashValue), "OWNER_DATE", currentScreen);
							break;
						case"JOINTOWNER_SIGN":
							blnStatus = setValue(WebControl.CHECKBOX, IdentifyBy.NAME, "form_RAF:RAF_PG1:raf_DT:0:JointOwnerApplicantSign_CB", validateInput(strHashValue), "JOINTOWNER_SIGN", currentScreen);
							break;	
						case"JOINTOWNER_DATE":
							blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_RAF:RAF_PG1:raf_DT:0:JointOwnerAppdate_EF", validateInput(strHashValue), "JOINTOWNER_DATE", currentScreen);
							break;
						case"AGENT_FirstName":
							blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_RAF:RAF_PG1:raf_DT:0:fpFirst1Page2_EF", validateInput(strHashValue), "AGENT_FirstName", currentScreen);
							break;
						case"AGENT_LastName":
							blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_RAF:RAF_PG1:raf_DT:0:fpLast1Page2_EF", validateInput(strHashValue), "AGENT_LastName", currentScreen);
							break;
						case"AGENT_SIGN":
							blnStatus = setValue(WebControl.CHECKBOX, IdentifyBy.NAME, "form_RAF:RAF_PG1:raf_DT:0:fpSignDN_CB", validateInput(strHashValue), "AGENT_SIGN", currentScreen);
							break;	
						case"AGENT_DATE":
							blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_RAF:RAF_PG1:raf_DT:0:fpDateDN_EF", validateInput(strHashValue), "AGENT_DATE", currentScreen);
							break;
						case"RAF2_OWNER_FirstName":
							blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_RAF:RAF_PG1:raf_DT:1:OwnerFirst1_EF", validateInput(strHashValue), "RAF2_OWNER_FirstName", currentScreen);
							break;
						case"RAF2_OWNER_LastName":
							blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_RAF:RAF_PG1:raf_DT:1:OwnerLast1_EF", validateInput(strHashValue), "RAF2_OWNER_LastName", currentScreen);
							break;
						case"RAF2_COOWNER_FirstName":
							blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_RAF:RAF_PG1:raf_DT:1:JointOwnerFirst1_EF", validateInput(strHashValue), "RAF2_COOWNER_FirstName", currentScreen);
							break;
						case"RAF2_COOWNER_LastName":
							blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_RAF:RAF_PG1:raf_DT:1:JointOwnerLast1_EF", validateInput(strHashValue), "RAF2_COOWNER_LastName", currentScreen);
							break;
						case"RAF2_INSURED_FirstName":
							blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_RAF:RAF_PG1:raf_DT:1:InsFirst1_EF", validateInput(strHashValue), "RAF2_INSURED_FirstName", currentScreen);
							break;
						case"RAF2_INSURED_LASTName":
							blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_RAF:RAF_PG1:raf_DT:1:InsLast1_EF", validateInput(strHashValue), "RAF2_INSURED_LASTName", currentScreen);
							break;
						case"RAF2_PRODUCT_Name":
							blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_RAF:RAF_PG1:raf_DT:1:proposedInsurance_EF", validateInput(strHashValue), "RAF2_PRODUCT_Name", currentScreen);
							break;
						case"RAF2_Company_Name":
							blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_RAF:RAF_PG1:raf_DT:1:InsurerCompanyName_DD", validateInput(strHashValue), "RAF2_Company_Name", currentScreen);
							break;
						case"RAF2_POLICY_NO":
							blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_RAF:RAF_PG1:raf_DT:1:contractNumber2_EF", validateInput(strHashValue), "RAF2_POLICY_NO", currentScreen);
							break;
						case"RAF2_EXISTING_OWNER_FirstName":
							blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_RAF:RAF_PG1:raf_DT:1:OwnerFirst1Tbl_EF", validateInput(strHashValue), "RAF2_EXISTING_OWNER_FirstName", currentScreen);
							break;
						case"RAF2_EXISTING_OWNER_LastName":
							blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_RAF:RAF_PG1:raf_DT:1:OwnerLast1Tbl_EF", validateInput(strHashValue), "RAF2_EXISTING_OWNER_LastName", currentScreen);
							break;
						case"RAF2_EXISTING_COOWNER_FirstName":
							blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_RAF:RAF_PG1:raf_DT:1:JointOwnerFirst1Tbl_EF", validateInput(strHashValue), "RAF2_EXISTING_COOWNER_FirstName", currentScreen);
							break;
						case"RAF2_EXISTING_COOWNER_LastName":
							blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_RAF:RAF_PG1:raf_DT:1:JointOwnerLast1Tbl_EF", validateInput(strHashValue), "RAF2_EXISTING_COOWNER_LastName", currentScreen);
							break;
						case"RAF2_EXISTING_INSURED_FirstName":
							blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_RAF:RAF_PG1:raf_DT:1:InsFirst1Tbl_EF", validateInput(strHashValue), "RAF2_EXISTING_INSURED_FirstName", currentScreen);
							break;
						case"RAF2_EXISTING_INSURED_LASTName":
							blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_RAF:RAF_PG1:raf_DT:1:InsLast1Tbl_EF", validateInput(strHashValue), "RAF2_EXISTING_INSURED_LASTName", currentScreen);
							break;
						case"RAF2_EXISTING_PRODUCT_Name":
							blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_RAF:RAF_PG1:raf_DT:1:proposedInsuranceTbl_EF", validateInput(strHashValue), "RAF2_EXISTING_PRODUCT_Name", currentScreen);
							break;
						case"RAF2_EXISTING_Company_Name":
							blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_RAF:RAF_PG1:raf_DT:1:InsurerCompanyNameTbl_DD", validateInput(strHashValue), "RAF2_EXISTING_Company_Name", currentScreen);
							break;
						case"RAF2_EXISTING_POLICY_NO":
							blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_RAF:RAF_PG1:raf_DT:1:contractNumber2Tbl_EF", validateInput(strHashValue), "RAF2_EXISTING_POLICY_NO", currentScreen);
							break;
						case"RAF2_ADD_DETAILS": 
							blnStatus = setValue(WebControl.BUTTON, IdentifyBy.NAME, "form_RAF:RAF_PG1:raf_DT:1:replacementTableAdd_CButton", validateInput(strHashValue), "ADD_OWNER_DETAILS", currentScreen);
							/*JavascriptExecutor executor1 = (JavascriptExecutor)gobjWebDriver;
							try{
								WebElement element1 = gobjWebDriver.findElement(By.name("form_RAF:RAF_PG1:raf_DT:1:replacementTableAdd_CButton"));
									
									executor1.executeScript("arguments[0].click();", element1);
									blnStatus = true;
								}
							catch(Exception exp){
								blnStatus = false;
								
							}
							if(blnStatus) {
								ReportGenerator.generateTestStep(true, currentScreen, " Click ADD to list ", strHashValue + " successfully clicked", true);
							}
							else {
								ReportGenerator.generateTestStep(false, currentScreen, "Click ADD to list", strHashValue + " object not displayed in expected time.", true);
							}*/

							break;	
						case"RAF2_PRINTED_OWNER_FirstName":
							blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_RAF:RAF_PG1:raf_DT:1:OwnerFirst1Page2_EF", validateInput(strHashValue), "RAF2_PRINTED_OWNER_FirstName", currentScreen);
							break;
						case"RAF2_PRINTED_OWNER_LastName":
							blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_RAF:RAF_PG1:raf_DT:1:OwnerLast1Page2_EF", validateInput(strHashValue), "RAF2_PRINTED_OWNER_LastName", currentScreen);
							break;
						case"RAF2_PRINTED_POLICY_NO":
							blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_RAF:RAF_PG1:raf_DT:1:replacedPolicyTblTb12l_EF", validateInput(strHashValue), "RAF2_PRINTED_POLICY_NO", currentScreen);
							break;
						case"RAF2_ADD_OWNER_DETAILS":  
							blnStatus = setValue(WebControl.BUTTON, IdentifyBy.NAME, "form_RAF:RAF_PG1:raf_DT:1:replacementTableAdd23_CButton", validateInput(strHashValue), "RAF2_ADD_OWNER_DETAILS", currentScreen);
							break;
						case"RAF2_OWNER_SIGN":
							blnStatus = setValue(WebControl.CHECKBOX, IdentifyBy.NAME, "form_RAF:RAF_PG1:raf_DT:1:OwnerApplicantSign_CB", validateInput(strHashValue), "RAF2_OWNER_SIGN", currentScreen);
							break;	
						case"RAF2_OWNER_DATE":
							blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_RAF:RAF_PG1:raf_DT:1:OwnerAppdate_EF", validateInput(strHashValue), "RAF2_OWNER_DATE", currentScreen);
							break;
						case"RAF2_JOINTOWNER_SIGN":
							blnStatus = setValue(WebControl.CHECKBOX, IdentifyBy.NAME, "form_RAF:RAF_PG1:raf_DT:1:JointOwnerApplicantSign_CB", validateInput(strHashValue), "RAF2_JOINTOWNER_SIGN", currentScreen);
							break;	
						case"RAF2_JOINTOWNER_DATE":
							blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_RAF:RAF_PG1:raf_DT:1:JointOwnerAppdate_EF", validateInput(strHashValue), "RAF2_JOINTOWNER_DATE", currentScreen);
							break;
						case"RAF2_AGENT_FirstName":
							blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_RAF:RAF_PG1:raf_DT:1:fpFirst1Page2_EF", validateInput(strHashValue), "RAF2_AGENT_FirstName", currentScreen);
							break;
						case"RAF2_AGENT_LastName":
							blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_RAF:RAF_PG1:raf_DT:1:fpLast1Page2_EF", validateInput(strHashValue), "RAF2_AGENT_LastName", currentScreen);
							break;
						case"RAF2_AGENT_SIGN":
							blnStatus = setValue(WebControl.CHECKBOX, IdentifyBy.NAME, "form_RAF:RAF_PG1:raf_DT:1:fpSignDN_CB", validateInput(strHashValue), "RAF2_AGENT_SIGN", currentScreen);
							break;	
						case"RAF2_AGENT_DATE":
							blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_RAF:RAF_PG1:raf_DT:1:fpDateDN_EF", validateInput(strHashValue), "RAF2_AGENT_DATE", currentScreen);
							break;
							
						case "default1": 
							ReportGenerator.generateTestStep(false, currentScreen, "Field Navigation", strHashKey + " field not available in the current method.", false);
							break;
						} //end of switch
						if(!blnStatus) break;
					} //end of while																	
				}
				else {
					ReportGenerator.generateTestStep(false, currentScreen, "Switch to Frame", "Failed to switch frames " + strFrames.replaceAll(GlobalData.STRING_SEPARATOR, " > "), false);
					blnStatus = false;
				}
				objEnum = null;
			//}
				
		} catch(Exception objExp) {
			ReportGenerator.generateTestStep(false, currentScreen, "Exception occured", "Exception is - " + objExp.getMessage(), false);
			blnStatus = false;
		}
		return blnStatus;
	}
	
	private static boolean NOR_UseofCash(OrderedHashtable objTestData) {
		boolean blnStatus = false;
		String strHashKey = "", strHashValue = "";
		try {
			
			
			String strFrames = "mainContentFrame" + GlobalData.STRING_SEPARATOR + "contentRightFrame" + GlobalData.STRING_SEPARATOR + "file" + GlobalData.STRING_SEPARATOR + "file" + GlobalData.STRING_SEPARATOR + "file";
			Enumeration objEnum = objTestData.enumerateKeys();
			//if(waitForPageLoad(MAX_TIMEOUT)) {
			
			
				if(switchToFrame(strFrames, false) && waitForPageLoad(MAX_TIMEOUT)) {
					
					while(objEnum.hasMoreElements()) {
						//blnStatus = false;
						strHashKey = objEnum.nextElement().toString();
						strHashValue = objTestData.get(strHashKey).toString();
						
						String USEOFCASH_SECTION="";
						switch(strHashKey) 
						
						{
						
						case"USEOFCASH_Section":  
							USEOFCASH_SECTION=strHashValue;
							System.out.println(USEOFCASH_SECTION);
							Thread.sleep(1000);
							blnStatus = true;
							break;
						case"INSURED1_FirstName":
							blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_UseOfCash:ax2UseOfCashSubview:uoC_DT:"+USEOFCASH_SECTION+":firstInsuredFirst_EF", validateInput(strHashValue), "INSURED1_FirstName", currentScreen);
							break;
						case"INSURED1_LASTName":
							blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_UseOfCash:ax2UseOfCashSubview:uoC_DT:"+USEOFCASH_SECTION+":firstInsuredLast_EF", validateInput(strHashValue), "INSURED1_LASTName", currentScreen);
							break;
						case"INSURED2_FirstName":
							blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_UseOfCash:ax2UseOfCashSubview:uoC_DT:"+USEOFCASH_SECTION+":secondInsuredFirst_EF", validateInput(strHashValue), "INSURED2_FirstName", currentScreen);
							break;
						case"INSURED2_LASTName":
							blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_UseOfCash:ax2UseOfCashSubview:uoC_DT:"+USEOFCASH_SECTION+":secondInsuredLast_EF", validateInput(strHashValue), "INSURED2_LASTName", currentScreen);
							break;
						case"Company_Name":  
							blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_UseOfCash:ax2UseOfCashSubview:uoC_DT:"+USEOFCASH_SECTION+":CompanyName_DD", validateInput(strHashValue), "Company_Name", currentScreen);
							break;
						case"POLICY_NO":
							blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_UseOfCash:ax2UseOfCashSubview:uoC_DT:"+USEOFCASH_SECTION+":polNumber_EF", validateInput(strHashValue), "POLICY_NO", currentScreen);
							break;
						case "LUMPSUM_ACTIONS":
							blnStatus = setValue(WebControl.RADIOBOX, IdentifyBy.NAME, "form_UseOfCash:ax2UseOfCashSubview:uoC_DT:"+USEOFCASH_SECTION+":lumpsumType_RB", getAppRadioValues(strHashKey, strHashValue), "LUMPSUM_ACTIONS", currentScreen);
							break;
						case"LUMPSUM_AMOUNT":
							blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_UseOfCash:ax2UseOfCashSubview:uoC_DT:"+USEOFCASH_SECTION+":lumpsumAmt_EF", validateInput(strHashValue), "LUMPSUM_AMOUNT", currentScreen);
							break;
						case "LOANCARRYOVER_ACTIONS":
							blnStatus = setValue(WebControl.RADIOBOX, IdentifyBy.NAME, "form_UseOfCash:ax2UseOfCashSubview:uoC_DT:"+USEOFCASH_SECTION+":carryoverType_RB", getAppRadioValues(strHashKey, strHashValue), "LOANCARRYOVER_ACTIONS", currentScreen);
							break;
						case "PARTIAL_WITHDRAWAL_ACTIONS":
							blnStatus = setValue(WebControl.RADIOBOX, IdentifyBy.NAME, "form_UseOfCash:ax2UseOfCashSubview:uoC_DT:"+USEOFCASH_SECTION+":partialwith_RB", getAppRadioValues(strHashKey, strHashValue), "PARTIAL_WITHDRAWAL_ACTIONS", currentScreen);
							break;
						case"PARTIALWITHDRAWAL_AMOUNT":
							blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_UseOfCash:ax2UseOfCashSubview:uoC_DT:"+USEOFCASH_SECTION+":partialwithAmt_EF", validateInput(strHashValue), "PARTIALWITHDRAWAL_AMOUNT", currentScreen);
							break;
						case "LOAN_ACTIONS":
							blnStatus = setValue(WebControl.RADIOBOX, IdentifyBy.NAME, "form_UseOfCash:ax2UseOfCashSubview:uoC_DT:"+USEOFCASH_SECTION+":loan_RB", getAppRadioValues(strHashKey, strHashValue), "LOAN_ACTIONS", currentScreen);
							break;
						case"LOAN_AMOUNT":
							
							blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_UseOfCash:ax2UseOfCashSubview:uoC_DT:"+USEOFCASH_SECTION+":loanAmt_EF", validateInput(strHashValue), "LOAN_AMOUNT", currentScreen);
							
							
							break;
						case "1035EXCHANGE_ACTIONS":
							blnStatus = setValue(WebControl.RADIOBOX, IdentifyBy.NAME, "form_UseOfCash:ax2UseOfCashSubview:uoC_DT:"+USEOFCASH_SECTION+":exch1035_RB", getAppRadioValues(strHashKey, strHashValue), "1035EXCHANGE_ACTIONS", currentScreen);
							break;
						case "BENEFIT_ACTIONS":  										
							blnStatus = setValue(WebControl.RADIOBOX, IdentifyBy.NAME, "form_UseOfCash:ax2UseOfCashSubview:uoC_DT:"+USEOFCASH_SECTION+":benefitRed_RB", getAppRadioValues(strHashKey, strHashValue), "BENEFIT_ACTIONS", currentScreen);
							break;
						case "DIVIDENDSFUNDING_ACTIONS":
							blnStatus = setValue(WebControl.RADIOBOX, IdentifyBy.NAME, "form_UseOfCash:ax2UseOfCashSubview:uoC_DT:"+USEOFCASH_SECTION+":dividends_RB", getAppRadioValues(strHashKey, strHashValue), "DIVIDENDSFUNDING_ACTIONS", currentScreen);
							break;
						case "DIVIDENDSREFUNDED_ACTIONS":
							blnStatus = setValue(WebControl.RADIOBOX, IdentifyBy.NAME, "form_UseOfCash:ax2UseOfCashSubview:uoC_DT:"+USEOFCASH_SECTION+":dividendsRef_RB", getAppRadioValues(strHashKey, strHashValue), "DIVIDENDSREFUNDING_ACTIONS", currentScreen);
							break;
						case "PREMIUM_ACTIONS":
							blnStatus = setValue(WebControl.RADIOBOX, IdentifyBy.NAME, "form_UseOfCash:ax2UseOfCashSubview:uoC_DT:"+USEOFCASH_SECTION+":premium_RB", getAppRadioValues(strHashKey, strHashValue), "PREMIUM_ACTIONS", currentScreen);
							break;
						case "OTHERS_ACTIONS":
							blnStatus = setValue(WebControl.RADIOBOX, IdentifyBy.NAME, "form_UseOfCash:ax2UseOfCashSubview:uoC_DT:"+USEOFCASH_SECTION+":others_RB", getAppRadioValues(strHashKey, strHashValue), "OTHERS_ACTIONS", currentScreen);
							break;
						case"ADDITIONAL_REMARKS":
							blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_UseOfCash:ax2UseOfCashSubview:uoC_DT:"+USEOFCASH_SECTION+":additionalRemark_TA", validateInput(strHashValue), "ADDITIONAL_REMARKS", currentScreen);
							break;
						case"ADD_DETAILS": 
							blnStatus = setValue(WebControl.BUTTON, IdentifyBy.NAME, "form_UseOfCash:ax2UseOfCashSubview:uoC_DT:"+USEOFCASH_SECTION+":replacementTableAdd_CButton", validateInput(strHashValue), "ADD_DETAILS", currentScreen);
							break;
						case"AGENT_FirstName":
							blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_UseOfCash:ax2UseOfCashSubview:uoC_DT:"+USEOFCASH_SECTION+":fpFirst1_EF", validateInput(strHashValue), "AGENT_FirstName", currentScreen);
							break;
						case"AGENT_LastName":
							blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_UseOfCash:ax2UseOfCashSubview:uoC_DT:"+USEOFCASH_SECTION+":fpLast1_EF", validateInput(strHashValue), "AGENT_LastName", currentScreen);
							break;
						case"PHONE":
							blnStatus = setValue(WebControl.CHECKBOX, IdentifyBy.NAME, "form_UseOfCash:ax2UseOfCashSubview:uoC_DT:"+USEOFCASH_SECTION+":phone_CB", validateInput(strHashValue), "PHONE", currentScreen);
							break;
						case "default1": 
							ReportGenerator.generateTestStep(false, currentScreen, "Field Navigation", strHashKey + " field not available in the current method.", false);
							break;
						} //end of switch
						if(!blnStatus) break;
					} //end of while																	
				}
				else {
					ReportGenerator.generateTestStep(false, currentScreen, "Switch to Frame", "Failed to switch frames " + strFrames.replaceAll(GlobalData.STRING_SEPARATOR, " > "), false);
					blnStatus = false;
				}
				objEnum = null;
			//}
				
		} catch(Exception objExp) {
			ReportGenerator.generateTestStep(false, currentScreen, "Exception occured", "Exception is - " + objExp.getMessage(), false);
			blnStatus = false;
		}
		return blnStatus;
	}
	
	private static boolean Disclosure(OrderedHashtable objTestData) {
		boolean blnStatus = false;
		String strHashKey = "", strHashValue = "";
		try {
			
			
			String strFrames = "mainContentFrame" + GlobalData.STRING_SEPARATOR + "contentRightFrame" + GlobalData.STRING_SEPARATOR + "file" + GlobalData.STRING_SEPARATOR + "file" + GlobalData.STRING_SEPARATOR + "file";
			Enumeration objEnum = objTestData.enumerateKeys();
			//if(waitForPageLoad(MAX_TIMEOUT)) {
			
			
				if(switchToFrame(strFrames, false) && waitForPageLoad(MAX_TIMEOUT)) {
					
					while(objEnum.hasMoreElements()) {
						//blnStatus = false;
						strHashKey = objEnum.nextElement().toString();
						strHashValue = objTestData.get(strHashKey).toString();
						
						switch(strHashKey) {
						case"PAGE1":
							blnStatus = setValue(WebControl.CHECKBOX, IdentifyBy.NAME, "form_FullDisclosure:disclosurePG1:Page1Received_CB", validateInput(strHashValue), "Page1", currentScreen);
							break;
						case"PAGE2":
							blnStatus = setValue(WebControl.CHECKBOX, IdentifyBy.NAME, "form_FullDisclosure:disclosurePG1:Page2Received_CB", validateInput(strHashValue), "Page2", currentScreen);
							break;
						case"PAGE3":
							blnStatus = setValue(WebControl.CHECKBOX, IdentifyBy.NAME, "form_FullDisclosure:disclosurePG1:Page3Received_CB", validateInput(strHashValue), "Page3", currentScreen);
							break;
						case"NEWLIFEINSURANCE":
							blnStatus = setValue(WebControl.CHECKBOX, IdentifyBy.NAME, "form_FullDisclosure:disclosurePG2:firstCB_CB", validateInput(strHashValue), "Primary Reason for insurance", currentScreen);
							break;
						case"EXISTINGLIFEINSURANCE":
							blnStatus = setValue(WebControl.CHECKBOX, IdentifyBy.NAME, "form_FullDisclosure:disclosurePG2:secondCB_CB", validateInput(strHashValue), "Existing life insurance", currentScreen);
							break;
						case"ADV_EXISTINGINSURANCE_CHANGES":
							blnStatus = setValue(WebControl.CHECKBOX, IdentifyBy.NAME, "form_FullDisclosure:disclosurePG2:ThirdCB_CB", validateInput(strHashValue), "Insurance changes", currentScreen);
							break;
						case"AGENTS_SIGN":
							blnStatus = setValue(WebControl.CHECKBOX, IdentifyBy.NAME, "form_FullDisclosure:disclosurePG3:finProfOrBrokerSign_CB", validateInput(strHashValue), "Agents sign", currentScreen);
							break;
						case"AGENTS_DATE":
							blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_FullDisclosure:disclosurePG3:finProfDate", validateInput(strHashValue), "Producer Date", currentScreen);
							break;
							
						case "default1":
							ReportGenerator.generateTestStep(false, currentScreen, "Field Navigation", strHashKey + " field not available in the current method.", false);
							break;
						} //end of switch
						if(!blnStatus) break;
					} //end of while																	
				}
				else {
					ReportGenerator.generateTestStep(false, currentScreen, "Switch to Frame", "Failed to switch frames " + strFrames.replaceAll(GlobalData.STRING_SEPARATOR, " > "), false);
					blnStatus = false;
				}
				objEnum = null;
			//}
				
		} catch(Exception objExp) {
			ReportGenerator.generateTestStep(false, currentScreen, "Exception occured", "Exception is - " + objExp.getMessage(), false);
			blnStatus = false;
		}
		return blnStatus;
	}
	
	private static boolean SalesMaterialNY(OrderedHashtable objTestData) {
		boolean blnStatus = false;
		String strHashKey = "", strHashValue = "";
		try {
			
			
			String strFrames = "mainContentFrame" + GlobalData.STRING_SEPARATOR + "contentRightFrame" + GlobalData.STRING_SEPARATOR + "file" + GlobalData.STRING_SEPARATOR + "file"+ GlobalData.STRING_SEPARATOR + "file";
			Enumeration objEnum = objTestData.enumerateKeys();
			//if(waitForPageLoad(MAX_TIMEOUT)) {
			
			
				if(switchToFrame(strFrames, false) && waitForPageLoad(MAX_TIMEOUT)) {
					
					while(objEnum.hasMoreElements()) {
						//blnStatus = false;
						strHashKey = objEnum.nextElement().toString();
						strHashValue = objTestData.get(strHashKey).toString();
						
						switch(strHashKey) 
						
						{
						case "APPLICANT_TYPE":
							//form_NoticeOfReplacement:noticeOfReplacement:
							blnStatus = setValue(WebControl.RADIOBOX, IdentifyBy.NAME, "form_SalesMaterial:ax2SalesMaterialNY:personEntityTypeAP_RB", getAppRadioValues(strHashKey, strHashValue), "APPLICANT_TYPE", currentScreen);
							break;
						case"APPLICANT_ENTITY":  //form_NoticeOfReplacement:noticeOfReplacement:Entity_EF
							blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_SalesMaterial:ax2SalesMaterialNY:EntityAP_EF", validateInput(strHashValue), "APPLICANT_ENTITY", currentScreen);
							break; 
						case"Applicant_FirstName":
							blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_SalesMaterial:ax2SalesMaterialNY:first_EF", validateInput(strHashValue), "ApplicantFirstName", currentScreen);
							break;
						case"Applicant_LastName":
							blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_SalesMaterial:ax2SalesMaterialNY:last_EF", validateInput(strHashValue), "ApplicantLastName", currentScreen);
							break;
						case"SalesMaterialCertifiedbyAXA":
							blnStatus = setValue(WebControl.CHECKBOX, IdentifyBy.NAME, "form_SalesMaterial:ax2SalesMaterialNY:SM1_CB", validateInput(strHashValue), "SalesMaterialCertifiedbyAXA", currentScreen);
							break;
						case"Product_Name":
							blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_SalesMaterial:ax2SalesMaterialNY:productName_DD", validateInput(strHashValue), "Product_Name", currentScreen);
							break;	
						case "SalesMaterial":
							blnStatus = setValue(WebControl.LINK, IdentifyBy.NAME, "form_SalesMaterial:ax2SalesMaterialNY:iPopup_CButton", validateInput(strHashValue), "SalesMaterialused", currentScreen);
							break;	
						
						/*case"ClientBrochure":
							blnStatus = setValue(WebControl.CHECKBOX, IdentifyBy.NAME, "form_changeTypeDetails:salesMaterialUsed_DD", validateInput(strHashValue), "ClientBrochure", currentScreen);
							break;*/
						case"ApprovedSalesMaterial":
							blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_SalesMaterial:ax2SalesMaterialNY:salesMaterialDetails_TA", validateInput(strHashValue), "ApprovedSalesMaterial", currentScreen);
							break;
						case"NOSalesMaterial":
							blnStatus = setValue(WebControl.CHECKBOX, IdentifyBy.NAME, "form_SalesMaterial:ax2SalesMaterialNY:salesMaterialUsed_Cb3", validateInput(strHashValue), "NO Sales Material used", currentScreen);
							break;	
						case"Producer_FirstName":
							blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_SalesMaterial:ax2SalesMaterialNY:first1_EF", validateInput(strHashValue), "ProducerFirstName", currentScreen);
							break;
						case"Producer_LastName":
							blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_SalesMaterial:ax2SalesMaterialNY:last1_EF", validateInput(strHashValue), "ProducerLastName", currentScreen);
							break;
						case"ProducerSignature":
							blnStatus = setValue(WebControl.CHECKBOX, IdentifyBy.NAME, "form_SalesMaterial:ax2SalesMaterialNY:finProfOrBrokerSign_CB", validateInput(strHashValue), "ProducerSignature", currentScreen);
							break;
						case"Producer_Date":
							blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_SalesMaterial:ax2SalesMaterialNY:dateOn_EF", validateInput(strHashValue), "Producer Date", currentScreen);
							break;
						case "default1": 
							ReportGenerator.generateTestStep(false, currentScreen, "Field Navigation", strHashKey + " field not available in the current method.", false);
							break;
						} //end of switch
						if(!blnStatus) break;
					} //end of while																	
				}
				else {
					ReportGenerator.generateTestStep(false, currentScreen, "Switch to Frame", "Failed to switch frames " + strFrames.replaceAll(GlobalData.STRING_SEPARATOR, " > "), false);
					blnStatus = false;
				}
				objEnum = null;
			//}
				
		} catch(Exception objExp) {
			ReportGenerator.generateTestStep(false, currentScreen, "Exception occured", "Exception is - " + objExp.getMessage(), false);
			blnStatus = false;
		}
		return blnStatus;
	}
	
	
	private static boolean BeneficiaryDetails(OrderedHashtable objTestData) {
		boolean blnStatus = false;
		String strHashKey = "", strHashValue = "";
		try {
			String strFrames = "FWin0" + GlobalData.STRING_SEPARATOR + "Content0";
			Enumeration objEnum = objTestData.enumerateKeys();
			//if(waitForPageLoad(MAX_TIMEOUT)) {
				if(switchToFrame(strFrames, false) && waitForPageLoad(MAX_TIMEOUT)) {
					while(objEnum.hasMoreElements()) {
						//blnStatus = false;
						strHashKey = objEnum.nextElement().toString();
						strHashValue = objTestData.get(strHashKey).toString();

						switch(strHashKey) {
						case "SELECT_BENEFICARY":
							blnStatus = selectWebtableRow(IdentifyBy.ID, "form_UlBeneficiaryDetails:beneficiary_DataTable", 1, strHashValue, "Select Beneficary", currentScreen);
							break;
							case "PERSON_R_ENTITY":
								blnStatus = setValue(WebControl.RADIOBOX, IdentifyBy.NAME, "form_UlBeneficiaryDetails:personEntityType_RB", getAppRadioValues(strHashKey, strHashValue), "Person / Entity", currentScreen);
								break;
							case "ENTITY_TYPE":
								blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_UlBeneficiaryDetails:personEntityType_DD", validateInput(strHashValue), "Entity Type", currentScreen);
								break;
							case "IRREVOCABLE":
								blnStatus = setValue(WebControl.CHECKBOX, IdentifyBy.NAME, "form_UlBeneficiaryDetails:irrevocable_CB", validateInput(strHashValue), "Irrevocable", currentScreen);
								break;
							case "PREFIX":
								blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_UlBeneficiaryDetails:prefix_DD", validateInput(strHashValue), "Prefix", currentScreen);
								break;
							case "FIRST_NAME":
								blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_UlBeneficiaryDetails:firstName_EF", validateInput(strHashValue), "First Name", currentScreen);
								break;
							case "MIDDLE_NAME":
								blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_UlBeneficiaryDetails:middleName_EF", validateInput(strHashValue), "Middle Name", currentScreen);
								break;
							case "LAST_NAME":
								blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_UlBeneficiaryDetails:lastName_EF", validateInput(strHashValue), "Last Name", currentScreen);
								break;
							case "SUFFIX":
								blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_UlBeneficiaryDetails:suffix_DD", validateInput(strHashValue), "Suffix", currentScreen);
								break;
							case "ENTITY":
								blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_UlBeneficiaryDetails:entity_EF", validateInput(strHashValue), "Entity", currentScreen);
								break;
							case "RELATIONSHIP_TO_INSURED":
								blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_UlBeneficiaryDetails:relationshipToInsured_DD", validateInput(strHashValue), "Relationship to Insured", currentScreen);
								break;
							case "BENEFICIARY_TYPE":
								blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_UlBeneficiaryDetails:beneficiaryType_DD", validateInput(strHashValue), "Beneficiary Type", currentScreen);
								break;
							case "DATE_OF_BIRTH":
								blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_UlBeneficiaryDetails:DOB_EF", validateInput(strHashValue), "Date Of Birth", currentScreen);
								break;
							case "TAX_INFORMATION":
								blnStatus = setValue(WebControl.RADIOBOX, IdentifyBy.NAME, "form_UlBeneficiaryDetails:ssnEinItin_RB", getAppRadioValues(strHashKey, strHashValue), "Tax Information", currentScreen);
								break;
								
							case "SOCIAL_SECURITY":
								blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_UlBeneficiaryDetails:ssnEinSSN_EF", validateInput(strHashValue), "SSN", currentScreen);
								break;
							/*case "ADDRESS_TYPE":
								blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_UlBeneficiaryDetails:street_EF", validateInput(strHashValue), "Address Type", currentScreen);
								break;*/
							case "STREET_NO":
								blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_UlBeneficiaryDetails:street_EF", validateInput(strHashValue), "Street No", currentScreen);
								break;
							case "BUILDING_APT_SUITE":
								blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_UlBeneficiaryDetails:BldAptSuite_EF", validateInput(strHashValue), "Building / Apt / Suite", currentScreen);
								break;
							case "CITY":
								blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_UlBeneficiaryDetails:pInsured1City_EF", validateInput(strHashValue), "City", currentScreen);
								break;
							/*case "COUNTY":
								blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_appEntryLifePage1:ax2ProposedInsured:pInsured_DT:0:pInsured1County_EF", validateInput(strHashValue), "County", currentScreen);
								break;*/
							case "STATE":
								blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_UlBeneficiaryDetails:pInsured1State_DD", validateInput(strHashValue), "State", currentScreen);
								break;
							case "ZIP":
								blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_UlBeneficiaryDetails:pInsured1Zip_EF", validateInput(strHashValue), "Zip", currentScreen);
								break;
							case "PERCENTAGE":
								blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_UlBeneficiaryDetails:beneficiaryPercentage_EF", validateInput(strHashValue), "Percentage", currentScreen);
								break;
							case "SETTLEMENT_OPTION":
								blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_UlBeneficiaryDetails:Settlement_DD", validateInput(strHashValue), "Settlement Option", currentScreen);
								break;
							case "ADD_TO_LIST":
								blnStatus = setValue(WebControl.BUTTON, IdentifyBy.NAME, "form_UlBeneficiaryDetails:beneficiaryAdd_CButton", validateInput(strHashValue), "Add To List", currentScreen);
								break;
							case "ADD":
								
								try{
									JavascriptExecutor js =  (JavascriptExecutor)gobjWebDriver;
									js.executeScript("document.getElementById('form_UlBeneficiaryDetails:drAdd_CButton').click();");
								blnStatus = true;
								}
								catch(Exception exp){
									blnStatus = false;
									
								}//blnStatus = setValue(WebControl.BUTTON, IdentifyBy.NAME, "form_UlBeneficiaryDetails:drAdd_CButton", validateInput(strHashValue), "Add", currentScreen);
								if(blnStatus) {
									ReportGenerator.generateTestStep(true, currentScreen, " Click ADD ", strHashValue + " successfully clicked", true);
								}
								else {
									ReportGenerator.generateTestStep(false, currentScreen, "Click ADD", strHashValue + " object not displayed in expected time.", true);
								}
								break;
							case "UPDATE_BENEFICARY":
								
								Thread.sleep(1000);
								try{
									JavascriptExecutor js =  (JavascriptExecutor)gobjWebDriver;
									js.executeScript("document.getElementById('form_UlBeneficiaryDetails:beneficiaryUpdate_CButton').click();");
								
								blnStatus = true;
								}
								catch(Exception exp){
									blnStatus = false;
									
								}
								//blnStatus = setValue(WebControl.BUTTON, IdentifyBy.NAME, "form_UlBeneficiaryDetails:beneficiaryUpdate_CButton", validateInput(strHashValue), "Update", currentScreen);
								if(blnStatus) {
									ReportGenerator.generateTestStep(true, currentScreen, " Clck update ", strHashValue + " successfully clicked", true);
								}
								else {
									ReportGenerator.generateTestStep(false, currentScreen, "Click Main Menu", strHashValue + " object not displayed in expected time.", true);
								}
								break;
						} //end of switch
						if(!blnStatus) break;
					} //end of while
				}
				else {
					ReportGenerator.generateTestStep(false, currentScreen, "Switch to Frame", "Failed to switch frames " + strFrames.replaceAll(GlobalData.STRING_SEPARATOR, " > "), false);
					blnStatus = false;
				}
				objEnum = null;
			//}
				
		} catch(Exception objExp) {
			ReportGenerator.generateTestStep(false, currentScreen, "Exception occured", "Exception is - " + objExp.getMessage(), false);
			blnStatus = false;
		}
		return blnStatus;
	}
	
	private static boolean NavigateMenuTabs(OrderedHashtable objTestData) {
		boolean blnStatus = false;
		String strHashKey = "", strHashValue = "";
		try {
			
			String strFrames = "";
			Enumeration objEnum = objTestData.enumerateKeys();
			//if(waitForPageLoad(MAX_TIMEOUT)) {
				
					while(objEnum.hasMoreElements()) {
						//blnStatus = false;
						strHashKey = objEnum.nextElement().toString();
						strHashValue = objTestData.get(strHashKey).toString();

						switch(strHashKey) {
						case "WORK_COMPLETE":
							strFrames = "mainContentFrame";
							if(switchToFrame(strFrames, false)) {
								List<WebElement> objDate = gobjWebDriver.findElements(By.id("CurrentDate"));
								if(objDate.size()>0) {
									try{
										objDate.get(0).click();
										Thread.sleep(200);
										objDate.get(0).click();
									}
									catch(Exception obj){}
								}
							}
							
							strFrames = "mainContentFrame" + GlobalData.STRING_SEPARATOR + "contextMenu";
							if(switchToFrame(strFrames, false)) {
								
								blnStatus = setValue(WebControl.LINK, IdentifyBy.XPATH, "//span[contains(text(), '" + strHashValue + "')]", strHashValue, strHashValue, currentScreen);
								Thread.sleep(2000);
								if(verifyPopupMessage("The Work Completed function is not")) {
									if(switchToFrame(strFrames, false)) blnStatus = setValue(WebControl.LINK, IdentifyBy.XPATH, "//span[contains(text(), 'Close Work Item')]", strHashValue, strHashValue, currentScreen);
								}
								waitForPageLoad(MAX_TIMEOUT);
							}
							else {
								ReportGenerator.generateTestStep(false, currentScreen, "Click Top Menu", " Failed to navigate the Frames " + strFrames.replaceAll(GlobalData.STRING_SEPARATOR, " > "), true);
							}
							break;
						case "TOP_MENU":
							strFrames = "mainContentFrame" + GlobalData.STRING_SEPARATOR + "contextMenu";
							if(switchToFrame(strFrames, false)) {
								blnStatus = setValue(WebControl.LINK, IdentifyBy.XPATH, "//span[contains(text(), '" + strHashValue + "')]", strHashValue, strHashValue, currentScreen);
								
								waitForPageLoad(MAX_TIMEOUT);
							}
							else {
								ReportGenerator.generateTestStep(false, currentScreen, "Click Top Menu", " Failed to navigate the Frames " + strFrames.replaceAll(GlobalData.STRING_SEPARATOR, " > "), true);
							}
							break;
						case "MAIN_MENU":
							strFrames = "mainContentFrame" + GlobalData.STRING_SEPARATOR + "contentRightFrame";
							if(switchToFrame(strFrames, false)) {
								blnStatus = false;
								int intCounter = 0;
								String press=Keys.chord(Keys.SHIFT,Keys.TAB);
								//blnStatus = setValue(WebControl.LINK, IdentifyBy.ID, getMainMenuId(strHashValue), validateInput(strHashValue), "Top Menu", currentScreen);
								switch(strHashValue) {
									case "TODO_LIST":
										waitForPageLoad(MAX_TIMEOUT);
										blnStatus = setValue(WebControl.LINK, IdentifyBy.ID, "todoImg", validateInput(strHashValue), validateInput(strHashValue), currentScreen);
										break;
									case "Contract":
										while(!blnStatus && intCounter < 30) {
											try{
										
										Thread.sleep(MIC_TIMEOUT*1000);
										WebElement element = gobjWebDriver.findElement(By.xpath("//div[contains(text(), '" + strHashValue + "')]"));
										JavascriptExecutor executor = (JavascriptExecutor)gobjWebDriver;
										executor.executeScript("arguments[0].click();", element);
										Thread.sleep(4000);
										blnStatus=true;
											}
											catch(Exception obj) {
												gobjWebDriver.getKeyboard().sendKeys(press);
												Thread.sleep(500);
												gobjWebDriver.getKeyboard().sendKeys(press);
												Thread.sleep(500);
												intCounter++;
											}
										}
										break;
									default:
										Thread.sleep(MIC_TIMEOUT*1000);
									
										gobjWebDriver.getKeyboard().sendKeys(press);
										Thread.sleep(500);
										
										while(!blnStatus && intCounter < 30) {
											try{
												
												List<WebElement>Jj=gobjWebDriver.findElements(By.xpath("//div[contains(text(), '" + strHashValue + "')]"));
												System.out.println("Size " + Jj.size());
												if(Jj.size()>0) {
													Jj.get(0).click();
													Thread.sleep(4000);
													Jj.get(0).click();
													blnStatus=true;
													System.out.println("Click " + strHashValue);
												}
											}catch(Exception obj) {
												gobjWebDriver.getKeyboard().sendKeys(press);
												Thread.sleep(500);
												gobjWebDriver.getKeyboard().sendKeys(press);
												Thread.sleep(500);
												intCounter++;
											}
										}
										
										if(blnStatus) {
											ReportGenerator.generateTestStep(true, currentScreen, " Click Main Menu ", strHashValue + " successfully clicked", true);
										}
										else {
											ReportGenerator.generateTestStep(false, currentScreen, "Click Main Menu", strHashValue + " object not displayed in expected time.", true);
										}
										break;
								}
								Thread.sleep(MIC_TIMEOUT*1000);
								waitForPageLoad(MAX_TIMEOUT);
							}
							else {
								ReportGenerator.generateTestStep(false, currentScreen, "Click " + strHashValue, " Failed to navigate the Frames " + strFrames.replaceAll(GlobalData.STRING_SEPARATOR, " > "), true);
							}
							break;
							case "LEVEL0_TAB":
								strFrames = "mainContentFrame" + GlobalData.STRING_SEPARATOR + "contentRightFrame";
								if(switchToFrame(strFrames, false)) {
									//blnStatus = setValue(WebControl.LINK, IdentifyBy.ID, getLevel1MenuId(strHashValue), validateInput(strHashValue), validateInput(strHashValue), currentScreen);
									blnStatus = setValue(WebControl.LINK, IdentifyBy.XPATH, "//div[text()='" + strHashValue + "']", validateInput(strHashValue), validateInput(strHashValue), currentScreen);
									Thread.sleep(MIC_TIMEOUT*1000);
									waitForPageLoad(MAX_TIMEOUT);
								}
								else {
									ReportGenerator.generateTestStep(false, currentScreen, "Click " + strHashValue, " Failed to navigate the Frames " + strFrames.replaceAll(GlobalData.STRING_SEPARATOR, " > "), true);
								}
								break;
							case "LEVEL1_TAB":
								strFrames = "mainContentFrame" + GlobalData.STRING_SEPARATOR + "contentRightFrame" + GlobalData.STRING_SEPARATOR + "file";
								if(switchToFrame(strFrames, false)) {
									blnStatus = setValue(WebControl.LINK, IdentifyBy.XPATH, "//div[contains(text(), '" + strHashValue + "')]", validateInput(strHashValue), validateInput(strHashValue), currentScreen);
									Thread.sleep(MIC_TIMEOUT*1000);
									waitForPageLoad(MAX_TIMEOUT);
								}
								else {
									ReportGenerator.generateTestStep(false, currentScreen, "Click " + strHashValue, " Failed to navigate the Frames " + strFrames.replaceAll(GlobalData.STRING_SEPARATOR, " > "), true);
								}
								break;
							case "VERTICAL_TAB":
								strFrames = "mainContentFrame" + GlobalData.STRING_SEPARATOR + "contentRightFrame" + GlobalData.STRING_SEPARATOR + "file" + GlobalData.STRING_SEPARATOR + "file";
								if(switchToFrame(strFrames, false)) {
									
									/*WebElement element = gobjWebDriver.findElement(By.xpath("//div[contains(text(), '" + strHashValue + "')]"));
									JavascriptExecutor executor = (JavascriptExecutor)gobjWebDriver;
									executor.executeScript("arguments[0].click();", element);*/
							
									System.out.println("//div[text()='" +strHashValue+"']");
									//Thread.sleep(10000);
									blnStatus = setValue(WebControl.BUTTON, IdentifyBy.XPATH, "//div[text()='" +strHashValue+"']", validateInput(strHashValue), validateInput(strHashValue), currentScreen);
									gobjWebDriver.findElement(By.xpath("//div[text()='" +strHashValue+"']")).click();
									Thread.sleep(MIC_TIMEOUT*1000);
									//ReportGenerator.generateTestStep(true, currentScreen, "Click" + strHashValue, "Successfully clicked", true);
									waitForPageLoad(MAX_TIMEOUT);
									//blnStatus = true;
									/*blnStatus = setValue(WebControl.LINK, IdentifyBy.XPATH, "//div[contains(text(), '" + strHashValue + "')]", validateInput(strHashValue), validateInput(strHashValue), currentScreen);
									Thread.sleep(MIC_TIMEOUT*1000);
									Thread.sleep(5000);
									waitForPageLoad(MAX_TIMEOUT);*/
								}
								else {
									ReportGenerator.generateTestStep(false, currentScreen, "Click " + strHashValue, " Failed to navigate the Frames " + strFrames.replaceAll(GlobalData.STRING_SEPARATOR, " > "), true);
								}
								break;
							case "SAVE":
								strFrames = "mainContentFrame" + GlobalData.STRING_SEPARATOR + "contentRightFrame" + GlobalData.STRING_SEPARATOR + "file";
								if(switchToFrame(strFrames, false)) {
								
									WebElement element = gobjWebDriver.findElement(By.cssSelector("//input[value='Save']"));
									JavascriptExecutor executor = (JavascriptExecutor)gobjWebDriver;
									executor.executeScript("arguments[0].click();", element);
									ReportGenerator.generateTestStep(true, currentScreen, "Click SAVE", "Successfully clicked", true);
									
									Thread.sleep(MIC_TIMEOUT*1000);
									waitForPageLoad(MAX_TIMEOUT);
									blnStatus = true;
								}
								else {
									ReportGenerator.generateTestStep(false, currentScreen, "Click " + strHashValue, " Failed to navigate the Frames " + strFrames.replaceAll(GlobalData.STRING_SEPARATOR, " > "), true);
								}
								break;
							
							/*case "SUBMIT": //Only for App Save...
								strFrames = "mainContentFrame" + GlobalData.STRING_SEPARATOR + "contentRightFrame" + GlobalData.STRING_SEPARATOR + "file";
								if(switchToFrame(strFrames, false)) {
								
									WebElement element = gobjWebDriver.findElement(By.cssSelector("//input[value='Save']"));
									JavascriptExecutor executor = (JavascriptExecutor)gobjWebDriver;
									executor.executeScript("arguments[0].click();", element);
									ReportGenerator.generateTestStep(true, currentScreen, "Click SAVE", "Successfully clicked", true);
									
									Thread.sleep(MIC_TIMEOUT);
									waitForPageLoad(MAX_TIMEOUT);
									
									
									strFrames = "mainContentFrame" + GlobalData.STRING_SEPARATOR + "contextMenu";
									if(switchToFrame(strFrames, false)) {
										blnStatus = setValue(WebControl.LINK, IdentifyBy.XPATH, "//span[contains(text(), 'Close Work Item')]", strHashValue, strHashValue, currentScreen);
										
										strFrames = "mainContentFrame" + GlobalData.STRING_SEPARATOR + "contentLeftFrame" + GlobalData.STRING_SEPARATOR + "file"  + GlobalData.STRING_SEPARATOR + "file"  ;
										if(switchToFrame(strFrames, false)) waitForPageLoad(MAX_TIMEOUT);
									}
									else {
										ReportGenerator.generateTestStep(false, currentScreen, "Click Top Menu", " Failed to navigate the Frames " + strFrames.replaceAll(GlobalData.STRING_SEPARATOR, " > "), true);
									}
									blnStatus = true;
								}
								else {
									ReportGenerator.generateTestStep(false, currentScreen, "Click " + strHashValue, " Failed to navigate the Frames " + strFrames.replaceAll(GlobalData.STRING_SEPARATOR, " > "), true);
								}
								
								Thread.sleep(MIC_TIMEOUT);
								
								break;*/
							case "SUBMIT":
								strFrames = "mainContentFrame" + GlobalData.STRING_SEPARATOR + "contentRightFrame" + GlobalData.STRING_SEPARATOR + "file";
								if(switchToFrame(strFrames, false)) {
									blnStatus = setValue(WebControl.BUTTON, IdentifyBy.CSS_SELECTOR, "//input[value='Submit']", validateInput(strHashValue), "Submit", currentScreen);
									
									strFrames = "mainContentFrame" + GlobalData.STRING_SEPARATOR + "contentLeftFrame" + GlobalData.STRING_SEPARATOR + "file"  + GlobalData.STRING_SEPARATOR + "file"  ;
									if(switchToFrame(strFrames, false)) waitForPageLoad(MAX_TIMEOUT);
								}
								else {
									ReportGenerator.generateTestStep(false, currentScreen, "Click " + strHashValue, " Failed to navigate the Frames " + strFrames.replaceAll(GlobalData.STRING_SEPARATOR, " > "), true);
								}
								break;
							case "COMMIT":
								strFrames = "mainContentFrame" + GlobalData.STRING_SEPARATOR + "contentRightFrame" + GlobalData.STRING_SEPARATOR + "file";
								gobjWebDriver.getKeyboard().sendKeys(Keys.PAGE_DOWN);
								if(switchToFrame(strFrames, false)) {
									Thread.sleep(1000);
									
									blnStatus = setValue(WebControl.BUTTON, IdentifyBy.NAME, "form_appEntryOverview:_id8", validateInput(strHashValue), "Commit", currentScreen);
									VerifyChanges();
									
									strFrames = "mainContentFrame" + GlobalData.STRING_SEPARATOR + "contentLeftFrame" + GlobalData.STRING_SEPARATOR + "file"  + GlobalData.STRING_SEPARATOR + "file"  ;
									if(switchToFrame(strFrames, false))waitForPageLoad(MIN_TIMEOUT);
								}
								else {
									ReportGenerator.generateTestStep(false, currentScreen, "Click " + strHashValue, " Failed to navigate the Frames " + strFrames.replaceAll(GlobalData.STRING_SEPARATOR, " > "), true);
								}
								break;
							case "UW_COMMIT":
								 // gobjWebDriver.setCapability("screen-resolution","1280x1024");
								
								strFrames = "mainContentFrame" + GlobalData.STRING_SEPARATOR + "contentRightFrame" + GlobalData.STRING_SEPARATOR + "file";
								if(switchToFrame(strFrames, false)) {
									scrollDown();
									
									WebElement element = gobjWebDriver.findElement(By.id("form_reqimpoverview:btnCommit"));
									JavascriptExecutor executor = (JavascriptExecutor)gobjWebDriver;
									executor.executeScript("arguments[0].click();", element);
									
									
									Thread.sleep(MIC_TIMEOUT*1000);
									waitForPageLoad(MAX_TIMEOUT);
									blnStatus = true;
										
								}
									if(blnStatus) {
										ReportGenerator.generateTestStep(true, currentScreen, "Click Underwriter Commit", "Successfully clicked", true);
									}
									else {
										ReportGenerator.generateTestStep(false, currentScreen, "Click Underwriter Commit", "Object not displayed in expected time.", true);
									}
								
								
								break;
							/*case "UW_COMMIT":
								 // gobjWebDriver.setCapability("screen-resolution","1280x1024");
								
								strFrames = "mainContentFrame" + GlobalData.STRING_SEPARATOR + "contentRightFrame" + GlobalData.STRING_SEPARATOR + "file";
								if(switchToFrame(strFrames, false)) {
									gobjWebDriver.getKeyboard().sendKeys(Keys.PAGE_DOWN);
									Thread.sleep(MIC_TIMEOUT*1000);
									int intCounter = 0;
									while(!blnStatus && intCounter < 30) {
										try{
											List<WebElement>Jj=gobjWebDriver.findElements(By.id("form_reqimpoverview:btnCommit"));
											if(Jj.size()>0) {
												Jj.get(0).sendKeys(Keys.ENTER);
												blnStatus=true;
												System.out.println("Commit selected");
												waitForPageLoad(MAX_TIMEOUT);
											}
										}catch(Exception obj) {
											gobjWebDriver.getKeyboard().sendKeys(Keys.TAB);
											intCounter++;
										}
									}
									if(blnStatus) {
										ReportGenerator.generateTestStep(true, currentScreen, "Click Underwriter Commit", "Successfully clicked", true);
									}
									else {
										ReportGenerator.generateTestStep(false, currentScreen, "Click Underwriter Commit", "Object not displayed in expected time.", true);
									}
								}
								else {
									ReportGenerator.generateTestStep(false, currentScreen, "Click " + strHashValue, " Failed to navigate the Frames " + strFrames.replaceAll(GlobalData.STRING_SEPARATOR, " > "), true);
								}
								break;*/
							case "VALIDATE":
								strFrames = "mainContentFrame" + GlobalData.STRING_SEPARATOR + "contentRightFrame" + GlobalData.STRING_SEPARATOR + "file";
								if(switchToFrame(strFrames, false)) {
									WebElement element = gobjWebDriver.findElement(By.name("form_appEntryOverview:_id10"));
									JavascriptExecutor executor = (JavascriptExecutor)gobjWebDriver;
									executor.executeScript("arguments[0].click();", element);
									//blnStatus = setValue(WebControl.BUTTON, IdentifyBy.NAME, "form_appEntryOverview:_id10", validateInput(strHashValue), "Validate", currentScreen);
									waitForPageLoad(MAX_TIMEOUT);
									blnStatus = true;
								}
								else {
									ReportGenerator.generateTestStep(false, currentScreen, "Click " + strHashValue, " Failed to navigate the Frames " + strFrames.replaceAll(GlobalData.STRING_SEPARATOR, " > "), true);
								}
								break;
							case "CV_COMMIT":
								strFrames = "mainContentFrame" + GlobalData.STRING_SEPARATOR + "contentRightFrame" + GlobalData.STRING_SEPARATOR + "file";
								if(switchToFrame(strFrames, false)) {
									gobjWebDriver.getKeyboard().sendKeys(Keys.PAGE_DOWN);
									Thread.sleep(MIC_TIMEOUT*1000);
									WebElement element = gobjWebDriver.findElement(By.name("form_contractmessageview:btnContCommit"));
									JavascriptExecutor executor = (JavascriptExecutor)gobjWebDriver;
									executor.executeScript("arguments[0].click();", element);
									//blnStatus = setValue(WebControl.BUTTON, IdentifyBy.NAME, "form_contractmessageview:btnContCommit", validateInput(strHashValue), "CV Commit", currentScreen);
									Thread.sleep(MIC_TIMEOUT*1000);
									waitForPageLoad(MAX_TIMEOUT);
									ReportGenerator.generateTestStep(true, currentScreen, "Click Commit", "Successfully clicked", true);
									blnStatus = true;
								}
								else {
									ReportGenerator.generateTestStep(false, currentScreen, "Click " + strHashValue, " Failed to navigate the Frames " + strFrames.replaceAll(GlobalData.STRING_SEPARATOR, " > "), true);
								}
								break;
							case "CV_VALIDATE":
								strFrames = "mainContentFrame" + GlobalData.STRING_SEPARATOR + "contentRightFrame" + GlobalData.STRING_SEPARATOR + "file";
								if(switchToFrame(strFrames, false)) {
									gobjWebDriver.getKeyboard().sendKeys(Keys.PAGE_DOWN);
									Thread.sleep(MIC_TIMEOUT*1000);
									WebElement element = gobjWebDriver.findElement(By.name("form_contractmessageview:btnContValidate"));
									JavascriptExecutor executor = (JavascriptExecutor)gobjWebDriver;
									executor.executeScript("arguments[0].click();", element);
									//blnStatus = setValue(WebControl.BUTTON, IdentifyBy.NAME, "form_contractmessageview:btnContValidate", validateInput(strHashValue), "Validate", currentScreen);
									waitForPageLoad(MAX_TIMEOUT);
									blnStatus = true;
									ReportGenerator.generateTestStep(true, currentScreen, "Click Validate", "Successfully clicked", true);
								}
								else {
									ReportGenerator.generateTestStep(false, currentScreen, "Click " + strHashValue, " Failed to navigate the Frames " + strFrames.replaceAll(GlobalData.STRING_SEPARATOR, " > "), true);
								}
								break;
							case "REINSURANCE_COMMIT":
								strFrames = "mainContentFrame" + GlobalData.STRING_SEPARATOR + "contentRightFrame" + GlobalData.STRING_SEPARATOR + "file";
								if(switchToFrame(strFrames, false)) {
									                                                          
									blnStatus = setValue(WebControl.BUTTON, IdentifyBy.NAME, "form_reinsuranceOverview:btnCommCommit", validateInput(strHashValue), "Commit", currentScreen);
									Thread.sleep(MIC_TIMEOUT*1000);
									waitForPageClose(MAX_TIMEOUT);
									strFrames = "mainContentFrame" + GlobalData.STRING_SEPARATOR + "contentLeftFrame" + GlobalData.STRING_SEPARATOR + "file"  + GlobalData.STRING_SEPARATOR + "file"  ;
									if(switchToFrame(strFrames, false)) waitForPageLoad(MAX_TIMEOUT);
									blnStatus = true;
									ReportGenerator.generateTestStep(true, currentScreen, "Click Commit", "Successfully clicked", true);
								}
								else {
									ReportGenerator.generateTestStep(false, currentScreen, "Click Commit", "Object not displayed in expected time.", true);
								}
								break;
							case "ACTION_MENU_OPTIONS":
								strFrames = "mainContentFrame" + GlobalData.STRING_SEPARATOR + "contentRightFrame";
								if(switchToFrame(strFrames, false)) {
									blnStatus = setValue(WebControl.BUTTON, IdentifyBy.ID, "actionMenuImg", validateInput(strHashValue), "Running Man Icon", currentScreen);
									Thread.sleep(MIC_TIMEOUT*1000);
									//waitForPageLoad(MAX_TIMEOUT);
									
									strFrames = "mainContentFrame" + GlobalData.STRING_SEPARATOR + "contentRightFrame"+ GlobalData.STRING_SEPARATOR + "actionMenu";
									if(switchToFrame(strFrames, false)){
									
										//WebElement Opt=gobjWebDriver.findElement(By.xpath("//a[text()='" + strHashValue + "']"));
										Thread.sleep(5000);	
										WebElement element = gobjWebDriver.findElement(By.xpath("//a[text()='" + strHashValue + "']"));
										JavascriptExecutor executor = (JavascriptExecutor)gobjWebDriver;
										executor.executeScript("arguments[0].click();", element);
										Thread.sleep(5000);
										waitForPageLoad(MAX_TIMEOUT);
										blnStatus = true;
									}
									
								}
								if(blnStatus) {
									ReportGenerator.generateTestStep(true, currentScreen, "Click " + strHashValue, "Successfully clicked", true);
								}
								else {
									ReportGenerator.generateTestStep(false, currentScreen, "Click " + strHashValue, "Object not displayed in expected time.", true);
								}
								break;
								case "Left_arrow":
									//Thread.sleep(20000);
									strFrames = "titleFrame" ;
									if(switchToFrame(strFrames, false)) {
										//Thread.sleep(5000);	
										WebElement element = gobjWebDriver.findElement(By.xpath("//img[@ src='images/arrow_left.gif']"));
										JavascriptExecutor executor = (JavascriptExecutor)gobjWebDriver;
										executor.executeScript("arguments[0].click();", element);
										Thread.sleep(5000);
										waitForPageLoad(MAX_TIMEOUT);
										ReportGenerator.generateTestStep(true, currentScreen, "Left Arrow", "Successfully clicked", true);
										strFrames = "mainContentFrame" + GlobalData.STRING_SEPARATOR + "contentRightFrame" + GlobalData.STRING_SEPARATOR + "file";
										if(switchToFrame(strFrames, false))waitForPageLoad(MAX_TIMEOUT);
										blnStatus=true;
									}
									else {
										ReportGenerator.generateTestStep(false, currentScreen, "Click " + strHashValue, " Failed to navigate the Frames " + strFrames.replaceAll(GlobalData.STRING_SEPARATOR, " > "), true);
									}
									break;
							/*case "Left_arrow":
								strFrames = "titleFrame" ;
								if(switchToFrame(strFrames, false)) {
									blnStatus = setValue(WebControl.LINK, IdentifyBy.XPATH, "//img[@ src='images/arrow_left.gif']", strHashValue, "Left Arrow", currentScreen);
									
									waitForPageLoad(MAX_TIMEOUT);
								}
								else {
									ReportGenerator.generateTestStep(false, currentScreen, "Click " + strHashValue, " Failed to navigate the Frames " + strFrames.replaceAll(GlobalData.STRING_SEPARATOR, " > "), true);
								}
								break;*/
							case "Right_Arrow":
								Thread.sleep(20000);
								strFrames = "titleFrame" ;
								if(switchToFrame(strFrames, false)) {
									Thread.sleep(5000);	
									WebElement element = gobjWebDriver.findElement(By.xpath("//img[@ src='images/arrow_right.gif']"));
									JavascriptExecutor executor = (JavascriptExecutor)gobjWebDriver;
									executor.executeScript("arguments[0].click();", element);
									Thread.sleep(5000);
									waitForPageLoad(MAX_TIMEOUT);
									ReportGenerator.generateTestStep(true, currentScreen, "Right arrow", "Successfully clicked", true);
									strFrames = "mainContentFrame" + GlobalData.STRING_SEPARATOR + "contentRightFrame" + GlobalData.STRING_SEPARATOR + "file";
									if(switchToFrame(strFrames, false))waitForPageLoad(MAX_TIMEOUT);
									blnStatus=true;
								}
								else {
									ReportGenerator.generateTestStep(false, currentScreen, "Click " + strHashValue, " Failed to navigate the Frames " + strFrames.replaceAll(GlobalData.STRING_SEPARATOR, " > "), true);
								}
								break;
							case "BRIEF_CASE":
								strFrames = "mainContentFrame" + GlobalData.STRING_SEPARATOR + "contentRightFrame"+GlobalData.STRING_SEPARATOR +"nbaContextMenu";
								if(switchToFrame(strFrames, false)) {
									blnStatus = setValue(WebControl.BUTTON, IdentifyBy.ID, "cbSummary", validateInput(strHashValue), "Brify case Icon seletion", currentScreen);
									//Thread.sleep(MIC_TIMEOUT*1000);
									waitForPageLoad(MAX_TIMEOUT);
									
								}
								else {
									ReportGenerator.generateTestStep(false, currentScreen, "Click " + strHashValue, " Failed to navigate the Frames " + strFrames.replaceAll(GlobalData.STRING_SEPARATOR, " > "), true);
								}
								break;
							case "Images":
								strFrames = "mainContentFrame" + GlobalData.STRING_SEPARATOR + "contentRightFrame" + GlobalData.STRING_SEPARATOR + "nbaContextMenu";
								if(switchToFrame(strFrames, false)) { 
									WebElement element = gobjWebDriver.findElement(By.id("cbImagesSummary"));
									JavascriptExecutor executor = (JavascriptExecutor)gobjWebDriver;
									executor.executeScript("arguments[0].click();", element);
									Thread.sleep(5000);
									waitForPageLoad(MAX_TIMEOUT);
									blnStatus = true;
									ReportGenerator.generateTestStep(true, currentScreen, "Click " + strHashKey, "Successfully clicked", true);
								}
								else {
									ReportGenerator.generateTestStep(false, currentScreen, "Click " + strHashKey, "Object not displayed in expected time.", true);
								}
								break;
							case "COMMENTS_COMMIT":
								strFrames = "mainContentFrame" + GlobalData.STRING_SEPARATOR + "contentRightFrame" + GlobalData.STRING_SEPARATOR + "file";
								
								if(switchToFrame(strFrames, false)) {
									Thread.sleep(5000);	
									waitForPageLoad(MAX_TIMEOUT); 
									//WebElement element = gobjWebDriver.findElement(By.xpath("//input[contains(@name,'nbaCommentBar:commit')]") ); 
									WebElement element = gobjWebDriver.findElement(By.cssSelector("//input[name='form_reqimpoverview:nbaCommentBar:commit']") );
									JavascriptExecutor executor = (JavascriptExecutor)gobjWebDriver;
									executor.executeScript("arguments[0].click();", element);
									Thread.sleep(5000);
									Thread.sleep(MIC_TIMEOUT);
									waitForPageLoad(MAX_TIMEOUT);
									blnStatus = true;
								}
								
							
								if(blnStatus) {
									ReportGenerator.generateTestStep(true, currentScreen, "Click Commit", "Successfully clicked", true);
								}
								else {
									ReportGenerator.generateTestStep(false, currentScreen, "Click Commit", "Object not displayed in expected time.", true);
								}
									
								break;
							/*case "COMMENTSCOMMIT":
								strFrames = "mainContentFrame" + GlobalData.STRING_SEPARATOR + "contentRightFrame" + GlobalData.STRING_SEPARATOR + "file";
								
								if(switchToFrame(strFrames, false)) {
									Thread.sleep(5000);	
									waitForPageLoad(MAX_TIMEOUT);
									WebElement element = gobjWebDriver.findElement(By.cssSelector("//input[id='form_ContractStatus:nbaCommentBar:commit']") );
									JavascriptExecutor executor = (JavascriptExecutor)gobjWebDriver;
									executor.executeScript("arguments[0].click();", element);
									Thread.sleep(5000);
									Thread.sleep(MIC_TIMEOUT);
									waitForPageLoad(MAX_TIMEOUT);
									blnStatus = true;
								}
								
							
								if(blnStatus) {
									ReportGenerator.generateTestStep(true, currentScreen, "Click Commit", "Successfully clicked", true);
								}
								else {
									ReportGenerator.generateTestStep(false, currentScreen, "Click Commit", "Object not displayed in expected time.", true);
								}
									
								break;*/
							case "UW_NIGO":
								strFrames = "mainContentFrame" + GlobalData.STRING_SEPARATOR + "contentRightFrame" + GlobalData.STRING_SEPARATOR + "nbaContextMenu";
								
								if(switchToFrame(strFrames, false)) {
								
									waitForPageLoad(MAX_TIMEOUT); 
									WebElement element = gobjWebDriver.findElement(By.xpath("//input[contains(@name,'checkedIcon')]") ); 
									//WebElement element = gobjWebDriver.findElement(By.cssSelector("//input[name='form_reqimpoverview:nbaCommentBar:commit']") );
									JavascriptExecutor executor = (JavascriptExecutor)gobjWebDriver;
									executor.executeScript("arguments[0].click();", element);
									Thread.sleep(5000);
									
									waitForPageLoad(MAX_TIMEOUT);
									blnStatus = true;
								}
								
							
								if(blnStatus) {
									ReportGenerator.generateTestStep(true, currentScreen, "Click Uw Nigo", "Successfully clicked", true);
								}
								else {
									ReportGenerator.generateTestStep(false, currentScreen, "Click Uw Nigo", "Object not displayed in expected time.", true);
								}
									
								break;
							case "ADD COMMENT":
								strFrames = "mainContentFrame" + GlobalData.STRING_SEPARATOR + "contentRightFrame" + GlobalData.STRING_SEPARATOR + "file";
								if(switchToFrame(strFrames, false)) {
								
										
										//WebElement Opt=gobjWebDriver.findElement(By.xpath("//a[text()='" + strHashValue + "']"));
										Thread.sleep(5000);	
										WebElement element = gobjWebDriver.findElement(By.cssSelector("//input[value='ADD COMMENT']") );
										JavascriptExecutor executor = (JavascriptExecutor)gobjWebDriver;
										executor.executeScript("arguments[0].click();", element);
										Thread.sleep(5000);
										Thread.sleep(MIC_TIMEOUT);
										waitForPageLoad(MAX_TIMEOUT);
										blnStatus = true;
									}
								
								if(blnStatus) {
									ReportGenerator.generateTestStep(true, currentScreen, "Click " + strHashValue, "Successfully clicked", true);
								}
								else {
									ReportGenerator.generateTestStep(false, currentScreen, "Click " + strHashValue, "Object not displayed in expected time.", true);
								}
								
								break;
							case "VMT_TIMER":
								Thread.sleep(20000);
								strFrames = "titleFrame" ;
								if(switchToFrame(strFrames, false)) {
									blnStatus = setValue(WebControl.BUTTON, IdentifyBy.XPATH, "//input[@ src='images/axaDashboard/dashboard.png']", validateInput(strHashValue), "VMT", currentScreen);
									//Thread.sleep(MIC_TIMEOUT*1000);
									waitForPageLoad(MAX_TIMEOUT);
									String cHandle = gobjWebDriver.getWindowHandle();
									waitForWindowAndSwitch(cHandle, "Visual Management Tool", false);
									waitForPageLoad(MAX_TIMEOUT);
									System.out.println("Sucessfully switched");
									String actualTitle = gobjWebDriver.getTitle();
									System.out.println(actualTitle);
									/*gobjWebDriver.switchTo().frame(0);
//									switchToFrame(strFrames, false)
									//driver.findElement(By.xpath("//button[starts-with(@id,'yui_patched_v3_')][text()='OK']")).click();
									WebElement element = gobjWebDriver.findElement(By.xpath("//div[@class='flap']"));
									JavascriptExecutor executor = (JavascriptExecutor)gobjWebDriver;
									executor.executeScript("arguments[0].click();", element);*/
									
									waitForPageLoad(MAX_TIMEOUT);
									
									
									
								}
								else {
									ReportGenerator.generateTestStep(false, currentScreen, "Click " + strHashValue, " Failed to navigate the Frames " + strFrames.replaceAll(GlobalData.STRING_SEPARATOR, " > "), true);
								}
								break;
							case "PreferedProcessingscreen":
								strFrames = "mainContentFrame" + GlobalData.STRING_SEPARATOR + "contentRightFrame" + GlobalData.STRING_SEPARATOR + "file";
								if(switchToFrame(strFrames, false)) {
									blnStatus = setValue(WebControl.BUTTON, IdentifyBy.NAME, "form_finalDispOverview:navigation1:_id14", validateInput(strHashValue), "PreferedProcessingscreen", currentScreen);
								}
								else {
									ReportGenerator.generateTestStep(false, currentScreen, "Click " + strHashValue, " Failed to navigate the Frames " + strFrames.replaceAll(GlobalData.STRING_SEPARATOR, " > "), true);
								}
								break;
							case "default1":
								ReportGenerator.generateTestStep(false, currentScreen, "Field Navigation", strHashKey + " field not available in the current method.", false);
								break;
						} //end of switch
						if(!blnStatus) break;
					} //end of while
				//}
				//else {
				//	ReportGenerator.generateTestStep(false, currentScreen, "Switch to Frame", "Failed to switch frames " + strFrames.replaceAll(GlobalData.STRING_SEPARATOR, " > "), false);
				//	blnStatus = false;
				//}
				objEnum = null;
			//}
				
		} catch(Exception objExp) {
			ReportGenerator.generateTestStep(false, currentScreen, "Exception occured", "Exception is - " + objExp.getMessage(), false);
			blnStatus = false;
		}
		return blnStatus;
	}
	
	private static boolean InsuredInfoA2(OrderedHashtable objTestData) {
		boolean blnStatus = false;
		String strHashKey = "", strHashValue = "";
		try {
			String strFrames = "mainContentFrame" + GlobalData.STRING_SEPARATOR + "contentRightFrame" + GlobalData.STRING_SEPARATOR + "file" + GlobalData.STRING_SEPARATOR + "file";
			Enumeration objEnum = objTestData.enumerateKeys();
			//if(waitForPageLoad(MAX_TIMEOUT)) {
				if(switchToFrame(strFrames, false) && waitForPageLoad(MAX_TIMEOUT)) {
					while(objEnum.hasMoreElements()) {
						//blnStatus = false;
						strHashKey = objEnum.nextElement().toString();
						strHashValue = objTestData.get(strHashKey).toString();
						
						switch(strHashKey) {
							case "PERSONAL":
								blnStatus = setValue(WebControl.LINK, IdentifyBy.NAME, "form_insuredInfoA2:ax2PurposeOfInsurance:personalInfo_CButton", validateInput(strHashValue), "Personal", currentScreen);
								break;
							case "BUSINESS":
								blnStatus = setValue(WebControl.LINK, IdentifyBy.NAME, "form_insuredInfoA2:ax2PurposeOfInsurance:business_OT", validateInput(strHashValue), "Business", currentScreen);
								break;
							case "OTH_INS_21A":
								blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_insuredInfoA2:ax2OtherInsuranceQuestions:tobaccoalchoholQuestionsTablePane:0:Q55Ans_DD", validateInput(strHashValue), "21a", currentScreen);
								break;
							case "OTH_INS_21B":
								blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_insuredInfoA2:ax2OtherInsuranceQuestions:tobaccoalchoholQuestionsTablePane:1:Q55Ans_DD", validateInput(strHashValue), "21b", currentScreen);
								break;
							case "OTH_INS_21C":
								blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_insuredInfoA2:ax2OtherInsuranceQuestions:tobaccoalchoholQuestionsTablePane:2:Q55Ans_DD", validateInput(strHashValue), "21c", currentScreen);
								break;
							case "21D_TOTAL_AMOUNT":
								blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_insuredInfoA2:ax2OtherInsuranceQuestions:pendingInsuranceAmountProposedInsured1_EF", validateInput(strHashValue), "21d Total Amount", currentScreen);
								break;
							case "21AB_COMPANY_NAME":
								blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_insuredInfoA2:ax2OtherInsuranceInfo:otherInsuranceCompanyName_DD", validateInput(strHashValue), "21ab Company Name", currentScreen);
								break;
							case "21AB_FACE_AMOUNT_PLUS_RIDERS":
								blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_insuredInfoA2:ax2OtherInsuranceInfo:faceAmountRider_EF", validateInput(strHashValue), "Face Amount Plus Riders", currentScreen);
								break;
							case "21AB_YEAR_ISSUED":
								blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_insuredInfoA2:ax2OtherInsuranceInfo:yearIssued_EF", validateInput(strHashValue), "Year Issued", currentScreen);
								break;
							case "21AB_POLICY_CONTRACT_NO":
								blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_insuredInfoA2:ax2OtherInsuranceInfo:contractNumber_EF", validateInput(strHashValue), "Policy Contract No", currentScreen);
								break;
							case "21AB_POLICY_CONTRACT_TYPE":
								blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_insuredInfoA2:ax2OtherInsuranceInfo:lifeProposedInsurance_EF", validateInput(strHashValue), "Policy Contract Type", currentScreen);
								break;
							case "21AB_REPLACED_OR_AFFECTED":
								blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_insuredInfoA2:ax2OtherInsuranceInfo:replacedOrEffected_DD", validateInput(strHashValue), "To be Replaced", currentScreen);
								break;
							case "21AB_1035_EXCHANGE":
								blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_insuredInfoA2:ax2OtherInsuranceInfo:exchangeQuestion_DD", validateInput(strHashValue), "1035 Exchange", currentScreen);
								break;
							case "21AB_PRODUCT_TYPE":
								blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_insuredInfoA2:ax2OtherInsuranceInfo:ProductType_DD", validateInput(strHashValue), "Product Type", currentScreen);
								break;
							case "21AB_ADD":
								blnStatus = setValue(WebControl.BUTTON, IdentifyBy.NAME, "form_insuredInfoA2:ax2OtherInsuranceInfo:lifeOtherInsuranceAdd_CButton", validateInput(strHashValue), "21ab Add", currentScreen);
								break;
							case "21C_COMPANY_NAME":
								blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_insuredInfoA2:ax2PendingOtherInsuranceInfo:otherInsuranceCompanyName_DD", validateInput(strHashValue), "21c Company Name", currentScreen);
								break;
							case "21C_FACE_AMOUNT_PLUS_RIDERS":
								blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_insuredInfoA2:ax2PendingOtherInsuranceInfo:amountAppliedFor_EF", validateInput(strHashValue), "21c Face Amount Plus Riders", currentScreen);
								break;
							case "21C_COMPETITIVE_ADDITIONAL":
								blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_insuredInfoA2:ax2PendingOtherInsuranceInfo:compatativeOrAdditional_DD", validateInput(strHashValue), "21c Compatative or Additional ", currentScreen);
								break;
							case "21C_ADD":
								blnStatus = setValue(WebControl.BUTTON, IdentifyBy.NAME, "form_insuredInfoA2:ax2PendingOtherInsuranceInfo:pendingInsuranceTableAdd_Button", validateInput(strHashValue), "21C Add", currentScreen);
								break;		
							case"SELECT_COMPANY":
								blnStatus = selectWebtableRow(IdentifyBy.ID, "form_insuredInfoA2:ax2OtherInsuranceInfo:lifeOtherInsurance_DataTable", "", "Comapny", currentScreen);
								break;
							case"UPDATE":
								blnStatus = setValue(WebControl.BUTTON, IdentifyBy.NAME, "form_insuredInfoA2:ax2OtherInsuranceInfo:lifeOtherInsuranceUpdate_CButton", validateInput(strHashValue), "UPDATE", currentScreen);
								break;
							case "default1":
								ReportGenerator.generateTestStep(false, currentScreen, "Field Navigation", strHashKey + " field not available in the current method.", false);
								break;
						} //end of switch
						if(!blnStatus) break;
					} //end of while
				}
				else {
					ReportGenerator.generateTestStep(false, currentScreen, "Switch to Frame", "Failed to switch frames " + strFrames.replaceAll(GlobalData.STRING_SEPARATOR, " > "), false);
					blnStatus = false;
				}
				objEnum = null;
			//}
				
		} catch(Exception objExp) {
			ReportGenerator.generateTestStep(false, currentScreen, "Exception occured", "Exception is - " + objExp.getMessage(), false);
			blnStatus = false;
		}
		return blnStatus;
	}
	
	private static boolean InsuredInfoA3(OrderedHashtable objTestData) {
		boolean blnStatus = false;
		String strHashKey = "", strHashValue = "";
		try {
			String strFrames = "mainContentFrame" + GlobalData.STRING_SEPARATOR + "contentRightFrame" + GlobalData.STRING_SEPARATOR + "file" + GlobalData.STRING_SEPARATOR + "file";
			Enumeration objEnum = objTestData.enumerateKeys();
			if(switchToFrame(strFrames, false) && waitForPageLoad(MAX_TIMEOUT)) {
				
				while(objEnum.hasMoreElements()) {
					//blnStatus = false;
					strHashKey = objEnum.nextElement().toString();
					strHashValue = objTestData.get(strHashKey).toString();

					switch(strHashKey) {
						case "Q22":
							blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_aeInsuredInfoA3:axaProposedInsuredPersonalHistory:tobaccoalchoholQuestionsTablePane:0:Q22Ans_DD", validateInput(strHashValue), "Question 22", currentScreen);
							break;
						case "Q23":
							blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_aeInsuredInfoA3:axaProposedInsuredPersonalHistory:tobaccoalchoholQuestionsTablePane:1:Q22Ans_DD", validateInput(strHashValue), "Question 23", currentScreen);
							break;
						case "Q24":
							blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_aeInsuredInfoA3:axaProposedInsuredPersonalHistory:tobaccoalchoholQuestionsTablePane:2:Q22Ans_DD", validateInput(strHashValue), "Question 24", currentScreen);
							break;
						case "Q25":
							blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_aeInsuredInfoA3:axaProposedInsuredPersonalHistory:tobaccoalchoholQuestionsTablePane:3:Q22Ans_DD", validateInput(strHashValue), "Question 25", currentScreen);
							break;
						case "Q26":
							blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_aeInsuredInfoA3:axaProposedInsuredPersonalHistory:tobaccoalchoholQuestionsTablePane:4:Q22Ans_DD", validateInput(strHashValue), "Question 26", currentScreen);
							break;
						case "Q27":
							blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_aeInsuredInfoA3:axaProposedInsuredPersonalHistory:tobaccoalchoholQuestionsTablePane:5:Q22Ans_DD", validateInput(strHashValue), "Question 27", currentScreen);
							break;
						case "Q28":
							blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_aeInsuredInfoA3:axaProposedInsuredPersonalHistory:tobaccoalchoholQuestionsTablePane:6:Q22Ans_DD", validateInput(strHashValue), "Question 28", currentScreen);
							break;
						case "Q29A":
							blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_aeInsuredInfoA3:axaProposedInsuredPersonalHistory:tobaccoalchoholQuestionsTablePane:7:Q22Ans_DD", validateInput(strHashValue), "Question 29A", currentScreen);
							break;
						case "Q29B":
							blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_aeInsuredInfoA3:axaProposedInsuredPersonalHistory:tobaccoalchoholQuestionsTablePane:8:Q22Ans_DD", validateInput(strHashValue), "Question 29B", currentScreen);
							break;
						case "Q29C":
							blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_aeInsuredInfoA3:axaProposedInsuredPersonalHistory:tobaccoalchoholQuestionsTablePane:9:Q22Ans_DD", validateInput(strHashValue), "Question 29C", currentScreen);
							break;
						case "Q29D":
							blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_aeInsuredInfoA3:axaProposedInsuredPersonalHistory:tobaccoalchoholQuestionsTablePane:10:Q22Ans_DD", validateInput(strHashValue), "Question 29D", currentScreen);
							break;
						case "Q30":
							blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_aeInsuredInfoA3:axaProposedInsuredPersonalHistory:tobaccoalchoholQuestionsTablePane:11:Q22Ans_DD", validateInput(strHashValue), "Question 30", currentScreen);
							break;
						case "Q30_NY":
							blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_aeInsuredInfoA3:axaProposedInsuredPersonalHistory:tobaccoalchoholQuestionsTablePane:9:Q22Ans_DD", validateInput(strHashValue), "Question 30", currentScreen);
							break;
						case "Q31":
							blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_aeInsuredInfoA3:axaAlcoholDrugTobaccoUse:tobaccoalchoholQuestionsTablePane:0:Q31Ans_DD", validateInput(strHashValue), "Question 31", currentScreen);
							break;
						case "Q32":
							blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_aeInsuredInfoA3:axaAlcoholDrugTobaccoUse:tobaccoalchoholQuestionsTablePane:1:Q31Ans_DD", validateInput(strHashValue), "Question 32", currentScreen);
							break;
						case "TOBACCO_USAGE_YES":
							blnStatus = setValue(WebControl.BUTTON, IdentifyBy.NAME, "form_aeInsuredInfoA3:axaAlcoholDrugTobaccoUse:tobaccoalchoholQuestionsTablePane:1:alcoholUseAdditionalDetails_CButton", validateInput(strHashValue), "Tobacco Usage Fill Information", currentScreen);
							break;
						case "ANOTHER_COMPANY_EXAM_USED":
							blnStatus = setValue(WebControl.CHECKBOX, IdentifyBy.NAME, "form_aeInsuredInfoA3:axaAnothercompExamDetails:Q57_CB", validateInput(strHashValue), "Is another company exam being used?", currentScreen);
							break;
						case "INSURED_COMPANY":
							blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_aeInsuredInfoA3:axaAnothercompExamDetails:nameOfCompany_DD", validateInput(strHashValue), "Name of Insurance Company", currentScreen);
							break;
						case "DATE_OF_EXAM":
							blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_aeInsuredInfoA3:axaAnothercompExamDetails:dateOfExam_EF", validateInput(strHashValue), "Date of Exam", currentScreen);
							break;
						case "Q34":
							blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_aeInsuredInfoA3:axaMedicalCertificationDetails:medicalCertificationQuestionsTablePane:0:aeMedicalCertificationQuestionsQAns", validateInput(strHashValue), "Question 34", currentScreen);
							break;
						case "Q35":
							blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_aeInsuredInfoA3:axaMedicalCertificationDetails:medicalCertificationQuestionsTablePane:1:aeMedicalCertificationQuestionsQAns", validateInput(strHashValue), "Question 35", currentScreen);
							break;
						case "default1":
							ReportGenerator.generateTestStep(false, currentScreen, "Field Navigation", strHashKey + " field not available in the current method.", false);
							break;
					} //end of switch
					if(!blnStatus) break;
				} //end of while
			}
			else {
				ReportGenerator.generateTestStep(false, currentScreen, "Switch to Frame", "Failed to switch frames " + strFrames.replaceAll(GlobalData.STRING_SEPARATOR, " > "), false);
				blnStatus = false;
			}
			objEnum = null;
				
		} catch(Exception objExp) {
			ReportGenerator.generateTestStep(false, currentScreen, "Exception occured", "Exception is - " + objExp.getMessage(), false);
			blnStatus = false;
		}
		return blnStatus;
	}
	
	private static boolean TobaccoUsageFillInfo(OrderedHashtable objTestData) {
		boolean blnStatus = false;
		String strHashKey = "", strHashValue = "";
		try {
			String strFrames = "FWin0" + GlobalData.STRING_SEPARATOR + "Content0";
			Enumeration objEnum = objTestData.enumerateKeys();
			if(switchToFrame(strFrames, false) && waitForPageLoad(MAX_TIMEOUT)) {
				
				while(objEnum.hasMoreElements()) {
					//blnStatus = false;
					strHashKey = objEnum.nextElement().toString();
					strHashValue = objTestData.get(strHashKey).toString();

					switch(strHashKey) {
						case "TOBACCO_PRODUCT":
							blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_UlTobaccoUseDetails:product_DD", validateInput(strHashValue), "Product", currentScreen);
							break;
						case "QUANTITY":
							blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_UlTobaccoUseDetails:quantity_EF", validateInput(strHashValue), "Quantity", currentScreen);
							break;
						case "CURRENT_PAST":
							blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_UlTobaccoUseDetails:current_DD", validateInput(strHashValue), "Current or Past", currentScreen);
							break;
						case "YEARS":
							blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_UlTobaccoUseDetails:years_EF", validateInput(strHashValue), "Years", currentScreen);
							break;
						case "DATE_STOPPED":
							blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_UlTobaccoUseDetails:dateStopped_EF", validateInput(strHashValue), "Date Stopped", currentScreen);
							break;
						case "FREQUENCY":
							blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_UlTobaccoUseDetails:frequency_DD", validateInput(strHashValue), "Frequency", currentScreen);
							break;
						case "ADD_INFO_DETAILS":
							blnStatus = setValue(WebControl.BUTTON, IdentifyBy.NAME, "form_UlTobaccoUseDetails:tobaccoUseAdd_CButton", validateInput(strHashValue), "Add Data", currentScreen);
							break;
						case "ADD":
							blnStatus = setValue(WebControl.BUTTON, IdentifyBy.NAME, "form_UlTobaccoUseDetails:Add_CButton", validateInput(strHashValue), "Add", currentScreen);
							break;
						case "default1":
							ReportGenerator.generateTestStep(false, currentScreen, "Field Navigation", strHashKey + " field not available in the current method.", false);
							break;
					} //end of switch
					if(!blnStatus) break;
				} //end of while
			}
			else {
				ReportGenerator.generateTestStep(false, currentScreen, "Switch to Frame", "Failed to switch frames " + strFrames.replaceAll(GlobalData.STRING_SEPARATOR, " > "), false);
				blnStatus = false;
			}
			objEnum = null;
				
		} catch(Exception objExp) {
			ReportGenerator.generateTestStep(false, currentScreen, "Exception occured", "Exception is - " + objExp.getMessage(), false);
			blnStatus = false;
		}
		return blnStatus;
	}
	
	private static boolean PersonalDetails(OrderedHashtable objTestData) {
		boolean blnStatus = false;
		String strHashKey = "", strHashValue = "";
		try {
			String strFrames = "FWin0" + GlobalData.STRING_SEPARATOR + "Content0";
			Enumeration objEnum = objTestData.enumerateKeys();
			if(switchToFrame(strFrames, false) && waitForPageLoad(MAX_TIMEOUT)) {
				
				while(objEnum.hasMoreElements()) {
					//blnStatus = false;
					strHashKey = objEnum.nextElement().toString();
					strHashValue = objTestData.get(strHashKey).toString();

					switch(strHashKey) {
						case "CHARITABLE_GIFTING":
							blnStatus = setValue(WebControl.UNIQUE_CHECKBOX, IdentifyBy.NAME, "form_UlPersonDetails:personalPurposeOfInsurance_DD", getAppCheckboxValues(strHashKey, strHashValue), "Charitable Gifting", currentScreen);
							break;
						case "ESTATE_PLANNING":
							blnStatus = setValue(WebControl.UNIQUE_CHECKBOX, IdentifyBy.NAME, "form_UlPersonDetails:personalPurposeOfInsurance_DD", getAppCheckboxValues(strHashKey, strHashValue), "Estate Planning", currentScreen);
							break;
						case "FAMILY_PROTECTION":
							blnStatus = setValue(WebControl.UNIQUE_CHECKBOX, IdentifyBy.NAME, "form_UlPersonDetails:personalPurposeOfInsurance_DD", getAppCheckboxValues(strHashKey, strHashValue), "Family Protection", currentScreen);
							break;
						case "MORTGAGE":
							blnStatus = setValue(WebControl.UNIQUE_CHECKBOX, IdentifyBy.NAME, "form_UlPersonDetails:personalPurposeOfInsurance_DD", getAppCheckboxValues(strHashKey, strHashValue), "Mortgage", currentScreen);
							break;
						case "OTHER":
							blnStatus = setValue(WebControl.UNIQUE_CHECKBOX, IdentifyBy.NAME, "form_UlPersonDetails:personalPurposeOfInsurance_DD", getAppCheckboxValues(strHashKey, strHashValue), "Other", currentScreen);
							break;
						case "ADD":
							blnStatus = setValue(WebControl.BUTTON, IdentifyBy.NAME, "form_UlPersonDetails:drAdd", validateInput(strHashValue), "Add", currentScreen);
							break;
						case "default1":
							ReportGenerator.generateTestStep(false, currentScreen, "Field Navigation", strHashKey + " field not available in the current method.", false);
							break;
					} //end of switch
					if(!blnStatus) break;
				} //end of while
			}
			else {
				ReportGenerator.generateTestStep(false, currentScreen, "Switch to Frame", "Failed to switch frames " + strFrames.replaceAll(GlobalData.STRING_SEPARATOR, " > "), false);
				blnStatus = false;
			}
			objEnum = null;
				
		} catch(Exception objExp) {
			ReportGenerator.generateTestStep(false, currentScreen, "Exception occured", "Exception is - " + objExp.getMessage(), false);
			blnStatus = false;
		}
		return blnStatus;
	}
	
	private static boolean BusinessDetails(OrderedHashtable objTestData) {
		boolean blnStatus = false;
		String strHashKey = "", strHashValue = "";
		try {
			String strFrames = "FWin0" + GlobalData.STRING_SEPARATOR + "Content0";
			Enumeration objEnum = objTestData.enumerateKeys();
			if(switchToFrame(strFrames, false) && waitForPageLoad(MAX_TIMEOUT)) {
				
				while(objEnum.hasMoreElements()) {
					//blnStatus = false;
					strHashKey = objEnum.nextElement().toString();
					strHashValue = objTestData.get(strHashKey).toString();

					switch(strHashKey) {
						case "BUY_SELL":
							blnStatus = setValue(WebControl.UNIQUE_CHECKBOX, IdentifyBy.NAME, "form_UlBusinessDetails:businessPurposeOfInsurance_DD", getAppCheckboxValues(strHashKey, strHashValue), "Buy Sell", currentScreen);
							break;
						case "DEFERRED_COMP":
							blnStatus = setValue(WebControl.UNIQUE_CHECKBOX, IdentifyBy.NAME, "form_UlBusinessDetails:businessPurposeOfInsurance_DD", getAppCheckboxValues(strHashKey, strHashValue), "Deffered Comp", currentScreen);
							break;
						case "KEY_PERSON":
							blnStatus = setValue(WebControl.UNIQUE_CHECKBOX, IdentifyBy.NAME, "form_UlBusinessDetails:businessPurposeOfInsurance_DD", getAppCheckboxValues(strHashKey, strHashValue), "Key Person", currentScreen);
							break;
						case "LOAN__INDEMNIFICATION":
							blnStatus = setValue(WebControl.UNIQUE_CHECKBOX, IdentifyBy.NAME, "form_UlBusinessDetails:businessPurposeOfInsurance_DD", getAppCheckboxValues(strHashKey, strHashValue), "Loan Indemnification", currentScreen);
							break;
						case "OTHER":
							blnStatus = setValue(WebControl.UNIQUE_CHECKBOX, IdentifyBy.NAME, "form_UlBusinessDetails:businessPurposeOfInsurance_DD", getAppCheckboxValues(strHashKey, strHashValue), "Other", currentScreen);
							break;
						case "FILED_FOR_BANKRUPTCY":					
							blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_UlBusinessDetails:businessPastQuestion_DD", strHashKey, "Business filed for bankruptcy", currentScreen);
							break;
						case "ADD":
							blnStatus = setValue(WebControl.BUTTON, IdentifyBy.NAME, "form_UlBusinessDetails:drAdd", validateInput(strHashValue), "Add", currentScreen);
							break;
						case "default1":
							ReportGenerator.generateTestStep(false, currentScreen, "Field Navigation", strHashKey + " field not available in the current method.", false);
							break;
					} //end of switch
					if(!blnStatus) break;
				} //end of while
			}
			else {
				ReportGenerator.generateTestStep(false, currentScreen, "Switch to Frame", "Failed to switch frames " + strFrames.replaceAll(GlobalData.STRING_SEPARATOR, " > "), false);
				blnStatus = false;
			}
			objEnum = null;
				
		} catch(Exception objExp) {
			ReportGenerator.generateTestStep(false, currentScreen, "Exception occured", "Exception is - " + objExp.getMessage(), false);
			blnStatus = false;
		}
		return blnStatus;
	}
	
	//Function For InsuredInfoA4ToA5 flow
		private static boolean InsuredInfoA4ToA5(OrderedHashtable objTestData) {
			boolean blnStatus = false;
			String strHashKey = "", strHashValue = "";
			try {
				String strFrames = "mainContentFrame" + GlobalData.STRING_SEPARATOR + "contentRightFrame" + GlobalData.STRING_SEPARATOR + "file" + GlobalData.STRING_SEPARATOR + "file";
				Enumeration objEnum = objTestData.enumerateKeys();
				if(switchToFrame(strFrames, false) && waitForPageLoad(MAX_TIMEOUT)) {
					
					while(objEnum.hasMoreElements()) {
						//blnStatus = false;
						strHashKey = objEnum.nextElement().toString();
						strHashValue = objTestData.get(strHashKey).toString();

						switch(strHashKey) {
							case "Q36":
								blnStatus = setValue(WebControl.SELECT, IdentifyBy.ID, "form_pageInsuredInfoA4A5:axaSourceOfFunds:srcOfFundQuestion_DD", validateInput(strHashValue), "Question 36:", currentScreen);
								break;
							case "37A_INCOME":
								blnStatus = setValue(WebControl.UNIQUE_CHECKBOX, IdentifyBy.NAME, "form_pageInsuredInfoA4A5:axaSourceOfFunds:personalPurposeOfInsurance_DD", getAppCheckboxValues(strHashKey, strHashValue), "37a.Income", currentScreen);
								break;
							case "37A_INVESTMENTS":
								blnStatus = setValue(WebControl.UNIQUE_CHECKBOX, IdentifyBy.NAME, "form_pageInsuredInfoA4A5:axaSourceOfFunds:personalPurposeOfInsurance_DD", getAppCheckboxValues(strHashKey, strHashValue), "37a. Investments/Savings", currentScreen);
								break;
							case "Q37A_LOANS":
								blnStatus = setValue(WebControl.UNIQUE_CHECKBOX, IdentifyBy.NAME, "form_pageInsuredInfoA4A5:axaSourceOfFunds:personalPurposeOfInsurance_DD", getAppCheckboxValues(strHashKey, strHashValue), "37a.Loans", currentScreen);
								break;
							case "Q37A_GIFTS":
								blnStatus = setValue(WebControl.UNIQUE_CHECKBOX, IdentifyBy.NAME, "form_pageInsuredInfoA4A5:axaSourceOfFunds:personalPurposeOfInsurance_DD", getAppCheckboxValues(strHashKey, strHashValue), "37a. Gifts/Inheritance", currentScreen);
								break;
							case "Q37A_SETTLED_CONTRACTS":
								blnStatus = setValue(WebControl.UNIQUE_CHECKBOX, IdentifyBy.NAME, "form_pageInsuredInfoA4A5:axaSourceOfFunds:personalPurposeOfInsurance_DD", getAppCheckboxValues(strHashKey, strHashValue), "37a. Settled Contracts", currentScreen);
								break;
							case "Q37A_OTHER":
								blnStatus = setValue(WebControl.UNIQUE_CHECKBOX, IdentifyBy.NAME, "form_pageInsuredInfoA4A5:axaSourceOfFunds:personalPurposeOfInsurance_DD", getAppCheckboxValues(strHashKey, strHashValue), "37a. Others", currentScreen);
								break;
							case "Q37B":
								blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_pageInsuredInfoA4A5:axaSourceOfFunds:srcOfFundQuestion37b_DD", validateInput(strHashValue), "Question 37b:", currentScreen);
							     break;
							
							case "Q37C":
								blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_pageInsuredInfoA4A5:axaSourceOfFunds:srcOfFundQuestion37c_DD", validateInput(strHashValue), "Question 37c:", currentScreen);
								
								break;
							case "Q38A_TOTAL_AMOUNT_APPLICANT":
								blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.ID, "form_pageInsuredInfoA4A5:axaProposedInsuredUnderAge15:totalAmountApplicant_EF", validateInput(strHashValue), "38a. Total amount of insurance in force on the life of the Applicant:", currentScreen);
								
								break;
							case "Q38A_TOTAL_AMOUNT_PARENT":
								blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_pageInsuredInfoA4A5:axaProposedInsuredUnderAge15:totalAmountGuardian_EF", validateInput(strHashValue), "Total amount of insurance in force on the life of Parent(s)/Guardian, if other than Applicant:", currentScreen);
								break;
							case"Q38B_RELATIONSHIP":
								blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_pageInsuredInfoA4A5:axaProposedInsuredUnderAge15:relationshipToInsured_DD", validateInput(strHashValue), "38b. What is the relationship between the Applicant and the Proposed insured if other than Parent/Legal Guardian?", currentScreen);
							
								break;
							case "Q38C_OTHER_CHILDREN_INSURED":
								blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_pageInsuredInfoA4A5:axaProposedInsuredUnderAge15:anyOtherChildren_DD", validateInput(strHashValue), "38c. Any other children in family insured for a lesser Amount?", currentScreen);
			
								break;
							case "Q38D_DIFFERENT_FROM_OWNER":
								blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_pageInsuredInfoA4A5:axaProposedInsuredUnderAge15:sameApplicantOwner_DD", validateInput(strHashValue), "38d. Is Applicant different from Owner?", currentScreen);
								waitForPageLoad(MAX_TIMEOUT);
								break;
							case "Q38D_PREFIX":
								blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_pageInsuredInfoA4A5:axaProposedInsuredUnderAge15:namePatternFieldPrefix_DD", validateInput(strHashValue), "PREFIX", currentScreen);
								break;
								
							case "Q38D_FIRST_NAME":
								blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_pageInsuredInfoA4A5:axaProposedInsuredUnderAge15:namePatternFieldFirst_EF", validateInput(strHashValue), "First Name", currentScreen);
								break;
							case"Q38D_MIDDLE_NAME":
								blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_pageInsuredInfoA4A5:axaProposedInsuredUnderAge15:namePatternFieldMiddle_EF", validateInput(strHashValue), "Middle Name", currentScreen);
								break;
							case "Q38D_LAST_NAME":
								blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_pageInsuredInfoA4A5:axaProposedInsuredUnderAge15:namePatternFieldLast_EF", validateInput(strHashValue), "Last Name", currentScreen);
								break;
							case "Q38D_SUFFIX":
								blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_pageInsuredInfoA4A5:axaProposedInsuredUnderAge15:namePatternFieldSuffix_DD", validateInput(strHashValue), "SUFFIX", currentScreen);
								break;
							case "Q38D_SS_NO":
								
								blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_pageInsuredInfoA4A5:axaProposedInsuredUnderAge15:ssn_EF", validateInput(strHashValue), "SS#", currentScreen);
								break;
							case"Q38D_RELATIONSHIP_INSURED":
								blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_pageInsuredInfoA4A5:axaProposedInsuredUnderAge15:relationship_DD", validateInput(strHashValue), "Relationship to Proposed Insured:", currentScreen);
							
								break;
							case"Q38D_POBOX":
								blnStatus = setValue(WebControl.CHECKBOX, IdentifyBy.NAME, "form_pageInsuredInfoA4A5:axaProposedInsuredUnderAge15:poBox_CB", validateInput(strHashValue), "P.O. Box Address", currentScreen);
							
								break;
							case"Q38D_POBOX	Q38D_ADDRESS_TYPE":
								blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_pageInsuredInfoA4A5:axaProposedInsuredUnderAge15:addressType_DD", validateInput(strHashValue), "Address Type:", currentScreen);
							
								break;
							case"Q38D_STREET":

	                            blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_pageInsuredInfoA4A5:axaProposedInsuredUnderAge15:noAndStreet_EF", validateInput(strHashValue), "No. & Street:", currentScreen);
							
								break;
							case"Q38D_SUITE":

	                          blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_pageInsuredInfoA4A5:axaProposedInsuredUnderAge15:buildAptSuite_EF", validateInput(strHashValue), "Bldg/Apt/Suite:", currentScreen);
							
								break;
							case"Q38D_CITY":

	                                blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_pageInsuredInfoA4A5:axaProposedInsuredUnderAge15:city_EF", validateInput(strHashValue), "City", currentScreen);
								
								break;
							case"Q38D_STATE":

	                               blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_pageInsuredInfoA4A5:axaProposedInsuredUnderAge15:state_DD", validateInput(strHashValue), "State", currentScreen);
							
								break;
							case "Q38D_ZIP":
	                             blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_pageInsuredInfoA4A5:axaProposedInsuredUnderAge15:zip_EF", validateInput(strHashValue), "ZIPCODE", currentScreen);
								
								break;
							case"Q38D_ADD":
								blnStatus = setValue(WebControl.BUTTON, IdentifyBy.NAME, "form_pageInsuredInfoA4A5:axaProposedInsuredUnderAge15:applicantAddressTableAdd_CButton", validateInput(strHashValue), " 38D ADD", currentScreen);
			
								break;
							case"Q39":
								blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_pageInsuredInfoA4A5:axaSignaturePage1215:bankruptcyDetailsQuestionsTablePane:0:Q39Ans_DD", validateInput(strHashValue), "Question :39", currentScreen);
								
								break;
							case"Q40":
								blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_pageInsuredInfoA4A5:axaSignaturePage1215:bankruptcyDetailsQuestionsTablePane:1:Q39Ans_DD", validateInput(strHashValue), "Question :40", currentScreen);
								
								break;
							case"Q41":
								blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_pageInsuredInfoA4A5:axaSignaturePage1215:bankruptcyDetailsQuestionsTablePane:2:Q39Ans_DD", validateInput(strHashValue), "Question :41", currentScreen);
								
								break;
							case"Q42":
								blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_pageInsuredInfoA4A5:axaSignaturePage1215:bankruptcyDetailsQuestionsTablePane:3:Q39Ans_DD", validateInput(strHashValue), "Question :42", currentScreen);
								
								break;
							case"Q43":
								blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_pageInsuredInfoA4A5:axaSignaturePage1215:bankruptcyDetailsQuestionsTablePane:4:Q39Ans_DD", validateInput(strHashValue), "Question :43", currentScreen);
								
								break;
							case"Q44":
								blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_pageInsuredInfoA4A5:axaSignaturePage1215:bankruptcyDetailsQuestionsTablePane:5:Q39Ans_DD", validateInput(strHashValue), "Question :44", currentScreen);
								
								break;
								
								
							case"Q45":
								blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_pageInsuredInfoA4A5:axaSignaturePage1215:bankruptcyDetailsQuestionsTablePane:6:Q39Ans_DD", validateInput(strHashValue), "Question :45", currentScreen);
								break;
								
								
							case"MISC_ANYTHING_ELSE_IN_REMARKS":
								blnStatus = setValue(WebControl.CHECKBOX, IdentifyBy.NAME, "form_pageInsuredInfoA4A5:axaMiscellanous:otherDetail_RB", validateInput(strHashValue), "Is there anything else in the Remarks section that was not data entered elsewhere that affects underwriting?", currentScreen);
								
								
								break;
							case"MISC_ADDITIONAL_SECONDARY_ADDRESSEE ":	
								blnStatus = setValue(WebControl.CHECKBOX, IdentifyBy.NAME, "form_pageInsuredInfoA4A5:axaMiscellanous:additionalcoverage", validateInput(strHashValue), "Additional Coverage Plan", currentScreen);
								
								
								break;
							case"MISC_RETURN_RIDER_MAX_AMOUNT" :
								blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_pageInsuredInfoA4A5:axaMiscellanous:return_IT", validateInput(strHashValue), "Return of Premium Rider Maximum Amount:", currentScreen);
						
								break;
							case"MISC_1035_EXCHANGE" :
								blnStatus = setValue(WebControl.CHECKBOX, IdentifyBy.NAME, "form_pageInsuredInfoA4A5:axaMiscellanous:exch1035carryoverCB", validateInput(strHashValue), "1035 Exchange Loan Carryover", currentScreen);
								
								
								break;
							case"MISC_LBR_REQUESTED" :
								blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_pageInsuredInfoA4A5:axaMiscellanous:LBRRequested", validateInput(strHashValue), "LBR Requested ?", currentScreen);
								break;
					
							case"MISC_TEMPORARY_EXPRESS_COMMISSIONS":
								blnStatus = setValue(WebControl.BUTTON, IdentifyBy.NAME, "form_pageInsuredInfoA4A5:axaMiscellanous:tempExpComm_CButton", validateInput(strHashValue), " Temporary Express Commissions_I pop_up", currentScreen);
								break;
							case "default1":
								ReportGenerator.generateTestStep(false, currentScreen, "Field Navigation", strHashKey + " field not available in the current method.", false);
								break;
							
						} //end of switch
						if(!blnStatus) break;
					} //end of while
				}
				else {
					ReportGenerator.generateTestStep(false, currentScreen, "Switch to Frame", "Failed to switch frames " + strFrames.replaceAll(GlobalData.STRING_SEPARATOR, " > "), false);
					blnStatus = false;
				}
				objEnum = null;
					
			} catch(Exception objExp) {
				ReportGenerator.generateTestStep(false, currentScreen, "Exception occured", "Exception is - " + objExp.getMessage(), false);
				blnStatus = false;
			}
			return blnStatus;
		}
		
		
		//Function For TemporaryExpressCommissions flow
		private static boolean TemporaryExpressCommissions(OrderedHashtable objTestData) {
			boolean blnStatus = false;
			String strHashKey = "", strHashValue = "";
			try {
				String strFrames = "FWin0" + GlobalData.STRING_SEPARATOR + "Content0";
				Enumeration objEnum = objTestData.enumerateKeys();
				if(switchToFrame(strFrames, false) && waitForPageLoad(MAX_TIMEOUT)) {
					
					while(objEnum.hasMoreElements()) {
						//blnStatus = false;
						strHashKey = objEnum.nextElement().toString();
						strHashValue = objTestData.get(strHashKey).toString();

						switch(strHashKey) {
					
						case"TEMORARY_EXPRESS_COMISSION":
							blnStatus = setValue(WebControl.CHECKBOX, IdentifyBy.NAME, "form_UlTempExpCommission:tempExpCommission", validateInput(strHashValue), "Temporary Express Commission", currentScreen);
							break;
						case"CHECK_IN_TRANSIT":
							blnStatus = setValue(WebControl.CHECKBOX, IdentifyBy.NAME, "form_UlTempExpCommission:checkInTransit_CB", validateInput(strHashValue), "Check in Transit", currentScreen);
							break;
						case"PREMIUM_AMOUNT":
							blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_UlTempExpCommission:TempExpCommPrem_IT", validateInput(strHashValue), "Temporary Express Commission Premium Amount", currentScreen);
							break;
						case"ADD":
							blnStatus = setValue(WebControl.BUTTON, IdentifyBy.NAME, "form_UlTempExpCommission:drAdd", validateInput(strHashValue), "ADD", currentScreen);
							break;
						case "default1":
							ReportGenerator.generateTestStep(false, currentScreen, "Field Navigation", strHashKey + " field not available in the current method.", false);
							break;
						} //end of switch
						if(!blnStatus) break;
					} //end of while
				}
				else {
					ReportGenerator.generateTestStep(false, currentScreen, "Switch to Frame", "Failed to switch frames " + strFrames.replaceAll(GlobalData.STRING_SEPARATOR, " > "), false);
					blnStatus = false;
				}
				objEnum = null;
					
			} catch(Exception objExp) {
				ReportGenerator.generateTestStep(false, currentScreen, "Exception occured", "Exception is - " + objExp.getMessage(), false);
				blnStatus = false;
			}
			return blnStatus;
		}
		
		//Function For SingnaturesTIA flow
			private static boolean SingnaturesTIA(OrderedHashtable objTestData) {
				boolean blnStatus = false;
				String strHashKey = "", strHashValue = "";
				try {
					String strFrames = "mainContentFrame" + GlobalData.STRING_SEPARATOR + "contentRightFrame" + GlobalData.STRING_SEPARATOR + "file"+ GlobalData.STRING_SEPARATOR + "file";;
					Enumeration objEnum = objTestData.enumerateKeys();
					if(switchToFrame(strFrames, false) && waitForPageLoad(MAX_TIMEOUT)) {
						
						while(objEnum.hasMoreElements()) {
							//blnStatus = false;
							strHashKey = objEnum.nextElement().toString();
							strHashValue = objTestData.get(strHashKey).toString();

							switch(strHashKey) {
							case "SEC_A_INSURED_INFO":
								blnStatus = setValue(WebControl.CHECKBOX, IdentifyBy.NAME, "form_newAppSignaturesTIA:aeSignaturesTIA_1:ack_CB", validateInput(strHashValue), "Section A -Proposed Insured Information", currentScreen);
								break;
							case"SEC_B_PRODUCT_INFO":
								blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_newAppSignaturesTIA:aeSignaturesTIA_1:ackB_DD", validateInput(strHashValue), "Section B -Product Information", currentScreen);
								break;	
							case"SEC_C_LONG_TERM_QUESTIONNAIRE":	
								blnStatus = setValue(WebControl.UNIQUE_CHECKBOX, IdentifyBy.NAME, "form_newAppSignaturesTIA:aeSignaturesTIA_1:personalPurposeOfInsurance_DD", getAppCheckboxValues(strHashKey, strHashValue), "Long Term Care Services Rider Questionnaire", currentScreen);
							 break;
							case"SEC_C_OWNER_QUESTIONNAIRE":
								blnStatus = setValue(WebControl.UNIQUE_CHECKBOX, IdentifyBy.NAME, "form_newAppSignaturesTIA:aeSignaturesTIA_1:personalPurposeOfInsurance_DD", getAppCheckboxValues(strHashKey, strHashValue), "Owner Questionnaire", currentScreen);
								break;
							case"SEC_TERM_POLICY":
								blnStatus = setValue(WebControl.UNIQUE_CHECKBOX, IdentifyBy.NAME, "form_newAppSignaturesTIA:aeSignaturesTIA_1:personalPurposeOfInsurance_DD", getAppCheckboxValues(strHashKey, strHashValue), "Term Policy/Rider Conv or OPAI Questionnaire", currentScreen);
								break;
							case"SEC_C_FOREIGN_RESIDENCE":
								blnStatus = setValue(WebControl.UNIQUE_CHECKBOX, IdentifyBy.NAME, "form_newAppSignaturesTIA:aeSignaturesTIA_1:personalPurposeOfInsurance_DD", getAppCheckboxValues(strHashKey, strHashValue), "Foreign Residence and Travel Info Questionnaire", currentScreen);
								break;
							case"SEC_C_MEDICAL_INFO":
								blnStatus = setValue(WebControl.UNIQUE_CHECKBOX, IdentifyBy.NAME, "form_newAppSignaturesTIA:aeSignaturesTIA_1:personalPurposeOfInsurance_DD", getAppCheckboxValues(strHashKey, strHashValue), "Medical Information Questionnaire", currentScreen);
								break;
							case"SEC_C_FINANCIAL_INFO":
								blnStatus = setValue(WebControl.UNIQUE_CHECKBOX, IdentifyBy.NAME, "form_newAppSignaturesTIA:aeSignaturesTIA_1:personalPurposeOfInsurance_DD", getAppCheckboxValues(strHashKey, strHashValue), " Financial Information Questionnaire", currentScreen);
								break;
							case"SEC_C_CHILDREN_TERM":
								blnStatus = setValue(WebControl.UNIQUE_CHECKBOX, IdentifyBy.NAME, "form_newAppSignaturesTIA:aeSignaturesTIA_1:personalPurposeOfInsurance_DD", getAppCheckboxValues(strHashKey, strHashValue), " Childrens Term Insurance Rider Questionnaire", currentScreen);
								break;
							case"SEC_C_SUBSTANCE_USAGE":
								blnStatus = setValue(WebControl.UNIQUE_CHECKBOX, IdentifyBy.NAME, "form_newAppSignaturesTIA:aeSignaturesTIA_1:personalPurposeOfInsurance_DD", getAppCheckboxValues(strHashKey, strHashValue), " Substance Usage Questionnaire", currentScreen);
								break;
							case"SEC_C_AVIATION":
								blnStatus = setValue(WebControl.UNIQUE_CHECKBOX, IdentifyBy.NAME, "form_newAppSignaturesTIA:aeSignaturesTIA_1:personalPurposeOfInsurance_DD", getAppCheckboxValues(strHashKey, strHashValue), "Aviation Questionnaire", currentScreen);
								break;
							case"SEC_C_AVOCATION":
								blnStatus = setValue(WebControl.UNIQUE_CHECKBOX, IdentifyBy.NAME, "form_newAppSignaturesTIA:aeSignaturesTIA_1:personalPurposeOfInsurance_DD", getAppCheckboxValues(strHashKey, strHashValue), " Avocation Questionnaire", currentScreen);
								break;
							case"SIGNATURE_INSURED1":
								blnStatus = setValue(WebControl.CHECKBOX, IdentifyBy.NAME, "form_newAppSignaturesTIA:aeSignaturesTIA_2:signatureofProposedInsured1_CB", validateInput(strHashValue), "SIGNATURE_INSURED_1", currentScreen);
								break;
							case"POWER_OF_ATTORNEY1":
								blnStatus = setValue(WebControl.CHECKBOX, IdentifyBy.NAME, "form_newAppSignaturesTIA:aeSignaturesTIA_2:proposedInsured1PowerofAttorney_CB", validateInput(strHashValue), "POWER_OF_ATTORNEY_1", currentScreen);
								break;
							case"SIGNATURE_TYPE":
								blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_newAppSignaturesTIA:aeSignaturesTIA_2:proposedInsured1SignType_DD", validateInput(strHashValue), "SIGNATURE_TYPE", currentScreen);
								break;
							case"SIGNATURE_INSURED2":
								blnStatus = setValue(WebControl.CHECKBOX, IdentifyBy.NAME, "form_newAppSignaturesTIA:aeSignaturesTIA_2:signatureofProposedInsured2_CB3", validateInput(strHashValue), "SIGNATURE_INSURED_2", currentScreen);
								break;
							case"POWER_OF_ATTORNEY2":
								blnStatus = setValue(WebControl.CHECKBOX, IdentifyBy.NAME, "form_newAppSignaturesTIA:aeSignaturesTIA_2:proposedInsured2PowerofAttorney_CB", validateInput(strHashValue), "POWER_OF_ATTORNEY_2", currentScreen);
								break;	
							case"SIGNATURE_OF_OWNER":
								blnStatus = setValue(WebControl.CHECKBOX, IdentifyBy.NAME, "form_newAppSignaturesTIA:aeSignaturesTIA_2:signatureofOwner_CB", validateInput(strHashValue), "SIGNATURE_OF_OWNER", currentScreen);
								break;
							case"SIGNED_AT_CITY":
								blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_newAppSignaturesTIA:aeSignaturesTIA_2:signedAtCity_EF", validateInput(strHashValue), "SIGNED AT CITY", currentScreen);
								break;
							case"SIGNED_AT_STATE":
								blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_newAppSignaturesTIA:aeSignaturesTIA_2:signedAtState_DD", validateInput(strHashValue), "SIGNED AT STATE", currentScreen);
								break;
							case"SIGNED_DATE":
								blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_newAppSignaturesTIA:aeSignaturesTIA_2:signedAtDate_EF", validateInput(strHashValue), "SIGNED DATE", currentScreen);
								break;
							case"INSURANCE_REPLACED":
								blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_newAppSignaturesTIA:aeSignaturesTIA_2:financialProfessionalSectionQuestionsTablePane:0:Q61bAns_DD", validateInput(strHashValue), "Will any existing insurance be replaced or changed or affected (or has it been) assuming the insurance applied for will be issued?", currentScreen);
								break;
								
							case"IF_YES":
								blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_newAppSignaturesTIA:aeSignaturesTIA_2:financialProfessionalSectionQuestionsTablePane:1:Q61bAns_DD", validateInput(strHashValue), "If Yes, is the information provided in question 21 on Part 1 of the Application for Proposed Insured 1, and question 21 of the Survivorship Product Questionnaire for Proposed Insured 2, if applicable, complete and accurate?", currentScreen);
							break;
								
								
							case"SIGNATURE_REQUIRED":
								blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_newAppSignaturesTIA:aeSignaturesTIA_2:financialProfessionalSectionQuestionsTablePane:2:Q61bAns_DD", validateInput(strHashValue), "I have witnessed the signature required on the fully completed Part 1.", currentScreen);
								break;
								
							case"SIGNATURE_OF_LICENSED_BROKER":
								blnStatus = setValue(WebControl.CHECKBOX, IdentifyBy.NAME, "form_newAppSignaturesTIA:aeSignaturesTIA_2:finProfOrBrokerSign_CB", validateInput(strHashValue), "Signature of Licensed Financial Professional/Insurance Broker", currentScreen);
								break;
								
							case"DATED_ON":
								blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_newAppSignaturesTIA:aeSignaturesTIA_2:dateOn_EF", validateInput(strHashValue), "Dated On:", currentScreen);
							     break;
								
							case"LIMITED_AMOUNT_PAID":
								blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_newAppSignaturesTIA:aeSignaturesTIA_3:amountPaid_EF", validateInput(strHashValue), "Amount Paid:", currentScreen);
								break;
								
							case"LIMITED_SIGNATURE_INSURED1":
								blnStatus = setValue(WebControl.CHECKBOX, IdentifyBy.NAME, "form_newAppSignaturesTIA:aeSignaturesTIA_3:lTempProposedInsured1_CB", validateInput(strHashValue), "Signature of Proposed Insured 1", currentScreen);
								break;
								
							case"LIMITED_SIGNATURE_INSURED2":
								blnStatus = setValue(WebControl.CHECKBOX, IdentifyBy.NAME, "form_newAppSignaturesTIA:aeSignaturesTIA_3:signatureofProposedInsured2_CB3", validateInput(strHashValue), "Signature of Proposed Insured 2", currentScreen);
								
								break;
							case"LIMITED_SIGNATURE_OWNER":
								blnStatus = setValue(WebControl.CHECKBOX, IdentifyBy.NAME, "form_newAppSignaturesTIA:aeSignaturesTIA_3:lTempOwnerSign_CB", validateInput(strHashValue), "Signature of Owner or Applicant", currentScreen);
								
								break;
								
							case"LIMITED_SIGNED_AT_CITY":
								blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_newAppSignaturesTIA:aeSignaturesTIA_3:lTempownerCity_EF", validateInput(strHashValue), "Signed At: City", currentScreen);
								
								break;
							case"LIMITED_SIGNED_AT_STATE":
								blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_newAppSignaturesTIA:aeSignaturesTIA_3:lTempownerState_DD", validateInput(strHashValue), "State", currentScreen);
								
								break;
							case"LIMITED_DATE":
								blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_newAppSignaturesTIA:aeSignaturesTIA_3:lTempownerDate_EF", validateInput(strHashValue), "Date", currentScreen);
								break;
							case"LIMITED_SIGNATURE_OF_BROKER":
								blnStatus = setValue(WebControl.CHECKBOX, IdentifyBy.NAME, "form_newAppSignaturesTIA:aeSignaturesTIA_3:lTempFinProfeSign_CB", validateInput(strHashValue), "Signature of Licensed Financial Professional/Insurance Broker", currentScreen);
								break;
								
							case"LIMITED_COPY_RECEIVED":
								blnStatus = setValue(WebControl.CHECKBOX, IdentifyBy.NAME, "form_newAppSignaturesTIA:aeSignaturesTIA_3:copyRec_CB", validateInput(strHashValue), "Copy Received?", currentScreen);
								
								break;
							case "default1":
								ReportGenerator.generateTestStep(false, currentScreen, "Field Navigation", strHashKey + " field not available in the current method.", false);
								break;
						
							} //end of switch
							if(!blnStatus) break;
						} //end of while
					}
					else {
						ReportGenerator.generateTestStep(false, currentScreen, "Switch to Frame", "Failed to switch frames " + strFrames.replaceAll(GlobalData.STRING_SEPARATOR, " > "), false);
						blnStatus = false;
					}
					objEnum = null;
						
				} catch(Exception objExp) {
					ReportGenerator.generateTestStep(false, currentScreen, "Exception occured", "Exception is - " + objExp.getMessage(), false);
					blnStatus = false;
				}
				return blnStatus;
			}
			
			
			
			//Function For FPCertNonVar flow
				private static boolean FPCertNonVar(OrderedHashtable objTestData) {
					boolean blnStatus = false;
					String strHashKey = "", strHashValue = "";
					try {
						String strFrames = "mainContentFrame" + GlobalData.STRING_SEPARATOR + "contentRightFrame" + GlobalData.STRING_SEPARATOR + "file"+ GlobalData.STRING_SEPARATOR + "file";;
						Enumeration objEnum = objTestData.enumerateKeys();
						if(switchToFrame(strFrames, false) && waitForPageLoad(MAX_TIMEOUT)) {
							
							while(objEnum.hasMoreElements()) {
								//blnStatus = false;
								strHashKey = objEnum.nextElement().toString();
								strHashValue = objTestData.get(strHashKey).toString();

								switch(strHashKey) {
								case"RATE_CLASS_INSURED1":
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_newAppFPCertNonVar:ax2ProducerCertificationInfo:rateClassProposedInsured1_DD", validateInput(strHashValue), "Proposed Insured 1", currentScreen);
									break;
								case"RATE_CLASS_INSURED2":
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_newAppFPCertNonVar:ax2ProducerCertificationInfo:rateClassProposedInsured2_DD", validateInput(strHashValue), "Proposed Insured 2", currentScreen);
									break;
								case"Q2":
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_newAppFPCertNonVar:ax2ProducerCertificationInfo:certSection1TablePane:0:Q61bAns_DD", validateInput(strHashValue), "Question 2", currentScreen);
									break;
									
								case"Q3A":
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_newAppFPCertNonVar:ax2ProducerCertificationInfo:certSection1TablePane:1:Q61bAns_DD", validateInput(strHashValue), "Question :3a", currentScreen);
									break;
								case"Q2_P2":
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_newAppFPCertNonVar:ax2ProducerCertificationInfo:jiCertSection1TablePane:0:fpCertJI_DD", validateInput(strHashValue), "Proposed Insured 2 :Question-2", currentScreen);	
									break;
	                            case"Q3A_P2":
	                            	blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_newAppFPCertNonVar:ax2ProducerCertificationInfo:jiCertSection1TablePane:1:fpCertJI_DD", validateInput(strHashValue), "Proposed Insured 2 :Question-3a", currentScreen);
									break;                   
									
									
									
								case"Q3B":
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_newAppFPCertNonVar:ax2ProducerCertificationInfo:question3bd1_DD", validateInput(strHashValue), "3b. Does the Owner speak and understand English?", currentScreen);
									break;
								case"INSURED_Q4A":											   										                                           
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_newAppFPCertNonVar:ax2ProducerCertificationInfo:certSection2TablePane:0:Q61bAns_DD2", validateInput(strHashValue), "Question :4a", currentScreen);
									break;
								case"INSURED_Q4B":
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_newAppFPCertNonVar:ax2ProducerCertificationInfo:certSection2TablePane:1:Q61bAns_DD2", validateInput(strHashValue), "Question : 4b", currentScreen);
									break;
								case"INSURED_Q4C":
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_newAppFPCertNonVar:ax2ProducerCertificationInfo:certSection2TablePane:2:Q61bAns_DD2", validateInput(strHashValue), "Question : 4c", currentScreen);
								break;
							
								case"OWNER_Q4A":											 
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_newAppFPCertNonVar:ax2ProducerCertificationInfo:Q4aAns_DD", validateInput(strHashValue), "Owner Question: 4a", currentScreen);
									break;
								case"OWNER_Q4B":
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_newAppFPCertNonVar:ax2ProducerCertificationInfo:Q4bAns_DD", validateInput(strHashValue), "Owner Question: 4b", currentScreen);
									break;
								case"OWNER_Q4C":
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_newAppFPCertNonVar:ax2ProducerCertificationInfo:Q4cAns_DD", validateInput(strHashValue), "Owner Question: 4c", currentScreen);
									break;
								
								/*case"INSURED_Q4A_P2":										    
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_newAppFPCertNonVar:ax2ProducerCertificationInfo:certSection2JITablePane:0:Q61bAns_JI_DD2", validateInput(strHashValue), "Proposed Insured 2 :Question 4a", currentScreen);
									break;*/
								case"INSURED_Q4A_P2":										    
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_newAppFPCertNonVar:ax2ProducerCertificationInfo:certSection2JITablePaneJI2:0:Q61bAns_JI_DD2JI2", validateInput(strHashValue), "Proposed Insured 2 :Question 4a", currentScreen);
									break;
								case"INSURED_Q4B_P2":
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_newAppFPCertNonVar:ax2ProducerCertificationInfo:certSection2JITablePaneJI2:1:Q61bAns_JI_DD2JI2", validateInput(strHashValue), "Proposed Insured 2 :Question 4b", currentScreen);
									
									break;
								case"INSURED_Q4C_P2":
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_newAppFPCertNonVar:ax2ProducerCertificationInfo:certSection2JITablePane:2:Q61bAns_JI_DD2", validateInput(strHashValue), "Proposed Insured 2 :Question 4c", currentScreen);
									
									break;
								
								
								
								case"Q5_INSURED1":	
									blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_newAppFPCertNonVar:ax2ProducerCertificationInfo:question5ProposedInsured1_IT", validateInput(strHashValue), "Proposed Insured 5_1", currentScreen);
									break;
								case"Q5_INSURED2":
									blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_newAppFPCertNonVar:ax2ProducerCertificationInfo:question5ProposedInsured2_IT", validateInput(strHashValue), "Proposed Insured 5_2", currentScreen);
									break;
								case"Q6_INSURED1":
		                        	blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_newAppFPCertNonVar:ax2ProducerCertificationInfo:question6ProposedInsured1_DD", validateInput(strHashValue), "Proposed Insured 6_1", currentScreen);
		                    		break;
								case"Q6_INSURED2":
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_newAppFPCertNonVar:ax2ProducerCertificationInfo:question6ProposedInsured2_DD", validateInput(strHashValue), "Proposed Insured 6_2", currentScreen);
									break;
								case"Q7_LAST_SEEN":
									blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_newAppFPCertNonVar:ax2ProducerCertificationInfo:question7Text_EF", validateInput(strHashValue), "7. If Proposed Insured is a child (issue age 0-14), when did you last see child?", currentScreen);
									break;
								case"PERSON_R_ENTITY":
									blnStatus = setValue(WebControl.RADIOBOX, IdentifyBy.NAME, "form_newAppFPCertNonVar:ax2ProducerInfo:personEntityType_RB", getAppRadioValues(strHashKey, strHashValue), "Person / Entity", currentScreen);
									break;
								case"ENTITY_TYPE":
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_newAppFPCertNonVar:ax2ProducerInfo:personEntityType_DD", validateInput(strHashValue), "ENTITY_TYPE", currentScreen);
									break;
								case"PREFIX":
									
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_newAppFPCertNonVar:ax2ProducerInfo:prefix_DD", validateInput(strHashValue), "Prefix:", currentScreen);
									break;
								case"FIRST_NAME":
									blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_newAppFPCertNonVar:ax2ProducerInfo:first_EF", validateInput(strHashValue), "First Name:", currentScreen);
									break;
								case"MIDDLE_NAME":
									blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_newAppFPCertNonVar:ax2ProducerInfo:middle_EF", validateInput(strHashValue), "Middle Name:", currentScreen);
									break;
								case"LAST_NAME":
									blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_newAppFPCertNonVar:ax2ProducerInfo:LastName_EF", validateInput(strHashValue), "Last Name:", currentScreen);
									break;
								case"SUFFIX":
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_newAppFPCertNonVar:ax2ProducerInfo:suffix_DD", validateInput(strHashValue), "Suffix_DD", currentScreen);
									break;
								case"ENTITY":
									blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_newAppFPCertNonVar:ax2ProducerInfo:Entity_EF", validateInput(strHashValue), "ENTITY", currentScreen);
									break;
								case"FINANCIAL_PROFESSIONAL_NUMBER":
									blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_newAppFPCertNonVar:ax2ProducerInfo:finaProfessionalNumberPercentage_EF", validateInput(strHashValue), "Financial Professional Number:", currentScreen);
									break;
								case"DISTRIBUTION_CHANNEL":
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_newAppFPCertNonVar:ax2ProducerInfo:disChannel_DD", validateInput(strHashValue), "Distribution Channel:", currentScreen);
								break;
								case"SUBMITTING_FIRM_ID":
									blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_newAppFPCertNonVar:ax2ProducerInfo:bgaNumber_EF", validateInput(strHashValue), "BGA/Sub-Firm Number/Submitting Firm ID:", currentScreen);
									break;
								case"SUB_FIRM":
									blnStatus = setValue(WebControl.CHECKBOX, IdentifyBy.NAME, "form_newAppFPCertNonVar:ax2ProducerInfo:subFirmIndicator_CB", validateInput(strHashValue), "Sub-Firm", currentScreen);
									break;
								case"SEARCH":
									blnStatus = setValue(WebControl.BUTTON, IdentifyBy.NAME, "form_newAppFPCertNonVar:ax2ProducerInfo:bgaNumber_CButton", validateInput(strHashValue), "Search", currentScreen);
									break;
								case"CLEAR":
									blnStatus = setValue(WebControl.BUTTON, IdentifyBy.NAME, "form_newAppFPCertNonVar:ax2ProducerInfo:clearFields_CButton", validateInput(strHashValue), "Clear", currentScreen);
									break;
								case "SELECT_PRODUCER":
									blnStatus = selectWebtableRow(IdentifyBy.ID, "form_newAppFPCertNonVar:ax2ProducerInfo:financialProfessionalDetails_DataTable", 1, strHashValue, "Producer", currentScreen);
									break;
								
								case"COMMISSION_PERCENT":
									blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_newAppFPCertNonVar:ax2ProducerInfo:commissionPer_EF", validateInput(strHashValue), "Commission %:", currentScreen);
									break;
								case"NIGO":
									blnStatus = setValue(WebControl.CHECKBOX, IdentifyBy.NAME, "form_newAppFPCertNonVar:ax2ProducerInfo:nigo_CB", validateInput(strHashValue), "NIGO (Case Submitted Not In Good Order)", currentScreen);
									break;
								case"CATACT_BY":
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_newAppFPCertNonVar:ax2ProducerInfo:finaProfeContactBy_DD", validateInput(strHashValue), "contact by:", currentScreen);
									break;
								case"NUMBER":
									blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_newAppFPCertNonVar:ax2ProducerInfo:number_EF", validateInput(strHashValue), "Number", currentScreen);
									break;
								case"PRIMARY_WRITING_AGENT":
									blnStatus = setValue(WebControl.CHECKBOX, IdentifyBy.NAME, "form_newAppFPCertNonVar:ax2ProducerInfo:primaryWritingAgent_CB", validateInput(strHashValue), "Primary Writing Agent", currentScreen);
									
									break;
								case"EMAIL_ADDRESS":
			
									blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_newAppFPCertNonVar:ax2ProducerInfo:emailAdd_EF", validateInput(strHashValue), "E-mail Address:", currentScreen);
									break;
								case"ANNUALIZE_COMMISSIONS":
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_newAppFPCertNonVar:ax2ProducerInfo:annualizeCommission_DD", validateInput(strHashValue), "Annualize Commissions:", currentScreen);
									break;
								case"PAY_EXPRESS_COMMISSIONS":
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_newAppFPCertNonVar:ax2ProducerInfo:expressionCommission_DD", validateInput(strHashValue), "Pay Express Commissions(Override Agent Eligibility)", currentScreen);
								break;
								case"COMMISSION_SCHEDULE":
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_newAppFPCertNonVar:ax2ProducerInfo:commissionSchedule_DD", validateInput(strHashValue), "8b. Commission Schedule", currentScreen);
								break;
								case "UPDATE_PRODUCER":
									blnStatus = setValue(WebControl.BUTTON, IdentifyBy.NAME, "form_newAppFPCertNonVar:ax2ProducerInfo:buttonUpdate_CButton", validateInput(strHashValue), "Update", currentScreen);
									break;
								case"SIGNATURE_INSURANCE_BROKER":
									blnStatus = setValue(WebControl.CHECKBOX, IdentifyBy.NAME, "form_newAppFPCertNonVar:ax2ProducerInfo:financialProfessionalSignPresent_CB", validateInput(strHashValue), "Signature of Licensed Financial Professional/Insurance Broker", currentScreen);
								break;	
								case"CERTIFICATION_DATE":
									blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_newAppFPCertNonVar:ax2ProducerInfo:financialProfessionalDate_EF", validateInput(strHashValue), "Date", currentScreen);
									break;
								case"Q9O_CASH":
									blnStatus = setValue(WebControl.UNIQUE_CHECKBOX, IdentifyBy.NAME, "form_newAppFPCertNonVar:ax2ProducerInfo:sourceOfFundsPInsOptions_DD_FPCERTNONVAR", getAppCheckboxValues(strHashKey, strHashValue), "Cash: Death Claim, Gift, Inheritance, checking, saving, money market, payroll deduction.", currentScreen);
								
									break;
								case"Q9O_BORROWING":
									blnStatus = setValue(WebControl.UNIQUE_CHECKBOX, IdentifyBy.NAME, "form_newAppFPCertNonVar:ax2ProducerInfo:sourceOfFundsPInsOptions_DD_FPCERTNONVAR", getAppCheckboxValues(strHashKey, strHashValue), "Borrowing: Mortgage, Personal Loan, Credit.", currentScreen);
									
									break;
								
									case"Q9O_ANNUITY":
										blnStatus = setValue(WebControl.UNIQUE_CHECKBOX, IdentifyBy.NAME, "form_newAppFPCertNonVar:ax2ProducerInfo:sourceOfFundsPInsOptions_DD_FPCERTNONVAR", getAppCheckboxValues(strHashKey, strHashValue), "Annuity or Life insurance: (Replacement, Surrender/Exchange, Policy Loan, Dividend, Withdrawal)", currentScreen);
								
										break;
							
									case"Q9O_SALE_401K":
										blnStatus = setValue(WebControl.UNIQUE_CHECKBOX, IdentifyBy.NAME, "form_newAppFPCertNonVar:ax2ProducerInfo:sourceOfFundsPInsOptions_DD_FPCERTNONVAR", getAppCheckboxValues(strHashKey, strHashValue), "Sale of 401(k), Pension Plans, No-load/Load-waived Mutual Fund Shares, Stocks, Bonds, CDs", currentScreen);
									
										break;
									case"Q9O_SALE_NONLOADED_MUTUAL_FUND":
										blnStatus = setValue(WebControl.UNIQUE_CHECKBOX, IdentifyBy.NAME, "form_newAppFPCertNonVar:ax2ProducerInfo:sourceOfFundsPInsOptions_DD_FPCERTNONVAR", getAppCheckboxValues(strHashKey, strHashValue), "ERISA Plan, Brokerage IRA, No-load/Load-waived Mutual Fund Shares, Stocks, Bonds, CDs: %", currentScreen);
								
										break;
									case"Q9O_SALE_LOADED_MUTUAL_FUND":
										blnStatus = setValue(WebControl.UNIQUE_CHECKBOX, IdentifyBy.NAME, "form_newAppFPCertNonVar:ax2ProducerInfo:sourceOfFundsPInsOptions_DD_FPCERTNONVAR", getAppCheckboxValues(strHashKey, strHashValue), " Sale of Loaded Mutual Fund Shares or UIT Shares", currentScreen);
								
										break;
									case"Q9O_SALE_IVESTMENT":
										blnStatus = setValue(WebControl.UNIQUE_CHECKBOX, IdentifyBy.NAME, "form_newAppFPCertNonVar:ax2ProducerInfo:sourceOfFundsPInsOptions_DD_FPCERTNONVAR", getAppCheckboxValues(strHashKey, strHashValue), "Sale of Investments Advisory Assets (Qualified or Non Qualified)", currentScreen);
								
										break;
									case"Q9O_OTHER":
										blnStatus = setValue(WebControl.UNIQUE_CHECKBOX, IdentifyBy.NAME, "form_newAppFPCertNonVar:ax2ProducerInfo:sourceOfFundsPInsOptions_DD_FPCERTNONVAR", getAppCheckboxValues(strHashKey, strHashValue), "Other: Sales of Car, Home, Business, or Other Asset, Legal Settlement,Lottery/Gaming Proceeds, Other", currentScreen);

										break;
								case "PROC_CM":
									String strPrevFrame = strFrames;
									blnStatus = setValue(WebControl.BUTTON, IdentifyBy.NAME, "form_newAppFPCertNonVar:ax2ProducerInfo:buttonAdd_CButton", validateInput(strHashValue), "Proc CM", currentScreen);
									strFrames = "FWin0" + GlobalData.STRING_SEPARATOR + "Content0";
									if(switchToFrame(strFrames, false)) {
										
										blnStatus = setValue(WebControl.BUTTON, IdentifyBy.ID, "form_BGACMDetails:bgaCMDetails_DataTable:0:bgaCMDetailsCol1_Link", validateInput(strHashValue), "Processing CM", currentScreen);
										//blnStatus = selectWebtableRow(IdentifyBy.ID, "form_BGACMDetails:bgaCMDetails_DataTable", "2", "Processing CM", currentScreen);
										Thread.sleep(MIC_TIMEOUT*1000);
										blnStatus = setValue(WebControl.BUTTON, IdentifyBy.NAME, "form_BGACMDetails:drAdd", strHashValue, "Add", currentScreen);
										waitForPageClose(MAX_TIMEOUT);
										switchToFrame(strPrevFrame, false);
									}
									else {
										ReportGenerator.generateTestStep(false, currentScreen, "Switch to Frame", "Failed to switch frames " + strFrames.replaceAll(GlobalData.STRING_SEPARATOR, " > "), false);
										blnStatus = false;
									}
									break;
								case "default1":
									ReportGenerator.generateTestStep(false, currentScreen, "Field Navigation", strHashKey + " field not available in the current method.", false);
									break;
								} //end of switch
								if(!blnStatus) break;
							} //end of while
						}
						else {
							ReportGenerator.generateTestStep(false, currentScreen, "Switch to Frame", "Failed to switch frames " + strFrames.replaceAll(GlobalData.STRING_SEPARATOR, " > "), false);
							blnStatus = false;
						}
						objEnum = null;
							
					} catch(Exception objExp) {
						ReportGenerator.generateTestStep(false, currentScreen, "Exception occured", "Exception is - " + objExp.getMessage(), false);
						blnStatus = false;
					}
					return blnStatus;
				}
			
				//Function For FPCertVariable flow
				private static boolean FPCertVariable(OrderedHashtable objTestData) {
					boolean blnStatus = false;
					String strHashKey = "", strHashValue = "";
					try {
						String strFrames = "mainContentFrame" + GlobalData.STRING_SEPARATOR + "contentRightFrame" + GlobalData.STRING_SEPARATOR + "file"+ GlobalData.STRING_SEPARATOR + "file";;
						Enumeration objEnum = objTestData.enumerateKeys();
						if(switchToFrame(strFrames, false) && waitForPageLoad(MAX_TIMEOUT)) {
							
							while(objEnum.hasMoreElements()) {
								//blnStatus = false;
								strHashKey = objEnum.nextElement().toString();
								strHashValue = objTestData.get(strHashKey).toString();

								switch(strHashKey) {
								case"Q9A":
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_newAppFPCertVariable:ax2InvestmentInfo:employedWithFinra_RB", validateInput(strHashValue), "Is the Owner affiliated with or employed by member of FINRA?", currentScreen);
									break;
								case"Q9B":
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_newAppFPCertVariable:ax2InvestmentInfo:clientHasFinancialPlan_RB", validateInput(strHashValue), "Has a financial Plan been prepared by AXA Advisors, LLC for the client in the last 12 months?", currentScreen);
									break;
								case"PLANNING_TOOL_NAME":
									blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_newAppFPCertVariable:ax2InvestmentInfo:planningToolName_EF", validateInput(strHashValue), "Plan # or Planning Tool Name:", currentScreen);
									
									break;
								case"INVESTMENT_TIME_HORIZON":
									
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_newAppFPCertVariable:ax2InvestmentInfo:investmentTimeHorizon_DD", validateInput(strHashValue), "9c. Investment Time Horizon:", currentScreen);
									break;
								case"INVESTMENT_OBJECTIVE":
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_newAppFPCertVariable:ax2InvestmentInfo:investmentObjective_DD", validateInput(strHashValue), "9d. Investment Objective:", currentScreen);
									break;
								case"RISK_TOLERANCE":
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_newAppFPCertVariable:ax2InvestmentInfo:riskTolerance_DD", validateInput(strHashValue), "9e. Risk Tolerance:", currentScreen);
									break;
								case"MARITAL_STATUS":
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_newAppFPCertVariable:ax2InvestmentInfo:maritalStatus_DD", validateInput(strHashValue), "9f. Marital Status:", currentScreen);
									break;
								case"NUMBER_OF_DEPENDENTS":
									blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_newAppFPCertVariable:ax2InvestmentInfo:noOfDependents_EF", validateInput(strHashValue), "9g. Number Of Dependents:", currentScreen);
									
									break;
								case"FEDERAL_TAX_BRACKET":
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_newAppFPCertVariable:ax2InvestmentInfo:federalTaxBracket_DD", validateInput(strHashValue), "9h. Federal Tax Bracket:", currentScreen);
									break;
									
								case"LIQUID_NET_WORTH":
									blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_newAppFPCertVariable:ax2InvestmentInfo:liquid1Networth_EF", validateInput(strHashValue), "9i. Liquid Net Worth $:", currentScreen);
									break;
								case"ESTIMATED_NET_MONTHLY_INCOME":
									blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_newAppFPCertVariable:ax2InvestmentInfo:estMonthIncm_EF", validateInput(strHashValue), "9j. Estimated Net Monthly Income", currentScreen);
									break;
								case"ESTIMATED_MONTHLY_EXPENSES":
									blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_newAppFPCertVariable:ax2InvestmentInfo:estMonthExp_EF", validateInput(strHashValue), "9k. Estimated Monthly Expenses", currentScreen);
									break;
									
								case"Q9L_CDS":
									blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_newAppFPCertVariable:ax2InvestmentInfo:cd_EF", validateInput(strHashValue), "CDS", currentScreen);
									break;
									
								case"Q9L_STOCKS":
									blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_newAppFPCertVariable:ax2InvestmentInfo:stocks_EF", validateInput(strHashValue), "STOCKS", currentScreen);
									break;
								case"Q9L_BONDS":
									blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_newAppFPCertVariable:ax2InvestmentInfo:bonds_EF", validateInput(strHashValue), "BONDS", currentScreen);
									break;
								case"Q9L_ANNUITIES":
									blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_newAppFPCertVariable:ax2InvestmentInfo:annuities_EF", validateInput(strHashValue), "ANNUITIES", currentScreen);
									break;
									
								case"Q9L_RETIREMENT_ACCOUNTS":
									blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_newAppFPCertVariable:ax2InvestmentInfo:retirementAccounts_EF", validateInput(strHashValue), "RETIREMENT ACCOUNTS", currentScreen);
									break;
								case"Q9L_INVESTMENT_REAL_ESTATE":
									blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_newAppFPCertVariable:ax2InvestmentInfo:realEstate_EF", validateInput(strHashValue), "Investment Real Estate (Net Equity)", currentScreen);
									break;
								case"Q9L_OTHER":                             
									blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_newAppFPCertVariable:ax2InvestmentInfo:otherExcludePrimaryResidence_EF", validateInput(strHashValue), "Other (529 plans, life policy cash values, alternative investments, etc.)", currentScreen);
									break;
								case"Q9L_INCOME":
									blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_newAppFPCertVariable:ax2InvestmentInfo:income_EF", validateInput(strHashValue), "INCOME", currentScreen);
									break;
								case"Q9L_GROWTH":
									blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_newAppFPCertVariable:ax2InvestmentInfo:growth_EF", validateInput(strHashValue), "GROWTH", currentScreen);
									break;
								case"Q9L_AGGRESSIVE":
									blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_newAppFPCertVariable:ax2InvestmentInfo:aggressive_EF", validateInput(strHashValue), "AGGRESSIVE", currentScreen);
									break;
								case"Q9L_OTHER_FUNDS":
									blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_newAppFPCertVariable:ax2InvestmentInfo:otherFunds_EF", validateInput(strHashValue), "OTHER_FUNDS", currentScreen);
									break;
								case"Q9M_INVESTMENT_ASSETS":
									blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_newAppFPCertVariable:ax2InvestmentInfo:totalInvestment_EF", validateInput(strHashValue), "9m. Total Investment Assets", currentScreen);
									break;
								case"Q9M_CASH":
									blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_newAppFPCertVariable:ax2InvestmentInfo:cashCheckingOrSaving_EF", validateInput(strHashValue), "Cash (checking, savings, MMA}", currentScreen);
									break;
								case"Q9M_INVESTMENT_ASSETS_CASH":
									blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_newAppFPCertVariable:ax2InvestmentInfo:totalInvestmentAssetsPlusCash_EF", validateInput(strHashValue), "Total Investment Assets (above) and cash", currentScreen);
									break;
								
								
								case"Q9N_CDS":
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_newAppFPCertVariable:ax2InvestmentInfo:cdExp_DD", validateInput(strHashValue), "9N_CDS", currentScreen);
									break;
								
								case"Q9N_STOCKS":
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_newAppFPCertVariable:ax2InvestmentInfo:stocksExp_DD", validateInput(strHashValue), "9N_STOCKS", currentScreen);
									break;
								case"Q9NBONDS":
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_newAppFPCertVariable:ax2InvestmentInfo:bondsExp_DD", validateInput(strHashValue), "9N_BONDS", currentScreen);
									break;
								case"Q9N_ANNUITIES":
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_newAppFPCertVariable:ax2InvestmentInfo:annuitiesExp_DD", validateInput(strHashValue), "9N_ANNUITIES", currentScreen);
									break;
								case"Q9N_MUTUAL_FUNDS":
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_newAppFPCertVariable:ax2InvestmentInfo:mfExp_DD", validateInput(strHashValue), "9N_MUTUAL_FUNDS", currentScreen);
									break;
								
								case"Q9O_CASH":
									blnStatus = setValue(WebControl.UNIQUE_CHECKBOX, IdentifyBy.NAME, "form_newAppFPCertVariable:ax2InvestmentInfo:sourceOfFundsPInsOptions_DD_FPCERTVAR", getAppCheckboxValues(strHashKey, strHashValue), "Cash: Death Claim, Gift, Inheritance, checking, saving, money market, payroll deduction.", currentScreen);
								
									break;
								case"Q9O_BORROWING":
									blnStatus = setValue(WebControl.UNIQUE_CHECKBOX, IdentifyBy.NAME, "form_newAppFPCertVariable:ax2InvestmentInfo:sourceOfFundsPInsOptions_DD_FPCERTVAR", getAppCheckboxValues(strHashKey, strHashValue), "Borrowing: Mortgage, Personal Loan, Credit.", currentScreen);
									
									break;
									case"Q9O_ANNUITY":
										blnStatus = setValue(WebControl.UNIQUE_CHECKBOX, IdentifyBy.NAME, "form_newAppFPCertVariable:ax2InvestmentInfo:sourceOfFundsPInsOptions_DD_FPCERTVAR", getAppCheckboxValues(strHashKey, strHashValue), "Annuity or Life insurance: (Replacement, Surrender/Exchange, Policy Loan, Dividend, Withdrawal)", currentScreen);
								
										break;
							
									case"Q9O_SALE_401K":
										blnStatus = setValue(WebControl.UNIQUE_CHECKBOX, IdentifyBy.NAME, "form_newAppFPCertVariable:ax2InvestmentInfo:sourceOfFundsPInsOptions_DD_FPCERTVAR", getAppCheckboxValues(strHashKey, strHashValue), "Sale of 401(k), Pension Plans, No-load/Load-waived Mutual Fund Shares, Stocks, Bonds, CDs", currentScreen);
									
										break;
									case"Q9O_SALE_LOADED_MUTUAL_FUND":
										blnStatus = setValue(WebControl.UNIQUE_CHECKBOX, IdentifyBy.NAME, "form_newAppFPCertVariable:ax2InvestmentInfo:sourceOfFundsPInsOptions_DD_FPCERTVAR", getAppCheckboxValues(strHashKey, strHashValue), " Sale of Loaded Mutual Fund Shares or UIT Shares", currentScreen);
								
										break;
									case"Q9O_SALE_IVESTMENT":
										blnStatus = setValue(WebControl.UNIQUE_CHECKBOX, IdentifyBy.NAME, "form_newAppFPCertVariable:ax2InvestmentInfo:sourceOfFundsPInsOptions_DD_FPCERTVAR", getAppCheckboxValues(strHashKey, strHashValue), "Sale of Investments Advisory Assets (Qualified or Non Qualified)", currentScreen);
								
										break;
									case"Q9O_OTHER":
										blnStatus = setValue(WebControl.UNIQUE_CHECKBOX, IdentifyBy.NAME, "form_newAppFPCertVariable:ax2InvestmentInfo:sourceOfFundsPInsOptions_DD_FPCERTVAR", getAppCheckboxValues(strHashKey, strHashValue), "Other: Sales of Car, Home, Business, or Other Asset, Legal Settlement,Lottery/Gaming Proceeds, Other", currentScreen);

										break;
									case"CERTIFICATIO_SIGNATURE_INSURANCE_BROKER":
										blnStatus = setValue(WebControl.CHECKBOX, IdentifyBy.NAME, "form_newAppFPCertVariable:ax2InvestmentInfo:financialProfessionalSignPresent_CB", validateInput(strHashValue), "Signature of Licensed Financial Professional/Insurance Broker", currentScreen);
										break;
									case"CERTIFICATION_DATE":
										blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_newAppFPCertVariable:ax2InvestmentInfo:financialProfessionalDate_EF", validateInput(strHashValue), "Date", currentScreen);
										break;
									case "default1":
										ReportGenerator.generateTestStep(false, currentScreen, "Field Navigation", strHashKey + " field not available in the current method.", false);
										break;							
								} //end of switch
								if(!blnStatus) break;
							} //end of while
						}
						else {
							ReportGenerator.generateTestStep(false, currentScreen, "Switch to Frame", "Failed to switch frames " + strFrames.replaceAll(GlobalData.STRING_SEPARATOR, " > "), false);
							blnStatus = false;
						}
						objEnum = null;
							
					} catch(Exception objExp) {
						ReportGenerator.generateTestStep(false, currentScreen, "Exception occured", "Exception is - " + objExp.getMessage(), false);
						blnStatus = false;
					}
					return blnStatus;
				}
				
				
				
				//Function For ElectronicPayments flow
				private static boolean ElectronicPayments(OrderedHashtable objTestData) {
					boolean blnStatus = false;
					String strHashKey = "", strHashValue = "";
					try {
						
						verifyPopupMessage(strErrorMessage);
						
						String strFrames = "mainContentFrame" + GlobalData.STRING_SEPARATOR + "contentRightFrame" + GlobalData.STRING_SEPARATOR + "file"+ GlobalData.STRING_SEPARATOR + "file";;
						Enumeration objEnum = objTestData.enumerateKeys();
						if(switchToFrame(strFrames, false) && waitForPageLoad(MAX_TIMEOUT)) {
							
							while(objEnum.hasMoreElements()) {
								//blnStatus = false;
								strHashKey = objEnum.nextElement().toString();
								strHashValue = objTestData.get(strHashKey).toString();

								switch(strHashKey) {
								case"INITIAL_PREMIUM_PAID_ELECTRONICALLY":
									blnStatus = setValue(WebControl.CHECKBOX, IdentifyBy.NAME, "form_suppFormSystematicPymt:axaSystematicPayment:InitialPremiumPaymentIndicator_CB", validateInput(strHashValue), "Initial Premium Payment", currentScreen);
									break;
								case"INITIAL_BANK_NAME":
									blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_suppFormSystematicPymt:axaSystematicPayment:InitialPremPayBankName_EF", validateInput(strHashValue), "Bank Name:", currentScreen);
									break;
								case"INITIAL_ACCOUNT_TYPE":
									blnStatus = setValue(WebControl.RADIOBOX, IdentifyBy.NAME, "form_suppFormSystematicPymt:axaSystematicPayment:InitialPremPayAccountType_RB", getAppRadioValues(strHashKey, strHashValue), "Checking /Saving", currentScreen);
									break;
								case"INITIAL_ROUTING_TRANSIT":
									blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_suppFormSystematicPymt:axaSystematicPayment:InitialPremPayRoutingTransitNumber", validateInput(strHashValue), "Routing / Transit#:", currentScreen);
									break;
								case"INITIAL_ACCOUNT_NUMBER":
									blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_suppFormSystematicPymt:axaSystematicPayment:InitialPremPayAccountNumber_EF1", validateInput(strHashValue), "Account Number:", currentScreen);
									break;
								case"INITIAL_OWNER_TYPE":
									blnStatus = setValue(WebControl.RADIOBOX, IdentifyBy.NAME, "form_suppFormSystematicPymt:axaSystematicPayment:personEntityType_RB", getAppRadioValues(strHashKey, strHashValue), " Individual/Institution ", currentScreen);
									break;
								case"FIRST_NAME":
									blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_suppFormSystematicPymt:axaSystematicPayment:firstName_EF", validateInput(strHashValue), "First Name", currentScreen);
									break;
								case"LAST_NAME":
									blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_suppFormSystematicPymt:axaSystematicPayment:InitialPremPayAccountNumber_EF", validateInput(strHashValue), "Last Name", currentScreen);
									break;
								case"EMAIL_ADDRESS":
									blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_suppFormSystematicPymt:axaSystematicPayment:InitialPremPayEmailId_EF", validateInput(strHashValue), "E-mail address:", currentScreen);
									break;
								case"INSTITUTION_NAME":
									blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_suppFormSystematicPymt:axaSystematicPayment:InitialPremPayNameOnAccount_EF", validateInput(strHashValue), "INSTITUTION_NAME", currentScreen);
									break;
								case"PAYER_OTHER_THAN_INSURED":
							
									blnStatus = setValue(WebControl.CHECKBOX, IdentifyBy.NAME, "form_suppFormSystematicPymt:axaSystematicPayment:nameOtherThanInsured_CB", validateInput(strHashValue), "Payer other than the Insured", currentScreen);
									break;
								case"RELATION_TO_INSURED":
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_suppFormSystematicPymt:axaSystematicPayment:PayerRelationToInsured_DD", validateInput(strHashValue), "Relation to Insured:", currentScreen);
									break;
								case"ADDRESS":
									blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_suppFormSystematicPymt:axaSystematicPayment:PayerAddress_IT", validateInput(strHashValue), "ADDRESS", currentScreen);
									break;
									
								case"CITY":
									blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_suppFormSystematicPymt:axaSystematicPayment:PayerCity_IT", validateInput(strHashValue), "CITY", currentScreen);
									break;
								case"STATE":
									blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_suppFormSystematicPymt:axaSystematicPayment:PayerState_DD", validateInput(strHashValue), "STATE", currentScreen);
									break;
								case"ZIP_CODE":
									blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_suppFormSystematicPymt:axaSystematicPayment:PayerZipcode_IT", validateInput(strHashValue), "ZIP CODE", currentScreen);
									break;
								case"SIGNATURE_OF_DEPOSITOR":
									blnStatus = setValue(WebControl.CHECKBOX, IdentifyBy.NAME, "form_suppFormSystematicPymt:axaSystematicPayment:depositorSign_CB", validateInput(strHashValue), "SIGNATURE OF DEPOSITOR", currentScreen);
									break;
								case"DEPOSITOR_DATE":
									blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_suppFormSystematicPymt:axaSystematicPayment:depositorSignDate_EF", validateInput(strHashValue), "DEPOSITOR DATE", currentScreen);
									break;
								case"SIGNATURE_OF_POLICYOWNER":
									blnStatus = setValue(WebControl.CHECKBOX, IdentifyBy.NAME, "form_suppFormSystematicPymt:axaSystematicPayment:insuredSign_CB", validateInput(strHashValue), "SIGNATURE OF POLICYOWNER", currentScreen);
									break;
									
								case"POLICYOWNER_DATE":
									blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_suppFormSystematicPymt:axaSystematicPayment:insuredSignDate_EF", validateInput(strHashValue), "POLICYOWNER DATE", currentScreen);
									break;
								
								case"SAME_ACCOUNT":
									blnStatus = setValue(WebControl.CHECKBOX, IdentifyBy.NAME, "form_suppFormSystematicPymt:axaSystematicPayment:RecurringPaymentIndicator_CB", validateInput(strHashValue), "Same Account Information as Initial Premium", currentScreen);
									break;
									
								case"RECURRING_ACCOUNT_NUMBER":
									blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_suppFormSystematicPymt:axaSystematicPayment:accountNumber_EF", validateInput(strHashValue), "Account Number:", currentScreen);
									break;
								case"RECURRING_ROUTING_TRANSIT":
									blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_suppFormSystematicPymt:axaSystematicPayment:RoutingTransitNumber", validateInput(strHashValue), "Routing / Transit#:", currentScreen);
									break;
									
								case"RECURRING_BANK_CODE":
									blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_suppFormSystematicPymt:axaSystematicPayment:bankCode_EF", validateInput(strHashValue), "Bank Code:", currentScreen);
									break;
								case"RECURRING_BANK_NAME":
									blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_suppFormSystematicPymt:axaSystematicPayment:bankName_EF", validateInput(strHashValue), "BANK NAME", currentScreen);
									break;
									
								case"RECURRING_NAME_ON_CHECK":
									blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_suppFormSystematicPymt:axaSystematicPayment:nameOnCheck_EF", validateInput(strHashValue), "NAME ON CHECK", currentScreen);
									break;
								case"RECURRING_ADD":
									blnStatus = setValue(WebControl.BUTTON, IdentifyBy.NAME, "form_suppFormSystematicPymt:axaSystematicPayment:CheckNameTableInfoAdd_CButton", validateInput(strHashValue), "ADD", currentScreen);
									break;
									
								case"NAME_ON_ACCOUNT":
									blnStatus = setValue(WebControl.CHECKBOX, IdentifyBy.NAME, "form_suppFormSystematicPymt:axaSystematicPayment:nameOtherThanOwner_CB1", validateInput(strHashValue), "Name on the account other than the owner or insured?", currentScreen);
									break;
									
								case"SIGNATURE_DEPOSITOR":
									blnStatus = setValue(WebControl.CHECKBOX, IdentifyBy.NAME, "form_suppFormSystematicPymt:axaSystematicPayment:depositorSign_CB1", validateInput(strHashValue), "Signature of Depositor", currentScreen);
									break;
								case"SYSTEM_MA_DEPOSITOR_DATE":
									blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_suppFormSystematicPymt:axaSystematicPayment:depositorSignDate_EF1", validateInput(strHashValue), "Date:", currentScreen);
									break;
									
								case"SIGNATURE_POLICYOWNER":
									blnStatus = setValue(WebControl.CHECKBOX, IdentifyBy.NAME, "form_suppFormSystematicPymt:axaSystematicPayment:insuredSign_CB1", validateInput(strHashValue), "Signature of Policyowner(s)", currentScreen);
									break;
								case"SYSTEM_MA_POLICYOWNER_DATE":
									blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_suppFormSystematicPymt:axaSystematicPayment:insuredSignDate_EF1", validateInput(strHashValue), "Date:", currentScreen);
									break;
								case "default1":
									ReportGenerator.generateTestStep(false, currentScreen, "Field Navigation", strHashKey + " field not available in the current method.", false);
									break;
							
								} //end of switch
								if(!blnStatus) break;
							} //end of while
						}
						else {
							ReportGenerator.generateTestStep(false, currentScreen, "Switch to Frame", "Failed to switch frames " + strFrames.replaceAll(GlobalData.STRING_SEPARATOR, " > "), false);
							blnStatus = false;
						}
						objEnum = null;
							
					} catch(Exception objExp) {
						ReportGenerator.generateTestStep(false, currentScreen, "Exception occured", "Exception is - " + objExp.getMessage(), false);
						blnStatus = false;
					}
					return blnStatus;
				}
				
				
				
				//Function For HIPAAPI flow
				private static boolean HIPAAPI(OrderedHashtable objTestData) {
					boolean blnStatus = false;
					String strHashKey = "", strHashValue = "";
					try {
						
						verifyPopupMessage(strErrorMessage);
						
						String strFrames = "mainContentFrame" + GlobalData.STRING_SEPARATOR + "contentRightFrame" + GlobalData.STRING_SEPARATOR + "file"+ GlobalData.STRING_SEPARATOR + "file";;
						Enumeration objEnum = objTestData.enumerateKeys();
						if(switchToFrame(strFrames, false) && waitForPageLoad(MAX_TIMEOUT)) {
							
							while(objEnum.hasMoreElements()) {
								//blnStatus = false;
								strHashKey = objEnum.nextElement().toString();
								strHashValue = objTestData.get(strHashKey).toString();

								switch(strHashKey) {
																		

								case"PREFIX":
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_ax2Hipaa:ax2SignatureHIPAA:insured1Prefix_DD", validateInput(strHashValue), "Prefix:", currentScreen);
									break;
								case"FIRST_NAME":
									blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_ax2Hipaa:ax2SignatureHIPAA:insured1First_EF", validateInput(strHashValue), "First :", currentScreen);
									break;
								case"MIDDLE_NAME":
									blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_ax2Hipaa:ax2SignatureHIPAA:insured1Middle_EF", validateInput(strHashValue), "Middle :", currentScreen);
									break;
								case"LAST_NAME":
									blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_ax2Hipaa:ax2SignatureHIPAA:insured1Last_EF", validateInput(strHashValue), "Last :", currentScreen);
									break;
								case"SUFFIX":
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_ax2Hipaa:ax2SignatureHIPAA:insured1Suffix_DD", validateInput(strHashValue), "Suffix:", currentScreen);
									break;
								case"DATE_OF_BIRTH":
									blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_ax2Hipaa:ax2SignatureHIPAA:insured1DOB_EF", validateInput(strHashValue), "8. Date Of Birth:", currentScreen);
									break;
								case"SIGNATURE_PROPOSED_INSURED":
									blnStatus = setValue(WebControl.CHECKBOX, IdentifyBy.NAME, "form_ax2Hipaa:ax2SignatureHIPAA:signPatient_Cb", validateInput(strHashValue), "Signature of Proposed Insured / Patient or Authorized Representative", currentScreen);
									break;
								case"DESCRIPTION_OF_PERSONAL":
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_ax2Hipaa:ax2SignatureHIPAA:signRelationship_DD", validateInput(strHashValue), "Description of Personal Representative's Authority / Relationship to Proposed Insured / Patient", currentScreen);
									break;
								case"SIGNED_CITY":
									blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_ax2Hipaa:ax2SignatureHIPAA:relationshipCity_EF", validateInput(strHashValue), "Signed At: City", currentScreen);
									break;
								case"SIGNED_STATE":
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_ax2Hipaa:ax2SignatureHIPAA:relationshipState_DD", validateInput(strHashValue), "State :", currentScreen);
									break;
								case"SIGNED_DATE":
									blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_ax2Hipaa:ax2SignatureHIPAA:relationshipDate_EF", validateInput(strHashValue), "Date:", currentScreen);
									break;
								case "default1":
									ReportGenerator.generateTestStep(false, currentScreen, "Field Navigation", strHashKey + " field not available in the current method.", false);
									break;
							
								} //end of switch
								if(!blnStatus) break;
							} //end of while
						}
						else {
							ReportGenerator.generateTestStep(false, currentScreen, "Switch to Frame", "Failed to switch frames " + strFrames.replaceAll(GlobalData.STRING_SEPARATOR, " > "), false);
							blnStatus = false;
						}
						objEnum = null;
							
					} catch(Exception objExp) {
						ReportGenerator.generateTestStep(false, currentScreen, "Exception occured", "Exception is - " + objExp.getMessage(), false);
						blnStatus = false;
					}
					return blnStatus;
				}
				private static boolean verifyProductPopup() {
					//String strMessage = "No Images to display";
					boolean blnStatus = false;
					String strFrames = "FWin0" + GlobalData.STRING_SEPARATOR + "Content0" ;
					try {
						if(switchToFrame(strFrames, true)) {
							gobjWebDriver.findElement(By.id("ok")).click();
							blnStatus = true;
							waitForPageClose(MIN_TIMEOUT);
						
						}
					} catch (InterruptedException e) {
						System.out.println("No error popup");
					}
					return blnStatus;
				}
				
				//Function For Products flow
				private static boolean Products(OrderedHashtable objTestData) {
					boolean blnStatus = false;
					String strHashKey = "", strHashValue = "";
					try {
						
						verifyProductPopup();
						String strFrames = "mainContentFrame" + GlobalData.STRING_SEPARATOR + "contentRightFrame" + GlobalData.STRING_SEPARATOR + "file"+ GlobalData.STRING_SEPARATOR + "file";;
						Enumeration objEnum = objTestData.enumerateKeys();
						if(switchToFrame(strFrames, false) && waitForPageLoad(MAX_TIMEOUT)) {
							
							while(objEnum.hasMoreElements()) {
								//blnStatus = false;
								strHashKey = objEnum.nextElement().toString();
								strHashValue = objTestData.get(strHashKey).toString();

								switch(strHashKey) {
							 
								case"PRODUCT_NAME":                                          
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.XPATH, "//select[contains(@name,'productName_DD')]", validateInput(strHashValue), "1. Product Name:", currentScreen);
								break;
								case"AMOUNT_OF_INSURANCE":
									blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.XPATH, "//select[contains(@name,'AmountOfInsurance')]", validateInput(strHashValue), "2. Amount of Insurance:", currentScreen);
									break;
								case"IS_TERM_CONVERSION":
									blnStatus = setValue(WebControl.CHECKBOX, IdentifyBy.XPATH, "//input[contains(@name,'termConversion_CB')]", validateInput(strHashValue), "Is this a Term Conversion or Purchase Option ?", currentScreen);
									break;
								case"BACKDATE_TO_SAVE_AGE":
									blnStatus = setValue(WebControl.CHECKBOX, IdentifyBy.XPATH, "//input[contains(@name,'backDate_CB')]", validateInput(strHashValue), "5. Backdate to save age", currentScreen);
									break;
									
								case"Q4_DEATH_BENEFIT_OPTION": 
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.XPATH, "//select[contains(@name,'deathBenefitOption_DD')]", validateInput(strHashValue), "4. Death Benefit Option:", currentScreen);
									//blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_AthenaIndexedUniversalLife:planInformation:deathBenefitOption_DD", validateInput(strHashValue), "4. Death Benefit Option:", currentScreen);
									break;
								case"Q6_DEFINITION_OF_LIFEINSURANCETEST":  
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.XPATH, "//select[contains(@name,'definitionOption_DD')]", validateInput(strHashValue), "6. Definition of Life Insurance Test:", currentScreen);
									break;
								case"Q7A_PREMIUM_AMOUNT":
									blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.XPATH, "//input[contains(@id,'premiumAmount_EF')]", validateInput(strHashValue), "7a. Premium Amount:", currentScreen);
									break;
								case"PRODUCT_ALLOTMENT":
									blnStatus = setValue(WebControl.BUTTON, IdentifyBy.XPATH, "//input[contains(@name,'methodOfPayment_CButton')]", validateInput(strHashValue), "PRODUCT_ALLOTMENT", currentScreen);
									break;
								case"Q7B_INITIAL_PREMIUM":
									waitForPageLoad(MIC_TIMEOUT);
									blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.XPATH, "//input[contains(@id,'initialPremium_EF')]", validateInput(strHashValue), "7b. Initial Premium:", currentScreen);
									break;
								case"Q8A_PAYMENT_MODE":
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.XPATH, "//select[contains(@name,'paymentMode_DD')]", validateInput(strHashValue), "8a. Payment Mode:", currentScreen);
									waitForPageLoad(MIC_TIMEOUT);
									break;
								case"Q8BC_METHOD_OF_PAYMENT":
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.XPATH, "//select[contains(@name,'methodOfPayment_DD')]", validateInput(strHashValue), "8b./8c. Method of Payment:", currentScreen);
									waitForPageLoad(MIC_TIMEOUT);
									break;
								case"REGISTER_DATE_REASON":
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.XPATH, "//select[contains(@name,'registerDateReason_DD')]", validateInput(strHashValue), "Register Date Reason", currentScreen);
									break;
								case"REGISTER_DATE":
									blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.XPATH, "//input[contains(@name,'startDate_EF')]", validateInput(strHashValue), "Register Date:", currentScreen);
									break;
								case"SECTION_B_DRAFT_ON":
									blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.XPATH, "//input[contains(@name,'draftOn_EF')]", validateInput(strHashValue), "Draft On", currentScreen);
									break;
								case"IN_LIEU_VOIDED_CHECK":
									blnStatus = setValue(WebControl.CHECKBOX, IdentifyBy.XPATH, "//input[contains(@name,'firstPremiunCheck_CB')]", validateInput(strHashValue), "In lieu of voided check, use first premium check to set up Systematic Payment Plan", currentScreen);
									break;
									
								case"SECTION_B_SINGLE_PAYMENT":
									
									blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.XPATH, "//input[contains(@name,'singlePayment_EF')]", validateInput(strHashValue), "Single Payment:", currentScreen);
					
									break;
									
								
								case"RIDER":
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.XPATH, "//select[contains(@name,'Rider_DD')]", validateInput(strHashValue), "Rider:", currentScreen);
									break;
								case"AMOUNT":
									blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.XPATH, "//input[contains(@name,'RiderAmount_EF')]", validateInput(strHashValue), "Amount:", currentScreen);
									break;
								case"UNBORN_CHILD":
									blnStatus = setValue(WebControl.CHECKBOX, IdentifyBy.XPATH, "//input[contains(@name,'UnbornChildLabel_CB')]", validateInput(strHashValue), "Unborn Child", currentScreen);
									break;
								case"ADD":
									blnStatus = setValue(WebControl.BUTTON, IdentifyBy.XPATH, "//input[contains(@name,'pinsPlanInfoAdd1_CButton')]", validateInput(strHashValue), "ADD", currentScreen);
									break;
								case"BENEFIT":
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.XPATH, "//select[contains(@name,'benefit_DD')]", validateInput(strHashValue), "Benefit:", currentScreen);
									
									break;
								case"BENEFIT_AMOUNT":
									blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.XPATH, "//input[contains(@name,'BenefitAmount_EF')]", validateInput(strHashValue), "Amount:", currentScreen);
									break;
								case"BENEFIT_PERCENTAGE"://form_AthenaIndexedUniversalLife:axaBenefits:BenefitPercentage_EF
									blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.XPATH, "//input[contains(@name,'BenefitPercentage_EF')]", validateInput(strHashValue), "Percentage:", currentScreen);
									break;
								case"BENEFIT_ACCUMULATION"://form_AthenaIndexedUniversalLife:axaBenefits:Accumulation_EF
									blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.XPATH, "//input[contains(@name,'Accumulation_EF')]", validateInput(strHashValue), "Accumulation% :", currentScreen);
									break;
								case"BENEFIT_ADD":
									blnStatus = setValue(WebControl.BUTTON, IdentifyBy.XPATH, "//input[contains(@name,'pinsPlanInfoAdd_CButton')]", validateInput(strHashValue), "BENEFIT_ADD", currentScreen);
									break;
								case"Products_CLR":
									blnStatus = setValue(WebControl.BUTTON, IdentifyBy.XPATH, "//input[contains(@name,'beneficairy_CButton')]", validateInput(strHashValue), "CLR_IPOPUP", currentScreen);
									
									break;
								case"INITIAL_ALLOCATION_ACCOUNTS":
									waitForPageLoad(MIC_TIMEOUT);
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.XPATH, "//select[contains(@name,'Initial_Allocbenefit_DD')]", validateInput(strHashValue), "Accounts", currentScreen);
									break;
								case"INITIAL_ALLOCATION_PREMIUM":
									blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.XPATH, "//input[contains(@name,'Initial_AllocBenefitAmount_EF')]", validateInput(strHashValue), "Premium %:", currentScreen);
									break;
									
								case"INITIAL_ALLOCATION_DEDUCTION":
									blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.XPATH, "//input[contains(@name,'Initial_AllocBenefitPercentage_EF')]", validateInput(strHashValue), "Premium %:", currentScreen);
									break;
									
								case"ALLOCT_INFO_ADD":
									blnStatus = setValue(WebControl.BUTTON, IdentifyBy.XPATH, "//input[contains(@name,'Initial_AllocpinsPlanInfoAdd_CButton')]", validateInput(strHashValue), "Initial Allocation Plan InfoAdd button", currentScreen);
									
									break;
									
									
								case"AUTOMATIC_PREMIUM_LOAN_OPTION":
									blnStatus = setValue(WebControl.CHECKBOX, IdentifyBy.XPATH, "//input[contains(@name,'automaticPremLoanCB')]", validateInput(strHashValue), "Automatic Premium Loan Option", currentScreen);
								
									break;
																

								case"SPECIFIED_GROWTH_CAP_RATE":
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.XPATH, "//input[contains(@name,'MarketStablizer_Inp')]", validateInput(strHashValue), "Specified Growth Cap Rate:", currentScreen);
									break;
								case"GIA_PRO_RATA_TRANSFER":
									blnStatus = setValue(WebControl.CHECKBOX, IdentifyBy.XPATH, "//input[contains(@name,'joiaturntPIsignature2999992_CB')]", validateInput(strHashValue), "Pro Rata Transfer", currentScreen);
									
									break;
								case"GIA_ACCOUNTS":
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.XPATH, "//select[contains(@name,'IGIAns_DD')]", validateInput(strHashValue), "Accounts", currentScreen);
									break;
								case"GIA_PERCENTAGE":
									blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.XPATH, "//input[contains(@name,'GIAPercent_EF4')]", validateInput(strHashValue), "Percentage:", currentScreen);
									break;
									
								case"GIA_ADD":
									blnStatus = setValue(WebControl.BUTTON, IdentifyBy.XPATH, "//input[contains(@name,'DGIAAdd_CButton')]", validateInput(strHashValue), "ADD", currentScreen);
									break;
									
								case"MARKET_STABILIZER_SELECTION":
									blnStatus = setValue(WebControl.CHECKBOX, IdentifyBy.XPATH, "//input[contains(@name,'joinB')]", validateInput(strHashValue), "Market Stabilizer Selection", currentScreen);
									break;
									
								case"SMA_ACCOUNTS":
									
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.XPATH, "//select[contains(@name,'IMaturitys_DD')]", validateInput(strHashValue), "Accounts", currentScreen);
									break;
									
								case"SMA_PERCENTAGE":
									blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.XPATH, "//input[contains(@name,'SMaturityPercent_EF4')]", validateInput(strHashValue), "Percentage:", currentScreen);
									break;
									
								case"SMA_ADD":
									blnStatus = setValue(WebControl.BUTTON, IdentifyBy.XPATH, "//input[contains(@name,'DMaturityd_CButton')]", validateInput(strHashValue), "SMA_ADD", currentScreen);
									break;
								case"SUITABILITY":
									blnStatus = setValue(WebControl.BUTTON, IdentifyBy.XPATH, "//input[contains(@name,'uitability_CButton')]", validateInput(strHashValue), "Suitability", currentScreen);
									break;
									
								case"AUTOMATIC_TRANSFER_SERVICE":
									blnStatus = setValue(WebControl.BUTTON, IdentifyBy.XPATH, "//input[contains(@name,'benefissscairy_CButton')]", validateInput(strHashValue), "Automatic Transfer Service", currentScreen);
									break;
									
								case"FREQUENCY":
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.XPATH, "//input[contains(@name,'Option33al_DD')]", validateInput(strHashValue), "Frequency:", currentScreen);
									break;
								case "default1":
									ReportGenerator.generateTestStep(false, currentScreen, "Field Navigation", strHashKey + " field not available in the current method.", false);
									break;
								
								} //end of switch
								if(!blnStatus) break;
							} //end of while
						}
						else {
							ReportGenerator.generateTestStep(false, currentScreen, "Switch to Frame", "Failed to switch frames " + strFrames.replaceAll(GlobalData.STRING_SEPARATOR, " > "), false);
							blnStatus = false;
						}
						objEnum = null;
							
					} catch(Exception objExp) {
						ReportGenerator.generateTestStep(false, currentScreen, "Exception occured", "Exception is - " + objExp.getMessage(), false);
						blnStatus = false;
					}
					return blnStatus;
				}
				
				//Function For ProductAllotment flow
				private static boolean ProductAllotment(OrderedHashtable objTestData) {
					boolean blnStatus = false;
					String strHashKey = "", strHashValue = "";
					try {
						String strFrames = "FWin0" + GlobalData.STRING_SEPARATOR + "Content0";
						Enumeration objEnum = objTestData.enumerateKeys();
						if(switchToFrame(strFrames, false) && waitForPageLoad(MAX_TIMEOUT)) {
							
							while(objEnum.hasMoreElements()) {
								//blnStatus = false;
								strHashKey = objEnum.nextElement().toString();
								strHashValue = objTestData.get(strHashKey).toString();

								switch(strHashKey) {
								
					
																	
								case"SAL_IS_ALLOTTER_PROPOSED":
									blnStatus = setValue(WebControl.CHECKBOX, IdentifyBy.NAME, "form_UlEmployerInfo:SallaryAllotmentBCB", validateInput(strHashValue), "Sallary Allotment_Is Allotter proposed ?", currentScreen);
									break;
								case"SAL_UNIT_NAME":
									blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_UlEmployerInfo:UnitNamevalue", validateInput(strHashValue), "Sallary Allotment_Unit Name", currentScreen);
									break;
								case"SAL_UNIT_NUMBER":
									blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_UlEmployerInfo:UnitNumberOfAllotervalue", validateInput(strHashValue), "Sallary Allotment_Unit Number", currentScreen);
									break;
								case"SAL_REGISTER_DATE":
									blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_UlEmployerInfo:AlloterRegisterDate1Value", validateInput(strHashValue), "Sallary Allotment_Register Date", currentScreen);
									break;
								case"SAL_ADD":
									blnStatus = setValue(WebControl.BUTTON, IdentifyBy.NAME, "form_UlEmployerInfo:drAdd", validateInput(strHashValue), "Sallary Allotment_Add", currentScreen);
									break;
								case"MIL_IS_ALLOTTER_PROPOSED":
									blnStatus = setValue(WebControl.CHECKBOX, IdentifyBy.NAME, "form_MilitaryAllotment:allotterProposedInsured_CB", validateInput(strHashValue), "Military Allotment_Is Allotter proposed", currentScreen);
									break;
								case"MIL_BRANCH":
									blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_MilitaryAllotment:unitName_EF", validateInput(strHashValue), "Military Allotment_Branch", currentScreen);
									break;
								case"MIL_UNIT_NUMBER":
									blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_MilitaryAllotment:unitNumberOfAlloter_EF", validateInput(strHashValue), "Military Allotment_Unit Number", currentScreen);
									break;
								case"MIL_REGISTER_DATE":
									blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_MilitaryAllotment:alloterRegisterDate_EF", validateInput(strHashValue), "Military Allotment_Register Date", currentScreen);
									break;
								case"MIL_ADD":
									blnStatus = setValue(WebControl.BUTTON, IdentifyBy.NAME, "form_MilitaryAllotment:drAdd", validateInput(strHashValue), "Military Allotment_ADD", currentScreen);
									break;
								case "default1":
									ReportGenerator.generateTestStep(false, currentScreen, "Field Navigation", strHashKey + " field not available in the current method.", false);
									break;
								
								} //end of switch
								if(!blnStatus) break;
							} //end of while
						}
						else {
							ReportGenerator.generateTestStep(false, currentScreen, "Switch to Frame", "Failed to switch frames " + strFrames.replaceAll(GlobalData.STRING_SEPARATOR, " > "), false);
							blnStatus = false;
						}
						objEnum = null;
							
					} catch(Exception objExp) {
						ReportGenerator.generateTestStep(false, currentScreen, "Exception occured", "Exception is - " + objExp.getMessage(), false);
						blnStatus = false;
					}
					return blnStatus;
				}
				
				
				//Function For Products-IL flow   //ProductsIL
				private static boolean ProductsIL (OrderedHashtable objTestData) {
					boolean blnStatus = false;
					String strHashKey = "", strHashValue = "";
					try {
						String strFrames = "mainContentFrame" + GlobalData.STRING_SEPARATOR + "contentRightFrame" + GlobalData.STRING_SEPARATOR + "file"+ GlobalData.STRING_SEPARATOR + "file";;
						Enumeration objEnum = objTestData.enumerateKeys();
						if(switchToFrame(strFrames, false) && waitForPageLoad(MAX_TIMEOUT)) {
							
							while(objEnum.hasMoreElements()) {
								//blnStatus = false;
								strHashKey = objEnum.nextElement().toString();
								strHashValue = objTestData.get(strHashKey).toString();

								switch(strHashKey) {
							 
								case"PRODUCT_NAME":                                          
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.XPATH, "//select[contains(@name,'productName_DD')]", validateInput(strHashValue), "1. Product Name:", currentScreen);
								break;
								case"AMOUNT_OF_INSURANCE":
									blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.XPATH, "//select[contains(@name,'AmountOfInsurance')]", validateInput(strHashValue), "2. Amount of Insurance:", currentScreen);
									break;
								case"IS_TERM_CONVERSION":
									blnStatus = setValue(WebControl.CHECKBOX, IdentifyBy.XPATH, "//input[contains(@name,'termConversion_CB')]", validateInput(strHashValue), "Is this a Term Conversion or Purchase Option ?", currentScreen);
									break;
								case"BACKDATE_TO_SAVE_AGE":
									blnStatus = setValue(WebControl.CHECKBOX, IdentifyBy.XPATH, "//input[contains(@name,'backDate_CB')]", validateInput(strHashValue), "5. Backdate to save age", currentScreen);
									break;
									
								case"Q4_DEATH_BENEFIT_OPTION": 
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.XPATH, "//select[contains(@name,'deathBenefitOption_DD')]", validateInput(strHashValue), "4. Death Benefit Option:", currentScreen);
									//blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_AthenaIndexedUniversalLife:planInformation:deathBenefitOption_DD", validateInput(strHashValue), "4. Death Benefit Option:", currentScreen);
									break;
								case"Q6_DEFINITION_OF_LIFEINSURANCETEST":  
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.XPATH, "//select[contains(@name,'definitionOption_DD')]", validateInput(strHashValue), "6. Definition of Life Insurance Test:", currentScreen);
									break;
								case"Q7A_PREMIUM_AMOUNT":
									blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.XPATH, "//select[contains(@id,'premiumAmount_EF')]", validateInput(strHashValue), "7a. Premium Amount:", currentScreen);
									break;
								case"Q7B_INITIAL_PREMIUM":
									blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.XPATH, "//select[contains(@id,'initialPremium_EF')]", validateInput(strHashValue), "7b. Initial Premium:", currentScreen);
									break;
								case"Q8A_PAYMENT_MODE":
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.XPATH, "//select[contains(@name,'paymentMode_DD')]", validateInput(strHashValue), "8a. Payment Mode:", currentScreen);
									break;
								case"Q8BC_METHOD_OF_PAYMENT":
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.XPATH, "//select[contains(@name,'methodOfPayment_DD')]", validateInput(strHashValue), "8b./8c. Method of Payment:", currentScreen);
									waitForPageLoad(MIN_TIMEOUT);
									break;
								case"REGISTER_DATE_REASON":
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.XPATH, "//select[contains(@name,'registerDateReason_DD')]", validateInput(strHashValue), "Register Date Reason", currentScreen);
									break;
								case"REGISTER_DATE":
									blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.XPATH, "//select[contains(@name,'startDate_EF')]", validateInput(strHashValue), "Register Date:", currentScreen);
									break;
									
								case"SECTION_B_DRAFT_ON":
									blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.XPATH, "//select[contains(@name,'draftOn_EF')]", validateInput(strHashValue), "Draft On", currentScreen);
									break;
								case"IN_LIEU_VOIDED_CHECK":
									blnStatus = setValue(WebControl.CHECKBOX, IdentifyBy.XPATH, "//select[contains(@name,'firstPremiunCheck_CB')]", validateInput(strHashValue), "In lieu of voided check, use first premium check to set up Systematic Payment Plan", currentScreen);
									break;
									
								case"SECTION_B_SINGLE_PAYMENT":
									
									blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.XPATH, "//select[contains(@name,'singlePayment_EF')]", validateInput(strHashValue), "Single Payment:", currentScreen);
					
									break;
									
								
								case"RIDER":
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.XPATH, "//select[contains(@name,'Rider_DD')]", validateInput(strHashValue), "Rider:", currentScreen);
									break;
								case"AMOUNT":
									blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.XPATH, "//select[contains(@name,'RiderAmount_EF')]", validateInput(strHashValue), "Amount:", currentScreen);
									break;
								case"UNBORN_CHILD":
									blnStatus = setValue(WebControl.CHECKBOX, IdentifyBy.XPATH, "//select[contains(@name,'UnbornChildLabel_CB')]", validateInput(strHashValue), "Unborn Child", currentScreen);
									break;
								case"ADD":
									blnStatus = setValue(WebControl.BUTTON, IdentifyBy.XPATH, "//select[contains(@name,'pinsPlanInfoAdd1_CButton')]", validateInput(strHashValue), "ADD", currentScreen);
									break;
								case"BENEFIT":
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.XPATH, "//select[contains(@name,'benefit_DD')]", validateInput(strHashValue), "Benefit:", currentScreen);
									
									break;
								case"BENEFIT_AMOUNT":
									blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.XPATH, "//select[contains(@name,'BenefitAmount_EF')]", validateInput(strHashValue), "Amount:", currentScreen);
									break;
								case"BENEFIT_PERCENTAGE":
									blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.XPATH, "//select[contains(@name,'BenefitPercentage_EF')]", validateInput(strHashValue), "Percentage:", currentScreen);
									break;
								case"BENEFIT_ACCUMULATION":
									blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.XPATH, "//select[contains(@name,'Accumulation_EF')]", validateInput(strHashValue), "Accumulation% :", currentScreen);
									break;
								case"BENEFIT_ADD":
									blnStatus = setValue(WebControl.BUTTON, IdentifyBy.XPATH, "//select[contains(@name,'pinsPlanInfoAdd_CButton')]", validateInput(strHashValue), "BENEFIT_ADD", currentScreen);
									break;
									
									
								case"INITIAL_ALLOCATION_ACCOUNTS":
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.XPATH, "//select[contains(@name,'Initial_Allocbenefit_DD')]", validateInput(strHashValue), "Accounts", currentScreen);
									break;
								case"INITIAL_ALLOCATION_PREMIUM":
									blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.XPATH, "//select[contains(@name,'Initial_AllocBenefitAmount_EF')]", validateInput(strHashValue), "Premium %:", currentScreen);
									break;
									
								case"INITIAL_ALLOCATION_DEDUCTION":
									blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.XPATH, "//select[contains(@name,'Initial_AllocBenefitPercentage_EF')]", validateInput(strHashValue), "Premium %:", currentScreen);
									break;
									
								case"ALLOCT_INFOADD":
									blnStatus = setValue(WebControl.BUTTON, IdentifyBy.XPATH, "//select[contains(@name,'Initial_AllocpinsPlanInfoAdd_CButton')]", validateInput(strHashValue), "Initial Allocation Plan InfoAdd button", currentScreen);
									
									break;
									
									
								case"SPECIFIED_GROWTH_CAP_RATE":
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.XPATH, "//select[contains(@name,'MarketStablizer_Inp')]", validateInput(strHashValue), "Specified Growth Cap Rate:", currentScreen);
									break;
								case"GIA_PRO_RATA_TRANSFER":
									blnStatus = setValue(WebControl.CHECKBOX, IdentifyBy.XPATH, "//select[contains(@name,'joiaturntPIsignature2999992_CB')]", validateInput(strHashValue), "Pro Rata Transfer", currentScreen);
									
									break;
								case"GIA_ACCOUNTS":
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.XPATH, "//select[contains(@name,'IGIAns_DD')]", validateInput(strHashValue), "Accounts", currentScreen);
									break;
								case"GIA_PERCENTAGE":
									blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.XPATH, "//select[contains(@name,'GIAPercent_EF4')]", validateInput(strHashValue), "Percentage:", currentScreen);
									break;
									
								case"GIA_ADD":
									blnStatus = setValue(WebControl.BUTTON, IdentifyBy.XPATH, "//select[contains(@name,'DGIAAdd_CButton')]", validateInput(strHashValue), "ADD", currentScreen);
									break;
									
								case"MARKET_STABILIZER_SELECTION":
									blnStatus = setValue(WebControl.CHECKBOX, IdentifyBy.XPATH, "//select[contains(@name,'joinB')]", validateInput(strHashValue), "Market Stabilizer Selection", currentScreen);
									break;
						
									
	                            case"SMA_ACCOUNTS":
									
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.XPATH, "//select[contains(@name,'IMaturitys_DD')]", validateInput(strHashValue), "Accounts", currentScreen);
									break;
									
								case"SMA_PERCENTAGE":
									blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.XPATH, "//select[contains(@name,'SMaturityPercent_EF4')]", validateInput(strHashValue), "Percentage:", currentScreen);
									break;
									
								case"SMA_ADD":
									blnStatus = setValue(WebControl.BUTTON, IdentifyBy.XPATH, "//select[contains(@name,'DMaturityd_CButton')]", validateInput(strHashValue), "SMA_ADD", currentScreen);
									break;
								case"SUITABILITY":
									blnStatus = setValue(WebControl.BUTTON, IdentifyBy.XPATH, "//select[contains(@name,'uitability_CButton')]", validateInput(strHashValue), "Suitability", currentScreen);
									break;
									
								case"AUTOMATIC_TRANSFER_SERVICE":
									blnStatus = setValue(WebControl.BUTTON, IdentifyBy.XPATH, "//select[contains(@name,'benefissscairy_CButton')]", validateInput(strHashValue), "Automatic Transfer Service", currentScreen);
									break;
									
								case"FREQUENCY":
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.XPATH, "//select[contains(@name,'Option33al_DD')]", validateInput(strHashValue), "Frequency:", currentScreen);
									break;
								case "default1":
									ReportGenerator.generateTestStep(false, currentScreen, "Field Navigation", strHashKey + " field not available in the current method.", false);
									break;
								
								
								} //end of switch
								if(!blnStatus) break;
							} //end of while
						}
						else {
							ReportGenerator.generateTestStep(false, currentScreen, "Switch to Frame", "Failed to switch frames " + strFrames.replaceAll(GlobalData.STRING_SEPARATOR, " > "), false);
							blnStatus = false;
						}
						objEnum = null;
							
					} catch(Exception objExp) {
						ReportGenerator.generateTestStep(false, currentScreen, "Exception occured", "Exception is - " + objExp.getMessage(), false);
						blnStatus = false;
					}
					return blnStatus;
				}
				
				
				//Function For Products-ISWL flow
				private static boolean ProductsISWL(OrderedHashtable objTestData) {
					boolean blnStatus = false;
					String strHashKey = "", strHashValue = "";
					try {
						String strFrames = "mainContentFrame" + GlobalData.STRING_SEPARATOR + "contentRightFrame" + GlobalData.STRING_SEPARATOR + "file"+ GlobalData.STRING_SEPARATOR + "file";;
						Enumeration objEnum = objTestData.enumerateKeys();
						if(switchToFrame(strFrames, false) && waitForPageLoad(MAX_TIMEOUT)) {
							
							while(objEnum.hasMoreElements()) {
								//blnStatus = false;
								strHashKey = objEnum.nextElement().toString();
								strHashValue = objTestData.get(strHashKey).toString();

								switch(strHashKey) {
								
							
								case"PRODUCT_NAME":
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_ISWL:ax2PlanInfo_iswl:productName_DD", validateInput(strHashValue), "1. Product Name:", currentScreen);
								break;
								case"AMOUNT_OF_INSURANCE":
									blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_ISWL:ax2PlanInfo_iswl:AmountOfInsurance", validateInput(strHashValue), "2. Amount of Insurance:", currentScreen);
									break;
								case"Q3_IS_TERM_CONVERSION":
									blnStatus = setValue(WebControl.CHECKBOX, IdentifyBy.NAME, "form_ISWL:ax2PlanInfo_iswl:termConversion_CB", validateInput(strHashValue), "Is this a Term Conversion or Purchase Option ?", currentScreen);
									break;
								case"Q4_BACKDATE_TO_SAVE_AGE":
									blnStatus = setValue(WebControl.CHECKBOX, IdentifyBy.NAME, "form_ISWL:ax2PlanInfo_iswl:backDate_CB", validateInput(strHashValue), "5. Backdate to save age", currentScreen);
									break;
								
								case"Q5A_PAYMENT_MODE":
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_ISWL:ax2PremiumInformation_iswl:paymentMode_DD", validateInput(strHashValue), "5a. Payment Mode:", currentScreen);
									break;
								case"Q5BC_METHOD_OF_PAYMENT":
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_ISWL:ax2PremiumInformation_iswl:methodOfPayment_DD", validateInput(strHashValue), "5b./5c. Method of Payment:", currentScreen);
									waitForPageLoad(MIN_TIMEOUT);
									break;
								case"REGISTER_DATE_REASON":
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_ISWL:ax2PremiumInformation_iswl:registerDateReason_DD", validateInput(strHashValue), "Register Date Reason", currentScreen);
									break;
								case"REGISTER_DATE":
									blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_ISWL:ax2PremiumInformation_iswl:startDate_EF", validateInput(strHashValue), "Register Date:", currentScreen);
									break;
							
								case"IN_LIEU_VOIDED_CHECK":
									blnStatus = setValue(WebControl.CHECKBOX, IdentifyBy.NAME, "form_ISWL:ax2PremiumInformation_iswl:firstPremiunCheck_CB", validateInput(strHashValue), "In lieu of voided check, use first premium check to set up Systematic Payment Plan", currentScreen);
									break;
								
								case"Q6_RIDER":
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_ISWL:ax2Riders_iswl:Rider_DD", validateInput(strHashValue), "Rider:", currentScreen);
									break;
								case"AMOUNT":
									blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_ISWL:ax2Riders_iswl:RiderAmount_EF", validateInput(strHashValue), "Amount:", currentScreen);
									break;
								case"UNBORN_CHILD":
									blnStatus = setValue(WebControl.CHECKBOX, IdentifyBy.NAME, "form_ISWL:ax2Riders_iswl:UnbornChildLabel_CB", validateInput(strHashValue), "Unborn Child", currentScreen);
									break;
								case"ADD":
									blnStatus = setValue(WebControl.BUTTON, IdentifyBy.NAME, "form_ISWL:ax2Riders_iswl:pinsPlanInfoAdd1_CButton", validateInput(strHashValue), "ADD", currentScreen);
									break;
								case"BENEFIT":
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_ISWL:ax2Benefits_iswl:benefit_DD", validateInput(strHashValue), "Benefit:", currentScreen);
									
									break;
								case"BENEFIT_AMOUNT":
									blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_ISWL:ax2Benefits_iswl:BenefitAmount_EF", validateInput(strHashValue), "Amount:", currentScreen);
									break;
								case"BENEFIT_PERCENTAGE":
									blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_ISWL:ax2Benefits_iswl:BenefitPercentage_EF", validateInput(strHashValue), "Percentage:", currentScreen);
									break;
								case"BENEFIT_ACCUMULATION":
									blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_ISWL:ax2Benefits_iswl:Accumulation_EF", validateInput(strHashValue), "Accumulation% :", currentScreen);
									break;
								case"BENEFIT_ADD":
									blnStatus = setValue(WebControl.BUTTON, IdentifyBy.NAME, "form_ISWL:ax2Benefits_iswl:pinsPlanInfoAdd_CButton", validateInput(strHashValue), "BENEFIT_ADD", currentScreen);
									break;
							
									
								case"AUTOMATIC_PREMIUM_LOAN_OPTION":
									blnStatus = setValue(WebControl.CHECKBOX, IdentifyBy.NAME, "form_ISWL:ax2AutomaticPremiumLoan:ax2_automaticPremLoanCB", validateInput(strHashValue), "Automatic Premium Loan Option", currentScreen);
								
									break;
								case "default1":
									ReportGenerator.generateTestStep(false, currentScreen, "Field Navigation", strHashKey + " field not available in the current method.", false);
									break;
								
								} //end of switch
								if(!blnStatus) break;
							} //end of while
						}
						else {
							ReportGenerator.generateTestStep(false, currentScreen, "Switch to Frame", "Failed to switch frames " + strFrames.replaceAll(GlobalData.STRING_SEPARATOR, " > "), false);
							blnStatus = false;
						}
						objEnum = null;
							
					} catch(Exception objExp) {
						ReportGenerator.generateTestStep(false, currentScreen, "Exception occured", "Exception is - " + objExp.getMessage(), false);
						blnStatus = false;
					}
					return blnStatus;
				}
				
				
				//Function For Products-TERM flow
				private static boolean ProductsTERM(OrderedHashtable objTestData) {
					boolean blnStatus = false;
					String strHashKey = "", strHashValue = "";
					try {
						String strFrames = "mainContentFrame" + GlobalData.STRING_SEPARATOR + "contentRightFrame" + GlobalData.STRING_SEPARATOR + "file"+ GlobalData.STRING_SEPARATOR + "file";;
						Enumeration objEnum = objTestData.enumerateKeys();
						if(switchToFrame(strFrames, false) && waitForPageLoad(MAX_TIMEOUT)) {
							
							while(objEnum.hasMoreElements()) {
								//blnStatus = false;
								strHashKey = objEnum.nextElement().toString();
								strHashValue = objTestData.get(strHashKey).toString();

								switch(strHashKey) {
		

								/*case"PRODUCT_NAME":
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_AthenaIndexedUniversalLife:planInformation:productName_DD", validateInput(strHashValue), "1. Product Name:", currentScreen);
								break;
								case"AMOUNT_OF_INSURANCE":
									blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_AthenaIndexedUniversalLife:planInformation:AmountOfInsurance", validateInput(strHashValue), "2. Amount of Insurance:", currentScreen);
									break;*/
								
								case"IS_TERM_CONVERSION":
									blnStatus = setValue(WebControl.CHECKBOX, IdentifyBy.NAME, "form_ax2Products:ax2ApplicationInformation:FaxedEmailedApp_CB", validateInput(strHashValue), "Is this a Term Conversion or Purchase Option ?", currentScreen);
									break;
								case"Q3_BACKDATE_TO_SAVE_AGE":
									blnStatus = setValue(WebControl.CHECKBOX, IdentifyBy.NAME, "form_ax2Products:ax2ApplicationInformation:termConversion_CB", validateInput(strHashValue), " Backdate to save age", currentScreen);
									break;
									
								
								case"Q4A_PAYMENT_MODE":
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_ax2Products:ax2PremiumAndCoverageInfo:paymentMode_DD", validateInput(strHashValue), "4a. Payment Mode:", currentScreen);
									break;
								case"Q4B_METHOD_OF_PAYMENT":
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_ax2Products:ax2PremiumAndCoverageInfo:methodOfPayment_DD", validateInput(strHashValue), "4b. Method of Payment:", currentScreen);
									waitForPageLoad(MIN_TIMEOUT);
									break;
								case"PRODUCT_ALLOTMENT":
									blnStatus = setValue(WebControl.BUTTON, IdentifyBy.NAME, "form_ax2Products:ax2PremiumAndCoverageInfo:methodOfPayment_CButton", validateInput(strHashValue), "PRODUCT_ALLOTMENT", currentScreen);
									break;
								case"REGISTER_DATE_REASON":
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_ax2Products:ax2PremiumAndCoverageInfo:registerDateReason_DD", validateInput(strHashValue), "Register Date Reason", currentScreen);
									break;
								case"REGISTER_DATE":
									blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_ax2Products:ax2PremiumAndCoverageInfo:startDate_EF", validateInput(strHashValue), "Register Date:", currentScreen);
									break;
								
								
								
								case"RIDER":
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_ax2Products:ax2OptionalBenefits:Rider_DD", validateInput(strHashValue), "Rider:", currentScreen);
									break;
								case"AMOUNT":
									blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_ax2Products:ax2OptionalBenefits:RiderAmount_EF", validateInput(strHashValue), "Amount:", currentScreen);
									break;
								case"UNBORN_CHILD":
									blnStatus = setValue(WebControl.CHECKBOX, IdentifyBy.NAME, "form_ax2Products:ax2OptionalBenefits:UnbornChildLabel_CB", validateInput(strHashValue), "Unborn Child", currentScreen);
									break;
								case"ADD":
									blnStatus = setValue(WebControl.BUTTON, IdentifyBy.NAME, "form_ax2Products:ax2OptionalBenefits:pinsPlanInfoAdd1_CButton", validateInput(strHashValue), "ADD", currentScreen);
									break;
								case"Products_CLR":
									blnStatus = setValue(WebControl.BUTTON, IdentifyBy.XPATH, "//input[contains(@name,'beneficairy_CButton')]", validateInput(strHashValue), "CLR_IPOPUP", currentScreen);
									
									break;
								case"BENEFIT":
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_ax2Products:ax2OptionalBenefits:benefit_DD", validateInput(strHashValue), "Benefit:", currentScreen);
									
									break;
								case"BENEFITAMOUNT":
									blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_ax2Products:ax2OptionalBenefits:BenefitAmount_EF", validateInput(strHashValue), "Amount:", currentScreen);
									break;
								case"BENEFIT_PERCENTAGE":
									blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_ax2Products:ax2OptionalBenefits:BenefitPercentage_EF", validateInput(strHashValue), "Percentage:", currentScreen);
									break;
								case"BENEFIT_ACCUMULATION":
									blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_ax2Products:ax2OptionalBenefits:Accumulation_EF", validateInput(strHashValue), "Accumulation% :", currentScreen);
									break;
								case"BENEFIT_ADD":
									blnStatus = setValue(WebControl.BUTTON, IdentifyBy.NAME, "form_ax2Products:ax2OptionalBenefits:pinsPlanInfoAdd_CButton", validateInput(strHashValue), "BENEFIT_ADD", currentScreen);
									break;
								case "default1":
									ReportGenerator.generateTestStep(false, currentScreen, "Field Navigation", strHashKey + " field not available in the current method.", false);
									break;
							
								
								
								} //end of switch
								if(!blnStatus) break;
							} //end of while
						}
						else {
							ReportGenerator.generateTestStep(false, currentScreen, "Switch to Frame", "Failed to switch frames " + strFrames.replaceAll(GlobalData.STRING_SEPARATOR, " > "), false);
							blnStatus = false;
						}
						objEnum = null;
							
					} catch(Exception objExp) {
						ReportGenerator.generateTestStep(false, currentScreen, "Exception occured", "Exception is - " + objExp.getMessage(), false);
						blnStatus = false;
					}
					return blnStatus;
				}
				
				//Function For Products ASUL flow
				private static boolean ProductsASUL(OrderedHashtable objTestData) {
					boolean blnStatus = false;
					String strHashKey = "", strHashValue = "";
					try {
						String strFrames = "mainContentFrame" + GlobalData.STRING_SEPARATOR + "contentRightFrame" + GlobalData.STRING_SEPARATOR + "file"+ GlobalData.STRING_SEPARATOR + "file";;
						Enumeration objEnum = objTestData.enumerateKeys();
						if(switchToFrame(strFrames, false) && waitForPageLoad(MAX_TIMEOUT)) {
							
							while(objEnum.hasMoreElements()) {
								//blnStatus = false;
								strHashKey = objEnum.nextElement().toString();
								strHashValue = objTestData.get(strHashKey).toString();

								switch(strHashKey) {
							
								case"PRODUCT_NAME":
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.XPATH, "//select[contains(@name,'productName_DD')]", validateInput(strHashValue), "1. Product Name:", currentScreen);
								break;
								case"AMOUNT_OF_INSURANCE":
									blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.XPATH, "//input[contains(@name,'AmountOfInsurance')]", validateInput(strHashValue), "2. Amount of Insurance:", currentScreen);
									break;
								case"IS_TERM_CONVERSION":
									blnStatus = setValue(WebControl.CHECKBOX, IdentifyBy.XPATH, "//input[contains(@name,'termConversion_CB')]", validateInput(strHashValue), "Is this a Term Conversion or Purchase Option ?", currentScreen);
									break;
								
								case"BACKDATE_TO_SAVE_AGE_PROPOSED_INSURED_1":
									blnStatus = setValue(WebControl.CHECKBOX, IdentifyBy.XPATH, "//input[contains(@name,'backDate_CB1')]", validateInput(strHashValue), "PROPOSED_INSURED_1", currentScreen);
									break;
								case"BACKDATE_TO_SAVE_AGE_PROPOSED_INSURED_2":
									blnStatus = setValue(WebControl.CHECKBOX, IdentifyBy.XPATH, "//input[contains(@name,'backDate_CB2')]", validateInput(strHashValue), "PROPOSED_INSURED_2", currentScreen);
									break;
						
								case"DEATH_BENEFIT_OPTION":
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.XPATH, "//select[contains(@name,'deathBenefitOption_DD')]", validateInput(strHashValue), "4. Death Benefit Option:", currentScreen);
									break;
								
								case"Q6A_PREMIUM_AMOUNT":
									blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.XPATH, "//input[contains(@name,'premiumAmount_EF')]", validateInput(strHashValue), "6a. Premium Amount:", currentScreen);
									break;
								case"Q6A_INITIAL_PREMIUM":
									blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.XPATH, "//input[contains(@name,'initialPremium_EF')]", validateInput(strHashValue), "6b. Initial Premium:", currentScreen);
									break;
								case"Q7A_PAYMENT_MODE":
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.XPATH, "//select[contains(@name,'paymentMode_DD')]", validateInput(strHashValue), "7a. Payment Mode::", currentScreen);
									break;
								case"Q7B_METHOD_OF_PAYMENT":
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.XPATH, "//select[contains(@name,'methodOfPayment_DD')]", validateInput(strHashValue), "7b./7c. Method of Payment:", currentScreen);
									waitForPageLoad(MIN_TIMEOUT);
									break;
								case"REGISTER_DATE_REASON":
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.XPATH, "//select[contains(@name,'registerDateReason_DD')]", validateInput(strHashValue), "Register Date Reason", currentScreen);
									break;
								case"REGISTER_DATE":
									blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.XPATH, "//input[contains(@name,'startDate_EF')]", validateInput(strHashValue), "Register Date:", currentScreen);
									break;
								case"PREMIUM_DRAFT_ON":
									blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.XPATH, "//input[contains(@name,'draftOn_EF')]", validateInput(strHashValue), "Draft On", currentScreen);
									break;
								case"IN_LIEU_VOIDED_CHECK":
									blnStatus = setValue(WebControl.CHECKBOX, IdentifyBy.XPATH, "//input[contains(@name,'firstPremiunCheck_CB')]", validateInput(strHashValue), "In lieu of voided check, use first premium check to set up Systematic Payment Plan", currentScreen);
									break;
									
								case"Q7D_SINGLE_PAYMENT":
									
									blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.XPATH, "//input[contains(@name,'singlePayment_EF')]", validateInput(strHashValue), "7d. Single Payment:", currentScreen);			
									break;
					
								case"RIDER":
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.XPATH, "//select[contains(@name,'Rider_DD')]", validateInput(strHashValue), "Rider:", currentScreen);
									break;
								case"AMOUNT":
									blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.XPATH, "//input[contains(@name,'RiderAmount_EF')]", validateInput(strHashValue), "Amount:", currentScreen);
									break;
								case"UNBORN_CHILD":
									blnStatus = setValue(WebControl.CHECKBOX, IdentifyBy.XPATH, "//input[contains(@name,'UnbornChildLabel_CB')]", validateInput(strHashValue), "Unborn Child", currentScreen);
									break;
								case"ADD":
									blnStatus = setValue(WebControl.BUTTON, IdentifyBy.XPATH, "//input[contains(@name,'pinsPlanInfoAdd1_CButton')]", validateInput(strHashValue), "ADD", currentScreen);
									break;
								case"BENEFIT":
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.XPATH, "//select[contains(@name,'benefit_DD')]", validateInput(strHashValue), "Benefit:", currentScreen);
									
									break;
								case"BENEFITAMOUNT":
									blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.XPATH, "//input[contains(@name,pinsPlanInfoAdd_CButton')]", validateInput(strHashValue), "Amount:", currentScreen);
									break;
								case"BENEFIT_PERCENTAGE":
									blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.XPATH, "//input[contains(@name,'BenefitPercentage_EF')]", validateInput(strHashValue), "Percentage:", currentScreen);
									break;
								case"BENEFIT_ACCUMULATION":
									blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.XPATH, "//input[contains(@name,'Accumulation_EF')]", validateInput(strHashValue), "Accumulation% :", currentScreen);
									break;
								case"BENEFIT_ADD":
									blnStatus = setValue(WebControl.BUTTON, IdentifyBy.XPATH, "//input[contains(@name,'pinsPlanInfoAdd_CButton')]", validateInput(strHashValue), "BENEFIT_ADD", currentScreen);
									break;
									
								
								case"SUIT_RECEIVED_PROSPECTUS_POLICY":   
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.XPATH, "//span[contains(text(),'applied')]/../..//select", validateInput(strHashValue), "RECEIVED_PROSPECTUS_POLICY", currentScreen);
							      //blnStatus = setValue(WebControl.SELECT, IdentifyBy.XPATH, "//table[@id='form_UlSuitability:ILLegacySuitabilityQuestionsTablePane1']//tr[1]/td/select", validateInput(strHashValue), "RECEIVED_PROSPECTUS_POLICY", currentScreen);
									break;
								case"SUIT_RECEIVED_PROSPECTUS_COMPANY":                           
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.XPATH, "//span[contains(text(),'company(ies)')]/../..//select", validateInput(strHashValue), "RECEIVED_PROSPECTUS_COMPANY", currentScreen);
									break;
								case"SUIT_UNDERSTAND_DEDUCTION_CHARGES":
									blnStatus = setValue(WebControl.SELECT,IdentifyBy.XPATH, "//span[contains(text(),'reduction')]/../..//select", validateInput(strHashValue), "UNDERSTAND_DEDUCTION_CHARGES", currentScreen);
									break;
								case"SUIT_FINANCIAL_NEEDS":
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.XPATH, "//span[contains(text(),'anticipated')]/../..//select", validateInput(strHashValue), "FINANCIAL_NEEDS", currentScreen);
									break;
											
								case"SUIT_Q9D":
									blnStatus = setValue(WebControl.CHECKBOX, IdentifyBy.XPATH, "//input[contains(@name,'suitability_RB')]", validateInput(strHashValue), "Q9D", currentScreen);
									break;
								case"PRODUCT":
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.XPATH, "//select[contains(@name,'Initial_Allocbenefit_DD')]", validateInput(strHashValue), "PRODUCT", currentScreen);
									break;
								case"PRODCUT_ALLOCATION":
									blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.XPATH, "//input[contains(@name,'Initial_AllocBenefitPercentage_EF')]", validateInput(strHashValue), "Q9D", currentScreen);
									break;
								case"PRODCUT_DEDUCTION":
									blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.XPATH, "//input[contains(@name,'Initial_AllocBenefitAmount_EF')]", validateInput(strHashValue), "Q9D", currentScreen);
									break;
								case"ADD_PROD":
									blnStatus = setValue(WebControl.BUTTON, IdentifyBy.XPATH, "//input[contains(@name,'Initial_AllocpinsPlanInfoAdd_CButton')]", validateInput(strHashValue), "ADD ANOTHER", currentScreen);
									break;
								case"ADD_ANOTHER_INSURED":
									blnStatus = setValue(WebControl.BUTTON, IdentifyBy.XPATH, "//input[contains(@name,'addAnotherProposedInsured2')]", validateInput(strHashValue), "ADD ANOTHER", currentScreen);
									break;
								case"P2_FIRST_NAME": 									   
									blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.XPATH, "//input[contains(@name,'pInsured1First_EF')]", validateInput(strHashValue), "First Name", currentScreen);
									break;
									
								case"P2_LAST_NAME":
									blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.XPATH, "//input[contains(@name,'pInsured1Last_EF')]", validateInput(strHashValue), "Last Name", currentScreen);
									break;
									
								case"P2_SSN":
									blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.XPATH, "//input[contains(@name,'pInsured1ssn_EF')]", validateInput(strHashValue), "SSN", currentScreen);
									break;
									
								case"P2_GENDER":
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.XPATH, "//select[contains(@name,'pInsured1Gender_DD')]", validateInput(strHashValue), "GENDER", currentScreen);
									break;
									
								case"P2_OWNER":
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.XPATH, "//select[contains(@name,'OtherOwnerNumber5_CB')]", validateInput(strHashValue), "4. Proposed Insured 2 an owner ?", currentScreen);
									break;
									
								case"ADDRESS_P1":
									blnStatus = setValue(WebControl.CHECKBOX, IdentifyBy.XPATH, "//input[contains(@name,'SameAddress_CB')]", validateInput(strHashValue), "Address same as Proposed Insured 1", currentScreen);
									break;
									
								case"PO_BOX_ADDRESS":
									blnStatus = setValue(WebControl.CHECKBOX, IdentifyBy.XPATH, "//input[contains(@name,'poBox_CB')]", validateInput(strHashValue), "P.O Box Address", currentScreen);
									break;
									
								case"ADDRESS_TYPE":
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.XPATH, "//select[contains(@name,'addressType_DD')]", validateInput(strHashValue), "Address Type:", currentScreen);
									break;
									
								case"STREET_NO":
									blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.XPATH, "//input[contains(@name,'street_EF')]", validateInput(strHashValue), "No. & Street", currentScreen);
									break;
									
								case"BUILDING_APT_SUITE":
									blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.XPATH, "//input[contains(@name,'BldAptSuite_EF')]", validateInput(strHashValue), "Bldg/Apt/Suite", currentScreen);
									break;
									
								case"CITY":
									blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.XPATH, "//input[contains(@name,'pInsured1City_EF')]", validateInput(strHashValue), "CITY", currentScreen);
									break;
								case"COUNTY":
									blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.XPATH, "//input[contains(@name,'pInsured1County_EF')]", validateInput(strHashValue), "COUNTY", currentScreen);
									break;
								case"STATE":
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.XPATH, "//select[contains(@name,'pInsured1State_DD')]", validateInput(strHashValue), "STATE", currentScreen);
									break;
								case"ZIP":
									blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.XPATH, "//input[contains(@name,'pInsured1Zip_EF')]", validateInput(strHashValue), "ZIP", currentScreen);
									break;
								case"COUNTRY":
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.XPATH, "//select[contains(@name,'pInsured1Country_DD')]", validateInput(strHashValue), "COUNTRY", currentScreen);
									break;
								case"ADDRESS_ADD":
									blnStatus = setValue(WebControl.BUTTON, IdentifyBy.XPATH, "//input[contains(@name,'pInsured1AddInfoAdd_CButton')]", validateInput(strHashValue), "ADD", currentScreen);
									break;
								case"US_CITIZEN":
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.XPATH, "//select[contains(@name,'pInsured1Citizen_DD')]", validateInput(strHashValue), "U.S Citizen ?", currentScreen);
									break;
								case"DOB":
									blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.XPATH, "//input[contains(@name,'pInsured2DOB_EF')]", validateInput(strHashValue), "Date Of Birth:", currentScreen);
									break;
								case"BIRTH_COUNTRY":
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.XPATH, "//select[contains(@name,'pInsured1BirthCountry_DD')]", validateInput(strHashValue), "10. Birthplace Country:", currentScreen);
									break;
								case"BIRTH_STATE":
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.XPATH, "//select[contains(@name,'lifeBirthState_DD')]", validateInput(strHashValue), "Birthplace State:", currentScreen);
									break;
								case"DRIVER_LICENSE":
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.XPATH, "//select[contains(@name,'pInsured1licence_DD')]", validateInput(strHashValue), " Do you have a driver's license?", currentScreen);
									break;
								case"LICENSE_NUMBER":                                          
									blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.XPATH, "//input[contains(@name,'pInsured1licNumber_EF')]", validateInput(strHashValue), "License Number:", currentScreen);
									break;
								case"STATE_ISSUE":
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.XPATH, "//select[contains(@name,'pInsured1licenseState_DD')]", validateInput(strHashValue), "State of Issue:", currentScreen);
									break;
								case"EXPIRY_DATE":
									blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.XPATH, "//input[contains(@name,'pInsured1ExpDateLic_EF')]", validateInput(strHashValue), "Expiration date: ", currentScreen);
									break;
								case"CURRENTLY_EMPLOYED":
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.XPATH, "//select[contains(@name,'pInsured1Employer_DD')]", validateInput(strHashValue), "13. Currently Employed:", currentScreen);
									
									break;
								case"P2_EARNED_INCOME":
									blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.XPATH, "//input[contains(@name,'grossEarnedIncomePI1_EF')]", validateInput(strHashValue), "Gross Earned Annual Income:", currentScreen);
									break;
								case"P2_HOUSEHOLD_INCOME":
									blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.XPATH, "//input[contains(@name,'grossHouseIncomePI1_EF')]", validateInput(strHashValue), "Gross Annual Household Income:", currentScreen);
									break;
								case"P2_UNEARNED_INCOME":
									blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.XPATH, "//input[contains(@name,'grossUnearnedIncomePI1_EF')]", validateInput(strHashValue), "Gross Unearned Annual Income:", currentScreen);
									break;
								case"P2_NET_WORTH":
									blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.XPATH, "//input[contains(@name,'totalNetworthPI1_EF')]", validateInput(strHashValue), "Total Net Worth:", currentScreen);
									break;
								case"BANKRUPTCY":
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.XPATH, "//select[contains(@name,'bankruptcyDetailsQuestionsTablePane:0:Q61bAns_DD')]", validateInput(strHashValue), "Question :18", currentScreen);
									break;
								case"PERSONAL":
									blnStatus = setValue(WebControl.BUTTON, IdentifyBy.XPATH, "//input[contains(@name,'personalInfo_CButton')]", validateInput(strHashValue), "PERSONAL", currentScreen);
									break;
								case"BUSINESS":
									blnStatus = setValue(WebControl.BUTTON, IdentifyBy.XPATH, "//input[contains(@name,'businessInfo_CButton')]", validateInput(strHashValue), "BUSINESS", currentScreen);
									break;
								case"Q21A":
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.XPATH, "//select[contains(@name,'otherInsuranceQuestionsTablePane:0:Q55Ans_DD')]", validateInput(strHashValue), "Question :21a", currentScreen);
									break;
								case"Q21B":
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.XPATH, "//select[contains(@name,'otherInsuranceQuestionsTablePane:1:Q55Ans_DD')]", validateInput(strHashValue), "Question :21b", currentScreen);
									break;
								case"Q21C":
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.XPATH, "//select[contains(@name,'otherInsuranceQuestionsTablePane:2:Q55Ans_DD')]", validateInput(strHashValue), "Question :21c", currentScreen);
									break;
								case"Q21D":
									blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.XPATH, "//input[contains(@name,'pendingInsuranceAmountProposedInsured1_EF')]", validateInput(strHashValue), "Total Amount", currentScreen);
									break;
								case"COMPANY_NAME":
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.XPATH, "//select[contains(@name,'otherInsuranceCompanyName_DD')]", validateInput(strHashValue), "Name of Company:", currentScreen);
									break;
								case"FACE_AMOUNT_RIDERS":
									blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.XPATH, "//input[contains(@name,'OtherInsuranceInfo:faceAmountRider_EF')]", validateInput(strHashValue), "Face Amount plus Riders:", currentScreen);
									break;
								case"YEAR_ISSUED":
									blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.XPATH, "//input[contains(@name,'OtherInsuranceInfo:yearIssued_EF')]", validateInput(strHashValue), "Year Issued:", currentScreen);
									break;
								case"POLICY_CONTRACT":
									blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.XPATH, "//input[contains(@name,'OtherInsuranceInfo:contractNumber_EF')]", validateInput(strHashValue), "Policy / Contract #:", currentScreen);
									break;
								case"POLICY_CONTRACT_TYPE":
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.XPATH, "//select[contains(@name,'OtherInsuranceInfo:lifeProposedInsurance_EF')]", validateInput(strHashValue), "Policy/Contract Type:", currentScreen);
									break;
								case"TO_BE_REPLACED":
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.XPATH, "//select[contains(@name,'replacedOrEffected_DD')]", validateInput(strHashValue), "To be replaced changed or affected?", currentScreen);
									break;
								case"1035_EXCHANGE":
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.XPATH, "//select[contains(@name,'exchangeQuestion_DD')]", validateInput(strHashValue), "1035 Exchange?", currentScreen);
									break;
								case"PRODUCT_TYPE":
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.XPATH, "//select[contains(@name,'ProductType_DD')]", validateInput(strHashValue), "Product Type:", currentScreen);
									break;
								case"INSURANCE_ADD":
									blnStatus = setValue(WebControl.BUTTON, IdentifyBy.XPATH, "//input[contains(@name,'pendingInsuranceTableAdd_Button')],", validateInput(strHashValue), "ADD", currentScreen);
									break;
								case"Q22":
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.XPATH, "//select[contains(@name,'tobaccoalchoholQuestionsTablePane:0:Q22Ans_DD')]", validateInput(strHashValue), "Question :22", currentScreen);
									break;
								case"Q23":
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.XPATH, "//select[contains(@name,'tobaccoalchoholQuestionsTablePane:1:Q22Ans_DD')]", validateInput(strHashValue), "Question :23", currentScreen);
									break;
								case"Q24":
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.XPATH, "//select[contains(@name,'tobaccoalchoholQuestionsTablePane:2:Q22Ans_DD')]", validateInput(strHashValue), "Question :24", currentScreen);
									break;
								case"Q25":
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.XPATH, "//select[contains(@name,'tobaccoalchoholQuestionsTablePane:3:Q22Ans_DD')]", validateInput(strHashValue), "Question :25", currentScreen);
									break;
								case"Q26":
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.XPATH, "//select[contains(@name,'tobaccoalchoholQuestionsTablePane:4:Q22Ans_DD')]", validateInput(strHashValue), "Question :26", currentScreen);
									break;
								case"Q27":
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.XPATH, "//select[contains(@name,'tobaccoalchoholQuestionsTablePane:5:Q22Ans_DD')]", validateInput(strHashValue), "Question :27", currentScreen);
									break;
								case"Q28":
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.XPATH, "//select[contains(@name,'tobaccoalchoholQuestionsTablePane:6:Q22Ans_DD')]", validateInput(strHashValue), "Question :28", currentScreen);
									break;
								case"Q29A":
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.XPATH, "//select[contains(@name,'tobaccoalchoholQuestionsTablePane:7:Q22Ans_DD')]", validateInput(strHashValue), "Question :29a", currentScreen);
									break;
								case"Q29B":
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.XPATH, "//select[contains(@name,'tobaccoalchoholQuestionsTablePane:8:Q22Ans_DD')]", validateInput(strHashValue), "Question :29b", currentScreen);
									break;
								case"Q30":
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.XPATH, "//select[contains(@name,'tobaccoalchoholQuestionsTablePane:9:Q22Ans_DD')]", validateInput(strHashValue), "Question :30", currentScreen);
									break;
								case"Q31":
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.XPATH, "//select[contains(@name,'tobaccoalchoholQuestionsTablePane:0:Q31Ans_DD')]", validateInput(strHashValue), "Question :31", currentScreen);
									break;
								case"Q32":
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.XPATH, "//select[contains(@name,'tobaccoalchoholQuestionsTablePane:1:Q31Ans_DD')]", validateInput(strHashValue), "Question :32", currentScreen);
									break;
								case"ANOTHER_COMPANY":
									
									blnStatus = setValue(WebControl.CHECKBOX, IdentifyBy.XPATH, "//input[contains(@name,'MedicalCertification:Q57_CB')]", validateInput(strHashValue), "Is another company exam being used?", currentScreen);
									break;
								case"Q33":
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.XPATH, "//select[contains(@name,'MedicalCertification:nameOfCompany_DD')]", validateInput(strHashValue), "33. Name of Insurance Company:", currentScreen);
									break;
								case"DATE_OF_EXAM":
									blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.XPATH, "//input[contains(@name,'MedicalCertification:dateOfExam_EF')]", validateInput(strHashValue), "Date of Exam", currentScreen);
									break;
								case"Q34":
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.XPATH, "//select[contains(@name,'MedicalCertification:medicalCertificationQuestionsTablePane:0:aeMedicalCertificationQuestionsQAns')]", validateInput(strHashValue), "Question :34", currentScreen);
									break;
								case"Q35":
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.XPATH, "//select[contains(@name,'MedicalCertification:medicalCertificationQuestionsTablePane:1:aeMedicalCertificationQuestionsQAns')]", validateInput(strHashValue), "Question :35", currentScreen);
									break;
								case"Q36":
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.XPATH, "//select[contains(@name,'MoneyPaid:tobaccoalchoholQuestionsTablePane:0:Q22Ans_DD')]", validateInput(strHashValue), "Question :36", currentScreen);
									break;
									
								case"Q37":
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.XPATH, "//select[contains(@name,'MoneyPaid:tobaccoalchoholQuestionsTablePane:1:Q22Ans_DD')]", validateInput(strHashValue), "Question :37", currentScreen);
									break;
								case"Q38":
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.XPATH, "//select[contains(@name,'MoneyPaid:tobaccoalchoholQuestionsTablePane:2:Q22Ans_DD')]", validateInput(strHashValue), "Question :38", currentScreen);
									break;
								case"Q39":
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.XPATH, "//select[contains(@name,'MoneyPaid:tobaccoalchoholQuestionsTablePane:3:Q22Ans_DD')]", validateInput(strHashValue), "Question :39", currentScreen);
									break;
								case"Q40":													  
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.XPATH, "//select[contains(@name,'MoneyPaid:tobaccoalchoholQuestionsTablePane:4:Q22Ans_DD')]", validateInput(strHashValue), "Question :40", currentScreen);
									break;
								case"Q41":													  
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.XPATH, "//select[contains(@name,'MoneyPaid:tobaccoalchoholQuestionsTablePane:5:Q22Ans_DD')]", validateInput(strHashValue), "Question :41", currentScreen);
									break;
								case"REMARKS":
									blnStatus = setValue(WebControl.CHECKBOX, IdentifyBy.XPATH, "//input[contains(@name,'MoneyPaid:otherDetail_RB')]", validateInput(strHashValue), "Remarks section ", currentScreen);
									break;
								case "default1":
									ReportGenerator.generateTestStep(false, currentScreen, "Field Navigation", strHashKey + " field not available in the current method.", false);
									break;
								} //end of switch
								if(!blnStatus) break;
							} //end of while
						}
						else {
							ReportGenerator.generateTestStep(false, currentScreen, "Switch to Frame", "Failed to switch frames " + strFrames.replaceAll(GlobalData.STRING_SEPARATOR, " > "), false);
							blnStatus = false;
						}
						objEnum = null;
							
					} catch(Exception objExp) {
						ReportGenerator.generateTestStep(false, currentScreen, "Exception occured", "Exception is - " + objExp.getMessage(), false);
						blnStatus = false;
					}
					return blnStatus;
				}
				
				private static boolean ProductsSILLegacy(OrderedHashtable objTestData) {
					boolean blnStatus = false;
					String strHashKey = "", strHashValue = "";
					try {
						String strFrames = "mainContentFrame" + GlobalData.STRING_SEPARATOR + "contentRightFrame" + GlobalData.STRING_SEPARATOR + "file"+ GlobalData.STRING_SEPARATOR + "file";;
						Enumeration objEnum = objTestData.enumerateKeys();
						if(switchToFrame(strFrames, false) && waitForPageLoad(MAX_TIMEOUT)) {
							
							while(objEnum.hasMoreElements()) {
								//blnStatus = false;
								strHashKey = objEnum.nextElement().toString();
								strHashValue = objTestData.get(strHashKey).toString();

								switch(strHashKey) {
								case"AMOUNT_OF_INSURANCE":										  				   
									blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_ax2SILLegacy:planInformation:AmountOfInsurance", validateInput(strHashValue), "2. Amount of Insurance:", currentScreen);
									break;
								case"IS_TERM_CONVERSION":
									blnStatus = setValue(WebControl.CHECKBOX, IdentifyBy.NAME, "form_ax2SILLegacy:planInformation:termConversion_CB", validateInput(strHashValue), "Is this a Term Conversion or Purchase Option ?", currentScreen);
									break;
								case"DEATH_BENEFIT_OPTION":									  
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_ax2SILLegacy:planInformation:deathBenefitOption_DD", validateInput(strHashValue), "4. Death Benefit Option:", currentScreen);
									break;
								case"BACKDATE_TO_SAVE_AGE_PROPOSED_INSURED_1":
									blnStatus = setValue(WebControl.CHECKBOX, IdentifyBy.NAME, "form_ax2SILLegacy:planInformation:backDate_CB1", validateInput(strHashValue), "PROPOSED_INSURED_1", currentScreen);
									break;
								case"BACKDATE_TO_SAVE_AGE_PROPOSED_INSURED_2":
									blnStatus = setValue(WebControl.CHECKBOX, IdentifyBy.NAME, "form_ax2SILLegacy:planInformation:backDate_CB2", validateInput(strHashValue), "PROPOSED_INSURED_2", currentScreen);
									break;
								case"Q6A_PREMIUM_AMOUNT":
									blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_ax2SILLegacy:premiumInformation:premiumAmount_EF", validateInput(strHashValue), "6a. Premium Amount:", currentScreen);
									break;
								case"Q6B_INITIAL_PREMIUM":
									blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_ax2SILLegacy:premiumInformation:initialPremium_EF", validateInput(strHashValue), "6b. Initial Premium:", currentScreen);
									break;
								case"Q7A_PAYMENT_MODE":
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_ax2SILLegacy:premiumInformation:paymentMode_DD", validateInput(strHashValue), "7a. Payment Mode::", currentScreen);
									break;
								case"Q7BC_METHOD_OF_PAYMENT":
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_ax2SILLegacy:premiumInformation:methodOfPayment_DD", validateInput(strHashValue), "7b./7c. Method of Payment:", currentScreen);
									waitForPageLoad(MIN_TIMEOUT);
									break;
								case"REGISTER_DATE_REASON":
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_ax2SILLegacy:premiumInformation:registerDateReason_DD", validateInput(strHashValue), "Register Date Reason", currentScreen);
									break;
								case"REGISTER_DATE":
									blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_ax2SILLegacy:premiumInformation:startDate_EF", validateInput(strHashValue), "Register Date:", currentScreen);
									break;
								case"PREMIUM_DRAFT_ON":
									blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_ax2SILLegacy:premiumInformation:draftOn_EF", validateInput(strHashValue), "Draft On", currentScreen);
									break;
								case"IN_LIEU_VOIDED_CHECK":
									blnStatus = setValue(WebControl.CHECKBOX, IdentifyBy.NAME, "form_ax2SILLegacy:premiumInformation:firstPremiunCheck_CB", validateInput(strHashValue), "In lieu of voided check, use first premium check to set up Systematic Payment Plan", currentScreen);
									break;
									
								case"Q7D_SINGLE_PAYMENT":
									
									blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_ax2SILLegacy:premiumInformation:singlePayment_EF", validateInput(strHashValue), "7d. Single Payment:", currentScreen);			
									break;
					
								case"RIDER":
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_ax2SILLegacy:axaRiders:Rider_DD", validateInput(strHashValue), "Rider:", currentScreen);
									break;
								case"AMOUNT":
									blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_ax2SILLegacy:axaRiders:RiderAmount_EF", validateInput(strHashValue), "Amount:", currentScreen);
									break;
								case"UNBORN_CHILD":
									blnStatus = setValue(WebControl.CHECKBOX, IdentifyBy.NAME, "form_ax2SILLegacy:axaRiders:UnbornChildLabel_CB", validateInput(strHashValue), "Unborn Child", currentScreen);
									break;
								case"ADD":										
									blnStatus = setValue(WebControl.BUTTON, IdentifyBy.NAME, "form_ax2SILLegacy:axaRiders:pinsPlanInfoAdd1_CButton", validateInput(strHashValue), "ADD", currentScreen);
									break;
								case"BENEFIT":
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_ax2SILLegacy:axaBenefits:benefit_DD", validateInput(strHashValue), "Benefit:", currentScreen);
									break;
								case"BENEFIT_AMOUNT":
									blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_ax2SILLegacy:axaBenefits:BenefitAmount_EF", validateInput(strHashValue), "Amount:", currentScreen);
									break;
								case"BENEFIT_PERCENTAGE":
									blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_ax2SILLegacy:axaBenefits:BenefitPercentage_EF", validateInput(strHashValue), "Percentage:", currentScreen);
									break;
								case"BENEFIT_ACCUMULATION":
									blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_axSILLegacy:axaBenefits:Accumulation_EF", validateInput(strHashValue), "Accumulation% :", currentScreen);
									break;
								case"BENEFIT_ADD":
									blnStatus = setValue(WebControl.BUTTON, IdentifyBy.NAME, "form_ax2SILLegacy:axaBenefits:pinsPlanInfoAdd_CButton", validateInput(strHashValue), "BENEFIT_ADD", currentScreen);
									break;
								case "Q9A1":
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_ax2SILLegacy:subView_Suitability:tobaccoalchoholQuestionsTablePane:0:Q55Ans_DD", validateInput(strHashValue), "Question 9A1", currentScreen);
									break;
								case "Q9A2":
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_ax2SILLegacy:subView_Suitability:tobaccoalchoholQuestionsTablePane:1:Q55Ans_DD", validateInput(strHashValue), "Question 9A2", currentScreen);
									break;
								case "QB":
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_ax2SILLegacy:subView_Suitability:tobaccoalchoholQuestionsTablePane:2:Q55Ans_DD", validateInput(strHashValue), "Question 9B", currentScreen);
									break;
								case "Q9C":
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_ax2SILLegacy:subView_Suitability:tobaccoalchoholQuestionsTablePane:3:Q55Ans_DD", validateInput(strHashValue), "Question 9C", currentScreen);
									break;
								case "Q9D":
									blnStatus = setValue(WebControl.CHECKBOX, IdentifyBy.NAME, "form_ax2SILLegacy:subView_Suitability:suitability_RB", validateInput(strHashValue), "Question 9D", currentScreen);
									break;
								case"INITIAL_ALLOCATION_ACCOUNTS":
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_ax2SILLegacy:ilLeg_ax2InitalAlloc:Initial_Allocbenefit_DD", validateInput(strHashValue), "Accounts", currentScreen);
									break;
								case"INITIAL_ALLOCATION_PREMIUM":
									blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_ax2SILLegacy:ilLeg_ax2InitalAlloc:Initial_AllocBenefitAmount_EF", validateInput(strHashValue), "Premium %:", currentScreen);
									break;
								case"INITIAL_ALLOCATION_DEDUCTION":
									blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_ax2SILLegacy:ilLeg_ax2InitalAlloc:Initial_AllocBenefitPercentage_EF", validateInput(strHashValue), "Deduction %:", currentScreen);
									break;
								case"ALLOCT_INFO_ADD":
									blnStatus = setValue(WebControl.BUTTON, IdentifyBy.NAME, "form_ax2SILLegacy:ilLeg_ax2InitalAlloc:Initial_AllocpinsPlanInfoAdd_CButton", validateInput(strHashValue), "Initial Allocation Plan Info Add button", currentScreen);
									break;
								case"AUTOMATIC_TRANSFER_SERVICE":
									blnStatus = setValue(WebControl.BUTTON, IdentifyBy.NAME, "form_ax2SILLegacy:ilLeg_ax2AutoTrans:benefissscairy_CButton", validateInput(strHashValue), "Automatic Transfer Service", currentScreen);
									break;
								case"FREQUENCY":
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_ax2SILLegacy:ilLeg_ax2AutoTrans:Option33al_DD", validateInput(strHashValue), "Frequency:", currentScreen);
									break;	
								case "default1":
									ReportGenerator.generateTestStep(false, currentScreen, "Field Navigation", strHashKey + " field not available in the current method.", false);
									break;
								} //end of switch
								if(!blnStatus) break;
							} //end of while
						}
						else {
							ReportGenerator.generateTestStep(false, currentScreen, "Switch to Frame", "Failed to switch frames " + strFrames.replaceAll(GlobalData.STRING_SEPARATOR, " > "), false);
							blnStatus = false;
						}
						objEnum = null;
							
					} catch(Exception objExp) {
						ReportGenerator.generateTestStep(false, currentScreen, "Exception occured", "Exception is - " + objExp.getMessage(), false);
						blnStatus = false;
					}
					return blnStatus;
				}
				
				//Function For ProposedInsured2 flow
				private static boolean ProposedInsured2(OrderedHashtable objTestData) {
					boolean blnStatus = false;
					String strHashKey = "", strHashValue = "";
					try {
						String strFrames = "mainContentFrame" + GlobalData.STRING_SEPARATOR + "contentRightFrame" + GlobalData.STRING_SEPARATOR + "file"+ GlobalData.STRING_SEPARATOR + "file";;
						Enumeration objEnum = objTestData.enumerateKeys();
						if(switchToFrame(strFrames, false) && waitForPageLoad(MAX_TIMEOUT)) {
							
							while(objEnum.hasMoreElements()) {
								//blnStatus = false;
								strHashKey = objEnum.nextElement().toString();
								strHashValue = objTestData.get(strHashKey).toString();

								switch(strHashKey) {
									

								case"P2_PREFIX_NAME":
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_ax2ASUL3:ProposedInsured2:pInsured1Prefix_DD", validateInput(strHashValue), "Prefix:", currentScreen);
									break;
								case"P2_FIRST_NAME":
									blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_ax2ASUL3:ProposedInsured2:pInsured1First_EF", validateInput(strHashValue), "First:", currentScreen);
									break;
								case"P2_MIDDLE_NAME":
									blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_ax2ASUL3:ProposedInsured2:pInsured1Middle_EF", validateInput(strHashValue), "Middle:", currentScreen);
									break;
								case"P2_LAST_NAME":
									blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_ax2ASUL3:ProposedInsured2:pInsured1Last_EF", validateInput(strHashValue), "Last:", currentScreen);
									break;
								case"P2_SUFFIX_NAME":
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_ax2ASUL3:ProposedInsured2:pInsured1Suffix_DD", validateInput(strHashValue), "Suffix:", currentScreen);
									break;
								case"SSN":
									blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_ax2ASUL3:ProposedInsured2:pInsured1ssn_EF", validateInput(strHashValue), "SS#", currentScreen);
									break;
								case"GENDER":
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_ax2ASUL3:ProposedInsured2:pInsured1Gender_DD", validateInput(strHashValue), "3. Gender", currentScreen);
									break;
								case"INSURED2_OWNER":
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_ax2ASUL3:ProposedInsured2:sameOwner_CB", validateInput(strHashValue), "Proposed Insured 2 an owner ?", currentScreen);
									break;
								case"ANY_OWNERS":
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_ax2ASUL3:ProposedInsured2:OtherOwnerNumber5_CB", validateInput(strHashValue), "Are there any Owner(s) who are not Proposed Insured 1 or Proposed Insured 2?", currentScreen);
									break;
								case"ADDRESS_SAME_P1":
									blnStatus = setValue(WebControl.CHECKBOX, IdentifyBy.NAME, "form_ax2ASUL3:ProposedInsured2:SameAddress_CB", validateInput(strHashValue), "Address same as Proposed Insured 1", currentScreen);
									break;
								case"PO_BOX_ADDRESS":
									blnStatus = setValue(WebControl.CHECKBOX, IdentifyBy.NAME, "form_ax2ASUL3:ProposedInsured2:poBox_CB", validateInput(strHashValue), "P.O Box Address", currentScreen);
									break;
								case"ADDRESS_TYPE":
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_ax2ASUL3:ProposedInsured2:addressType_DD", validateInput(strHashValue), "Address Type:", currentScreen);
									break;
								case"STREET_NO":
									blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_ax2ASUL3:ProposedInsured2:street_EF", validateInput(strHashValue), "No. & Street", currentScreen);
									break;
								case"BUILDING_APT_SUITE":
									blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_ax2ASUL3:ProposedInsured2:BldAptSuite_EF", validateInput(strHashValue), "Bldg/Apt/Suite", currentScreen);
									break;
								case"CITY":
									blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_ax2ASUL3:ProposedInsured2:pInsured1City_EF", validateInput(strHashValue), "City:", currentScreen);
									break;
								case"COUNTY":
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_ax2ASUL3:ProposedInsured2:pInsured1County_EF", validateInput(strHashValue), "County:", currentScreen);
									break;
								case"STATE":
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_ax2ASUL3:ProposedInsured2:pInsured1State_DD", validateInput(strHashValue), "State:", currentScreen);
									break;
								case"ZIP":
									blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_ax2ASUL3:ProposedInsured2:pInsured1Zip_EF", validateInput(strHashValue), "Zip", currentScreen);
									break;
								case"COUNTRY":
									blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_ax2ASUL3:ProposedInsured2:pInsured1Country_DD", validateInput(strHashValue), "Country:", currentScreen);
									break;
								case"ADD":
									blnStatus = setValue(WebControl.BUTTON, IdentifyBy.NAME, "form_ax2ASUL3:ProposedInsured2:pInsured1AddInfoAdd_CButton", validateInput(strHashValue), "ADD", currentScreen);
									break;
								case"US_CITIZEN":
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_ax2ASUL3:ProposedInsured2:pInsured1Citizen_DD", validateInput(strHashValue), "U.S Citizen ?", currentScreen);
									break;
								case"DATE_OF_BIRTH":
									blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_ax2ASUL3:ProposedInsured2:pInsured2DOB_EF", validateInput(strHashValue), "Date Of Birth:", currentScreen);
									break;
								case"BIRTH_PLACE_COUNTRY":
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_ax2ASUL3:ProposedInsured2:pInsured1BirthCountry_DD", validateInput(strHashValue), "Birthplace Country:", currentScreen);
									break;
								case"BIRTH_PLACE_STATE":
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_ax2ASUL3:ProposedInsured2:lifeBirthState_DD", validateInput(strHashValue), "Birthplace State:", currentScreen);
									break;
								case"EMAIL_ADDRESS":
									blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_ax2ASUL3:ProposedInsured2:emailAdd_EF", validateInput(strHashValue), "E-mail address:", currentScreen);
									break;
								case"HAVE_DRIVING_LICENSE":
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_ax2ASUL3:ProposedInsured2:pInsured1licence_DD", validateInput(strHashValue), "Do you have a driver's license?", currentScreen);
									break;
								case"LICENSE_NO":
									blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_ax2ASUL3:ProposedInsured2:pInsured1licNumber_EF", validateInput(strHashValue), "License Number: ", currentScreen);
									break;
								case"ISSUE_STATE":
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_ax2ASUL3:ProposedInsured2:pInsured1licenseState_DD", validateInput(strHashValue), "State of Issue:", currentScreen);
									break;
								case"EXPIRATION_DATE":
									blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_ax2ASUL3:ProposedInsured2:pInsured1ExpDateLic_EF", validateInput(strHashValue), "Expiration date: ", currentScreen);
									break;
								case"CURRENTLY_EMPLOYED":
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_ax2ASUL3:ProposedInsured2:pInsured1Employer_DD", validateInput(strHashValue), "Currently Employed:", currentScreen);
									break;
								case"GROSS_EARNED_ANNUAL_INCOME":
									blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_ax2ASUL3:subView_FinancialDetails:grossEarnedIncomePI1_EF", validateInput(strHashValue), "Gross Earned Annual Income:", currentScreen);
									break;
								case"GROSS_ANNUAL_HOUSEHOLD_INCOME":
									blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_ax2ASUL3:subView_FinancialDetails:grossHouseIncomePI1_EF", validateInput(strHashValue), "Gross Annual Household Income:", currentScreen);
									break;
								case"GROSS_UNEARNED_ANNUAL_INCOME":
									blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_ax2ASUL3:subView_FinancialDetails:grossUnearnedIncomePI1_EF", validateInput(strHashValue), "Gross Unearned Annual Income", currentScreen);
									break;
								case"TOTAL_NET_WORTH":
									blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_ax2ASUL3:subView_FinancialDetails:totalNetworthPI1_EF", validateInput(strHashValue), "Total Net Worth:", currentScreen);
									break;
								case"FILED_BANKRUPTACY":
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_ax2ASUL3:subView_FinancialDetails:bankruptcyDetailsQuestionsTablePane:0:Q61bAns_DD", validateInput(strHashValue), "In the last 5 year, have you filed for bankruptcy?", currentScreen);
									break;
								case"PERSONAL_P2":
									blnStatus = setValue(WebControl.BUTTON, IdentifyBy.NAME, "form_ax2ASUL3:PurposeOfInsurance:personalInfo_CButton", validateInput(strHashValue), "PERSONAL_P2", currentScreen);
									break;
								case"BUSINESS_P2":
									blnStatus = setValue(WebControl.BUTTON, IdentifyBy.NAME, "form_ax2ASUL3:PurposeOfInsurance:businessInfo_CButton", validateInput(strHashValue), "BUSINESS_P2", currentScreen);
									break;
								case"Q21A":
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_ax2ASUL3:OtherInsuranceInfo:otherInsuranceQuestionsTablePane:0:Q55Ans_DD", validateInput(strHashValue), "Question :21a", currentScreen);
									break;
								case"Q21B":
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_ax2ASUL3:OtherInsuranceInfo:otherInsuranceQuestionsTablePane:1:Q55Ans_DD", validateInput(strHashValue), "Question :21b", currentScreen);
									break;
								case"Q21C":
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_ax2ASUL3:OtherInsuranceInfo:otherInsuranceQuestionsTablePane:2:Q55Ans_DD", validateInput(strHashValue), "Question :21c", currentScreen);
									break;
								case"21D_TOTAL_AMOUNT":
									blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_ax2ASUL3:OtherInsuranceInfo:pendingInsuranceAmountProposedInsured1_EF", validateInput(strHashValue), "Total Amount", currentScreen);
									break;
								case"21AB_COMPANY_NAME":
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_ax2ASUL3:OtherInsuranceInfo:otherInsuranceCompanyName_DD", validateInput(strHashValue), "Name of Company:", currentScreen);
									break;
								case"21AB_FACE_AMOUNT_PLUS_RIDERS":
									blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_ax2ASUL3:OtherInsuranceInfo:faceAmountRider_EF", validateInput(strHashValue), "Face Amount plus Riders:", currentScreen);
									break;
								case"21AB_YEAR_ISSUED":
									blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_ax2ASUL3:OtherInsuranceInfo:yearIssued_EF", validateInput(strHashValue), "Year Issued:", currentScreen);
									break;
								case"21AB_POLICY_CONTRACT_NO":
									blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_ax2ASUL3:OtherInsuranceInfo:contractNumber_EF", validateInput(strHashValue), "Policy / Contract #:", currentScreen);
									break;
								case"21AB_POLICY_CONTRACT_TYPE":
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_ax2ASUL3:OtherInsuranceInfo:lifeProposedInsurance_EF", validateInput(strHashValue), "Policy/Contract Type:", currentScreen);
									break;
								case"21AB_REPLACED_OR_AFFECTED":
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_ax2ASUL3:OtherInsuranceInfo:replacedOrEffected_DD", validateInput(strHashValue), "To be replaced changed or affected?", currentScreen);
									break;
								case"21AB_1035_EXCHANGE":
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_ax2ASUL3:OtherInsuranceInfo:exchangeQuestion_DD", validateInput(strHashValue), "1035 Exchange?", currentScreen);
									break;
								case"21AB_PRODUCT_TYPE":
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_ax2ASUL3:OtherInsuranceInfo:ProductType_DD", validateInput(strHashValue), "Product Type:", currentScreen);
									break;
								case"21AB_ADD":
									blnStatus = setValue(WebControl.BUTTON, IdentifyBy.NAME, "form_ax2ASUL3:OtherInsuranceInfo:lifeOtherInsuranceAdd_CButton", validateInput(strHashValue), "ADD", currentScreen);
									break;
								case"21C_COMPANY_NAME":
									
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_ax2ASUL3:PendingOtherInsuranceInfo:otherInsuranceCompanyName_DD", validateInput(strHashValue), "Name of Company:", currentScreen);
									break;
									
								case"21C_FACE_AMOUNT_PLUS_RIDERS":
									blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_ax2ASUL3:PendingOtherInsuranceInfo:amountAppliedFor_EF", validateInput(strHashValue), "Face Amount plus Riders:", currentScreen);
									break;
								case"21C_COMPETITIVE_ADDITIONAL":
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_ax2ASUL3:PendingOtherInsuranceInfo:compatativeOrAdditional_DD", validateInput(strHashValue), " Competitive or Additional:", currentScreen);
									break;
								case"21C_ADD":
									blnStatus = setValue(WebControl.BUTTON, IdentifyBy.NAME, "form_ax2ASUL3:PendingOtherInsuranceInfo:pendingInsuranceTableAdd_Button", validateInput(strHashValue), "ADD", currentScreen);
									break;
								case"Q22":
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_ax2ASUL3:subViewpersonalHIstory:tobaccoalchoholQuestionsTablePane:0:Q22Ans_DD", validateInput(strHashValue), "Question :22", currentScreen);
									break;
								case"Q23":
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_ax2ASUL3:subViewpersonalHIstory:tobaccoalchoholQuestionsTablePane:1:Q22Ans_DD", validateInput(strHashValue), "Question :23", currentScreen);
									break;
								case"Q24":
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_ax2ASUL3:subViewpersonalHIstory:tobaccoalchoholQuestionsTablePane:2:Q22Ans_DD", validateInput(strHashValue), "Question :24", currentScreen);
									break;
								case"Q25":
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_ax2ASUL3:subViewpersonalHIstory:tobaccoalchoholQuestionsTablePane:3:Q22Ans_DD", validateInput(strHashValue), "Question :25", currentScreen);
									break;
								case"Q26":
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_ax2ASUL3:subViewpersonalHIstory:tobaccoalchoholQuestionsTablePane:4:Q22Ans_DD", validateInput(strHashValue), "Question :26", currentScreen);
									break;
								case"Q27":
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_ax2ASUL3:subViewpersonalHIstory:tobaccoalchoholQuestionsTablePane:5:Q22Ans_DD", validateInput(strHashValue), "Question :27", currentScreen);
									break;
								case"Q28":
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_ax2ASUL3:subViewpersonalHIstory:tobaccoalchoholQuestionsTablePane:6:Q22Ans_DD", validateInput(strHashValue), "Question :28", currentScreen);
									break;
								case"Q29A":
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_ax2ASUL3:subViewpersonalHIstory:tobaccoalchoholQuestionsTablePane:7:Q22Ans_DD", validateInput(strHashValue), "Question :29A", currentScreen);
									break;
								case"Q29B":
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_ax2ASUL3:subViewpersonalHIstory:tobaccoalchoholQuestionsTablePane:8:Q22Ans_DD", validateInput(strHashValue), "Question :29B", currentScreen);
									break;
								case"Q30":
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_ax2ASUL3:subViewpersonalHIstory:tobaccoalchoholQuestionsTablePane:9:Q22Ans_DD", validateInput(strHashValue), "Question :30", currentScreen);
									break;
								case"Q31":
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_ax2ASUL3:subView_Alcohol:tobaccoalchoholQuestionsTablePane:0:Q31Ans_DD", validateInput(strHashValue), "Question :31", currentScreen);
									break;
								case"Q32":
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_ax2ASUL3:subView_Alcohol:tobaccoalchoholQuestionsTablePane:1:Q31Ans_DD", validateInput(strHashValue), "Question :32", currentScreen);
									break;
								case"TOBACCO_USAGE_YES":
									blnStatus = setValue(WebControl.BUTTON, IdentifyBy.NAME, "form_ax2ASUL3:subView_Alcohol:tobaccoalchoholQuestionsTablePane:1:alcoholUseAdditionalDetails_CButton", validateInput(strHashValue), "TOBACCO_USAGE_YES_POPUP_BUTTON", currentScreen);
									break;
								case"ANOTHER_COMPANY_EXAM_USED":
									
									blnStatus = setValue(WebControl.CHECKBOX, IdentifyBy.NAME, "form_ax2ASUL3:MedicalCertification:Q57_CB", validateInput(strHashValue), "Is another company exam being used?", currentScreen);
									break;
								case"INSURED_COMPANY":
								
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_ax2ASUL3:MedicalCertification:nameOfCompany_DD", validateInput(strHashValue), "Name of Insurance Company:", currentScreen);
									break;
								case"DATE_OF_EXAM":
									blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_ax2ASUL3:MedicalCertification:dateOfExam_EF", validateInput(strHashValue), "Date of Exam:", currentScreen);
									break;
								case"Q34":
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_ax2ASUL3:MedicalCertification:medicalCertificationQuestionsTablePane:0:aeMedicalCertificationQuestionsQAns", validateInput(strHashValue), "Question :34", currentScreen);
									break;
								case"Q35":
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_ax2ASUL3:MedicalCertification:medicalCertificationQuestionsTablePane:1:aeMedicalCertificationQuestionsQAns", validateInput(strHashValue), "Question :35", currentScreen);
									break;
								case"Q36":
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_ax2ASUL3:MoneyPaid:tobaccoalchoholQuestionsTablePane:0:Q22Ans_DD", validateInput(strHashValue), "Question :36", currentScreen);
									break;
								case"Q37":
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_ax2ASUL3:MoneyPaid:tobaccoalchoholQuestionsTablePane:1:Q22Ans_DD", validateInput(strHashValue), "Question :37", currentScreen);
									break;
								case"Q38":
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_ax2ASUL3:MoneyPaid:tobaccoalchoholQuestionsTablePane:2:Q22Ans_DD", validateInput(strHashValue), "Question :38", currentScreen);
									break;
								case"Q39":
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_ax2ASUL3:MoneyPaid:tobaccoalchoholQuestionsTablePane:3:Q22Ans_DD", validateInput(strHashValue), "Question :39", currentScreen);
									break;
								case"Q40":
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_ax2ASUL3:MoneyPaid:tobaccoalchoholQuestionsTablePane:4:Q22Ans_DD", validateInput(strHashValue), "Question :40", currentScreen);
									break;
								case"Q41":
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_ax2ASUL3:MoneyPaid:tobaccoalchoholQuestionsTablePane:5:Q22Ans_DD", validateInput(strHashValue), "Question :41", currentScreen);
									break;
								case"MISC_ANYTHING_ELSE_IN_REMARKS":
									blnStatus = setValue(WebControl.CHECKBOX, IdentifyBy.NAME, "form_ax2ASUL3:MoneyPaid:otherDetail_RB", validateInput(strHashValue), "Is there anything else in the Remarks section that was not data entered elsewhere that affects underwriting?", currentScreen);
									break;
								case "default1":
									ReportGenerator.generateTestStep(false, currentScreen, "Field Navigation", strHashKey + " field not available in the current method.", false);
									break;
						
							
								} //end of switch
								if(!blnStatus) break;
							} //end of while
						}
						else {
							ReportGenerator.generateTestStep(false, currentScreen, "Switch to Frame", "Failed to switch frames " + strFrames.replaceAll(GlobalData.STRING_SEPARATOR, " > "), false);
							blnStatus = false;
						}
						objEnum = null;
							
					} catch(Exception objExp) {
						ReportGenerator.generateTestStep(false, currentScreen, "Exception occured", "Exception is - " + objExp.getMessage(), false);
						blnStatus = false;
					}
					return blnStatus;
				}
				
				

				//Function For TobaccoUsageFillInfoP2 flow
				private static boolean TobaccoUsageFillInfoP2(OrderedHashtable objTestData) {
					boolean blnStatus = false;
					String strHashKey = "", strHashValue = "";
					try {
						String strFrames = "FWin0" + GlobalData.STRING_SEPARATOR + "Content0";
						Enumeration objEnum = objTestData.enumerateKeys();
						if(switchToFrame(strFrames, false) && waitForPageLoad(MAX_TIMEOUT)) {
							
							while(objEnum.hasMoreElements()) {
								//blnStatus = false;
								strHashKey = objEnum.nextElement().toString();
								strHashValue = objTestData.get(strHashKey).toString();

								switch(strHashKey) {
								
					
								case"TOBACCO_PRODUCT":
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "JIform_UlTobaccoUseDetails:JIproduct_DD", validateInput(strHashValue), "Product:", currentScreen);
									break;
								case"QUANTITY":
									blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "JIform_UlTobaccoUseDetails:JIquantity_EF", validateInput(strHashValue), "Quantity:", currentScreen);
									break;
								case"CURRENT_PAST":
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "JIform_UlTobaccoUseDetails:JIcurrent_DD", validateInput(strHashValue), "Current/Past:", currentScreen);
									break;
								case"YEARS":
									blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "JIform_UlTobaccoUseDetails:JIyears_EF", validateInput(strHashValue), "Years:", currentScreen);
									break;
								case"DATE_STOPPED":
									blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "JIform_UlTobaccoUseDetails:JIdateStopped_EF", validateInput(strHashValue), "Date Stopped:", currentScreen);
									break;
								case"FREQUENCY":
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "JIform_UlTobaccoUseDetails:JIfrequency_DD", validateInput(strHashValue), "Frequency:", currentScreen);
									break;
								case"ADD_INFO_DETAILS":
									blnStatus = setValue(WebControl.BUTTON, IdentifyBy.NAME, "JIform_UlTobaccoUseDetails:JItobaccoUseAdd_CButton", validateInput(strHashValue), "ADD_INFO_DETAILS", currentScreen);
									break;
								case"ADD":
									blnStatus = setValue(WebControl.BUTTON, IdentifyBy.NAME, "JIform_UlTobaccoUseDetails:JIAdd_CButton", validateInput(strHashValue), "ADD", currentScreen);
									break;
								case "default1":
									ReportGenerator.generateTestStep(false, currentScreen, "Field Navigation", strHashKey + " field not available in the current method.", false);
									break;
								
								} //end of switch
								if(!blnStatus) break;
							} //end of while
						}
						else {
							ReportGenerator.generateTestStep(false, currentScreen, "Switch to Frame", "Failed to switch frames " + strFrames.replaceAll(GlobalData.STRING_SEPARATOR, " > "), false);
							blnStatus = false;
						}
						objEnum = null;
							
					} catch(Exception objExp) {
						ReportGenerator.generateTestStep(false, currentScreen, "Exception occured", "Exception is - " + objExp.getMessage(), false);
						blnStatus = false;
					}
					return blnStatus;
				}
				
				
				//Function For Suitability flow
				private static boolean Suitability(OrderedHashtable objTestData) {
					boolean blnStatus = false;
					String strHashKey = "", strHashValue = "";
					try {
						String strFrames = "FWin0" + GlobalData.STRING_SEPARATOR + "Content0";
						Enumeration objEnum = objTestData.enumerateKeys();
						if(switchToFrame(strFrames, false) && waitForPageLoad(MAX_TIMEOUT)) {
							
							while(objEnum.hasMoreElements()) {
								//blnStatus = false;
								strHashKey = objEnum.nextElement().toString();
								strHashValue = objTestData.get(strHashKey).toString();

								switch(strHashKey) {
								
										
								case"RECEIVED_PROSPECTUS_POLICY":   
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.XPATH, "//span[contains(text(),'applied')]/../..//select", validateInput(strHashValue), "RECEIVED_PROSPECTUS_POLICY", currentScreen);
							      //blnStatus = setValue(WebControl.SELECT, IdentifyBy.XPATH, "//table[@id='form_UlSuitability:ILLegacySuitabilityQuestionsTablePane1']//tr[1]/td/select", validateInput(strHashValue), "RECEIVED_PROSPECTUS_POLICY", currentScreen);
									break;
								case"RECEIVED_PROSPECTUS_COMPANY":                           
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.XPATH, "//span[contains(text(),'company(ies)')]/../..//select", validateInput(strHashValue), "RECEIVED_PROSPECTUS_COMPANY", currentScreen);
									break;
								case"UNDERSTAND_DEDUCTION_CHARGES":
									blnStatus = setValue(WebControl.SELECT,IdentifyBy.XPATH, "//span[contains(text(),'reduction')]/../..//select", validateInput(strHashValue), "UNDERSTAND_DEDUCTION_CHARGES", currentScreen);
									break;
								case"FINANCIAL_NEEDS":
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.XPATH, "//span[contains(text(),'anticipated')]/../..//select", validateInput(strHashValue), "FINANCIAL_NEEDS", currentScreen);
									break;
								case"ADD":
									blnStatus = setValue(WebControl.BUTTON, IdentifyBy.NAME, "form_UlSuitability:drAdd", validateInput(strHashValue), "ADD", currentScreen);
									break;
								case "default1":
									ReportGenerator.generateTestStep(false, currentScreen, "Field Navigation", strHashKey + " field not available in the current method.", false);
									break;
							
								} //end of switch
								if(!blnStatus) break;
							} //end of while
						}
						else {
							ReportGenerator.generateTestStep(false, currentScreen, "Switch to Frame", "Failed to switch frames " + strFrames.replaceAll(GlobalData.STRING_SEPARATOR, " > "), false);
							blnStatus = false;
						}
						objEnum = null;
							
					} catch(Exception objExp) {
						ReportGenerator.generateTestStep(false, currentScreen, "Exception occured", "Exception is - " + objExp.getMessage(), false);
						blnStatus = false;
					}
					return blnStatus;
				}
				
				
				//Function For AutomaticTransferService flow
				private static boolean AutomaticTransferService(OrderedHashtable objTestData) {
					boolean blnStatus = false;
					String strHashKey = "", strHashValue = "";
					try {
						String strFrames = "FWin0" + GlobalData.STRING_SEPARATOR + "Content0";
						Enumeration objEnum = objTestData.enumerateKeys();
						if(switchToFrame(strFrames, false) && waitForPageLoad(MAX_TIMEOUT)) {
							
							while(objEnum.hasMoreElements()) {
								//blnStatus = false;
								strHashKey = objEnum.nextElement().toString();
								strHashValue = objTestData.get(strHashKey).toString();

								switch(strHashKey) {
								
								case"ACCOUNTS":
									
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_UlAutomaticTransferService:automatic_DD", validateInput(strHashValue), "ACCOUNTS", currentScreen);
									break;
								case"AMOUNT":
									blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_UlAutomaticTransferService:amount_EF", validateInput(strHashValue), "AMOUNT", currentScreen);
									break;
								case"ADD_TO_LIST":
									blnStatus = setValue(WebControl.BUTTON, IdentifyBy.NAME, "form_UlAutomaticTransferService:automaticUseAdd_CButton", validateInput(strHashValue), "ADD_TO_LIST", currentScreen);
									break;
								case"ADD":
									blnStatus = setValue(WebControl.BUTTON, IdentifyBy.NAME, "form_UlAutomaticTransferService:drAdd", validateInput(strHashValue), "ADD", currentScreen);
									break;
								case "default1":
									ReportGenerator.generateTestStep(false, currentScreen, "Field Navigation", strHashKey + " field not available in the current method.", false);
									break;
								} //end of switch
								if(!blnStatus) break;
							} //end of while
						}
						else {
							ReportGenerator.generateTestStep(false, currentScreen, "Switch to Frame", "Failed to switch frames " + strFrames.replaceAll(GlobalData.STRING_SEPARATOR, " > "), false);
							blnStatus = false;
						}
						objEnum = null;
							
					} catch(Exception objExp) {
						ReportGenerator.generateTestStep(false, currentScreen, "Exception occured", "Exception is - " + objExp.getMessage(), false);
						blnStatus = false;
					}
					return blnStatus;
				}
				
				//Function For HIPAAJI flow
				private static boolean HIPAAJI(OrderedHashtable objTestData) {
					boolean blnStatus = false;
					String strHashKey = "", strHashValue = "";
					try {
						verifyPopupMessage(strErrorMessage);
						
						String strFrames = "mainContentFrame" + GlobalData.STRING_SEPARATOR + "contentRightFrame" + GlobalData.STRING_SEPARATOR + "file"+ GlobalData.STRING_SEPARATOR + "file";;
						Enumeration objEnum = objTestData.enumerateKeys();
						if(switchToFrame(strFrames, false) && waitForPageLoad(MAX_TIMEOUT)) {
							
							while(objEnum.hasMoreElements()) {
								//blnStatus = false;
								strHashKey = objEnum.nextElement().toString();
								strHashValue = objTestData.get(strHashKey).toString();

								switch(strHashKey) {

								case "PREFIX":
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_ax2JIHipaa:ax2SignatureHIPAA:jInsured1Prefix_DD", validateInput(strHashValue), "PREFIX", currentScreen);
									break;
								case "FIRNAT_NAME":
									blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_ax2JIHipaa:ax2SignatureHIPAA:jInsured1First_EF", validateInput(strHashValue), "First Name", currentScreen);
									break;
								case "MIDDLE_NAME":
									blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_ax2JIHipaa:ax2SignatureHIPAA:jInsured1Middle_EF", validateInput(strHashValue), "Middle Name", currentScreen);
									break;
								case "LAST_NAME":
									blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_ax2JIHipaa:ax2SignatureHIPAA:jInsured1Last_EF", validateInput(strHashValue), "Last Name", currentScreen);
									break;
								case "SUFFIX":
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_ax2JIHipaa:ax2SignatureHIPAA:jInsured1Suffix_DD", validateInput(strHashValue), "SUFFIX", currentScreen);
									break;
								case "DATE_OF_BIRTH":
									blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_ax2JIHipaa:ax2SignatureHIPAA:jInsured1DOB_EF", validateInput(strHashValue), "D.O.B", currentScreen);
									break;
								case "SIGNATURE_OF_INSURED":
									blnStatus = setValue(WebControl.CHECKBOX, IdentifyBy.NAME, "form_ax2JIHipaa:ax2SignatureHIPAA:signPatient_Cb_JI", validateInput(strHashValue), "Signature of Joint Insured / Patient or Authorized Representative", currentScreen);
									break;
								case "DESCRIPTION_OF_PERSONAL":
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_ax2JIHipaa:ax2SignatureHIPAA:signRelationship_DD_JI", validateInput(strHashValue), "Description of Personal Representative's Authority / Relationship to Joint Insured / Patient", currentScreen);
									break;
								case "SIGNED_CITY":
									blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_ax2JIHipaa:ax2SignatureHIPAA:relationshipCity_EF_JI", validateInput(strHashValue), "Signed At: City", currentScreen);
									break;
								case "SIGNED_STATE":
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_ax2JIHipaa:ax2SignatureHIPAA:relationshipState_DD_JI", validateInput(strHashValue), "State :", currentScreen);
									break;
								case "SIGNED_DATE":
									blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_ax2JIHipaa:ax2SignatureHIPAA:relationshipDate_EF_JI", validateInput(strHashValue), "Date:", currentScreen);
									break;
								case "default1":
									ReportGenerator.generateTestStep(false, currentScreen, "Field Navigation", strHashKey + " field not available in the current method.", false);
									break;
								
							
								} //end of switch
								if(!blnStatus) break;
							} //end of while
						}
						else {
							ReportGenerator.generateTestStep(false, currentScreen, "Switch to Frame", "Failed to switch frames " + strFrames.replaceAll(GlobalData.STRING_SEPARATOR, " > "), false);
							blnStatus = false;
						}
						objEnum = null;
							
					} catch(Exception objExp) {
						ReportGenerator.generateTestStep(false, currentScreen, "Exception occured", "Exception is - " + objExp.getMessage(), false);
						blnStatus = false;
					}
					return blnStatus;
				}
				
				
				
				
				//Function For Owner flow
				private static boolean Owner(OrderedHashtable objTestData) {
					boolean blnStatus = false;
					String SSN_EIN_ITIN = "";
					String strHashKey = "", strHashValue = "";
					try {
						String strFrames = "mainContentFrame" + GlobalData.STRING_SEPARATOR + "contentRightFrame" + GlobalData.STRING_SEPARATOR + "file"+ GlobalData.STRING_SEPARATOR + "file";;
						Enumeration objEnum = objTestData.enumerateKeys();
						if(switchToFrame(strFrames, false) && waitForPageLoad(MAX_TIMEOUT)) {
							
							while(objEnum.hasMoreElements()) {
								//blnStatus = false;
								strHashKey = objEnum.nextElement().toString();
								strHashValue = objTestData.get(strHashKey).toString();

								switch(strHashKey) {

								case"QUALIFIED_PLAN_TYPE":
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_newAppOwner:ax2OwnerInfo:qualPlan_DD", validateInput(strHashValue), "1. Qualified Plan Type", currentScreen);
									break;
								case"QUALIFIED_UNISEX_RATES":
									
									blnStatus = setValue(WebControl.CHECKBOX, IdentifyBy.NAME, "form_newAppOwner:ax2OwnerInfo:uniSexIndicator_CB", validateInput(strHashValue), "Qualified Unisex Rates", currentScreen);
									break;
									
								case"PERSON_R_ENTITY":																					
									blnStatus = setValue(WebControl.RADIOBOX, IdentifyBy.NAME, "form_newAppOwner:ax2OwnerInfo:owner_DT:0:personEntityType_RB", getAppRadioValues(strHashKey, strHashValue), "Person / Entity", currentScreen);
									break;
								case"ENTITY_TYPE":
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_newAppOwner:ax2OwnerInfo:owner_DT:0:personEntityType_DD", validateInput(strHashValue), "ENTITY_TYPE", currentScreen);
								
									break;
								case"DELETE_OWNER":
									blnStatus = setValue(WebControl.CHECKBOX, IdentifyBy.NAME, "form_newAppOwner:ax2OwnerInfo:owner_DT:0:delete1Owner_CB", validateInput(strHashValue), "DELETE_OWNER", currentScreen);
									
									break;
								case "SELECT_ADDRESS":
									blnStatus = selectWebtableRow(IdentifyBy.ID, "form_newAppOwner:ax2OwnerInfo:owner_DT:0:addTableMain_PGroup", "", "Select Address", currentScreen);
									break;
									
								case"PREFIX":
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_newAppOwner:ax2OwnerInfo:owner_DT:0:prefix_DD", validateInput(strHashValue), "PREFIX", currentScreen);
			      				break;

								case"UPDATE":
										blnStatus = setValue(WebControl.BUTTON, IdentifyBy.NAME, "form_newAppOwner:ax2OwnerInfo:owner_DT:0:owner1AddInfoUpdate_CButton", validateInput(strHashValue), "ADD", currentScreen);
										break;
									
								case"FIRST_NAME":
									blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_newAppOwner:ax2OwnerInfo:owner_DT:0:first_EF", validateInput(strHashValue), "FIRST_NAME", currentScreen);
									break;
									
								case"MIDDLE_NAME":
									blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_newAppOwner:ax2OwnerInfo:owner_DT:0:middle_EF", validateInput(strHashValue), "MIDDLE_NAME", currentScreen);
									break;
								case"LAST_NAME":
									blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_newAppOwner:ax2OwnerInfo:owner_DT:0:last_EF", validateInput(strHashValue), "LAST_NAME", currentScreen);
									break;
									
								case"SUFFIX":
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_newAppOwner:ax2OwnerInfo:owner_DT:0:suffix_DD", validateInput(strHashValue), "SUFFIX", currentScreen);
									break;
								case"ENTITY":
									blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_newAppOwner:ax2OwnerInfo:owner_DT:0:entity_EF", validateInput(strHashValue), "ENTITY", currentScreen);
									
									break;
								case"RELATIONSHIP_TO_INSURED":
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_newAppOwner:ax2OwnerInfo:owner_DT:0:relationship_DD", validateInput(strHashValue), "3. Relationship to Proposed Insured:", currentScreen);
									break;
								case"SSN_EIN_ITIN":
									SSN_EIN_ITIN = strHashValue;
									blnStatus = setValue(WebControl.RADIOBOX, IdentifyBy.NAME, "form_newAppOwner:ax2OwnerInfo:owner_DT:0:ssnEinItin_RB", getAppRadioValues(strHashKey, strHashValue), "SSN_EIN_ITIN", currentScreen);
									
									break;
								case"SSN_EIN_ITIN_NUMBER": 
									switch(SSN_EIN_ITIN) {
										case "SSN":
											blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_newAppOwner:ax2OwnerInfo:owner_DT:0:ssnEinSSN_EF", validateInput(strHashValue), "SSN NUMBER", currentScreen);
											break;
										case "EIN":
											blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_newAppOwner:ax2OwnerInfo:owner_DT:0:ssnEinEIN_EF", validateInput(strHashValue), "EIN NUMBER", currentScreen);
											break;
										case "ITIN":
											blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_newAppOwner:ax2OwnerInfo:owner_DT:0:ssnEinITIN_EF", validateInput(strHashValue), "ITIN NUMBER", currentScreen);
											break;
									}
									break;
								case"EMAIL_ADDRESS":
									blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_newAppOwner:ax2OwnerInfo:owner_DT:0:email_EF", validateInput(strHashValue), "EMAIL_ADDRESS", currentScreen);
									
									break;
								case"POBOX_ADDRESS":
									blnStatus = setValue(WebControl.CHECKBOX, IdentifyBy.NAME, "form_newAppOwner:ax2OwnerInfo:owner_DT:0:poBox_CB", validateInput(strHashValue), "PO.BOX ADDRESS", currentScreen);
									
									break;
									case"ADDRESS_TYPE":
										blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_newAppOwner:ax2OwnerInfo:owner_DT:0:addressType_DD", validateInput(strHashValue), "ADDRESS_TYPE", currentScreen);
										break;
									case"STREET_NO":
										blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_newAppOwner:ax2OwnerInfo:owner_DT:0:street_EF", validateInput(strHashValue), "STREET_NO", currentScreen);
										break;
									case"BLG_APT_SUITE":
										blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_newAppOwner:ax2OwnerInfo:owner_DT:0:BldAptSuite_EF", validateInput(strHashValue), "BLG_APT_SUITE", currentScreen);
										break;
									case"CITY":
										blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_newAppOwner:ax2OwnerInfo:owner_DT:0:pInsured1City_EF", validateInput(strHashValue), "CITY", currentScreen);
										break;
									case"COUNTY":
										blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_newAppOwner:ax2OwnerInfo:owner_DT:0:pInsured1County_EF", validateInput(strHashValue), "COUNTY", currentScreen);
										break;
									case"STATE":
										blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_newAppOwner:ax2OwnerInfo:owner_DT:0:pInsured1State_DD", validateInput(strHashValue), "STATE", currentScreen);
										break;
									case"ZIP":
										blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_newAppOwner:ax2OwnerInfo:owner_DT:0:pInsured1Zip_EF", validateInput(strHashValue), "zip", currentScreen);
										break;
									case"COUNTRY":
										
										blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_newAppOwner:ax2OwnerInfo:owner_DT:0:pInsured1Country_DD", validateInput(strHashValue), "COUNTRY", currentScreen);
										break;
									case"ADD":
										
										blnStatus = setValue(WebControl.BUTTON, IdentifyBy.NAME, "form_newAppOwner:ax2OwnerInfo:owner_DT:0:owner1AddInfoAdd_CButton", validateInput(strHashValue), "ADD", currentScreen);
										break;
									case"Q7_PREFIX":
										blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_newAppOwner:ax2OwnerInfo:owner_DT:0:prefix2_DD", validateInput(strHashValue), "Q7_PREFIX", currentScreen);
										break;
									case"Q7_FIRST_NAME":
										blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_newAppOwner:ax2OwnerInfo:owner_DT:0:first2_EF", validateInput(strHashValue), "Q7_FIRST_NAME", currentScreen);
										break;
										
									case"Q7_MIDDLE_NAME":
										blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_newAppOwner:ax2OwnerInfo:owner_DT:0:middle2_EF", validateInput(strHashValue), "Q7_MIDDLE_NAME", currentScreen);
										break;
									case"Q7_LAST_NAME":
										blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_newAppOwner:ax2OwnerInfo:owner_DT:0:last2_EF", validateInput(strHashValue), "Q7_LAST_NAME", currentScreen);
										break;
									case"Q7_SUFFIX":
										blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_newAppOwner:ax2OwnerInfo:owner_DT:0:suffix2_DD", validateInput(strHashValue), "Q7_SUFFIX", currentScreen);
										break;
									case"Q7_TITLE":
										
										blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_newAppOwner:ax2OwnerInfo:owner_DT:0:title_sEF", validateInput(strHashValue), "Q7_TITLE", currentScreen);
									
										break;
									case"INDIVIDUAL":
										blnStatus = setValue(WebControl.BUTTON, IdentifyBy.NAME, "form_newAppOwner:ax2OwnerInfo:owner_DT:0:_id26", validateInput(strHashValue), "INDIVIDUAL", currentScreen);
										break;
									case"INCOME":
										blnStatus = setValue(WebControl.BUTTON, IdentifyBy.NAME, "form_newAppOwner:ax2OwnerInfo:owner_DT:0:_id27", validateInput(strHashValue), "INCOME", currentScreen);
										break;
									case"US_BANK_NAME":
										blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_newAppOwner:ax2OwnerInfo:owner_DT:0:usBank_EF", validateInput(strHashValue), "US_BANK_NAME", currentScreen);
										break;
									case"BANK_ACCOUNT_NUMBER":
										blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_newAppOwner:ax2OwnerInfo:owner_DT:0:usAccount_EF", validateInput(strHashValue), "BANK_ACCOUNT_NUMBER", currentScreen);
										break;
									case"PERSONAL":
										blnStatus = setValue(WebControl.BUTTON, IdentifyBy.NAME, "form_newAppOwner:ax2OwnerInfo:owner_DT:0:personalInfo_CButton", validateInput(strHashValue), "PERSONAL", currentScreen);
										break;
									case"BUSINESS":
										blnStatus = setValue(WebControl.BUTTON, IdentifyBy.NAME, "form_newAppOwner:ax2OwnerInfo:owner_DT:0:businessInfo_CButton", validateInput(strHashValue), "BUSINESS", currentScreen);
										break;
									case"Q28TO31_SOURCE_OF_FUNDS":
										blnStatus = setValue(WebControl.BUTTON, IdentifyBy.NAME, "form_newAppOwner:ax2OwnerInfo:owner_DT:0:sourceOfFundse_CButton", validateInput(strHashValue), "28 to 31 Source Of Funds", currentScreen);
										break;
									case"OTHER_INSURANCE":
										blnStatus = setValue(WebControl.BUTTON, IdentifyBy.NAME, "form_newAppOwner:ax2OwnerInfo:owner_DT:0:otherInsurance_CButton", validateInput(strHashValue), "Other Insurance", currentScreen);
										break;
									case"ENTITY_OWNERSHIP":
										blnStatus = setValue(WebControl.BUTTON, IdentifyBy.NAME, "form_newAppOwner:ax2OwnerInfo:owner_DT:0:EOSupp_CButton", validateInput(strHashValue), "FATCA", currentScreen);
										break;
									case"TRUSTED_CONTACT":
										blnStatus = setValue(WebControl.BUTTON, IdentifyBy.NAME, "form_newAppOwner:ax2OwnerInfo:owner_DT:0:TrustedContact_CButton", validateInput(strHashValue), "FATCA", currentScreen);
										break;
										
									case"FATCA":
										blnStatus = setValue(WebControl.BUTTON, IdentifyBy.NAME, "form_newAppOwner:ax2OwnerInfo:owner_DT:0:FATCA_CButton", validateInput(strHashValue), "FATCA", currentScreen);
										break;
									case "default1":
										ReportGenerator.generateTestStep(false, currentScreen, "Field Navigation", strHashKey + " field not available in the current method.", false);
										break;
								
								} //end of switch
								if(!blnStatus) break;
							} //end of while
						}
						else {
							ReportGenerator.generateTestStep(false, currentScreen, "Switch to Frame", "Failed to switch frames " + strFrames.replaceAll(GlobalData.STRING_SEPARATOR, " > "), false);
							blnStatus = false;
						}
						objEnum = null;
							
					} catch(Exception objExp) {
						ReportGenerator.generateTestStep(false, currentScreen, "Exception occured", "Exception is - " + objExp.getMessage(), false);
						blnStatus = false;
					}
					return blnStatus;
				}
				
				
				//Function For OwnerIndividual flow
			
				private static boolean OwnerIndividual(OrderedHashtable objTestData) {
					boolean blnStatus = false;
					String strHashKey = "", strHashValue = "";
					try {
						String strFrames = "FWin0" + GlobalData.STRING_SEPARATOR + "Content0";
						Enumeration objEnum = objTestData.enumerateKeys();
						if(switchToFrame(strFrames, false) && waitForPageLoad(MAX_TIMEOUT)) {
							
							while(objEnum.hasMoreElements()) {
								//blnStatus = false;
								strHashKey = objEnum.nextElement().toString();
								strHashValue = objTestData.get(strHashKey).toString();

								switch(strHashKey) {
								case"HAVE_DRIVERS_LICENSE":
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "resident_alien:licenceAvailable_DD", validateInput(strHashValue), "8. Do you have a Driver's License?", currentScreen);
									break;
								case"LICENSE_NUMBER":
									blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "resident_alien:licenseNumber_EF", validateInput(strHashValue), "License Number:", currentScreen);
									break;
								case"STATE_OF_ISSUE":
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "resident_alien:licenseState_DD", validateInput(strHashValue), "State of Issue:", currentScreen);
									break;
									
								case"EXPIRATION_DATE":
									blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "resident_alien:LicenseExpDate_EF", validateInput(strHashValue), "Expiration Date:", currentScreen);
									break;
								case"IF_NO_DRIVERS_LICNSE":
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "resident_alien:pOwnerGovtQue_DD", validateInput(strHashValue), "8. Do you have a Driver's License?", currentScreen);
									break;
								case"DATE_OF_BIRTH":
									blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "resident_alien:empDOB_EF", validateInput(strHashValue), "9. Date of Birth", currentScreen);
									break;
									
								case"CURRENTLY_EMPLOYED":
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "resident_alien:currentlyEmployed_DD", validateInput(strHashValue), "10. Are you currently employed?", currentScreen);
									break;
								case"OCCUPATION":								
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "resident_alien:occupation_DD", validateInput(strHashValue), "OCCUPATION", currentScreen);
									break;
								case"EMPLOYER_NAME":
									blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "resident_alien:employerName_EF", validateInput(strHashValue), "EMPLOYER_NAME", currentScreen);
									break;
									
								case"OTHER_OCCUPATION":
									blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "resident_alien:otherOccupation_EF", validateInput(strHashValue), "OTHER_OCCUPATION", currentScreen);
									break;
								case"Q13":
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "resident_alien:armedForce_DD", validateInput(strHashValue), "13. Are you a member of the armed forces, including the reserves?", currentScreen);
									break;
									
								case"Q14_US_CITIZEN":
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "resident_alien:usCitizen_DD", validateInput(strHashValue), "14. U.S. Citizen?", currentScreen);
									break;
								case"Q14A_COUNTRY_OF_CITIZENSHIP":
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "resident_alien:countryofCit_DD", validateInput(strHashValue), "a. Country of Citizenship:", currentScreen);
									break;
								case"Q14A_DATE_OF_ENTRY_US":
									blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "resident_alien:EntryDate_EF", validateInput(strHashValue), "Date of Entry Into the U.S.:", currentScreen);
									break;
								case"14B_RESIDENCY_STATUS":
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "resident_alien:ResidencyType_DD", validateInput(strHashValue), "b. Residency Status:", currentScreen);
									break;
									
								case"14B_EXPIRATION_DATE":
									blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "resident_alien:expirationDate_EF", validateInput(strHashValue), "Expiration Date:", currentScreen);
									break;
								case"Q14C_VISA_NUMBER":
									blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "resident_alien:NonResident_EF", validateInput(strHashValue), "Visa #:", currentScreen);
									break;
								case"Q14C_VISA_TYPE":
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "resident_alien:visaType_EF", validateInput(strHashValue), "VISA_TYPE", currentScreen);
									break;
								case"Q14C_I94_EXPIRATION_DATE":
									blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "resident_alien:i94Expiration_EF", validateInput(strHashValue), "I-94 Expiration Date:", currentScreen);
									break;
								case"Q14C_PASSPORT_NUMBER":
									blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "resident_alien:passportNo_EF", validateInput(strHashValue), "Passport No.::", currentScreen);
									break;
									
								case"ADD":
									blnStatus = setValue(WebControl.BUTTON, IdentifyBy.NAME, "resident_alien:drAdd_CButton", validateInput(strHashValue), "ADD", currentScreen);
									break;
								case "default1":
									ReportGenerator.generateTestStep(false, currentScreen, "Field Navigation", strHashKey + " field not available in the current method.", false);
									break;
								} //end of switch
								if(!blnStatus) break;
							} //end of while
						}
						else {
							ReportGenerator.generateTestStep(false, currentScreen, "Switch to Frame", "Failed to switch frames " + strFrames.replaceAll(GlobalData.STRING_SEPARATOR, " > "), false);
							blnStatus = false;
						}
						objEnum = null;
							
					} catch(Exception objExp) {
						ReportGenerator.generateTestStep(false, currentScreen, "Exception occured", "Exception is - " + objExp.getMessage(), false);
						blnStatus = false;
					}
					return blnStatus;
				}
				
				
				//Function For OwnerIncome flow
				private static boolean OwnerIncome(OrderedHashtable objTestData) {
					boolean blnStatus = false;
					String strHashKey = "", strHashValue = "";
					try {
						String strFrames = "FWin0" + GlobalData.STRING_SEPARATOR + "Content0";
						Enumeration objEnum = objTestData.enumerateKeys();
						if(switchToFrame(strFrames, false) && waitForPageLoad(MAX_TIMEOUT)) {
							
							while(objEnum.hasMoreElements()) {
								//blnStatus = false;
								strHashKey = objEnum.nextElement().toString();
								strHashValue = objTestData.get(strHashKey).toString();

								switch(strHashKey) {
								
								case"GROSS_EARNED_ANNUAL_INCOME":
									blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "resident_alien:grossEarnedIncomePI1_EF", validateInput(strHashValue), "Gross Earned Annual Income:", currentScreen);
									break;
								case"GROSS_UNEARNED_ANNUAL_INCOME":
									blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "resident_alien:grossUnearnedIncomePI1_EF", validateInput(strHashValue), "Gross Unearned Annual Income:", currentScreen);
									break;
								case"GROSS_ANNUAL_INCOME":
									blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "resident_alien:grossHouseIncomePI1_EF", validateInput(strHashValue), "Gross Annual Income:", currentScreen);
									break;
								case"TOTAL_NET_WORTH":
									blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "resident_alien:totalNetworthPI1_EF", validateInput(strHashValue), "Total Net Worth:", currentScreen);
									break;
								case"ADD":
									blnStatus = setValue(WebControl.BUTTON, IdentifyBy.NAME, "resident_alien:drAdd_CButton", validateInput(strHashValue), "ADD", currentScreen);
									break;
								case "default1":
									ReportGenerator.generateTestStep(false, currentScreen, "Field Navigation", strHashKey + " field not available in the current method.", false);
									break;
								
								} //end of switch
								if(!blnStatus) break;
							} //end of while
						}
						else {
							ReportGenerator.generateTestStep(false, currentScreen, "Switch to Frame", "Failed to switch frames " + strFrames.replaceAll(GlobalData.STRING_SEPARATOR, " > "), false);
							blnStatus = false;
						}
						objEnum = null;
							
					} catch(Exception objExp) {
						ReportGenerator.generateTestStep(false, currentScreen, "Exception occured", "Exception is - " + objExp.getMessage(), false);
						blnStatus = false;
					}
					return blnStatus;
				}
				
				//Function For OwnerPersonalDetails flow
				private static boolean OwnerPersonalDetails(OrderedHashtable objTestData) {
					boolean blnStatus = false;
					String strHashKey = "", strHashValue = "";
					try {
						String strFrames = "FWin0" + GlobalData.STRING_SEPARATOR + "Content0";
						Enumeration objEnum = objTestData.enumerateKeys();
						if(switchToFrame(strFrames, false) && waitForPageLoad(MAX_TIMEOUT)) {
							
							while(objEnum.hasMoreElements()) {
								//blnStatus = false;
								strHashKey = objEnum.nextElement().toString();
								strHashValue = objTestData.get(strHashKey).toString();

								switch(strHashKey) {
			
								case"CHARITABLE_GIFTING":
									blnStatus = setValue(WebControl.UNIQUE_CHECKBOX, IdentifyBy.NAME, "form_UlPersonDetails:personalPurposeOfInsurance_DD", getAppCheckboxValues(strHashKey, strHashValue), "Charitable / Gifting", currentScreen);
									break;
								case"ESTATE_PLANNING":
									blnStatus = setValue(WebControl.UNIQUE_CHECKBOX, IdentifyBy.NAME, "form_UlPersonDetails:personalPurposeOfInsurance_DD", getAppCheckboxValues(strHashKey, strHashValue), " Estate Planning", currentScreen);
									break;
								case"FAMILY_PROTECTION":
									blnStatus = setValue(WebControl.UNIQUE_CHECKBOX, IdentifyBy.NAME, "form_UlPersonDetails:personalPurposeOfInsurance_DD", getAppCheckboxValues(strHashKey, strHashValue), " Family Protection/Income Replacement", currentScreen);
									break;
								case"MORTGAGE":
									blnStatus = setValue(WebControl.UNIQUE_CHECKBOX, IdentifyBy.NAME, "form_UlPersonDetails:personalPurposeOfInsurance_DD", getAppCheckboxValues(strHashKey, strHashValue), " Mortgage/Debt repayment", currentScreen);
									break;
								case"OTHER":
									blnStatus = setValue(WebControl.UNIQUE_CHECKBOX, IdentifyBy.NAME, "form_UlPersonDetails:personalPurposeOfInsurance_DD", getAppCheckboxValues(strHashKey, strHashValue), "Other", currentScreen);
									break;
								case"ADD":
									blnStatus = setValue(WebControl.BUTTON, IdentifyBy.NAME, "form_UlPersonDetails:drAdd", validateInput(strHashValue), "ADD", currentScreen);
									break;
								case "default1":
									ReportGenerator.generateTestStep(false, currentScreen, "Field Navigation", strHashKey + " field not available in the current method.", false);
									break;
								
								} //end of switch
								if(!blnStatus) break;
							} //end of while
						}
						else {
							ReportGenerator.generateTestStep(false, currentScreen, "Switch to Frame", "Failed to switch frames " + strFrames.replaceAll(GlobalData.STRING_SEPARATOR, " > "), false);
							blnStatus = false;
						}
						objEnum = null;
							
					} catch(Exception objExp) {
						ReportGenerator.generateTestStep(false, currentScreen, "Exception occured", "Exception is - " + objExp.getMessage(), false);
						blnStatus = false;
					}
					return blnStatus;
				}
				
				//Function For OwnerBusinessDetails flow
				private static boolean OwnerBusinessDetails(OrderedHashtable objTestData) {
					boolean blnStatus = false;
					String strHashKey = "", strHashValue = "";
					try {
						String strFrames = "FWin0" + GlobalData.STRING_SEPARATOR + "Content0";
						Enumeration objEnum = objTestData.enumerateKeys();
						if(switchToFrame(strFrames, false) && waitForPageLoad(MAX_TIMEOUT)) {
							
							while(objEnum.hasMoreElements()) {
								//blnStatus = false;
								strHashKey = objEnum.nextElement().toString();
								strHashValue = objTestData.get(strHashKey).toString();

								switch(strHashKey) {
								case"BUY_SELL":
								blnStatus = setValue(WebControl.UNIQUE_CHECKBOX, IdentifyBy.NAME, "form_UlBusinessDetails:businessPurposeOfInsurance_DD", getAppCheckboxValues(strHashKey, strHashValue), " Buy / Sell", currentScreen);
								break;
								case"DEFERRED_COMP":
									blnStatus = setValue(WebControl.UNIQUE_CHECKBOX, IdentifyBy.NAME, "form_UlBusinessDetails:businessPurposeOfInsurance_DD", getAppCheckboxValues(strHashKey, strHashValue), " Deferred Comp", currentScreen);
									break;
								case"KEY_PERSON":
									blnStatus = setValue(WebControl.UNIQUE_CHECKBOX, IdentifyBy.NAME, "form_UlBusinessDetails:businessPurposeOfInsurance_DD", getAppCheckboxValues(strHashKey, strHashValue), " Key Person", currentScreen);
									break;
									
									case"LOAN__INDEMNIFICATION":
										blnStatus = setValue(WebControl.UNIQUE_CHECKBOX, IdentifyBy.NAME, "form_UlBusinessDetails:businessPurposeOfInsurance_DD", getAppCheckboxValues(strHashKey, strHashValue), " Loan indemnification", currentScreen);
									break;
								case"OTHER":
									blnStatus = setValue(WebControl.UNIQUE_CHECKBOX, IdentifyBy.NAME, "form_UlBusinessDetails:businessPurposeOfInsurance_DD", getAppCheckboxValues(strHashKey, strHashValue), " Other", currentScreen);
									break;
								case"FILED_FOR_BANKRUPTCY":
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_UlBusinessDetails:businessPastQuestion_DD", validateInput(strHashValue), "27g. Has the business filed for bankruptcy and/or reorganization in the past 5 years?", currentScreen);
									break;
								
								case"ADD":
									blnStatus = setValue(WebControl.BUTTON, IdentifyBy.NAME, "form_UlBusinessDetails:drAdd", validateInput(strHashValue), "ADD", currentScreen);
									break;
								case "default1":
									ReportGenerator.generateTestStep(false, currentScreen, "Field Navigation", strHashKey + " field not available in the current method.", false);
									break;
									
								} //end of switch
								if(!blnStatus) break;
							} //end of while
						}
						else {
							ReportGenerator.generateTestStep(false, currentScreen, "Switch to Frame", "Failed to switch frames " + strFrames.replaceAll(GlobalData.STRING_SEPARATOR, " > "), false);
							blnStatus = false;
						}
						objEnum = null;
							
					} catch(Exception objExp) {
						ReportGenerator.generateTestStep(false, currentScreen, "Exception occured", "Exception is - " + objExp.getMessage(), false);
						blnStatus = false;
					}
					return blnStatus;
				}
				
				
				//Function For OwnerSourceOfFunds flow
				private static boolean OwnerSourceOfFunds(OrderedHashtable objTestData) {
					boolean blnStatus = false;
					String strHashKey = "", strHashValue = "";
					try {
						String strFrames = "FWin0" + GlobalData.STRING_SEPARATOR + "Content0";
						Enumeration objEnum = objTestData.enumerateKeys();
						if(switchToFrame(strFrames, false) && waitForPageLoad(MAX_TIMEOUT)) {
							
							while(objEnum.hasMoreElements()) {
								//blnStatus = false;
								strHashKey = objEnum.nextElement().toString();
								strHashValue = objTestData.get(strHashKey).toString();

								switch(strHashKey) {
			         
								case"Q28":
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_UlPersonDetails:srcOfFundQuestion_DD", validateInput(strHashValue), "Question :28", currentScreen);
									break;
								case"Q29_INCOME":
									blnStatus = setValue(WebControl.UNIQUE_CHECKBOX, IdentifyBy.NAME, "form_UlPersonDetails:personalPurposeOfInsurance_DD", getAppCheckboxValues(strHashKey, strHashValue), " Income", currentScreen);
									break;
								case"Q29_INVESTMENTS":
									blnStatus = setValue(WebControl.UNIQUE_CHECKBOX, IdentifyBy.NAME, "form_UlPersonDetails:personalPurposeOfInsurance_DD", getAppCheckboxValues(strHashKey, strHashValue), " Investments/Savings", currentScreen);
									break;
								case"Q29_LOANS":
									blnStatus = setValue(WebControl.UNIQUE_CHECKBOX, IdentifyBy.NAME, "form_UlPersonDetails:personalPurposeOfInsurance_DD", getAppCheckboxValues(strHashKey, strHashValue), " Loans", currentScreen);
									break;
								case"Q29_GIFTS":
									blnStatus = setValue(WebControl.UNIQUE_CHECKBOX, IdentifyBy.NAME, "form_UlPersonDetails:personalPurposeOfInsurance_DD", getAppCheckboxValues(strHashKey, strHashValue), " Gifts/Inheritance", currentScreen);
									break;
								case"Q29_SETTLED_CONTRACTS":
									blnStatus = setValue(WebControl.UNIQUE_CHECKBOX, IdentifyBy.NAME, "form_UlPersonDetails:personalPurposeOfInsurance_DD", getAppCheckboxValues(strHashKey, strHashValue), " Settled Contracts", currentScreen);
									break;
								case"Q29_OTHER":
									blnStatus = setValue(WebControl.UNIQUE_CHECKBOX, IdentifyBy.NAME, "form_UlPersonDetails:personalPurposeOfInsurance_DD", getAppCheckboxValues(strHashKey, strHashValue), " Other", currentScreen);
									break;
								case"Q30":
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_UlPersonDetails:srcOfFundQuestion30_DD", validateInput(strHashValue), "Question :30", currentScreen);
									break;	
								case"Q31":
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_UlPersonDetails:srcOfFundQuestion31_DD", validateInput(strHashValue), "Question :31", currentScreen);
									break;
								case"ADD":
									
									blnStatus = setValue(WebControl.BUTTON, IdentifyBy.NAME, "form_UlPersonDetails:drAdd", validateInput(strHashValue), "ADD", currentScreen);
								break;
								case "default1":
									ReportGenerator.generateTestStep(false, currentScreen, "Field Navigation", strHashKey + " field not available in the current method.", false);
									break;		
								
								
								} //end of switch
								if(!blnStatus) break;
							} //end of while
						}
						else {
							ReportGenerator.generateTestStep(false, currentScreen, "Switch to Frame", "Failed to switch frames " + strFrames.replaceAll(GlobalData.STRING_SEPARATOR, " > "), false);
							blnStatus = false;
						}
						objEnum = null;
							
					} catch(Exception objExp) {
						ReportGenerator.generateTestStep(false, currentScreen, "Exception occured", "Exception is - " + objExp.getMessage(), false);
						blnStatus = false;
					}
					return blnStatus;
				}
				
				
				//Function For OwnerOtherInsurance flow
				private static boolean OwnerOtherInsurance(OrderedHashtable objTestData) {
					boolean blnStatus = false;
					String strHashKey = "", strHashValue = "";
					try {
						String strFrames = "FWin0" + GlobalData.STRING_SEPARATOR + "Content0";
						Enumeration objEnum = objTestData.enumerateKeys();
						if(switchToFrame(strFrames, false) && waitForPageLoad(MAX_TIMEOUT)) {
							
							while(objEnum.hasMoreElements()) {
								//blnStatus = false;
								strHashKey = objEnum.nextElement().toString();
								strHashValue = objTestData.get(strHashKey).toString();

								switch(strHashKey) {
			   
								case"Q16A":
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "resident_alien:Q16aAns_DD", validateInput(strHashValue), "Question :61a", currentScreen);
									break;
								case"Q16B":
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "resident_alien:Q16bAns_DD", validateInput(strHashValue), "Question: 61b", currentScreen);
									break;
								case"NAME_OF_COMPANY":
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "resident_alien:otherInsuranceCompanyName_DD", validateInput(strHashValue), "NAME_OF_COMPANY", currentScreen);
									break;
								case"FACE_AMOUNT_RIDERS":
									blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "resident_alien:faceAmountRider_EF", validateInput(strHashValue), "Face Amount plus Riders:", currentScreen);
									break;
									
								case"YEAR_INSURED":
									blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "resident_alien:yearIssued_EF", validateInput(strHashValue), "Year Issued:", currentScreen);
									break;
								case"POLICY_CONTRACT":
									blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "resident_alien:contractNumber_EF", validateInput(strHashValue), "Policy / Contract #:", currentScreen);
									break;
								case"POLICY_TYPE":
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "resident_alien:lifeProposedInsurance_EF", validateInput(strHashValue), " Policy/Contract Type:", currentScreen);
									break;
								case"TO_BE_REPLACED":
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "resident_alien:replacedOrEffected_DD", validateInput(strHashValue), "To be replaced changed or affected?", currentScreen);
									break;
								case"1035_EXCHANGE":
								blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "resident_alien:exchangeQuestion_DD", validateInput(strHashValue), "1035 Exchange?", currentScreen);
									break;
									
								case"PRODUCT_TYPE":
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "resident_alien:ProductType_DD", validateInput(strHashValue), "PRODUCT_TYPE", currentScreen);
									break;
								
								case"ADD_DETAILS":
									blnStatus = setValue(WebControl.BUTTON, IdentifyBy.NAME, "resident_alien:lifeOtherInsuranceAdd_CButton", validateInput(strHashValue), "ADD", currentScreen);
									break;
									
								case"ADD":
									blnStatus = setValue(WebControl.BUTTON, IdentifyBy.NAME, "resident_alien:Add_CButton", validateInput(strHashValue), "ADD", currentScreen);
									break;
								case "default1":
									ReportGenerator.generateTestStep(false, currentScreen, "Field Navigation", strHashKey + " field not available in the current method.", false);
									break;
								
								} //end of switch
								if(!blnStatus) break;
							} //end of while
						}
						else {
							ReportGenerator.generateTestStep(false, currentScreen, "Switch to Frame", "Failed to switch frames " + strFrames.replaceAll(GlobalData.STRING_SEPARATOR, " > "), false);
							blnStatus = false;
						}
						objEnum = null;
							
					} catch(Exception objExp) {
						ReportGenerator.generateTestStep(false, currentScreen, "Exception occured", "Exception is - " + objExp.getMessage(), false);
						blnStatus = false;
					}
					return blnStatus;
				}
				
				
				//Function For OwnerFATCA flow
				private static boolean OwnerFATCA(OrderedHashtable objTestData) {
					boolean blnStatus = false;
					String strHashKey = "", strHashValue = "";
					try {
						String strFrames = "FWin0" + GlobalData.STRING_SEPARATOR + "Content0";
						Enumeration objEnum = objTestData.enumerateKeys();
						if(switchToFrame(strFrames, false) && waitForPageLoad(MAX_TIMEOUT)) {
							
							while(objEnum.hasMoreElements()) {
								//blnStatus = false;
								strHashKey = objEnum.nextElement().toString();
								strHashValue = objTestData.get(strHashKey).toString();

								switch(strHashKey) {
			   
								case"W8_RECEIVED":
									blnStatus = setValue(WebControl.CHECKBOX, IdentifyBy.NAME, "form_UlFATCADetails:FATCAW8Form_CB", validateInput(strHashValue), "W-8 Received", currentScreen);
									break;
								case"W9_RECEIVED":
									blnStatus = setValue(WebControl.CHECKBOX, IdentifyBy.NAME, "form_UlFATCADetails:FATCAW9Form_CB", validateInput(strHashValue), "W-9 Received", currentScreen);
									break;
								case"GIIN":
									blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_UlFATCADetails:GlobalIntermediaryId", validateInput(strHashValue), "GIIN:", currentScreen);
									break;
								case"FOREIGN_TAX_ID":
									blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_UlFATCADetails:ForeignTaxPay", validateInput(strHashValue), "FOREIGN_TAX_ID", currentScreen);
									break;
								case"SIGNED_DATE":
									blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_UlFATCADetails:FATCASignDate_EF", validateInput(strHashValue), "SIGNED_DATE", currentScreen);
									break;
								case"OVERRIDE_FATCA":
									blnStatus = setValue(WebControl.CHECKBOX, IdentifyBy.NAME, "form_UlFATCADetails:OverrideFatcaInd_CB", validateInput(strHashValue), "OVERRIDE_FATCA", currentScreen);
									break;
								case"FATCA_INDICATOR":
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_UlFATCADetails:FATCAInd_DD", validateInput(strHashValue), "FATCA_INDICATOR", currentScreen);
									break;
								case"ADD":
									blnStatus = setValue(WebControl.BUTTON, IdentifyBy.NAME, "form_UlFATCADetails:drAdd", validateInput(strHashValue), "ADD", currentScreen);
									break;
								case "default1":
									ReportGenerator.generateTestStep(false, currentScreen, "Field Navigation", strHashKey + " field not available in the current method.", false);
									break;
								} //end of switch
								if(!blnStatus) break;
							} //end of while
						}
						else {
							ReportGenerator.generateTestStep(false, currentScreen, "Switch to Frame", "Failed to switch frames " + strFrames.replaceAll(GlobalData.STRING_SEPARATOR, " > "), false);
							blnStatus = false;
						}
						objEnum = null;
							
					} catch(Exception objExp) {
						ReportGenerator.generateTestStep(false, currentScreen, "Exception occured", "Exception is - " + objExp.getMessage(), false);
						blnStatus = false;
					}
					return blnStatus;
				}
				
				

				//Function For MedicalPI flow
				private static boolean MedicalPI(OrderedHashtable objTestData) {
					boolean blnStatus = false;
					String strHashKey = "", strHashValue = "";
					try {
						String strFrames = "mainContentFrame" + GlobalData.STRING_SEPARATOR + "contentRightFrame" + GlobalData.STRING_SEPARATOR + "file" + GlobalData.STRING_SEPARATOR + "file";
						Enumeration objEnum = objTestData.enumerateKeys();
						if(switchToFrame(strFrames, false) && waitForPageLoad(MAX_TIMEOUT)) {
							
							while(objEnum.hasMoreElements()) {
								//blnStatus = false;
								strHashKey = objEnum.nextElement().toString();
								strHashValue = objTestData.get(strHashKey).toString();

								switch(strHashKey) {
																										

								case"HEIGHT_FEET_INCHES":										
									blnStatus = setValue(WebControl.RADIOBOX, IdentifyBy.NAME, "form_ax2Medical:ax2PropsedInsuredInfo:height_RB", getAppRadioValues(strHashKey, strHashValue), " Feet and Inches/Inches", currentScreen);
									break;
								case"HEIGHT_FI_VALUE1":
									blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_ax2Medical:ax2PropsedInsuredInfo:insuredHeightFeetandInch1_EF", validateInput(strHashValue), " Feet and Inches", currentScreen);
									break;
								case"HEIGHT_FI_VALUE2":
									blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_ax2Medical:ax2PropsedInsuredInfo:insuredHeightFeetandInch2_EF", validateInput(strHashValue), " Feet and Inches", currentScreen);
									break;
								case"HEIGHT_INCHES_VALUE":
									blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_ax2Medical:ax2PropsedInsuredInfo:jointInsuredHeightInch", validateInput(strHashValue), " Inches", currentScreen);
									break;
								case"WEIGHT":
									blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_ax2Medical:ax2PropsedInsuredInfo:insuredWeight_EF", validateInput(strHashValue), "WEIGHT", currentScreen);
									break;
									
								case"Q4":
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_ax2Medical:ax2PropsedInsuredInfo:propIns1Ques4_DD", validateInput(strHashValue), "Question : 4", currentScreen);
									break;
								case"POUNDS_LOSS":
									blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_ax2Medical:ax2PropsedInsuredInfo:poundLost_EF", validateInput(strHashValue), "Pounds Lost:", currentScreen);
									break;
								case"LOSS_REASON":
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_ax2Medical:ax2PropsedInsuredInfo:weightChangeReason_DD", validateInput(strHashValue), "Reason: ", currentScreen);
									break;
									
								case"Q5":
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_ax2Medical:ax2PhysicianInfo:persPhysicianQues5_DD", validateInput(strHashValue), "5. Does the Proposed Insured have a personal physician?", currentScreen);
									
									break;
								case"ADD_DOCTOR":
									blnStatus = setValue(WebControl.BUTTON, IdentifyBy.NAME, "form_ax2Medical:ax2PhysicianInfo:persPhysicianQues5_CButton", validateInput(strHashValue), "Add Doctor", currentScreen);
									break;
								case"Q9A_DATE":
									blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_ax2Medical:ax2PhysicianInfo:persPhysicianQues9a_EF", validateInput(strHashValue), "9a. Date:", currentScreen);
									break;
									
								case"Q9B_REASON_UNANSWERED":
									blnStatus = setValue(WebControl.CHECKBOX, IdentifyBy.NAME, "form_ax2Medical:ax2PhysicianInfo:persPhysicianQues9_CB", validateInput(strHashValue), "9b. Reason:", currentScreen);
									break;
									
								case"IMPAIRMENT_SEARCH":
									blnStatus = setValue(WebControl.BUTTON, IdentifyBy.NAME, "form_ax2Medical:ax2PhysicianInfo:persPhysicianQues9b_CButton", validateInput(strHashValue), "IMPAIRMENT_SEARCH", currentScreen);
									break;
								case"Q10":
									blnStatus = setValue(WebControl.RADIOBOX, IdentifyBy.NAME, "form_ax2Medical:ax2PhysicianInfo:persPhysicianQues10_RB", getAppRadioValues(strHashKey, strHashValue), " None/Answered/ Unanswered", currentScreen);
									break;
									
								case"ADOPTED":
									blnStatus = setValue(WebControl.CHECKBOX, IdentifyBy.NAME, "form_ax2Medical:ax2FamilyInfo:adopted_CB", validateInput(strHashValue), "ADOPTED", currentScreen);
									
									break;
								case"Q11_RELATIONSHIP":
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_ax2Medical:ax2FamilyInfo:relationship_DD", validateInput(strHashValue), "RELATIONSHIP", currentScreen);
									break;
								case"Q11_UNKNOWN":
									blnStatus = setValue(WebControl.CHECKBOX, IdentifyBy.NAME, "form_ax2Medical:ax2FamilyInfo:unKnown_CB", validateInput(strHashValue), "UNKNOWN", currentScreen);
									break;
								case"Q11_AGE_IF_LIVING":
									blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_ax2Medical:ax2FamilyInfo:ageIfLiving_EF", validateInput(strHashValue), "AGE_IF_LIVING", currentScreen);
									break;
									
								case"Q11_AGE_AT_DEATH":
									blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_ax2Medical:ax2FamilyInfo:ageAtDeath_EF", validateInput(strHashValue), "AGE_AT_DEATH", currentScreen);
									break;
								case"Q11_ADD":
									blnStatus = setValue(WebControl.BUTTON, IdentifyBy.NAME, "form_ax2Medical:ax2FamilyInfo:familDetailsButtonAdd_CButton", validateInput(strHashValue), "ADD", currentScreen);
									break;
								case"Q12":
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_ax2Medical:ax2MedicalInfomation:medicalInfoQues12_DD", validateInput(strHashValue), "Question :12", currentScreen);
									break;
								case"Q13":
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_ax2Medical:ax2MedicalInfomation:medicalInfoQues13_DD", validateInput(strHashValue), "Question :13", currentScreen);
									break;
									
								case"Q14":
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_ax2Medical:ax2MedicalInfomation:medicalSuppQuestionsTablePane1:0:Q55Ans_DD1", validateInput(strHashValue), "Question :14", currentScreen);
									break;
								case"Q15":
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_ax2Medical:ax2MedicalInfomation:medicalSuppQuestionsTablePane1:1:Q55Ans_DD1", validateInput(strHashValue), "Question :15", currentScreen);
									break;
								case"Q16A":
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_ax2Medical:ax2MedicalInfomation:medicalSuppQuestionsTablePane1:2:Q55Ans_DD1", validateInput(strHashValue), "Question :16A", currentScreen);
									break;
								case"Q16B":
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_ax2Medical:ax2MedicalInfomation:medicalSuppQuestionsTablePane1:3:Q55Ans_DD1", validateInput(strHashValue), "Question :16B", currentScreen);
									break;
									
								case"Q16C":
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_ax2Medical:ax2MedicalInfomation:medicalSuppQuestionsTablePane1:4:Q55Ans_DD1", validateInput(strHashValue), "Question :16C", currentScreen);
									break;
								case"Q16D":
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_ax2Medical:ax2MedicalInfomation:medicalSuppQuestionsTablePane1:5:Q55Ans_DD1", validateInput(strHashValue), "Question :16D", currentScreen);
									break;
								case"Q16E":
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_ax2Medical:ax2MedicalInfomation:medicalSuppQuestionsTablePane1:6:Q55Ans_DD1", validateInput(strHashValue), "Question :16E", currentScreen);
									break;
								case"Q17":
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_ax2Medical:ax2MedicalInfomation:medicalSuppQuestionsTablePane2:0:Q55Ans_DD2", validateInput(strHashValue), "Question :17", currentScreen);
									break;
								case"Q18A":
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_ax2Medical:ax2MedicalInfomation:medicalSuppQuestionsTablePane2:1:Q55Ans_DD2", validateInput(strHashValue), "Question :18A", currentScreen);
									break;
								case"Q18B":
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_ax2Medical:ax2MedicalInfomation:medicalSuppQuestionsTablePane2:2:Q55Ans_DD2", validateInput(strHashValue), "Question :18B", currentScreen);
									break;
								case"Q19A":
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_ax2Medical:ax2MedicalInfomation:medicalSuppQuestionsTablePane2:3:Q55Ans_DD2", validateInput(strHashValue), "Question :19A", currentScreen);
									break;
								case"Q19B":
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_ax2Medical:ax2MedicalInfomation:medicalSuppQuestionsTablePane2:4:Q55Ans_DD2", validateInput(strHashValue), "Question :19B", currentScreen);
									break;
								case "default1":
									ReportGenerator.generateTestStep(false, currentScreen, "Field Navigation", strHashKey + " field not available in the current method.", false);
									break;
					
									
								} //end of switch
								if(!blnStatus) break;
							} //end of while
						}
						else {
							ReportGenerator.generateTestStep(false, currentScreen, "Switch to Frame", "Failed to switch frames " + strFrames.replaceAll(GlobalData.STRING_SEPARATOR, " > "), false);
							blnStatus = false;
						}
						objEnum = null;
							
					} catch(Exception objExp) {
						ReportGenerator.generateTestStep(false, currentScreen, "Exception occured", "Exception is - " + objExp.getMessage(), false);
						blnStatus = false;
					}
					return blnStatus;
				}
				
				
				
				//Function For MedicalJI flow
				private static boolean MedicalJI(OrderedHashtable objTestData) {
					boolean blnStatus = false;
					String strHashKey = "", strHashValue = "";
					try {
						String strFrames = "mainContentFrame" + GlobalData.STRING_SEPARATOR + "contentRightFrame" + GlobalData.STRING_SEPARATOR + "file" + GlobalData.STRING_SEPARATOR + "file";
						Enumeration objEnum = objTestData.enumerateKeys();
						if(switchToFrame(strFrames, false) && waitForPageLoad(MAX_TIMEOUT)) {
							
							while(objEnum.hasMoreElements()) {
								//blnStatus = false;
								strHashKey = objEnum.nextElement().toString();
								strHashValue = objTestData.get(strHashKey).toString();

								switch(strHashKey) {
				
								case"HEIGHT_FEET_INCHES":                                       
									blnStatus = setValue(WebControl.RADIOBOX, IdentifyBy.NAME, "form_ax2JIMedical:ax2PropsedInsuredInfo:height_RB", getAppRadioValues(strHashKey, strHashValue), " Feet and Inches/Inches", currentScreen);
									break;
								case"HEIGHT_FI_VALUE1":
									blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_ax2JIMedical:ax2PropsedInsuredInfo:insuredHeightFeetandInch1_EF", validateInput(strHashValue), " Feet and Inches", currentScreen);
									break;
								case"HEIGHT_FI_VALUE2":
									blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_ax2JIMedical:ax2PropsedInsuredInfo:insuredHeightFeetandInch2_EF", validateInput(strHashValue), " Feet and Inches", currentScreen);
									break;
								case"HEIGHT_INCHES_VALUE":
									blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_ax2JIMedical:ax2PropsedInsuredInfo:jointInsuredHeightInch", validateInput(strHashValue), " Inches", currentScreen);
									break;
								case"WEIGHT":
									blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_ax2JIMedical:ax2PropsedInsuredInfo:insuredWeight_EF", validateInput(strHashValue), "WEIGHT", currentScreen);
									break;
									
								case"Q4":
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_ax2JIMedical:ax2PropsedInsuredInfo:propIns1Ques4_DD", validateInput(strHashValue), "Question : 4", currentScreen);
									break;
								case"POUNDS_LOSS":
									blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_ax2JIMedical:ax2PropsedInsuredInfo:poundLost_EF", validateInput(strHashValue), "Pounds Lost:", currentScreen);
									break;
								case"LOSS_REASON":
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_ax2JIMedical:ax2PropsedInsuredInfo:weightChangeReason_DD", validateInput(strHashValue), "Reason: ", currentScreen);
									break;
									
								case"Q5":
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_ax2JIMedical:ax2PhysicianInfo:persPhysicianQues5_DD", validateInput(strHashValue), "5. Does the Proposed Insured have a personal physician?", currentScreen);
									
									break;
								case"ADD_DOCTOR":
									blnStatus = setValue(WebControl.BUTTON, IdentifyBy.NAME, "form_ax2JIMedical:ax2PhysicianInfo:persPhysicianQues5_CButton", validateInput(strHashValue), "Add Doctor", currentScreen);
									break;
								case"Q9A_DATE":
									blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_ax2JIMedical:ax2PhysicianInfo:persPhysicianQues9a_EF", validateInput(strHashValue), "9a. Date:", currentScreen);
									break;
									
								case"Q9B_REASON_UNANSWERED":
									blnStatus = setValue(WebControl.CHECKBOX, IdentifyBy.NAME, "form_ax2JIMedical:ax2PhysicianInfo:persPhysicianQues9_CB", validateInput(strHashValue), "9b. Reason:", currentScreen);
									break;
									
								case"IMPAIRMENT_SEARCH":
									blnStatus = setValue(WebControl.BUTTON, IdentifyBy.NAME, "form_ax2JIMedical:ax2PhysicianInfo:persPhysicianQues9b_CButton", validateInput(strHashValue), "IMPAIRMENT_SEARCH", currentScreen);
									break;
								case"Q10":
									blnStatus = setValue(WebControl.RADIOBOX, IdentifyBy.NAME, "form_ax2JIMedical:ax2PhysicianInfo:persPhysicianQues10_RB", getAppRadioValues(strHashKey, strHashValue), " None/Answered/ Unanswered", currentScreen);
									break;
									
								case"ADOPTED":
									blnStatus = setValue(WebControl.CHECKBOX, IdentifyBy.NAME, "form_ax2JIMedical:ax2FamilyInfo:adopted_CB", validateInput(strHashValue), "ADOPTED", currentScreen);
									
									break;
								case"Q11_RELATIONSHIP":
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_ax2JIMedical:ax2FamilyInfo:relationship_DD", validateInput(strHashValue), "RELATIONSHIP", currentScreen);
									break;
								case"Q11_UNKNOWN":
									blnStatus = setValue(WebControl.CHECKBOX, IdentifyBy.NAME, "form_ax2JIMedical:ax2FamilyInfo:unKnown_CB", validateInput(strHashValue), "UNKNOWN", currentScreen);
									break;
								case"Q11_AGE_IF_LIVING":
									blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_ax2JIMedical:ax2FamilyInfo:ageIfLiving_EF", validateInput(strHashValue), "AGE_IF_LIVING", currentScreen);
									break;
									
								case"Q11_AGE_AT_DEATH":
									blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_ax2JIMedical:ax2FamilyInfo:ageAtDeath_EF", validateInput(strHashValue), "AGE_AT_DEATH", currentScreen);
									break;
								case"Q11_ADD":
									blnStatus = setValue(WebControl.BUTTON, IdentifyBy.NAME, "form_ax2JIMedical:ax2FamilyInfo:familDetailsButtonAdd_CButton", validateInput(strHashValue), "ADD", currentScreen);
									break;
								case"Q12":
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_ax2JIMedical:ax2MedicalInfomation:medicalInfoQues12_DD", validateInput(strHashValue), "Question :12", currentScreen);
									break;
								case"Q13":
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_ax2JIMedical:ax2MedicalInfomation:medicalInfoQues13_DD", validateInput(strHashValue), "Question :13", currentScreen);
									break;
									
								case"Q14":
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_ax2JIMedical:ax2MedicalInfomation:medicalSuppQuestionsTablePane1:0:Q55Ans_DD1", validateInput(strHashValue), "Question :14", currentScreen);
									break;
								case"Q15":
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_ax2JIMedical:ax2MedicalInfomation:medicalSuppQuestionsTablePane1:1:Q55Ans_DD1", validateInput(strHashValue), "Question :15", currentScreen);
									break;
								case"Q16A":
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_ax2JIMedical:ax2MedicalInfomation:medicalSuppQuestionsTablePane1:2:Q55Ans_DD1", validateInput(strHashValue), "Question :16A", currentScreen);
									break;
								case"Q16B":
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_ax2JIMedical:ax2MedicalInfomation:medicalSuppQuestionsTablePane1:3:Q55Ans_DD1", validateInput(strHashValue), "Question :16B", currentScreen);
									break;
									
								case"Q16C":
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_ax2JIMedical:ax2MedicalInfomation:medicalSuppQuestionsTablePane1:4:Q55Ans_DD1", validateInput(strHashValue), "Question :16C", currentScreen);
									break;
								case"Q16D":
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_ax2JIMedical:ax2MedicalInfomation:medicalSuppQuestionsTablePane1:5:Q55Ans_DD1", validateInput(strHashValue), "Question :16D", currentScreen);
									break;
								case"Q16E":
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_ax2JIMedical:ax2MedicalInfomation:medicalSuppQuestionsTablePane1:6:Q55Ans_DD1", validateInput(strHashValue), "Question :16E", currentScreen);
									break;
								case"Q17":
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_ax2JIMedical:ax2MedicalInfomation:medicalSuppQuestionsTablePane2:0:Q55Ans_DD2", validateInput(strHashValue), "Question :17", currentScreen);
									break;
								case"Q18A":
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_ax2JIMedical:ax2MedicalInfomation:medicalSuppQuestionsTablePane2:1:Q55Ans_DD2", validateInput(strHashValue), "Question :18A", currentScreen);
									break;
								case"Q18B":
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_ax2JIMedical:ax2MedicalInfomation:medicalSuppQuestionsTablePane2:2:Q55Ans_DD2", validateInput(strHashValue), "Question :18B", currentScreen);
									break;
								case"Q19A":
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_ax2JIMedical:ax2MedicalInfomation:medicalSuppQuestionsTablePane2:3:Q55Ans_DD2", validateInput(strHashValue), "Question :19A", currentScreen);
									break;
								case"Q19B":                                                 
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_ax2JIMedical:ax2MedicalInfomation:medicalSuppQuestionsTablePane2:4:Q55Ans_DD2", validateInput(strHashValue), "Question :19B", currentScreen);
									break;
								case "default1":
									ReportGenerator.generateTestStep(false, currentScreen, "Field Navigation", strHashKey + " field not available in the current method.", false);
									break;
																								
									
								} //end of switch
								if(!blnStatus) break;
							} //end of while
						}
						else {
							ReportGenerator.generateTestStep(false, currentScreen, "Switch to Frame", "Failed to switch frames " + strFrames.replaceAll(GlobalData.STRING_SEPARATOR, " > "), false);
							blnStatus = false;
						}
						objEnum = null;
							
					} catch(Exception objExp) {
						ReportGenerator.generateTestStep(false, currentScreen, "Exception occured", "Exception is - " + objExp.getMessage(), false);
						blnStatus = false;
					}
					return blnStatus;
				}
				
				//Function For ForeignTravelPI flow
				private static boolean ForeignTravelPI(OrderedHashtable objTestData) {
					boolean blnStatus = false;
					String strHashKey = "", strHashValue = "";
					try {
						String strFrames = "mainContentFrame" + GlobalData.STRING_SEPARATOR + "contentRightFrame" + GlobalData.STRING_SEPARATOR + "file" + GlobalData.STRING_SEPARATOR + "file";
						Enumeration objEnum = objTestData.enumerateKeys();
						if(switchToFrame(strFrames, false) && waitForPageLoad(MAX_TIMEOUT)) {
							
							while(objEnum.hasMoreElements()) {
								//blnStatus = false;
								strHashKey = objEnum.nextElement().toString();
								strHashValue = objTestData.get(strHashKey).toString();

								switch(strHashKey) {
																			

								case"COUNTRY_OF_CITIZENSHIP":
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_ax2FRTS:foreignNationals:pInsured_DT:0:countryofCit_DD", validateInput(strHashValue), "1a. Country of Citizenship:", currentScreen);
									break;
								case"DATE_OF_ENTRY_US":
									blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_ax2FRTS:foreignNationals:pInsured_DT:0:EntryDate_EF", validateInput(strHashValue), "Date of Entry Into the U.S.:", currentScreen);
									break;
								case"RESIDENCY_STATUS":
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_ax2FRTS:foreignNationals:pInsured_DT:0:ResidencyType_DD", validateInput(strHashValue), "1b./1c. Residency Status:", currentScreen);
									break;
								case"EXPIRATION_DATE":
									blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_ax2FRTS:foreignNationals:pInsured_DT:0:expirationDate_EF", validateInput(strHashValue), "Expiration Date:", currentScreen);
									break;
								case"VISA_NUMBER":
									blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_ax2FRTS:foreignNationals:pInsured_DT:0:NonResident_EF", validateInput(strHashValue), "Visa #:", currentScreen);
									break;
								case"VISA_TYPE":
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_ax2FRTS:foreignNationals:pInsured_DT:0:visaType_EF", validateInput(strHashValue), "Visa Type:", currentScreen);
									break;
								case"I94_EXPIRATION_DATE":
									blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_ax2FRTS:foreignNationals:pInsured_DT:0:i94Expiration_EF", validateInput(strHashValue), "I-94 Expiration Date:", currentScreen);
									break;
								case"PASSPORT_NO":
									blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_ax2FRTS:foreignNationals:pInsured_DT:0:passportNo_EF", validateInput(strHashValue), "Passport No.:", currentScreen);
									break;
								case"US_BANK_NAME":
									blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_ax2FRTS:foreignNationals:pInsured_DT:0:bankName_EF", validateInput(strHashValue), "US Bank Name:", currentScreen);
									break;
								case"BANK_ACCOUNT_NUMBER":
									blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_ax2FRTS:foreignNationals:pInsured_DT:0:bankAccountNo_EF", validateInput(strHashValue), "Bank Account Number:", currentScreen);
									break;
								case"SIGNATURE_OF_INSURED":
									blnStatus = setValue(WebControl.CHECKBOX, IdentifyBy.NAME, "form_ax2FRTS:foreignNationals:pInsured_DT:0:signatureProposedIns_CB", validateInput(strHashValue), "Signature of Proposed Insured", currentScreen);
									break;
								case"INSURED_DATE":
									blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_ax2FRTS:foreignNationals:pInsured_DT:0:appliationEntDate_EF", validateInput(strHashValue), "Date:", currentScreen);
									break;
								case"SIGNATURE_OF_AGENT":
									blnStatus = setValue(WebControl.CHECKBOX, IdentifyBy.NAME, "form_ax2FRTS:foreignNationals:pInsured_DT:0:signatureFinanceialPro_CB", validateInput(strHashValue), "Signature of Licensed Insurance Agent", currentScreen);
									break;
								case"AGENT_DATE":
									blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_ax2FRTS:foreignNationals:pInsured_DT:0:signatureDate_EF", validateInput(strHashValue), "Date:", currentScreen);
									break;	
								case "default1":
									ReportGenerator.generateTestStep(false, currentScreen, "Field Navigation", strHashKey + " field not available in the current method.", false);
									break;
																								
									
								} //end of switch
								if(!blnStatus) break;
							} //end of while
						}
						else {
							ReportGenerator.generateTestStep(false, currentScreen, "Switch to Frame", "Failed to switch frames " + strFrames.replaceAll(GlobalData.STRING_SEPARATOR, " > "), false);
							blnStatus = false;
						}
						objEnum = null;
							
					} catch(Exception objExp) {
						ReportGenerator.generateTestStep(false, currentScreen, "Exception occured", "Exception is - " + objExp.getMessage(), false);
						blnStatus = false;
					}
					return blnStatus;
				}
				
				
				
				//Function For ForeignTravelJI flow
				private static boolean ForeignTravelJI(OrderedHashtable objTestData) {
					boolean blnStatus = false;
					String strHashKey = "", strHashValue = "";
					try {
						String strFrames = "mainContentFrame" + GlobalData.STRING_SEPARATOR + "contentRightFrame" + GlobalData.STRING_SEPARATOR + "file" + GlobalData.STRING_SEPARATOR + "file";
						Enumeration objEnum = objTestData.enumerateKeys();
						if(switchToFrame(strFrames, false) && waitForPageLoad(MAX_TIMEOUT)) {
							
							while(objEnum.hasMoreElements()) {
								//blnStatus = false;
								strHashKey = objEnum.nextElement().toString();
								strHashValue = objTestData.get(strHashKey).toString();

								switch(strHashKey) {
																			

								case"COUNTRY_OF_CITIZENSHIP":
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_ax2FRTS:foreignNationals:pInsured_DT:0:countryofCit_DD", validateInput(strHashValue), "1a. Country of Citizenship:", currentScreen);
									break;
								case"DATE_OF_ENTRY_US":
									blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_ax2FRTS:foreignNationals:pInsured_DT:0:EntryDate_EF", validateInput(strHashValue), "Date of Entry Into the U.S.:", currentScreen);
									break;
								case"RESIDENCY_STATUS":
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_ax2FRTS:foreignNationals:pInsured_DT:0:ResidencyType_DD", validateInput(strHashValue), "1b./1c. Residency Status:", currentScreen);
									break;
								case"EXPIRATION_DATE":
									blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_ax2FRTS:foreignNationals:pInsured_DT:0:expirationDate_EF", validateInput(strHashValue), "Expiration Date:", currentScreen);
									break;
								case"VISA_NUMBER":
									blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_ax2FRTS:foreignNationals:pInsured_DT:0:NonResident_EF", validateInput(strHashValue), "Visa #:", currentScreen);
									break;
								case"VISA_TYPE":
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_ax2FRTS:foreignNationals:pInsured_DT:0:visaType_EF", validateInput(strHashValue), "Visa Type:", currentScreen);
									break;
								case"I94_EXPIRATION_DATE":
									blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_ax2FRTS:foreignNationals:pInsured_DT:0:i94Expiration_EF", validateInput(strHashValue), "I-94 Expiration Date:", currentScreen);
									break;
								case"PASSPORT_NO":
									blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_ax2FRTS:foreignNationals:pInsured_DT:0:passportNo_EF", validateInput(strHashValue), "Passport No.:", currentScreen);
									break;
								case"US_BANK_NAME":
									blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_ax2FRTS:foreignNationals:pInsured_DT:0:bankName_EF", validateInput(strHashValue), "US Bank Name:", currentScreen);
									break;
								case"BANK_ACCOUNT_NUMBER":
									blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_ax2FRTS:foreignNationals:pInsured_DT:0:bankAccountNo_EF", validateInput(strHashValue), "Bank Account Number:", currentScreen);
									break;
								case"SIGNATURE_OF_INSURED":
									blnStatus = setValue(WebControl.CHECKBOX, IdentifyBy.NAME, "form_ax2FRTS:foreignNationals:pInsured_DT:0:signatureProposedIns_CB", validateInput(strHashValue), "Signature of Proposed Insured", currentScreen);
									break;
								case"INSURED_DATE":
									blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_ax2FRTS:foreignNationals:pInsured_DT:0:appliationEntDate_EF", validateInput(strHashValue), "Date:", currentScreen);
									break;
								case"SIGNATURE_OF_AGENT":
									blnStatus = setValue(WebControl.CHECKBOX, IdentifyBy.NAME, "form_ax2FRTS:foreignNationals:pInsured_DT:0:signatureFinanceialPro_CB", validateInput(strHashValue), "Signature of Licensed Insurance Agent", currentScreen);
									break;
								case"AGENT_DATE":
									blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_ax2FRTS:foreignNationals:pInsured_DT:0:signatureDate_EF", validateInput(strHashValue), "Date:", currentScreen);
									break;	
								case "default1":
									ReportGenerator.generateTestStep(false, currentScreen, "Field Navigation", strHashKey + " field not available in the current method.", false);
									break;													
									
								} //end of switch
								if(!blnStatus) break;
							} //end of while
						}
						else {
							ReportGenerator.generateTestStep(false, currentScreen, "Switch to Frame", "Failed to switch frames " + strFrames.replaceAll(GlobalData.STRING_SEPARATOR, " > "), false);
							blnStatus = false;
						}
						objEnum = null;
							
					} catch(Exception objExp) {
						ReportGenerator.generateTestStep(false, currentScreen, "Exception occured", "Exception is - " + objExp.getMessage(), false);
						blnStatus = false;
					}
					return blnStatus;
				}
				
				
				//Function For Financial flow
				private static boolean Financial(OrderedHashtable objTestData) {
					boolean blnStatus = false;
					String strHashKey = "", strHashValue = "";
					try {
						String strFrames = "mainContentFrame" + GlobalData.STRING_SEPARATOR + "contentRightFrame" + GlobalData.STRING_SEPARATOR + "file" + GlobalData.STRING_SEPARATOR + "file";
						Enumeration objEnum = objTestData.enumerateKeys();
						if(switchToFrame(strFrames, false) && waitForPageLoad(MAX_TIMEOUT)) {
							
							while(objEnum.hasMoreElements()) {
								//blnStatus = false;
								strHashKey = objEnum.nextElement().toString();
								strHashValue = objTestData.get(strHashKey).toString();

								switch(strHashKey) {
					
								case"Q5":
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_FinancialInfo:axaOtherInfo:certSection1TablePane:0:Q61bAns_DD", validateInput(strHashValue), "Question :5", currentScreen);
									break;
								case"Q6":
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_FinancialInfo:axaOtherInfo:certSection1TablePane:1:Q61bAns_DD", validateInput(strHashValue), "Question :6", currentScreen);
									break;
								case"Q7":
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_FinancialInfo:axaOtherInfo:certSection1TablePane:2:Q61bAns_DD", validateInput(strHashValue), "Question :7", currentScreen);
									break;
								case"Q8":
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_FinancialInfo:axaOtherInfo:certSection1TablePane:3:Q61bAns_DD", validateInput(strHashValue), "Question :8", currentScreen);
									break;
								case"Q9":
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_FinancialInfo:axaOtherInfo:certSection1TablePane:4:Q61bAns_DD", validateInput(strHashValue), "Question :9", currentScreen);
									break;
								case"Q10":
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_FinancialInfo:axaOtherInfo:certSection1TablePane:5:Q61bAns_DD", validateInput(strHashValue), "Question :10", currentScreen);
									break;
								case"Q11":                                                    
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_FinancialInfo:axaOtherInfo:certSection1TablePane:6:Q61bAns_DD", validateInput(strHashValue), "Question :11", currentScreen);
									break;
								case"Q12":                                                    
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_FinancialInfo:axaOtherInfo:certSection1TablePane:7:Q61bAns_DD", validateInput(strHashValue), "Question :12", currentScreen);
									break;
								case"Q13":                                                    
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_FinancialInfo:axaOtherInfo:certSection1TablePane:8:Q61bAns_DD", validateInput(strHashValue), "Question :13", currentScreen);
									break;
								case "default1":
									ReportGenerator.generateTestStep(false, currentScreen, "Field Navigation", strHashKey + " field not available in the current method.", false);
									break;
								} //end of switch
								if(!blnStatus) break;
							} //end of while
						}
						else {
							ReportGenerator.generateTestStep(false, currentScreen, "Switch to Frame", "Failed to switch frames " + strFrames.replaceAll(GlobalData.STRING_SEPARATOR, " > "), false);
							blnStatus = false;
						}
						objEnum = null;
							
					} catch(Exception objExp) {
						ReportGenerator.generateTestStep(false, currentScreen, "Exception occured", "Exception is - " + objExp.getMessage(), false);
						blnStatus = false;
					}
					return blnStatus;
				}
				
				//Function For LTC flow
				private static boolean LTC(OrderedHashtable objTestData) {
					boolean blnStatus = false;
					String strHashKey = "", strHashValue = "";
					try {
						String strFrames = "mainContentFrame" + GlobalData.STRING_SEPARATOR + "contentRightFrame" + GlobalData.STRING_SEPARATOR + "file"+ GlobalData.STRING_SEPARATOR + "file";;
						Enumeration objEnum = objTestData.enumerateKeys();
						if(switchToFrame(strFrames, false) && waitForPageLoad(MAX_TIMEOUT)) {
							
							while(objEnum.hasMoreElements()) {
								//blnStatus = false;
								strHashKey = objEnum.nextElement().toString();
								strHashValue = objTestData.get(strHashKey).toString();

								switch(strHashKey) {
								
								case"ACCELERATION_PERCENTAGE":
									blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_LongTermcare:ax2ThirdPartyLTC:acc_EF2", validateInput(strHashValue), "1. Acceleration Percentage:", currentScreen);
									
									break;
								case"BENEFIT_PERCENTAGE":
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_LongTermcare:ax2ThirdPartyLTC:BenefitPer_EF", validateInput(strHashValue), "2. Benefit Percentage:", currentScreen);
									break;
								case"NONFORFEITURE_BENEFIT":
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_LongTermcare:ax2ThirdPartyLTC:non_CB", validateInput(strHashValue), "3. Nonforfeiture Benefit:", currentScreen);
									break;
								case"Q4":
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_LongTermcare:ax2ThirdPartyLTC:ProtectionAUTYes_CB", validateInput(strHashValue), "4. I Elect to designate someone to receive notice:", currentScreen);
									break;
								case"Q4_DELETE_THIRD_PARTY":
									blnStatus = setValue(WebControl.CHECKBOX, IdentifyBy.NAME, "form_LongTermcare:ax2ThirdPartyLTC:deleteThirdParty_CB", validateInput(strHashValue), "Q4_DELETE_THIRD_PARTY", currentScreen);
									break;
									
								case"PREFIX":
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_LongTermcare:ax2ThirdPartyLTC:designatedPPrefix_DD", validateInput(strHashValue), "PREFIX", currentScreen);
									break;
								case"FIRST_NAME":
									blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_LongTermcare:ax2ThirdPartyLTC:designatedPFirst_EF", validateInput(strHashValue), "FIRST_NAME", currentScreen);
									break;
								case"MIDDLE_NAME":
									blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_LongTermcare:ax2ThirdPartyLTC:designatedPMiddle_EF", validateInput(strHashValue), "MIDDLE_NAME", currentScreen);
									break;
								case"LAST_NAME":
									blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_LongTermcare:ax2ThirdPartyLTC:designatedPLast_EF", validateInput(strHashValue), "LAST_NAME", currentScreen);
									break;
									
								case"SUFFIX":
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_LongTermcare:ax2ThirdPartyLTC:designatedPSuffix_DD", validateInput(strHashValue), "SUFFIX", currentScreen);
									break;
								/*
								case"ENTITY":
									
									break;
								case"RELATIONSHIP_TO_INSURED":
									break;
									*/
								
								
								case"POBOX_ADDRESS":
									blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_LongTermcare:ax2ThirdPartyLTC:poBox_CB", validateInput(strHashValue), "POBOX_ADDRESS", currentScreen);
									break;
								case"ADDRESS_TYPE":
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_LongTermcare:ax2ThirdPartyLTC:addressType_DD", validateInput(strHashValue), "ADDRESS_TYPE", currentScreen);
									break;
								case"STREET_NO":
									blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_LongTermcare:ax2ThirdPartyLTC:street_EF", validateInput(strHashValue), "STREET_NO", currentScreen);
									break;
								case"BLG_APT_SUITE":
									blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_LongTermcare:ax2ThirdPartyLTC:BldAptSuite_EF", validateInput(strHashValue), "BLG_APT_SUITE", currentScreen);
									break;
								case"CITY":
									blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_LongTermcare:ax2ThirdPartyLTC:designatedPCity_EF", validateInput(strHashValue), "CITY", currentScreen);
									break;
								case"COUNTY":
									blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_LongTermcare:ax2ThirdPartyLTC:designatedPCounty_EF", validateInput(strHashValue), "COUNTY", currentScreen);
									break;
								case"STATE":
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_LongTermcare:ax2ThirdPartyLTC:designatedPState_DD", validateInput(strHashValue), "STATE", currentScreen);
									break;
									
								case"ZIP":
									blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_LongTermcare:ax2ThirdPartyLTC:designatedPZip_EF", validateInput(strHashValue), "ZIP", currentScreen);
									break;
								case"COUNTRY":
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_LongTermcare:ax2ThirdPartyLTC:designatedPCountry_DD", validateInput(strHashValue), "COUNTRY", currentScreen);
									break;
								case"ADD":
									blnStatus = setValue(WebControl.BUTTON, IdentifyBy.NAME, "form_LongTermcare:ax2ThirdPartyLTC:paxaLifeLTCPAUTTableAdd_CButton", validateInput(strHashValue), "ADD", currentScreen);
									break;
								case"Q5A_I":
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_LongTermcare:ax2GiLTC:LTCgeneralITablePane:0:LTCQ1Ans_DD", validateInput(strHashValue), "QUESTION :5A_I", currentScreen);
									break;
								case"Q5B":
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_LongTermcare:ax2GiLTC:LTCgeneralITablePane:1:LTCQ1Ans_DD", validateInput(strHashValue), "QUESTION :5B", currentScreen);
									break;
								case"Q5C":
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_LongTermcare:ax2GiLTC:LTCgeneralITablePane:2:LTCQ1Ans_DD", validateInput(strHashValue), "QUESTION :5C", currentScreen);
									break;
								case"Q5D":
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_LongTermcare:ax2GiLTC:LTCgeneralITablePane:3:LTCQ1Ans_DD", validateInput(strHashValue), "QUESTION :5D", currentScreen);
									break;
								case"Q5E":
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_LongTermcare:ax2GiLTC:LTCgeneralITablePane:4:LTCQ1Ans_DD", validateInput(strHashValue), "QUESTION :5E", currentScreen);
									break;
									
								case"Q5F":
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_LongTermcare:ax2GiLTC:LTCgeneralITablePane:5:LTCQ1Ans_DD", validateInput(strHashValue), "QUESTION :5F", currentScreen);
									break;
								case"Q5G":
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_LongTermcare:ax2GiLTC:LTCgeneralITablePane:6:LTCQ1Ans_DD", validateInput(strHashValue), "QUESTION :5G", currentScreen);
									break;
								case"Q5H":
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_LongTermcare:ax2GiLTC:LTCgeneralITablePane:7:LTCQ1Ans_DD", validateInput(strHashValue), "QUESTION :5H", currentScreen);
									break;
								case"Q5I":
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_LongTermcare:ax2GiLTC:LTCgeneralITablePane:8:LTCQ1Ans_DD", validateInput(strHashValue), "QUESTION :5I", currentScreen);
									break;
									
								case"Q5F_Q5H_COMPANY":
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_LongTermcare:ax2OtherInsLTC:giqDetailsCompanyName_DD", validateInput(strHashValue), "Company:", currentScreen);
									break;
								case"Q5F_Q5H_POLICY_NO":
									blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_LongTermcare:ax2OtherInsLTC:policy_EF", validateInput(strHashValue), "Policy / Certificate No:", currentScreen);
									break;
								case"Q5F_Q5H_POLICY_TYPE":
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_LongTermcare:ax2OtherInsLTC:policyType_DD", validateInput(strHashValue), "POLICY_TYPE", currentScreen);
									break;
								
								case"Q5F_Q5H_AMOUNT":
									blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_LongTermcare:ax2OtherInsLTC:amount_EF", validateInput(strHashValue), "AMOUNT", currentScreen);
									break;
									
								case"Q5F_Q5H_CURRENTLY_INFORCE":
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_LongTermcare:ax2OtherInsLTC:currentlyEnforce_EF", validateInput(strHashValue), "Currently Inforce?", currentScreen);
									break;
								case"Q5F_Q5H_BEING_REPLACED":
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_LongTermcare:ax2OtherInsLTC:beingReplaced_EF", validateInput(strHashValue), "Being Replaced?", currentScreen);
									break;
								case"Q5F_Q5H_DATE_OF_LAPS":
									blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_LongTermcare:ax2OtherInsLTC:dateoflapse_EF", validateInput(strHashValue), "Date of Lapse:", currentScreen);
									break;
								case"Q5F_Q5H_ADD":
									
									blnStatus = setValue(WebControl.BUTTON, IdentifyBy.NAME, "form_LongTermcare:ax2OtherInsLTC:pInsured1AddInfoAdd_CButton", validateInput(strHashValue), "ADD", currentScreen);
									
									break;
								case"Q6A":
									
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_LongTermcare:ax2MiLTC:medicalITablePane:0:QqAns_DD", validateInput(strHashValue), "Question : 6A", currentScreen);
									break;
									
								case"Q6B":
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_LongTermcare:ax2MiLTC:medicalITablePane:1:QqAns_DD", validateInput(strHashValue), "Question : 6B", currentScreen);
									break;
								case"Q6C_I":
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_LongTermcare:ax2MiLTC:medicalITablePane:2:QqAns_DD", validateInput(strHashValue), "Question : 6C-1", currentScreen);
									break;
								case"Q6C_II":
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_LongTermcare:ax2MiLTC:medicalITablePane:3:QqAns_DD", validateInput(strHashValue), "Question : 6C-2", currentScreen);
									break;
							
								case"Q6D_I":
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_LongTermcare:ax2MiLTC:medicalITablePane:4:QqAns_DD", validateInput(strHashValue), "Question : 6D-1", currentScreen);
									break;
									
								case"Q6D_II":
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_LongTermcare:ax2MiLTC:medicalITablePane:5:QqAns_DD", validateInput(strHashValue), "Question : 6D-2", currentScreen);
									break;
								case"Q6D_III":
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_LongTermcare:ax2MiLTC:medicalITablePane:6:QqAns_DD", validateInput(strHashValue), "Question : 6D-3", currentScreen);
									break;
								case"Q6D_IV":
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_LongTermcare:ax2MiLTC:medicalITablePane:7:QqAns_DD", validateInput(strHashValue), "Question : 6D-4", currentScreen);
									break;
									
								case"Q6D_V":
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_LongTermcare:ax2MiLTC:medicalITablePane:8:QqAns_DD", validateInput(strHashValue), "Question : 6D-5", currentScreen);
									break;
									
								case"Q6E":
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_LongTermcare:ax2MiLTC:medicalITablePane:9:QqAns_DD", validateInput(strHashValue), "Question : 6E", currentScreen);
									break;
									
								case"Q6F_I":
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_LongTermcare:ax2MiLTC:medicalITablePane:10:QqAns_DD", validateInput(strHashValue), "Question : 6F-1", currentScreen);
									break;								
									
								case"Q6F_II":
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_LongTermcare:ax2MiLTC:medicalITablePane:11:QqAns_DD", validateInput(strHashValue), "Question : 6F-2", currentScreen);
									break;
									
								case"Q6G_I":
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_LongTermcare:ax2MiLTC:medicalITablePane:12:QqAns_DD", validateInput(strHashValue), "Question : 6G-1", currentScreen);
									break;
									
									
								case"Q6G_II":
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_LongTermcare:ax2MiLTC:medicalITablePane:13:QqAns_DD", validateInput(strHashValue), "Question : 6G-2", currentScreen);
									break;
									
								case"Q6G_III":
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_LongTermcare:ax2MiLTC:medicalITablePane:14:QqAns_DD", validateInput(strHashValue), "Question : 6G-3", currentScreen);
									break;
								case"Q6H":
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_LongTermcare:ax2MiLTC:medicalITablePane:15:QqAns_DD", validateInput(strHashValue), "Question : 6H", currentScreen);
									break;
								case"LTC_PERSONAL":												
									blnStatus = setValue(WebControl.RADIOBOX, IdentifyBy.NAME, "form_LongTermcare:ax2PWLTC:medicalITablePane:0:QqAns_DD", getAppRadioValues(strHashKey, strHashValue), "Person / Entity", currentScreen);
									break;
								case "default1":
									ReportGenerator.generateTestStep(false, currentScreen, "Field Navigation", strHashKey + " field not available in the current method.", false);
									break;
								
					
								} //end of switch
								if(!blnStatus) break;
							} //end of while
						}
						else {
							ReportGenerator.generateTestStep(false, currentScreen, "Switch to Frame", "Failed to switch frames " + strFrames.replaceAll(GlobalData.STRING_SEPARATOR, " > "), false);
							blnStatus = false;
						}
						objEnum = null;
							
					} catch(Exception objExp) {
						ReportGenerator.generateTestStep(false, currentScreen, "Exception occured", "Exception is - " + objExp.getMessage(), false);
						blnStatus = false;
					}
					return blnStatus;
				}
				private static boolean OwnerEOS(OrderedHashtable objTestData) {
					boolean blnStatus = false;
					String strHashKey = "", strHashValue = "";
					try {
						String strFrames = "FWin0" + GlobalData.STRING_SEPARATOR + "Content0";
						Enumeration objEnum = objTestData.enumerateKeys();
						if(switchToFrame(strFrames, false) && waitForPageLoad(MAX_TIMEOUT)) {
							
							while(objEnum.hasMoreElements()) {
								//blnStatus = false;
								strHashKey = objEnum.nextElement().toString();
								strHashValue = objTestData.get(strHashKey).toString();

								switch(strHashKey) {
								case "OWNER_PUBLICCOMPANY":
									blnStatus = setValue(WebControl.RADIOBOX, IdentifyBy.NAME, "form_EntityOwnerSuppDetails:ax2EntityOwnerInfoSectionB:EntityOwner_ssnEinItin_RB", getAppRadioValues(strHashKey, strHashValue), "Owner Public Company", currentScreen);
									break;
								case "POLICY_EOS":
									blnStatus = setValue(WebControl.RADIOBOX, IdentifyBy.NAME, "form_EntityOwnerSuppDetails:ax2EntityOwnerInfoSectionB:CompEntityOwner_Rb", getAppRadioValues(strHashKey, strHashValue), "Policy EOS", currentScreen);
									break;
								case"EQUALITY_INTEREST":
									blnStatus = setValue(WebControl.CHECKBOX, IdentifyBy.NAME, "form_EntityOwnerSuppDetails:ax2EntityOwnerInfoSectionC:BenOwner__ownchk_CB", validateInput(strHashValue), "Equality Interest", currentScreen);
									break;
								case"OWNER_EOS":
									blnStatus = setValue(WebControl.BUTTON, IdentifyBy.NAME, "form_newAppOwner:ax2OwnerInfo:owner_DT:0:EOSupp_CButton", validateInput(strHashValue), "Owner_Eos", currentScreen);
									break;
								case "default1":
									ReportGenerator.generateTestStep(false, currentScreen, "Field Navigation", strHashKey + " field not available in the current method.", false);
									break;
								
								} //end of switch
								if(!blnStatus) break;
							} //end of while
						}
						else {
							ReportGenerator.generateTestStep(false, currentScreen, "Switch to Frame", "Failed to switch frames " + strFrames.replaceAll(GlobalData.STRING_SEPARATOR, " > "), false);
							blnStatus = false;
						}
						objEnum = null;
							
					} catch(Exception objExp) {
						ReportGenerator.generateTestStep(false, currentScreen, "Exception occured", "Exception is - " + objExp.getMessage(), false);
						blnStatus = false;
					}
					return blnStatus;
				}
				private static boolean EntityOwnershipSupplement(OrderedHashtable objTestData) {
					boolean blnStatus = false;
					String SSN_EIN_ITIN = "";
					String C_SSN_EIN="";
					String D_SSN_EIN="";
					String E_SSN_EIN="";
					String strHashKey = "", strHashValue = "";
					try {
						String strFrames = "FWin0" + GlobalData.STRING_SEPARATOR + "Content0";
						Enumeration objEnum = objTestData.enumerateKeys();
						if(switchToFrame(strFrames, false) && waitForPageLoad(MAX_TIMEOUT)) {
							
							while(objEnum.hasMoreElements()) {
								//blnStatus = false;
								strHashKey = objEnum.nextElement().toString();
								strHashValue = objTestData.get(strHashKey).toString();

								switch(strHashKey) {
								
								case"A_FirstName":
									blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_EntityOwnerSuppDetails:ax2EntityOwnerInfoSectionA:TrustEntity_first_EF", validateInput(strHashValue), "FIRST_NAME", currentScreen);
									break;	
								case"A_LastName":
									blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_EntityOwnerSuppDetails:ax2EntityOwnerInfoSectionA:TrustEntity_last_EF", validateInput(strHashValue), "A LAST NAME", currentScreen);
									break;
								case"DOB":
									blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_EntityOwnerSuppDetails:ax2EntityOwnerInfoSectionA:TrustEntity_DOB_EF", validateInput(strHashValue), "DOB", currentScreen);
									break;
								case"SSN_EIN_ITIN":
									SSN_EIN_ITIN = strHashValue;								
									blnStatus = setValue(WebControl.RADIOBOX, IdentifyBy.ID, "form_EntityOwnerSuppDetails:ax2EntityOwnerInfoSectionA:TrustEntity_ssnEinItin_RB", getAppRadioValues(strHashKey, strHashValue), "SSN_EIN_ITIN", currentScreen);
									break;
								case"SSN_Number": 
									switch(SSN_EIN_ITIN) {
										case "SSN":													   
											blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_EntityOwnerSuppDetails:ax2EntityOwnerInfoSectionA:TrustEntity_ssnEinSSN_EF", validateInput(strHashValue), "SSN NUMBER", currentScreen);
											break;
										case "EIN":
											blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_EntityOwnerSuppDetails:ax2EntityOwnerInfoSectionA:TrustEntity_ssnEinEIN_EF", validateInput(strHashValue), "EIN NUMBER", currentScreen);
											break;
										case "ITIN":
											blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_EntityOwnerSuppDetails:ax2EntityOwnerInfoSectionA:TrustEntity_ssnEinITIN_EF", validateInput(strHashValue), "ITIN NUMBER", currentScreen);
											break;
									}
									break;
									
									case"STREET_NO":
										blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_EntityOwnerSuppDetails:ax2EntityOwnerInfoSectionA:TrusteeEntity_street_EF", validateInput(strHashValue), "STREET_NO", currentScreen);
										break;
									case"BUILDING_APT_SUITE":
										blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_EntityOwnerSuppDetails:ax2EntityOwnerInfoSectionA:TrustEntity_BldAptSuite_EF", validateInput(strHashValue), "BLG_APT_SUITE", currentScreen);
										break;
									case"CITY":
										blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_EntityOwnerSuppDetails:ax2EntityOwnerInfoSectionA:TrustEntity_City_EF", validateInput(strHashValue), "CITY", currentScreen);
										break;				
									case"STATE":
										blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_EntityOwnerSuppDetails:ax2EntityOwnerInfoSectionA:TrustEntity_State_DD", validateInput(strHashValue), "STATE", currentScreen);
										break;
									case"ZIP":
										blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_EntityOwnerSuppDetails:ax2EntityOwnerInfoSectionA:TrustEntity_Zip_EF", validateInput(strHashValue), "zip", currentScreen);
										break;
									case"GovtIDType":
										blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_EntityOwnerSuppDetails:ax2EntityOwnerInfoSectionA:TrustEntity_GovtID_DD", validateInput(strHashValue), "GOVT TYPE", currentScreen);
										break;
									case"GOVT_ID":
										blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_EntityOwnerSuppDetails:ax2EntityOwnerInfoSectionA:TrustEntity_GOVTID_EF", validateInput(strHashValue), "GOVT_ID", currentScreen);
										break;
									case"State_of_Issue":
										blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_EntityOwnerSuppDetails:ax2EntityOwnerInfoSectionA:TrustEntity_GovtidState_DD", validateInput(strHashValue), "State_of_Issue", currentScreen);
										break;
									case"COUNTRY":
										blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_EntityOwnerSuppDetails:ax2EntityOwnerInfoSectionA:TrustEntity_CountryofissueType_DD", validateInput(strHashValue), "COUNTRY", currentScreen);
										break;
									case"Expiration_Date":
										blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_EntityOwnerSuppDetails:ax2EntityOwnerInfoSectionA:TrustEnitty_ExpDateLic_EF", validateInput(strHashValue), "Expiration_Date", currentScreen);
										break;										
									case"A_ADD":										
										blnStatus = setValue(WebControl.BUTTON, IdentifyBy.NAME, "form_EntityOwnerSuppDetails:ax2EntityOwnerInfoSectionA:trustEntityInfoAdd_CButton", validateInput(strHashValue), "A ADD", currentScreen);
										break;
									case"Entity_Name":
										blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_EntityOwnerSuppDetails:ax2EntityOwnerInfoSectionB:EntityOwner_Name_EF", validateInput(strHashValue), "Entity_Name", currentScreen);
										break;										
									case "B_OwnerMismatch":
										blnStatus = setValue(WebControl.CHECKBOX, IdentifyBy.NAME, "form_EntityOwnerSuppDetails:ax2EntityOwnerInfoSectionB:EntityPolOwner__ownchk_CB", validateInput(strHashValue), "B_OwnerMismatch", currentScreen);
										break;
									case"B_State":
										blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_EntityOwnerSuppDetails:ax2EntityOwnerInfoSectionB:EntityOwner_State_DD", validateInput(strHashValue), "B_State", currentScreen);
										break;
									case"B_Country":
										blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_EntityOwnerSuppDetails:ax2EntityOwnerInfoSectionB:EntityOwner_Country_DD", validateInput(strHashValue), "B_Country", currentScreen);
										break;
									case"B_DateofIncorp":
										blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_EntityOwnerSuppDetails:ax2EntityOwnerInfoSectionB:EntityOwner_DOI_EF", validateInput(strHashValue), "B_DateofIncorp", currentScreen);
										break;
									case"NASIC Code":
										blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_EntityOwnerSuppDetails:ax2EntityOwnerInfoSectionB:EntityOwner_PrimaryNAICSCode_EF", validateInput(strHashValue), "NASIC Code", currentScreen);
										break;
									case"Nature_Of_business":
										blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_EntityOwnerSuppDetails:ax2EntityOwnerInfoSectionB:EntityOwner_naturePurposeofbusiness_EF", validateInput(strHashValue), "Nature_Of_business", currentScreen);
										break;
									case"Relation":
										blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_EntityOwnerSuppDetails:ax2EntityOwnerInfoSectionB:EntityOwner_relationship_DD", validateInput(strHashValue), "Relation", currentScreen);
										break;
									case"Traded_company":
										
										blnStatus = setValue(WebControl.RADIOBOX, IdentifyBy.NAME, "form_EntityOwnerSuppDetails:ax2EntityOwnerInfoSectionB:EntityOwner_ssnEinItin_RB", getAppRadioValues(strHashKey, strHashValue), "Traded_company", currentScreen);
										break;
									case"Complex_Entity":
										scrollDown();												
										blnStatus = setValue(WebControl.RADIOBOX, IdentifyBy.NAME, "form_EntityOwnerSuppDetails:ax2EntityOwnerInfoSectionB:CompEntityOwner_Rb", getAppRadioValues(strHashKey, strHashValue), "Complex_Entity", currentScreen);
										
										break;
									case "C_EquityInterest":
										blnStatus = setValue(WebControl.CHECKBOX, IdentifyBy.NAME, "form_EntityOwnerSuppDetails:ax2EntityOwnerInfoSectionC:BenOwner__ownchk_CB", validateInput(strHashValue), "C_EquityInterest", currentScreen);
										break;
									case"C_Fname":
										blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_EntityOwnerSuppDetails:ax2EntityOwnerInfoSectionC:BenOwner_first_EF", validateInput(strHashValue), "C_Fname", currentScreen);
										break;	
									case"C_Lname":
										blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_EntityOwnerSuppDetails:ax2EntityOwnerInfoSectionC:BenOwner_last_EF", validateInput(strHashValue), "C_Lname", currentScreen);
										break;
									case"C_DOB":
										blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_EntityOwnerSuppDetails:ax2EntityOwnerInfoSectionC:BenOwner_DOB_EF", validateInput(strHashValue), "C_DOB", currentScreen);
										break;
									case"C_SSN_EIN":
									
									C_SSN_EIN = strHashValue;
										blnStatus = setValue(WebControl.RADIOBOX, IdentifyBy.NAME, "form_EntityOwnerSuppDetails:ax2EntityOwnerInfoSectionC:BenOwner_ssnEinItin_RB", getAppRadioValues(strHashKey, strHashValue), "C_SSN_EIN", currentScreen);
										break;
									case"C_SSNNumber": 
										switch(C_SSN_EIN) {
											case "SSN":
												blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_EntityOwnerSuppDetails:ax2EntityOwnerInfoSectionC:Benificial_ssnEinSSN_EF", validateInput(strHashValue), "SSN NUMBER", currentScreen);
												break;
											case "EIN":
												blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_EntityOwnerSuppDetails:ax2EntityOwnerInfoSectionC:Benificial_ssnEinEIN_EF", validateInput(strHashValue), "EIN NUMBER", currentScreen);
												break;
											case "ITIN":
												blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_EntityOwnerSuppDetails:ax2EntityOwnerInfoSectionC:Benificial_ssnEinITIN_EF", validateInput(strHashValue), "ITIN NUMBER", currentScreen);
												break;
										}
										break;
										case"Percentage":
											blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_EntityOwnerSuppDetails:ax2EntityOwnerInfoSectionC:BenOwner_OPercentage_EF", validateInput(strHashValue), "Percentage", currentScreen);
										break;										
										case"C_street":
											blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_EntityOwnerSuppDetails:ax2EntityOwnerInfoSectionC:BenOwner_street_EF", validateInput(strHashValue), "C_street", currentScreen);
											break;
										case"C_building":
											blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_EntityOwnerSuppDetails:ax2EntityOwnerInfoSectionC:BenOwner_BldAptSuite_EF", validateInput(strHashValue), "C_building", currentScreen);
											break;
										case"C_City":
											blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_EntityOwnerSuppDetails:ax2EntityOwnerInfoSectionC:BenOwner_City_EF", validateInput(strHashValue), "C_City", currentScreen);
											break;				
										case"C_state":
											blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_EntityOwnerSuppDetails:ax2EntityOwnerInfoSectionC:BenOwner_State_DD", validateInput(strHashValue), "C_state", currentScreen);
											break;
										case"C_zip":
											blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_EntityOwnerSuppDetails:ax2EntityOwnerInfoSectionC:BenOwner_Zip_EF", validateInput(strHashValue), "C_zip", currentScreen);
											break;
										case"C_GovtIDtype":
											blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_EntityOwnerSuppDetails:ax2EntityOwnerInfoSectionC:BenOwner_GovtID_DD", validateInput(strHashValue), "C_GovtIDtype", currentScreen);
											break;
										case"C_GovtID":
											Thread.sleep(1000);
											blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_EntityOwnerSuppDetails:ax2EntityOwnerInfoSectionC:BenOwner_GOVTID_EF", validateInput(strHashValue), "C_GovtID", currentScreen);
											break;
										case"C_country":
											blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_EntityOwnerSuppDetails:ax2EntityOwnerInfoSectionC:BenOwner_CountryofissueType_DD", validateInput(strHashValue), "C_country", currentScreen);
											break;
										case"C_expiration":
											blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_EntityOwnerSuppDetails:ax2EntityOwnerInfoSectionC:BenOwner_ExpDateLic_EF", validateInput(strHashValue), "C_expiration", currentScreen);
											break;
										case"Politically_exposed":
											blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_EntityOwnerSuppDetails:ax2EntityOwnerInfoSectionC:Q55Ans_DD", validateInput(strHashValue), "Politically_exposed", currentScreen);
											break;
										case"C_position":
											blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_EntityOwnerSuppDetails:ax2EntityOwnerInfoSectionC:BenOwner_Position_EF", validateInput(strHashValue), "C_position", currentScreen);
											break;
										case"C_Country":
											blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_EntityOwnerSuppDetails:ax2EntityOwnerInfoSectionC:BenOwner_CountryType_DD", validateInput(strHashValue), "C_Country", currentScreen);
											break;
										case "C_Controlling_Person":
											blnStatus = setValue(WebControl.CHECKBOX, IdentifyBy.NAME, "form_EntityOwnerSuppDetails:ax2EntityOwnerInfoSectionC:Benownconrolpersonchk_CB", validateInput(strHashValue), "C_Controlling_Person", currentScreen);
											break;
										case"C_ADD":										
											blnStatus = setValue(WebControl.BUTTON, IdentifyBy.NAME, "form_EntityOwnerSuppDetails:ax2EntityOwnerInfoSectionC:BenOwnerInfoAdd_CButton", validateInput(strHashValue), "C_ADD", currentScreen);
											break;
										case"D_Fname":
											blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_EntityOwnerSuppDetails:ax2EntityOwnerInfoSectionD:CtrlPerson_first_EF", validateInput(strHashValue), "D_Fname", currentScreen);
											break;	
										case"D_Lname":
											blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_EntityOwnerSuppDetails:ax2EntityOwnerInfoSectionD:CtrlPerson_last_EF", validateInput(strHashValue), "D_Lname", currentScreen);
											break;
										case"D_title":
											blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_EntityOwnerSuppDetails:ax2EntityOwnerInfoSectionD:CtrlPerson_title_EF", validateInput(strHashValue), "D_title", currentScreen);
											break;
										case"D_DOB":													
											blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_EntityOwnerSuppDetails:ax2EntityOwnerInfoSectionD:CtrlPerson_DOB_EF", validateInput(strHashValue), "D_DOB", currentScreen);
											break;
										case"D_SSN_EIN":
											D_SSN_EIN = strHashValue;
											blnStatus = setValue(WebControl.RADIOBOX, IdentifyBy.NAME, "form_EntityOwnerSuppDetails:ax2EntityOwnerInfoSectionD:CtrlPerson_ssnEinItin_RB", getAppRadioValues(strHashKey, strHashValue), "SSN_EIN_ITIN", currentScreen);
											break;
										case"D_SSNNumber": 
											switch(D_SSN_EIN) {
												case "SSN":
													blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_EntityOwnerSuppDetails:ax2EntityOwnerInfoSectionD:CtrlPerson_ssnEinSSN_EF", validateInput(strHashValue), "SSN NUMBER", currentScreen);
													break;
												case "EIN":
													blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_EntityOwnerSuppDetails:ax2EntityOwnerInfoSectionD:CtrlPerson_ssnEinEIN_EF", validateInput(strHashValue), "EIN NUMBER", currentScreen);
													break;
												case "ITIN":
													blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_EntityOwnerSuppDetails:ax2EntityOwnerInfoSectionD:CtrlPerson_ssnEinITIN_EF", validateInput(strHashValue), "ITIN NUMBER", currentScreen);
													break;
											}
											break;																			
											case"D_street":												   
												blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_EntityOwnerSuppDetails:ax2EntityOwnerInfoSectionD:CtrlPerson_street_EF", validateInput(strHashValue), "D_street", currentScreen);
												break;
											case"D_building":
												blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_EntityOwnerSuppDetails:ax2EntityOwnerInfoSectionD:CtrlPerson_BldAptSuite_EF", validateInput(strHashValue), "D_building", currentScreen);
												break;
											case"D_City":
												blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_EntityOwnerSuppDetails:ax2EntityOwnerInfoSectionD:CtrlPerson_BldAptSuite_EF", validateInput(strHashValue), "D_City", currentScreen);
												break;				
											case"D_state":
												blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_EntityOwnerSuppDetails:ax2EntityOwnerInfoSectionD:CtrlPerson_State_DD", validateInput(strHashValue), "STATE", currentScreen);
												break;
											case"D_zip":
												blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_EntityOwnerSuppDetails:ax2EntityOwnerInfoSectionD:CtrlPerson_Zip_EF", validateInput(strHashValue), "D_zip", currentScreen);
												break;
											case"D_GovtIDtype":
												blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_EntityOwnerSuppDetails:ax2EntityOwnerInfoSectionD:CtrlPerson_GovtID_DD", validateInput(strHashValue), "D_GovtIDtype", currentScreen);
												break;
											case"D_GovtID":
												blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_EntityOwnerSuppDetails:ax2EntityOwnerInfoSectionD:CtrlPerson_GOVTID_EF", validateInput(strHashValue), "D_GovtID", currentScreen);
												break;
											case"D_country":
												blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_EntityOwnerSuppDetails:ax2EntityOwnerInfoSectionD:CtrlPerson_CountryofissueType_DD", validateInput(strHashValue), "COUNTRY", currentScreen);
												break;
											case"D_expiration":
												blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_EntityOwnerSuppDetails:ax2EntityOwnerInfoSectionD:CtrlPerson_ExpDateLic_EF", validateInput(strHashValue), "D_expiration", currentScreen);
												break;
											case"D_Politically_exposed":
												blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_EntityOwnerSuppDetails:ax2EntityOwnerInfoSectionD:Q55Ans_DD", validateInput(strHashValue), "D_Politically_exposed", currentScreen);
												break;
											case"D_position":
												blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_EntityOwnerSuppDetails:ax2EntityOwnerInfoSectionD:CtrlPerson_Position_EF", validateInput(strHashValue), "D_position", currentScreen);
												break;
											case"D_Country":
												blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_EntityOwnerSuppDetails:ax2EntityOwnerInfoSectionD:CtrlPerson_CountryType_DD", validateInput(strHashValue), "COUNTRY", currentScreen);
												break;
											case"E_Fname":
												blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_EntityOwnerSuppDetails:ax2EntityOwnerInfoSectionE:AuthPerson_first_EF", validateInput(strHashValue), "E_Fname", currentScreen);
												break;	
											case"E_Lname":
												blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_EntityOwnerSuppDetails:ax2EntityOwnerInfoSectionE:AuthPerson_last_EF", validateInput(strHashValue), "E_Lname", currentScreen);
												break;
											case"E_title":
												blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_EntityOwnerSuppDetails:ax2EntityOwnerInfoSectionE:AuthPerson_title_EF", validateInput(strHashValue), "E_title", currentScreen);
												break;
											case"E_DOB":
												blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_EntityOwnerSuppDetails:ax2EntityOwnerInfoSectionE:AuthPerson_DOB_EF", validateInput(strHashValue), "E_DOB", currentScreen);
												break;
											case"E_SSN_EIN":
												E_SSN_EIN = strHashValue;
												blnStatus = setValue(WebControl.RADIOBOX, IdentifyBy.NAME, "form_EntityOwnerSuppDetails:ax2EntityOwnerInfoSectionE:AuthPerson_ssnEinItin_RB", getAppRadioValues(strHashKey, strHashValue), "E_SSN_EIN", currentScreen);
												break;
											case"E_SSNNumber": 
												switch(E_SSN_EIN) {
													case "SSN":
														blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_EntityOwnerSuppDetails:ax2EntityOwnerInfoSectionE:AuthPerson_ssnEinSSN_EF", validateInput(strHashValue), "SSN NUMBER", currentScreen);
														break;
													case "EIN":
														blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_EntityOwnerSuppDetails:ax2EntityOwnerInfoSectionE:AuthPerson_ssnEinEIN_EF", validateInput(strHashValue), "EIN NUMBER", currentScreen);
														break;
													case "ITIN":
														blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_EntityOwnerSuppDetails:ax2EntityOwnerInfoSectionE:AuthPerson_ssnEinITIN_EF", validateInput(strHashValue), "ITIN NUMBER", currentScreen);
														break;
												}
												break;																			
												case"E_street":
													blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_EntityOwnerSuppDetails:ax2EntityOwnerInfoSectionE:AuthPerson_street_EF", validateInput(strHashValue), "E_street", currentScreen);
													break;
												case"E_building":
													blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_EntityOwnerSuppDetails:ax2EntityOwnerInfoSectionE:AuthPerson_BldAptSuite_EF", validateInput(strHashValue), "E_building", currentScreen);
													break;
												case"E_City":
													blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_EntityOwnerSuppDetails:ax2EntityOwnerInfoSectionE:AuthPerson_City_EF", validateInput(strHashValue), "E_City", currentScreen);
													break;				
												case"E_state":
													blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_EntityOwnerSuppDetails:ax2EntityOwnerInfoSectionE:AuthPerson_State_DD", validateInput(strHashValue), "STATE", currentScreen);
													break;
												case"E_zip":
													blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_EntityOwnerSuppDetails:ax2EntityOwnerInfoSectionE:AuthPerson_Zip_EF", validateInput(strHashValue), "zip", currentScreen);
													break;									
												case"E_Politically_exposed":
													blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_EntityOwnerSuppDetails:ax2EntityOwnerInfoSectionE:Q55Ans_DD", validateInput(strHashValue), "E_Politically_exposed", currentScreen);
													break;
												case"E_position":
													blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_EntityOwnerSuppDetails:ax2EntityOwnerInfoSectionE:AuthPersonr_Position_EF", validateInput(strHashValue), "E_position", currentScreen);
													break;
												case"E_Country":
													blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_EntityOwnerSuppDetails:ax2EntityOwnerInfoSectionE:AuthPerson_CountryType_DD", validateInput(strHashValue), "E_Country", currentScreen);
													break;
												case"E_ADD":										
													blnStatus = setValue(WebControl.BUTTON, IdentifyBy.NAME, "form_EntityOwnerSuppDetails:ax2EntityOwnerInfoSectionE:AuthPersonInfoAdd_CButton", validateInput(strHashValue), "ADD", currentScreen);
													break;
												case "Signature":
													blnStatus = setValue(WebControl.CHECKBOX, IdentifyBy.NAME, "form_EntityOwnerSuppDetails:ax2EntityOwnerInfoSectionE:AuthPerson_qcchk_CB", validateInput(strHashValue), "Signature", currentScreen);
													break;
												case"Date":
													blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_EntityOwnerSuppDetails:ax2EntityOwnerInfoSectionE:AuthPerson_DateTime_EF", validateInput(strHashValue), "Date", currentScreen);
													break;
												case"ADD":										
													blnStatus = setValue(WebControl.BUTTON, IdentifyBy.NAME, "form_EntityOwnerSuppDetails:drAdd", validateInput(strHashValue), "ADD", currentScreen);
													break;		
												case "default1":
													ReportGenerator.generateTestStep(false, currentScreen, "Field Navigation", strHashKey + " field not available in the current method.", false);
													break;
								
								} //end of switch
								if(!blnStatus) break;
							} //end of while
						}
						else {
							ReportGenerator.generateTestStep(false, currentScreen, "Switch to Frame", "Failed to switch frames " + strFrames.replaceAll(GlobalData.STRING_SEPARATOR, " > "), false);
							blnStatus = false;
						}
						objEnum = null;
							
					} catch(Exception objExp) {
						ReportGenerator.generateTestStep(false, currentScreen, "Exception occured", "Exception is - " + objExp.getMessage(), false);
						blnStatus = false;
					}
					return blnStatus;
				}
				private static boolean ContractApprove(OrderedHashtable objTestData) {
					boolean blnStatus = false;
					String strHashKey = "", strHashValue = "";
				
					try {
						String strFrames = "mainContentFrame" + GlobalData.STRING_SEPARATOR + "contentRightFrame" + GlobalData.STRING_SEPARATOR + "file";
						Enumeration objEnum = objTestData.enumerateKeys();
						if(switchToFrame(strFrames, false) && waitForPageLoad(MAX_TIMEOUT)) {
							
							while(objEnum.hasMoreElements()) {
								//blnStatus = false;
								strHashKey = objEnum.nextElement().toString();
								strHashValue = objTestData.get(strHashKey).toString();

								switch(strHashKey) {
								case "DO_NOT_ISSUE":   
									blnStatus = setValue(WebControl.RADIOBOX, IdentifyBy.NAME, "form_contractapproval:donotIssue", getAppRadioValues(strHashKey, strHashValue), "Do not Issue", currentScreen);
									break;
								case "CONTRACT_REASON":  
								blnStatus = setValue(WebControl.RADIOBOX, IdentifyBy.NAME, " form_contractapproval:CancelIncomplete", getAppRadioValues(strHashKey, strHashValue), "Contract reason", currentScreen);
								break;
								case"ISSUE_ACTION":
									
								blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_contractapproval:statusMenu", validateInput(strHashValue), "Issue Action ", currentScreen);
									break;
								case"COMMIT":
									blnStatus = setValue(WebControl.BUTTON, IdentifyBy.NAME, "form_contractapproval:cmdCommit", validateInput(strHashValue), "COMMIT", currentScreen);
									break;
								case"ISSUE_REASON":
									
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_contractapproval:selectReason", validateInput(strHashValue), "Issue Reason ", currentScreen);
										break;
								case"UNAPPROVE":
									blnStatus = setValue(WebControl.BUTTON, IdentifyBy.NAME, "form_contractapproval:cmdUnapprove", validateInput(strHashValue), "UNAPPROVE", currentScreen);
									break;		
								case "default1":   
									ReportGenerator.generateTestStep(false, currentScreen, "Field Navigation", strHashKey + " field not available in the current method.", false);
									break;
								} //end of switch
								if(!blnStatus) break;
								} //end of while
						}
						else {
							ReportGenerator.generateTestStep(false, currentScreen, "Switch to Frame", "Failed to switch frames " + strFrames.replaceAll(GlobalData.STRING_SEPARATOR, " > "), false);
							blnStatus = false;
						}
						objEnum = null;
							
					} catch(Exception objExp) {
						ReportGenerator.generateTestStep(false, currentScreen, "Exception occured", "Exception is - " + objExp.getMessage(), false);
						blnStatus = false;
					}
					return blnStatus;
				}

				
				//Function For LTC-BLP flow
				private static boolean LTCFLState(OrderedHashtable objTestData) {
					boolean blnStatus = false;
					String strHashKey = "", strHashValue = "";
					try {
						String strFrames = "mainContentFrame" + GlobalData.STRING_SEPARATOR + "contentRightFrame" + GlobalData.STRING_SEPARATOR + "file"+ GlobalData.STRING_SEPARATOR + "file";;
						Enumeration objEnum = objTestData.enumerateKeys();
						if(switchToFrame(strFrames, false) && waitForPageLoad(MAX_TIMEOUT)) {
							
							while(objEnum.hasMoreElements()) {
								//blnStatus = false;
								strHashKey = objEnum.nextElement().toString();
								strHashValue = objTestData.get(strHashKey).toString();

								switch(strHashKey) {
								
							
								case"BENEFIT_PERCENTAGE":
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_LongTermcare:ax2ThirdPartyLTC:BenefitPer_EF", validateInput(strHashValue), "2. Benefit Percentage:", currentScreen);
									break;
								
								case"Q4":
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_LongTermcare:ax2ThirdPartyLTC:ProtectionAUTYes_CB", validateInput(strHashValue), "4. I Elect to designate someone to receive notice:", currentScreen);
									break;
								case"Q4_DELETE_THIRD_PARTY":
									blnStatus = setValue(WebControl.CHECKBOX, IdentifyBy.NAME, "form_LongTermcare:ax2ThirdPartyLTC:deleteThirdParty_CB", validateInput(strHashValue), "Q4_DELETE_THIRD_PARTY", currentScreen);
									break;
									
								case"PREFIX":
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_LongTermcare:ax2ThirdPartyLTC:designatedPPrefix_DD", validateInput(strHashValue), "PREFIX", currentScreen);
									break;
								case"FIRST_NAME":
									blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_LongTermcare:ax2ThirdPartyLTC:designatedPFirst_EF", validateInput(strHashValue), "FIRST_NAME", currentScreen);
									break;
								case"MIDDLE_NAME":
									blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_LongTermcare:ax2ThirdPartyLTC:designatedPMiddle_EF", validateInput(strHashValue), "MIDDLE_NAME", currentScreen);
									break;
								case"LAST_NAME":
									blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_LongTermcare:ax2ThirdPartyLTC:designatedPLast_EF", validateInput(strHashValue), "LAST_NAME", currentScreen);
									break;
									
								case"SUFFIX":
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_LongTermcare:ax2ThirdPartyLTC:designatedPSuffix_DD", validateInput(strHashValue), "SUFFIX", currentScreen);
									break;
							
								
								case"POBOX_ADDRESS":
									blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_LongTermcare:ax2ThirdPartyLTC:poBox_CB", validateInput(strHashValue), "POBOX_ADDRESS", currentScreen);
									break;
								case"ADDRESS_TYPE":
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_LongTermcare:ax2ThirdPartyLTC:addressType_DD", validateInput(strHashValue), "ADDRESS_TYPE", currentScreen);
									break;
								case"STREET_NO":
									blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_LongTermcare:ax2ThirdPartyLTC:street_EF", validateInput(strHashValue), "STREET_NO", currentScreen);
									break;
								case"BLG_APT_SUITE":
									blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_LongTermcare:ax2ThirdPartyLTC:BldAptSuite_EF", validateInput(strHashValue), "BLG_APT_SUITE", currentScreen);
									break;
								case"CITY":
									blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_LongTermcare:ax2ThirdPartyLTC:designatedPCity_EF", validateInput(strHashValue), "CITY", currentScreen);
									break;
								case"COUNTY":
									blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_LongTermcare:ax2ThirdPartyLTC:designatedPCounty_EF", validateInput(strHashValue), "COUNTY", currentScreen);
									break;
								case"STATE":
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_LongTermcare:ax2ThirdPartyLTC:designatedPState_DD", validateInput(strHashValue), "STATE", currentScreen);
									break;
									
								case"ZIP":
									blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_LongTermcare:ax2ThirdPartyLTC:designatedPZip_EF", validateInput(strHashValue), "ZIP", currentScreen);
									break;
								case"COUNTRY":
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_LongTermcare:ax2ThirdPartyLTC:designatedPCountry_DD", validateInput(strHashValue), "COUNTRY", currentScreen);
									break;
								case"ADD":                                                              
									blnStatus = setValue(WebControl.BUTTON, IdentifyBy.NAME, "form_LongTermcare:ax2ThirdPartyLTC:paxaLifeLTCPAUTTableAdd_CButton", validateInput(strHashValue), "ADD", currentScreen);
									break;
									
								case"Q3A_I":                 								                                
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_LongTermcare:ax2GiLTC:LTCgeneralITablePane:0:LTCQ1Ans_DD", validateInput(strHashValue), "QUESTION :5A_I", currentScreen);
									break;
									
								case"Q3B":
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_LongTermcare:ax2GiLTC:LTCgeneralITablePane:1:LTCQ1Ans_DD", validateInput(strHashValue), "QUESTION :5B", currentScreen);
									break;
								case"Q3C":
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_LongTermcare:ax2GiLTC:LTCgeneralITablePane:2:LTCQ1Ans_DD", validateInput(strHashValue), "QUESTION :5C", currentScreen);
									break;
								case"Q3D":
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_LongTermcare:ax2GiLTC:LTCgeneralITablePane:3:LTCQ1Ans_DD", validateInput(strHashValue), "QUESTION :5D", currentScreen);
									break;
								case"Q3E":                                                   
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_LongTermcare:ax2GiLTC:LTCgeneralITablePane:4:LTCQ1Ans_DD", validateInput(strHashValue), "QUESTION :5E", currentScreen);
									break;
								
								case"Q4B_Q4D_COMPANY":                                        
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_LongTermcare:ax2OtherInsLTC:giqDetailsCompanyName_DD", validateInput(strHashValue), "Company:", currentScreen);
									break;
								case"Q4B_Q4D_POLICY_NO":
									blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_LongTermcare:ax2OtherInsLTC:policy_EF", validateInput(strHashValue), "Policy / Certificate No:", currentScreen);
									break;
								case"Q4B_Q4D_POLICY_TYPE":
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_LongTermcare:ax2OtherInsLTC:policyType_DD", validateInput(strHashValue), "POLICY_TYPE", currentScreen);
									break;
								
								case"Q4B_Q4D_AMOUNT":
									blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_LongTermcare:ax2OtherInsLTC:amount_EF", validateInput(strHashValue), "AMOUNT", currentScreen);
									break;
									
								case"Q4B_Q4D_CURRENTLY_INFORCE":
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_LongTermcare:ax2OtherInsLTC:currentlyEnforce_EF", validateInput(strHashValue), "Currently Inforce?", currentScreen);
									break;
								case"Q4B_Q4D_BEING_REPLACED":
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_LongTermcare:ax2OtherInsLTC:beingReplaced_EF", validateInput(strHashValue), "Being Replaced?", currentScreen);
									break;
								case"Q4B_Q4D_DATE_OF_LAPS":
									blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_LongTermcare:ax2OtherInsLTC:dateoflapse_EF", validateInput(strHashValue), "Date of Lapse:", currentScreen);
									break;
								case"Q4B_Q4D_ADD":                                          
									
									blnStatus = setValue(WebControl.BUTTON, IdentifyBy.NAME, "form_LongTermcare:ax2OtherInsLTC:pInsured1AddInfoAdd_CButton", validateInput(strHashValue), "ADD", currentScreen);
									break;
								
								
								case"Q4A":
									                                                          
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_LongTermcare:ax2MiLTC:medicalITablePane:0:QqAns_DD", validateInput(strHashValue), "Question : 6A", currentScreen);
									break;
									
								case"Q4B":
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_LongTermcare:ax2MiLTC:medicalITablePane:1:QqAns_DD", validateInput(strHashValue), "Question : 6B", currentScreen);
									break;
								case"Q4C_I":
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_LongTermcare:ax2MiLTC:medicalITablePane:2:QqAns_DD", validateInput(strHashValue), "Question : 6C-1", currentScreen);
									break;
								case"Q4C_II":                                                
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_LongTermcare:ax2MiLTC:medicalITablePane:3:QqAns_DD", validateInput(strHashValue), "Question : 6C-2", currentScreen);
									break;
						        case"4D_I":
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_LongTermcare:ax2MiLTC:medicalITablePane:4:QqAns_DD", validateInput(strHashValue), "Transient ischemic attack?", currentScreen);
									break;
								case"Q4D_II":
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_LongTermcare:ax2MiLTC:medicalITablePane:5:QqAns_DD", validateInput(strHashValue), "Stroke?", currentScreen);
									break;
								case"Q4D_III":
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_LongTermcare:ax2MiLTC:medicalITablePane:6:QqAns_DD", validateInput(strHashValue), "Depression?", currentScreen);
									break;
								
								case"Q4E":
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_LongTermcare:ax2MiLTC:medicalITablePane:7:QqAns_DD", validateInput(strHashValue), "Tremors?", currentScreen);
									break;
								case "default1":
									ReportGenerator.generateTestStep(false, currentScreen, "Field Navigation", strHashKey + " field not available in the current method.", false);
									break;
					
								} //end of switch
								if(!blnStatus) break;
							} //end of while
						}
						else {
							ReportGenerator.generateTestStep(false, currentScreen, "Switch to Frame", "Failed to switch frames " + strFrames.replaceAll(GlobalData.STRING_SEPARATOR, " > "), false);
							blnStatus = false;
						}
						objEnum = null;
							
					} catch(Exception objExp) {
						ReportGenerator.generateTestStep(false, currentScreen, "Exception occured", "Exception is - " + objExp.getMessage(), false);
						blnStatus = false;
					}
					return blnStatus;
				}
				
				
				
				//Function For LTCCAState flow
				private static boolean LTCCAState(OrderedHashtable objTestData) {
					boolean blnStatus = false;
					String strHashKey = "", strHashValue = "";
					try {
						String strFrames = "mainContentFrame" + GlobalData.STRING_SEPARATOR + "contentRightFrame" + GlobalData.STRING_SEPARATOR + "file"+ GlobalData.STRING_SEPARATOR + "file";;
						Enumeration objEnum = objTestData.enumerateKeys();
						if(switchToFrame(strFrames, false) && waitForPageLoad(MAX_TIMEOUT)) {
							
							while(objEnum.hasMoreElements()) {
								//blnStatus = false;
								strHashKey = objEnum.nextElement().toString();
								strHashValue = objTestData.get(strHashKey).toString();

								switch(strHashKey) {
								
								case"ACCELERATION_PERCENTAGE":
									blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_LongTermcare:ax2ThirdPartyLTC:acc_EF2", validateInput(strHashValue), "1. Acceleration Percentage:", currentScreen);
									
									break;
								case"BENEFIT_PERCENTAGE":
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_LongTermcare:ax2ThirdPartyLTC:BenefitPer_EF", validateInput(strHashValue), "2. Benefit Percentage:", currentScreen);
									break;
								case"NONFORFEITURE_BENEFIT":
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_LongTermcare:ax2ThirdPartyLTC:non_CB", validateInput(strHashValue), "3. Nonforfeiture Benefit:", currentScreen);
									break;
								case"Q4":
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_LongTermcare:ax2ThirdPartyLTC:ProtectionAUTYes_CB", validateInput(strHashValue), "4. I Elect to designate someone to receive notice:", currentScreen);
									break;
								case"Q4_DELETE_THIRD_PARTY":
									blnStatus = setValue(WebControl.CHECKBOX, IdentifyBy.NAME, "form_LongTermcare:ax2ThirdPartyLTC:deleteThirdParty_CB", validateInput(strHashValue), "Q4_DELETE_THIRD_PARTY", currentScreen);
									break;
									
								case"PREFIX":
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_LongTermcare:ax2ThirdPartyLTC:designatedPPrefix_DD", validateInput(strHashValue), "PREFIX", currentScreen);
									break;
								case"FIRST_NAME":
									blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_LongTermcare:ax2ThirdPartyLTC:designatedPFirst_EF", validateInput(strHashValue), "FIRST_NAME", currentScreen);
									break;
								case"MIDDLE_NAME":
									blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_LongTermcare:ax2ThirdPartyLTC:designatedPMiddle_EF", validateInput(strHashValue), "MIDDLE_NAME", currentScreen);
									break;
								case"LAST_NAME":
									blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_LongTermcare:ax2ThirdPartyLTC:designatedPLast_EF", validateInput(strHashValue), "LAST_NAME", currentScreen);
									break;
									
								case"SUFFIX":
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_LongTermcare:ax2ThirdPartyLTC:designatedPSuffix_DD", validateInput(strHashValue), "SUFFIX", currentScreen);
									break;
								
								case"ENTITY":
									
									break;
								case"RELATIONSHIP_TO_INSURED":
									break;
									
								
								
								case"POBOX_ADDRESS":
									blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_LongTermcare:ax2ThirdPartyLTC:poBox_CB", validateInput(strHashValue), "POBOX_ADDRESS", currentScreen);
									break;
								case"ADDRESS_TYPE":
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_LongTermcare:ax2ThirdPartyLTC:addressType_DD", validateInput(strHashValue), "ADDRESS_TYPE", currentScreen);
									break;
								case"STREET_NO":
									blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_LongTermcare:ax2ThirdPartyLTC:street_EF", validateInput(strHashValue), "STREET_NO", currentScreen);
									break;
								case"BLG_APT_SUITE":
									blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_LongTermcare:ax2ThirdPartyLTC:BldAptSuite_EF", validateInput(strHashValue), "BLG_APT_SUITE", currentScreen);
									break;
								case"CITY":
									blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_LongTermcare:ax2ThirdPartyLTC:designatedPCity_EF", validateInput(strHashValue), "CITY", currentScreen);
									break;
								case"COUNTY":
									blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_LongTermcare:ax2ThirdPartyLTC:designatedPCounty_EF", validateInput(strHashValue), "COUNTY", currentScreen);
									break;
								case"STATE":
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_LongTermcare:ax2ThirdPartyLTC:designatedPState_DD", validateInput(strHashValue), "STATE", currentScreen);
									break;
									
								case"ZIP":
									blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_LongTermcare:ax2ThirdPartyLTC:designatedPZip_EF", validateInput(strHashValue), "ZIP", currentScreen);
									break;
								case"COUNTRY":
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_LongTermcare:ax2ThirdPartyLTC:designatedPCountry_DD", validateInput(strHashValue), "COUNTRY", currentScreen);
									break;
								case"ADD":
									blnStatus = setValue(WebControl.BUTTON, IdentifyBy.NAME, "form_LongTermcare:ax2ThirdPartyLTC:paxaLifeLTCPAUTTableAdd_CButton", validateInput(strHashValue), "ADD", currentScreen);
									break;
								case"Q5A_I":
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_LongTermcare:ax2GiLTC:LTCgeneralITablePane:0:LTCQ1Ans_DD", validateInput(strHashValue), "QUESTION :5A_I", currentScreen);
									break;
								case"Q5B":
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_LongTermcare:ax2GiLTC:LTCgeneralITablePane:1:LTCQ1Ans_DD", validateInput(strHashValue), "QUESTION :5B", currentScreen);
									break;
								case"Q5C":
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_LongTermcare:ax2GiLTC:LTCgeneralITablePane:2:LTCQ1Ans_DD", validateInput(strHashValue), "QUESTION :5C", currentScreen);
									break;
								case"Q5D":
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_LongTermcare:ax2GiLTC:LTCgeneralITablePane:3:LTCQ1Ans_DD", validateInput(strHashValue), "QUESTION :5D", currentScreen);
									break;
								case"Q5E":
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_LongTermcare:ax2GiLTC:LTCgeneralITablePane:4:LTCQ1Ans_DD", validateInput(strHashValue), "QUESTION :5E", currentScreen);
									break;
									
								case"Q5F":
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_LongTermcare:ax2GiLTC:LTCgeneralITablePane:5:LTCQ1Ans_DD", validateInput(strHashValue), "QUESTION :5F", currentScreen);
									break;
								case"Q5G":
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_LongTermcare:ax2GiLTC:LTCgeneralITablePane:6:LTCQ1Ans_DD", validateInput(strHashValue), "QUESTION :5G", currentScreen);
									break;
								case"Q5H":
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_LongTermcare:ax2GiLTC:LTCgeneralITablePane:7:LTCQ1Ans_DD", validateInput(strHashValue), "QUESTION :5H", currentScreen);
									break;
								case"Q5I":
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_LongTermcare:ax2GiLTC:LTCgeneralITablePane:8:LTCQ1Ans_DD", validateInput(strHashValue), "QUESTION :5I", currentScreen);
									break;
									
								case"Q5F_Q5H_COMPANY":
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_LongTermcare:ax2OtherInsLTC:giqDetailsCompanyName_DD", validateInput(strHashValue), "Company:", currentScreen);
									break;
								case"Q5F_Q5H_POLICY_NO":
									blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_LongTermcare:ax2OtherInsLTC:policy_EF", validateInput(strHashValue), "Policy / Certificate No:", currentScreen);
									break;
								case"Q5F_Q5H_POLICY_TYPE":
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_LongTermcare:ax2OtherInsLTC:policyType_DD", validateInput(strHashValue), "POLICY_TYPE", currentScreen);
									break;
								
								case"Q5F_Q5H_AMOUNT":
									blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_LongTermcare:ax2OtherInsLTC:amount_EF", validateInput(strHashValue), "AMOUNT", currentScreen);
									break;
									
								case"Q5F_Q5H_CURRENTLY_INFORCE":
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_LongTermcare:ax2OtherInsLTC:currentlyEnforce_EF", validateInput(strHashValue), "Currently Inforce?", currentScreen);
									break;
								case"Q5F_Q5H_BEING_REPLACED":
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_LongTermcare:ax2OtherInsLTC:beingReplaced_EF", validateInput(strHashValue), "Being Replaced?", currentScreen);
									break;
								case"Q5F_Q5H_DATE_OF_LAPS":
									blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_LongTermcare:ax2OtherInsLTC:dateoflapse_EF", validateInput(strHashValue), "Date of Lapse:", currentScreen);
									break;
								case"Q5F_Q5H_ADD":
									
									blnStatus = setValue(WebControl.BUTTON, IdentifyBy.NAME, "form_LongTermcare:ax2OtherInsLTC:pInsured1AddInfoAdd_CButton", validateInput(strHashValue), "ADD", currentScreen);
									
									break;
								case"Q6A":
									
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_LongTermcare:ax2MiLTC:medicalITablePane:0:QqAns_DD", validateInput(strHashValue), "Question : 6A", currentScreen);
									break;
									
								case"Q6B":
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_LongTermcare:ax2MiLTC:medicalITablePane:1:QqAns_DD", validateInput(strHashValue), "Question : 6B", currentScreen);
									break;
								case"Q6C_I":
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_LongTermcare:ax2MiLTC:medicalITablePane:2:QqAns_DD", validateInput(strHashValue), "Question : 6C-1", currentScreen);
									break;
								case"Q6C_II":                                                 
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_LongTermcare:ax2MiLTC:medicalITablePane:3:QqAns_DD", validateInput(strHashValue), "Question : 6C-2", currentScreen);
									break;
							
								

								case"6D_TRANSIENT_ISCHEMIC":
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_LongTermcare:ax2MiLTC:medicalI1TablePane:0:QqAns1_DD", validateInput(strHashValue), "Transient ischemic attack?", currentScreen);
									break;
								case"Q6D_STROKE":
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_LongTermcare:ax2MiLTC:medicalI1TablePane:1:QqAns1_DD", validateInput(strHashValue), "Stroke?", currentScreen);
									break;
								case"Q6D_DEPRESSION":
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_LongTermcare:ax2MiLTC:medicalI1TablePane:2:QqAns1_DD", validateInput(strHashValue), "Depression?", currentScreen);
									break;
								case"Q6D_SEIZURES":
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_LongTermcare:ax2MiLTC:medicalI1TablePane:3:QqAns1_DD", validateInput(strHashValue), "Seizures?", currentScreen);
									break;
								case"Q6D_TREMORS":
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_LongTermcare:ax2MiLTC:medicalI1TablePane:4:QqAns1_DD", validateInput(strHashValue), "Tremors?", currentScreen);
									break;
								case"Q6D_NUMBNESS":
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_LongTermcare:ax2MiLTC:medicalI1TablePane:5:QqAns1_DD", validateInput(strHashValue), "Numbness?", currentScreen);
									break;
								case"Q6D_IMBALANCE":
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_LongTermcare:ax2MiLTC:medicalI1TablePane:6:QqAns1_DD", validateInput(strHashValue), "Imbalance?", currentScreen);
									break;
								case"Q6D_AMNESIA":
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_LongTermcare:ax2MiLTC:medicalI1TablePane:7:QqAns1_DD", validateInput(strHashValue), "Amnesia?", currentScreen);
									break;
								case"Q6D_CONFUSION":
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_LongTermcare:ax2MiLTC:medicalI1TablePane:8:QqAns1_DD", validateInput(strHashValue), "Confusion?", currentScreen);
									break;
								case"Q6D_MEMORY_LOSS":
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_LongTermcare:ax2MiLTC:medicalI1TablePane:9:QqAns1_DD", validateInput(strHashValue), "Memory loss?", currentScreen);
									break;
								case"Q6D_BLADDER_CANCER":
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_LongTermcare:ax2MiLTC:medicalI1TablePane:10:QqAns1_DD", validateInput(strHashValue), "Bladder cancer or tumor?", currentScreen);
									break;
								case"Q6D_PROSTATE_CANCER":
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_LongTermcare:ax2MiLTC:medicalI1TablePane:11:QqAns1_DD", validateInput(strHashValue), "Prostate cancer or tumor?", currentScreen);
									break;
								case"Q6D_REPRODUCTIVE_CANCER":
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_LongTermcare:ax2MiLTC:medicalI1TablePane:12:QqAns1_DD", validateInput(strHashValue), "Cancer or tumor of the reproductive organs?", currentScreen);
									break;
								case"Q6D_LIVER_CANCER":
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_LongTermcare:ax2MiLTC:medicalI1TablePane:13:QqAns1_DD", validateInput(strHashValue), "Liver cancer or tumor?", currentScreen);
									break;
								case"Q6D_INCONTINENCE_PROBLEMS":
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_LongTermcare:ax2MiLTC:medicalI1TablePane:14:QqAns1_DD", validateInput(strHashValue), "Incontinence problems?", currentScreen);
									break;
								case"Q6D_OSTEOPOROSIS":
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_LongTermcare:ax2MiLTC:medicalI1TablePane:15:QqAns1_DD", validateInput(strHashValue), "Osteoporosis?", currentScreen);
									break;
								case"Q6D_ARTHRITIS":
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_LongTermcare:ax2MiLTC:medicalI1TablePane:16:QqAns1_DD", validateInput(strHashValue), "Arthritis?", currentScreen);
									break;
								case"Q6D_ATAXIA":
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_LongTermcare:ax2MiLTC:medicalI1TablePane:17:QqAns1_DD", validateInput(strHashValue), "Ataxia?", currentScreen);
								break;
								case"Q6D_TANSVERSE":
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_LongTermcare:ax2MiLTC:medicalI1TablePane:18:QqAns1_DD", validateInput(strHashValue), "Tansverse myelitis?", currentScreen);
									break;
										
								case"Q6D_MYASTHENIA_GRAVIS":
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_LongTermcare:ax2MiLTC:medicalI1TablePane:19:QqAns1_DD", validateInput(strHashValue), "Myasthenia gravis?", currentScreen);
									break;
										
								case"Q6D_BLINDNESS":
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_LongTermcare:ax2MiLTC:medicalI1TablePane:20:QqAns1_DD", validateInput(strHashValue), "Blindness?", currentScreen);
									break;
										
								case"Q6D_POST_POLIO":
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_LongTermcare:ax2MiLTC:medicalI1TablePane:21:QqAns1_DD", validateInput(strHashValue), "Post polio syndrome? ", currentScreen);
									break;
						
								case"Q6D_AMPUTATION_HIP":
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_LongTermcare:ax2MiLTC:medicalI1TablePane:22:QqAns1_DD", validateInput(strHashValue), "Amputation of the hip?", currentScreen);
									break;
										
								case"Q6D_AMPUTATION_KNEE":
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_LongTermcare:ax2MiLTC:medicalI1TablePane:23:QqAns1_DD", validateInput(strHashValue), "Amputation of the knee?", currentScreen);
									break;
								case"Q6D_AMPUTATION_SHOULDER":
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_LongTermcare:ax2MiLTC:medicalI1TablePane:24:QqAns1_DD", validateInput(strHashValue), "Amputation of the shoulder?", currentScreen);
									break;
								case"Q6D_AMPUTATION_BONE":
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_LongTermcare:ax2MiLTC:medicalI1TablePane:25:QqAns1_DD", validateInput(strHashValue), "Amputation of the bone?", currentScreen);
									break;
								case"Q6D_AMPUTATION_JOINTS":
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_LongTermcare:ax2MiLTC:medicalI1TablePane:26:QqAns1_DD", validateInput(strHashValue), "Amputation of the joints?", currentScreen);
									break;
								
								case"Q6E":
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_LongTermcare:ax2MiLTC:medicalI2TablePane:0:QqAns2_DD", validateInput(strHashValue), "Question :6e", currentScreen);
									break;
								case"Q6F_I":
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_LongTermcare:ax2MiLTC:medicalI2TablePane:1:QqAns2_DD", validateInput(strHashValue), "Question :6f-1", currentScreen);
									break;
								case"Q6F_II":
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_LongTermcare:ax2MiLTC:medicalI2TablePane:2:QqAns2_DD", validateInput(strHashValue), "Question :6f-2", currentScreen);
									break;
								case"Q6G_I":
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_LongTermcare:ax2MiLTC:medicalI2TablePane:3:QqAns2_DD", validateInput(strHashValue), "Question :6g-1", currentScreen);
									break;
										
								case"Q6G_II":
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_LongTermcare:ax2MiLTC:medicalI2TablePane:4:QqAns2_DD", validateInput(strHashValue), "Question :6g-2", currentScreen);
									break;
								case"Q6G_III":
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_LongTermcare:ax2MiLTC:medicalI2TablePane:5:QqAns2_DD", validateInput(strHashValue), "Question :6g-3", currentScreen);
									break;
									
								case"Q6G_IV":
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_LongTermcare:ax2MiLTC:medicalI2TablePane:6:QqAns2_DD", validateInput(strHashValue), "Question :6g-4", currentScreen);
									break;
								case"Q6H":
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_LongTermcare:ax2MiLTC:medicalI2TablePane:7:QqAns2_DD", validateInput(strHashValue), "Question :6h", currentScreen);
									break;
							
								
								case"Q6RX":                                                   
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_LongTermcare:ax2MiLTC:QqAns3_DD", validateInput(strHashValue), "6RX. Prescribed Medication(s) present?", currentScreen);
									break;
								
								case"IMPORTANCE_NOTICE":
									blnStatus = setValue(WebControl.UNIQUE_CHECKBOX, IdentifyBy.NAME, "form_LongTermcare:ax2SignLTC:acknowledgement_DD", getAppCheckboxValues(strHashKey, strHashValue), "Important Notice Regarding Policies Available", currentScreen);
									break;
								case"RIDER_OUTLINE":
									blnStatus = setValue(WebControl.UNIQUE_CHECKBOX, IdentifyBy.NAME, "form_LongTermcare:ax2SignLTC:acknowledgement_DD", getAppCheckboxValues(strHashKey, strHashValue), "Rider Outline of Coverage", currentScreen);
									break;
								case"HEALTH_INSURANCE":
									blnStatus = setValue(WebControl.UNIQUE_CHECKBOX, IdentifyBy.NAME, "form_LongTermcare:ax2SignLTC:acknowledgement_DD", getAppCheckboxValues(strHashKey, strHashValue), "Health Insurance Counseling and Advocacy Program (HICAP) Notice", currentScreen);
									break;
									
								case"SHOPPERS_GUIDE":
									blnStatus = setValue(WebControl.UNIQUE_CHECKBOX, IdentifyBy.NAME, "form_LongTermcare:ax2SignLTC:acknowledgement_DD", getAppCheckboxValues(strHashKey, strHashValue), "Shopper's Guide to Long-Term Care Insurance", currentScreen);
									break;
								case"LONG_TER":
									blnStatus = setValue(WebControl.UNIQUE_CHECKBOX, IdentifyBy.NAME, "form_LongTermcare:ax2SignLTC:acknowledgement_DD", getAppCheckboxValues(strHashKey, strHashValue), "Long-Term Care Personal Worksheet", currentScreen);
									break;
								case"NOTICE_TO_APPLICANT":
									blnStatus = setValue(WebControl.UNIQUE_CHECKBOX, IdentifyBy.NAME, "form_LongTermcare:ax2SignLTC:acknowledgement_DD", getAppCheckboxValues(strHashKey, strHashValue), "Notice to Applicant Regarding Replacement of Long-Term Care Insurance", currentScreen);
									break;
								
								
								case"SIGNATURE_INSURED":
									
									blnStatus = setValue(WebControl.CHECKBOX, IdentifyBy.NAME, "form_LongTermcare:ax2SignLTC:ltcSignatureofProposedInsured1_CB", validateInput(strHashValue), "Signature of Proposed Insured", currentScreen);
									break;
								case"SIGNATURE_OWNER":
									blnStatus = setValue(WebControl.CHECKBOX, IdentifyBy.NAME, "form_LongTermcare:ax2SignLTC:ltcSignatureofOwner_CB", validateInput(strHashValue), "Signature of Owner or Applicant if not Proposed Insured", currentScreen);
									break;
								case"SIGNATURE_CITY":
									blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_LongTermcare:ax2SignLTC:ltcSignedAtCity_EF", validateInput(strHashValue), "Signed At City:", currentScreen);
									break;
								case"SIGNATURE_STATE":
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_LongTermcare:ax2SignLTC:ltcSignedAtState_DD", validateInput(strHashValue), "State:", currentScreen);
									break;
								case"SIGNATURE_DATE":
									blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_LongTermcare:ax2SignLTC:ltcSignedAtDate_EF", validateInput(strHashValue), "Date", currentScreen);
									break;
								
								
								case"Q7":
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_LongTermcare:ax2SignLTC:witness_CB", validateInput(strHashValue), "7. I have Witnessed the signature required on the fully completed Part 1.", currentScreen);
									break;
								case"SIGNATURE_BROKER":
									blnStatus = setValue(WebControl.CHECKBOX, IdentifyBy.NAME, "form_LongTermcare:ax2SignLTC:ltcFinancialProfessionalSignPresent_CB", validateInput(strHashValue), "Signature of Licensed Professional/Insurance Broker", currentScreen);
									break;
								case"BROKER_DATE":
									blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_LongTermcare:ax2SignLTC:ltcFinancialProfessionalDate_EF", validateInput(strHashValue), "Date", currentScreen);
									break;
								case "default1":
									ReportGenerator.generateTestStep(false, currentScreen, "Field Navigation", strHashKey + " field not available in the current method.", false);
									break;
								
					
								} //end of switch
								if(!blnStatus) break;
							} //end of while
						}
						else {
							ReportGenerator.generateTestStep(false, currentScreen, "Switch to Frame", "Failed to switch frames " + strFrames.replaceAll(GlobalData.STRING_SEPARATOR, " > "), false);
							blnStatus = false;
						}
						objEnum = null;
							
					} catch(Exception objExp) {
						ReportGenerator.generateTestStep(false, currentScreen, "Exception occured", "Exception is - " + objExp.getMessage(), false);
						blnStatus = false;
					}
					return blnStatus;
				}
				
		//Function For CTIR flow
		private static boolean CTIR(OrderedHashtable objTestData) {
			boolean blnStatus = false;
			String strHashKey = "", strHashValue = "";
			try {
				String strFrames = "mainContentFrame" + GlobalData.STRING_SEPARATOR + "contentRightFrame" + GlobalData.STRING_SEPARATOR + "file" + GlobalData.STRING_SEPARATOR + "file";
				Enumeration objEnum = objTestData.enumerateKeys();
				if(switchToFrame(strFrames, false) && waitForPageLoad(MAX_TIMEOUT)) {
					
					while(objEnum.hasMoreElements()) {
						//blnStatus = false;
						strHashKey = objEnum.nextElement().toString();
						strHashValue = objTestData.get(strHashKey).toString();

						switch(strHashKey) {
																										

						case"AMOUNT":
							blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_childTerm:childTerm:amount_EF", validateInput(strHashValue), "Amount", currentScreen);
							break;
						case"PREFIX":
							blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_childTerm:childTerm:childPrefix_DD", validateInput(strHashValue), "Prefix", currentScreen);
							break;
						case"FIRST_NAME":
							blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_childTerm:childTerm:childFirstName_EF", validateInput(strHashValue), "First", currentScreen);
							break;
						case"MIDDLE_NAME":
							blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_childTerm:childTerm:childMiddleName_EF", validateInput(strHashValue), "Middle", currentScreen);
							break;
						case"LAST_NAME":
							blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_childTerm:childTerm:childLastName_EF", validateInput(strHashValue), "Last", currentScreen);
							break;
						case"SUFFIX":
							blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_childTerm:childTerm:childSuffix_DD", validateInput(strHashValue), "Suffix", currentScreen);
							break;
							
						case"GENDER":
							blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_childTerm:childTerm:gender_DD", validateInput(strHashValue), "Gender", currentScreen);
							break;
						case"DATE_OF_BIRTH":
							blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_childTerm:childTerm:dateOfBirth_EF", validateInput(strHashValue), "Date Of Birth:", currentScreen);
							break;
						case"HEIGHT_FEET_INCHES":
							blnStatus = setValue(WebControl.RADIOBOX, IdentifyBy.NAME, "form_childTerm:childTerm:height_RB", getAppRadioValues(strHashKey, strHashValue), "Feet and Inches/Inches", currentScreen);
							break;
							
						case"HEIGHT_FI_FEET":
							blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_childTerm:childTerm:heightFeet_EF", validateInput(strHashValue), "Feet and Inches", currentScreen);
							break;
						case"HEIGHT_FI_INCHES":
							blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_childTerm:childTerm:heightInch_EF", validateInput(strHashValue), "Feet and Inches", currentScreen);
							break;
							
						case"HEIGHT_INCHES":
							blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_childTerm:childTerm:heightInches_EF", validateInput(strHashValue), "Inches", currentScreen);
							break;
						case"WEIGHT":
							blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_childTerm:childTerm:weight_EF", validateInput(strHashValue), "WEIGHT", currentScreen);
							break;
						case"RELATIONSHIP":
							blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_childTerm:childTerm:relationship_DD", validateInput(strHashValue), "Relationship", currentScreen);
							break;
						case"ADD":
							blnStatus = setValue(WebControl.BUTTON, IdentifyBy.NAME, "form_childTerm:childTerm:childrenDetailsAdd_CButton", validateInput(strHashValue), "ADD", currentScreen);
					    break;
						
						case"SIGNATURE_INSURED":
							blnStatus = setValue(WebControl.CHECKBOX, IdentifyBy.NAME, "form_childTerm:childTerm:proposedInsuredSign_CB", validateInput(strHashValue), "", currentScreen);
							break;
						case"INSURED_DATE":
							blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_childTerm:childTerm:insuredSignDate_EF", validateInput(strHashValue), "Insured Sign Date:", currentScreen);
							break;
						case"SIGNATURE_OWNER":
							blnStatus = setValue(WebControl.CHECKBOX, IdentifyBy.NAME, "form_childTerm:childTerm:ownerSign_CB", validateInput(strHashValue), "Signature of Owner", currentScreen);
							break;
						case"OWNER_DATE":
							blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_childTerm:childTerm:ownerSignDate_EF", validateInput(strHashValue), "Owner Sign Date:", currentScreen);
							break;
						case"SIGNATURE_BROKER":
							blnStatus = setValue(WebControl.CHECKBOX, IdentifyBy.NAME, "form_childTerm:childTerm:brokerSign_CB", validateInput(strHashValue), "Signature of Licensed Financial Professional/Insurance Broker", currentScreen);
							break;
						case"BROKER_DATE":
							blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_childTerm:childTerm:brokerSignDate_EF", validateInput(strHashValue), "FP/Insurance Broker Sign Date:", currentScreen);
							break;
						case "default1":
							ReportGenerator.generateTestStep(false, currentScreen, "Field Navigation", strHashKey + " field not available in the current method.", false);
							break;
			
						} //end of switch
						if(!blnStatus) break;
					} //end of while
				}
				else {
					ReportGenerator.generateTestStep(false, currentScreen, "Switch to Frame", "Failed to switch frames " + strFrames.replaceAll(GlobalData.STRING_SEPARATOR, " > "), false);
					blnStatus = false;
				}
				objEnum = null;
					
			} catch(Exception objExp) {
				ReportGenerator.generateTestStep(false, currentScreen, "Exception occured", "Exception is - " + objExp.getMessage(), false);
				blnStatus = false;
			}
			return blnStatus;
		}
		
		//Function For ReplacementNY flow
		private static boolean ReplacementNY(OrderedHashtable objTestData) {
			boolean blnStatus = false;
			String strHashKey = "", strHashValue = "";
			try {
				String strFrames = "mainContentFrame" + GlobalData.STRING_SEPARATOR + "contentRightFrame" + GlobalData.STRING_SEPARATOR + "file"+ GlobalData.STRING_SEPARATOR + "file"+ GlobalData.STRING_SEPARATOR + "file";
				Enumeration objEnum = objTestData.enumerateKeys();
				if(switchToFrame(strFrames, false) && waitForPageLoad(MAX_TIMEOUT)) {
					
					while(objEnum.hasMoreElements()) {
						//blnStatus = false;
						strHashKey = objEnum.nextElement().toString();
						strHashValue = objTestData.get(strHashKey).toString();

						switch(strHashKey) {
			
						case"Q1":                                                    
							blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_ReplacementNY:ax2ReplacementNY:agentQueriesTablePane:0:Q61bAns_DD", validateInput(strHashValue), "Question : 1", currentScreen);
							break;
						case"Q2":
							blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_ReplacementNY:ax2ReplacementNY:agentQueriesTablePane:1:Q61bAns_DD", validateInput(strHashValue), "Question : 2 ", currentScreen);
							break;
						case"Q3":
							blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_ReplacementNY:ax2ReplacementNY:agentQueriesTablePane:2:Q61bAns_DD", validateInput(strHashValue), "Question : 3", currentScreen);
							break;
							
						case"Q4":
							blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_ReplacementNY:ax2ReplacementNY:agentQueriesTablePane:3:Q61bAns_DD", validateInput(strHashValue), "Question : 4", currentScreen);
							break;
							
						case"Q5":
							blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_ReplacementNY:ax2ReplacementNY:agentQueriesTablePane:4:Q61bAns_DD", validateInput(strHashValue), "Question : 5", currentScreen);
							break;
						case"Q6":
							blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_ReplacementNY:ax2ReplacementNY:agentQueriesTablePane:5:Q61bAns_DD", validateInput(strHashValue), "Question : 6", currentScreen);
							break;
						case"SIGNATURE_APPLICANT":
						blnStatus = setValue(WebControl.CHECKBOX, IdentifyBy.NAME, "form_ReplacementNY:ax2ReplacementNY:applicantSignPresent_CB", validateInput(strHashValue), "SIGNATURE_APPLICANT", currentScreen);
							break;
							
						case"APPLICANT_DATE":                                          
							blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_ReplacementNY:ax2ReplacementNY:applicantSignDate_EF", validateInput(strHashValue), "DATE", currentScreen);
							break;
						case"SIGNATURE_OWNER":
							blnStatus = setValue(WebControl.CHECKBOX, IdentifyBy.NAME, "form_ReplacementNY:ax2ReplacementNY:applicantSign1Present_CB", validateInput(strHashValue), "SIGNATURE_OWNER", currentScreen);
							break;
							
						case"OWNER_DATE":
							blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_ReplacementNY:ax2ReplacementNY:ProposedInsuredSign1DateEF", validateInput(strHashValue), "OWNER_DATE", currentScreen);
							break;
						case"TOTLE_OF_APPLICANT":
							blnStatus = setValue(WebControl.CHECKBOX, IdentifyBy.NAME, "form_ReplacementNY:ax2ReplacementNY:TitleApplicant_CB", validateInput(strHashValue), "TOTLE_OF_APPLICANT", currentScreen);
							break;
						case"REPLACEMENT_INVOLVED":
							blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_ReplacementNY:ax2ReplacementNY:replacementDecisionAnswer_DD", validateInput(strHashValue), "To the best of my knowledge, a Replacement is involved in this transaction:", currentScreen);
							break;
							
						case"SIGNATURE_AGENT":                                          
							blnStatus = setValue(WebControl.CHECKBOX, IdentifyBy.NAME, "form_ReplacementNY:ax2ReplacementNY:agentSign1Present_CB", validateInput(strHashValue), "SIGNATURE_AGENT", currentScreen);
							break;
						case"AGENT_DATE":
							blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_ReplacementNY:ax2ReplacementNY:agentSign1Date_EF", validateInput(strHashValue), "AGENT_DATE", currentScreen);
							break;
						case "default1":
							ReportGenerator.generateTestStep(false, currentScreen, "Field Navigation", strHashKey + " field not available in the current method.", false);
							break;
			
						} //end of switch
						if(!blnStatus) break;
					} //end of while
				}
				else {
					ReportGenerator.generateTestStep(false, currentScreen, "Switch to Frame", "Failed to switch frames " + strFrames.replaceAll(GlobalData.STRING_SEPARATOR, " > "), false);
					blnStatus = false;
				}
				objEnum = null;
					
			} catch(Exception objExp) {
				ReportGenerator.generateTestStep(false, currentScreen, "Exception occured", "Exception is - " + objExp.getMessage(), false);
				blnStatus = false;
			}
			return blnStatus;
		}
		
		//Function For TCPO flow
		private static boolean TCPO(OrderedHashtable objTestData) {
			boolean blnStatus = false;
			String strHashKey = "", strHashValue = "";
			try {
				String strFrames = "mainContentFrame" + GlobalData.STRING_SEPARATOR + "contentRightFrame" + GlobalData.STRING_SEPARATOR + "file"+ GlobalData.STRING_SEPARATOR + "file";
				Enumeration objEnum = objTestData.enumerateKeys();
				if(switchToFrame(strFrames, false) && waitForPageLoad(MAX_TIMEOUT)) {
					
					while(objEnum.hasMoreElements()) {
						//blnStatus = false;
						strHashKey = objEnum.nextElement().toString();
						strHashValue = objTestData.get(strHashKey).toString();

						switch(strHashKey) {
						
				
						case"Q1_ORIGINAL_POLICY_NO":
							blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_TCPO:subView_TCPO:origPolicyNumber_EF1", validateInput(strHashValue), "a. Original policy numbers ", currentScreen);
							break;
						case"Q1_CONVERSION_FORM":
							blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_TCPO:subView_TCPO:convFrom_SL1", validateInput(strHashValue), "b. Conversion from", currentScreen);
							break;
						case"Q1_CONVERSION_DATE":
							blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_TCPO:subView_TCPO:cDateConType_EF", validateInput(strHashValue), "c. Conversion date", currentScreen);
							break;
						case"Q1_CONVERTION_TYPE":
							blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_TCPO:subView_TCPO:cDateCon_RB", validateInput(strHashValue), "d. Type of Conversion ", currentScreen);
							break;
						case"Q1_CURRENTLY_DISABLED":
							blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_TCPO:subView_TCPO:termConvSuppQuestionsTablePane1:0:Q1Ans_DD", validateInput(strHashValue), "e. Are you currently disabled?", currentScreen);
							break;
						case"Q1_POLICY_ATTACHED":
							blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_TCPO:subView_TCPO:policyAttached_DD", validateInput(strHashValue), "f. Is original policy attached? ", currentScreen);
							break;
						case"Q1_POLICY_LOST":
							blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_TCPO:subView_TCPO:policyLost_DD", validateInput(strHashValue), "If 'No', is original policy lost?", currentScreen);
							break;
						case"Q1_ARE_UNEARNED_PREMIUMS":
							blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_TCPO:subView_TCPO:tcpremium_RB", validateInput(strHashValue), "If there are unearned premium(s) on the Term ", currentScreen);
							break;
						case"":
							blnStatus = setValue(WebControl.BUTTON, IdentifyBy.NAME, "form_TCPO:subView_TCPO:termConvAdd_CButton", validateInput(strHashValue), "ADD", currentScreen);
							break;
							
						case"FILL_TERMCONVERSION":
							
							blnStatus = selectWebtableRow(IdentifyBy.ID, "form_TCPO:subView_TCPO:termConv_DataTable", "", "Term Conversion", currentScreen);
							
							
							blnStatus = setValue(WebControl.BUTTON, IdentifyBy.NAME, "form_TCPO:subView_TCPO:termConv_DataTable:0:personalInfo_CButton", validateInput(strHashValue), "FILL_TERMCONVERSION_R_OPAI", currentScreen);
							
							break;
						case"FILL_TERMCONVERSION_R_OPAI":
							
							blnStatus = selectWebtableRow(IdentifyBy.ID, "form_TCPO:subView_TermConvPurchaseOpt:purchaseOption_DataTable", "", "Term Conversion R OPAI", currentScreen);
							
							blnStatus = setValue(WebControl.BUTTON, IdentifyBy.NAME, "form_TCPO:subView_TermConvPurchaseOpt:purchaseOption_DataTable:0:personalInfo_CButton", validateInput(strHashValue), "FILL_TERMCONVERSION_R_OPAI", currentScreen);
							
							break;
							
							
						case"Q1_ADD":
							blnStatus = setValue(WebControl.BUTTON, IdentifyBy.NAME, "form_TCPO:subView_TCPO:termConvAdd_CButton", validateInput(strHashValue), "ADD", currentScreen);
							break;
							
						case"Q2_ORIGINAL_POLICY_NO":
							blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_TCPO:subView_TermConvPurchaseOpt:term_EF", validateInput(strHashValue), "a. Original policy numbers ", currentScreen);
							
							break;
						case"Q2_ADVANCE_PRIVILEGE":
							blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_TCPO:subView_TermConvPurchaseOpt:purchaseInfo_DD", validateInput(strHashValue), "b. Is the purchase made under Advanced Privilege/Option B or C?", currentScreen);
							break;
						case"Q2_OPTION_DATE_USED":
							blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_TCPO:subView_TermConvPurchaseOpt:optionDateEvent_EF", validateInput(strHashValue), "i. Option date used ", currentScreen);
							break;
						case"Q2_EVENT":
							blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_TCPO:subView_TermConvPurchaseOpt:event_RB", validateInput(strHashValue), "ii. Event ", currentScreen);
							break;
						case"Q2_MARRIAGE_DATE":
							blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_TCPO:subView_TermConvPurchaseOpt:marriage_EF", validateInput(strHashValue), "ii(a). Marriage Date", currentScreen);
							break;
						case"Q2_IIB_PREFIX":
							blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_TCPO:subView_TermConvPurchaseOpt:pInsured1Prefix_DD", validateInput(strHashValue), "Prefix:", currentScreen);
							break;
						case"Q2_IIB_FIRST_NAME":
							blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_TCPO:subView_TermConvPurchaseOpt:pInsured1First_EF", validateInput(strHashValue), "First:", currentScreen);
							break;
						case"Q2_IIB_MIDDLE_NAME":
							blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_TCPO:subView_TermConvPurchaseOpt:pInsured1Middle_EF", validateInput(strHashValue), "Middle:", currentScreen);
							break;
						case"Q2_IIB_LAST_NAME":
							blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_TCPO:subView_TermConvPurchaseOpt:pInsured1Last_EF", validateInput(strHashValue), "Last:", currentScreen);
							break;	
						case"Q2_IIB_SUFFIX":
							blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_TCPO:subView_TermConvPurchaseOpt:pInsured1Suffix_DD", validateInput(strHashValue), "Suffix:", currentScreen);
							break;
						
							 							
							
						case"Q2_IIC_PREFIX":
							blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_TCPO:subView_TermConvPurchaseOpt:childNamePrefix_DD", validateInput(strHashValue), "Prefix:", currentScreen);
							break;
						case"Q2_IIC_FIRST_NAME":
							blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_TCPO:subView_TermConvPurchaseOpt:childNameFirst_EF", validateInput(strHashValue), "First:", currentScreen);
							break;
						case"Q2_IIC_MIDDLE_NAME":
							blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_TCPO:subView_TermConvPurchaseOpt:childNameMiddle_EF", validateInput(strHashValue), "Middle:", currentScreen);
							break;
						case"Q2_IIC_LAST_NAME":
							blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_TCPO:subView_TermConvPurchaseOpt:childNameLast_EF", validateInput(strHashValue), "Last:", currentScreen);
							break;	
						case"Q2_IIC_SUFFIX":
							blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_TCPO:subView_TermConvPurchaseOpt:childNameSuffix_DD", validateInput(strHashValue), "Suffix:", currentScreen);
							break;
						
							
						case"Q2_IID_BORN":
							blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_TCPO:subView_TermConvPurchaseOpt:born_EF", validateInput(strHashValue), "ii(d). Born ", currentScreen);
							break;
						case"Q2_IIE_ADOPTION_DATE":
							blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_TCPO:subView_TermConvPurchaseOpt:adoption_EF", validateInput(strHashValue), "ii(e). Date  ", currentScreen);
							break;
						case"Q2_ADD":
							blnStatus = setValue(WebControl.BUTTON, IdentifyBy.NAME, "form_TCPO:subView_TermConvPurchaseOpt:purchaseOptionAdd_CButton", validateInput(strHashValue), "ADD", currentScreen);
							break;
						case "default1":
							ReportGenerator.generateTestStep(false, currentScreen, "Field Navigation", strHashKey + " field not available in the current method.", false);
							break;
						} //end of switch
						if(!blnStatus) break;
					} //end of while
				}
				else {
					ReportGenerator.generateTestStep(false, currentScreen, "Switch to Frame", "Failed to switch frames " + strFrames.replaceAll(GlobalData.STRING_SEPARATOR, " > "), false);
					blnStatus = false;
				}
				objEnum = null;
					
			} catch(Exception objExp) {
				ReportGenerator.generateTestStep(false, currentScreen, "Exception occured", "Exception is - " + objExp.getMessage(), false);
				blnStatus = false;
			}
			return blnStatus;
		}
		
		
		//Function For TermConversionOPAI flow
		private static boolean TermConversionOPAI(OrderedHashtable objTestData) {
			boolean blnStatus = false;
			String strHashKey = "", strHashValue = "";
			try {
				String strFrames = "FWin0" + GlobalData.STRING_SEPARATOR + "Content0";
				Enumeration objEnum = objTestData.enumerateKeys();
				if(switchToFrame(strFrames, false) && waitForPageLoad(MAX_TIMEOUT)) {
					
					while(objEnum.hasMoreElements()) {
						//blnStatus = false;
						strHashKey = objEnum.nextElement().toString();
						strHashValue = objTestData.get(strHashKey).toString();

						switch(strHashKey) {
			
						case"TYPE":
							
							blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_TermConvPopup:conversionType_SM", validateInput(strHashValue), "Type:", currentScreen);
							break;
						case"CONVERTED_AMOUNT":
							blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_TermConvPopup:convertedAmount_IT", validateInput(strHashValue), "Converted Amount", currentScreen);
							break;
						case"CONTRACT_STATUS":
							blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_TermConvPopup:contractStatus_SM", validateInput(strHashValue), "Contract Status:", currentScreen);
							break;
							
						case"PLAN_SERIES":
							blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_TermConvPopup:planSeries_SM", validateInput(strHashValue), "Plan Series:", currentScreen);
							break;
							
						case"APPROVED_RATE_CLASS":
							blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_TermConvPopup:rateClass_SM", validateInput(strHashValue), "Approved Rate Class:", currentScreen);
							break;
							
						case"REINSURED":
							blnStatus = setValue(WebControl.CHECKBOX, IdentifyBy.NAME, "form_TermConvPopup:reinsured_CB", validateInput(strHashValue), "Reinsured", currentScreen);
							break;
							
						case"INCREASE_REQUIRE":
							blnStatus = setValue(WebControl.CHECKBOX, IdentifyBy.NAME, "form_TermConvPopup:increaseReqUW_CB", validateInput(strHashValue), "Increase Requiring Underwriting", currentScreen);
							break;
							
						case"BENEFIT_ADDITION":
							blnStatus = setValue(WebControl.CHECKBOX, IdentifyBy.NAME, "form_TermConvPopup:benefitAdditionReqUW_CB", validateInput(strHashValue), "Benefit Addition Requiring Underwriting", currentScreen);
							break;
							
							
						case"TABLE_RATING":
							blnStatus = setValue(WebControl.CHECKBOX, IdentifyBy.NAME, "form_TermConvPopup:tableRating_CB", validateInput(strHashValue), "Table Rating", currentScreen);
							break;
							
						case"REDUCTION_IN_RATING":
							blnStatus = setValue(WebControl.CHECKBOX, IdentifyBy.NAME, "form_TermConvPopup:reqReductionInRating_CB", validateInput(strHashValue), "Requested Reduction in Rating", currentScreen);
							break;
							
						case"RIDER_ADDITION":
							blnStatus = setValue(WebControl.CHECKBOX, IdentifyBy.NAME, "form_TermConvPopup:riderAdditionReqUW_CB", validateInput(strHashValue), "Rider Addition Requiring Underwriting", currentScreen);
							break;
							
						case"REMOVE_EXCLUSION_RIDER":
							blnStatus = setValue(WebControl.CHECKBOX, IdentifyBy.NAME, "form_TermConvPopup:exclusionRider_CB", validateInput(strHashValue), "Remove Exclusion Rider", currentScreen);
							break;
							
						case"FLAT_EXTRA":
							blnStatus = setValue(WebControl.CHECKBOX, IdentifyBy.NAME, "form_TermConvPopup:flatExtra_CB", validateInput(strHashValue), "FLAT_EXTRA", currentScreen);
							break;
						case"RIDERS":
							blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_TermConvPopup:riders_SM", validateInput(strHashValue), "RIDERS", currentScreen);
							break;
						case"BENEFITS":
							blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_TermConvPopup:benefits_SM", validateInput(strHashValue), "BENEFITS", currentScreen);
							break;
						case"RATE_CLASS_P1":
							blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_TermConvPopup:rateClass_SM1", validateInput(strHashValue), "ProposedInsured1", currentScreen);
							break;
						case"RATE_CLASS_P2":
							blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_TermConvPopup:rateClass_SM2", validateInput(strHashValue), "ProposedInsured2", currentScreen);
							break;
						case"TERM_CONTESTABLE_DATE":
							blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_TermConvPopup:termContestableDate_IT", validateInput(strHashValue), "Term Contestable Date", currentScreen);
							break;
						case"REGISTER_DATE":
							blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_TermConvPopup:termConvRegisterDate_IT", validateInput(strHashValue), "Register Date", currentScreen);
							break;
						case"ADD":
							blnStatus = setValue(WebControl.BUTTON, IdentifyBy.NAME, "form_TermConvPopup:tcAdd_CButton", validateInput(strHashValue), "ADD", currentScreen);
							break;
						case "default1":
							ReportGenerator.generateTestStep(false, currentScreen, "Field Navigation", strHashKey + " field not available in the current method.", false);
							break;
					
						} //end of switch
						if(!blnStatus) break;
					} //end of while
				}
				else {
					ReportGenerator.generateTestStep(false, currentScreen, "Switch to Frame", "Failed to switch frames " + strFrames.replaceAll(GlobalData.STRING_SEPARATOR, " > "), false);
					blnStatus = false;
				}
				objEnum = null;
					
			} catch(Exception objExp) {
				ReportGenerator.generateTestStep(false, currentScreen, "Exception occured", "Exception is - " + objExp.getMessage(), false);
				blnStatus = false;
			}
			return blnStatus;
		}
		
		
		//Function For ADCAuthorizationForm flow
		private static boolean ADCAuthorizationForm(OrderedHashtable objTestData) {
			boolean blnStatus = false;
			String strHashKey = "", strHashValue = "";
			try {
				String strFrames = "mainContentFrame" + GlobalData.STRING_SEPARATOR + "contentRightFrame" + GlobalData.STRING_SEPARATOR + "file"+ GlobalData.STRING_SEPARATOR + "file";
				Enumeration objEnum = objTestData.enumerateKeys();
				if(switchToFrame(strFrames, false) && waitForPageLoad(MAX_TIMEOUT)) {
					
					while(objEnum.hasMoreElements()) {
						//blnStatus = false;
						strHashKey = objEnum.nextElement().toString();
						strHashValue = objTestData.get(strHashKey).toString();

						switch(strHashKey) {
		

						case"FORM":
							blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_authpage:axaProductBenefit:productNameSelect", validateInput(strHashValue), "Form:", currentScreen);
							break;
						case"ADB":
							blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_authpage:axaProductBenefit:AccidentalDeathBenefit", validateInput(strHashValue), "Accidental Death Benefit", currentScreen);
							break;
						case"PREFIX":
							blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_authpage:axaEligibleInsured:pInsured_DT:0:pInsured1PrefixSelect", validateInput(strHashValue), "Prefix:", currentScreen);
							break;
						case"FIRST_NAME":
							blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_authpage:axaEligibleInsured:pInsured_DT:0:pInsured1FirstNameInput", validateInput(strHashValue), "First Name	", currentScreen);
							break;
						case"MIDDLE_NAME":
							blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_authpage:axaEligibleInsured:pInsured_DT:0:pInsured1MiddleNameInput", validateInput(strHashValue), "Middle Name", currentScreen);
							break;
						case"LAST_NAME":
							blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_authpage:axaEligibleInsured:pInsured_DT:0:pInsured1LastNameInput", validateInput(strHashValue), "Last Name", currentScreen);
							break;
						case"SUFFIX":
							blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_authpage:axaEligibleInsured:pInsured_DT:0:pInsured1SuffixSelect", validateInput(strHashValue), "Suffix:", currentScreen);
							break;
						case"SSN":
							blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_authpage:axaEligibleInsured:pInsured_DT:0:pInsured1ssnInput", validateInput(strHashValue), "SS#:", currentScreen);
							break;
						case"GENDER":
							blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_authpage:axaEligibleInsured:pInsured_DT:0:pInsured1GenderSelect", validateInput(strHashValue), "GENDER", currentScreen);
							break;
						case"HOME_PHONE":
							blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_authpage:axaEligibleInsured:pInsured_DT:0:homePhoneInput", validateInput(strHashValue), "Home Phone	", currentScreen);
							break;
						case"DOB":
							blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_authpage:axaEligibleInsured:pInsured_DT:0:pInsured1DateOfBirthInput", validateInput(strHashValue), "Date of Birth", currentScreen);
							break;
						case"PO_BOX_ADDRESS":
							blnStatus = setValue(WebControl.CHECKBOX, IdentifyBy.NAME, "form_authpage:axaEligibleInsured:pInsured_DT:0:poBoxCheckBox", validateInput(strHashValue), "PO_BOX_ADDRESS", currentScreen);
							break;
						case"STREET_NO":
							blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_authpage:axaEligibleInsured:pInsured_DT:0:streetInput", validateInput(strHashValue), "No. & Street:", currentScreen);
							break;
						case"BUILDING_APT_SUITE":
							blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_authpage:axaEligibleInsured:pInsured_DT:0:BldAptSuiteInput", validateInput(strHashValue), "Bldg/Apt/Suite:", currentScreen);
							break;
						case"CITY":
							blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_authpage:axaEligibleInsured:pInsured_DT:0:pInsured1CityInput", validateInput(strHashValue), "City:", currentScreen);
							break;
						case"COUNTY":
							blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_authpage:axaEligibleInsured:pInsured_DT:0:pInsured1CountyInput", validateInput(strHashValue), "County:", currentScreen);
							break;
						case"STATE":
							blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_authpage:axaEligibleInsured:pInsured_DT:0:pInsured1StateSelect", validateInput(strHashValue), "State:", currentScreen);
							break;
						case"ZIP":
							blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_authpage:axaEligibleInsured:pInsured_DT:0:pInsured1ZipInput", validateInput(strHashValue), "Zip:", currentScreen);
							break;
						case"BENEFICIARY":
							blnStatus = setValue(WebControl.BUTTON, IdentifyBy.NAME, "form_authpage:axaBeneficiaryInfo:dtEInsured:0:cButtonBeneficiary", validateInput(strHashValue), "BENEFICIARY_Ipopup", currentScreen);
							break;
						case"DEFAULT_BENEFICIARY":
							blnStatus = setValue(WebControl.CHECKBOX, IdentifyBy.NAME, "form_authpage:axaBeneficiaryInfo:cBoxDefaultBeneficiary", validateInput(strHashValue), "Default Beneficiary", currentScreen);
							break;
						case"SECONDARY_ADDRESSEE":
							blnStatus = setValue(WebControl.BUTTON, IdentifyBy.NAME, "form_authpage:axaSecondaryAddresseeInfo:cButtonSecondaryAddressee", validateInput(strHashValue), "SECONDARY_ADDRESSEE_Ipopup", currentScreen);
							break;
						case"PREMIUM":
							blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_authpage:axaPaymentInfo:Premium", validateInput(strHashValue), "Premium:", currentScreen);
							break;
						case"ANNUAL_PREMIUM_R_EFT":
							blnStatus = setValue(WebControl.RADIOBOX, IdentifyBy.NAME, "form_authpage:axaPaymentInfo:grantorPersonEntityType_RB", getAppRadioValues(strHashKey, strHashValue), "Annual Premium /  Authorization for Monthly Electronic Funds Transfer", currentScreen);
							break;
						case"SIGNATURE_POLICY_OWNER":
							blnStatus = setValue(WebControl.CHECKBOX, IdentifyBy.NAME, "form_authpage:axaSignatureInfo:poBox_CB", validateInput(strHashValue), "Signature of Policyowner", currentScreen);
							break;
							
						case"DATE":
							blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_authpage:axaSignatureInfo:dateInput", validateInput(strHashValue), "Date", currentScreen);
							break;
						case"AGENT_CODE":
							blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_authpage:axaAdcAgentInformation:bgaNumber_EF", validateInput(strHashValue), "Agent's Code #", currentScreen);
							break;
						case"SEARCH":
							blnStatus = setValue(WebControl.BUTTON, IdentifyBy.NAME, "form_authpage:axaAdcAgentInformation:bgaNumber_CButton", validateInput(strHashValue), "Search", currentScreen);
							break;
						
						case"MARKETING_INDICATOR":
							blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_authpage:axaAdcAgentInformation:productNameSelect", validateInput(strHashValue), "Marketing Indicator:", currentScreen);
							break;
						case"NIGO":
							blnStatus = setValue(WebControl.CHECKBOX, IdentifyBy.NAME, "form_authpage:axaAdcAgentInformation:nigo_CB", validateInput(strHashValue), "NIGO", currentScreen);
							break;
						case"UAN":
							blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_authpage:axaAdcAgentInformation:applicationNumber", validateInput(strHashValue), "Unique Application Number", currentScreen);
							break;
						case"MAILED_BY_DATE":
							blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_authpage:axaAdcAgentInformation:mailedByDate_1T", validateInput(strHashValue), "Mailed By Date", currentScreen);
							break;
						case "default1":
							ReportGenerator.generateTestStep(false, currentScreen, "Field Navigation", strHashKey + " field not available in the current method.", false);
							break;						
					
						
						} //end of switch
						if(!blnStatus) break;
					} //end of while
				}
				else {
					ReportGenerator.generateTestStep(false, currentScreen, "Switch to Frame", "Failed to switch frames " + strFrames.replaceAll(GlobalData.STRING_SEPARATOR, " > "), false);
					blnStatus = false;
				}
				objEnum = null;
					
			} catch(Exception objExp) {
				ReportGenerator.generateTestStep(false, currentScreen, "Exception occured", "Exception is - " + objExp.getMessage(), false);
				blnStatus = false;
			}
			return blnStatus;
		}
		
		
		
	
		//Function For ADCBenificiary flow
		private static boolean ADCBenificiary(OrderedHashtable objTestData) {
			boolean blnStatus = false;
			String strHashKey = "", strHashValue = "";
			try {
				String strFrames = "FWin0" + GlobalData.STRING_SEPARATOR + "Content0";
				Enumeration objEnum = objTestData.enumerateKeys();
				if(switchToFrame(strFrames, false) && waitForPageLoad(MAX_TIMEOUT)) {
					
					while(objEnum.hasMoreElements()) {
						//blnStatus = false;
						strHashKey = objEnum.nextElement().toString();
						strHashValue = objTestData.get(strHashKey).toString();

						switch(strHashKey) {
			
						case"PERSON_R_ENTITY":
							blnStatus = setValue(WebControl.RADIOBOX, IdentifyBy.NAME, "form_UlBeneficiaryDetails:personEntityType_RB", getAppRadioValues(strHashKey, strHashValue), "Person / Entity", currentScreen);
							break;
						case"ENTITY_TYPE":
							
							blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_UlBeneficiaryDetails:personEntityType_DD", validateInput(strHashValue), "ENTITY_TYPE", currentScreen);
							break;
						case"SAME_AS_OWNER":
							blnStatus = setValue(WebControl.CHECKBOX, IdentifyBy.NAME, "form_UlBeneficiaryDetails:sameAsOwner_CB", validateInput(strHashValue), "Same as Owner", currentScreen);
							break;
						case"IRREVOCABLE":
							blnStatus = setValue(WebControl.CHECKBOX, IdentifyBy.NAME, "form_UlBeneficiaryDetails:irrevocable_CB", validateInput(strHashValue), "Irrevocable", currentScreen);
							break;
						case"PREFIX":
							blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_UlBeneficiaryDetails:prefix_DD", validateInput(strHashValue), "Prefix:", currentScreen);
							break;
						case"FIRST_NAME":
							blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_UlBeneficiaryDetails:firstName_EF", validateInput(strHashValue), "First:", currentScreen);
							break;
						case"MIDDLE_NAME":
							blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_UlBeneficiaryDetails:middleName_EF", validateInput(strHashValue), "Middle:", currentScreen);
							break;
						case"LAST_NAME":
							blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_UlBeneficiaryDetails:lastName_EF", validateInput(strHashValue), "Last:", currentScreen);
							break;
						case"SUFFIX":
							blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_UlBeneficiaryDetails:suffix_DD", validateInput(strHashValue), "Suffix:", currentScreen);
							break;
						case"ENTITY":
							blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_UlBeneficiaryDetails:entity_EF", validateInput(strHashValue), "Entity:", currentScreen);
							break;
						case"SSN":
							blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_UlBeneficiaryDetails:beneficiaryssnInput", validateInput(strHashValue), "SS#:", currentScreen);
							break;
						case"DOB":
							blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_UlBeneficiaryDetails:beneficiaryDateOfBirthInput", validateInput(strHashValue), "Date Of Birth", currentScreen);
							break;
						case"PO_BOX_ADDRESS":
							blnStatus = setValue(WebControl.CHECKBOX, IdentifyBy.NAME, "form_UlBeneficiaryDetails:poBoxCheckBoxB", validateInput(strHashValue), "P.O. Box Address", currentScreen);
							break;
						case"STREET_NO":
							blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_UlBeneficiaryDetails:streetInputB", validateInput(strHashValue), "No. & Street:", currentScreen);
							break;
						case"BUILDING_APT_SUITE":
							blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_UlBeneficiaryDetails:BldAptSuiteInputB", validateInput(strHashValue), "Bldg/Apt/Suite:", currentScreen);
							break;
						case"CITY":
							blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_UlBeneficiaryDetails:beneficiaryCityInputB", validateInput(strHashValue), "City:", currentScreen);
							break;
						case"COUNTY":
							blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_UlBeneficiaryDetails:beneficiaryCountyInputB", validateInput(strHashValue), "County:", currentScreen);
							break;
						case"STATE":
							blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_UlBeneficiaryDetails:beneficiaryStateSelectB", validateInput(strHashValue), "State:", currentScreen);
							break;
						case"ZIP":
							blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_UlBeneficiaryDetails:beneficiaryZipInputB", validateInput(strHashValue), "Zip:", currentScreen);
							break;
						case"TRUST_DATE":
							blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_UlBeneficiaryDetails:trustDate_EF", validateInput(strHashValue), "Trust Date:", currentScreen);
							break;
						case"RELATIONSHIP_TO_INSURED":
							blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_UlBeneficiaryDetails:relationshipToInsured_DD", validateInput(strHashValue), "Relationship to Insured:", currentScreen);
							break;
						case"BENEFICIARY_TYPE":
							blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_UlBeneficiaryDetails:beneficiaryType_DD", validateInput(strHashValue), "Beneficiary Type:", currentScreen);
							break;
						case"PERCENTAGE":
							blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_UlBeneficiaryDetails:beneficiaryPercentage_EF", validateInput(strHashValue), "Percentage:", currentScreen);
							break;
						case"SETTLEMENT_OPTION":
							blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_UlBeneficiaryDetails:Settlement_DD", validateInput(strHashValue), "Settlement Option:", currentScreen);
							break;
						case"ADD_TO_LIST":
							blnStatus = setValue(WebControl.BUTTON, IdentifyBy.NAME, "form_UlBeneficiaryDetails:beneficiaryAdd_CButton", validateInput(strHashValue), "ADD", currentScreen);
							break;
						case"ADD":
							blnStatus = setValue(WebControl.BUTTON, IdentifyBy.NAME, "form_UlBeneficiaryDetails:drAdd_CButton", validateInput(strHashValue), "ADD", currentScreen);
							break;
						case "default1":
							ReportGenerator.generateTestStep(false, currentScreen, "Field Navigation", strHashKey + " field not available in the current method.", false);
							break;
	
						} //end of switch
						if(!blnStatus) break;
					} //end of while
				}
				else {
					ReportGenerator.generateTestStep(false, currentScreen, "Switch to Frame", "Failed to switch frames " + strFrames.replaceAll(GlobalData.STRING_SEPARATOR, " > "), false);
					blnStatus = false;
				}
				objEnum = null;
					
			} catch(Exception objExp) {
				ReportGenerator.generateTestStep(false, currentScreen, "Exception occured", "Exception is - " + objExp.getMessage(), false);
				blnStatus = false;
			}
			return blnStatus;
		}
		

		//Function For ADCSecondaryAddressee flow
		private static boolean ADCSecondaryAddressee(OrderedHashtable objTestData) {
			boolean blnStatus = false;
			String strHashKey = "", strHashValue = "";
			try {
				String strFrames = "FWin0" + GlobalData.STRING_SEPARATOR + "Content0";
				Enumeration objEnum = objTestData.enumerateKeys();
				if(switchToFrame(strFrames, false) && waitForPageLoad(MAX_TIMEOUT)) {
					
					while(objEnum.hasMoreElements()) {
						//blnStatus = false;
						strHashKey = objEnum.nextElement().toString();
						strHashValue = objTestData.get(strHashKey).toString();

						switch(strHashKey) {
			
						case"PERSON_R_ENTITY":
							blnStatus = setValue(WebControl.RADIOBOX, IdentifyBy.NAME, "form_UlSecondaryaddressDetails:personEntityType_RB", getAppRadioValues(strHashKey, strHashValue), "Person / Entity", currentScreen);
							break;
						case"ENTITY_TYPE":
							
							blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_UlSecondaryaddressDetails:personEntityType_DD", validateInput(strHashValue), "ENTITY_TYPE", currentScreen);
							break;
						
						case"PREFIX":
							blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_UlSecondaryaddressDetails:prefix2_DD", validateInput(strHashValue), "Prefix:", currentScreen);
							break;
						case"FIRST_NAME":
							blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_UlSecondaryaddressDetails:first2_EF", validateInput(strHashValue), "First:", currentScreen);
							break;
						case"MIDDLE_NAME":
							blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_UlSecondaryaddressDetails:middle2_EF", validateInput(strHashValue), "Middle:", currentScreen);
							break;
						case"LAST_NAME":
							blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_UlSecondaryaddressDetails:last2_EF", validateInput(strHashValue), "Last:", currentScreen);
							break;
						case"SUFFIX":
							blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_UlSecondaryaddressDetails:suffix2_DD", validateInput(strHashValue), "Suffix:", currentScreen);
							break;
						case"ENTITY":
							blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_UlSecondaryaddressDetails:title_sEF", validateInput(strHashValue), "Entity:", currentScreen);
							break;
					
						case"PO_BOX_ADDRESS":
							blnStatus = setValue(WebControl.CHECKBOX, IdentifyBy.NAME, "form_UlSecondaryaddressDetails:poBox_CB", validateInput(strHashValue), "P.O. Box Address", currentScreen);
							break;
						case"ADDRESS_TYPE":
							blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_UlSecondaryaddressDetails:addressType_DD", validateInput(strHashValue), "ADDRESS_TYPE", currentScreen);
							break;
						case"STREET_NO":
							blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_UlSecondaryaddressDetails:street_EF", validateInput(strHashValue), "No. & Street:", currentScreen);
							break;
						case"BUILDING_APT_SUITE":
							blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_UlSecondaryaddressDetails:BldAptSuite_EF", validateInput(strHashValue), "Bldg/Apt/Suite:", currentScreen);
							break;
						case"CITY":
							blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_UlSecondaryaddressDetails:secondaryCity_EF", validateInput(strHashValue), "City:", currentScreen);
							break;
						case"COUNTY":
							blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_UlSecondaryaddressDetails:secondaryCounty_EF", validateInput(strHashValue), "County:", currentScreen);
							break;
						case"STATE":
							blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_UlSecondaryaddressDetails:secondaryState_DD", validateInput(strHashValue), "State:", currentScreen);
							break;
						case"ZIP":
							blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_UlSecondaryaddressDetails:secondaryZip_EF", validateInput(strHashValue), "Zip:", currentScreen);
							break;
						case"COUNTRY":
							blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_UlSecondaryaddressDetails:secondaryCountry_DD", validateInput(strHashValue), "COUNTRY", currentScreen);
							break;
						
						case"ADD_TO_LIST":
							blnStatus = setValue(WebControl.BUTTON, IdentifyBy.NAME, "form_UlSecondaryaddressDetails:secondaryAddInfoAdd_CButton", validateInput(strHashValue), "ADD", currentScreen);
							break;
						case"ADD":
							blnStatus = setValue(WebControl.BUTTON, IdentifyBy.NAME, "form_UlSecondaryaddressDetails:drAdd_CButton", validateInput(strHashValue), "ADD", currentScreen);
							break;
						case "default1":
							ReportGenerator.generateTestStep(false, currentScreen, "Field Navigation", strHashKey + " field not available in the current method.", false);
							break;
	
						} //end of switch
						if(!blnStatus) break;
					} //end of while
				}
				else {
					ReportGenerator.generateTestStep(false, currentScreen, "Switch to Frame", "Failed to switch frames " + strFrames.replaceAll(GlobalData.STRING_SEPARATOR, " > "), false);
					blnStatus = false;
				}
				objEnum = null;
					
			} catch(Exception objExp) {
				ReportGenerator.generateTestStep(false, currentScreen, "Exception occured", "Exception is - " + objExp.getMessage(), false);
				blnStatus = false;
			}
			return blnStatus;
		}
		
		//Function For ADCSelectAgent flow
		private static boolean ADCSelectAgent(OrderedHashtable objTestData) {
			boolean blnStatus = false;
			String strHashKey = "", strHashValue = "";
			try {
				String strFrames = "FWin0" + GlobalData.STRING_SEPARATOR + "Content0";
				Enumeration objEnum = objTestData.enumerateKeys();
				//if(waitForPageLoad(MAX_TIMEOUT)) {
					if(switchToFrame(strFrames, false) && waitForPageLoad(MAX_TIMEOUT)) {
						while(objEnum.hasMoreElements()) {
							//blnStatus = false;
							strHashKey = objEnum.nextElement().toString();
							strHashValue = objTestData.get(strHashKey).toString();
							
							switch(strHashKey) {
								case "SELECT_PRODUCER":
									blnStatus = selectWebtableRow(IdentifyBy.ID, "form_ProducerOrAgentSearch:bgaCMDetails_DataTable", "", "Producer", currentScreen);
									break;
								case "ADD":
									blnStatus = setValue(WebControl.BUTTON, IdentifyBy.NAME, "form_ProducerOrAgentSearch:drAdd", validateInput(strHashValue), "Add", currentScreen);
									break;
								case "default1":
									ReportGenerator.generateTestStep(false, currentScreen, "Field Navigation", strHashKey + " field not available in the current method.", false);
									break;
							} //end of switch
							if(!blnStatus) break;
						} //end of while
					}
					else {
						ReportGenerator.generateTestStep(false, currentScreen, "Switch to Frame", "Failed to switch frames " + strFrames.replaceAll(GlobalData.STRING_SEPARATOR, " > "), false);
						blnStatus = false;
					}
					objEnum = null;
				//}
					
			} catch(Exception objExp) {
				ReportGenerator.generateTestStep(false, currentScreen, "Exception occured", "Exception is - " + objExp.getMessage(), false);
				blnStatus = false;
			}
			return blnStatus;
		}
		
		
		//Function For ADCCWA flow
		private static boolean ADCCWA(OrderedHashtable objTestData) {
			boolean blnStatus = false;
			String strHashKey = "", strHashValue = "";
			WebElement objElement;
			try {
				String strFrames = "mainContentFrame" + GlobalData.STRING_SEPARATOR + "contentRightFrame" + GlobalData.STRING_SEPARATOR + "file"+ GlobalData.STRING_SEPARATOR + "file";
				Enumeration objEnum = objTestData.enumerateKeys();
				if(switchToFrame(strFrames, false) && waitForPageLoad(MAX_TIMEOUT)) {
					
					while(objEnum.hasMoreElements()) {
						//blnStatus = false;
						strHashKey = objEnum.nextElement().toString();
						strHashValue = objTestData.get(strHashKey).toString();

						switch(strHashKey) {
						
						
						case"CHECK_NUMBER":
							blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_indexApplication:axaProductBenefit:number", validateInput(strHashValue), "Check Number:", currentScreen);
							break;
						case"CHECK_DATE":
							waitForPageLoad(MAX_TIMEOUT);
							
							try{
								objElement = getWebElement(IdentifyBy.NAME, "form_indexApplication:axaProductBenefit:checkDate");
								objElement.sendKeys(validateInput(strHashValue));
								blnStatus=true;
							}catch(Exception obj1) {}
							if(blnStatus) {
								ReportGenerator.generateTestStep(true, currentScreen, "Set value for Check Date", "Set value " + validateInput(strHashValue), false);
							}
							else {
								ReportGenerator.generateTestStep(false, currentScreen, "Set value for Check Date", "Object not displayed in expected time.", false);
							}
							
							//blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_indexApplication:axaProductBenefit:checkDate", validateInput(strHashValue), "Check Date:", currentScreen);
							break;
						case"CHECK_AMOUNT":
							waitForPageLoad(MAX_TIMEOUT);
							
							try{
								objElement = getWebElement(IdentifyBy.NAME, "form_indexApplication:axaProductBenefit:amount");
								objElement.clear();
							}catch(Exception obj1) {}
							waitForPageLoad(MAX_TIMEOUT);
							try{
								objElement = getWebElement(IdentifyBy.NAME, "form_indexApplication:axaProductBenefit:amount");
								objElement.sendKeys(validateInput(strHashValue));
								blnStatus=true;
							}catch(Exception obj1) {}
							if(blnStatus) {
								ReportGenerator.generateTestStep(true, currentScreen, "Set value for Check Amount", "Set value " + validateInput(strHashValue), false);
							}
							else {
								ReportGenerator.generateTestStep(false, currentScreen, "Set value for Check Amount", "Object not displayed in expected time.", false);
							}
							try{
								objElement = getWebElement(IdentifyBy.NAME, "form_indexApplication:axaProductBenefit:amount");
								objElement.sendKeys(Keys.TAB);
							}catch(Exception obj1) {}
							//blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_indexApplication:axaProductBenefit:amount", validateInput(strHashValue), "Check Amount:", currentScreen);
							break;
						case"SPLIT_MULTIPLE_":
							blnStatus = setValue(WebControl.CHECKBOX, IdentifyBy.NAME, "form_indexApplication:axaProductBenefit:splitMultipleCheckbox", validateInput(strHashValue), "Split Multiple", currentScreen);
							break;
						case"FOREIGN_BANK_ADDRESS":
							blnStatus = setValue(WebControl.CHECKBOX, IdentifyBy.NAME, "form_indexApplication:axaProductBenefit:foreignBkAddCheckbox", validateInput(strHashValue), "Foreign Bank Address", currentScreen);
							break;
						case"NON_US_DOLLARS":
							blnStatus = setValue(WebControl.CHECKBOX, IdentifyBy.NAME, "form_indexApplication:axaProductBenefit:nonUSDollarsCheckbox", validateInput(strHashValue), "Non-US Dollars", currentScreen);
							break;
						case"HANDWRITTEN_CHECK":
							blnStatus = setValue(WebControl.CHECKBOX, IdentifyBy.NAME, "form_indexApplication:axaProductBenefit:isHandWrittenCheckbox", validateInput(strHashValue), "Handwritten Check?", currentScreen);
							break;
						case"PERSON_R_ENTITY":
							blnStatus = setValue(WebControl.RADIOBOX, IdentifyBy.NAME, "form_indexApplication:axaProductBenefit:_id1", getAppRadioValues(strHashKey, strHashValue), "Person / Entity", currentScreen);
							break;
						case"PREFIX":
							blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_indexApplication:axaProductBenefit:chkPersonPrefixDD", validateInput(strHashValue), "Prefix:", currentScreen);
							break;
						case"FIRST_NAME":
							waitForPageLoad(MAX_TIMEOUT);
							
							try{
								objElement = getWebElement(IdentifyBy.NAME, "form_indexApplication:axaProductBenefit:chkPersonFirstNameEF");
								objElement.sendKeys(validateInput(strHashValue));
								blnStatus=true;
							}catch(Exception obj1) {}
							if(blnStatus) {
								ReportGenerator.generateTestStep(true, currentScreen, "Set value for First Name", "Set value " + validateInput(strHashValue), false);
							}
							else {
								ReportGenerator.generateTestStep(false, currentScreen, "Set value for First Name", "Object not displayed in expected time.", false);
							}
							try{
								objElement = getWebElement(IdentifyBy.NAME, "form_indexApplication:axaProductBenefit:chkPersonFirstNameEF");
								objElement.sendKeys(Keys.TAB);
							}catch(Exception obj1) {}
							//blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_indexApplication:axaProductBenefit:chkPersonFirstNameEF", validateInput(strHashValue), "First", currentScreen);
							break;
						case"MIDDLE_NAME":
							blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_indexApplication:axaProductBenefit:chkPersonMiddleNameEF", validateInput(strHashValue), "Middle", currentScreen);
							break;
						case"LAST_NAME":
							blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_indexApplication:axaProductBenefit:chkPersonLastNameEF", validateInput(strHashValue), "Last", currentScreen);
							break;
						case"SUFFIX":
							blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_indexApplication:axaProductBenefit:chkPersonSuffixDD", validateInput(strHashValue), "Suffix:", currentScreen);
							break;
						case"ENTITY":
							blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_indexApplication:axaProductBenefit:entityName", validateInput(strHashValue), "ENTITY", currentScreen);
							break;
						case"COMPANY":
							blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_indexApplication:axaProductBenefit:checkcompanyList", validateInput(strHashValue), "Company:", currentScreen);
							break;
						case"CONTRACT":
							blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_indexApplication:axaProductBenefit:chkcontract", validateInput(strHashValue), "Contract:", currentScreen);
							break;
						case"INFORCE":
							blnStatus = setValue(WebControl.CHECKBOX, IdentifyBy.NAME, "form_indexApplication:axaProductBenefit:chkinforceCheckbox", validateInput(strHashValue), "Inforce", currentScreen);
							break;
						case"PAYMENT_ORIGINATION":
							blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_indexApplication:axaProductBenefit:pSourceDD", validateInput(strHashValue), "Payment Origination:", currentScreen);
							break;
						case"PAYMENT_TYPE":
							blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_indexApplication:axaProductBenefit:pTypeDD", validateInput(strHashValue), "Payment Type:", currentScreen);
							break;
						case"INFORCE_PAYMENT_DATE":
							blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_indexApplication:axaProductBenefit:date", validateInput(strHashValue), "Inforce Payment Date:", currentScreen);
		
							break;
						case"RECEIPT_DATE":
							blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_indexApplication:axaProductBenefit:receiptDate", validateInput(strHashValue), "Receipt Date:", currentScreen);
							break;
						case"COST_BASIS":
							blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_indexApplication:axaProductBenefit:costBasis", validateInput(strHashValue), "Cost Basis:", currentScreen);
							break;
						case"PREVIOUS_TAX_YEAR":
							blnStatus = setValue(WebControl.CHECKBOX, IdentifyBy.NAME, "form_indexApplication:axaProductBenefit:previousTaxYearCheckbox", validateInput(strHashValue), "Previous Tax Year", currentScreen);
							break;
						case "default1":
							ReportGenerator.generateTestStep(false, currentScreen, "Field Navigation", strHashKey + " field not available in the current method.", false);
							break;
						} //end of switch
						if(!blnStatus) break;
					} //end of while
				}
				else {
					ReportGenerator.generateTestStep(false, currentScreen, "Switch to Frame", "Failed to switch frames " + strFrames.replaceAll(GlobalData.STRING_SEPARATOR, " > "), false);
					blnStatus = false;
				}
				objEnum = null;
					
			} catch(Exception objExp) {
				ReportGenerator.generateTestStep(false, currentScreen, "Exception occured", "Exception is - " + objExp.getMessage(), false);
				blnStatus = false;
			}
			return blnStatus;
		}

		private static boolean UnderwriterRequirements() {
			boolean blnStatus = true;
			WebElement objInsured = null;
			String strStatus = "", strRequirement = "";
			int intCurrRow = 0;
			int intRowsCount = 0;
			String strOption = "";
			
			try {
				String strFrames = "mainContentFrame" + GlobalData.STRING_SEPARATOR + "contentRightFrame" + GlobalData.STRING_SEPARATOR + "file";
				if(switchToFrame(strFrames, false) && waitForPageLoad(MAX_TIMEOUT)) {
					objInsured = getWebElement(IdentifyBy.NAME, "form_reqimpoverview:tabHeader:_id26");
					if(objInsured!=null) {
						Select objSelect = new Select(objInsured);
						int intInsured = objSelect.getOptions().size();
						for(int intCounter=0;intCounter<intInsured;intCounter++) {
							objInsured = getWebElement(IdentifyBy.NAME, "form_reqimpoverview:tabHeader:_id26");
							objSelect = new Select(objInsured);
							strOption = objSelect.getOptions().get(intCounter).getText();
							objSelect.selectByIndex(intCounter);
							gobjWebDriver.getKeyboard().sendKeys(Keys.TAB);
							Thread.sleep(1000);
							waitForPageLoad(MAX_TIMEOUT);
							
							intCurrRow = 0;
							intRowsCount = 0;
							System.out.println("Current option " + strOption);
							
							List<WebElement> objRequirements = getWebElements(IdentifyBy.ID, "form_reqimpoverview:reqOverviewTbl:requirementsTable");
							if(objRequirements.size()>0) {
								List<WebElement> objRows = getWebElements(objRequirements.get(0), IdentifyBy.TAGNAME, "tr");
								
								if(objRows.size()>0) intRowsCount = objRows.size();
								System.out.println("Row count " + intRowsCount);
								while(intCurrRow<intRowsCount) {
									objRequirements = getWebElements(IdentifyBy.ID, "form_reqimpoverview:reqOverviewTbl:requirementsTable");
									if(objRequirements!=null) {
										objRows = getWebElements(objRequirements.get(0), IdentifyBy.TAGNAME, "tr");
										if(objRows.size()>0) {
											
											List<WebElement> objCols = getWebElements(objRows.get(intCurrRow), IdentifyBy.TAGNAME, "td");
											if(objCols.size()>0) {
												strRequirement = objCols.get(1).getText();
												strStatus = objCols.get(2).getText();
												System.out.println("Status " + strStatus);
												
												if(intCurrRow > 8 && intRowsCount > 8) {
													objRequirements.get(0).sendKeys(Keys.PAGE_DOWN);
													//objRows.get(intCurrRow).click();
													Thread.sleep(3000);
													//gobjWebDriver.getKeyboard().sendKeys(Keys.PAGE_DOWN);
													//Thread.sleep(MIC_TIMEOUT*1000);
												}
												
												if(strStatus.toLowerCase().trim().contains("received")) {
													try{
														gobjWebDriver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
														List<WebElement> objCheckbox = objCols.get(5).findElements(By.className("ovFullCellSelectCheckBox"));
														gobjWebDriver.manage().timeouts().implicitlyWait(MAX_TIMEOUT, TimeUnit.SECONDS);
														if(objCheckbox.size()>0) {
															if(!objCheckbox.get(0).isSelected()) {
																blnStatus = false;
																objCheckbox.get(0).click();
																waitForPageLoad(MAX_TIMEOUT);
																
																blnStatus = true;
															}
														}
																										
													}catch(Exception objExp) {}			
													ReportGenerator.generateTestStep(true, currentScreen, "Review Requirements for " + strOption, "Requirement " + strRequirement + " reviewed.", false);
													
													
												}
												else if(strStatus.toLowerCase().trim().contains("add") | strStatus.toLowerCase().trim().contains("order") | strStatus.toLowerCase().trim().contains("submitted")) {
											 		blnStatus = false;
													
													objRows.get(intCurrRow).click();
													
													waitForPageLoad(MAX_TIMEOUT);
													
													WebElement objButton = getWebElement(IdentifyBy.NAME, "form_reqimpoverview:btnReqView");
													objButton.sendKeys(Keys.ENTER);
													waitForPageLoad(MAX_TIMEOUT);
													ViewUpdateRequirements(false);
													ReportGenerator.generateTestStep(true, currentScreen, "Review Requirements for " + strOption, "Requirement " + strRequirement + " reviewed.", false);
													blnStatus = true;
												}
											}
										}
									}
									intCurrRow++;
									
								}
								
							}
							blnStatus = Impairments(strOption);
						}					
					}
					
				}
				else {
					ReportGenerator.generateTestStep(false, currentScreen, "Switch to Frame", "Failed to switch frames " + strFrames.replaceAll(GlobalData.STRING_SEPARATOR, " > "), false);
					blnStatus = false;
				}
					
			} catch(Exception objExp) {
				ReportGenerator.generateTestStep(false, currentScreen, "Exception occured", "Exception is - " + objExp.getMessage(), false);
				blnStatus = false;
			}
			return blnStatus;
		}
				
	private static boolean UWBusinessRequirements() {
		boolean blnStatus = true;
		WebElement objInsured = null;
		String strStatus = "", strRequirement = "";
		int intCurrRow = 0;
		int intRowsCount = 0;
		String strOption = "";
		
		try {
			String strFrames = "mainContentFrame" + GlobalData.STRING_SEPARATOR + "contentRightFrame" + GlobalData.STRING_SEPARATOR + "file";
			if(switchToFrame(strFrames, false) && waitForPageLoad(MAX_TIMEOUT)) {
				objInsured = getWebElement(IdentifyBy.NAME, "form_reqimpoverview:tabHeader:_id24");
				if(objInsured!=null) {
					Select objSelect = new Select(objInsured);
					int intInsured = objSelect.getOptions().size();
					for(int intCounter=0;intCounter<intInsured;intCounter++) {
						objInsured = getWebElement(IdentifyBy.NAME, "form_reqimpoverview:tabHeader:_id24");
						objSelect = new Select(objInsured);
						strOption = objSelect.getOptions().get(intCounter).getText();
						objSelect.selectByIndex(intCounter);
						gobjWebDriver.getKeyboard().sendKeys(Keys.TAB);
						Thread.sleep(1000);
						waitForPageLoad(MAX_TIMEOUT);
						
						intCurrRow = 0;
						intRowsCount = 0;
						System.out.println("Current option " + strOption);
						
						List<WebElement> objRequirements = getWebElements(IdentifyBy.ID, "form_reqimpoverview:reqOverviewTbl:requirementsTable");
						if(objRequirements.size()>0) {
							List<WebElement> objRows = getWebElements(objRequirements.get(0), IdentifyBy.TAGNAME, "tr");
							if(objRows!=null) {
								if(objRows.size()>0){
									intRowsCount = objRows.size();
									System.out.println("Row count " + intRowsCount);
									while(intCurrRow<intRowsCount) {
										objRequirements = getWebElements(IdentifyBy.ID, "form_reqimpoverview:reqOverviewTbl:requirementsTable");
										if(objRequirements!=null) {
											objRows = getWebElements(objRequirements.get(0), IdentifyBy.TAGNAME, "tr");
											if(objRows.size()>0) {
												
												List<WebElement> objCols = getWebElements(objRows.get(intCurrRow), IdentifyBy.TAGNAME, "td");
												if(objCols.size()>0) {
													strRequirement = objCols.get(1).getText();
													strStatus = objCols.get(2).getText();
													System.out.println("Status " + strStatus);
													
													if(intCurrRow >= 7 && intRowsCount >= 7) {
														objRequirements.get(0).sendKeys(Keys.PAGE_DOWN);
														//objRows.get(intCurrRow).click();
														Thread.sleep(3000);
														//gobjWebDriver.getKeyboard().sendKeys(Keys.PAGE_DOWN);
														//Thread.sleep(MIC_TIMEOUT*1000);
													}
													
													if(strStatus.toLowerCase().trim().contains("received")) 
													{
														try{
															gobjWebDriver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
															List<WebElement> objCheckbox = objCols.get(5).findElements(By.className("ovFullCellSelectCheckBox"));
															gobjWebDriver.manage().timeouts().implicitlyWait(MAX_TIMEOUT, TimeUnit.SECONDS);
															if(objCheckbox.size()>0)
															{
																if(!objCheckbox.get(0).isSelected()) 
																{
																	blnStatus = false;
																	objCheckbox.get(0).click();
																	waitForPageLoad(MAX_TIMEOUT);
																	
																	blnStatus = true;
																}
															}
																											
														   }catch(Exception objExp) {}			
														ReportGenerator.generateTestStep(true, currentScreen, "Review Requirements for " + strOption, "Requirement " + strRequirement + " reviewed.", false);
														
														
													}
													else if(strStatus.toLowerCase().trim().contains("add") | strStatus.toLowerCase().trim().contains("order")|strStatus.toLowerCase().trim().contains("submitted")) {
														blnStatus = false;
														
														objRows.get(intCurrRow).click();
														
														waitForPageLoad(MAX_TIMEOUT);
														
														WebElement objButton = getWebElement(IdentifyBy.NAME, "form_reqimpoverview:btnReqView");
														objButton.sendKeys(Keys.ENTER);
														waitForPageLoad(MAX_TIMEOUT);
														ViewUpdateRequirements(true);
														ReportGenerator.generateTestStep(true, currentScreen, "Review Requirements for " + strOption, "Requirement " + strRequirement + " reviewed.", false);
														blnStatus = true;
														
													}
													
												}
											}
										}
										intCurrRow++;
									}
								}
							
							}
						}
					}					
				}
				
			}
			else {
				ReportGenerator.generateTestStep(false, currentScreen, "Switch to Frame", "Failed to switch frames " + strFrames.replaceAll(GlobalData.STRING_SEPARATOR, " > "), false);
				blnStatus = false;
			}
				
		} catch(Exception objExp) {
			ReportGenerator.generateTestStep(false, currentScreen, "Exception occured", "Exception is - " + objExp.getMessage(), false);
			blnStatus = false;
		}
		return blnStatus;
	}
	
	private static boolean ViewUpdateRequirements(boolean blnOverride) {
		boolean blnStatus = false;
		
		
		try {
			WebElement objDetails = getWebElement(IdentifyBy.ID, "form_updateRequirement:reqformDataDisplay9");
			if(objDetails!=null) {
				String strDetails = objDetails.getText();
				System.out.println("Details are " + strDetails);
				if(strDetails.trim().contains("Automatic; Medical") || blnOverride) {
					blnStatus = selectRadiobox(IdentifyBy.NAME, "form_updateRequirement:_id88", "7");
				}
				else {
					blnStatus = selectRadiobox(IdentifyBy.NAME, "form_updateRequirement:_id88", "3");
				}
				if(blnStatus) {
					WebElement objElement = getWebElement(IdentifyBy.NAME, "form_updateRequirement:_id95");
					if(!objElement.isSelected()) objElement.click();
					objElement = getWebElement(IdentifyBy.NAME, "form_updateRequirement:_id110");
					objElement.sendKeys(Keys.PAGE_DOWN);
					objElement.click();
				}
				else {
					WebElement objElement = getWebElement(IdentifyBy.NAME, "form_updateRequirement:_id108");
					objElement.sendKeys(Keys.PAGE_DOWN);
					objElement.click();
				}
				waitForPageLoad(MAX_TIMEOUT);
			}
				
		} catch(Exception objExp) {
			ReportGenerator.generateTestStep(false, currentScreen, "Exception occured", "Exception is - " + objExp.getMessage(), false);
			blnStatus = false;
		}
		return blnStatus;
	}
	
	private static boolean Impairments(String strOption) {
		boolean blnStatus = true;
		int intRowsCount = 0, intCurrRow = 0;
		
		try {
			String strFrames = "mainContentFrame" + GlobalData.STRING_SEPARATOR + "contentRightFrame" + GlobalData.STRING_SEPARATOR + "file";
			if(switchToFrame(strFrames, false) && waitForPageLoad(MAX_TIMEOUT)) {
				List<WebElement> objImpairments = getWebElements(IdentifyBy.ID, "form_reqimpoverview:impOverviewTbl:impairmentsTable");
			
				if(objImpairments.size()>0) {
					List<WebElement> objRows = getWebElements(objImpairments.get(0), IdentifyBy.TAGNAME, "tr");
					
					if(objRows.size()>0) {
						intRowsCount = objRows.size();
						System.out.println("Impairments Row count " + intRowsCount);
						while(intCurrRow<intRowsCount) {
							//blnStatus = false;
							WebElement objImpairment = getWebElement(IdentifyBy.ID, "form_reqimpoverview:impOverviewTbl:impairmentsTable");
							if(objImpairments!=null) {
								objRows = getWebElements(objImpairment, IdentifyBy.TAGNAME, "tr");
								if(objRows.size()>0) {
									List<WebElement> objCols = getWebElements(objRows.get(intCurrRow), IdentifyBy.TAGNAME, "td");
									if(objCols.size()>0) {
										gobjWebDriver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
										List<WebElement> objCheckbox = objCols.get(8).findElements(By.className("ovFullCellSelectCheckBox"));
										gobjWebDriver.manage().timeouts().implicitlyWait(MAX_TIMEOUT, TimeUnit.SECONDS);
										if(objCheckbox.size()>0) {
											if(!objCheckbox.get(0).isSelected()) {
												objCheckbox.get(0).click();
												waitForPageLoad(MAX_TIMEOUT);
												blnStatus = true;
											}
										}
									}
									intCurrRow++;
								}
							}
						}
					}
					
					ReportGenerator.generateTestStep(true, currentScreen, "Fill Impairments for " + strOption, "Completed Impairments successfully", false);
				}
			}
			else {
				ReportGenerator.generateTestStep(false, currentScreen, "Switch to Frame", "Failed to switch frames " + strFrames.replaceAll(GlobalData.STRING_SEPARATOR, " > "), false);
				blnStatus = false;
			}
				
		} catch(Exception objExp) {
			ReportGenerator.generateTestStep(false, currentScreen, "Exception occured", "Exception is - " + objExp.getMessage(), false);
			blnStatus = false;
		}
		return blnStatus;
	}
	
	public static boolean ContractMessages() {
		boolean blnStatus = false;
		boolean blnPrevent = false;
		String strMessage = "",strType="";
		
		
		try {
			String strFrames = "mainContentFrame" + GlobalData.STRING_SEPARATOR + "contentRightFrame" + GlobalData.STRING_SEPARATOR + "file";
			if(switchToFrame(strFrames, false) && waitForPageLoad(60)) {
				WebElement objMessage = getWebElement(IdentifyBy.ID, "form_contractmessageview:contractTable");
				if(objMessage!=null) {
					gobjWebDriver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
					List<WebElement> objRows = getWebElements(objMessage, IdentifyBy.TAGNAME, "tr");
					
					for(int intCounter=0;intCounter<objRows.size();intCounter++) {
						List<WebElement> objCols = getWebElements(objRows.get(intCounter), IdentifyBy.TAGNAME, "td");
						if(objCols.size()>0) {
							
							strMessage = objCols.get(2).getText(); 
							strType = objCols.get(1).getText();
							
							if(strMessage.contains("Prevents Underwriter Approval")) {
								List<WebElement> objCheckbox = objCols.get(3).findElements(By.className("ovFullCellSelectCheckBox")); 
								if(objCheckbox.size()==0) {
									blnPrevent = true;
									break;
								}
								else {
									if(!objCheckbox.get(0).isSelected())
									{
										objCheckbox.get(0).click();
										waitForPageLoad(60);
										blnStatus = true;
									}
								}
							}
								else if(strType.contains("Cash With Application")){
									if(strMessage.contains("5002:")){
									
										String aa	= strMessage.split("Premiums:")[1];
										MIPAmount  = aa.split(", Received")[0];
									}
									
								
									
									
								
							}
							
							else {
								List<WebElement> objCheckbox = objCols.get(3).findElements(By.className("ovFullCellSelectCheckBox"));
								if(objCheckbox.size()>0) 
								{
									if(!objCheckbox.get(0).isSelected())
									{
										objCheckbox.get(0).click();
										waitForPageLoad(60);
										blnStatus = true;
									}
								}
							}
							
							
						}
					}
					
				}
				gobjWebDriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				if(blnPrevent) {
					ReportGenerator.generateTestStep(false, currentScreen, "Verify CV Messages", "Prevents Underwriter Approval message dispalyed. Message is: " + strMessage, false);
					strFrames = "mainContentFrame" + GlobalData.STRING_SEPARATOR + "contextMenu";
					if(switchToFrame(strFrames, false)) {
						WebElement objClose = getWebElement(IdentifyBy.ID, "backOfficeForm:closeWorkText");
						objClose.click();
						waitForPageLoad(60);
					}
				}
				else {
					
					blnStatus = true;
				}
			}
			else {
				
				blnStatus = false;
			}
			blnStatus= true;
				
		} catch(Exception objExp) {
			
			blnStatus = false;
		}
		return blnStatus;
	}
	
	
	private static boolean UnderwriterReInsurance(OrderedHashtable objTestData) {
		boolean blnStatus = false;
		String strHashKey = "", strHashValue = "";
		try {
			String strFrames = "mainContentFrame" + GlobalData.STRING_SEPARATOR + "contentRightFrame" + GlobalData.STRING_SEPARATOR + "file";
			Enumeration objEnum = objTestData.enumerateKeys();
			if(switchToFrame(strFrames, false) && waitForPageLoad(MAX_TIMEOUT)) {
				
				while(objEnum.hasMoreElements()) {
					//blnStatus = false;
					strHashKey = objEnum.nextElement().toString();
					strHashValue = objTestData.get(strHashKey).toString();

					switch(strHashKey) {
		
					
					case "SELECT_COVERAGE":
						waitForPageLoad(MAX_TIMEOUT);
						Thread.sleep(1000);
						//blnStatus = selectWebtableRow(IdentifyBy.ID, "form_reinsuranceOverview:reinsTable1:reinsuranceOverviewCoverageTable", "0", "Select coverage insured", currentScreen);
						
						blnStatus = setValue(WebControl.BUTTON, IdentifyBy.ID, "form_reinsuranceOverview:reinsTable1:reinsuranceOverviewCoverageTable:0:PG3Label1", "", "coverage insured", currentScreen);
						
						break;
					case"CREATE":
						
						blnStatus = setValue(WebControl.BUTTON, IdentifyBy.NAME, "form_reinsuranceOverview:reinsTable1:btnCreateRequest", validateInput(strHashValue), "Create", currentScreen);
						break;
					case "REQUEST_SELECTION":		                  
						blnStatus = selectWebtableRow(IdentifyBy.ID, "form_reinsuranceOverview:reinTable2:reInsuranceOverviewRequestTable", validateInput(strHashValue), "", currentScreen);
						break;
					
					case "VIEW_UPDATE":
						
						//WebElement element = gobjWebDriver.findElement(By.name("form_reinsuranceOverview:reinTable2:btnViewUpdate"));
						//JavascriptExecutor executor = (JavascriptExecutor)gobjWebDriver;
						//executor.executeScript("arguments[0].click();", element)form_reinsuranceOverview:reinTable2:btnViewUpdate
						blnStatus = setValue(WebControl.BUTTON, IdentifyBy.ID, "form_reinsuranceOverview:reinTable2:btnViewUpdate", validateInput(strHashValue), "Veiw/Update", currentScreen);
						waitForPageLoad(MAX_TIMEOUT);							 
						break;
						
					case"COMMIT":
						WebElement element = gobjWebDriver.findElement(By.name("form_reinsuranceOverview:btnCommCommit"));
						JavascriptExecutor executor = (JavascriptExecutor)gobjWebDriver;
						executor.executeScript("arguments[0].click();", element);
						blnStatus=true;
						ReportGenerator.generateTestStep(true, currentScreen, "Click Commit", "Successfully clicked", true);
						//blnStatus = setValue(WebControl.BUTTON, IdentifyBy.NAME, "form_reinsuranceOverview:btnCommCommit", validateInput(strHashValue), "Commit", currentScreen);
						break;
					case "default1":
						ReportGenerator.generateTestStep(false, currentScreen, "Field Navigation", strHashKey + " field not available in the current method.", false);
						break;
				
					} //end of switch
					if(!blnStatus) break;
				} //end of while
			}
			else {
				ReportGenerator.generateTestStep(false, currentScreen, "Switch to Frame", "Failed to switch frames " + strFrames.replaceAll(GlobalData.STRING_SEPARATOR, " > "), false);
				blnStatus = false;
			}
			objEnum = null;
				
		} catch(Exception objExp) {
			ReportGenerator.generateTestStep(false, currentScreen, "Exception occured", "Exception is - " + objExp.getMessage(), false);
			blnStatus = false;
		}
		return blnStatus;
	}
	
	private static boolean SetContractReinsurance(OrderedHashtable objTestData) {
		boolean blnStatus = false;
		String strHashKey = "", strHashValue = "";
		JavascriptExecutor executor = (JavascriptExecutor)gobjWebDriver;
		
		try {
			String strFrames = "mainContentFrame" + GlobalData.STRING_SEPARATOR + "contentRightFrame" + GlobalData.STRING_SEPARATOR + "file";
			Enumeration objEnum = objTestData.enumerateKeys();
			if(switchToFrame(strFrames, false) && waitForPageLoad(MAX_TIMEOUT)) {
				
				while(objEnum.hasMoreElements()) {
					//blnStatus = false;
					strHashKey = objEnum.nextElement().toString();
					strHashValue = objTestData.get(strHashKey).toString();

					switch(strHashKey) {
		
					
					case "CONTRACT_REINSURANCE_TYPE":
						blnStatus = setValue(WebControl.RADIOBOX, IdentifyBy.NAME, "form_reinsuranceCreateRequest:reinsRB1", getAppRadioValues(strHashKey, strHashValue), " Override TAI/Retained by AXA/ Facultative/TAI Determined", currentScreen);
						break;
					case"FACULTATIVE_SHOPPING_REASON":
						
					blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_reinsuranceCreateRequest:facultativeShoppingList", validateInput(strHashValue), "Facultative Shopping ", currentScreen);
						break;
					case"SYSTEM_REASON":
						blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_reinsuranceCreateRequest:sysretentionReasonInput", validateInput(strHashValue), "Requested Amount", currentScreen);
						break;
					case"RETENTION_REASON":
					blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_reinsuranceCreateRequest:retentionReasonList", validateInput(strHashValue), "Retention Reason", currentScreen);
						break;
					case"CREATE_REINSURANCE_LEVEL":
					blnStatus = setValue(WebControl.RADIOBOX, IdentifyBy.NAME, "form_reinsuranceCreateRequest:reinsRB2", getAppRadioValues(strHashKey, strHashValue), "Contract/Coverage ", currentScreen);
						break;
						
					case "SELECT_COVERAGE":
						blnStatus = selectWebtableRow(IdentifyBy.ID, "form_reinsuranceCreateRequest:reinsCreateReinsuranceRequestTable", "", "Select coverage insured", currentScreen);
						break;
						
					case"REQUESTED_AMOUNT":
						blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_reinsuranceCreateRequest:reinsCreateReinsuranceRequestTable:0:createRequestCoverageTableDataIT1", validateInput(strHashValue), "Requested Amount", currentScreen);
						break;
						
					case"COMPANY":
						blnStatus = Company(IdentifyBy.ID, "form_reinsuranceCreateRequest:reinsCreateReinsuranceCompanyTable", strHashValue);
						break;
					case"SELECT_ALL":
						blnStatus = setValue(WebControl.BUTTON, IdentifyBy.NAME, "form_reinsuranceCreateRequest:reinsViewSelectAll", validateInput(strHashValue), "SELECT ALL", currentScreen);
						break;
						
					case"ADD":
						scrollDown();
						
						WebElement element = gobjWebDriver.findElement(By.name("form_reinsuranceCreateRequest:createRequestCommandButton3"));
						
						executor.executeScript("arguments[0].click();", element);
						
						ReportGenerator.generateTestStep(true, currentScreen, "Click Add", "Successfully clicked", true);
						//blnStatus = setValue(WebControl.BUTTON, IdentifyBy.NAME, "form_reinsuranceCreateRequest:createRequestCommandButton3", validateInput(strHashValue), "ADD", currentScreen);
						break;
					case"CANCEL":
						scrollDown();
						
						WebElement element1 = gobjWebDriver.findElement(By.name("form_reinsuranceCreateRequest:createRequestCommandButton1"));
						
						executor.executeScript("arguments[0].click();", element1);
						
						ReportGenerator.generateTestStep(true, currentScreen, "Click Cancel", "Successfully clicked", true);
						blnStatus = true;
						//blnStatus = setValue(WebControl.BUTTON, IdentifyBy.NAME, "form_reinsuranceCreateRequest:createRequestCommandButton3", validateInput(strHashValue), "ADD", currentScreen);
						break;
					case "default1":
						ReportGenerator.generateTestStep(false, currentScreen, "Field Navigation", strHashKey + " field not available in the current method.", false);
						break;
					} //end of switch
					if(!blnStatus) break;
					} //end of while
			}
			else {
				ReportGenerator.generateTestStep(false, currentScreen, "Switch to Frame", "Failed to switch frames " + strFrames.replaceAll(GlobalData.STRING_SEPARATOR, " > "), false);
				blnStatus = false;
			}
			objEnum = null;
				
		} catch(Exception objExp) {
			ReportGenerator.generateTestStep(false, currentScreen, "Exception occured", "Exception is - " + objExp.getMessage(), false);
			blnStatus = false;
		}
		return blnStatus;
	}

	private static boolean Company(IdentifyBy by, String property, String value) {
		boolean blnStatus = false;
	
		List<WebElement> objMessage = getWebElements(by, property);//"form_reinsuranceCreateRequest:reinsCreateReinsuranceCompanyTable");
	    if(objMessage.size()>0) {
			List<WebElement> objRows = getWebElements(objMessage.get(0), IdentifyBy.TAGNAME, "tr");
			
		    for(int intCounter=0;intCounter<objRows.size();intCounter++) {
		    	if(intCounter % 4 == 0)  {
		    		try {
		    			objMessage.get(0).sendKeys(Keys.PAGE_DOWN);
						Thread.sleep(2000);
					} catch (InterruptedException e) {}
		    	}
				List<WebElement> objCols = getWebElements(objRows.get(intCounter), IdentifyBy.TAGNAME, "td");
		
				for(WebElement ls:objCols){
					
					String Option=ls.findElement(By.tagName("a")).getText();
				
					if(Option.equals(value)){
						
						ls.findElement(By.tagName("a")).click();
						blnStatus=true;
						break;
					}
				}
				if(blnStatus) break;
		    }
		}
		return blnStatus;
		
	}
	
	private static boolean FinalDispositionRate(OrderedHashtable objTestData) {
		boolean blnStatus = false;
		String strHashKey = "", strHashValue = "";
		try {
			String strFrames = "mainContentFrame" + GlobalData.STRING_SEPARATOR + "contentRightFrame" + GlobalData.STRING_SEPARATOR + "file"+ GlobalData.STRING_SEPARATOR + "covClientFrame1"+ GlobalData.STRING_SEPARATOR + "file";
			Enumeration objEnum = objTestData.enumerateKeys();
			
				if(switchToFrame(strFrames, false) && waitForPageLoad(MAX_TIMEOUT)) {
					while(objEnum.hasMoreElements()) {
						//blnStatus = false;
						strHashKey = objEnum.nextElement().toString();
						strHashValue = objTestData.get(strHashKey).toString();
						
						switch(strHashKey) {
							case "VERIFY_BY_COLUMN":
								waitForPageLoad(MAX_TIMEOUT);
								String[] arrHashValue = strHashValue.split(GlobalData.STRING_SEPARATOR);
								blnStatus = selectWebtableRow(IdentifyBy.ID, "form_CoverageClientTable1:navigation1:client1Table", Integer.parseInt(arrHashValue[0]), arrHashValue[1], "Verify By Column", currentScreen);
							break;
							case"ACTION_IPOPUP":
								Thread.sleep(5000);
								blnStatus = setValue(WebControl.BUTTON, IdentifyBy.NAME, "form_BenefitDeny:beneficairy_CButton", validateInput(strHashValue), "Action ipopup", currentScreen);
							break;
							case"COVERAGE_IPOPUP":
								Thread.sleep(5000);
								blnStatus = setValue(WebControl.BUTTON, IdentifyBy.NAME, "form_CoverageDeny:beneficairy_CButton", validateInput(strHashValue), "Action ipopup", currentScreen);
							break;
							/*case"ACTION_CHECKBOX":
								blnStatus = setValue(WebControl.CHECKBOX, IdentifyBy.NAME, "form_BenefitDeny:_id74", validateInput(strHashValue), "Action checkbox", currentScreen);
							break;*/
							case"ACTION_CHECKBOX":
								blnStatus = setValue(WebControl.CHECKBOX, IdentifyBy.CLASSNAME, "ovFullCellSelectCheckBox", validateInput(strHashValue), "Action checkbox", currentScreen);
							break;							
							case"DENY":
								blnStatus = setValue(WebControl.BUTTON, IdentifyBy.NAME, "form_CoverageClientTable1:navigation1:btnCovDeny1", validateInput(strHashValue), "DENY", currentScreen);
								break;
							case"UNDENY":
								blnStatus = setValue(WebControl.BUTTON, IdentifyBy.NAME, "form_CoverageClientTable1:navigation1:btnCovUnDeny1", validateInput(strHashValue), "DENY", currentScreen);
								break;
							case"ACTIONS_UPDATE":
								Thread.sleep(2000);
								blnStatus = setValue(WebControl.BUTTON, IdentifyBy.CLASSNAME, "formButtonRight", validateInput(strHashValue), "Actions update", currentScreen);
								break;
							case"NLG_CEASEDATE":
				
							   // String value =DateFormats.getCurrentDate(strHashValue);
								
							   blnStatus= VerifyNLGDATE(strHashValue);
							    System.out.println(blnStatus);
								if(blnStatus) {
									ReportGenerator.generateTestStep(true, currentScreen, " NLG cease Date ", strHashValue + " successfully clicked", true);
								}
								else {
									ReportGenerator.generateTestStep(false, currentScreen, " NLG cease Date ", "Cease date not mached. Actual is " + strHashValue + ". Expected is " + strceasedate, true);
								}
								break;
								
							case "COVERAGES_INSURED":
								blnStatus = selectWebtableRow(IdentifyBy.XPATH, "//table[@id='form_CoverageClientTable1:navigation"+strHashValue+":client"+strHashValue+"Table']", "0", "COVERAGES_INSURED", currentScreen);
								break;
							case "RATE":
								Thread.sleep(500);														  
								//blnStatus = setValue(WebControl.BUTTON, IdentifyBy.XPATH, "//input[@name='form_CoverageClientTable1:navigation"+strHashValue+":btnAddRating"+strHashValue+"']", validateInput(strHashValue), "Rate", currentScreen);
								WebElement element_1 = gobjWebDriver.findElement(By.xpath("//input[@name='form_CoverageClientTable1:navigation"+strHashValue+":btnAddRating"+strHashValue+"']"));
								 JavascriptExecutor executor_1 = (JavascriptExecutor)gobjWebDriver;
								 executor_1.executeScript("arguments[0].click();", element_1);
								 ReportGenerator.generateTestStep(true, currentScreen, "Click Rate", "Successfully clicked", true);
								 blnStatus = true;
								break;
							case "APPROVED_AT":                                        
								blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_Rating:rateClass_area:personRateClassOverrideText", validateInput(strHashValue), "APPROVED_AT", currentScreen);
								break;
							case"RATE_CLASS_REASON":
								blnStatus = setValue(WebControl.BUTTON, IdentifyBy.NAME, "form_Rating:rateClass_area:RateClassReason_CButton", validateInput(strHashValue), "Rate Class Reason I-POPUP", currentScreen);
								break;
							case"RATE_REASON_FLAT":                                     
								blnStatus = setValue(WebControl.BUTTON, IdentifyBy.NAME, "form_Rating:rating_area:RatingReasonViewIcon", validateInput(strHashValue), "Rate Class Reason I-POPUP", currentScreen);
								break;
							case "RATE_TYPE":
								blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_Rating:rating_area:ratingTypeList", validateInput(strHashValue), "RATE TYPE", currentScreen);
								break;
							case"TABLE":
								blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_Rating:rating_area:tableListDD", validateInput(strHashValue), "TABLE", currentScreen);
								break;
							
							case"AMOUNT":
								blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_Rating:rating_area:Amount", validateInput(strHashValue), "Amount :", currentScreen);
								break;
							case"DURATION":
								blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_Rating:rating_area:Cease_Duration", validateInput(strHashValue), "Duration", currentScreen);
								break;
							case"ADD_NEW":
								blnStatus = setValue(WebControl.BUTTON, IdentifyBy.NAME, "form_Rating:rating_area:btnAddNew", validateInput(strHashValue), "ADD & NEW", currentScreen);
								break;
							case"UPDATE":
								gobjWebDriver.findElement(By.id("form_Rating:rating_area:expandRating")).click();
								Thread.sleep(300);
								blnStatus = setValue(WebControl.BUTTON, IdentifyBy.NAME, "form_Rating:btnUpdate", validateInput(strHashValue), "update", currentScreen);
								break;
							case"AMEND_OR_ENDORSE":
								blnStatus = setValue(WebControl.BUTTON, IdentifyBy.CSS_SELECTOR, "//input[value='Amend/Endorse']", validateInput(strHashValue), "Amend/Endorse", currentScreen);
								waitForPageLoad(MAX_TIMEOUT);
								break;
							case"AMEND_TYPE_RB":
								blnStatus = setValue(WebControl.RADIOBOX, IdentifyBy.NAME, "form_AmendEndorse:amend_endorse_area:_id47", getAppRadioValues(strHashKey, strHashValue), "TYPE Radio bUtton", currentScreen);
								waitForPageLoad(MAX_TIMEOUT);
								break;
							
							case"AMEND_TYPE":
								blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_AmendEndorse:amend_endorse_area:_id49", validateInput(strHashValue), "AMEND TYPE", currentScreen);
								waitForPageLoad(MAX_TIMEOUT);
								break;
							case"AMEND_FORM_RB":
								blnStatus = setValue(WebControl.RADIOBOX, IdentifyBy.NAME, "form_AmendEndorse:amend_endorse_area:_id53", getAppRadioValues(strHashKey, strHashValue), "FORM Radio bUtton", currentScreen);
								break;
								
							case"AMEND_FORM":
								blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_AmendEndorse:amend_endorse_area:_id55", validateInput(strHashValue), "AMEND FORM", currentScreen);
								break;
							case"AMEND_QUESTION":
								blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_AmendEndorse:amend_endorse_area:_id58", validateInput(strHashValue), "AMEND FORM", currentScreen);
								break;
								
							case"AMEND_ADD":
								scrollDown();
								blnStatus = setValue(WebControl.BUTTON, IdentifyBy.NAME, "form_AmendEndorse:amend_endorse_area:btnAdd", validateInput(strHashValue), "Amend ADD", currentScreen);
								Thread.sleep(2000);
								waitForPageLoad(MAX_TIMEOUT);
								break;
							case"AMEND_OR_ENDORSE_COMMIT":
								 scrollDown();
								 WebElement element = gobjWebDriver.findElement(By.name("form_CoverageClientTable1:btnCommitAmendEndorse"));
								 JavascriptExecutor executor = (JavascriptExecutor)gobjWebDriver;
								 executor.executeScript("arguments[0].click();", element);
								 ReportGenerator.generateTestStep(true, currentScreen, "Click AMEND/ENDORSE_COMMIT", "Successfully clicked", true);
								 blnStatus = true;
								//blnStatus = setValue(WebControl.BUTTON, IdentifyBy.NAME, "form_CoverageClientTable1:btnCommitAmendEndorse", validateInput(strHashValue), "Amend/Endorse Commit", currentScreen);
								break;
								
							case"POPUP_VERIFY":
								if(verifyPopupMessage("A duplicate amendment/endorsement has been added, please edit or delete the added amendment/endorsement")) 
								blnStatus=true;
								break;
							case "default1":
								ReportGenerator.generateTestStep(false, currentScreen, "Field Navigation", strHashKey + " field not available in the current method.", false);
								break;						
						} //end of switch
						if(!blnStatus) break;
					} //end of while
				}
				else {
					ReportGenerator.generateTestStep(false, currentScreen, "Switch to Frame", "Failed to switch frames " + strFrames.replaceAll(GlobalData.STRING_SEPARATOR, " > "), false);
					blnStatus = false;
				}
				objEnum = null;
			//}
				
		} catch(Exception objExp) {
			ReportGenerator.generateTestStep(false, currentScreen, "Exception occured", "Exception is - " + objExp.getMessage(), false);
			blnStatus = false;
		}
		return blnStatus;
	}
		
	//Function Flow for ContractInformation
		private static boolean ContractInformation(OrderedHashtable objTestData) {
			boolean blnStatus = false;
			String strHashKey = "", strHashValue = "";
			try {
			String strFrames = "mainContentFrame" + GlobalData.STRING_SEPARATOR + "contentRightFrame" + GlobalData.STRING_SEPARATOR + "file";
				Enumeration objEnum = objTestData.enumerateKeys();
				if(switchToFrame(strFrames, false) && waitForPageLoad(MAX_TIMEOUT)) {
					
					while(objEnum.hasMoreElements()) {
						//blnStatus = false;
						strHashKey = objEnum.nextElement().toString();
						strHashValue = objTestData.get(strHashKey).toString();

						switch(strHashKey) {
						
						case"MEC_REASON":
						
							blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "mecReason_DD", validateInput(strHashValue), "MEC_REASON", currentScreen);
							break;
							
						case"APPLY":
							blnStatus = setValue(WebControl.BUTTON, IdentifyBy.NAME, "Nba_Apply_PB", validateInput(strHashValue), "APPLY", currentScreen);
							
							
							 WebDriverWait wait = new WebDriverWait(gobjWebDriver, MAX_TIMEOUT); 
							 Alert alert = wait.until(ExpectedConditions.alertIsPresent());
						     
							 if(alert!=null){
								 gobjWebDriver.switchTo().alert().accept();
							 }
						     		
							break;
						case "default1":
							ReportGenerator.generateTestStep(false, currentScreen, "Field Navigation", strHashKey + " field not available in the current method.", false);
							break;
						
						} //end of switch
						if(!blnStatus) break;
					} //end of while
				}
				else {
					ReportGenerator.generateTestStep(false, currentScreen, "Switch to Frame", "Failed to switch frames " + strFrames.replaceAll(GlobalData.STRING_SEPARATOR, " > "), false);
					blnStatus = false;
				}
				objEnum = null;
					
			} catch(Exception objExp) {
				ReportGenerator.generateTestStep(false, currentScreen, "Exception occured", "Exception is - " + objExp.getMessage(), false);
				blnStatus = false;
			}
			return blnStatus;
		}
		//Under Writer Rate Class Reason I-POPUP function
		private static boolean Rateclassreason(OrderedHashtable objTestData) {
			boolean blnStatus = false;
			String strHashKey = "", strHashValue = "";
			try {
				String strFrames = "FWin0" + GlobalData.STRING_SEPARATOR + "Content0";
				Enumeration objEnum = objTestData.enumerateKeys();
				if(switchToFrame(strFrames, false) && waitForPageLoad(MAX_TIMEOUT)) {
					
					while(objEnum.hasMoreElements()) {
						//blnStatus = false;
						strHashKey = objEnum.nextElement().toString();
						strHashValue = objTestData.get(strHashKey).toString();

						switch(strHashKey) {
						
						case"REASON_SELECTION":
							blnStatus = setValue(WebControl.RADIOBOX, IdentifyBy.NAME, "form_reasonView:reasonType_RB1", getAppRadioValues(strHashKey, strHashValue), "Selection", currentScreen);
							break;
						case"REASON_SELECTION_REASON_LIST":	
							Thread.sleep(3000);
							blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_reasonView:reasonList", validateInput(strHashValue), "REASON_SELECTION", currentScreen);
							break;
						case"REASON_OPTIONAL_TEXT":
							blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_reasonView:optionalText", validateInput(strHashValue), "Optional Text:", currentScreen);
							break;
						case"REASON_FREE_FORM":
							blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_reasonView:reasonType_RB2", validateInput(strHashValue), "Free-form", currentScreen);
							break;
						case"REASON_FREE_FORM_TEXT":
							blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_reasonView:_id7", validateInput(strHashValue), "Free Form Text", currentScreen);
							break;
						case"ADD":
							blnStatus = setValue(WebControl.BUTTON, IdentifyBy.NAME, "form_reasonView:drAdd", validateInput(strHashValue), "ADD", currentScreen);
							break;
						case"UPDATE":
							blnStatus = setValue(WebControl.BUTTON, IdentifyBy.NAME, "form_reasonView:drUpdate", validateInput(strHashValue), "UPDATE", currentScreen);
							break;
						case "default1":
							ReportGenerator.generateTestStep(false, currentScreen, "Field Navigation", strHashKey + " field not available in the current method.", false);
							break;
						} //end of switch
						if(!blnStatus) break;
					} //end of while
				}
				else {
					ReportGenerator.generateTestStep(false, currentScreen, "Switch to Frame", "Failed to switch frames " + strFrames.replaceAll(GlobalData.STRING_SEPARATOR, " > "), false);
					blnStatus = false;
				}
				objEnum = null;
					
			} catch(Exception objExp) {
				ReportGenerator.generateTestStep(false, currentScreen, "Exception occured", "Exception is - " + objExp.getMessage(), false);
				blnStatus = false;
			}
			return blnStatus;
		}
		private static boolean Denyclassreason(OrderedHashtable objTestData) {
			boolean blnStatus = false;
			String strHashKey = "", strHashValue = "";
			try {
				String strFrames = "FWin0" + GlobalData.STRING_SEPARATOR + "Content0";
				Enumeration objEnum = objTestData.enumerateKeys();
				if(switchToFrame(strFrames, false) && waitForPageLoad(MAX_TIMEOUT)) {
					
					while(objEnum.hasMoreElements()) {
						//blnStatus = false;
						strHashKey = objEnum.nextElement().toString();
						strHashValue = objTestData.get(strHashKey).toString();

						switch(strHashKey) {
						
						case"REASON_SELECTION":
							blnStatus = setValue(WebControl.RADIOBOX, IdentifyBy.NAME, "form_reasonView:reasonType_RB1", getAppRadioValues(strHashKey, strHashValue), "Selection", currentScreen);
							break;
						case"REASON_SELECTION_REASON_LIST":	
							Thread.sleep(3000);
							blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_reasonView:reasonList", validateInput(strHashValue), "REASON_SELECTION", currentScreen);
							break;
						case"REASON_OPTIONAL_TEXT":
							blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_reasonView:optionalText", validateInput(strHashValue), "Optional Text:", currentScreen);
							break;
						case"REASON_FREE_FORM":
							blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_reasonView:reasonType_RB2", validateInput(strHashValue), "Free-form", currentScreen);
							break;
						case"REASON_FREE_FORM_TEXT":
							blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_reasonView:_id7", validateInput(strHashValue), "Free Form Text", currentScreen);
							break;
						case"ADD":
							blnStatus = setValue(WebControl.BUTTON, IdentifyBy.NAME, "form_reasonView:drAdd", validateInput(strHashValue), "ADD", currentScreen);
							break;
						case"UPDATE":
							blnStatus = setValue(WebControl.BUTTON, IdentifyBy.NAME, "form_reasonView:drUpdate", validateInput(strHashValue), "UPDATE", currentScreen);
							break;
						case "default1":
							ReportGenerator.generateTestStep(false, currentScreen, "Field Navigation", strHashKey + " field not available in the current method.", false);
							break;
						} //end of switch
						if(!blnStatus) break;
					} //end of while
				}
				else {
					ReportGenerator.generateTestStep(false, currentScreen, "Switch to Frame", "Failed to switch frames " + strFrames.replaceAll(GlobalData.STRING_SEPARATOR, " > "), false);
					blnStatus = false;
				}
				objEnum = null;
					
			} catch(Exception objExp) {
				ReportGenerator.generateTestStep(false, currentScreen, "Exception occured", "Exception is - " + objExp.getMessage(), false);
				blnStatus = false;
			}
			return blnStatus;
		}
		
		
		//Under Writer Rate Reason I-POPUP function
		private static boolean RateReasonflat(OrderedHashtable objTestData) {
			boolean blnStatus = false;
			String strHashKey = "", strHashValue = "";
			try {
				String strFrames = "FWin0" + GlobalData.STRING_SEPARATOR + "Content0";
				Enumeration objEnum = objTestData.enumerateKeys();
				if(switchToFrame(strFrames, false) && waitForPageLoad(MAX_TIMEOUT)) {
					
					while(objEnum.hasMoreElements()) {
						//blnStatus = false;
						strHashKey = objEnum.nextElement().toString();
						strHashValue = objTestData.get(strHashKey).toString();

						switch(strHashKey) {
						case"REASON_SELECTION":
							blnStatus = setValue(WebControl.RADIOBOX, IdentifyBy.NAME, "form_reasonView:reasonType_RB1", getAppRadioValues(strHashKey, strHashValue), "Selection", currentScreen);
							break;
						case"REASON_SELECTION_REASON_LIST":
	                              blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_reasonView:reasonList", validateInput(strHashValue), "REASON_SELECTION", currentScreen);
							break;
						case"REASON_OPTIONAL_TEXT":
							blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_reasonView:optionalText", validateInput(strHashValue), "Optional Text:", currentScreen);
							break;
						case"REASON_FREE_FORM":
							blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_reasonView:reasonType_RB2", validateInput(strHashValue), "Free-form", currentScreen);
							break;
						case"REASON_FREE_FORM_TEXT":
							blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_reasonView:_id7", validateInput(strHashValue), "Free Form Text", currentScreen);
							break;
						case"ADD":
							blnStatus = setValue(WebControl.BUTTON, IdentifyBy.NAME, "form_reasonView:drAdd", validateInput(strHashValue), "ADD", currentScreen);
							break;
						case"UPDATE":
							blnStatus = setValue(WebControl.BUTTON, IdentifyBy.NAME, "form_reasonView:drUpdate", validateInput(strHashValue), "UPDATE", currentScreen);
							break;
						case "default1":
							ReportGenerator.generateTestStep(false, currentScreen, "Field Navigation", strHashKey + " field not available in the current method.", false);
							break;
				
						} //end of switch
						if(!blnStatus) break;
					} //end of while
				}
				else {
					ReportGenerator.generateTestStep(false, currentScreen, "Switch to Frame", "Failed to switch frames " + strFrames.replaceAll(GlobalData.STRING_SEPARATOR, " > "), false);
					blnStatus = false;
				}
				objEnum = null;
					
			} catch(Exception objExp) {
				ReportGenerator.generateTestStep(false, currentScreen, "Exception occured", "Exception is - " + objExp.getMessage(), false);
				blnStatus = false;
			}
			return blnStatus;
		}
		   //UnderWritter -Assign Final Disposition function 
		private static boolean Assignfinaldisposition(OrderedHashtable objTestData) {
			boolean blnStatus = false;
			
			String strHashKey = "", strHashValue = "";
			try {
				String strFrames = "mainContentFrame" + GlobalData.STRING_SEPARATOR + "contentRightFrame" + GlobalData.STRING_SEPARATOR + "file"+ GlobalData.STRING_SEPARATOR + "covClientFrame1"+ GlobalData.STRING_SEPARATOR + "file";
				Enumeration objEnum = objTestData.enumerateKeys();
				
					if(switchToFrame(strFrames, false) && waitForPageLoad(MAX_TIMEOUT)) {
						gobjWebDriver.getKeyboard().sendKeys(Keys.PAGE_DOWN);
						Thread.sleep(2000);
						while(objEnum.hasMoreElements()) {
							//blnStatus = false;
							strHashKey = objEnum.nextElement().toString();
							strHashValue = objTestData.get(strHashKey).toString();
							
							switch(strHashKey) {
							
							case"UW_APPROVAL_CHECKLIST":
								
								scrollDown();
								
								blnStatus = setValue(WebControl.BUTTON, IdentifyBy.NAME, "form_CoverageClientTable1:finDispView:chklist_CButton", validateInput(strHashValue), "UW Approval CheckList", currentScreen);
								
								break;
							case"APPROVE":
								blnStatus = setValue(WebControl.BUTTON, IdentifyBy.NAME, "form_CoverageClientTable1:finDispView:approve", strHashKey, "Approve", currentScreen);
								break;
							case"UWCM_APPROVAL":
								blnStatus = setValue(WebControl.BUTTON, IdentifyBy.NAME, "form_CoverageClientTable1:finDispView:approve", strHashKey, "Approve", currentScreen);
								blnStatus = true;
								break;
							case"INFORMAL _APPROVAL":											
								blnStatus = setValue(WebControl.RADIOBOX, IdentifyBy.NAME, "form_CoverageClientTable1:finDispView:trialAccept", getAppRadioValues(strHashKey, strHashValue), "Yes/NA", currentScreen);
								break;
							case"OTHER_THAN_APPLIED_FOR":
							     scrollDown();   														
								blnStatus = setValue(WebControl.CHECKBOX, IdentifyBy.NAME, "form_CoverageClientTable1:finDispView:otherThanAppliedFor1", validateInput(strHashValue), "Other Than Applied For", currentScreen);
								break;
							case"GENETIC_TEST_LETTER_INSURED":
								 scrollDown();
								
								 blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_CoverageClientTable1:finDispView:geneticInfoDropDownPrimary", validateInput(strHashValue), "Genetic Test Letter - Insured", currentScreen);
								break;
							case"GENETIC_TEST_LETTER_JT_INSURED":
								 scrollDown();
								blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_CoverageClientTable1:finDispView:geneticInfoDropDownJoint", validateInput(strHashValue), "Genetic Test Letter -Jt Insured", currentScreen);
								break;
							case"AUD_REASON": 
							blnStatus = setValue(WebControl.BUTTON, IdentifyBy.NAME, "form_CoverageClientTable1:finDispView:beneficairy_CButton", validateInput(strHashValue), "AUD Reason", currentScreen);
								break;
							case"DO_NOT_APPROVE":
								blnStatus = setValue(WebControl.BUTTON, IdentifyBy.NAME, "form_CoverageClientTable1:finDispView:donotIssue", strHashKey, "Do Not Approve", currentScreen);
								break;
							case"DO_NOT_APPROVE_TYPE":
								blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_CoverageClientTable1:finDispView:_id44", validateInput(strHashValue), "DO_NOT_APPROVE_TYPE", currentScreen);
								break;
							case"OVERRIDE_DELIVERY_DAYS":
							    blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_CoverageClientTable1:finDispView:overrideDeliveryDays_EF", validateInput(strHashValue), "Override Delivery Days", currentScreen);
								break;
							case"OVERRIDE_NEXT_LEVEL_COSIGNOR":
								blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_CoverageClientTable1:finDispView:selectQueue", validateInput(strHashValue), "Override Next Level Cosignor:", currentScreen);
								break;
							case"FINAL_DISPOSITION_DECISION_BUTTON":
								blnStatus = setValue(WebControl.BUTTON, IdentifyBy.NAME, "form_CoverageClientTable1:finDispView:FinalDispositionDecision_CButton", validateInput(strHashValue), "Final Disposition Decision Button", currentScreen);
								break;
							
							case"COMMIT":
							    blnStatus = setValue(WebControl.BUTTON, IdentifyBy.NAME, "form_CoverageClientTable1:btnCommit", validateInput(strHashValue), "Commit", currentScreen);
								break;
							/*case"UNAPPROVE":
								JavascriptExecutor jsec = (JavascriptExecutor)gobjWebDriver;
								//jsec.executeScript("scroll(0, 500);");
								Thread.sleep(2000);											
								WebElement btn = gobjWebDriver.findElement(By.id("form_CoverageClientTable1:finDispView:btnDispUnapprove"));
								
								if (btn.isEnabled())
								{										     
								blnStatus = setValue(WebControl.BUTTON, IdentifyBy.NAME, "form_CoverageClientTable1:finDispView:btnDispUnapprove", validateInput(strHashValue), "UNAPPROVE", currentScreen);
								
								
								String unapprovepopup = "FWin0" + GlobalData.STRING_SEPARATOR + "Content0" ;
								if(switchToFrame(unapprovepopup, false)) {
									 blnStatus = setValue(WebControl.BUTTON, IdentifyBy.NAME, "confirmationForm:ok", validateInput(strHashValue), "Unapprove Yes", currentScreen);
									 waitForPageClose(MIN_TIMEOUT);	
																		}
										}
								
								blnStatus = true;
							 
								break;*/
							case"UNAPPROVE":
								WebElement btn = gobjWebDriver.findElement(By.id("form_CoverageClientTable1:finDispView:btnDispUnapprove"));
								JavascriptExecutor executorf = (JavascriptExecutor)gobjWebDriver;
								executorf.executeScript("arguments[0].click();", btn);
								/*
								JavascriptExecutor jsec = (JavascriptExecutor)gobjWebDriver;
								//jsec.executeScript("scroll(0, 500);");
								Thread.sleep(2000);											
								WebElement btn = gobjWebDriver.findElement(By.id("form_CoverageClientTable1:finDispView:btnDispUnapprove"));
								*/
								if (btn.isEnabled())
								{										     
								//blnStatus = setValue(WebControl.BUTTON, IdentifyBy.NAME, "form_CoverageClientTable1:finDispView:btnDispUnapprove", validateInput(strHashValue), "UNAPPROVE", currentScreen);
								
								
								String unapprovepopup = "FWin0" + GlobalData.STRING_SEPARATOR + "Content0" ;
								if(switchToFrame(unapprovepopup, false)) {
									 blnStatus = setValue(WebControl.BUTTON, IdentifyBy.NAME, "confirmationForm:ok", validateInput(strHashValue), "Unapprove Yes", currentScreen);
									 waitForPageClose(MIN_TIMEOUT);	
																		}
										}
								
								blnStatus = true;
							 
								break;
								
							case"VERIFY_MESSAGE":
								String strMessage = "Final Disposition Successful";
								String strMessageverify = "Print NIGO is not resolved on Resolve Print NIGO view";
								String strMessageverifyy = "Please select reinsurance Type, ANY UPDATES THAT HAVE NOT BEEN COMMITTED MAY NEED TO BE RE-ENTERED.";
								//String strMessageverifyy = "Paramed/Medical Signed Date cannot be greater than current date.";
								
								strFrames = "FWin0" + GlobalData.STRING_SEPARATOR + "Content0" ;
								blnStatus = false;
								
								if(switchToFrame(strFrames, false)) 
								{
									
									String Sucs_Msg=gobjWebDriver.findElement(By.id("errors")).getText().trim();
									System.out.println(Sucs_Msg);
									
									if(strMessage.equalsIgnoreCase(Sucs_Msg)||(Sucs_Msg.contains(strMessageverify))||(Sucs_Msg.contains(strMessageverifyy))) {
										ReportGenerator.generateTestStep(true, currentScreen, "Verify Final Disposition Successful message",Sucs_Msg,true );
										blnStatus = true;
										
									}else 
									{
										ReportGenerator.generateTestStep(false, currentScreen, "Verify Final Disposition Successful message", "Final Disposition Successful Message NOT Displayed :- Message Displayed Is :: "+Sucs_Msg,true );
										
									}
									gobjWebDriver.findElement(By.id("ok")).click();
									waitForPageClose(MIN_TIMEOUT);
									
								}
								break;
							case"REVIEW_COMPLETE":
								WebElement element = gobjWebDriver.findElement(By.name("form_CoverageClientTable1:btnReviewCmpt"));
								JavascriptExecutor executor = (JavascriptExecutor)gobjWebDriver;
								executor.executeScript("arguments[0].click();", element);
								ReportGenerator.generateTestStep(true, currentScreen, "Click Review Complete", "Successfully clicked", true);
								
								
								waitForPageLoad(MAX_TIMEOUT);
								blnStatus = true;
								break;
							case"AGREE_CHANGES":
								  String NewFrames = "FWin0" + GlobalData.STRING_SEPARATOR + "Content0" ;
								if(switchToFrame(NewFrames, false)) {
									 blnStatus = setValue(WebControl.BUTTON, IdentifyBy.NAME, "form_reviewComplete:reviewCompleteAgree", validateInput(strHashValue), "Complete Agree", currentScreen);
									 waitForPageClose(MIN_TIMEOUT);
								}
								break;
							case "default1":
								ReportGenerator.generateTestStep(false, currentScreen, "Field Navigation", strHashKey + " field not available in the current method.", false);
								break;
								
								
							
							} //end of switch
							if(!blnStatus) break;
						} //end of while
					}
					else {
						ReportGenerator.generateTestStep(false, currentScreen, "Switch to Frame", "Failed to switch frames " + strFrames.replaceAll(GlobalData.STRING_SEPARATOR, " > "), false);
						blnStatus = false;
					}
					objEnum = null;
				//}
					
			} catch(Exception objExp) {
				ReportGenerator.generateTestStep(false, currentScreen, "Exception occured", "Exception is - " + objExp.getMessage(), false);
				blnStatus = false;
			}
			return blnStatus;
		}
		
		private static  void  scrollDown() {
			JavascriptExecutor jsec = (JavascriptExecutor)gobjWebDriver;
			jsec.executeScript("scroll(0, 250);");
			
		}
		
		//Under Writer UW Approval CheckList I-POPUP function
		private static boolean UWapprovalcheckList(OrderedHashtable objTestData) {
			boolean blnStatus = false;
			String strHashKey = "", strHashValue = "";
			try {
				String strFrames = "FWin0" + GlobalData.STRING_SEPARATOR + "Content0";
				Enumeration objEnum = objTestData.enumerateKeys();
				if(switchToFrame(strFrames, false) && waitForPageLoad(MAX_TIMEOUT)) {
					
					while(objEnum.hasMoreElements()) {
						//blnStatus = false;
						strHashKey = objEnum.nextElement().toString();
						strHashValue = objTestData.get(strHashKey).toString();

						switch(strHashKey) {
						case"UW_WITH_APPROPRIATE_AUTHORITY":
							blnStatus = setValue(WebControl.RADIOBOX, IdentifyBy.NAME, "chkForm:checkListQuestionsTablePane:0:_id11", getAppRadioValues(strHashKey, strHashValue), "Yes/NA", currentScreen);
							break;
						case"MEDICAL_DIRECTOR":
							blnStatus = setValue(WebControl.RADIOBOX, IdentifyBy.NAME, "chkForm:checkListQuestionsTablePane:1:_id11", getAppRadioValues(strHashKey, strHashValue), "Yes/NA", currentScreen);
							break;
						case"FDD":
							blnStatus = setValue(WebControl.RADIOBOX, IdentifyBy.NAME, "chkForm:checkListQuestionsTablePane:2:_id11", getAppRadioValues(strHashKey, strHashValue), "Yes/NA", currentScreen);
							break;
						case"CORPORATE":
							blnStatus = setValue(WebControl.RADIOBOX, IdentifyBy.NAME, "chkForm:checkListQuestionsTablePane:3:_id11", getAppRadioValues(strHashKey, strHashValue), "Yes/NA", currentScreen);
							break;
						case"AUD Letter":
							blnStatus = setValue(WebControl.RADIOBOX, IdentifyBy.NAME, "chkForm:_id17", getAppRadioValues(strHashKey, strHashValue), "Yes/NA", currentScreen);
							break;	
						case"NA_TO_ALL":
							try{
							blnStatus = setValue(WebControl.BUTTON, IdentifyBy.NAME, "chkForm:drNA", validateInput(strHashValue), "NA TO ALL", currentScreen);
							}
						catch(Exception Exp){
							
							System.out.println("Unhandled exception");
						}	
						
							break;
						
						case"UW_APPROVAL_UPDATE":
							blnStatus = setValue(WebControl.BUTTON, IdentifyBy.NAME, "chkForm:drUpdate", validateInput(strHashValue), "UPDATE", currentScreen);
							break;
						case "default1":
							ReportGenerator.generateTestStep(false, currentScreen, "Field Navigation", strHashKey + " field not available in the current method.", false);
							break;
						} //end of switch
						if(!blnStatus) break;
					} //end of while
				}
				else {
					ReportGenerator.generateTestStep(false, currentScreen, "Switch to Frame", "Failed to switch frames " + strFrames.replaceAll(GlobalData.STRING_SEPARATOR, " > "), false);
					blnStatus = false;
				}
				objEnum = null;
					
			} catch(Exception objExp) {
				ReportGenerator.generateTestStep(false, currentScreen, "Exception occured", "Exception is - " + objExp.getMessage(), false);
				blnStatus = false;
			}
			return blnStatus;
		}
		
		//Function Flow for CreateUWRequirements
		private static boolean CreateUWRequirements(OrderedHashtable objTestData) {
			boolean blnStatus = false;
			String strHashKey = "", strHashValue = "";
			try {
				String strFrames = "mainContentFrame" + GlobalData.STRING_SEPARATOR + "contentRightFrame" + GlobalData.STRING_SEPARATOR + "file";
				Enumeration objEnum = objTestData.enumerateKeys();
				if(waitForPageLoad(MAX_TIMEOUT) && switchToFrame(strFrames, false)) {
					
					while(objEnum.hasMoreElements()) {
						//blnStatus = false;
						strHashKey = objEnum.nextElement().toString();
						strHashValue = objTestData.get(strHashKey).toString();

						switch(strHashKey) {
						case"INSURED_DETAILS":
							blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_reqimpoverview:tabHeader:_id26", validateInput(strHashValue), "Vendor type", currentScreen);
								break;
						
						case"CREATE":
							/*blnStatus = selectWebtableRow(IdentifyBy.ID, "form_reqimpoverview:reqOverviewTbl:requirementsTable", validateInput(strHashValue), "Requirement Queue", currentScreen);
							Thread.sleep(2000);*/
							blnStatus = setValue(WebControl.BUTTON, IdentifyBy.NAME, "form_reqimpoverview:btnReqCreate", validateInput(strHashValue), "CREATE", currentScreen);
							waitForPageLoad(MIN_TIMEOUT);
							break;  
							
							
						case"CREATE_IMP":
							WebElement element2 = gobjWebDriver.findElement(By.name("form_reqimpoverview:btnImpCreate"));
							JavascriptExecutor executor2 = (JavascriptExecutor)gobjWebDriver;
							executor2.executeScript("arguments[0].click();", element2);
							blnStatus = true;
							ReportGenerator.generateTestStep(true, currentScreen, "Click Create Impeariement", "Successfully clicked", false);
							/*blnStatus = selectWebtableRow(IdentifyBy.ID, "form_reqimpoverview:reqOverviewTbl:requirementsTable", validateInput(strHashValue), "Requirement Queue", currentScreen);
							Thread.sleep(2000);
							gobjWebDriver.getKeyboard().sendKeys(Keys.PAGE_DOWN);
							Thread.sleep(1000);
							blnStatus = setValue(WebControl.BUTTON, IdentifyBy.NAME, "form_reqimpoverview:btnImpCreate", validateInput(strHashValue), "CREATE", currentScreen);
							waitForPageLoad(MIN_TIMEOUT);*/
							break;    
					
						case"IMP_TYPE":
							Thread.sleep(2000);
							blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_createImpairment:_id52", validateInput(strHashValue), "IMP_TYPE", currentScreen);
							break;  
						
						case "DEBIT_POINTS":
							blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_createImpairment:Debit", validateInput(strHashValue), "Debit Points", currentScreen);
							break;
						case"ADD_OR_ORDER":
							blnStatus = setValue(WebControl.RADIOBOX, IdentifyBy.NAME, "form_createRequirement:_id45", getAppRadioValues(strHashKey, strHashValue), "Add/Order", currentScreen);
							break;
						case"TYPE":
							blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_createRequirement:_id53", validateInput(strHashValue), "TYPE", currentScreen);
							break;
						case"DOCTOR":
							
							blnStatus = setValue(WebControl.BUTTON, IdentifyBy.NAME, "form_createRequirement:_id78", validateInput(strHashValue), "CLICK DOCTOR", currentScreen);
							break;		
						/*case"FORM_NUMBER":
							blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_createRequirement:formNumber", validateInput(strHashValue), "Form Number", currentScreen);
							break;*/
						case"FOLLOW_UP_FREQUENCY":
							Thread.sleep(2000);
							gobjWebDriver.findElement(By.name("form_createRequirement:followUpFrequency")).clear();
							gobjWebDriver.findElement(By.name("form_createRequirement:followUpFrequency")).click();
							blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_createRequirement:followUpFrequency", validateInput(strHashValue), " Follow-up Frequency", currentScreen);
							break;   
							
						case"ADD_IMP":
							WebElement element1 = gobjWebDriver.findElement(By.name("form_createImpairment:_id88"));
							JavascriptExecutor executor1 = (JavascriptExecutor)gobjWebDriver;
							executor1.executeScript("arguments[0].click();", element1);
							blnStatus = true;
							ReportGenerator.generateTestStep(true, currentScreen, "Click Add", "Successfully clicked", false);
							
							break;
						case"ADD":
							WebElement element = gobjWebDriver.findElement(By.name("form_createRequirement:_id92"));
							JavascriptExecutor executor = (JavascriptExecutor)gobjWebDriver;
							executor.executeScript("arguments[0].click();", element);
							blnStatus = true;
							ReportGenerator.generateTestStep(true, currentScreen, "Click Add", "Successfully clicked", false);
							//blnStatus = setValue(WebControl.BUTTON, IdentifyBy.NAME, "form_createRequirement:_id86", validateInput(strHashValue), "Add", currentScreen);
							break;
						case"VENDOR_TYPE":
							Thread.sleep(2000);
							blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_createRequirement:vendor", validateInput(strHashValue), "VENDOR_TYPE", currentScreen);
							break;
						case "default1":
							ReportGenerator.generateTestStep(false, currentScreen, "Field Navigation", strHashKey + " field not available in the current method.", false);
							break;
						} //end of switch
						if(!blnStatus) break;
					} //end of while
				}
				else {
					ReportGenerator.generateTestStep(false, currentScreen, "Switch to Frame", "Failed to switch frames " + strFrames.replaceAll(GlobalData.STRING_SEPARATOR, " > "), false);
					blnStatus = false;
				}
				objEnum = null;
					
			} catch(Exception objExp) {
				ReportGenerator.generateTestStep(false, currentScreen, "Exception occured", "Exception is - " + objExp.getMessage(), false);
				blnStatus = false;
			}
			return blnStatus;
		}
		
		//Function For NBPAYMENT flow
		private static boolean NBPAYMENT(OrderedHashtable objTestData) {
			boolean blnStatus = false;
			String strHashKey = "", strHashValue = "";
			Actions act=new Actions(gobjWebDriver);
			try {
				String strFrames = "mainContentFrame" + GlobalData.STRING_SEPARATOR + "contentRightFrame" + GlobalData.STRING_SEPARATOR + "file";
				Enumeration objEnum = objTestData.enumerateKeys();
				if(waitForPageLoad(MAX_TIMEOUT) && switchToFrame(strFrames, false)) {
					
					while(objEnum.hasMoreElements()) {
						//blnStatus = false;
						strHashKey = objEnum.nextElement().toString();
						strHashValue = objTestData.get(strHashKey).toString();
						
						switch(strHashKey) {
						
						
						case "MISCELLANEOUS_MAIL_NO":	
							
							WebElement element = gobjWebDriver.findElement(By.id("form_indexApplication:indexSourceTable:indexingOverviewDataTable:" + strHashValue + ":image"));
							JavascriptExecutor executor = (JavascriptExecutor)gobjWebDriver;
							executor.executeScript("arguments[0].click();", element);
							ReportGenerator.generateTestStep(true, currentScreen, "Click CWA", "Successfully clicked", true);
							blnStatus = true;
							break;
						
						case"CHECK_NUMBER":																					 
							blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_indexApplication:indexCheckform:number", validateInput(strHashValue), "Check Number:", currentScreen);
							Thread.sleep(5000);
							break;
						case"CHECK_DATE":	
							gobjWebDriver.findElement(By.name("form_indexApplication:indexCheckform:checkDate")).click();
							blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_indexApplication:indexCheckform:checkDate", validateInput(strHashValue), "Check Date:", currentScreen);
							Thread.sleep(3000);
							break;
						case"AMOUNT":			
							System.out.println(MIPAmount);		
							gobjWebDriver.findElement(By.name("form_indexApplication:indexCheckform:amount")).clear();
							Thread.sleep(3000);
							
							act.moveToElement(gobjWebDriver.findElement(By.name("form_indexApplication:indexCheckform:amount"))).click().perform();
							act.sendKeys(MIPAmount).build().perform();
							blnStatus = true;
							break;
						case"CHECK_AMOUNT":
							gobjWebDriver.findElement(By.name("form_indexApplication:indexCheckform:amount")).clear();
							Thread.sleep(3000);
							
							act.moveToElement(gobjWebDriver.findElement(By.name("form_indexApplication:indexCheckform:amount"))).click().perform();
							act.sendKeys(validateInput(strHashValue)).build().perform();
							blnStatus = true;
							break;
						case"SPLIT_MULTIPLE_":                                          
							blnStatus = setValue(WebControl.CHECKBOX, IdentifyBy.NAME, "form_indexApplication:indexCheckform:splitMultipleCheckbox", validateInput(strHashValue), "Split Multiple", currentScreen);
							break;
						case"FOREIGN_BANK_ADDRESS":
							blnStatus = setValue(WebControl.CHECKBOX, IdentifyBy.NAME, "form_indexApplication:indexCheckform:foreignBkAddCheckbox", validateInput(strHashValue), "Foreign Bank Address", currentScreen);
							break;
						case"NON_US_DOLLARS":
							blnStatus = setValue(WebControl.CHECKBOX, IdentifyBy.NAME, "form_indexApplication:indexCheckform:nonUSDollarsCheckbox", validateInput(strHashValue), "Non-US Dollars", currentScreen);
							break;
						case"HANDWRITTEN_CHECK":
							blnStatus = setValue(WebControl.CHECKBOX, IdentifyBy.NAME, "form_indexApplication:indexCheckform:isHandWrittenCheckbox", validateInput(strHashValue), "Handwritten Check?", currentScreen);
							break;
						case"PERSON_R_ENTITY":
							blnStatus = setValue(WebControl.RADIOBOX, IdentifyBy.NAME, "form_indexApplication:indexCheckform:_id39", getAppRadioValues(strHashKey, strHashValue), "Person / Entity", currentScreen);
							break;
						case"PREFIX":
							blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_indexApplication:indexCheckform:chkPersonPrefixDD", validateInput(strHashValue), "Prefix:", currentScreen);
							break;
						case"FIRST_NAME":
							gobjWebDriver.findElement(By.name("form_indexApplication:indexCheckform:chkPersonFirstNameEF")).click();
							blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_indexApplication:indexCheckform:chkPersonFirstNameEF", validateInput(strHashValue), "First", currentScreen);
							break;
						case"MIDDLE_NAME":
							blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_indexApplication:indexCheckform:chkPersonMiddleNameEF", validateInput(strHashValue), "Middle", currentScreen);
							break;
						case"LAST_NAME":
							blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_indexApplication:indexCheckform:chkPersonLastNameEF", validateInput(strHashValue), "Last", currentScreen);
							break;
						case"SUFFIX":
							blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_indexApplication:indexCheckform:chkPersonSuffixDD", validateInput(strHashValue), "Suffix:", currentScreen);
							break;
						case"ENTITY":
							blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_indexApplication:indexCheckform:entityName", validateInput(strHashValue), "ENTITY", currentScreen);
							break;
						case"COMPANY":
							blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_indexApplication:indexCheckform:checkcompanyList", validateInput(strHashValue), "Company:", currentScreen);
							break;
						case"CONTRACT":
							blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_indexApplication:indexCheckform:chkcontract", validateInput(strHashValue), "Contract:", currentScreen);
							Thread.sleep(5000);
							break;
						case"INFORCE":
							blnStatus = setValue(WebControl.CHECKBOX, IdentifyBy.NAME, "form_indexApplication:indexCheckform:chkinforceCheckbox", validateInput(strHashValue), "Inforce", currentScreen);
							
							Thread.sleep(5000);
							break;
						case"PAYMENT_ORIGINATION":
							WebDriverWait wt= new WebDriverWait(gobjWebDriver,20);
							wt.until(ExpectedConditions.presenceOfElementLocated(By.name("form_indexApplication:indexCheckform:pSourceDD")));
							blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_indexApplication:indexCheckform:pSourceDD", validateInput(strHashValue), "Payment Origination:", currentScreen);
							break;
						case"PAYMENT_TYPE":
							blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_indexApplication:indexCheckform:pTypeDD", validateInput(strHashValue), "Payment Type:", currentScreen);
							break;
						case"INFORCE_PAYMENT_DATE":
							blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_indexApplication:indexCheckform:date", validateInput(strHashValue), "Inforce Payment Date:", currentScreen);
							break;
						case"COST_BASIS":
							blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_indexApplication:indexCheckform:costBasis", validateInput(strHashValue), "Cost Basis:", currentScreen);
							break;
						case"RECEIPT_DATE":
							blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_indexApplication:indexCheckform:receiptDate", validateInput(strHashValue), "Receipt Date:", currentScreen);
							break;
						case"PREVIOUS_TAX_YEAR":
							blnStatus = setValue(WebControl.CHECKBOX, IdentifyBy.NAME, "form_indexApplication:indexCheckform:previousTaxYearCheckbox", validateInput(strHashValue), "Previous Tax Year", currentScreen);
							break;
						case "COMMIT":
							blnStatus = setValue(WebControl.BUTTON, IdentifyBy.NAME, "form_indexApplication:_id78", validateInput(strHashValue), "Commit", currentScreen);
							waitForPageClose(MAX_TIMEOUT);
							strFrames = "mainContentFrame" + GlobalData.STRING_SEPARATOR + "contentLeftFrame" + GlobalData.STRING_SEPARATOR + "file"  + GlobalData.STRING_SEPARATOR + "file"  ;
							if(switchToFrame(strFrames, false)) waitForPageLoad(MAX_TIMEOUT);
							break;
						case"RECEIPT_CHECKBOX":
							blnStatus = setValue(WebControl.CHECKBOX, IdentifyBy.NAME, "form_indexApplication:indexCheckform:receivedPDRInd", validateInput(strHashValue),"Receipt Checkbox", currentScreen);
							break;
						case "default1":
							ReportGenerator.generateTestStep(false, currentScreen, "Field Navigation", strHashKey + " field not available in the current method.", false);
							break;
						} //end of switch
						if(!blnStatus) break;
					} //end of while
				}
				else {
					ReportGenerator.generateTestStep(false, currentScreen, "Switch to Frame", "Failed to switch frames " + strFrames.replaceAll(GlobalData.STRING_SEPARATOR, " > "), false);
					blnStatus = false;
				}
				objEnum = null;
					
			} catch(Exception objExp) {
				ReportGenerator.generateTestStep(false, currentScreen, "Exception occured", "Exception is - " + objExp.getMessage(), false);
				blnStatus = false;
			}
			return blnStatus;
		}
		
		//Function For VerifyUWandUWCM flow
		private static boolean VerifyUWandUWCM(OrderedHashtable objTestData) {
			
			boolean blnStatus = false;
			String strHashKey = "", strHashValue = "";
			String Actual_Q1="";
			String Actual_Q="";
			
			try {
				//waitForPageLoad(MAX_TIMEOUT);
				String cHandle = gobjWebDriver.getWindowHandle();
				System.out.println("Windows"+cHandle);
				Enumeration objEnum = objTestData.enumerateKeys();
				if(waitForWindowAndSwitch(cHandle, "Summary", false)) {
					
					
					while(objEnum.hasMoreElements()) {
						//blnStatus = false;
						strHashKey = objEnum.nextElement().toString();
						strHashValue = objTestData.get(strHashKey).toString();

						switch(strHashKey) {
						
						case"EXPECTED_UW_QUEUE":				
						
						List<WebElement>ts_1=gobjWebDriver.findElements(By.xpath("//td[@class='summaryLeft']//span"));
						
					
						for(int i=0;i<ts_1.size();i++){
							
							Actual_Q=ts_1.get(i).getText();
							
							if(Actual_Q.contains(strHashValue))
							{
								blnStatus=true;
								break;
							}
							
						}
							if(blnStatus) {
								ReportGenerator.generateTestStep(true, currentScreen, "Verify Underwriter Queue" , "Underwriter Queue verified as expected. Expected " +  strHashValue, true);
							}
							else {
								ReportGenerator.generateTestStep(false, currentScreen, "Verify Underwriter Queue" , "Underwriter Queue NOT as expected. Expected " +  strHashValue, true);
							}
			
							break;
						case"EXPECTED_UWCM_QUEUE":
							
							 
							List<WebElement>ts_2=gobjWebDriver.findElements(By.xpath("//td[@class='summaryLeft']//span"));
							
							for(int i=0;i<ts_2.size();i++){
								
								Actual_Q1=ts_2.get(i).getText();
								
								if(Actual_Q1.contains(strHashValue))
								{
									
									blnStatus=true;
									break;
									
								}
								
							}
							if(blnStatus) {
								ReportGenerator.generateTestStep(true, currentScreen, "Verify Case Manager Queue:" , "Case Manager Queue verified as expected. Expected " +  strHashValue, true);
							}
							else {
								ReportGenerator.generateTestStep(false, currentScreen, "Verify Case Manager Queue" , "Case Manager Queue NOT as expected. Expected " +  strHashValue, true);
							}
				
							break;
						case"VERIFY_LABLE":
							
                            List<WebElement>ts_3=gobjWebDriver.findElements(By.xpath("//table[@class='indicators']//td/label[@class='indEnabledtrue']"));
							
							for(int i=0;i<ts_3.size();i++){
								
								Actual_Q1=ts_3.get(i).getText();
								
								if(Actual_Q1.contains(strHashValue))
								{
									
									blnStatus=true;
									break;
									
								}
								
							}
							if(blnStatus) {
								ReportGenerator.generateTestStep(true, currentScreen, "Verify Label:" , "Verify expected label. Expected " +  strHashValue, true);
							}
							else {
								ReportGenerator.generateTestStep(false, currentScreen, "Verify Label" , "Label NOT as expected. Expected " +  strHashValue, true);
							}
							
							
							
							break;
						case"CLOSE":
							cHandle = gobjWebDriver.getWindowHandle();
							gobjWebDriver.close();
							waitForWindowAndSwitch(cHandle, "Accelerator Desktop", false);
							blnStatus=true;
							break;
						case"AUTO_CLOSURE_DATE":
							
							 
							List<WebElement>ts_4=gobjWebDriver.findElements(By.xpath("//td[@class='summaryLeft']//span"));
							
							for(int i=0;i<ts_4.size();i++){
								
								Actual_Q1=ts_4.get(i).getText();
								
								if(Actual_Q1.contains(strHashValue))
								{
									
									blnStatus=true;
									break;
									
								}
								
							}
							if(blnStatus) {
								ReportGenerator.generateTestStep(true, currentScreen, "Verify Auto Closure date" , "Auto closure date verified as expected. Expected " +  strHashValue, true);
							}
							else {
								ReportGenerator.generateTestStep(false, currentScreen, "Verify Auto Closure date" , "Auto closure date NOT as expected. Expected " +  strHashValue, true);
							}
				
							break;
						case "default1":
							ReportGenerator.generateTestStep(false, currentScreen, "Field Navigation", strHashKey + " field not available in the current method.", false);
							break;
						} //end of switch
						if(!blnStatus) break;
					} //end of while
					
				}
				else {
					ReportGenerator.generateTestStep(false, currentScreen, "Switch to Window", "Failed to switch window " , false);
					blnStatus = false;
				}
				objEnum = null;
					
			} catch(Exception objExp) {
				ReportGenerator.generateTestStep(false, currentScreen, "Exception occured", "Exception is - " + objExp.getMessage(), false);
				blnStatus = false;
			}
			return blnStatus;
		}
		
       //Under Writer AUD Reason(Final Disposition Reason) I-POPUP function
		private static boolean AUDreason(OrderedHashtable objTestData) {
			boolean blnStatus = false;
			String strHashKey = "", strHashValue = "";
			try {
				String strFrames = "FWin0" + GlobalData.STRING_SEPARATOR + "Content0";
				Enumeration objEnum = objTestData.enumerateKeys();
				if(switchToFrame(strFrames, false) && waitForPageLoad(MAX_TIMEOUT)) {
					
					while(objEnum.hasMoreElements()) {
						//blnStatus = false;
						strHashKey = objEnum.nextElement().toString();
						strHashValue = objTestData.get(strHashKey).toString();

						switch(strHashKey) {
						
						case"SECOND_AUD":
							blnStatus = setValue(WebControl.RADIOBOX, IdentifyBy.NAME, "form_reasonView:jointInsuredType_RB1", getAppRadioValues(strHashKey, strHashValue), "Miscfirstname misclastname", currentScreen);
							break;
						case"REASON_SELECTION":
							blnStatus = setValue(WebControl.RADIOBOX, IdentifyBy.NAME, "form_reasonView:reasonType_RB1", getAppRadioValues(strHashKey, strHashValue), "Selection", currentScreen);
							break;
						case"REASON_SELECTION_REASON_LIST":
	                              blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_reasonView:reasonList", validateInput(strHashValue), "REASON_SELECTION", currentScreen);
							break;
						case"REASON_OPTIONAL_TEXT":
							blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_reasonView:optionalText", validateInput(strHashValue), "Optional Text:", currentScreen);
							break;
						case"REASON_FREE_FORM":
							blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_reasonView:reasonType_RB2", validateInput(strHashValue), "Free-form", currentScreen);
							break;
						case"REASON_FREE_FORM_TEXT":
							blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_reasonView:_id7", validateInput(strHashValue), "Free Form Text", currentScreen);
							break;
						case"ADD":
							blnStatus = setValue(WebControl.BUTTON, IdentifyBy.CLASSNAME, "buttonRight", validateInput(strHashValue), "ADD", currentScreen);
							break;
						case"UPDATE":
							blnStatus = setValue(WebControl.BUTTON, IdentifyBy.NAME, "form_reasonView:drUpdate", validateInput(strHashValue), "UPDATE", currentScreen);
							break;
						case "default1":
							ReportGenerator.generateTestStep(false, currentScreen, "Field Navigation", strHashKey + " field not available in the current method.", false);
							break;
						} //end of switch
						if(!blnStatus) break;
					} //end of while
				}
				else {
					ReportGenerator.generateTestStep(false, currentScreen, "Switch to Frame", "Failed to switch frames " + strFrames.replaceAll(GlobalData.STRING_SEPARATOR, " > "), false);
					blnStatus = false;
				}
				objEnum = null;
					
			} catch(Exception objExp) {
				ReportGenerator.generateTestStep(false, currentScreen, "Exception occured", "Exception is - " + objExp.getMessage(), false);
				blnStatus = false;
			}
			return blnStatus;
		}
		
		private static boolean TodoList() {
			boolean blnStatus = false;
			
			try {
				String cHandle = gobjWebDriver.getWindowHandle();
				System.out.println("Parent window in TodoList" + cHandle);
				/*waitForWindowAndSwitch(cHandle, "Accelerator Desktop", false);*/
				
				String strFrames = "mainContentFrame";
				//if(switchToFrame(strFrames, false) && waitForPageLoad(MAX_TIMEOUT)) {
				if(waitForWindowAndSwitch(cHandle, strFrames)) {
					while(!blnStatus) {
						Thread.sleep(200);
						
						gobjWebDriver.manage().window().maximize();
													
						List<WebElement> objMessages = gobjWebDriver.findElementsById("form_todo:tabHeader:toDoTable"); //getWebElements(IdentifyBy.ID, "form_todo:tabHeader:toDoTable");
						//List<WebElement> objMessages = getWebElements(IdentifyBy.ID, "form_todo:tabHeader:toDoTable");
						if(objMessages.size()>0) {
							List<WebElement> objRows = getWebElements(objMessages.get(0), IdentifyBy.TAGNAME, "tr");
							if(objRows.size() > 0) {
								List<WebElement> objCols = getWebElements(objRows.get(0), IdentifyBy.TAGNAME, "td");
								if(objCols.size()>0) {
									
									try{
										gobjWebDriver.manage().timeouts().pageLoadTimeout(MIN_TIMEOUT, TimeUnit.SECONDS);
										List<WebElement> objCheckbox = objCols.get(0).findElements(By.cssSelector("//input[type='image']"));
										if(objCheckbox.size()>0) objCheckbox.get(0).click();
									} 
									catch(Exception obj){}
									gobjWebDriver.manage().timeouts().setScriptTimeout(MAX_TIMEOUT, TimeUnit.SECONDS);
									
									Thread.sleep(1000);
									waitForPageLoad(MAX_TIMEOUT);
									List<WebElement> objDiv = getWebElements(IdentifyBy.ID, "contentArea");
									if(objDiv.size()>0) objDiv.get(0).click();
									Thread.sleep(1000);
									
								}
							} else blnStatus = true;
						} else blnStatus = true;
						
					}
					blnStatus = true;
					ReportGenerator.generateTestStep(true, currentScreen, "Verify Todo List", "Todo list validated.", true);
					cHandle = gobjWebDriver.getWindowHandle();
					try{
						WebElement objCancel = getWebElement(IdentifyBy.CSS_SELECTOR, "//input[value='Cancel']");
						objCancel.click();
					}
					catch(Exception obj){}
					waitForPageClose(MAX_TIMEOUT);
					
					waitForWindowAndSwitch(cHandle, strFrames);
				}
				else {
					ReportGenerator.generateTestStep(false, currentScreen, "Switch to Todo List", "Failed to switch Todo List", false);
					blnStatus = false;
				}
					
			} catch(Exception objExp) {
				ReportGenerator.generateTestStep(false, currentScreen, "Exception occured", "Exception is - " + objExp.getMessage(), false);
				blnStatus = false;
			}
			return blnStatus;
		}
		
		private static boolean IndexOneMiscellaneous(OrderedHashtable objTestData) {
			boolean blnStatus = false;
			String strHashKey = "", strHashValue = "";
			try {
				String strFrames = "mainContentFrame" + GlobalData.STRING_SEPARATOR + "contentRightFrame" + GlobalData.STRING_SEPARATOR + "file";
				Enumeration objEnum = objTestData.enumerateKeys();
				//if(waitForPageLoad(MAX_TIMEOUT)) {
					if(switchToFrame(strFrames, false) && waitForPageLoad(MAX_TIMEOUT)) {
						while(objEnum.hasMoreElements()) {
							//blnStatus = false;
							strHashKey = objEnum.nextElement().toString();
							strHashValue = objTestData.get(strHashKey).toString();
							
							switch(strHashKey) {
								case "COMPANY_NAME":										  
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_indexApplication:indexMiscellaneousForm:companyList", validateInput(strHashValue), "Company Name", currentScreen);
									break;
								case "CONTRACT_NUMBER":
									Thread.sleep(2000);
									blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_indexApplication:indexMiscellaneousForm:miscContract", validateInput(strHashValue), "Contract No", currentScreen);
									break;
								case "PLAN_NAME":
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_indexApplication:indexMiscellaneousForm:miscPlanList", validateInput(strHashValue), "Company Name", currentScreen);
									break;
								case "LAST_NAME":
									blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_indexApplication:indexMiscellaneousForm:lastNamePrimary", validateInput(strHashValue), "Last Name", currentScreen);
									break;
								case "FIRST_NAME":
									blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_indexApplication:indexMiscellaneousForm:firstNamePrimary", validateInput(strHashValue), " First Name", currentScreen);
									break;
								case "MIDDLE_INITIAL":
									blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_indexApplication:indexMiscellaneousForm:middleInitialPrimary", validateInput(strHashValue), "Middle Initial", currentScreen);
									break;
								case "DATE_OF_BIRTH":
									blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_indexApplication:indexMiscellaneousForm:miscDateofBirthDisplay", validateInput(strHashValue), "Date Of Birth", currentScreen);
									break;
								case "GENDER":
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_indexApplication:indexMiscellaneousForm:miscgenderDisplayDD", validateInput(strHashValue), "Gender", currentScreen);
									break;
								case "TAX_INFORMATION":
									blnStatus = setValue(WebControl.RADIOBOX, IdentifyBy.NAME, "form_indexApplication:indexMiscellaneousForm:irstRadioMisc", getAppRadioValues(strHashKey, strHashValue), "Tax Information", currentScreen);
									break;
								case "SOCIAL_SECURITY":
									blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_indexApplication:indexMiscellaneousForm:ssn", validateInput(strHashValue), "SSN", currentScreen);
									break;
								case "TAX_IDENTIFICATION":
									blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_indexApplication:indexMiscellaneousForm:tin", validateInput(strHashValue), "Tax Information", currentScreen);
									break;
								case "SOCIAL_INSURANCE":
									blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_indexApplication:indexMiscellaneousForm:sin", validateInput(strHashValue), "Social Insurance", currentScreen);
									break;
								case "REQUIREMENT_VENDOR":										  
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_indexApplication:indexMiscellaneousForm:requirementVendorList", validateInput(strHashValue), "Requirement Vendor", currentScreen);
									break;
								case "REQUIREMENT_TYPE":
									Thread.sleep(2000);
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_indexApplication:indexMiscellaneousForm:requirementTypeList", validateInput(strHashValue), "Requirement Type", currentScreen);
									break;
								case "FORM":										  
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_indexApplication:indexMiscellaneousForm:formsList", validateInput(strHashValue), "Form", currentScreen);
									break;
								case "MEDICAL_SIGNED_DATE":
									blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_indexApplication:indexMiscellaneousForm:paramedSignDate", validateInput(strHashValue), "Paramed/Medical Signed Date", currentScreen);
									break;
								case "SIGNED_DATE":
									blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_indexApplication:indexMiscellaneousForm:signDate", validateInput(strHashValue), "Signed Date", currentScreen);
									break;
								case "APS_CASE_ID":
									blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_indexApplication:indexMiscellaneousForm:ProviderOrderInput", validateInput(strHashValue), "APS Case ID", currentScreen);
									break;
								case "DELIVERY_RECEIPT_SIGNED_DATE":
									blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_indexApplication:indexMiscellaneousForm:deliveryReceiptDate", validateInput(strHashValue), "Delivery Receipt Signed Date", currentScreen);
									break;
								case "COMMIT":
									blnStatus = setValue(WebControl.BUTTON, IdentifyBy.NAME, "form_indexApplication:_id78", validateInput(strHashValue), "Commit", currentScreen);
									waitForPageClose(MAX_TIMEOUT);
									strFrames = "mainContentFrame" + GlobalData.STRING_SEPARATOR + "contentLeftFrame" + GlobalData.STRING_SEPARATOR + "file"  + GlobalData.STRING_SEPARATOR + "file"  ;
									if(switchToFrame(strFrames, false)) waitForPageLoad(MAX_TIMEOUT);
									
									break;
								case"FORM_1":
									//System.out.println(MIPAmount);//
									Select objSelect = new Select(gobjWebDriver.findElement(By.id("form_indexApplication:indexMiscellaneousForm:formsList")));
									objSelect.selectByVisibleText(Req_Form);
									//blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_cwaCreate:Amount", validateInput(strHashValue), "Check Amount:", currentScreen);
									break;
								case "default1":
									ReportGenerator.generateTestStep(false, currentScreen, "Field Navigation", strHashKey + " field not available in the current method.", false);
									break;
							} //end of switch
							if(!blnStatus) break;
						} //end of while
					}
					else {
						ReportGenerator.generateTestStep(false, currentScreen, "Switch to Frame", "Failed to switch frames " + strFrames.replaceAll(GlobalData.STRING_SEPARATOR, " > "), false);
						blnStatus = false;
					}
					objEnum = null;
				//}
					
			} catch(Exception objExp) {
				ReportGenerator.generateTestStep(false, currentScreen, "Exception occured", "Exception is - " + objExp.getMessage(), false);
				blnStatus = false;
			}
			return blnStatus;
		}
		
		private static boolean IndexContractChange(OrderedHashtable objTestData) {
			boolean blnStatus = false;
			String strHashKey = "", strHashValue = "";
			try {
				String strFrames = "mainContentFrame" + GlobalData.STRING_SEPARATOR + "contentRightFrame" + GlobalData.STRING_SEPARATOR + "file";
				Enumeration objEnum = objTestData.enumerateKeys();
				//if(waitForPageLoad(MAX_TIMEOUT)) {
					if(switchToFrame(strFrames, false) && waitForPageLoad(MAX_TIMEOUT)) {
						while(objEnum.hasMoreElements()) {
							//blnStatus = false;
							strHashKey = objEnum.nextElement().toString();
							strHashValue = objTestData.get(strHashKey).toString();
							
							switch(strHashKey) {
								case "COMPANY_NAME":										  
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_indexApplication:indexContractChangeForm:companyList", validateInput(strHashValue), "Company Name", currentScreen);
									break;
								case "CONTRACT_NUMBER":
									Thread.sleep(2000);
									blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_indexApplication:indexContractChangeForm:chContract", validateInput(strHashValue), "Contract No", currentScreen);
									break;
								case "STATE":
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_indexApplication:indexContractChangeForm:changeStateProvinceCombo", validateInput(strHashValue), "State", currentScreen);
									break;
								case "FORM":										  
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_indexApplication:indexContractChangeForm:cntChgFormsList", validateInput(strHashValue), "Form", currentScreen);
									break;
								case "RECEIPT_DATE":
									blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_indexApplication:indexContractChangeForm:receiptDate", validateInput(strHashValue), "Receipt Date", currentScreen);
									break;	
								case "CHANGE_TYPE":										  
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_indexApplication:indexContractChangeForm:changeTypeList", validateInput(strHashValue), "Change Type", currentScreen);
									break;
								case "COMMIT":
									blnStatus = setValue(WebControl.BUTTON, IdentifyBy.NAME, "form_indexApplication:_id78", validateInput(strHashValue), "Commit", currentScreen);
									waitForPageClose(MAX_TIMEOUT);
									strFrames = "mainContentFrame" + GlobalData.STRING_SEPARATOR + "contentLeftFrame" + GlobalData.STRING_SEPARATOR + "file"  + GlobalData.STRING_SEPARATOR + "file"  ;
									if(switchToFrame(strFrames, false)) waitForPageLoad(MAX_TIMEOUT);
									
									break;								
								case "default1":
									ReportGenerator.generateTestStep(false, currentScreen, "Field Navigation", strHashKey + " field not available in the current method.", false);
									break;
							} //end of switch
							if(!blnStatus) break;
						} //end of while
					}
					else {
						ReportGenerator.generateTestStep(false, currentScreen, "Switch to Frame", "Failed to switch frames " + strFrames.replaceAll(GlobalData.STRING_SEPARATOR, " > "), false);
						blnStatus = false;
					}
					objEnum = null;
				//}
					
			} catch(Exception objExp) {
				ReportGenerator.generateTestStep(false, currentScreen, "Exception occured", "Exception is - " + objExp.getMessage(), false);
				blnStatus = false;
			}
			return blnStatus;
		}
		
		private static boolean ReinsuranceCalculator(OrderedHashtable objTestData) {
			

			boolean blnStatus = false;
			String strHashKey = "", strHashValue = "";
			try {
				String strFrames = "mainContentFrame" + GlobalData.STRING_SEPARATOR + "contentRightFrame" + GlobalData.STRING_SEPARATOR + "file";
				Enumeration objEnum = objTestData.enumerateKeys();
				//if(waitForPageLoad(MAX_TIMEOUT)) {
					if(switchToFrame(strFrames, false) && waitForPageLoad(MAX_TIMEOUT)) {
						while(objEnum.hasMoreElements()) {
							//blnStatus = false;
							strHashKey = objEnum.nextElement().toString();
							strHashValue = objTestData.get(strHashKey).toString();
							
							switch(strHashKey) {
								
										
							case"AXA_UNDERWRITING_CLASS":
								blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_reinsuranceCalculator:uwClass_DD", validateInput(strHashValue), "Axa Underwriting Class", currentScreen);
								break;
							case"AXA_UNDERRWRITING_RATING":
								blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_reinsuranceCalculator:uwRating_DD", validateInput(strHashValue), "Axa Underwriting Table Rating", currentScreen);
								break;
							case"AMOUNT_APPLIED":
								blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.ID, "form_reinsuranceCalculator:amtApplied_PG", validateInput(strHashValue), "Amount Applied for on this policy", currentScreen);
								break;
							case"CLR_AMOUNT":
								blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_reinsuranceCalculator:clrAmt1_OT", validateInput(strHashValue), "CLR Amount (Current Policy):", currentScreen);
								break;
							case"ROPR_AMOUNT":
								blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_reinsuranceCalculator:roprAmt1_OT", validateInput(strHashValue), "ROPR Amount (Current Policy):", currentScreen);
								break;
							case"EPR_AMOUNT":
								blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_reinsuranceCalculator:eprAmt1_OT", validateInput(strHashValue), "EPR Amount (Current Policy):", currentScreen);
								break;
							case"SL_RETAINED_AMOUNTS":
								blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_reinsuranceCalculator:sRetAmtValue_OT", validateInput(strHashValue), "Single Life Retained Amounts (Ultimate):", currentScreen);
								break;
							case"SL_REINSURANCE_CEDED":
								blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_reinsuranceCalculator:sCededAmtValue_OT", validateInput(strHashValue), "Single Life Reinsurance Ceded (Ultimate):", currentScreen);
								break;
							case"JL_RETAINED_AMOUNTS":
								blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_reinsuranceCalculator:jRetAmtValue_OT", validateInput(strHashValue), "Joint Life Retained Amounts (Ultimate):", currentScreen);
								break;
							case"JL_REINSURANCE_CEDED":
								blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_reinsuranceCalculator:jCededAmtValue_OT", validateInput(strHashValue), "Joint Life Reinsurance Ceded (Ultimate):", currentScreen);
								break;
							
							case"ASSUMED_AMOUNTS":
								blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_reinsuranceCalculator:assumedAmtValue_OT", validateInput(strHashValue), "Assumed Amounts:", currentScreen);
								break;
							case"SL_PENDING":
								blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_reinsuranceCalculator:singleLifeAppValue_OT", validateInput(strHashValue), "Single Life Application (Concurrent Pending):", currentScreen);
								break;
							case"JL_PENDING":
								blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_reinsuranceCalculator:jointLifeAppValue_OT", validateInput(strHashValue), "Joint Life Application (Concurrent ", currentScreen);
								break;
							case"RESIDENCE":
								blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_reinsuranceCalculator:residence_DD", validateInput(strHashValue), "Residence:", currentScreen);
								break;
							case"HAZARD":
								blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_reinsuranceCalculator:hazard_DD", validateInput(strHashValue), "Hazard", currentScreen);
								break;
							case"FOREIGN_TRAVEL":
								blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_reinsuranceCalculator:foreignTravel_DD", validateInput(strHashValue), "Foreign Travel", currentScreen);
								break;
							case"MILITARY":
								blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_reinsuranceCalculator:military_DD", validateInput(strHashValue), "Military:", currentScreen);
								break;
							case"UNDERWRITING":
								blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_reinsuranceCalculator:uwType_DD", validateInput(strHashValue), "Underwriting", currentScreen);
								break;
							case"PRODUCT_TYPE":
								blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_reinsuranceCalculator:productType_DD", validateInput(strHashValue), "Product Type", currentScreen);
								break;
							case"FACULTATIVELY_SHOPPED":
								blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_reinsuranceCalculator:facultativeShop_DD", validateInput(strHashValue), "Facultatively shopped within 3 years:", currentScreen);
								break;
							case"SAVE":
								blnStatus = setValue(WebControl.BUTTON, IdentifyBy.NAME, "form_reinsuranceCalculator:save_cb", validateInput(strHashValue), "SAVE", currentScreen);
								break;
								
							case"CALCULATE":
								blnStatus = setValue(WebControl.BUTTON, IdentifyBy.NAME, "form_reinsuranceCalculator:commit_cb", validateInput(strHashValue), "CALCULATE", currentScreen);
								break;
							case "default1":
								ReportGenerator.generateTestStep(false, currentScreen, "Field Navigation", strHashKey + " field not available in the current method.", false);
								break;
							
							} //end of switch
							if(!blnStatus) break;
						} //end of while
					}
					else {
						ReportGenerator.generateTestStep(false, currentScreen, "Switch to Frame", "Failed to switch frames " + strFrames.replaceAll(GlobalData.STRING_SEPARATOR, " > "), false);
						blnStatus = false;
					}
					objEnum = null;
				//}
					
			} catch(Exception objExp) {
				ReportGenerator.generateTestStep(false, currentScreen, "Exception occured", "Exception is - " + objExp.getMessage(), false);
				blnStatus = false;
			}
			return blnStatus;
		}
		
		private static boolean Assignment(OrderedHashtable objTestData) {
			boolean blnStatus = false;
			String strHashKey = "", strHashValue = "";
			try {
				String strFrames = "mainContentFrame" + GlobalData.STRING_SEPARATOR + "contentLeftFrame" + GlobalData.STRING_SEPARATOR + "file" + GlobalData.STRING_SEPARATOR + "file";
				Enumeration objEnum = objTestData.enumerateKeys();
				//if(waitForPageLoad(MAX_MILSEC_TIMEOUT)) {
					if(switchToFrame(strFrames, false) && waitForPageLoad(MAX_TIMEOUT)) {
						while(objEnum.hasMoreElements()) {
							//blnStatus = false;
							strHashKey = objEnum.nextElement().toString();
							strHashValue = objTestData.get(strHashKey).toString();
							
							switch(strHashKey) {
								
								case "Assign":
									blnStatus = setValue(WebControl.BUTTON, IdentifyBy.NAME, "inboxForm:_id53", validateInput(strHashValue), "Assign", currentScreen);
									break;
								case "Unsuspend":
									blnStatus = setValue(WebControl.BUTTON, IdentifyBy.NAME, "inboxForm:_id42", validateInput(strHashValue), "Assign", currentScreen);
									waitForPageLoad(MAX_TIMEOUT);
									break;
								case "Unlock":
									blnStatus = setValue(WebControl.BUTTON, IdentifyBy.NAME, "inboxForm:unlockButon", validateInput(strHashValue), "Assign", currentScreen);
									waitForPageLoad(MAX_TIMEOUT);
									break;
								case "default1":
									ReportGenerator.generateTestStep(false, currentScreen, "Field Navigation", strHashKey + " field not available in the current method.", false);
									break;
							} //end of switch
							if(!blnStatus) break;
						} //end of while
					}
					else {
						ReportGenerator.generateTestStep(false, currentScreen, "Switch to Frame", "Failed to switch frames " + strFrames.replaceAll(GlobalData.STRING_SEPARATOR, " > "), false);
						blnStatus = false;
					}
					objEnum = null;
				//}
					
			} catch(Exception objExp) {
				ReportGenerator.generateTestStep(false, currentScreen, "Exception occured", "Exception is - " + objExp.getMessage(), false);
				blnStatus = false;
			}
			return blnStatus;
		}
		private static boolean Reassign(OrderedHashtable objTestData) {
			boolean blnStatus = false;
			String strHashKey = "", strHashValue = "";
			try {
				String strFrames = "FWin0" + GlobalData.STRING_SEPARATOR + "Content0";
				Enumeration objEnum = objTestData.enumerateKeys();
				//if(waitForPageLoad(MAX_MILSEC_TIMEOUT)) {
					if(switchToFrame(strFrames, false) && waitForPageLoad(MAX_TIMEOUT)) {
						while(objEnum.hasMoreElements()) {
							//blnStatus = false;
							strHashKey = objEnum.nextElement().toString();
							strHashValue = objTestData.get(strHashKey).toString();
							
							switch(strHashKey) {
							case"UW_QUEUE":
							blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_queues:uwQueueList", validateInput(strHashValue), "UW_QUEUE", currentScreen);
								break;
							case"UWCM_QUEUE":
								blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_queues:cmQueueList", validateInput(strHashValue), "UWCM_QUEUE", currentScreen);
									break;
							case"COMMIT":
							    blnStatus = setValue(WebControl.BUTTON, IdentifyBy.NAME, "form_queues:btnCommit", validateInput(strHashValue), "Commit", currentScreen);
							    waitForPageClose(MAX_TIMEOUT);
							    break;
								
							case "default1":
								ReportGenerator.generateTestStep(false, currentScreen, "Field Navigation", strHashKey + " field not available in the current method.", false);
								break;
								
							} //end of switch
							if(!blnStatus) break;
						} //end of while
					}
					else {
						ReportGenerator.generateTestStep(false, currentScreen, "Switch to Frame", "Failed to switch frames " + strFrames.replaceAll(GlobalData.STRING_SEPARATOR, " > "), false);
						blnStatus = false;
					}
					objEnum = null;
				//}
					
			} catch(Exception objExp) {
				ReportGenerator.generateTestStep(false, currentScreen, "Exception occured", "Exception is - " + objExp.getMessage(), false);
				blnStatus = false;
			}
			return blnStatus;
		}
		private static boolean FinancialMoney (OrderedHashtable objTestData) {
			boolean blnStatus = false;
			String strHashKey = "", strHashValue = "";
			try {
				String strFrames =  "mainContentFrame" + GlobalData.STRING_SEPARATOR + "contentRightFrame"+ GlobalData.STRING_SEPARATOR +"file";
				Enumeration objEnum = objTestData.enumerateKeys();
				//if(waitForPageLoad(MAX_MILSEC_TIMEOUT)) {
					if(switchToFrame(strFrames, false) && waitForPageLoad(MAX_TIMEOUT)) {
						while(objEnum.hasMoreElements()) {
							//blnStatus = false;
							strHashKey = objEnum.nextElement().toString();
							strHashValue = objTestData.get(strHashKey).toString();
							
							switch(strHashKey) {										
							case"CWA_UPDATE":								  			
								blnStatus = selectWebtableRow(IdentifyBy.ID, "form_cwa:cwaOverviewTable:cwaPaymentOverviewDataTable", validateInput(strHashValue), "Cwa Update", currentScreen);
								break;
							case"AS OF DATE":
								blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_cwaCreate:asOfDate", validateInput(strHashValue), "As of Date:", currentScreen);
								break;
							/*case"AMOUNT":
								System.out.println(MIPAmount);
								gobjWebDriver.findElement(By.name("form_cwaCreate:Amount")).clear();
								Thread.sleep(3000);
								
								act.moveToElement(gobjWebDriver.findElement(By.name("form_cwaCreate:Amount"))).click().perform();
								act.sendKeys(MIPAmount).build().perform();
								blnStatus = true;
								break;*/
							case"AMOUNT":
								System.out.println(MIPAmount);
								gobjWebDriver.findElement(By.id("form_cwaCreate:Amount")).sendKeys(Premium_Value);
								//blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_cwaCreate:Amount", validateInput(strHashValue), "Check Amount:", currentScreen);
								break;
							case"AMOUNT1":
								blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_cwaCreate:Amount", validateInput(strHashValue), "Check Amount:", currentScreen);
								break;
							case"AMOUNT_REFUND":
								blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_cwaUpdate:RefundAmount", validateInput(strHashValue), "Check Refund Amount:", currentScreen);
								break;
							case"TYPE":
							blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_cwaCreate:Type", validateInput(strHashValue), "Type", currentScreen);
								break;
							case"PAYMENT":
								blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_cwaCreate:pSourceDD", validateInput(strHashValue), "Payment", currentScreen);
									break;
							case"REFUND":					
								waitForPageLoad(MIN_TIMEOUT);						  
								scrollDown();
								blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_cwaUpdate:actionCombo", validateInput(strHashValue), "Refund", currentScreen);
									break;
									
							case"VIEW":
							    blnStatus = setValue(WebControl.BUTTON, IdentifyBy.NAME, "form_cwa:btnViewUpdate", validateInput(strHashValue), "View", currentScreen);
								break;
							case"CREATE":
							    blnStatus = setValue(WebControl.BUTTON, IdentifyBy.NAME, "form_cwa:btnCreate", validateInput(strHashValue), "Create", currentScreen);
								break;
							case"UPDATE":
								scrollDown();    
								WebElement elementu = gobjWebDriver.findElement(By.name("form_cwaUpdate:btnUpdate"));
								JavascriptExecutor executoru = (JavascriptExecutor)gobjWebDriver;
								executoru.executeScript("arguments[0].click();", elementu);
								blnStatus=true;
								ReportGenerator.generateTestStep(true, currentScreen, "Click Update", "Successfully clicked", true);
							    //blnStatus = setValue(WebControl.BUTTON, IdentifyBy.NAME, "form_cwaCreate:btnAdd", validateInput(strHashValue), "Add", currentScreen);
								//blnStatus = setValue(WebControl.BUTTON, IdentifyBy.NAME, "form_cwaUpdate:btnUpdate", validateInput(strHashValue), "Update", currentScreen);
								break;
							case"ADD":
								scrollDown();
								WebElement element = gobjWebDriver.findElement(By.name("form_cwaCreate:btnAdd"));
								JavascriptExecutor executor = (JavascriptExecutor)gobjWebDriver;
								executor.executeScript("arguments[0].click();", element);
								blnStatus=true;
								ReportGenerator.generateTestStep(true, currentScreen, "Click ADD", "Successfully clicked", true);
							    //blnStatus = setValue(WebControl.BUTTON, IdentifyBy.NAME, "form_cwaCreate:btnAdd", validateInput(strHashValue), "Add", currentScreen);
								break;
							case"COMMIT":												  	
							    blnStatus = setValue(WebControl.BUTTON, IdentifyBy.NAME, "form_cwa:btnContCommit", validateInput(strHashValue), "Commit", currentScreen);
							    waitForPageLoad(MIN_TIMEOUT);
								break;
							case "default1":
								ReportGenerator.generateTestStep(false, currentScreen, "Field Navigation", strHashKey + " field not available in the current method.", false);
								break;
						
							} //end of switch
							if(!blnStatus) break;
						} //end of while
					}
					else {
						ReportGenerator.generateTestStep(false, currentScreen, "Switch to Frame", "Failed to switch frames " + strFrames.replaceAll(GlobalData.STRING_SEPARATOR, " > "), false);
						blnStatus = false;
					}
					objEnum = null;
				//}
					
			} catch(Exception objExp) {
				ReportGenerator.generateTestStep(false, currentScreen, "Exception occured", "Exception is - " + objExp.getMessage(), false);
				blnStatus = false;
			}
			return blnStatus;
		}
		
		private static boolean Facultative(OrderedHashtable objTestData) {
			boolean blnStatus = false;
			String strHashKey = "", strHashValue = "";
			try {
				String strFrames = "mainContentFrame" + GlobalData.STRING_SEPARATOR + "contentRightFrame" + GlobalData.STRING_SEPARATOR + "file";
				Enumeration objEnum = objTestData.enumerateKeys();
				//if(waitForPageLoad(MAX_TIMEOUT)) {
					if(switchToFrame(strFrames, false) && waitForPageLoad(MAX_TIMEOUT)) {
						while(objEnum.hasMoreElements()) {
							//blnStatus = false;
							strHashKey = objEnum.nextElement().toString();
							strHashValue = objTestData.get(strHashKey).toString();
							
							switch(strHashKey) {
								case "COMPANY_NAME":										  
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_indexApplication:indexReinsurance:reincompanyList", validateInput(strHashValue), "Company Name", currentScreen);
									break;
									
								case "CONTRACT_NUMBER":
									blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_indexApplication:indexReinsurance:reinContract", validateInput(strHashValue), "Contract No", currentScreen);
									break;
									
								case "PLAN_NAME":
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_indexApplication:indexReinsurance:reinPlanList", validateInput(strHashValue), "Company Name", currentScreen);
									break;
									
								case "LAST_NAME":
									blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_indexApplication:indexReinsurance:reinLastName", validateInput(strHashValue), "Last Name", currentScreen);
									break;
									
								case "FIRST_NAME":
									blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_indexApplication:indexReinsurance:reinfirstName", validateInput(strHashValue), " First Name", currentScreen);
									break;
									
								case "REINSURANCE_COMPANY":										  
									blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_indexApplication:indexReinsurance:reinsuranceCompanyListsd", validateInput(strHashValue), "Reinsurance Company", currentScreen);
									break;
									
								case "COMMIT":
									blnStatus = setValue(WebControl.BUTTON, IdentifyBy.NAME, "form_indexApplication:_id78", validateInput(strHashValue), "Commit", currentScreen);
									waitForPageClose(MAX_TIMEOUT);
									break;
								case "default1":
									ReportGenerator.generateTestStep(false, currentScreen, "Field Navigation", strHashKey + " field not available in the current method.", false);
									break;
							} //end of switch
							if(!blnStatus) break;
						} //end of while
					}
					else {
						ReportGenerator.generateTestStep(false, currentScreen, "Switch to Frame", "Failed to switch frames " + strFrames.replaceAll(GlobalData.STRING_SEPARATOR, " > "), false);
						blnStatus = false;
					}
					objEnum = null;
				//}
					
			} catch(Exception objExp) {
				ReportGenerator.generateTestStep(false, currentScreen, "Exception occured", "Exception is - " + objExp.getMessage(), false);
				blnStatus = false;
			}
			return blnStatus;
		}
		
		private static boolean ReinsuranceAmount(OrderedHashtable objTestData) {
			boolean blnStatus = false;
			String strHashKey = "", strHashValue = "";
			try {
				String strFrames = "mainContentFrame" + GlobalData.STRING_SEPARATOR + "contentRightFrame" + GlobalData.STRING_SEPARATOR + "file";
				Enumeration objEnum = objTestData.enumerateKeys();
				//if(waitForPageLoad(MAX_TIMEOUT)) {
					if(switchToFrame(strFrames, false) && waitForPageLoad(MAX_TIMEOUT)) {
						while(objEnum.hasMoreElements()) {
							//blnStatus = false;
							strHashKey = objEnum.nextElement().toString();
							strHashValue = objTestData.get(strHashKey).toString();
							
							switch(strHashKey) {
								case "CHOOSE_COVERAGE":
								
																						  
									blnStatus = setValue(WebControl.LINK, IdentifyBy.ID, "form_recordReinsuranceResponse:reinsRecordReinsuranceResponseTable:0:reinResCol1", validateInput(strHashValue), "Select Coverage", currentScreen);
									//blnStatus = selectWebtableRow(IdentifyBy.ID, "form_recordReinsuranceResponse:reinsRecordReinsuranceResponseTable", validateInput(strHashValue), "", currentScreen);
									break;
								

								case"REINSURANCE_AMOUNT_ACCEPTED":
									blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_recordReinsuranceResponse:Amount1", validateInput(strHashValue), "Reinsurance Amount Accepted:", currentScreen);
									break;
								

								case"CEDED_AMOUNT":
									blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_recordReinsuranceResponse:Amount4", validateInput(strHashValue), "Ceded Amount:", currentScreen);
									break;
								
								case"REINSURANCE_MESSAGE":
									blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_recordReinsuranceResponse:_id51", validateInput(strHashValue), "Reinsurer's Message", currentScreen);
									break;
									
								case "UPDATE":
									blnStatus = setValue(WebControl.BUTTON, IdentifyBy.NAME, "form_recordReinsuranceResponse:reinsViewUpdate", validateInput(strHashValue), "Update", currentScreen);
								
									break;
								case "REINSURANCE_UPDATE":
									waitForPageLoad(MAX_TIMEOUT);
									scrollDown();
									scrollDown();
									blnStatus = setValue(WebControl.BUTTON, IdentifyBy.NAME, "form_recordReinsuranceResponse:reinsViewUpdateOrAdd", validateInput(strHashValue), "Reinsurance_Update", currentScreen);
									waitForPageLoad(MAX_TIMEOUT);
									break;
								case "REINSURANCE_CHECKBOX":
									blnStatus = setValue(WebControl.CHECKBOX, IdentifyBy.NAME, "form_recordReinsuranceResponse:reinsRecordReinsuranceResponseTable:0:_id21", validateInput(strHashValue), "Is Proposed Insured Owner", currentScreen);
									break;	
								case "default1":
									ReportGenerator.generateTestStep(false, currentScreen, "Field Navigation", strHashKey + " field not available in the current method.", false);
									break;
									
							} //end of switch
							if(!blnStatus) break;
						} //end of while
					}
					else {
						ReportGenerator.generateTestStep(false, currentScreen, "Switch to Frame", "Failed to switch frames " + strFrames.replaceAll(GlobalData.STRING_SEPARATOR, " > "), false);
						blnStatus = false;
					}
					objEnum = null;
				//}
					
			} catch(Exception objExp) {
				ReportGenerator.generateTestStep(false, currentScreen, "Exception occured", "Exception is - " + objExp.getMessage(), false);
				blnStatus = false;
			}
			return blnStatus;
		}
		
		private static boolean LoanCarryOver(OrderedHashtable objTestData) {
			boolean blnStatus = false;
			String strHashKey = "", strHashValue = "";
			try {
				String strFrames =  "FWin0" + GlobalData.STRING_SEPARATOR + "Content0";
				Enumeration objEnum = objTestData.enumerateKeys();
				//if(waitForPageLoad(MAX_MILSEC_TIMEOUT)) {
					if(switchToFrame(strFrames, false) && waitForPageLoad(MAX_TIMEOUT)) {
						while(objEnum.hasMoreElements()) {
							//blnStatus = false;
							strHashKey = objEnum.nextElement().toString();
							strHashValue = objTestData.get(strHashKey).toString();
							
							switch(strHashKey) {  
							//
							
							case"AMOUNT":
								blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_LoanCarryover:principleAmount_IT", validateInput(strHashValue), "Amount:", currentScreen);
								break;
								
							case"INTEREST_DATE":
								blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_LoanCarryover:interestPaid_IT", validateInput(strHashValue), "Interest_date:", currentScreen);
								break;
							case"AS_OF_DATE":
								blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_LoanCarryover:lastActDate_IT", validateInput(strHashValue), "As_of_date:", currentScreen);
								break;
							case"INTEREST_CODE":
								blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_LoanCarryover:interestCode_SM", validateInput(strHashValue), "Interest_code", currentScreen);
									break;
							case"INVESTMENT_CODE":
								blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_LoanCarryover:investmentCode_SM", validateInput(strHashValue), "Investment_code", currentScreen);
									break;
							case"ADD":
							    blnStatus = setValue(WebControl.BUTTON, IdentifyBy.NAME, "form_LoanCarryover:tcAdd_CButton", validateInput(strHashValue), "Add", currentScreen);
							    waitForPageLoad(MAX_TIMEOUT);
								break;
							case "default1":
								ReportGenerator.generateTestStep(false, currentScreen, "Field Navigation", strHashKey + " field not available in the current method.", false);
								break;
						
							} //end of switch
							if(!blnStatus) break;
						} //end of while
					}
					else {
						ReportGenerator.generateTestStep(false, currentScreen, "Switch to Frame", "Failed to switch frames " + strFrames.replaceAll(GlobalData.STRING_SEPARATOR, " > "), false);
						blnStatus = false;
					}
					objEnum = null;
				//}
					
			} catch(Exception objExp) {
				ReportGenerator.generateTestStep(false, currentScreen, "Exception occured", "Exception is - " + objExp.getMessage(), false);
				blnStatus = false;
			}
			return blnStatus;
			
		}
		
		private static boolean PremiumValue(OrderedHashtable objTestData) {
			boolean blnStatus = false;
			
			String strHashKey = "", strHashValue = "";
			try {
				String strFrames =  "mainContentFrame" + GlobalData.STRING_SEPARATOR + "contentRightFrame"+ GlobalData.STRING_SEPARATOR +"file";
				Enumeration objEnum = objTestData.enumerateKeys();
				//if(waitForPageLoad(MAX_MILSEC_TIMEOUT)) {
					if(switchToFrame(strFrames, false) && waitForPageLoad(MAX_TIMEOUT)) {
						while(objEnum.hasMoreElements()) {
							//blnStatus = false;
							strHashKey = objEnum.nextElement().toString();
							strHashValue = objTestData.get(strHashKey).toString();
							
							switch(strHashKey) {  
							//
							case "PREMIUM_VALUE":
							
								Premium_Value = gobjWebDriver.findElement(By.xpath("//*[contains(@id,'pgPremium')]/..//span[@class='formDisplayText']")).getText().trim();
								ReportGenerator.generateTestStep(true, currentScreen, "Get Premium", "Premium value " + Premium_Value, true);
								
								blnStatus=true;
								break;
							case "REQ_FORM":
								
								Select sel = new Select(gobjWebDriver.findElement(By.id("form_updateRequirement:formNumber")));
								Req_Form = sel.getFirstSelectedOption().getText();
								/*Premium_Value = gobjWebDriver.findElement(By.xpath("//*[contains(@id,'pgPremium')]/..//span[@class='formDisplayText']")).getText().trim();
								ReportGenerator.generateTestStep(true, currentScreen, "Get Premium", "Premium value " + Premium_Value, true);*/
								
								blnStatus=true;
								break;
							case "REGISTER_DATE":
								String Register_date = gobjWebDriver.findElement(By.id("form_ContractStatus:pgEffDate")).getText().trim();
								//	String Register_date = gobjWebDriver.findElement(By.xpath("//*[contains(@id,'form_ContractStatus:pgEffDate')]/..//span[@class='formDisplayDate']")).getText().trim();
									if(strHashValue.contains("GET_REG_DATE")) {
										REG_DATE = Register_date.split(":")[1];
										ReportGenerator.generateTestStep(true, currentScreen, "Get Register Date", "Register is " + Register_date, true);
										blnStatus=true;
									}
									else {
										String strExpVal = validateInput(strHashValue);
										
										if(Register_date.contains(strExpVal)) {
											ReportGenerator.generateTestStep(true, currentScreen, "Verify Register Date", "Register Date mached. Expected is " + strExpVal, true);
											blnStatus=true;
										}
										else {
											ReportGenerator.generateTestStep(false, currentScreen, "Verify Register Date", "Register Date not mached. Actual is " + Register_date + ". Expected is " + strExpVal, true);
										}
									}
									break;
							case "default1":
								ReportGenerator.generateTestStep(false, currentScreen, "Field Navigation", strHashKey + " field not available in the current method.", false);
								break;
						
							} //end of switch
							if(!blnStatus) break;
						} //end of while
					}
					else {
						ReportGenerator.generateTestStep(false, currentScreen, "Switch to Frame", "Failed to switch frames " + strFrames.replaceAll(GlobalData.STRING_SEPARATOR, " > "), false);
						blnStatus = false;
					}
					objEnum = null;
				//}
					
			} catch(Exception objExp) {
				ReportGenerator.generateTestStep(false, currentScreen, "Exception occured", "Exception is - " + objExp.getMessage(), false);
				blnStatus = false;
			}
			return blnStatus;
			
		}
		
		private static boolean Replacement(OrderedHashtable objTestData) {
			boolean blnStatus = false;
			String strHashKey = "", strHashValue = "";
			try {
				String strFrames =  "mainContentFrame" + GlobalData.STRING_SEPARATOR + "contentRightFrame"+ GlobalData.STRING_SEPARATOR +"file";
				Enumeration objEnum = objTestData.enumerateKeys();
				//if(waitForPageLoad(MAX_MILSEC_TIMEOUT)) {
					if(switchToFrame(strFrames, false) && waitForPageLoad(MAX_TIMEOUT)) {
						while(objEnum.hasMoreElements()) {
							//blnStatus = false;
							strHashKey = objEnum.nextElement().toString();
							strHashValue = objTestData.get(strHashKey).toString();
							
							waitForPageLoad(MAX_TIMEOUT);
						
							switch(strHashKey) {  
							
							
							case "SELECT_COMPANY":	
								blnStatus = selectWebtableRow(IdentifyBy.ID, "form_replacementview:nbaReplacementsTable:replacementsTable", validateInput(strHashValue), "Company", currentScreen);
								//blnStatus = selectWebtableRow(IdentifyBy.ID, "form_replacementview:nbaReplacementsTable:replacementsTable", "", "Company", currentScreen);
								break;
							
							case"CREATE":
							    blnStatus = setValue(WebControl.BUTTON, IdentifyBy.NAME, "form_replacementview:nbaReplacementsTable:btnRepCreate", validateInput(strHashValue), "Create", currentScreen);
							   
								break;
							case"VIEW_OR_UPDATE":
								
							    blnStatus = setValue(WebControl.BUTTON, IdentifyBy.NAME, "form_replacementview:nbaReplacementsTable:btnRepView", validateInput(strHashValue), "View", currentScreen);
							   
								break;
							case"LOAN_CARRY":
								scrollDown();
							    blnStatus = setValue(WebControl.BUTTON, IdentifyBy.ID, "form_updateReplacement:tabReplacementForm:businessInfo_CButton", validateInput(strHashValue), "Loan_Carry", currentScreen);
							   
								break;
							
							case"ADD":
								
								WebElement element = gobjWebDriver.findElement(By.name("form_updateReplacement:_id11"));
								JavascriptExecutor executor = (JavascriptExecutor)gobjWebDriver;
								executor.executeScript("arguments[0].click();", element);
								blnStatus=true;
								ReportGenerator.generateTestStep(true, currentScreen, "Click ADD", "Successfully clicked", true);
								break;
							
							case"COMMIT":  
								System.out.println("Ekkadeake pothavu chinavada");
								
								List<WebElement>ts=gobjWebDriver.findElements(By.name("form_replacementview:btnCommit"));
								System.out.println("Yes...where is the matter "+ts.size());
							    blnStatus = setValue(WebControl.BUTTON, IdentifyBy.ID, "form_replacementview:btnCommit", validateInput(strHashValue), "Commit", currentScreen);
							
								break;
							case "default1":
								ReportGenerator.generateTestStep(false, currentScreen, "Field Navigation", strHashKey + " field not available in the current method.", false);
								break;
								
							} //end of switch
							if(!blnStatus) break;
						} //end of while
					}
					else {
						ReportGenerator.generateTestStep(false, currentScreen, "Switch to Frame", "Failed to switch frames " + strFrames.replaceAll(GlobalData.STRING_SEPARATOR, " > "), false);
						blnStatus = false;
					}
					objEnum = null;
				//}
					
			} catch(Exception objExp) {
				ReportGenerator.generateTestStep(false, currentScreen, "Exception occured", "Exception is - " + objExp.getMessage(), false);
				blnStatus = false;
			}
			return blnStatus;
			
		}
		
		private static boolean OverrideAutoClosure(OrderedHashtable objTestData) {
			boolean blnStatus = false;
			String strHashKey = "", strHashValue = "";
			try {
				String strFrames = "FWin0" + GlobalData.STRING_SEPARATOR + "Content0";
				Enumeration objEnum = objTestData.enumerateKeys();
				if(switchToFrame(strFrames, false) && waitForPageLoad(MAX_TIMEOUT)) {
					
					while(objEnum.hasMoreElements()) {
						//blnStatus = false;
						strHashKey = objEnum.nextElement().toString();
						strHashValue = objTestData.get(strHashKey).toString();

						switch(strHashKey) {
						
						case"PENDING_CLOSURE_DATE":
							blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_overrideAutoClosure:closureDate_EF", validateInput(strHashValue), "PENDING_CLOSURE_DATE:", currentScreen);
							break;
						
						case"COMMIT":
							blnStatus = setValue(WebControl.BUTTON, IdentifyBy.NAME, "form_overrideAutoClosure:overrideCommit_CButton", validateInput(strHashValue), "Commit", currentScreen);
							waitForPageClose(MAX_TIMEOUT);
							strFrames = "mainContentFrame" + GlobalData.STRING_SEPARATOR + "contentLeftFrame" + GlobalData.STRING_SEPARATOR + "file"  + GlobalData.STRING_SEPARATOR + "file"  ;
							if(switchToFrame(strFrames, false)) waitForPageLoad(MAX_TIMEOUT);
							break;
						case "default1":
							ReportGenerator.generateTestStep(false, currentScreen, "Field Navigation", strHashKey + " field not available in the current method.", false);
							break;
											
						} //end of switch
						if(!blnStatus) break;
					} //end of while
				}
				else {
					ReportGenerator.generateTestStep(false, currentScreen, "Switch to Frame", "Failed to switch frames " + strFrames.replaceAll(GlobalData.STRING_SEPARATOR, " > "), false);
					blnStatus = false;
				}
				objEnum = null;
					
			} catch(Exception objExp) {
				ReportGenerator.generateTestStep(false, currentScreen, "Exception occured", "Exception is - " + objExp.getMessage(), false);
				blnStatus = false;
			}
			return blnStatus;
		}
		
		private static boolean RequiremtnSelection(OrderedHashtable objTestData) {
			boolean blnStatus = false;
			String strHashKey = "", strHashValue = "";
			JavascriptExecutor executor = (JavascriptExecutor)gobjWebDriver;
			try {
				String strFrames = "mainContentFrame" + GlobalData.STRING_SEPARATOR + "contentRightFrame" + GlobalData.STRING_SEPARATOR + "file";
				Enumeration objEnum = objTestData.enumerateKeys();
				
					if(switchToFrame(strFrames, false) && waitForPageLoad(MAX_TIMEOUT)) {
						while(objEnum.hasMoreElements()) {
							//blnStatus = false;
							strHashKey = objEnum.nextElement().toString();
							strHashValue = objTestData.get(strHashKey).toString();
							
							switch(strHashKey) {
							
							
							 	case"REQUIRMENT_SELECTION":
							 		waitForPageLoad(MAX_TIMEOUT);
									blnStatus = SelectRequirement(IdentifyBy.ID, "form_reqimpoverview:reqOverviewTbl:requirementsTable", strHashValue);
									
									break;
							 	case"NO_REQUIRMENT_SELECTION":
							 		waitForPageLoad(MAX_TIMEOUT);
									blnStatus = SelectRequirement(IdentifyBy.ID, "form_reqimpoverview:reqOverviewTbl:requirementsTable", strHashValue);
									if(blnStatus) 
									{
										blnStatus = false;
										ReportGenerator.generateTestStep(true, currentScreen, "Requirement", " Available", true);
									}
									else
									{
										blnStatus=true;
										ReportGenerator.generateTestStep(true, currentScreen, "Requirement", " Not Available", true);
									}
									break;
								case"VIEW":
								
									blnStatus = setValue(WebControl.BUTTON, IdentifyBy.NAME, "form_reqimpoverview:btnReqView", validateInput(strHashValue), "VIEW", currentScreen);
									break;
								case "PARAMED_DATE":
									blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_updateRequirement:paramedSignDate", validateInput(strHashValue), "Paramed Date", currentScreen);
									break;
								case"ACTION_SATISFY_WAIVE":
									
									if(!blnStatus){
										WebElement objElement3 = getWebElement(IdentifyBy.NAME, "form_updateRequirement:_id88");
									if(!objElement3.isEnabled()) blnStatus = true;
									}
									else{
									blnStatus = setValue(WebControl.RADIOBOX, IdentifyBy.NAME, "form_updateRequirement:_id88", getAppRadioValues(strHashKey, strHashValue), "Satisfy/Waive", currentScreen);
									}
									
									
										break;
										
										
									case"MESSAGE":
										blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_updateRequirement:_id91", validateInput(strHashValue), "MESSAGE", currentScreen);
										break;
									case"SEE_UNDERWRITER_NOTES":
										if(!blnStatus){
											WebElement objElement = getWebElement(IdentifyBy.NAME, "form_updateRequirement:_id95");
											if(!objElement.isSelected()) objElement.click();
											blnStatus=true;
										}
										else{
										WebElement element1 = gobjWebDriver.findElement(By.name("form_updateRequirement:_id95"));
										//
										executor.executeScript("arguments[0].click();", element1);
										blnStatus=true;
										
										ReportGenerator.generateTestStep(true, currentScreen, "See Underwriter Notes", "Successfully clicked", true);
										}
										// blnStatus = setValue(WebControl.CHECKBOX, IdentifyBy.NAME, "form_updateRequirement:_id92", validateInput(strHashValue), " See Underwriter Notes", currentScreen);
										break;
										
									case"UPDATE":
										
										if(!blnStatus){
											WebElement objElement = getWebElement(IdentifyBy.NAME, "form_updateRequirement:_id108");
											objElement.sendKeys(Keys.PAGE_DOWN);
											objElement.click();
											blnStatus=true;
										}
										else{
										WebElement element = gobjWebDriver.findElement(By.name("form_updateRequirement:_id110"));
										//JavascriptExecutor executor = (JavascriptExecutor)gobjWebDriver;
										executor.executeScript("arguments[0].click();", element);
										blnStatus=true;
										ReportGenerator.generateTestStep(true, currentScreen, "Update", "Successfully clicked", true);
										
										waitForPageLoad(MAX_TIMEOUT);
										List<WebElement> objEle = gobjWebDriver.findElements(By.name("form_updateRequirement:_id108"));
										if(objEle.size()>0) {
											if(objEle.get(0).isDisplayed()) {
												executor.executeScript("arguments[0].click();", objEle.get(0));
												Thread.sleep(1000);
												waitForPageLoad(MAX_TIMEOUT);
											}
										}
										}
										//blnStatus = setValue(WebControl.BUTTON, IdentifyBy.NAME, "form_updateRequirement:_id105", validateInput(strHashValue), "Update", currentScreen);
										break;
									case"VERIFY_MESSAGE":
										String strMessage = "Paramed/Medical Signed Date cannot be greater than current date.";
								
										strFrames = "FWin0" + GlobalData.STRING_SEPARATOR + "Content0" ;
										blnStatus = false;
										
										if(switchToFrame(strFrames, false)) 
										{
											
											String Sucs_Msg=gobjWebDriver.findElement(By.id("errors")).getText().trim();
											System.out.println(Sucs_Msg);
											
											if(strMessage.equalsIgnoreCase(Sucs_Msg)) {
												ReportGenerator.generateTestStep(true, currentScreen, "Medical Date Error",Sucs_Msg,true );
												blnStatus = true;
												
											}else 
											{
												ReportGenerator.generateTestStep(false, currentScreen, "Verify Medical Date Error message", "Final Disposition Successful Message NOT Displayed :- Message Displayed Is :: "+Sucs_Msg,true );
												
											}
											gobjWebDriver.findElement(By.id("ok")).click();
											waitForPageClose(MIN_TIMEOUT);
											
										}
										break;
									case"VENDOR_TYPE":
										blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_updateRequirement:vendor", validateInput(strHashValue), "Vendor type", currentScreen);
											break;
									case"CANCEL":
										  WebElement element = gobjWebDriver.findElement(By.name("form_updateRequirement:_id105"));
										//JavascriptExecutor executor = (JavascriptExecutor)gobjWebDriver;
										executor.executeScript("arguments[0].click();", element);
										blnStatus=true;
										ReportGenerator.generateTestStep(true, currentScreen, "CANCEL", "Successfully clicked", true);
										//blnStatus = setValue(WebControl.BUTTON, IdentifyBy.NAME, "form_updateRequirement:_id105", validateInput(strHashValue), "Update", currentScreen);
										break;
									case"FOLLOWUP_FREQUENCY":
										blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_updateRequirement:followUpFrequency", validateInput(strHashValue), "Follow up frequency", currentScreen);
										break;	
									case"INSURED_DETAILS":
										blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_reqimpoverview:tabHeader:_id26", validateInput(strHashValue), "Vendor type", currentScreen);
											break;
									case "default1":
										ReportGenerator.generateTestStep(false, currentScreen, "Field Navigation", strHashKey + " field not available in the current method.", false);
										break;
										
									
														
							} //end of switch
							if(!blnStatus) break;
						} //end of while
					}
					else {
						ReportGenerator.generateTestStep(false, currentScreen, "Switch to Frame", "Failed to switch frames " + strFrames.replaceAll(GlobalData.STRING_SEPARATOR, " > "), false);
						blnStatus = false;
					}
					objEnum = null;
				//}
					
			} catch(Exception objExp) {
				ReportGenerator.generateTestStep(false, currentScreen, "Exception occured", "Exception is - " + objExp.getMessage(), false);
				blnStatus = false;
			}
			return blnStatus;
		}
		
		private static boolean SelectRequirement(IdentifyBy by, String property, String value) {
			boolean blnStatus = false;
		
			List<WebElement> objMessage = getWebElements(by, property);//"form_reinsuranceCreateRequest:reinsCreateReinsuranceCompanyTable");
		    if(objMessage.size()>0) {
				List<WebElement> objRows = getWebElements(objMessage.get(0), IdentifyBy.TAGNAME, "tr");
				
			    for(int intCounter=0;intCounter<objRows.size();intCounter++) {
			    	if(intCounter>12 && objRows.size()>12) {
						objMessage.get(0).sendKeys(Keys.PAGE_DOWN);
						try {
							Thread.sleep(1000);
						} catch (InterruptedException e) {
							
							e.printStackTrace();
						}
					}
					
			    	List<WebElement> objCols = getWebElements(objRows.get(intCounter), IdentifyBy.TAGNAME, "td");
			
			    	if(objCols.size()>0) 
					{
						List<WebElement> objCheckbox = objCols.get(1).findElements(By.tagName("a"));
						
						if(objCheckbox.size()>0) 
						{
							System.out.println(objCheckbox.get(0).getText());
							
						String TagText=objCheckbox.get(0).getText();
						
							
							if(TagText.equals(value) )
							{
								
								objCheckbox.get(0).click();
								waitForPageLoad(MAX_TIMEOUT);
								blnStatus = true;
								break;
							}
							
							
								
						}
					}
					if(blnStatus) break;
					
			    }
			}
		    if(blnStatus) 
			{    
				ReportGenerator.generateTestStep(true, currentScreen,  value , "selected succesfully "  , true);
				
				
			}
			else {
				ReportGenerator.generateTestStep(false, currentScreen, value ,"unable to select ", false);
				
			}
			return blnStatus;
			
		}
		
		private static boolean ContractMessagesVerify(OrderedHashtable objTestData) {
			boolean blnStatus = false;
			String strHashKey = "", strHashValue = "";
			try {
				String strFrames = "mainContentFrame" + GlobalData.STRING_SEPARATOR + "contentRightFrame" + GlobalData.STRING_SEPARATOR + "file";
				Enumeration objEnum = objTestData.enumerateKeys();
				if(switchToFrame(strFrames, false) && waitForPageLoad(MAX_TIMEOUT)) {
					
					while(objEnum.hasMoreElements()) {
						//blnStatus = false;
						strHashKey = objEnum.nextElement().toString();
						strHashValue = objTestData.get(strHashKey).toString();

						switch(strHashKey) {
			
						
						case "VERIFY_MESSAGE":
							blnStatus = VerifyContractMessages(strHashValue);
							if(blnStatus) {
								ReportGenerator.generateTestStep(true, currentScreen, "Verify CV Message", "Message dispalyed is: " + strHashValue, true);
							
								
							}
							else {
								ReportGenerator.generateTestStep(false, currentScreen, "Verify CV Message", "CV message '" + strHashValue + "' Not displayed ", true);
								
							}
							break;
						case "VERIFY_NO_MESSAGE":
							blnStatus = VerifyContractMessages(strHashValue);
							if(blnStatus) {
								ReportGenerator.generateTestStep(false, currentScreen, "Verify CV Message", "CV Message '" + strHashValue + "' displayed.", true);					
								
							}
							else {
								
								ReportGenerator.generateTestStep(true, currentScreen, "Verify CV Message", strHashValue + " CV messages Not displayed ", true);
								blnStatus = true;
							}
							break;
						case "default1":
							ReportGenerator.generateTestStep(false, currentScreen, "Field Navigation", strHashKey + " field not available in the current method.", false);
							break;
					
						} //end of switch
						if(!blnStatus) break;
					} //end of while
				}
				else {
					ReportGenerator.generateTestStep(false, currentScreen, "Switch to Frame", "Failed to switch frames " + strFrames.replaceAll(GlobalData.STRING_SEPARATOR, " > "), false);
					blnStatus = false;
				}
				objEnum = null;
					
			} catch(Exception objExp) {
				ReportGenerator.generateTestStep(false, currentScreen, "Exception occured", "Exception is - " + objExp.getMessage(), false);
				blnStatus = false;
			}
			return blnStatus;
		}
		
		private static boolean UWComments(OrderedHashtable objTestData) {
			boolean blnStatus = false;
			@SuppressWarnings("unused")
			String strHashKey = "", strHashValue = "";
			try {
				String strFrames = "mainContentFrame" + GlobalData.STRING_SEPARATOR + "contentRightFrame" + GlobalData.STRING_SEPARATOR + "file";
				Enumeration objEnum = objTestData.enumerateKeys();
				if(switchToFrame(strFrames, false) && waitForPageLoad(MAX_TIMEOUT)) {
					
					while(objEnum.hasMoreElements()) {
						//blnStatus = false;
						strHashKey = objEnum.nextElement().toString();
						strHashValue = objTestData.get(strHashKey).toString();

						switch(strHashKey) {
			
						
						case "VERIFY_COMMENTS_TIMESTAMP":
							blnStatus = verifyTimeStamp();
							break;
						case "default1":
							ReportGenerator.generateTestStep(false, currentScreen, "Field Navigation", strHashKey + " field not available in the current method.", false);
							break;
					
						} //end of switch
						if(!blnStatus) break;
					} //end of while
				}
				else {
					ReportGenerator.generateTestStep(false, currentScreen, "Switch to Frame", "Failed to switch frames " + strFrames.replaceAll(GlobalData.STRING_SEPARATOR, " > "), false);
					blnStatus = false;
				}
				objEnum = null;
					
			} catch(Exception objExp) {
				ReportGenerator.generateTestStep(false, currentScreen, "Exception occured", "Exception is - " + objExp.getMessage(), false);
				blnStatus = false;
			}
			return blnStatus;
			
		}
		
		private static boolean CompanionCase(OrderedHashtable objTestData) {
			boolean blnStatus = false;
			String strHashKey = "", strHashValue = "";
			try {
				String strFrames =  "mainContentFrame" + GlobalData.STRING_SEPARATOR + "contentRightFrame"+ GlobalData.STRING_SEPARATOR +"file";
				Enumeration objEnum = objTestData.enumerateKeys();
				//if(waitForPageLoad(MAX_MILSEC_TIMEOUT)) {
					if(switchToFrame(strFrames, false) && waitForPageLoad(MAX_TIMEOUT)) {
						while(objEnum.hasMoreElements()) {
							//blnStatus = false;
							strHashKey = objEnum.nextElement().toString();
							strHashValue = objTestData.get(strHashKey).toString();
							
							switch(strHashKey) {
							
							case"BUSINESS_AREA":
								blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_companionCaseAction:ccCriteria:_id5", validateInput(strHashValue), "BUSINESS_AREA", currentScreen);
								break;
							case"LAST_NAME":
								blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_companionCaseAction:ccCriteria:_id27", validateInput(strHashValue), "LAST_NAME", currentScreen);
								break;
							case"FIRST_NAME":
								blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_companionCaseAction:ccCriteria:_id29", validateInput(strHashValue), "FIRST_NAME", currentScreen);
								break;
							case"GOVERNMENT_ID":
								blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_companionCaseAction:ccCriteria:_id24", validateInput(strHashValue), "GOVERNMENT_ID", currentScreen);
									break;
							case"SEARCH":
							    blnStatus = setValue(WebControl.BUTTON, IdentifyBy.NAME, "form_companionCaseAction:btnSearch", validateInput(strHashValue), "Search", currentScreen);
								break;
							case"SELECT_ROW":
								waitForPageLoad(MAX_TIMEOUT);
								blnStatus = selectWebtableRow(IdentifyBy.ID, "form_companionCaseAction:ccResults:resultTable", validateInput(strHashValue), "Result selection", currentScreen);
								//blnStatus = setValue(WebControl.BUTTON, IdentifyBy.NAME, "form_companionCaseAction:ccResults:resultTable:1:resultCol2", validateInput(strHashValue), "Result selection", currentScreen);
								
								//blnStatus = selectWebtableRow(IdentifyBy.ID, "form_companionCaseAction:ccResults:resultTable", validateInput(strHashValue), "Result selection", currentScreen);
								
								//blnStatus = selectWebtableRow(IdentifyBy.ID, "form_companionCaseAction:ccResults:resultTable", "", "Result selection", currentScreen);
								
								break;
							case"LINK":
							    blnStatus = setValue(WebControl.BUTTON, IdentifyBy.NAME, "form_companionCaseAction:ccResults:btnLink", validateInput(strHashValue), "link", currentScreen);
								break;
							case"OVERRIDE_LINK1":
								blnStatus = setValue(WebControl.CHECKBOX, IdentifyBy.NAME, "form_companionCaseAction:ccLinked:linkedTable:0:linkedCol6", validateInput(strHashValue), "OVERRIDE_LINK1", currentScreen);
								break;
							case"OVERRIDE_LINK2":
								blnStatus = setValue(WebControl.CHECKBOX, IdentifyBy.NAME, "form_companionCaseAction:ccLinked:linkedTable:1:linkedCol6", validateInput(strHashValue), "OVERRIDE_LINK2", currentScreen);
								break;
							case"COMMIT":
								WebElement element = gobjWebDriver.findElement(By.name("form_companionCaseAction:btnCommitWithDst"));
								JavascriptExecutor executor = (JavascriptExecutor)gobjWebDriver;
								executor.executeScript("arguments[0].click();", element);
								ReportGenerator.generateTestStep(true, currentScreen, "Click COMMIT", "Successfully clicked", true);
								//blnStatus = setValue(WebControl.BUTTON, IdentifyBy.NAME, "form_companionCaseAction:btnCommitWithDst", validateInput(strHashValue), "COMMIT", currentScreen);
								break;
							case "default1":
								ReportGenerator.generateTestStep(false, currentScreen, "Field Navigation", strHashKey + " field not available in the current method.", false);
								break;
														
							} //end of switch
							if(!blnStatus) break;
						} //end of while
					}
					else {
						ReportGenerator.generateTestStep(false, currentScreen, "Switch to Frame", "Failed to switch frames " + strFrames.replaceAll(GlobalData.STRING_SEPARATOR, " > "), false);
						blnStatus = false;
					}
					objEnum = null;
				//}
					
			} catch(Exception objExp) {
				ReportGenerator.generateTestStep(false, currentScreen, "Exception occured", "Exception is - " + objExp.getMessage(), false);
				blnStatus = false;
			}
			return blnStatus;
		}
		
		//Function For ProductsCLR flow
		private static boolean ProductsCLR(OrderedHashtable objTestData) {
			boolean blnStatus = false;
			String strHashKey = "", strHashValue = "";
			try {
				String strFrames = "FWin0" + GlobalData.STRING_SEPARATOR + "Content0";
				Enumeration objEnum = objTestData.enumerateKeys();
				if(switchToFrame(strFrames, false) && waitForPageLoad(MAX_TIMEOUT)) {
					
					while(objEnum.hasMoreElements()) {
						//blnStatus = false;
						strHashKey = objEnum.nextElement().toString();
						strHashValue = objTestData.get(strHashKey).toString();

						switch(strHashKey) {
						
																
						case"CLR_ENTITY_TYPE":
							blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_UlCharitableBeneficiary:entity_Sm", validateInput(strHashValue), "Entity TYPE:", currentScreen);
							
							break;
						case"CLR_ENTITY":
							blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_UlCharitableBeneficiary:Entity_IT", validateInput(strHashValue), "Entity:", currentScreen);
							break;
						case"PO_BOX_ADDRESS":
							blnStatus = setValue(WebControl.CHECKBOX, IdentifyBy.NAME, "form_UlCharitableBeneficiary:poBox_CB", validateInput(strHashValue), "P.O. Box Address", currentScreen);
							break;
						case"ADDRESS_TYPE":
							blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_UlCharitableBeneficiary:addressType_DD", validateInput(strHashValue), "Address Type:", currentScreen);
							break;
						case"STREET_NO":
							blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_UlCharitableBeneficiary:street_EF", validateInput(strHashValue), "No. & Street:", currentScreen);
							break;
						case"BUILDING_APT_SUITE":
							blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_UlCharitableBeneficiary:BldAptSuite_EF", validateInput(strHashValue), "Bldg/Apt/Suite:", currentScreen);
							
							break;
						case"CITY":
							blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_UlCharitableBeneficiary:City_EF", validateInput(strHashValue), "City:", currentScreen);
							break;
						case"COUNTY":
							blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_UlCharitableBeneficiary:County_EF", validateInput(strHashValue), "County:", currentScreen);
							break;
						case"STATE":
							blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_UlCharitableBeneficiary:State_DD", validateInput(strHashValue), "State:", currentScreen);
							break;
						case"ZIP":
							blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_UlCharitableBeneficiary:Zip_EF", validateInput(strHashValue), "Zip:", currentScreen);
							break;
						case"COUNTRY":
							blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_UlCharitableBeneficiary:Country_DD", validateInput(strHashValue), "Country:", currentScreen);
							
							break;
						case"TAX_ID":
							blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_UlCharitableBeneficiary:taxid_EF", validateInput(strHashValue), "501(c) Tax Id No:", currentScreen);
							break;
						case"SHARE":
							blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_UlCharitableBeneficiary:share_EF", validateInput(strHashValue), "% Share:", currentScreen);
							break;
						case"ADD":
							blnStatus = setValue(WebControl.BUTTON, IdentifyBy.NAME, "form_UlCharitableBeneficiary:charitableAdd_CButton", validateInput(strHashValue), "ADD", currentScreen);
							break;
						case"CLR_ADD":
							blnStatus = setValue(WebControl.BUTTON, IdentifyBy.NAME, "form_UlCharitableBeneficiary:drAdd_CButton", validateInput(strHashValue), "ADD", currentScreen);
							break;
						case "default1":
							ReportGenerator.generateTestStep(false, currentScreen, "Field Navigation", strHashKey + " field not available in the current method.", false);
							break;
						} //end of switch
						if(!blnStatus) break;
					} //end of while
				}
				else {
					ReportGenerator.generateTestStep(false, currentScreen, "Switch to Frame", "Failed to switch frames " + strFrames.replaceAll(GlobalData.STRING_SEPARATOR, " > "), false);
					blnStatus = false;
				}
				objEnum = null;
					
			} catch(Exception objExp) {
				ReportGenerator.generateTestStep(false, currentScreen, "Exception occured", "Exception is - " + objExp.getMessage(), false);
				blnStatus = false;
			}
			return blnStatus;
		}
		
		private static boolean NigoDecision(OrderedHashtable objTestData) {
			boolean blnStatus = false;
			String strHashKey = "", strHashValue = "";
			try {
				String strFrames = "FWin0" + GlobalData.STRING_SEPARATOR + "Content0";
				Enumeration objEnum = objTestData.enumerateKeys();
				if(switchToFrame(strFrames, false) && waitForPageLoad(MAX_TIMEOUT)) {
					
					while(objEnum.hasMoreElements()) {
						//blnStatus = false;
						strHashKey = objEnum.nextElement().toString();
						strHashValue = objTestData.get(strHashKey).toString();

						switch(strHashKey) {
						
																
						case"REASON_CATEGORY":
							blnStatus = setValue(WebControl.SELECT, IdentifyBy.ID, "nigo:reasonCategorySelect", validateInput(strHashValue), "Reason Category", currentScreen);
							
							break;
						case"REASON":
							blnStatus = setValue(WebControl.SELECT, IdentifyBy.ID, "nigo:reasonSelect", validateInput(strHashValue), "Reason", currentScreen);
							break;
						case"OTHER_REASON":
							blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.ID, "nigo:otherreasonInput", validateInput(strHashValue), "Other Reason", currentScreen);
							break;
						case"COMMIT":
							blnStatus = setValue(WebControl.BUTTON, IdentifyBy.ID, "nigo:overrideCommit_CButton", validateInput(strHashValue), "Commit", currentScreen);
							break;
						case "default1":
							ReportGenerator.generateTestStep(false, currentScreen, "Field Navigation", strHashKey + " field not available in the current method.", false);
							break;
						} //end of switch
						if(!blnStatus) break;
					} //end of while
				}
				else {
					ReportGenerator.generateTestStep(false, currentScreen, "Switch to Frame", "Failed to switch frames " + strFrames.replaceAll(GlobalData.STRING_SEPARATOR, " > "), false);
					blnStatus = false;
				}
				objEnum = null;
					
			} catch(Exception objExp) {
				ReportGenerator.generateTestStep(false, currentScreen, "Exception occured", "Exception is - " + objExp.getMessage(), false);
				blnStatus = false;
			}
			return blnStatus;
		}
		
		private static boolean ReopenCase(OrderedHashtable objTestData) {
			boolean blnStatus = false;
			String strHashKey = "", strHashValue = "";
			try {
				String strFrames = "FWin0" + GlobalData.STRING_SEPARATOR + "Content0";
				Enumeration objEnum = objTestData.enumerateKeys();
				if(switchToFrame(strFrames, false) && waitForPageLoad(MAX_TIMEOUT)) {
					
					while(objEnum.hasMoreElements()) {
						//blnStatus = false;
						strHashKey = objEnum.nextElement().toString();
						strHashValue = objTestData.get(strHashKey).toString();

						switch(strHashKey) {
						
																
						
						case"YES":
							blnStatus = setValue(WebControl.BUTTON, IdentifyBy.ID, "confirmationForm:ok", validateInput(strHashValue), "YES", currentScreen);
							break;
						case "default1":
							ReportGenerator.generateTestStep(false, currentScreen, "Field Navigation", strHashKey + " field not available in the current method.", false);
							break;
						} //end of switch
						if(!blnStatus) break;
					} //end of while
				}
				else {
					ReportGenerator.generateTestStep(false, currentScreen, "Switch to Frame", "Failed to switch frames " + strFrames.replaceAll(GlobalData.STRING_SEPARATOR, " > "), false);
					blnStatus = false;
				}
				objEnum = null;
					
			} catch(Exception objExp) {
				ReportGenerator.generateTestStep(false, currentScreen, "Exception occured", "Exception is - " + objExp.getMessage(), false);
				blnStatus = false;
			}
			return blnStatus;
		}
		
		private static boolean CreateWork(OrderedHashtable objTestData) {
			boolean blnStatus = false;
			String strHashKey = "", strHashValue = "";
			try {
				String strFrames = "FWin0" + GlobalData.STRING_SEPARATOR + "Content0";
				Enumeration objEnum = objTestData.enumerateKeys();
				if(switchToFrame(strFrames, false) && waitForPageLoad(MAX_TIMEOUT)) {
					
					while(objEnum.hasMoreElements()) {
						//blnStatus = false;
						strHashKey = objEnum.nextElement().toString();
						strHashValue = objTestData.get(strHashKey).toString();

						switch(strHashKey) {
						
							case"BUSINESS_AREA":   
							blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_creatework:_id4", validateInput(strHashValue), "Business Area:", currentScreen);
					   
							break;
						case"WORK_TYPE":                           
							blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_creatework:_id8", validateInput(strHashValue), "Work Type:", currentScreen);
							break;
						case"INITIAL_STATUS":
							blnStatus = setValue(WebControl.SELECT,IdentifyBy.NAME, "form_creatework:_id12", validateInput(strHashValue), "Initial Status:", currentScreen);
							Thread.sleep(2000);
							blnStatus = setValue(WebControl.SELECT,IdentifyBy.NAME, "form_creatework:_id12", validateInput(strHashValue), "Initial Status:", currentScreen);
							break;
						case"WORK_GROUP":
							blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_creatework:_id16", validateInput(strHashValue), "Work Group", currentScreen);
							break;
						case"REASON":
							blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_creatework:reasonText", validateInput(strHashValue), "Reason:", currentScreen);
							
							break;
						case"COMMENTS":
							blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_creatework:commentsText", validateInput(strHashValue), "Comments:", currentScreen);
							break;
						case"PRIORITY":
							blnStatus = setValue(WebControl.SELECT,IdentifyBy.NAME, "form_creatework:_id27", validateInput(strHashValue), "Priority:", currentScreen);
							break;
						case"COMMIT":
							blnStatus = setValue(WebControl.BUTTON, IdentifyBy.NAME, "form_creatework:btnCommit", validateInput(strHashValue), "Commit", currentScreen);
							waitForPageClose(MAX_TIMEOUT);
							strFrames = "mainContentFrame" + GlobalData.STRING_SEPARATOR + "contentLeftFrame" + GlobalData.STRING_SEPARATOR + "file"  + GlobalData.STRING_SEPARATOR + "file"  ;
							if(switchToFrame(strFrames, false)) waitForPageLoad(MAX_TIMEOUT);
							break;
						case "default1":
							ReportGenerator.generateTestStep(false, currentScreen, "Field Navigation", strHashKey + " field not available in the current method.", false);
							break;
						
					
						} //end of switch
						if(!blnStatus) break;
					} //end of while
				}
				else {
					ReportGenerator.generateTestStep(false, currentScreen, "Switch to Frame", "Failed to switch frames " + strFrames.replaceAll(GlobalData.STRING_SEPARATOR, " > "), false);
					blnStatus = false;
				}
				objEnum = null;
					
			} catch(Exception objExp) {
				ReportGenerator.generateTestStep(false, currentScreen, "Exception occured", "Exception is - " + objExp.getMessage(), false);
				blnStatus = false;
			}
			return blnStatus;
		}
		
		private static boolean BGASelectProducerResults(OrderedHashtable objTestData) {
			boolean blnStatus = false;
			String strHashKey = "", strHashValue = "";
			try {
				String strFrames = "FWin0" + GlobalData.STRING_SEPARATOR + "Content0";
				Enumeration objEnum = objTestData.enumerateKeys();
				//if(waitForPageLoad(MAX_MILSEC_TIMEOUT)) {
					if(waitForPageLoad(MAX_TIMEOUT) && switchToFrame(strFrames, false)) {
						while(objEnum.hasMoreElements()) {
							//blnStatus = false;
							strHashKey = objEnum.nextElement().toString();
							strHashValue = objTestData.get(strHashKey).toString();
							
							switch(strHashKey) {
								case "SELECT_PRODUCER":
									blnStatus = setValue(WebControl.BUTTON, IdentifyBy.NAME, "form_BGACMDetails:bgaCMDetails_DataTable:0:bgaCMDetailsCol1_TA", validateInput(strHashValue), "Producer", currentScreen);
									break;
								case "ADD":
									blnStatus = setValue(WebControl.BUTTON, IdentifyBy.NAME, "form_BGACMDetails:drAdd", validateInput(strHashValue), "Add", currentScreen);
									break;
								case "default1":
									ReportGenerator.generateTestStep(false, currentScreen, "Field Navigation", strHashKey + " field not available in the current method.", false);
									break;
							} //end of switch
							if(!blnStatus) break;
						} //end of while
					}
					else {
						ReportGenerator.generateTestStep(false, currentScreen, "Switch to Frame", "Failed to switch frames " + strFrames.replaceAll(GlobalData.STRING_SEPARATOR, " > "), false);
						blnStatus = false;
					}
					objEnum = null;
				//}
					
			} catch(Exception objExp) {
				ReportGenerator.generateTestStep(false, currentScreen, "Exception occured", "Exception is - " + objExp.getMessage(), false);
				blnStatus = false;
			}
			return blnStatus;
		}
		
		private static boolean VerifyContractMessages(String value) {
			boolean blnStatus = false;
			
			String strMessage = "";
		
			try {
				String strFrames = "mainContentFrame" + GlobalData.STRING_SEPARATOR + "contentRightFrame" + GlobalData.STRING_SEPARATOR + "file";
				if(switchToFrame(strFrames, false) && waitForPageLoad(MAX_TIMEOUT)) {
					WebElement objMessage = getWebElement(IdentifyBy.ID, "form_contractmessageview:contractTable");
					if(objMessage!=null) {
						List<WebElement> objRows = getWebElements(objMessage, IdentifyBy.TAGNAME, "tr");
						
						for(int intCounter=0;intCounter<objRows.size();intCounter++) {
							List<WebElement> objCols = getWebElements(objRows.get(intCounter), IdentifyBy.TAGNAME, "td");
							if(objCols.size()>0) {
								
								strMessage = objCols.get(2).getText();
								if(strMessage.contains(value)) {
									blnStatus = true;
									break;
								}
							}
						}
						
					
					}
				}
				
				
				
					
			} catch(Exception objExp) {
				ReportGenerator.generateTestStep(false, currentScreen, "Exception occured", "Exception is - " + objExp.getMessage(), false);
				blnStatus = false;
			}
			return blnStatus;
		}
		
		private static boolean AddComments(OrderedHashtable objTestData) {
			boolean blnStatus = false;
			String strHashKey = "", strHashValue = "";
			try {
				String cHandle = gobjWebDriver.getWindowHandle();
				System.out.println("Parent window in Add Comment - " + cHandle);
				/*waitForWindowAndSwitch(cHandle, "Accelerator Desktop", false);*/
				
				String strFrames = "mainContentFrame"+ GlobalData.STRING_SEPARATOR + "file";
				String strNewFrames= "mainContentFrame";
				String strFrame1="FWin0" + GlobalData.STRING_SEPARATOR + "Content0";
				Enumeration objEnum = objTestData.enumerateKeys();
				
				if(waitForWindowAndSwitch(cHandle, strFrames)) {
					
					while(objEnum.hasMoreElements()) {
						strHashKey = objEnum.nextElement().toString();
						strHashValue = objTestData.get(strHashKey).toString();

						switch(strHashKey) {
						case "COMMENTS_INSTRUCTIONS":
							if(switchToFrame(strNewFrames, false)) {
							
							blnStatus = setValue(WebControl.BUTTON, IdentifyBy.ID, "TabText1", validateInput(strHashValue), "Comments_instructions", currentScreen);
							}
							switchToFrame(strFrames,false);
							break;
						case "COMMENTS_TYPE":
							blnStatus = setValue(WebControl.RADIOBOX, IdentifyBy.XPATH, "//input[contains(@name,'form_commentsInstructions:RB')]", getAppRadioValues(strHashKey, strHashValue), "Comments_Type", currentScreen);
							
							break;
						case "SECURE_NOTE_TYPE":											
							blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_commentsInstructions:_id6", strHashValue, "Secure_Note_Type", currentScreen);
							break;
						case "INITIAL_REVIEW":
							/*List<WebElement> obj= gobjWebDriver.findElements(By.name("form_commentsInstructions:_id3"));
							if(obj.size()>0) {
								if(!obj.get(0).isSelected()){
									try{
										obj.get(0).click();
									}catch(Exception obj1) {}
							
								}
							}
							blnStatus = true;*/
							blnStatus = setValue(WebControl.CHECKBOX, IdentifyBy.NAME, "form_commentsInstructions:_id8", validateInput(strHashValue), "Intial_Review", currentScreen);
							break;
						case "INSTRUCTION_TYPE":
							blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_commentsInstructions:RB2", validateInput(strHashValue), "Instruction_Type", currentScreen);
							break;
						case "COMMENTS_MESSAGE":									  
							blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_commentsInstructions:ITArea1", validateInput(strHashValue), "Comments_Message:", currentScreen);
							break;
						case "MESSAGE_TRAILER":
							blnStatus = setValue(WebControl.BUTTON, IdentifyBy.NAME, "TabText4", validateInput(strHashValue), "Message_Trailer", currentScreen);
							break;
						case "TRAILER_MSG":
							blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_MessageTrailerComments:_id1", validateInput(strHashValue), "Trailer_Msg:", currentScreen);
							break;
						case "FOLLOW_UP_PROACTIVE":
							blnStatus = setValue(WebControl.RADIOBOX, IdentifyBy.XPATH, "//input[contains(@name,'form_commentsInstructions:RB')]", getAppRadioValues(strHashKey, strHashValue), "Follow_Up_Proactive", currentScreen);
							
							break;
						case "FOLLOW_UP_METHOD":
							blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_commentsInstructions:flwUpMethod", validateInput(strHashValue), "Follow_Up_Method", currentScreen);
							break;
						case "NEXT_FOLLOW_UP":
							blnStatus = setValue(WebControl.RADIOBOX, IdentifyBy.XPATH, "//input[contains(@name,'form_commentsInstructions:RB5')]", getAppRadioValues(strHashKey, strHashValue), "Next_Follow_Up", currentScreen);
							
							break;
						case "NEXT_FOLLOW_UP_DAYS":
							blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_commentsInstructions:nextRcmFlwp", validateInput(strHashValue), "Next_Follow_Up_Days", currentScreen);
							break;
						case "NEXT_FOLLOW_UP_DATE":
							blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_commentsInstructions:datepicker", validateInput(strHashValue), "Next_Follow_Up_Date", currentScreen);
							break;
						case "ADD":
							cHandle = gobjWebDriver.getWindowHandle();
							blnStatus = setValue(WebControl.BUTTON, IdentifyBy.NAME, "form_commentsInstructions:cb4", validateInput(strHashValue), "Add", currentScreen);
							if (switchToFrame(strFrame1, true)){
								
								blnStatus = setValue(WebControl.BUTTON, IdentifyBy.NAME, "confirmationForm:cancel", validateInput(strHashValue), "Add", currentScreen);
								Thread.sleep(1000);
							}
							waitForPageClose(MAX_TIMEOUT);
							waitForWindowAndSwitch(cHandle, "mainContentFrame");
							
							break;
						} //end of switch
						if(!blnStatus) break;
					} //end of while
				}
				else {
					ReportGenerator.generateTestStep(false, currentScreen, "Switch to Frame", "Failed to switch frames " + strFrames.replaceAll(GlobalData.STRING_SEPARATOR, " > "), false);
					blnStatus = false;
				}
				objEnum = null;
					
			} catch(Exception objExp) {
				ReportGenerator.generateTestStep(false, currentScreen, "Exception occured", "Exception is - " + objExp.getMessage(), false);
				blnStatus = false;
			}
			return blnStatus;
		}
		
		private static boolean verifyTimeStamp() {
			boolean blnStatus = false;
			String strMessage="";
		
		
			try {
				
					WebElement objMessage = getWebElement(IdentifyBy.ID, "form_commentsOverview:commentsTable:commentsTable");
					if(objMessage!=null) {
						List<WebElement> objRows = getWebElements(objMessage, IdentifyBy.TAGNAME, "tr");
						
						for(int intCounter=0;intCounter<objRows.size();intCounter++) {
							List<WebElement> objCols = getWebElements(objRows.get(intCounter), IdentifyBy.TAGNAME, "td");
							if(objCols.size()>0) {
								strMessage = objCols.get(4).getText();
								if(DateFormats.isValidDate(strMessage)) {
									ReportGenerator.generateTestStep(true, currentScreen, "Verify TIME STAMP", "Date displayed in expected format. Displayed is " + strMessage , true);
									blnStatus = true;
								}
								else {
									ReportGenerator.generateTestStep(false, currentScreen, "Verify TIME STAMP", "Date NOT displayed in expected format. Displayed is " + strMessage, true);
									blnStatus = false;
								}
							}
						}
						
					
					
				}
				
					
			} catch(Exception objExp) {
				ReportGenerator.generateTestStep(false, currentScreen, "Exception occured", "Exception is - " + objExp.getMessage(), false);
				blnStatus = false;
			}
			return blnStatus;
		}
		
		private static boolean ImagesSummary(OrderedHashtable objTestData) {
			boolean blnStatus = false;
			String strHashKey = "", strHashValue = "";
			try {
				Enumeration objEnum = objTestData.enumerateKeys();
				
					
				while(objEnum.hasMoreElements()) {
					strHashKey = objEnum.nextElement().toString();
					strHashValue = objTestData.get(strHashKey).toString();

					switch(strHashKey) {
					
															
					case"FORM":
						blnStatus = Images(strHashValue);
						break;
					
					} //end of switch
					if(!blnStatus) break;
				} //end of while
				
				objEnum = null;
					
			} catch(Exception objExp) {
				ReportGenerator.generateTestStep(false, currentScreen, "Exception occured", "Exception is - " + objExp.getMessage(), false);
				blnStatus = false;
			}
			return blnStatus;
		}
		
		private static boolean Images(String message) {
			boolean blnStatus = false;
			String strMessage = "";
			
			
			
			try {
				String cHandle = gobjWebDriver.getWindowHandle();
				System.out.println("Parent window in Image Summary - " + cHandle);
				/*waitForWindowAndSwitch(cHandle, "Accelerator Desktop", false);*/
				
				String strFrames = "mainContentFrame";
				
				if(waitForWindowAndSwitch(cHandle, strFrames)) {
					
					Thread.sleep(200);
					
					gobjWebDriver.manage().window().maximize();
												
					List<WebElement> objMessage = gobjWebDriver.findElementsById("formImages:imagesTable:imagesData"); 
					//List<WebElement> objMessages = getWebElements(IdentifyBy.ID, "form_todo:tabHeader:toDoTable");
					if(objMessage!=null) {
						List<WebElement> objRows = getWebElements(objMessage.get(0), IdentifyBy.TAGNAME, "tr");
						
						for(int intCounter=0;intCounter<objRows.size();intCounter++) {
							gobjWebDriver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
							List<WebElement> objCols = getWebElements(objRows.get(intCounter), IdentifyBy.TAGNAME, "td");
							if(objCols.size()>0) {
								
								strMessage = objCols.get(2).getText(); 
								
								if(strMessage.contains(message)) {
									WebElement objInvalidate;
									try{
										objRows.get(intCounter).click();
										objInvalidate = getWebElement(IdentifyBy.ID, "formImages:btnInvalidateImages");
										objInvalidate.click();
									}
									catch(Exception obj){}
									
									String strNewFrames = "FWin0" + GlobalData.STRING_SEPARATOR + "Content0";
									if(switchToFrame(strNewFrames, false)) {
										try{
											objInvalidate = getWebElement(IdentifyBy.ID, "confirmationForm:ok");
											objInvalidate.click();
										}
										catch(Exception obj){}
										
										waitForPageClose(MAX_TIMEOUT);
										blnStatus = true;
										break;
									}
									//
									
								}
							}
						}
						gobjWebDriver.manage().timeouts().implicitlyWait(MIN_TIMEOUT, TimeUnit.SECONDS);
					}
					
					if(blnStatus) {
						ReportGenerator.generateTestStep(true, currentScreen, "Verify Images Summary", "Images Summary validated.", true);
					}
					else {
						ReportGenerator.generateTestStep(false, currentScreen, "Verify Images Summary", "Failed Images Summary validation.", true);
					}
					switchToFrame(strFrames, false);
					cHandle = gobjWebDriver.getWindowHandle();
					try{
						WebElement objCancel = getWebElement(IdentifyBy.ID, "formImages:btnCloseAll");
						objCancel.click();
					}
					catch(Exception obj){}
					
					waitForPageClose(MAX_TIMEOUT);
					
					waitForWindowAndSwitch(cHandle, strFrames);
				}
				else {
					ReportGenerator.generateTestStep(false, currentScreen, "Switch to Image Summary", "Failed to switch Image Summary", false);
					blnStatus = false;
				}
					
			} catch(Exception objExp) {
				ReportGenerator.generateTestStep(false, currentScreen, "Exception occured", "Exception is - " + objExp.getMessage(), false);
				blnStatus = false;
			}
			return blnStatus;
		}
		
		private static boolean TCONV1(OrderedHashtable objTestData) {
			boolean blnStatus = false;
			String strHashKey = "", strHashValue = "";
			String SSN_EIN_ITIN = "";
			
			try {
				
				String strFrames = "mainContentFrame" + GlobalData.STRING_SEPARATOR + "contentRightFrame" + GlobalData.STRING_SEPARATOR + "file"+ GlobalData.STRING_SEPARATOR + "file";;
				Enumeration objEnum = objTestData.enumerateKeys();
				if(switchToFrame(strFrames, false) && waitForPageLoad(MAX_TIMEOUT)) {
					
					while(objEnum.hasMoreElements()) {
						//blnStatus = false;
						strHashKey = objEnum.nextElement().toString();
						strHashValue = objTestData.get(strHashKey).toString();

						switch(strHashKey) {
					 
						
						case"ORIGINAL_POLICY_NUMBER":
							blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_tconvPage1:ax2termconversion_TConv1:tcorigPolicyNumber_EF1", validateInput(strHashValue), "Original policy numbers", currentScreen);
							break;
						case"ORIGINAL_POLICY_ATTACHED":
							blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_tconvPage1:ax2termconversion_TConv1:tcpolicyAttach_DD", validateInput(strHashValue), "Is original policy attached?", currentScreen);
							break;
						case"ORIGINAL_POLICY_LOST":
							blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_tconvPage1:ax2termconversion_TConv1:tcpolicyLost_DD", validateInput(strHashValue), "If 'No', is original policy lost?", currentScreen);
							break;
						case"CONVERSION_TYPE":
							blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_tconvPage1:ax2termconversion_TConv1:tcDateCon_RB", validateInput(strHashValue), "CONVERSION_TYPE", currentScreen);
							break;
						case"Q1_ARE_UNEARNED_PREMIUMS":
							blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_tconvPage1:ax2termconversion_TConv1:tcpremium_RB", validateInput(strHashValue), "If there are unearned premium(s) on the Term ", currentScreen);
							Thread.sleep(2000);
							waitForPageLoad(MIC_TIMEOUT);
							break;
						case"ADD":													  
							blnStatus = setValue(WebControl.BUTTON, IdentifyBy.NAME, "form_tconvPage1:ax2termconversion_TConv1:tcAdd_CButton", validateInput(strHashValue), "ADD", currentScreen);
							Thread.sleep(2000);
							waitForPageLoad(MIC_TIMEOUT);
							break;
						case"FILL_TERMCONVERSION_R_OPAI":
							blnStatus = setValue(WebControl.BUTTON, IdentifyBy.NAME, "form_tconvPage1:ax2termconversion_TConv1:tcDataTable:0:personalInfo_CButton", validateInput(strHashValue), "FILL_TERMCONVERSION_R_OPAI", currentScreen);
							break;
						case"FILL_TERMCONVERSION":                        
							
							blnStatus = selectWebtableRow(IdentifyBy.ID, "form_tconvPage1:ax2termconversion_TConv1:tcDataTable", "", "Term Conversion", currentScreen);
							
							
							blnStatus = setValue(WebControl.BUTTON, IdentifyBy.NAME, "form_tconvPage1:ax2termconversion_TConv1:tcDataTable:0:personalInfo_CButton", validateInput(strHashValue), "FILL_TERMCONVERSION_R_OPAI", currentScreen);
							
							break;
							
						case"CURRENTLY_DISABLED":
							blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_tconvPage1:ax2axaProposedInsured_TConv1:pInsured_DT:0:pInsured1disabled_DD", validateInput(strHashValue), "CURRENTLY_DISABLED", currentScreen);
							break;
						case"PO_BOX_ADDRESS":
							blnStatus = setValue(WebControl.CHECKBOX, IdentifyBy.NAME, "form_tconvPage1:ax2axaProposedInsured_TConv1:pInsured_DT:0:poBox_CB", validateInput(strHashValue), "PO_BOX_ADDRESS", currentScreen);
							break;
						case"ADDRESS_TYPE":
							blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_tconvPage1:ax2axaProposedInsured_TConv1:pInsured_DT:0:addressType_DD", validateInput(strHashValue), "ADDRESS_TYPE", currentScreen);
							break;
						case"STREET_NO":
							blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_tconvPage1:ax2axaProposedInsured_TConv1:pInsured_DT:0:street_EF", validateInput(strHashValue), "STREET_NO", currentScreen);
							break;
						case"BUILDING_APT_SUITE":
							blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_tconvPage1:ax2axaProposedInsured_TConv1:pInsured_DT:0:BldAptSuite_EF", validateInput(strHashValue), "BUILDING_APT_SUITE", currentScreen);
							break;
						case"CITY":
							blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_tconvPage1:ax2axaProposedInsured_TConv1:pInsured_DT:0:pInsured1City_EF", validateInput(strHashValue), "CITY", currentScreen);
							break;
						case"STATE":
							blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_tconvPage1:ax2axaProposedInsured_TConv1:pInsured_DT:0:pInsured1State_DD", validateInput(strHashValue), "STATE", currentScreen);
							break;
						case"ZIP":
							blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_tconvPage1:ax2axaProposedInsured_TConv1:pInsured_DT:0:pInsured1Zip_EF", validateInput(strHashValue), "ZIP", currentScreen);
							break;
						case"COUNTRY":
							blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_tconvPage1:ax2axaProposedInsured_TConv1:pInsured_DT:0:pInsured1Country_DD", validateInput(strHashValue), "COUNTRY", currentScreen);
							break;
						case"ADDRESS_ADD":
							blnStatus = setValue(WebControl.BUTTON, IdentifyBy.NAME, "form_tconvPage1:ax2axaProposedInsured_TConv1:pInsured_DT:0:pInsured1AddInfoAdd_CButton", validateInput(strHashValue), "ADDRESS_ADD", currentScreen);
							break;
						case"RATE_CLASS":
							blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_tconvPage1:ax2axaProposedInsured_TConv1:pInsured_DT:0:rateClassProposedInsured1_DD", validateInput(strHashValue), "RATE_CLASS", currentScreen);
							break;
						case"BENEFICIARY":
							blnStatus = setValue(WebControl.BUTTON, IdentifyBy.NAME, "form_tconvPage1:ax2beneficiary_TConv1:beneficairy_CButton", validateInput(strHashValue), "BENEFICIARY", currentScreen);		
							break;
						case"INSURED_THE_OWNER":
							blnStatus = setValue(WebControl.CHECKBOX, IdentifyBy.NAME, "form_tconvPage1:ax2owner_TConv1:pInsured_DT:0:sameOwner_CB", validateInput(strHashValue), "INSURED_THE_OWNER", currentScreen);
							break;
						case"PERSON_R_ENTITY":									
							blnStatus = setValue(WebControl.RADIOBOX, IdentifyBy.NAME, "form_tconvPage1:ax2owner_TConv1:owner_DataTable:0:personEntityType_RB", getAppRadioValues(strHashKey, strHashValue), "Person / Entity", currentScreen);
							break;
						case"ENTITY_TYPE":
							blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_tconvPage1:ax2owner_TConv1:owner_DataTable:0:personEntityType_DD", validateInput(strHashValue), "ENTITY_TYPE", currentScreen);
							break;
						case"FIRST_NAME":
							blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_tconvPage1:ax2owner_TConv1:owner_DataTable:0:first_EF", validateInput(strHashValue), "FIRST_NAME", currentScreen);
							break;
							
						case"MIDDLE_NAME":
							blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_tconvPage1:ax2owner_TConv1:owner_DataTable:0:middle_EF", validateInput(strHashValue), "MIDDLE_NAME", currentScreen);
							break;
						case"LAST_NAME":
							blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_tconvPage1:ax2owner_TConv1:owner_DataTable:0:last_EF", validateInput(strHashValue), "LAST_NAME", currentScreen);
							break;
						case "GENDER":                                                
							blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_tconvPage1:ax2axaProposedInsured_TConv1:pInsured_DT:0:pInsured1Gender_DD", validateInput(strHashValue), "Gender", currentScreen);
							break;
							
							
							
							
				
						case"ENTITY":
							blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_tconvPage1:ax2owner_TConv1:owner_DataTable:0:entity_EF", validateInput(strHashValue), "ENTITY", currentScreen);
							
							break;
						case"SSN_EIN_ITIN":
							SSN_EIN_ITIN = strHashValue;								
							blnStatus = setValue(WebControl.RADIOBOX, IdentifyBy.NAME, "form_tconvPage1:ax2owner_TConv1:owner_DataTable:0:ssnEinItin_RB_Tconv", getAppRadioValues(strHashKey, strHashValue), "SSN_EIN_ITIN", currentScreen);
							
							break;
						case"SSN_EIN_ITIN_NUMBER": 
							switch(SSN_EIN_ITIN) {
								case "SSN":														
									blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_tconvPage1:ax2owner_TConv1:owner_DataTable:0:ssnEinSSN_EF_Tconv", validateInput(strHashValue), "SSN NUMBER", currentScreen);
									break;
								case "EIN":
									blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_tconvPage1:ax2owner_TConv1:owner_DataTable:0:ssnEinEIN_EF_Tconv", validateInput(strHashValue), "EIN NUMBER", currentScreen);
									break;
								case "ITIN":
									blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_tconvPage1:ax2owner_TConv1:owner_DataTable:0:ssnEinITIN_EF_Tconv", validateInput(strHashValue), "ITIN NUMBER", currentScreen);
									break;
							}
							break;
						
						case"POBOX_ADDRESS":
							blnStatus = setValue(WebControl.CHECKBOX, IdentifyBy.NAME, "form_tconvPage1:ax2owner_TConv1:owner_DataTable:0:poBox_CB", validateInput(strHashValue), "PO.BOX ADDRESS", currentScreen);
							
							break;
							case"8B_ADDRESS_TYPE":
								blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_tconvPage1:ax2owner_TConv1:owner_DataTable:0:addressType_DD", validateInput(strHashValue), "ADDRESS_TYPE", currentScreen);
								break;
							case"8B_STREET_NO":
								blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_tconvPage1:ax2owner_TConv1:owner_DataTable:0:noAndStreet_EF", validateInput(strHashValue), "STREET_NO", currentScreen);
								break;
							case"BLG_APT_SUITE":
								blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_tconvPage1:ax2owner_TConv1:owner_DataTable:0:bldAptSuite_EF", validateInput(strHashValue), "BLG_APT_SUITE", currentScreen);
								break;
							case"8B_CITY":
								blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_tconvPage1:ax2owner_TConv1:owner_DataTable:0:city_EF", validateInput(strHashValue), "CITY", currentScreen);
								break;
							case"8B_STATE":
								blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_tconvPage1:ax2owner_TConv1:owner_DataTable:0:state_DD", validateInput(strHashValue), "STATE", currentScreen);
								break;
							case"8B_ZIP":
								blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_tconvPage1:ax2owner_TConv1:owner_DataTable:0:zip_EF", validateInput(strHashValue), "zip", currentScreen);
								break;
							case"8B_COUNTRY":
								
								blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_tconvPage1:ax2owner_TConv1:owner_DataTable:0:pInsured1Country_DD", validateInput(strHashValue), "COUNTRY", currentScreen);
								break;
							case"8B_ADD":
								
								blnStatus = setValue(WebControl.BUTTON, IdentifyBy.NAME, "form_tconvPage1:ax2owner_TConv1:owner_DataTable:0:owner1AddInfoAdd_CButton", validateInput(strHashValue), "ADD", currentScreen);
								break;	
						
						
						} //end of switch
						if(!blnStatus) break;
					} //end of while
				}
				else {
					ReportGenerator.generateTestStep(false, currentScreen, "Switch to Frame", "Failed to switch frames " + strFrames.replaceAll(GlobalData.STRING_SEPARATOR, " > "), false);
					blnStatus = false;
				}
				objEnum = null;
					
			} catch(Exception objExp) {
				ReportGenerator.generateTestStep(false, currentScreen, "Exception occured", "Exception is - " + objExp.getMessage(), false);
				blnStatus = false;
			}
			return blnStatus;
		}
		
		
		
		private static boolean TCONV2(OrderedHashtable objTestData) {
			boolean blnStatus = false;
			String strHashKey = "", strHashValue = "";
			try {
				String strFrames = "mainContentFrame" + GlobalData.STRING_SEPARATOR + "contentRightFrame" + GlobalData.STRING_SEPARATOR + "file"+ GlobalData.STRING_SEPARATOR + "file";;
				Enumeration objEnum = objTestData.enumerateKeys();
				if(switchToFrame(strFrames, false) && waitForPageLoad(MAX_TIMEOUT)) {
					
					while(objEnum.hasMoreElements()) {
						//blnStatus = false;
						strHashKey = objEnum.nextElement().toString();
						strHashValue = objTestData.get(strHashKey).toString();

						switch(strHashKey) {
					 
																	

						case"OTH_INS_11A":
							blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_tconvPage2:TConv_OtherInsuranceQuestions:tobaccoalchoholQuestionsTablePane:0:Q55Ans_DD", validateInput(strHashValue), "Q11_A", currentScreen);
						
							break;
						case"OTH_INS_11B":
							blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_tconvPage2:TConv_OtherInsuranceQuestions:tobaccoalchoholQuestionsTablePane:1:Q55Ans_DD", validateInput(strHashValue), "Q11_B", currentScreen);
							break;
						case"11AB_COMPANY_NAME":
							blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_tconvPage2:TConv_OtherInsuranceInfo:otherInsuranceCompanyName_DD", validateInput(strHashValue), "Name of Company:", currentScreen);
							
							break;
						case"11AB_FACE_AMOUNT_PLUS_RIDERS":
							
							blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_tconvPage2:TConv_OtherInsuranceInfo:faceAmountRider_EF", validateInput(strHashValue), "Face Amount plus Riders:", currentScreen);
							
							break;
						case"11AB_YEAR_ISSUED":
							blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_tconvPage2:TConv_OtherInsuranceInfo:yearIssued_EF", validateInput(strHashValue), "Year Issued:", currentScreen);
							
							break;
						case"11AB_POLICY_CONTRACT_NO":
							blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_tconvPage2:TConv_OtherInsuranceInfo:contractNumber_EF", validateInput(strHashValue), "Policy / Contract #:", currentScreen);
							break;
						case"11AB_POLICY_CONTRACT_TYPE":
							blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_tconvPage2:TConv_OtherInsuranceInfo:lifeProposedInsurance_EF", validateInput(strHashValue), "Policy/Contract Type", currentScreen);
							break;
						case"11AB_REPLACED_OR_AFFECTED":
							blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_tconvPage2:TConv_OtherInsuranceInfo:replacedOrEffected_DD", validateInput(strHashValue), "To be replaced changed or affected?", currentScreen);
							
							break;
						case"11AB_1035_EXCHANGE":
							blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_tconvPage2:TConv_OtherInsuranceInfo:exchangeQuestion_DD", validateInput(strHashValue), "1035 Exchange?", currentScreen);
							break;
						case"11AB_PRODUCT_TYPE":
							blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_tconvPage2:TConv_OtherInsuranceInfo:ProductType_DD", validateInput(strHashValue), "Product Type:", currentScreen);
							break;
						case"11AB_ADD":
							blnStatus = setValue(WebControl.BUTTON, IdentifyBy.NAME, "form_tconvPage2:TConv_OtherInsuranceInfo:lifeOtherInsuranceAdd_CButton", validateInput(strHashValue), "BUILDING_APT_SUITE", currentScreen);		
							
							break;
						case"Q12":
							blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_tconvPage2:TConv_OtherInsuranceInfo:tobaccoalchoholQuestionsTablePane:0:Q22Ans_DD", validateInput(strHashValue), "Q12", currentScreen);
							
							break;
						
						
						} //end of switch
						if(!blnStatus) break;
					} //end of while
				}
				else {
					ReportGenerator.generateTestStep(false, currentScreen, "Switch to Frame", "Failed to switch frames " + strFrames.replaceAll(GlobalData.STRING_SEPARATOR, " > "), false);
					blnStatus = false;
				}
				objEnum = null;
					
			} catch(Exception objExp) {
				ReportGenerator.generateTestStep(false, currentScreen, "Exception occured", "Exception is - " + objExp.getMessage(), false);
				blnStatus = false;
			}
			return blnStatus;
		}
		
		private static boolean TCONV3(OrderedHashtable objTestData) {
			boolean blnStatus = false;
			String strHashKey = "", strHashValue = "";
			try {
				String strFrames = "mainContentFrame" + GlobalData.STRING_SEPARATOR + "contentRightFrame" + GlobalData.STRING_SEPARATOR + "file"+ GlobalData.STRING_SEPARATOR + "file";;
				Enumeration objEnum = objTestData.enumerateKeys();
				if(switchToFrame(strFrames, false) && waitForPageLoad(MAX_TIMEOUT)) {
					
					while(objEnum.hasMoreElements()) {
						//blnStatus = false;
						strHashKey = objEnum.nextElement().toString();
						strHashValue = objTestData.get(strHashKey).toString();

						switch(strHashKey) {
					 
					
						case"SECTION_B_PRODUCT_INFO":
							blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_tconvPage3:axaAckInfo:ackB_DD", validateInput(strHashValue), "Section B -Product Information", currentScreen);
						
							break;
						case"SIGNATURE_OWNER":
							blnStatus = setValue(WebControl.CHECKBOX, IdentifyBy.NAME, "form_tconvPage3:axaBeneficiaryInfo:signatureofinsured_CB", validateInput(strHashValue), "SIGNATURE_OWNER", currentScreen);
							
							break;
						case"CITY":
							blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_tconvPage3:axaBeneficiaryInfo:inssignedAtCity_EF", validateInput(strHashValue), "CITY", currentScreen);
							
							break;
						case"STATE":
							
							blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_tconvPage3:axaBeneficiaryInfo:inssignedAtState_DD", validateInput(strHashValue), "STATE", currentScreen);
							
							break;
						case"DATE":
							blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_tconvPage3:axaBeneficiaryInfo:inssignedAtDate_EF", validateInput(strHashValue), "DATE", currentScreen);
							
							break;
						case"DATE_TCONV":
							blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_tconvPage3:axaBeneficiaryInfo:lTempownerDate_EF", validateInput(strHashValue), "DATE", currentScreen);
							
							break;
						case"INSURANCE_REPLACED_TCONV":
							blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_tconvPage3:axaFinancialProfessQues:bankruptcyDetailsQuestionsTablePane:0:Q61bAns_DD", validateInput(strHashValue), "Will any existing insurance be replaced or changed or affected (or has it been) assuming the insurance applied for will be issued?", currentScreen);
							break;
							
						case"IF_YES_TCONV":
							blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_tconvPage3:axaFinancialProfessQues:bankruptcyDetailsQuestionsTablePane:1:Q61bAns_DD", validateInput(strHashValue), "If Yes, is the information provided in question 21 on Part 1 of the Application for Proposed Insured 1, and question 21 of the Survivorship Product Questionnaire for Proposed Insured 2, if applicable, complete and accurate?", currentScreen);
						break;
							
							
						case"SIGNATURE_REQUIRED_TCONV":
							blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_tconvPage3:axaFinancialProfessQues:bankruptcyDetailsQuestionsTablePane:2:Q61bAns_DD", validateInput(strHashValue), "I have witnessed the signature required on the fully completed Part 1.", currentScreen);
							break;
						case"SIGNATURE_BROKER":
							blnStatus = setValue(WebControl.CHECKBOX, IdentifyBy.NAME, "form_tconvPage3:axaBeneficiaryInfo:lTempProposedInsured1_CB", validateInput(strHashValue), "Signature of Licensed Financial Professional/Insurance Broker", currentScreen);
							break;
						
						
						
						} //end of switch
						if(!blnStatus) break;
					} //end of while
				}
				else {
					ReportGenerator.generateTestStep(false, currentScreen, "Switch to Frame", "Failed to switch frames " + strFrames.replaceAll(GlobalData.STRING_SEPARATOR, " > "), false);
					blnStatus = false;
				}
				objEnum = null;
					
			} catch(Exception objExp) {
				ReportGenerator.generateTestStep(false, currentScreen, "Exception occured", "Exception is - " + objExp.getMessage(), false);
				blnStatus = false;
			}
			return blnStatus;
		}
		
		private static boolean TCONV4(OrderedHashtable objTestData) {
			boolean blnStatus = false;
			String strHashKey = "", strHashValue = "";
			try {
				String strFrames = "mainContentFrame" + GlobalData.STRING_SEPARATOR + "contentRightFrame" + GlobalData.STRING_SEPARATOR + "file"+ GlobalData.STRING_SEPARATOR + "file";;
				Enumeration objEnum = objTestData.enumerateKeys();
				if(switchToFrame(strFrames, false) && waitForPageLoad(MAX_TIMEOUT)) {
					
					while(objEnum.hasMoreElements()) {
						//blnStatus = false;
						strHashKey = objEnum.nextElement().toString();
						strHashValue = objTestData.get(strHashKey).toString();

						switch(strHashKey) {
					 
					
								
						case"Q13A":
							blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_tconvPage4:axaProducerInfo:certSection2TablePane:0:Q61bAns_DD2", validateInput(strHashValue), "Q13A", currentScreen);
							break;
						case"Q13B":
							blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_tconvPage4:axaProducerInfo:certSection2TablePane:1:Q61bAns_DD2", validateInput(strHashValue), "Q13B", currentScreen);
							break;
						case"Q13C":
							blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_tconvPage4:axaProducerInfo:certSection2TablePane:2:Q61bAns_DD2", validateInput(strHashValue), "Q13C", currentScreen);
							break;
						case"FINANCIAL_PROFESSIONAL_NUMBER":
							blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_tconvPage4:axaProducerInfo:finaProfessionalNumberPercentage_EF", validateInput(strHashValue), "FINANCIAL_PROFESSIONAL_NUMBER", currentScreen);
							break;
						case"DISTRIBUTION_CHANNEL":
							blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_tconvPage4:axaProducerInfo:disChannel_DD", validateInput(strHashValue), "DISTRIBUTION_CHANNEL", currentScreen);
							break;
						case"SEARCH":  
							
							/*WebElement element = gobjWebDriver.findElement(By.name("form_tconvPage4:axaProducerInfo:bgaNumber_CButton"));
							JavascriptExecutor executor = (JavascriptExecutor)gobjWebDriver;
							executor.executeScript("arguments[0].click();", element);
							*/
							
							blnStatus = setValue(WebControl.BUTTON, IdentifyBy.NAME, "form_tconvPage4:axaProducerInfo:bgaNumber_CButton", validateInput(strHashValue), "SEARCH", currentScreen);
							//ReportGenerator.generateTestStep(true, currentScreen, "Click SEARCH", "Successfully clicked", true);
							
							break;
						case"SELECT_PRODUCER":
							blnStatus = selectWebtableRow(IdentifyBy.ID, "form_tconvPage4:axaProducerInfo:financialProfessionalDetails_DataTable", "", "Producer", currentScreen);
							break;
						case"COMMISSION_PERCENT":
							blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_tconvPage4:axaProducerInfo:commissionPer_EF", validateInput(strHashValue), "COMMISSION_PERCENT", currentScreen);
							break;
						case"UPDATE":
							blnStatus = setValue(WebControl.BUTTON, IdentifyBy.NAME, "form_tconvPage4:axaProducerInfo:buttonUpdate_CButton", validateInput(strHashValue), "UPDATE", currentScreen);		
							break;
						case"Q14A":
							blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_tconvPage4:axaOwnerSuitabilityInfo:employedWithFinra_RB", validateInput(strHashValue), "Q14A", currentScreen);
							break;
						case"Q14B":
							blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_tconvPage4:axaOwnerSuitabilityInfo:clientHasFinancialPlan_RB", validateInput(strHashValue), "Q14B", currentScreen);
							break;
						case"PLANNING_TOOL":
							blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_tconvPage4:axaOwnerSuitabilityInfo:planningToolName_EF", validateInput(strHashValue), "Plan # or Planning Tool Name:", currentScreen);
							break;
						case"14C":
							blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_tconvPage4:axaOwnerSuitabilityInfo:investmentTimeHorizon_DD", validateInput(strHashValue), "14C", currentScreen);
							break;
						case"14D":
							blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_tconvPage4:axaOwnerSuitabilityInfo:investmentObjective_DD", validateInput(strHashValue), "14D", currentScreen);
							break;
						case"14E":
							blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_tconvPage4:axaOwnerSuitabilityInfo:riskTolerance_DD", validateInput(strHashValue), "14E", currentScreen);
							break;
						case"14F":
							blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_tconvPage4:axaOwnerSuitabilityInfo:maritalStatus_DD", validateInput(strHashValue), "14F", currentScreen);
							break;
						case"14G":
							blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_tconvPage4:axaOwnerSuitabilityInfo:noOfDependents_EF", validateInput(strHashValue), "14G", currentScreen);
							break;
						case"14H":
							blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_tconvPage4:axaOwnerSuitabilityInfo:federalTaxBracket_DD", validateInput(strHashValue), "14H", currentScreen);
							break;
						case"14I":
							blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_tconvPage4:axaOwnerSuitabilityInfo:currentlyEmployed_DD", validateInput(strHashValue), "14I", currentScreen);
							break;
						case"14J":
							blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_tconvPage4:axaOwnerSuitabilityInfo:pInsured1empOccduties_EF", validateInput(strHashValue), "14J", currentScreen);
							break;
						
						case"NET_WORTH":
							blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_tconvPage4:axaOwnerSuitabilityInfo:liquidNetWorthOwner_EF", validateInput(strHashValue), "14k. Liquid Net Worth $:", currentScreen);
							break;
						case"MONTHLY_INCOME":
							blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_tconvPage4:axaOwnerSuitabilityInfo:estMonthIncm_EF", validateInput(strHashValue), "Estimated Net Monthly Income $:", currentScreen);
							break;
						case"MONTHLY_EXPENSES":
							blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_tconvPage4:axaOwnerSuitabilityInfo:estMonthExp_EF", validateInput(strHashValue), "Estimated Monthly Expenses $:", currentScreen);
							break;
						case"HOUSEHOLD_INCOME":
							blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_tconvPage4:axaOwnerSuitabilityInfo:grossIncome_EF", validateInput(strHashValue), "Estimated Gross Annual Household Income ", currentScreen);
							break;
						case"Q14M_CDS":
							blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_tconvPage4:axaOwnerSuitabilityInfo:cd_EF", validateInput(strHashValue), "Q14M_CDS", currentScreen);
							break;
						case"Q14M_STOCKS":
							blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_tconvPage4:axaOwnerSuitabilityInfo:stocks_EF", validateInput(strHashValue), "Q14M_STOCKS", currentScreen);
							break;
						case"Q14M_BONDS":
							blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_tconvPage4:axaOwnerSuitabilityInfo:bonds_EF", validateInput(strHashValue), "Q14M_BONDS", currentScreen);
							break;
						case"Q14M_ANNUITIES":
							blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_tconvPage4:axaOwnerSuitabilityInfo:annuities_EF", validateInput(strHashValue), "Q14M_ANNUITIES", currentScreen);
							break;
						case"Q14M_RETIREMENT_ACCOUNTS":
							blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_tconvPage4:axaOwnerSuitabilityInfo:retirementAccounts_EF", validateInput(strHashValue), "Q14M_RETIREMENT_ACCOUNTS", currentScreen);
							break;
						case"Q14M_REAL_ESTATE":
							blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_tconvPage4:axaOwnerSuitabilityInfo:realEstate_EF", validateInput(strHashValue), "Q14M_REAL_ESTATE", currentScreen);
							break;
						case"Q14M_OTHER":
							blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_tconvPage4:axaOwnerSuitabilityInfo:otherExcludePrimaryResidence_EF", validateInput(strHashValue), "Q14M_OTHER", currentScreen);
							break;
						case"Q14M_INCOME":
							blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_tconvPage4:axaOwnerSuitabilityInfo:income_EF", validateInput(strHashValue), "Q14M_INCOME", currentScreen);
							break;
						case"Q14M_GROWTH":
							blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_tconvPage4:axaOwnerSuitabilityInfo:growth_EF", validateInput(strHashValue), "Q14M_GROWTH", currentScreen);
							break;
						case"Q14M_AGGRESSIVE":
							blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_tconvPage4:axaOwnerSuitabilityInfo:aggressive_EF", validateInput(strHashValue), "Q14M_AGGRESSIVE", currentScreen);
							break;
						case"Q14M_OTHER_FUNDS":
							blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_tconvPage4:axaOwnerSuitabilityInfo:otherFunds_EF", validateInput(strHashValue), "Q14M_OTHER_FUNDS", currentScreen);
							break;
						case"Q14N_TOTAL_INVESTMENT":
							blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_tconvPage4:axaOwnerSuitabilityInfo:totalInvestment_EF", validateInput(strHashValue), "Q14N_TOTAL_INVESTMENT", currentScreen);
							break;
						case"Q14N_CASH":
							blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_tconvPage4:axaOwnerSuitabilityInfo:cashCheckingOrSaving_EF", validateInput(strHashValue), "Q14N_CASH", currentScreen);
							break;
						case"Q14N_TOTAL_INVESTMENT_CASH":
							blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_tconvPage4:axaOwnerSuitabilityInfo:totalInvestmentAssetsPlusCash_EF", validateInput(strHashValue), "Q14N_TOTAL_INVESTMENT_CASH", currentScreen);
							break;
						case"Q14O_CDS":
							blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_tconvPage4:axaOwnerSuitabilityInfo:cdExp_DD", validateInput(strHashValue), "Q14O_CDS", currentScreen);
							break;
						case"Q14O_STOCKS":
							blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_tconvPage4:axaOwnerSuitabilityInfo:stocksExp_DD", validateInput(strHashValue), "Q14O_STOCKS", currentScreen);
							break;
						case"Q14O_BONDS":
							blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_tconvPage4:axaOwnerSuitabilityInfo:bondsExp_DD", validateInput(strHashValue), "Q14O_BONDS", currentScreen);
							break;
						case"Q14O_ANNUITIES":
							blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_tconvPage4:axaOwnerSuitabilityInfo:annuitiesExp_DD", validateInput(strHashValue), "Q14O_ANNUITIES", currentScreen);
							break;
						case"Q14O_MUTUAL_FUNDS":
							blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_tconvPage4:axaOwnerSuitabilityInfo:mfExp_DD", validateInput(strHashValue), "Q14O_MUTUAL_FUNDS", currentScreen);
							break;
							
						case"Q14P_CASH":
							blnStatus = setValue(WebControl.CHECKBOX, IdentifyBy.NAME, "form_tconvPage4:axaSOF:sourceOfFundsPInsOptions_DD", validateInput(strHashValue), "Q14P_CASH", currentScreen);
							break;
						case"Q14P_BORROWING":
							blnStatus = setValue(WebControl.CHECKBOX, IdentifyBy.NAME, "form_tconvPage4:axaSOF:sourceOfFundsPInsOptions_DD", validateInput(strHashValue), "Q14P_BORROWING", currentScreen);
							break;
						case"Q14P_ANNUITY":
							blnStatus = setValue(WebControl.CHECKBOX, IdentifyBy.NAME, "form_tconvPage4:axaSOF:sourceOfFundsPInsOptions_DD", validateInput(strHashValue), "Q14P_ANNUITY", currentScreen);
							break;
						case"Q14P_SALE_401K":
							blnStatus = setValue(WebControl.CHECKBOX, IdentifyBy.NAME, "form_tconvPage4:axaSOF:sourceOfFundsPInsOptions_DD", validateInput(strHashValue), "Q14P_SALE_401K", currentScreen);
							break;
						case"Q14P_SALE_LOADED_MUTUAL_FUND":
							blnStatus = setValue(WebControl.CHECKBOX, IdentifyBy.NAME, "form_tconvPage4:axaSOF:sourceOfFundsPInsOptions_DD", validateInput(strHashValue), "Q14P_SALE_LOADED_MUTUAL_FUND", currentScreen);
							break;
						case"Q14P_SALE_IVESTMENT":
							blnStatus = setValue(WebControl.CHECKBOX, IdentifyBy.NAME, "form_tconvPage4:axaSOF:sourceOfFundsPInsOptions_DD", validateInput(strHashValue), "Q14P_SALE_IVESTMENT", currentScreen);
							break;
						case"Q14P_OTHER":
							blnStatus = setValue(WebControl.CHECKBOX, IdentifyBy.NAME, "form_tconvPage4:axaSOF:sourceOfFundsPInsOptions_DD", validateInput(strHashValue), "Q14P_OTHER", currentScreen);
							break;
						
						
						} //end of switch
						if(!blnStatus) break;
					} //end of while
				}
				else {
					ReportGenerator.generateTestStep(false, currentScreen, "Switch to Frame", "Failed to switch frames " + strFrames.replaceAll(GlobalData.STRING_SEPARATOR, " > "), false);
					blnStatus = false;
				}
				objEnum = null;
					
			} catch(Exception objExp) {
				ReportGenerator.generateTestStep(false, currentScreen, "Exception occured", "Exception is - " + objExp.getMessage(), false);
				blnStatus = false;
			}
			return blnStatus;
		}
		
		private static boolean TCONV5(OrderedHashtable objTestData) {
			boolean blnStatus = false;
			String strHashKey = "", strHashValue = "";
			try {
				String strFrames = "mainContentFrame" + GlobalData.STRING_SEPARATOR + "contentRightFrame" + GlobalData.STRING_SEPARATOR + "file"+ GlobalData.STRING_SEPARATOR + "file";;
				Enumeration objEnum = objTestData.enumerateKeys();
				if(switchToFrame(strFrames, false) && waitForPageLoad(MAX_TIMEOUT)) {
					
					while(objEnum.hasMoreElements()) {
						//blnStatus = false;
						strHashKey = objEnum.nextElement().toString();
						strHashValue = objTestData.get(strHashKey).toString();

						switch(strHashKey) {

						case"US_CITIZEN":
							blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_tconvPage5:foreignResidence:usCitizen_DD", validateInput(strHashValue), "US_CITIZEN", currentScreen);
							break;
						case"COUNTRY_CITIZENSHIP":
							blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_tconvPage5:foreignResidence:countryofCitizenship_DD", validateInput(strHashValue), "COUNTRY_CITIZENSHIP", currentScreen);
							break;
						case"Q17_CHARITABLE":											
							blnStatus = setValue(WebControl.CHECKBOX, IdentifyBy.NAME, "form_tconvPage5:foreignResidence:purposeOfInsurance_insured_DD", validateInput(strHashValue), "Q17_CHARITABLE", currentScreen);
							break;
						case"Q17_ESTATE_PLANNING":
							blnStatus = setValue(WebControl.CHECKBOX, IdentifyBy.NAME, "form_tconvPage5:foreignResidence:purposeOfInsurance_owner_DD", validateInput(strHashValue), "Q17_ESTATE_PLANNING", currentScreen);
							break;
						case"Q17_FAMILY_PROTECTION":
							blnStatus = setValue(WebControl.CHECKBOX, IdentifyBy.NAME, "form_tconvPage5:foreignResidence:purposeOfInsurance_owner_DD", validateInput(strHashValue), "Q17_FAMILY_PROTECTION", currentScreen);
							break;
						case"Q17_MORTGAGE":
							blnStatus = setValue(WebControl.CHECKBOX, IdentifyBy.NAME, "form_tconvPage5:foreignResidence:purposeOfInsurance_owner_DD", validateInput(strHashValue), "Q17_MORTGAGE", currentScreen);
							break;
						case"Q17_OTHER":
							blnStatus = setValue(WebControl.CHECKBOX, IdentifyBy.NAME, "form_tconvPage5:foreignResidence:purposeOfInsurance_owner_DD", validateInput(strHashValue), "Q17_OTHER", currentScreen);
							break;
						case"SIGNATURE_INSURANCE_BROKER":								
							blnStatus = setValue(WebControl.CHECKBOX, IdentifyBy.NAME, "form_tconvPage5:foreignResidence:financialProfessionalSignPresent_CB", validateInput(strHashValue), "SIGNATURE_INSURANCE_BROKER", currentScreen);
							break;
						case"DATE":														
							blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_tconvPage5:foreignResidence:financialProfessionalDate_EF", validateInput(strHashValue), "DATE", currentScreen);
							break;
						
						} //end of switch
						if(!blnStatus) break;
					} //end of while
				}
				else {
					ReportGenerator.generateTestStep(false, currentScreen, "Switch to Frame", "Failed to switch frames " + strFrames.replaceAll(GlobalData.STRING_SEPARATOR, " > "), false);
					blnStatus = false;
				}
				objEnum = null;
					
			} catch(Exception objExp) {
				ReportGenerator.generateTestStep(false, currentScreen, "Exception occured", "Exception is - " + objExp.getMessage(), false);
				blnStatus = false;
			}
			return blnStatus;
		}
		
			
		
		private static boolean InsuredInfoJI(OrderedHashtable objTestData) {
			boolean blnStatus = false;
			String strHashKey = "", strHashValue = "";
			try {
				String strFrames = "mainContentFrame" + GlobalData.STRING_SEPARATOR + "contentRightFrame" + GlobalData.STRING_SEPARATOR + "file"+ GlobalData.STRING_SEPARATOR + "file";;
				Enumeration objEnum = objTestData.enumerateKeys();
				if(switchToFrame(strFrames, false) && waitForPageLoad(MAX_TIMEOUT)) {
					
					while(objEnum.hasMoreElements()) {
						//blnStatus = false;
						strHashKey = objEnum.nextElement().toString();
						strHashValue = objTestData.get(strHashKey).toString();

						switch(strHashKey) {
										

						case"P2_LAST_NAME":
							blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_ax2InsuredInfoJI:ProposedInsured2:pInsured1First_EF", validateInput(strHashValue), "P2_LAST_NAME", currentScreen);
							break;
						case"P2_FIRST_NAME":
							blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_ax2InsuredInfoJI:ProposedInsured2:pInsured1Last_EF", validateInput(strHashValue), "P2_FIRST_NAME", currentScreen);
							break;
						case"GENDER":
							blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_ax2InsuredInfoJI:ProposedInsured2:pInsured1Gender_DD", validateInput(strHashValue), "GENDER", currentScreen);
							break;
						case"Q5":													 
							blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_ax2InsuredInfoJI:ProposedInsured2:OtherOwnerNumber5_CB", validateInput(strHashValue), "Q5", currentScreen);
							break;
						case"ADDRESS_AS_P1":
							blnStatus = setValue(WebControl.CHECKBOX, IdentifyBy.NAME, "form_ax2InsuredInfoJI:ProposedInsured2:SameAddress_CB", validateInput(strHashValue), "ADDRESS_AS_P1", currentScreen);
							break;
						case"US_CITIZEN":
							blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_ax2InsuredInfoJI:ProposedInsured2:pInsured1Citizen_DD", validateInput(strHashValue), "US_CITIZEN", currentScreen);
							break;
						case"DOB":
							blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_ax2InsuredInfoJI:ProposedInsured2:pInsured2DOB_EF", validateInput(strHashValue), "DOB", currentScreen);
							break;
						case"Q4":
							blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_ax2InsuredInfoJI:ProposedInsured2:sameOwner_CB", validateInput(strHashValue), "Q5", currentScreen);
							break;
						case"BIRTH_PLACE_COUNTRY":
							blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_ax2InsuredInfoJI:ProposedInsured2:pInsured1BirthCountry_DD", validateInput(strHashValue), "BIRTH_PLACE_COUNTRY", currentScreen);
							break;
						case"BIRTH_PLACE_STATE":
							blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_ax2InsuredInfoJI:ProposedInsured2:lifeBirthState_DD", validateInput(strHashValue), "BIRTH_PLACE_STATE", currentScreen);
							break;
						case "DRIVER_LICENSE":
							blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_ax2InsuredInfoJI:ProposedInsured2:pInsured1licence_DD", validateInput(strHashValue), "DRIVER_LICENSE", currentScreen);
							break;
						case "IF_NO_DRIVING_LICENSE":
							blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_ax2InsuredInfoJI:ProposedInsured2:jInsur_Govt_id", validateInput(strHashValue), "DRIVER_LICENSE", currentScreen);
							break;
						case "SSN_NO":												   
							blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_ax2InsuredInfoJI:ProposedInsured2:pInsured1ssn_EF", validateInput(strHashValue), "SSN", currentScreen);
							break;
						case"CURRENTLY_EMPLOYED":
							blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_ax2InsuredInfoJI:ProposedInsured2:pInsured1Employer_DD", validateInput(strHashValue), "CURRENTLY_EMPLOYED", currentScreen);
							break;
						case"GROSS_EARNED_ANNUAL_INCOME_P2":
							blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_ax2InsuredInfoJI:subView_FinancialDetails:grossEarnedIncomePI1_EF", validateInput(strHashValue), "GROSS_EARNED_ANNUAL_INCOME_P2", currentScreen);
							break;
						case"GROSS_ANNUAL_HOUSEHOLD_INCOME_P2":
							blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_ax2InsuredInfoJI:subView_FinancialDetails:grossHouseIncomePI1_EF", validateInput(strHashValue), "GROSS_ANNUAL_HOUSEHOLD_INCOME_P2", currentScreen);
							break;
						case"GROSS_UNEARNED_ANNUAL_INCOME_P2":
							blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_ax2InsuredInfoJI:subView_FinancialDetails:grossUnearnedIncomePI1_EF", validateInput(strHashValue), "GROSS_UNEARNED_ANNUAL_INCOME_P2", currentScreen);
							break;
						case"TOTAL_NET_WORTH_P2":
							blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_ax2InsuredInfoJI:subView_FinancialDetails:totalNetworthPI1_EF", validateInput(strHashValue), "TOTAL_NET_WORTH_P2", currentScreen);
							break;
						case"FILED_BANKRUPTACY":
							blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_ax2InsuredInfoJI:subView_FinancialDetails:bankruptcyDetailsQuestionsTablePane:0:Q61bAns_DD", validateInput(strHashValue), "FILED_BANKRUPTACY", currentScreen);
							break;
						case"PERSONAL_P2":
							blnStatus = setValue(WebControl.BUTTON, IdentifyBy.NAME, "form_ax2InsuredInfoJI:PurposeOfInsurance:personalInfo_CButton", validateInput(strHashValue), "PERSONAL_P2", currentScreen);
							break;
						case"BUSINESS_P2":
							blnStatus = setValue(WebControl.BUTTON, IdentifyBy.NAME, "form_ax2InsuredInfoJI:PurposeOfInsurance:businessInfo_CButton", validateInput(strHashValue), "BUSINESS_P2", currentScreen);
							break;
						case"Q21A":
							blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_ax2InsuredInfoJI:OtherInsuranceInfo:otherInsuranceQuestionsTablePane:0:Q55Ans_DD", validateInput(strHashValue), "Q21A", currentScreen);
							break;
						case"Q21B":
							blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_ax2InsuredInfoJI:OtherInsuranceInfo:otherInsuranceQuestionsTablePane:1:Q55Ans_DD", validateInput(strHashValue), "Q21B", currentScreen);
							break;
						case"Q21C":
							blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_ax2InsuredInfoJI:OtherInsuranceInfo:otherInsuranceQuestionsTablePane:2:Q55Ans_DD", validateInput(strHashValue), "Q21C", currentScreen);
							break;
						case"Q21D":
							blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_ax2InsuredInfoJI:OtherInsuranceInfo:pendingInsuranceAmountProposedInsured1_EF", validateInput(strHashValue), "Q21D", currentScreen);
							break;
						case"Q22":
							blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_ax2InsuredInfoJI:subViewpersonalHIstory:tobaccoalchoholQuestionsTablePane:0:Q22Ans_DD", validateInput(strHashValue), "Q22", currentScreen);
							break;
						case"Q23":
							blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_ax2InsuredInfoJI:subViewpersonalHIstory:tobaccoalchoholQuestionsTablePane:1:Q22Ans_DD", validateInput(strHashValue), "Q23", currentScreen);
							break;
						case"Q24":
							blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_ax2InsuredInfoJI:subViewpersonalHIstory:tobaccoalchoholQuestionsTablePane:2:Q22Ans_DD", validateInput(strHashValue), "Q24", currentScreen);
							break;
						case"Q25":
							blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_ax2InsuredInfoJI:subViewpersonalHIstory:tobaccoalchoholQuestionsTablePane:3:Q22Ans_DD", validateInput(strHashValue), "Q25", currentScreen);
							break;
						case"Q26":
							blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_ax2InsuredInfoJI:subViewpersonalHIstory:tobaccoalchoholQuestionsTablePane:4:Q22Ans_DD", validateInput(strHashValue), "Q26", currentScreen);
							break;
						case"Q27":
							blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_ax2InsuredInfoJI:subViewpersonalHIstory:tobaccoalchoholQuestionsTablePane:5:Q22Ans_DD", validateInput(strHashValue), "Q27", currentScreen);
							break;
						case"Q28":
							blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_ax2InsuredInfoJI:subViewpersonalHIstory:tobaccoalchoholQuestionsTablePane:6:Q22Ans_DD", validateInput(strHashValue), "Q28", currentScreen);
							break;
						case"Q29A":
							blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_ax2InsuredInfoJI:subViewpersonalHIstory:tobaccoalchoholQuestionsTablePane:7:Q22Ans_DD", validateInput(strHashValue), "Q29A", currentScreen);
							break;
						case"Q29B":
							blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_ax2InsuredInfoJI:subViewpersonalHIstory:tobaccoalchoholQuestionsTablePane:8:Q22Ans_DD", validateInput(strHashValue), "Q29B", currentScreen);
							break;
						case"Q29C":
							blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_ax2InsuredInfoJI:subViewpersonalHIstory:tobaccoalchoholQuestionsTablePane:9:Q22Ans_DD", validateInput(strHashValue), "Q29C", currentScreen);
							break;
						case"Q29D":
							blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_ax2InsuredInfoJI:subViewpersonalHIstory:tobaccoalchoholQuestionsTablePane:10:Q22Ans_DD", validateInput(strHashValue), "Q29D", currentScreen);
							break;
						case"Q30":
							blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_ax2InsuredInfoJI:subViewpersonalHIstory:tobaccoalchoholQuestionsTablePane:11:Q22Ans_DD", validateInput(strHashValue), "Q30", currentScreen);
							break;
						case"Q31":
							blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_ax2InsuredInfoJI:subView_Alcohol:tobaccoalchoholQuestionsTablePane:0:Q31Ans_DD", validateInput(strHashValue), "Q31", currentScreen);
							break;
						case"Q32":
							blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_ax2InsuredInfoJI:subView_Alcohol:tobaccoalchoholQuestionsTablePane:1:Q31Ans_DD", validateInput(strHashValue), "Q32", currentScreen);
							break;
						case"Q33":
							blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_ax2InsuredInfoJI:MedicalCertification:nameOfCompany_DD", validateInput(strHashValue), "Q33", currentScreen);
							break;
						case"DATE_EXAM":
							blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_ax2InsuredInfoJI:MedicalCertification:dateOfExam_EF", validateInput(strHashValue), "DATE_EXAM", currentScreen);
							break;
						case"Q34":
							blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_ax2InsuredInfoJI:MedicalCertification:medicalCertificationQuestionsTablePane:0:aeMedicalCertificationQuestionsQAns", validateInput(strHashValue), "Q34", currentScreen);
							break;
						case"Q35":
							blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_ax2InsuredInfoJI:MedicalCertification:medicalCertificationQuestionsTablePane:1:aeMedicalCertificationQuestionsQAns", validateInput(strHashValue), "Q35", currentScreen);
							break;
						case"Q36":
							blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_ax2InsuredInfoJI:MoneyPaid:tobaccoalchoholQuestionsTablePane:0:Q22Ans_DD", validateInput(strHashValue), "Q36", currentScreen);
							break;
						case"Q37":
							blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_ax2InsuredInfoJI:MoneyPaid:tobaccoalchoholQuestionsTablePane:1:Q22Ans_DD", validateInput(strHashValue), "Q37", currentScreen);
							break;
						case"Q38":
							blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_ax2InsuredInfoJI:MoneyPaid:tobaccoalchoholQuestionsTablePane:2:Q22Ans_DD", validateInput(strHashValue), "Q38", currentScreen);
							break;
						case"Q39":
							blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_ax2InsuredInfoJI:MoneyPaid:tobaccoalchoholQuestionsTablePane:3:Q22Ans_DD", validateInput(strHashValue), "Q39", currentScreen);
							break;
						case"Q40":
							blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_ax2InsuredInfoJI:MoneyPaid:tobaccoalchoholQuestionsTablePane:4:Q22Ans_DD", validateInput(strHashValue), "Q40", currentScreen);
							break;
						case"REMARKS":
							blnStatus = setValue(WebControl.CHECKBOX, IdentifyBy.NAME, "form_ax2InsuredInfoJI:MoneyPaid:otherDetail_RB", validateInput(strHashValue), "Is there anything else in the Remarks section that was not data entered elsewhere that affects underwriting?", currentScreen);
							break;

						
														
						
						
						} //end of switch
						if(!blnStatus) break;
					} //end of while
				}
				else {
					ReportGenerator.generateTestStep(false, currentScreen, "Switch to Frame", "Failed to switch frames " + strFrames.replaceAll(GlobalData.STRING_SEPARATOR, " > "), false);
					blnStatus = false;
				}
				objEnum = null;
					
			} catch(Exception objExp) {
				ReportGenerator.generateTestStep(false, currentScreen, "Exception occured", "Exception is - " + objExp.getMessage(), false);
				blnStatus = false;
			}
			return blnStatus;
		}
		
		private static boolean PrefferdProcessingScreen(OrderedHashtable objTestData) {
			boolean blnStatus = false;
						
			String strHashKey = "", strHashValue = "";
			
			try {
				String cHandle = gobjWebDriver.getWindowHandle();
				System.out.println("Parent window in PrefferdProcessingScreen - " + cHandle);
				
				
				String strFrames = "mainContentFrame";
				Enumeration objEnum = objTestData.enumerateKeys();
				
				if(waitForWindowAndSwitch(cHandle, strFrames)) {
					
					while(objEnum.hasMoreElements()) {
						
						strHashKey = objEnum.nextElement().toString();
						strHashValue = objTestData.get(strHashKey).toString();

						switch(strHashKey) {
						case "AGE_QUALITYTYPE":
						blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_prefNavigation:prefNavigation:ghcpAgeQualType", strHashValue, "AGE_QUALITYTYPE", currentScreen);
							break;
						case "PRESSURE_QUALITYTYPE":
							blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_prefNavigation:prefNavigation:ghcpBloodPressureQualType", strHashValue, "PRESSURE_QUALITYTYPE", currentScreen);
							
							break;
						case "VEHICAL_QUALITYTYPE":							
							blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_prefNavigation:prefNavigation:ghcpMotorVehicleQualType", strHashValue, "VEHICAL_QUALITYTYPE", currentScreen);
							break;
						case "HISTIRY_QUALITYTYPE":
							blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_prefNavigation:prefNavigation:ghcpFamilyHistoryQualType", strHashValue, "HISTIRY_QUALITYTYPE", currentScreen);
							
							
							break;
						case "BUILD_QUALITYTYPE":
							blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_prefNavigation:prefNavigation:ghcpBuildQualType", validateInput(strHashValue), "BUILD_QUALITYTYPE", currentScreen);
							break;
						case "CHOLESTROL_QUALITYTYPE":
							blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_prefNavigation:prefNavigation:ghcpCholestrolQualType", validateInput(strHashValue), "CHOLESTROL_QUALITYTYPE", currentScreen);
							break;
						case "SMOKERSTAT_QUALITYTYPE":
							blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_prefNavigation:prefNavigation:ghcpSmokerStatQualType", validateInput(strHashValue), "SMOKERSTAT_QUALITYTYPE", currentScreen);
							break;
						case "REGULAREXERCISE_QUALITYTYPE":
							blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_prefNavigation:prefNavigation:ghcpRegularExcerciseQualType", validateInput(strHashValue), "REGULAREXERCISE_QUALITYTYPE", currentScreen);
							break;
						case "RXSCORE_QUALITYTYPE":
							blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_prefNavigation:prefNavigation:ghcpRxscoreQualType", validateInput(strHashValue), "RXSCORE_QUALITYTYPE", currentScreen);
							break;
						case "FIRST_EF6XERC_QUALITYTYPE":
							blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_prefNavigation:prefNavigation:pInsured1First_EF6Exerc", validateInput(strHashValue), "FIRST_EF6XERC_QUALITYTYPE", currentScreen);
							break;
						
						case "FIRST_RXHS_QUALITYTYPE":
							blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_prefNavigation:prefNavigation:pInsured1First_RxHS", validateInput(strHashValue), "FIRST_RXHS_QUALITYTYPE", currentScreen);
							break;	
						
						case "FIRST_RXOR_QUALITYTYPE":
							blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_prefNavigation:prefNavigation:pInsured1First_RxOR", validateInput(strHashValue), "FIRST_RXOR_QUALITYTYPE", currentScreen);
							break;
						case "CREDIT_PROGRAM":
							blnStatus = setValue(WebControl.CHECKBOX, IdentifyBy.NAME, "form_prefNavigation:prefNavigation:apply", validateInput(strHashValue), "CREDIT_PROGRAM", currentScreen);
							waitForPageLoad(MAX_TIMEOUT);
							break;
						case "CLOSE":
							
							cHandle = gobjWebDriver.getWindowHandle();
							waitForWindowAndSwitch(cHandle, strFrames);
							
							cHandle = gobjWebDriver.getWindowHandle();
							blnStatus = setValue(WebControl.BUTTON, IdentifyBy.NAME, "form_prefNavigation:prefNavigation:prfCb1", validateInput(strHashValue), "CLOSE", currentScreen);
							waitForPageClose(MIN_TIMEOUT);
							
							waitForWindowAndSwitch(cHandle, strFrames);
							break;
						case "COMMIT":
							cHandle = gobjWebDriver.getWindowHandle();
							blnStatus = setValue(WebControl.BUTTON, IdentifyBy.NAME, "form_prefNavigation:prefNavigation:prfCb1ghcp3", validateInput(strHashValue), "COMMIT", currentScreen);
							
							waitForPageClose(MIN_TIMEOUT);
							Thread.sleep(2000);
							waitForWindowAndSwitch(cHandle, strFrames);
							break;
						} //end of switch
						if(!blnStatus) break;
					} //end of while
					
				}
				else {
					ReportGenerator.generateTestStep(false, currentScreen, "Switch to PrefferdProcessingScreen", "Failed to switch PrefferdProcessingScreen", false);
					blnStatus = false;
				}
					
			} catch(Exception objExp) {
				ReportGenerator.generateTestStep(false, currentScreen, "Exception occured", "Exception is - " + objExp.getMessage(), false);
				blnStatus = false;
			}
			return blnStatus;
		}
		
		private static boolean QC_Review(OrderedHashtable objTestData) {
			boolean blnStatus = false;
			String strHashKey = "", strHashValue = "";
			try {
				String strFrames = "FWin0" + GlobalData.STRING_SEPARATOR + "Content0";
				Enumeration objEnum = objTestData.enumerateKeys();
				if(switchToFrame(strFrames, false) && waitForPageLoad(MAX_TIMEOUT)) {
					
					while(objEnum.hasMoreElements()) {
						//blnStatus = false;
						strHashKey = objEnum.nextElement().toString();
						strHashValue = objTestData.get(strHashKey).toString();

						switch(strHashKey) {
						
					
						case"QC_REVIEW":
							blnStatus = setValue(WebControl.RADIOBOX, IdentifyBy.NAME, "form_qualityControl:_id6", getAppRadioValues(strHashKey, strHashValue), "QC DECISION", currentScreen);
							break;
						case"COMMIT":
							blnStatus = setValue(WebControl.BUTTON, IdentifyBy.NAME, "form_qualityControl:_id13", validateInput(strHashValue), "COMMIT", currentScreen);
							waitForPageClose(MAX_TIMEOUT);
							break;
						case"CANCEL":
							blnStatus = setValue(WebControl.BUTTON, IdentifyBy.NAME, "form_qualityControl:_id12", validateInput(strHashValue), "CANCEL", currentScreen);
							break;
						} //end of switch
						if(!blnStatus) break;
					} //end of while
				}
				else {
					ReportGenerator.generateTestStep(false, currentScreen, "Switch to Frame", "Failed to switch frames " + strFrames.replaceAll(GlobalData.STRING_SEPARATOR, " > "), false);
					blnStatus = false;
				}
				objEnum = null;
					
			} catch(Exception objExp) {
				ReportGenerator.generateTestStep(false, currentScreen, "Exception occured", "Exception is - " + objExp.getMessage(), false);
				blnStatus = false;
			}
			return blnStatus;
		}
		
		private static boolean REG60Review(OrderedHashtable objTestData) {
			boolean blnStatus = false;
			String strHashKey = "", strHashValue = "";
			try {
				String strFrames = "FWin0" + GlobalData.STRING_SEPARATOR + "Content0";
				Enumeration objEnum = objTestData.enumerateKeys();
				if(switchToFrame(strFrames, false) && waitForPageLoad(MAX_TIMEOUT)) {
					
					while(objEnum.hasMoreElements()) {
						//blnStatus = false;
						strHashKey = objEnum.nextElement().toString();
						strHashValue = objTestData.get(strHashKey).toString();

						switch(strHashKey) {
						
					
						case"REG_60_REVIEW":
	                              blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_repl:itreg60Review", validateInput(strHashValue), "Reg 60 Review:", currentScreen);
							break;
						
						case"COMMIT":
							blnStatus = setValue(WebControl.BUTTON, IdentifyBy.NAME, "form_repl:rvCommit", validateInput(strHashValue), "COMMIT", currentScreen);
							break;
						case"CANCEL":
							blnStatus = setValue(WebControl.BUTTON, IdentifyBy.NAME, "form_repl:rvCancel", validateInput(strHashValue), "CANCEL", currentScreen);
							break;
						} //end of switch
						if(!blnStatus) break;
					} //end of while
				}
				else {
					ReportGenerator.generateTestStep(false, currentScreen, "Switch to Frame", "Failed to switch frames " + strFrames.replaceAll(GlobalData.STRING_SEPARATOR, " > "), false);
					blnStatus = false;
				}
				objEnum = null;
					
			} catch(Exception objExp) {
				ReportGenerator.generateTestStep(false, currentScreen, "Exception occured", "Exception is - " + objExp.getMessage(), false);
				blnStatus = false;
			}
			return blnStatus;
		}
		
		private static boolean REG60TodoList(OrderedHashtable objTestData) {
			boolean blnStatus = false;
			String strHashKey = "", strHashValue = "";
			try {
				
				Enumeration objEnum = objTestData.enumerateKeys();
				//if(waitForPageLoad(MAX_TIMEOUT)) {
				String cHandle = gobjWebDriver.getWindowHandle();
				System.out.println("Parent window in TodoList" + cHandle);
				/*waitForWindowAndSwitch(cHandle, "Accelerator Desktop", false);*/
				
				String strFrames = "mainContentFrame";
				//if(switchToFrame(strFrames, false) && waitForPageLoad(MAX_TIMEOUT)) {
				if(waitForWindowAndSwitch(cHandle, strFrames)) {
						while(objEnum.hasMoreElements()) {
							//blnStatus = false;
							strHashKey = objEnum.nextElement().toString();
							strHashValue = objTestData.get(strHashKey).toString();
							
							switch(strHashKey) {
								case "TYPE":
									
									
									
									List<WebElement> objMessages = gobjWebDriver.findElementsById("form_todo:tabHeader:toDoTable"); 

									if(objMessages.size()>0) {
										List<WebElement> objRows = getWebElements(objMessages.get(0), IdentifyBy.TAGNAME, "tr");
										if(objRows.size() > 0) {
											for(int intRows=0;intRows<objRows.size();intRows++) {
												
											List<WebElement> objCols = getWebElements(objRows.get(intRows), IdentifyBy.TAGNAME, "td");
											
											if(objCols.size()>0) {
												
												try{
													
													String Type_Value = objCols.get(1).getText();
													if(Type_Value.equalsIgnoreCase(strHashValue)){
														blnStatus = true;
														gobjWebDriver.manage().timeouts().pageLoadTimeout(MIN_TIMEOUT, TimeUnit.SECONDS);
														List<WebElement> objCheckbox = objCols.get(0).findElements(By.cssSelector("//input[type='image']"));
														if(objCheckbox.size()>0) objCheckbox.get(0).click();
													}
												} 
												catch(Exception obj){}
												if(blnStatus) {
													gobjWebDriver.manage().timeouts().setScriptTimeout(MAX_TIMEOUT, TimeUnit.SECONDS);
													break;
												}
												
											}
										}
										
									}
									
								}
									if(blnStatus) {
										ReportGenerator.generateTestStep(true, currentScreen, "Select Todo list item", "Todo list item " + strHashValue + " selected", true);
									}
									else {
										ReportGenerator.generateTestStep(false, currentScreen, "Select Todo list item", "Failed to select Todo list item " + strHashValue, true);
									}
									cHandle = gobjWebDriver.getWindowHandle();
									
									waitForPageClose(MAX_TIMEOUT);
									
									waitForWindowAndSwitch(cHandle, strFrames);
									break;
								case "default1":
									ReportGenerator.generateTestStep(false, currentScreen, "Field Navigation", strHashKey + " field not available in the current method.", false);
									break;
							} //end of switch
							if(!blnStatus) break;
						} //end of while
					}
					else {
						ReportGenerator.generateTestStep(false, currentScreen, "Switch to Frame", "Failed to switch frames " + strFrames.replaceAll(GlobalData.STRING_SEPARATOR, " > "), false);
						blnStatus = false;
					}
					objEnum = null;
				//}
					
			} catch(Exception objExp) {
				ReportGenerator.generateTestStep(false, currentScreen, "Exception occured", "Exception is - " + objExp.getMessage(), false);
				blnStatus = false;
			}
			return blnStatus;
		}
		
		private static boolean RETENSION_CALCULATOR(OrderedHashtable objTestData) {
			boolean blnStatus = false;
			
			String strHashKey = "", strHashValue = "";
			try {
				String strFrames = "FWin0" + GlobalData.STRING_SEPARATOR + "Content0" ;
				Enumeration objEnum = objTestData.enumerateKeys();
				
					if(switchToFrame(strFrames, false) && waitForPageLoad(MAX_TIMEOUT)) {
						gobjWebDriver.getKeyboard().sendKeys(Keys.PAGE_DOWN);
						Thread.sleep(2000);
						while(objEnum.hasMoreElements()) {
							//blnStatus = false;
							strHashKey = objEnum.nextElement().toString();
							strHashValue = objTestData.get(strHashKey).toString();
							
							switch(strHashKey) {
							
							case"RATECLASS":
								
								
								
								blnStatus = setValue(WebControl.SELECT, IdentifyBy.ID, "form_reinsuranceCalculator:uwClass_DD", validateInput(strHashValue), "Rate Class", currentScreen);
								
								break;
							case"TABLERATING":
								blnStatus = setValue(WebControl.SELECT, IdentifyBy.ID, "form_reinsuranceCalculator:uwRating_OT", strHashKey, "Table rating", currentScreen);
								break;
						
							case"ROPR_AMOUNT":
								blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_reinsuranceCalculator:roprAmt1_OT", validateInput(strHashValue), "ROPR Amount", currentScreen);
								break;
							
							case"UNDERWRITING":
								 scrollDown();
								
								 blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_reinsuranceCalculator:uwType_DD", validateInput(strHashValue), "Underwriting", currentScreen);
								break;
							
							case"RETAINEDAMOUNT":
								
								blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_reinsuranceCalculator:sRetAmtValue_OT", validateInput(strHashValue), "Retained Amount", currentScreen);
								break;
								
							case"OUTPUT":
								scrollDown();
								blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_reinsuranceCalculator:ouputMsg_IT", validateInput(strHashValue), "Output", currentScreen);
								break;
							case"CEEDEDAMOUNT":
								
								blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_reinsuranceCalculator:sCededAmtValue_OT", validateInput(strHashValue), "Ceeded Amount", currentScreen);
								break;
							case"JRETAINEDAMOUNT":
							
								blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_reinsuranceCalculator:jRetAmtValue_OT", validateInput(strHashValue), "JRetained Amount", currentScreen);
								break;
							case"SAVE":
								scrollDown();
								blnStatus = setValue(WebControl.BUTTON, IdentifyBy.NAME, "form_reinsuranceCalculator:save_cb", strHashKey, "Save", currentScreen);
								
								break;
							case"CALCULATE":
								scrollDown();
								blnStatus = setValue(WebControl.BUTTON, IdentifyBy.NAME, "form_reinsuranceCalculator:commit_cb", strHashKey, "Calculate", currentScreen);
								
								break;
							case"CLOSE":
								WebElement element = gobjWebDriver.findElement(By.name("form_reinsuranceCalculator:close_cb"));
								JavascriptExecutor executor = (JavascriptExecutor)gobjWebDriver;
								executor.executeScript("arguments[0].click();", element);
								ReportGenerator.generateTestStep(true, currentScreen, "Click Close", "Successfully clicked", true);
								break;
							case "default1":
								ReportGenerator.generateTestStep(false, currentScreen, "Field Navigation", strHashKey + " field not available in the current method.", false);
								break;
								
								
							
							} //end of switch
							if(!blnStatus) break;
						} //end of while
					}
					else {
						ReportGenerator.generateTestStep(false, currentScreen, "Switch to Frame", "Failed to switch frames " + strFrames.replaceAll(GlobalData.STRING_SEPARATOR, " > "), false);
						blnStatus = false;
					}
					objEnum = null;
				//}
					
			} catch(Exception objExp) {
				ReportGenerator.generateTestStep(false, currentScreen, "Exception occured", "Exception is - " + objExp.getMessage(), false);
				blnStatus = false;
			}
			return blnStatus;
		}
		
		private static boolean DisagreeWithJet(OrderedHashtable objTestData) {
			boolean blnStatus = false;
			String strHashKey = "", strHashValue = "";
			try {
				String strFrames = "FWin0" + GlobalData.STRING_SEPARATOR + "Content0";
				Enumeration objEnum = objTestData.enumerateKeys();
				if(switchToFrame(strFrames, false) && waitForPageLoad(MAX_TIMEOUT)) {
					
					while(objEnum.hasMoreElements()) {
						//blnStatus = false;
						strHashKey = objEnum.nextElement().toString();
						strHashValue = objTestData.get(strHashKey).toString();

						switch(strHashKey) {
						case"REASON_SELECTION":   
							blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_predictiveReasonView:reasonList", validateInput(strHashValue), "Reason Selection", currentScreen);
					   
							break;
						case"ADD":
							blnStatus = setValue(WebControl.BUTTON, IdentifyBy.NAME, "form_predictiveReasonView:drAdd", validateInput(strHashValue), "Add", currentScreen);
							
							break;
							
						case"UPDATE":
							blnStatus = setValue(WebControl.BUTTON, IdentifyBy.NAME, "form_predictiveReasonView:drUpdate", validateInput(strHashValue), "Update", currentScreen);
							waitForPageClose(MAX_TIMEOUT);
							
							break;
						case "default1":
							ReportGenerator.generateTestStep(false, currentScreen, "Field Navigation", strHashKey + " field not available in the current method.", false);
							break;
						
					
						} //end of switch
						if(!blnStatus) break;
					} //end of while
				}
				else {
					ReportGenerator.generateTestStep(false, currentScreen, "Switch to Frame", "Failed to switch frames " + strFrames.replaceAll(GlobalData.STRING_SEPARATOR, " > "), false);
					blnStatus = false;
				}
				objEnum = null;
					
			} catch(Exception objExp) {
				ReportGenerator.generateTestStep(false, currentScreen, "Exception occured", "Exception is - " + objExp.getMessage(), false);
				blnStatus = false;
			}
			return blnStatus;
		}
		
		private static boolean Predictive(OrderedHashtable objTestData) {
			boolean blnStatus = false;
			String strHashKey = "", strHashValue = "";
			try {
				String strFrames = "mainContentFrame" + GlobalData.STRING_SEPARATOR + "contentRightFrame" + GlobalData.STRING_SEPARATOR + "file";
				Enumeration objEnum = objTestData.enumerateKeys();
				if(switchToFrame(strFrames, false) && waitForPageLoad(MAX_TIMEOUT)) {
					
					while(objEnum.hasMoreElements()) {
						//blnStatus = false;
						strHashKey = objEnum.nextElement().toString();
						strHashValue = objTestData.get(strHashKey).toString();

						switch(strHashKey) {
						case"JET_DECISION":
							blnStatus = setValue(WebControl.BUTTON, IdentifyBy.NAME, "form_predictiveOverview:predResults:predictiveResults_DT:0:uwdecisionReason_CButton", validateInput(strHashValue), "Jet Decision", currentScreen);
							
							break;
						
							
						case"COMMIT":
							blnStatus = setValue(WebControl.BUTTON, IdentifyBy.NAME, "form_predictiveOverview:btnCommCommit", validateInput(strHashValue), "Commit", currentScreen);
							waitForPageClose(MAX_TIMEOUT);
							strFrames = "mainContentFrame" + GlobalData.STRING_SEPARATOR + "contentLeftFrame" + GlobalData.STRING_SEPARATOR + "file"  + GlobalData.STRING_SEPARATOR + "file"  ;
							if(switchToFrame(strFrames, false)) waitForPageLoad(MAX_TIMEOUT);
							break;
						case "default1":
							ReportGenerator.generateTestStep(false, currentScreen, "Field Navigation", strHashKey + " field not available in the current method.", false);
							break;
						
					
						} //end of switch
						if(!blnStatus) break;
					} //end of while
				}
				else {
					ReportGenerator.generateTestStep(false, currentScreen, "Switch to Frame", "Failed to switch frames " + strFrames.replaceAll(GlobalData.STRING_SEPARATOR, " > "), false);
					blnStatus = false;
				}
				objEnum = null;
					
			} catch(Exception objExp) {
				ReportGenerator.generateTestStep(false, currentScreen, "Exception occured", "Exception is - " + objExp.getMessage(), false);
				blnStatus = false;
			}
			return blnStatus;
		}
		
		private static boolean PrintPreview(OrderedHashtable objTestData) {
			boolean blnStatus = false;
			String strHashKey = "", strHashValue = "";
			try {
				String strFrames =  "FWin0" + GlobalData.STRING_SEPARATOR + "Content0";
				Enumeration objEnum = objTestData.enumerateKeys();
				if(switchToFrame(strFrames, false) && waitForPageLoad(MAX_TIMEOUT)) {
					
					while(objEnum.hasMoreElements()) {
						//blnStatus = false;
						strHashKey = objEnum.nextElement().toString();
						strHashValue = objTestData.get(strHashKey).toString();

						switch(strHashKey) {
						case"PRINT_CONDITION":
							blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_printPreview:printNIGOCond_DD", validateInput(strHashValue), "Print Condition", currentScreen);
							break;
						case"NIGO_REASON":
							blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_printPreview:printNIGOReason_TA", validateInput(strHashValue), "Nigo reason", currentScreen);
							break;
						case"RESOLVE_NIGO":
							blnStatus = setValue(WebControl.CHECKBOX, IdentifyBy.NAME, "form_printPreview:ResolvedNIGO_CB", validateInput(strHashValue), "Resolve Nigo", currentScreen);
						break;
						case"PRINTPREVIEW_ADD":
							blnStatus = setValue(WebControl.BUTTON, IdentifyBy.NAME, "form_printPreview:printPreviewAdd_CButton", validateInput(strHashValue), "Print preview add", currentScreen);
							break;
						case"PRINTPREVIEW_COMMIT":
							blnStatus = setValue(WebControl.BUTTON, IdentifyBy.NAME, "form_printPreview:printNIGOCommit", validateInput(strHashValue), "Print preview Commit", currentScreen);
							waitForPageClose(MIN_TIMEOUT);
							break;
						case "default1":
							ReportGenerator.generateTestStep(false, currentScreen, "Field Navigation", strHashKey + " field not available in the current method.", false);
							break;
						
					
						} //end of switch
						if(!blnStatus) break;
					} //end of while
				}
				else {
					ReportGenerator.generateTestStep(false, currentScreen, "Switch to Frame", "Failed to switch frames " + strFrames.replaceAll(GlobalData.STRING_SEPARATOR, " > "), false);
					blnStatus = false;
				}
				objEnum = null;
					
			} catch(Exception objExp) {
				ReportGenerator.generateTestStep(false, currentScreen, "Exception occured", "Exception is - " + objExp.getMessage(), false);
				blnStatus = false;
			}
			return blnStatus;
		}
		private static boolean LtcsrDeny(OrderedHashtable objTestData) {
			boolean blnStatus = false;
			String strHashKey = "", strHashValue = "";
			try {
				String strFrames =  "FWin0" + GlobalData.STRING_SEPARATOR + "Content0";
				Enumeration objEnum = objTestData.enumerateKeys();
				if(switchToFrame(strFrames, false) && waitForPageLoad(MAX_TIMEOUT)) {
					
					while(objEnum.hasMoreElements()) {
						//blnStatus = false;
						strHashKey = objEnum.nextElement().toString();
						strHashValue = objTestData.get(strHashKey).toString();

						switch(strHashKey) {
					
						case"REASON_SELECTION":
							blnStatus = setValue(WebControl.RADIOBOX, IdentifyBy.NAME, "form_reasonView:reasonType_RB1", getAppRadioValues(strHashKey, strHashValue), "Reason Selection", currentScreen);
							
							Thread.sleep(2000);
							break;
						case"DENY_REASON":
							blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_reasonView:reasonList", validateInput(strHashValue), "Deny reason", currentScreen);
							break;
							
						case"DENY_ADD":
							blnStatus = setValue(WebControl.BUTTON, IdentifyBy.NAME, "form_reasonView:drAdd", validateInput(strHashValue), "Deny Add", currentScreen);
							waitForPageClose(MIN_TIMEOUT);
							break;
						case"DENY_UPDATE":
							blnStatus = setValue(WebControl.BUTTON, IdentifyBy.NAME, "form_reasonView:drUpdate", validateInput(strHashValue), "Deny update", currentScreen);
							waitForPageClose(MIN_TIMEOUT);
							break;
						
						case "default1":
							ReportGenerator.generateTestStep(false, currentScreen, "Field Navigation", strHashKey + " field not available in the current method.", false);
							break;
						
					
						} //end of switch
						if(!blnStatus) break;
					} //end of while
				}
				else {
					ReportGenerator.generateTestStep(false, currentScreen, "Switch to Frame", "Failed to switch frames " + strFrames.replaceAll(GlobalData.STRING_SEPARATOR, " > "), false);
					blnStatus = false;
				}
				objEnum = null;
					
			} catch(Exception objExp) {
				ReportGenerator.generateTestStep(false, currentScreen, "Exception occured", "Exception is - " + objExp.getMessage(), false);
				blnStatus = false;
			}
			return blnStatus;
		}
		
		private static boolean verifyPopupMessage(String message) {
			//String strMessage = "No Images to display";
			boolean blnStatus = false;
			String strFrames = "FWin0" + GlobalData.STRING_SEPARATOR + "Content0" ;
			try {
				if(switchToFrame(strFrames, true)) {
					
					String Error_Msg=gobjWebDriver.findElement(By.id("errors")).getText().trim();
					System.out.println(Error_Msg);
					
					if(Error_Msg.contains(message))
					{
						gobjWebDriver.findElement(By.id("ok")).click();
						blnStatus = true;
					}
					
					waitForPageClose(MIN_TIMEOUT);
				
				}
			} catch (InterruptedException e) {
				System.out.println("Error - " + e.getMessage());
			}
			return blnStatus;
		}
		private static boolean VerifyNLGDATE(String value) {
			boolean blnStatus = false;
			
			
		
			try {
				String strFrames = "mainContentFrame" + GlobalData.STRING_SEPARATOR + "contentRightFrame" + GlobalData.STRING_SEPARATOR + "file"+ GlobalData.STRING_SEPARATOR + "covClientFrame1"+ GlobalData.STRING_SEPARATOR + "file";
				if(switchToFrame(strFrames, false) && waitForPageLoad(MAX_TIMEOUT)) {
					WebElement objMessage = getWebElement(IdentifyBy.ID, "form_CoverageClientTable1:navigation1:client1Table");
					if(objMessage!=null) {
						List<WebElement> objRows = getWebElements(objMessage, IdentifyBy.TAGNAME, "tr");
						
						for(int intCounter=0;intCounter<objRows.size();intCounter++) {
							List<WebElement> objCols = getWebElements(objRows.get(intCounter), IdentifyBy.TAGNAME, "td");
							if(intCounter==2){
							if(objCols.size()>0) {
								
								
								strceasedate = objCols.get(4).getText();
								if(strceasedate.equals(value)) {
									blnStatus = true;
									
									break;
									
								}
							}
							}
						}
						
					
					}
				}
				
				
				
					
			} catch(Exception objExp) {
				ReportGenerator.generateTestStep(false, currentScreen, "Exception occured", "Exception is - " + objExp.getMessage(), false);
				blnStatus = false;
			}
			
			return blnStatus;
		}
		private static boolean Amendment(OrderedHashtable objTestData) {
			boolean blnStatus = false;
			String strHashKey = "", strHashValue = "";
			 //String Popuptext = "";
			try {
				String strFrames = "FWin0" + GlobalData.STRING_SEPARATOR + "Content0";
				String strFrames1 = "FWin1" + GlobalData.STRING_SEPARATOR + "Content1" ;
				Enumeration objEnum = objTestData.enumerateKeys();
				if(switchToFrame(strFrames, false) && waitForPageLoad(MAX_TIMEOUT)) {
					
					while(objEnum.hasMoreElements()) {
						//blnStatus = false;
						strHashKey = objEnum.nextElement().toString();
						strHashValue = objTestData.get(strHashKey).toString();

						switch(strHashKey) {
						case "FOR":
							blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_overrideAutoClosure1:_id4", validateInput(strHashValue), "For", currentScreen);
							break;
						case"AMEND_TYPE_Radio":									        
							blnStatus = setValue(WebControl.RADIOBOX, IdentifyBy.NAME, "form_overrideAutoClosure1:_id9", getAppRadioValues(strHashKey, strHashValue), "TYPE Radio bUtton", currentScreen);
							waitForPageLoad(MAX_TIMEOUT);
							break;
						
						case"AMEND_TYPE":
							blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_overrideAutoClosure1:_id11", validateInput(strHashValue), "AMEND TYPE RM", currentScreen);
							waitForPageLoad(MAX_TIMEOUT);
							break;
						case"AMEND_FORM_Radio":
							blnStatus = setValue(WebControl.RADIOBOX, IdentifyBy.NAME, "form_overrideAutoClosure1:_id15", getAppRadioValues(strHashKey, strHashValue), "FORM Radio bUtton", currentScreen);
							break;
							
						case"AMEND_FORM":
							blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_overrideAutoClosure1:_id17", validateInput(strHashValue), "AMEND FORM", currentScreen);
							break;
						case"AMEND_FORM_QUESTION":
							blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_overrideAutoClosure1:_id20", validateInput(strHashValue), "AMEND FORM QUESTION", currentScreen);
							break;
						case"Message":
							blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_overrideAutoClosure1:_id24", validateInput(strHashValue), "textbox:", currentScreen);
							break;
							
						case"AMEND_RM_ADD":
							scrollDown();											  
							blnStatus = setValue(WebControl.BUTTON, IdentifyBy.NAME, "form_overrideAutoClosure1:amendEndorseAdd_CButton", validateInput(strHashValue), "Amend ADD", currentScreen);
							Thread.sleep(2000);
							waitForPageLoad(MAX_TIMEOUT);
							break;
						case"Amendment_Verify":
							
							
							try {
								if(switchToFrame(strFrames1, true)) {
									
									String Error_Msg=gobjWebDriver.findElement(By.id("errors")).getText().trim();
									System.out.println(Error_Msg);
									
									if(Error_Msg.contains("An Amendment/Endorsement for the selected Type already exists"))
									{
										try{
										gobjWebDriver.findElement(By.id("ok")).click();
										}
										catch(Exception exp){}
										ReportGenerator.generateTestStep(true, currentScreen, "POPUP", " displayed successfully " , true);
										
										blnStatus =true;
										switchToFrame(strFrames, true);
										
								
									
									}
									else {
										ReportGenerator.generateTestStep(false, currentScreen, "POpup", "  is not displayed " , false);
										blnStatus =false;
									}
									
									waitForPageClose(MIN_TIMEOUT);
								
								}
							}
							
							catch (InterruptedException e) {
								System.out.println("Error - " + e.getMessage());
							}
								
							break;
						case"AMEND_CANCEL":
							scrollDown();											  
							blnStatus = setValue(WebControl.BUTTON, IdentifyBy.NAME, "form_overrideAutoClosure1:overrideCancel_CButton", validateInput(strHashValue), "Amend CANCEL", currentScreen);
							Thread.sleep(2000);
							waitForPageClose(MAX_TIMEOUT);
							break;
							
						
						case"AMEND_RM_COMMIT_POPUPVERIFY":
							 scrollDown();
									 
							 try{
								
								 blnStatus = setValue(WebControl.BUTTON, IdentifyBy.NAME, "form_overrideAutoClosure1:overrideCommit_CButton", validateInput(strHashValue), "Amend", currentScreen);
								//System.out.println(gobjWebDriver.switchTo().alert().getText()) ;
								 System.out.println(Popuptext);
								 Thread.sleep(2000);
								
								if(Popuptext.contains("Please ensure that changes are made to the application, if necessary")){
									 ReportGenerator.generateTestStep(true, currentScreen, "Alert message", "Successfully displayed", true);
											
									 System.out.println(gobjWebDriver.switchTo().alert().getText().compareTo("Please ensure that changes are made to application") );
									}
								else
									{
										 ReportGenerator.generateTestStep(false, currentScreen, "Alert message", "is different", false);
										 blnStatus = false;	
										
									}
									
								 }
							 catch(Exception exp)
								 {}
								 
								 try{
										
									 WebElement element = gobjWebDriver.findElement(By.name("form_overrideAutoClosure1:overrideCommit_CButton"));
									 JavascriptExecutor executor = (JavascriptExecutor)gobjWebDriver;
									 executor.executeScript("arguments[0].click();", element);
									 ReportGenerator.generateTestStep(true, currentScreen, "Click AMEND/ENDORSE_COMMIT", "Successfully clicked", true);
									 blnStatus = true;
								 }
								 catch(Exception exp)
								 {}
							
							break;
						case"AMEND_RM_COMMIT":
							 scrollDown();
									 
							 try{
								
								 blnStatus = setValue(WebControl.BUTTON, IdentifyBy.NAME, "form_overrideAutoClosure1:overrideCommit_CButton", validateInput(strHashValue), "Click AMEND/ENDORSE_COMMIT", currentScreen);
							
								 
								 }
							 catch(Exception exp)
								 {}
								 
								 try{
										
									 WebElement element = gobjWebDriver.findElement(By.name("form_overrideAutoClosure1:overrideCommit_CButton"));
									 JavascriptExecutor executor = (JavascriptExecutor)gobjWebDriver;
									 executor.executeScript("arguments[0].click();", element);
									 ReportGenerator.generateTestStep(true, currentScreen, "Click AMEND/ENDORSE_COMMIT", "Successfully clicked", true);
									 blnStatus = true;
								 }
								 catch(Exception exp)
								 {}
							
							break;
						
						
						
						
						
						case "default1":
							ReportGenerator.generateTestStep(false, currentScreen, "Field Navigation", strHashKey + " field not available in the current method.", false);
							break;
											
						} //end of switch
						if(!blnStatus) break;
					} //end of while
				}
				else {
					ReportGenerator.generateTestStep(false, currentScreen, "Switch to Frame", "Failed to switch frames " + strFrames.replaceAll(GlobalData.STRING_SEPARATOR, " > "), false);
					blnStatus = false;
				}
				objEnum = null;
					
			} catch(Exception objExp) {
				ReportGenerator.generateTestStep(false, currentScreen, "Exception occured", "Exception is - " + objExp.getMessage(), false);
				blnStatus = false;
			}
			return blnStatus;
		}
		private static boolean VerifyChanges()
		{
			boolean blnStatus = false;
		try{
		String strFrames1 = "FWin0" + GlobalData.STRING_SEPARATOR + "Content0";
		String strFrames ="";
		
		if(switchToFrame(strFrames1, false)) 
				{						
					WebElement element = gobjWebDriver.findElement(By.name("form_overrideAutoClosure1:overrideCommit_CButton"));
					 JavascriptExecutor executor = (JavascriptExecutor)gobjWebDriver;
					 executor.executeScript("arguments[0].click();", element);
					 ReportGenerator.generateTestStep(true, currentScreen, "Click AMEND/ENDORSE_COMMIT", "Successfully clicked", true);
					
					 Thread.sleep(20000);
					    strFrames = "titleFrame" ;
						if(switchToFrame(strFrames, false))
						{
							Thread.sleep(5000);	
							WebElement element1 = gobjWebDriver.findElement(By.xpath("//img[@ src='images/arrow_right.gif']"));
							JavascriptExecutor executor1 = (JavascriptExecutor)gobjWebDriver;
							executor1.executeScript("arguments[0].click();", element1);
							Thread.sleep(5000);
							 ReportGenerator.generateTestStep(true, currentScreen, "RIGHT ARROW", "Successfully clicked", true);
							waitForPageLoad(MAX_TIMEOUT);
						}
						
						strFrames = "mainContentFrame" + GlobalData.STRING_SEPARATOR + "contentRightFrame" + GlobalData.STRING_SEPARATOR + "file";
						if(switchToFrame(strFrames, false))
						{	try{						
							blnStatus = setValue(WebControl.BUTTON, IdentifyBy.NAME, "form_appEntryOverview:_id8", validateInput("COMMIT"), "Commit", currentScreen);
							 blnStatus = true;
						}
						catch(Exception exp){
							
						}
						}
						else{
							ReportGenerator.generateTestStep(true, currentScreen, "Click COMMIT", "Successfully clicked", true);
						}
						
				}
		}
		catch(Exception Xp){
			ReportGenerator.generateTestStep(false, currentScreen, "Exception occured", "Unable to click AMEND/ENDORSE_COMMIT " , false);
			blnStatus = false;
		}
		return blnStatus;
		}
		private static boolean UWNIGO_RESOLVE(OrderedHashtable objTestData) {
			boolean blnStatus = false;
			String strHashKey = "", strHashValue = "";
			try {
				String cHandle = gobjWebDriver.getWindowHandle();
				System.out.println("Parent window in Add Comment - " + cHandle);
				/*waitForWindowAndSwitch(cHandle, "Accelerator Desktop", false);*/
				
				String strFrames = "mainContentFrame"+ GlobalData.STRING_SEPARATOR + "file";
				
				Enumeration objEnum = objTestData.enumerateKeys();
				
				if(waitForWindowAndSwitch(cHandle, "Resolve Print NIGO", false)) {
					
					while(objEnum.hasMoreElements()) {
						strHashKey = objEnum.nextElement().toString();
						strHashValue = objTestData.get(strHashKey).toString();

						switch(strHashKey) {
						
						case "NIGO_RESOLVE":
							List<WebElement> obj= gobjWebDriver.findElements(By.name("form_printResolve:printResolvedNIGO_CB"));
							if(obj.size()>0) {
								if(!obj.get(0).isSelected()){
									try{
										obj.get(0).click();
										ReportGenerator.generateTestStep(true, currentScreen, "NIGO_RESOLVE", "Clicked Successfully" , true);
									}catch(Exception obj1) {}
							
								}
							}
							blnStatus = true;
							
							break;
						case "UPDATE":
							
							blnStatus = setValue(WebControl.BUTTON, IdentifyBy.NAME, "form_printResolve:printResolveUpdate_CButton", validateInput(strHashValue), "UPDATE", currentScreen);
							
						
							break;
						case "NIGO_TYPE":
							blnStatus = selectWebtableRow(IdentifyBy.ID, "form_printResolve:printResolve_DataTable", strHashValue, "NIGO_TYPE", currentScreen);
							break;
						
						case "PRINT_NIGO_COMMIT":
							cHandle = gobjWebDriver.getWindowHandle();
							blnStatus = setValue(WebControl.BUTTON, IdentifyBy.NAME, "form_printResolve:printResolveNIGOCommit", validateInput(strHashValue), "PRINT_NIGO_COMMIT", currentScreen);
							waitForPageClose(MAX_TIMEOUT);
							waitForWindowAndSwitch(cHandle, "Accelerator Desktop", false);
							break;
						
						} //end of switch
						if(!blnStatus) break;
					} //end of while
				}
				else {
					ReportGenerator.generateTestStep(false, currentScreen, "Switch to Frame", "Failed to switch frames " + strFrames.replaceAll(GlobalData.STRING_SEPARATOR, " > "), false);
					blnStatus = false;
				}
				objEnum = null;
					
			} catch(Exception objExp) {
				ReportGenerator.generateTestStep(false, currentScreen, "Exception occured", "Exception is - " + objExp.getMessage(), false);
				blnStatus = false;
			}
			return blnStatus;
		}
		private static boolean DoctorInformation(OrderedHashtable objTestData) {
			boolean blnStatus = false;
			String strHashKey = "", strHashValue = "";
			try {
				String strFrames = "FWin0" + GlobalData.STRING_SEPARATOR + "Content0";
				Enumeration objEnum = objTestData.enumerateKeys();
				if(switchToFrame(strFrames, false) && waitForPageLoad(MAX_TIMEOUT)) {
					
					while(objEnum.hasMoreElements()) {
						//blnStatus = false;
						strHashKey = objEnum.nextElement().toString();
						strHashValue = objTestData.get(strHashKey).toString();

						switch(strHashKey) {
					
						case"PERSON_R_ENTITY":	
							blnStatus = setValue(WebControl.RADIOBOX, IdentifyBy.NAME, "form_doctor:personEntityType", getAppRadioValues(strHashKey, strHashValue), "PERSON RADIO", currentScreen);
							
							break;
						case"FNAME":
							blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_doctor:itdrFirstName", validateInput(strHashValue), "FNAME", currentScreen);
							break;
						case"LNAME":
							blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_doctor:itdrLastName", validateInput(strHashValue), "LNAME", currentScreen);
							break;
						case"ENTITY":													
							blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_doctor:entity_EF", validateInput(strHashValue), "ENTITY", currentScreen);
							break;
						case"ADDRESSL1":												
							blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_doctor:itdrAddrLine1", validateInput(strHashValue), "ADDRESSL1", currentScreen);
							break;
						case"ADDRESSL2":												
							blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_doctor:itdrAddrLine2", validateInput(strHashValue), "ADDRESSL2", currentScreen);
							break;
						case"CITY":														
							blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_doctor:itdrAddrCity", validateInput(strHashValue), "CITY", currentScreen);
							break;
						case "STATE":
							blnStatus = setValue(WebControl.SELECT, IdentifyBy.NAME, "form_doctor:itdrState", validateInput(strHashValue), "State/Province", currentScreen);
							break;
						
						case"ZIP/POSTAL":	
							blnStatus = setValue(WebControl.RADIOBOX, IdentifyBy.NAME, "form_doctor:sordrZipCode", getAppRadioValues(strHashKey, strHashValue), "ZIP RADIO", currentScreen);
							
							break;
						case"ZIP/POSTAL-CODE":                                          
							blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_doctor:itdrZipCode", validateInput(strHashValue), "ZIP/POSTAL-CODE", currentScreen);
							break;
						case"PHONE":
							blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_doctor:itdrPhone", validateInput(strHashValue), "PHONE", currentScreen);
							break;
						case"ADD":
							blnStatus = setValue(WebControl.BUTTON, IdentifyBy.NAME, "form_doctor:drAdd", validateInput(strHashValue), "ADD", currentScreen);
							
							break;
							
							
						case"UPDATE":
							blnStatus = setValue(WebControl.BUTTON, IdentifyBy.NAME, "form_doctor:drUpdate", validateInput(strHashValue), "UPDATE", currentScreen);
							break;
						case "default1":
							ReportGenerator.generateTestStep(false, currentScreen, "Field Navigation", strHashKey + " field not available in the current method.", false);
							break;
						} //end of switch
						if(!blnStatus) break;
					} //end of while
				}
				else {
					ReportGenerator.generateTestStep(false, currentScreen, "Switch to Frame", "Failed to switch frames " + strFrames.replaceAll(GlobalData.STRING_SEPARATOR, " > "), false);
					blnStatus = false;
				}
				objEnum = null;
					
			} catch(Exception objExp) {
				ReportGenerator.generateTestStep(false, currentScreen, "Exception occured", "Exception is - " + objExp.getMessage(), false);
				blnStatus = false;
			}
			return blnStatus;
		}
			private static String getAppCheckboxValues(String controlName, String inputValue) {
				String controlValue = "";
				switch(controlName){
					case "CHARITABLE_GIFTING":
						controlValue = "8";
						break;
					case "ACTION_CHECKBOX":
						controlValue = "on";
						break;
					case "ESTATE_PLANNING":
						controlValue = "10";
						break;
					case "FAMILY_PROTECTION":
						controlValue = "48";
						break;
					case "MORTGAGE":
						controlValue = "24";
						break;
					case "OTHER":
						controlValue = "2147483647";
						
						break;
					case "37A_INCOME":
						controlValue = "1009800007";
						break;
					case "37A_INVESTMENTS":
						controlValue = "1009800009";
					
						break;
					case "Q37A_LOANS":
						controlValue = "1009800002";
						break;
					case "Q37A_GIFTS":
						controlValue = "1009800008";
						break;
					case "Q37A_SETTLED_CONTRACTS":
						controlValue = "1009800010";
						break;
					case "Q37A_OTHER":
						controlValue = "2147483647";
						break;
					
					case"SEC_C_LONG_TERM_QUESTIONNAIRE":
						controlValue = "1009800010";
						break;
						
					case"SEC_C_OWNER_QUESTIONNAIRE":
						controlValue = "1009800001";
						break;
						
					case"SEC_TERM_POLICY":
						controlValue = "1009800009";
						break;
						
					case"SEC_C_FOREIGN_RESIDENCE":
						controlValue = "1009800002";
						break;
						
					case"SEC_C_MEDICAL_INFO":
						controlValue = "1009800003";
						break;
						
					case"SEC_C_FINANCIAL_INFO":
						controlValue = "1009800004";
						break;
						
					case"SEC_C_CHILDREN_TERM":
						controlValue = "1009800005";
						break;
						
					case"SEC_C_SUBSTANCE_USAGE":
						controlValue = "1009800006";
					break;
						
					case"SEC_C_AVIATION":
						controlValue = "1009800007";
						break;
						
					case"SEC_C_AVOCATION":
						controlValue = "1009800008";
					break;
					
					case"Q9O_CASH":
						controlValue = "1009800001";
						break;
					case"Q9O_BORROWING":
						controlValue = "1009800002";
						break;
					case"Q9O_ANNUITY":
						controlValue = "1009800003";
						break;
					case"Q9O_SALE_401K":
						controlValue = "1009800004";
						break;
					case "Q9O_SALE_NONLOADED_MUTUAL_FUND":
						controlValue = "1009800007";
						break;
					case"Q9O_SALE_LOADED_MUTUAL_FUND":
						controlValue = "1009800005";
						break;
					case"Q9O_SALE_IVESTMENT":
						controlValue = "1009800006";
						break;
					case"Q9O_OTHER":
						controlValue = "2147483647";
						break;
											
					case"BUY_SELL":
						controlValue = "35";
						break;
					case"DEFERRED_COMP":
							controlValue = "38";
							break;
							
					case"KEY_PERSON":
							controlValue = "36";
							break;
							
						case"LOAN__INDEMNIFICATION":
								controlValue = "39";
								break;
				
							case"Q29_INCOME":
								controlValue = "1009800007";
								break;
							
							case"Q29_INVESTMENTS":
								controlValue = "1009800009";
								break;
								
							case"Q29_LOANS":
								controlValue = "1009800002";
								break;
								
							case"Q29_GIFTS":
								controlValue = "1009800008";
								break;
								
							case"Q29_SETTLED_CONTRACTS":
								controlValue = "1009800010";
								break;
								
							case"Q29_OTHER":
								controlValue = "2147483647";
								break;
								
							
													

							case"IMPORTANCE_NOTICE":
								controlValue = "1009800001";
								break;
							case"RIDER_OUTLINE":
								controlValue = "1009800002";
								break;
							case"HEALTH_INSURANCE":
								controlValue = "1009800003";
								break;
							case"SHOPPERS_GUIDE":
								controlValue = "1009800004";
								break;
							case"LONG_TER":
								controlValue = "1009800005";
								break;
							case"NOTICE_TO_APPLICANT":
								controlValue = "1009800006";
								break;
							case"Q14P_CASH":
								controlValue = "1009800001";
								break;
							case"Q14P_BORROWING":
								controlValue = "1009800002";
								break;
							case"Q14P_ANNUITY":
								controlValue = "1009800003";
								break;
							case"Q14P_SALE_401K":
								controlValue = "1009800004";
								break;
							case"Q14P_SALE_LOADED_MUTUAL_FUND":
								controlValue = "1009800005";
								break;
							case"Q14P_SALE_IVESTMENT":
								controlValue = "1009800006";
								break;
							case"Q14P_OTHER":
								controlValue = "2147483647";
								break;
							case"Q17_CHARITABLE":
								controlValue = "8";
								break;
							case"Q17_ESTATE_PLANNING":
								controlValue = "10";
								break;
							case"Q17_FAMILY_PROTECTION":
								controlValue = "48";
								break;
							case"Q17_MORTGAGE":
								controlValue = "24";
								break;
							case"Q17_OTHER":
								controlValue = "2147483647";
								break;
							case"CLIENT_BROUCHER":
								controlValue = "1009800001";
								break;
							case"TERM_ANALYSIS":
								controlValue = "1009800013";
								break;
							case"VALUE_STAY_PARENT":
								controlValue = "1009800014";
								break;
							case"LIFE_SEC_GUIDE":
								controlValue = "1009800019";
								break;
							case"LIFE_PRIVATE_RESERVE":
								controlValue = "1009800022";
								break;
							case"BUY_SELL_PAY":
								controlValue = "1009800021";
								break;
							case"ROTH_ALTERNATIVE":
								controlValue = "1009800008";
								break;
							case"SMOOTH_SAILING":
								controlValue = "1009800007";
								break;
							case"FACT":
								controlValue = "1009800002";
								break;
							case"ROPR":
								controlValue = "1009800025";
								break;
							
						
				}
				inputValue = controlValue + GlobalData.STRING_SEPARATOR + inputValue;
				return inputValue;
			}
			
			private static String getAppRadioValues(String controlName, String inputValue) {
				OrderedHashtable objDataValues = new OrderedHashtable();
				switch(controlName){
					case "APPLICATION_ORIGIN":
						objDataValues.put("Formal", "1");
						objDataValues.put("Informal", "0");
						objDataValues.put("Formal Originating from Informal", "2");				
						break;
					case "UW_WITH_APPROPRIATE_AUTHORITY":
						objDataValues.put("Yes", "Yes");		
						break;
					case "MEDICAL_DIRECTOR":
						objDataValues.put("Yes", "Yes");		
						break;
					case "FDD":
						objDataValues.put("Yes", "Yes");		
						break;					
					case "CORPORATE":
						objDataValues.put("Yes", "Yes");		
						break;	
					case "AUD Letter":
						objDataValues.put("Yes", "Yes");		
						break;
					case "TAX_INFORMATION":
						objDataValues.put("Social Security", "1");
						objDataValues.put("Tax Identification", "2");
						objDataValues.put("Social Insurance", "3");
						break;
					case "PERSON_R_ENTITY":
						objDataValues.put("Person", "1");
						objDataValues.put("Entity", "2");
						break;
					case "Complex_Entity":
						objDataValues.put("Yes", "1");
						objDataValues.put("No", "2");
						break;
					case "INITIAL_ACCOUNT_TYPE":
						objDataValues.put("Checking", "2");
						objDataValues.put("Savings", "1");
						break;
					case "INITIAL_OWNER_TYPE":
						objDataValues.put("Individual", "1");
						objDataValues.put("Institution", "2");
						break;
					case "SSN_EIN_ITIN":
						objDataValues.put("SSN", "1");
						objDataValues.put("EIN", "8");
						objDataValues.put("ITIN", "2");
						break;
					case "VIEW":
						objDataValues.put("Full_View", "full");
						objDataValues.put("Tabbed_View", "tabbed");
						break;
					case "C_SSN_EIN":
						objDataValues.put("SSN", "1");
						objDataValues.put("EIN", "8");
						objDataValues.put("ITIN", "2");
						break;
					case "D_SSN_EIN":
						objDataValues.put("SSN", "1");
						objDataValues.put("EIN", "8");
						objDataValues.put("ITIN", "2");
						break;
					case "E_SSN_EIN":
						objDataValues.put("SSN", "1");
						objDataValues.put("EIN", "8");
						objDataValues.put("ITIN", "2");
						break;
						
					case"HEIGHT_FEET_INCHES":
						objDataValues.put("Feet and Inches", "3");
						objDataValues.put("Inches", "2");
						
						break;
					case"AMEND_TYPE_Radio":
						objDataValues.put("Type", "type");
				
						break;
					case"AMEND_FORM_Radio":
						objDataValues.put("Form", "form");
						break;
					case"Traded_company":
						objDataValues.put("Yes", "1");
						objDataValues.put("No", "2");
						break;
					case"Q10":
						objDataValues.put("None", "2");
						objDataValues.put("Answered", "1");
						objDataValues.put("Unanswered", "4");
						break;
					case"REASON_SELECTION":
						objDataValues.put("Selection", "1");
						
						break;
					case"ZIP/POSTAL":
						objDataValues.put("Zip", "1");
						objDataValues.put(" Postal", "2");
				
						break;
					case"REASON_FREE_FORM":
						objDataValues.put("Free-form", "2");
					
						break;
					case"ANNUAL_PREMIUM_R_EFT":
						objDataValues.put("Annual Premium", "1");
						objDataValues.put("Authorization for Monthly Electronic Funds Transfer", "4");
						
						break;
					case"ADD_OR_ORDER":
						objDataValues.put("Add", "23");
						objDataValues.put("Order", "22");
					case"AMEND_TYPE_RB":
						objDataValues.put("Type", "type");
				
						break;
					case"AMEND_FORM_RB":
						objDataValues.put("Form", "form");
						break;
                   case"SECOND_AUD":
						objDataValues.put("Miscfirstname misclastname", "4");
				
						break;
                   case"CONTRACT_REINSURANCE_TYPE":
           				objDataValues.put("Override TAI/Retained by AXA", "A");
           				objDataValues.put("Facultative", "F");
           				objDataValues.put("TAI Determined", "N");
           				break;
           			case"CREATE_REINSURANCE_LEVEL":
	           			objDataValues.put("Contract", "Contract");
	           			objDataValues.put("Coverage", "Coverage");
	           			break;
           			case"ACTION_SATISFY_WAIVE":
           				objDataValues.put("Satisfy", "7");
           				objDataValues.put("Waive", "3");
           				
           				break;
           			case"INFORMAL _APPROVAL":
						objDataValues.put("Offer Acceptance Pending", "1000500001");
						objDataValues.put("Offer Accepted", "1000500002");
						
						break;
           			case"LTC_PERSONAL":
						objDataValues.put("I choose not to complete this information", "2");
						objDataValues.put("The answers to the questions above describe my financial situation", "1");
						 
						break;
           			case"COMMENTS_TYPE":
          				objDataValues.put("Secure Note", "Secure");
          				objDataValues.put("General Comment", "General");
          				objDataValues.put("Special Instruction", "Special");
          				break;
           			case"FOLLOW_UP_PROACTIVE":
						objDataValues.put("Yes", "1");
						objDataValues.put("No", "2");
						break;
           			case"NEXT_FOLLOW_UP":
						objDataValues.put("Days", "1");
						objDataValues.put("Date", "2");
						break;
           			case"QC_REVIEW":
          				objDataValues.put("Pass", "1");
          				objDataValues.put("Fail", "2");
          				objDataValues.put("Bypass", "3");
          				break;
				}
				inputValue = objDataValues.get(inputValue).toString() + GlobalData.STRING_SEPARATOR + inputValue;
				return inputValue;
			}
			private static boolean VerifyContract(OrderedHashtable objTestData) {
				boolean blnStatus = false;
				
				String strHashKey = "", strHashValue = "";
				try {
					String strFrames =  "mainContentFrame" + GlobalData.STRING_SEPARATOR + "contentRightFrame"+ GlobalData.STRING_SEPARATOR +"nbaContextMenu";
					Enumeration objEnum = objTestData.enumerateKeys();
					//if(waitForPageLoad(MAX_MILSEC_TIMEOUT)) {
						if(switchToFrame(strFrames, false) && waitForPageLoad(MAX_TIMEOUT)) {
							while(objEnum.hasMoreElements()) {
								//blnStatus = false;
								strHashKey = objEnum.nextElement().toString();
								strHashValue = objTestData.get(strHashKey).toString();
								
								switch(strHashKey) {  
				
								case "VERIFY_CONTRACT_NUM":
									String Contract_Num = gobjWebDriver.findElement(By.id("contractNumber")).getText().trim();
									//	String Register_date = gobjWebDriver.findElement(By.xpath("//*[contains(@id,'form_ContractStatus:pgEffDate')]/..//span[@class='formDisplayDate']")).getText().trim();
										
											String strExpVal = validateInput(strHashValue);
											
											if(Contract_Num.contains(strExpVal)) {
												ReportGenerator.generateTestStep(true, currentScreen, "Verify Contract Number", "Contract Number mached. Expected is " + strExpVal, true);
												blnStatus=true;
											}
											else {
												ReportGenerator.generateTestStep(false, currentScreen, "Verify Register Date", "Contract Number not mached. Actual is " + Contract_Num + ". Expected is " + strExpVal, true);
											}
										
										break;
								case "default1":
									ReportGenerator.generateTestStep(false, currentScreen, "Field Navigation", strHashKey + " field not available in the current method.", false);
									break;
							
								} //end of switch
								if(!blnStatus) break;
							} //end of while
						}
						else {
							ReportGenerator.generateTestStep(false, currentScreen, "Switch to Frame", "Failed to switch frames " + strFrames.replaceAll(GlobalData.STRING_SEPARATOR, " > "), false);
							blnStatus = false;
						}
						objEnum = null;
					//}
						
				} catch(Exception objExp) {
					ReportGenerator.generateTestStep(false, currentScreen, "Exception occured", "Exception is - " + objExp.getMessage(), false);
					blnStatus = false;
				}
				return blnStatus;
				
			}
			//Function to fill Epolicy Ack form 
			private static boolean EpolicyAck(OrderedHashtable objTestData) {
				boolean blnStatus = false;			
				String strHashKey = "", strHashValue = "";
				try {
					String strFrames = "mainContentFrame" + GlobalData.STRING_SEPARATOR + "contentRightFrame" + GlobalData.STRING_SEPARATOR + "file"+ GlobalData.STRING_SEPARATOR + "file";;
					Enumeration objEnum = objTestData.enumerateKeys();
					if(switchToFrame(strFrames, false) && waitForPageLoad(MAX_TIMEOUT)) {
						
						while(objEnum.hasMoreElements()) {
							//blnStatus = false;
							strHashKey = objEnum.nextElement().toString();
							strHashValue = objTestData.get(strHashKey).toString();

							switch(strHashKey) {
				
							case"Owner_Email_Address":
								blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_ax2EPolicy:ax2ePolicy:email_EF", validateInput(strHashValue), "Owner Email Address", currentScreen);
								break;
							case"Signature_Owner":
								blnStatus = setValue(WebControl.CHECKBOX, IdentifyBy.NAME, "form_ax2EPolicy:ax2ePolicy:signatureofOwner_CB", validateInput(strHashValue), "Signature Owner", currentScreen);
								break;
							case"Owner_Date":
								blnStatus = setValue(WebControl.EDITBOX, IdentifyBy.NAME, "form_ax2EPolicy:ax2ePolicy:signedAtDate_EF", validateInput(strHashValue), "Owner Date", currentScreen);
								break;						
							case "default1":
								ReportGenerator.generateTestStep(false, currentScreen, "Field Navigation", strHashKey + " field not available in the current method.", false);
								break;
				
							} //end of switch
							if(!blnStatus) break;
						} //end of while
					}
					else {
						ReportGenerator.generateTestStep(false, currentScreen, "Switch to Frame", "Failed to switch frames " + strFrames.replaceAll(GlobalData.STRING_SEPARATOR, " > "), false);
						blnStatus = false;
					}
					objEnum = null;
						
				} catch(Exception objExp) {
					ReportGenerator.generateTestStep(false, currentScreen, "Exception occured", "Exception is - " + objExp.getMessage(), false);
					blnStatus = false;
				}
				return blnStatus;
			}
			private static String validateInput(String inputValue) {
				String strTemp = "";
				switch(inputValue) {
				/*case "GENERATE_LNAME":
				strTemp = DateFormats.getCurrentMonth() + StringFormats.getRandomString(4);
				DriverScript.gobjCurrentTest.setLastName(DriverScript.gobjEnvData.getNamePrefix() + strTemp);
				DriverScript.gobjCurrentTest.setFirstName("AUT" + strTemp);
				inputValue = DriverScript.gobjCurrentTest.getLastName();
				break;*/
			case "GENERATE_LNAME":
			strTemp = StringFormats.getRandomString(6);
			DriverScript.gobjCurrentTest.setLastName(DriverScript.gobjEnvData.getNamePrefix() + strTemp);
			DriverScript.gobjCurrentTest.setFirstName("ADELIA");
			inputValue = DriverScript.gobjCurrentTest.getLastName();
			break;
			/*case "GENERATE_SLNAME":
				strTemp = DateFormats.getCurrentMonth().toLowerCase() + StringFormats.getRandomString(4).toLowerCase();
				
				DriverScript.gobjCurrentTest.setLastName("reg" + strTemp);
				DriverScript.gobjCurrentTest.setFirstName("aut" + strTemp);
				inputValue = DriverScript.gobjCurrentTest.getLastName();
				break;*/
			case "GENERATE_SLNAME":
				strTemp = StringFormats.getRandomString(6).toLowerCase();
				
				DriverScript.gobjCurrentTest.setLastName("GUPTA" + strTemp);
				//DriverScript.gobjCurrentTest.setFirstName("ADELIA" + strTemp);
				DriverScript.gobjCurrentTest.setFirstName("ADELIA");
				inputValue = DriverScript.gobjCurrentTest.getLastName();
				break;
					case "SET_LASTNAME":
						if(DriverScript.gobjCurrentTest.getLastName()!=null) inputValue = DriverScript.gobjCurrentTest.getLastName();
						else inputValue = "";
						break;
					case "SET_FIRSTNAME":
						if(DriverScript.gobjCurrentTest.getFirstName()!=null) inputValue = DriverScript.gobjCurrentTest.getFirstName();
						else inputValue = "";
						break;
					case "SET_POLICY_NO":
						if(DriverScript.gobjCurrentTest.getPolicyNo()!=null) inputValue = DriverScript.gobjCurrentTest.getPolicyNo();
						else inputValue = "";
						break;
					case "GENERATE_SSN":
						inputValue = StringFormats.getRandomNumber(9);
						DriverScript.gobjCurrentTest.setSSNNo(inputValue);
						break;
					case "SET_SSN":
						if(DriverScript.gobjCurrentTest.getSSNNo()!=null) inputValue = DriverScript.gobjCurrentTest.getSSNNo();
						else inputValue = "";
						break;
					case "GENERATE_CONTRACT":
						inputValue = "IWP" + StringFormats.getRandomNumber(6);
						DriverScript.gobjCurrentTest.setcontract(inputValue);
						break;						
					case "TODAY":
						inputValue = DateFormats.getCurrentDate(inputValue);
						break;
					default:
						if(inputValue.contains(GlobalData.TODAY)) {
							inputValue = DateFormats.getCurrentDate(inputValue);
						}
						else if(inputValue.contains("SET_REG_DATE")) { //e.g. PREFILL|SET_REG_DATE
							inputValue = inputValue.replace("SET_REG_DATE", REG_DATE);
						}
						else if(inputValue.contains(GlobalData.DOB)) {
							inputValue = DateFormats.getCurrentDate(inputValue);
						}
				
				}
				return inputValue;
				
			}
	
		
}
