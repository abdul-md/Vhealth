package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ErVisitPage {

	
	@FindBy(id="lblFormName")
	@CacheLookup
	private WebElement title_lblFormName;
	
	@FindBy(id="lblHosp")
	private WebElement lbl_Hosp;
	
	@FindBy(id="lblHospName")
	private WebElement lbl_HospName;
	
	@FindBy(id="lblMsg")
	private WebElement lbl_Msg;
	
	@FindBy(id="lblLastOPNoVal")
	private WebElement lbl_Last_MRN_number;
	
	@FindBy(id="ddlPatientPrefix")
	private WebElement ddl_PatientPrefix;
	
	@FindBy(id="txtPatientFirstname")
	private WebElement txtBx_PatientFirstname;
	
	@FindBy(id="txtPatientMiddlename")
	private WebElement txtBx_PatientMiddlename;
	
	@FindBy(id="txtPatientLastname")
	private WebElement txtBx_PatientLastname;
	
	@FindBy(id="ddlCountries")
	private WebElement ddl_Countries;

	@FindBy(id="ddlStates")
	private WebElement ddl_States;
	
	@FindBy(className="x-combo-list-inner")
	private WebElement list_x_combo_list_inner;
	
	@FindBy(id="txtCity")
	private WebElement ddl_City;
	
	@FindBy(id="txt_Address2")
	private WebElement txtBx_Area;
	
	@FindBy(id="txtAddress1")
	private WebElement txtBx_Address1;
	
	@FindBy(id="txtPin")
	private WebElement txtBx_Pin;
	
	@FindBy(id="txtContactNo")
	private WebElement txtBx_ContactNo;
	
	@FindBy(id="ddlERPhy")
	private WebElement ddl_ER_Physician;
	
	@FindBy(id="ddlDoctor")
	private WebElement ddl_Doctor;
	
	@FindBy(id="ddlReason")
	private WebElement ddl_Reason;
	
	@FindBy(id="ddlGender")
	private WebElement ddl_Gender;
	
	@FindBy(id="ddlMartialStatus")
	private WebElement ddl_MartialStatus;
	
	@FindBy(id="txtAge")
	private WebElement txtBx_Age;
	
	@FindBy(id="ddlAge")
	private WebElement ddl_Age;
	
	@FindBy(id="rbtnYes")
	private WebElement rbtn_Yes;
	
	@FindBy(id="rbtnNo")
	private WebElement rbtn_No;
	
	@FindBy(id="ddlPatientCategory")
	private WebElement ddl_PatientCategory;
	
	@FindBy(id="txtRemarks")
	private WebElement txtBx_Remarks;
	
	@FindBy(id="chkMLC")
	private WebElement chkbx_MLC;
	
	@FindBy(id="txtMLC")
	private WebElement txtBx_MLC;
	
	@FindBy(id="lblopvisitno")
	private WebElement lbl_opvisitno;
	
	@FindBy(id="lblERnum")
	private WebElement lbl_ER_num;
	
	@FindBy(id="btnSave")
	private WebElement btn_Save;
	
	@FindBy(id="btnPrint")
	private WebElement btn_Print;
	
	@FindBy(id="btnReset")
	private WebElement btn_Reset;
	
	@FindBy(className="ext-mb-text")
	private WebElement popup_text;
	
	
	
	
	public ErVisitPage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}	
	

	public WebElement title_lblFormName(){
		return title_lblFormName;
	}
	
	public WebElement lbl_Hosp(){
		return lbl_Hosp;
	}
	
	public WebElement lbl_HospName(){
		return lbl_HospName;
	}
	
	public WebElement lbl_Msg(){
		return lbl_Msg;
	}
	
	public WebElement lbl_Last_MRN_number(){
		return lbl_Last_MRN_number;
	}
	
	public WebElement ddl_PatientPrefix(){
		return ddl_PatientPrefix;
	}
	
	public WebElement txtBx_PatientFirstname(){
		return txtBx_PatientFirstname;
	}
	
	public WebElement txtBx_PatientMiddlename(){
		return txtBx_PatientMiddlename;
	}
	
	public WebElement txtBx_PatientLastname(){
		return txtBx_PatientLastname;
	}
	
	public WebElement ddl_Countries(){
		return ddl_Countries;
	}
	
	public WebElement ddl_States(){
		return ddl_States;
	}
	
	public WebElement list_x_combo_list_inner(){
		return list_x_combo_list_inner;
	}
	
	public WebElement ddl_City(){
		return ddl_City;
	}
	
	public WebElement txtBx_Area(){
		return txtBx_Area;
	}
	
	public WebElement txtBx_Address1(){
		return txtBx_Address1;
	}
	
	public WebElement txtBx_Pin(){
		return txtBx_Pin;
	}
	
	public WebElement txtBx_ContactNo(){
		return txtBx_ContactNo;
	}
	
	public WebElement ddl_ER_Physician(){
		return ddl_ER_Physician;
	}
	
	public WebElement ddl_Doctor(){
		return ddl_Doctor;
	}
	
	public WebElement ddl_Reason(){
		return ddl_Reason;
	}
	
	public WebElement ddl_Gender(){
		return ddl_Gender;
	}
	
	public WebElement ddl_MartialStatus(){
		return ddl_MartialStatus;
	}
	
	public WebElement txtBx_Age(){
		return txtBx_Age;
	}
	
	public WebElement ddl_Age(){
		return ddl_Age;
	}
	
	public WebElement rbtn_Yes(){
		return rbtn_Yes;
	}
	
	public WebElement rbtn_No(){
		return rbtn_No;
	}
	
	public WebElement ddl_PatientCategory(){
		return ddl_PatientCategory;
	}
	
	public WebElement txtBx_Remarks(){
		return txtBx_Remarks;
	}
	
	public WebElement chkbx_MLC(){
		return chkbx_MLC;
	}
	
	public WebElement lbl_opvisitno(){
		return lbl_opvisitno;
	}
	
	public WebElement txtBx_MLC(){
		return txtBx_MLC;
	}
	
	public WebElement lbl_ER_num(){
		return lbl_ER_num;
	}
	
	public WebElement btn_Save(){
		return btn_Save;
	}
	
	public WebElement btn_Print(){
		return btn_Print;
	}
	
	public WebElement btn_Reset(){
		return btn_Reset;
	}
	
	public WebElement popup_text(){
		return popup_text;
	}
	
	
}