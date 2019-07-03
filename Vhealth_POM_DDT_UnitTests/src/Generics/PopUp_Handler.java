package Generics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import SetUp.LaunchSetup;

public class PopUp_Handler extends LaunchSetup {
	
	static WebDriver driver;
	
	@FindBy(how=How.XPATH, using="//button[text()='Yes']")
	@CacheLookup
	private static WebElement btn_Yes;
	
	@FindBy(how=How.XPATH, using="//button[text()='No']")
	@CacheLookup
	private static WebElement btn_No;
	
	@FindBy(how=How.XPATH, using="//button[text()='OK']")
	@CacheLookup
	private static WebElement btn_OK;
	
	@FindBy(how=How.CLASS_NAME, using="ext-mb-text")
	@CacheLookup
	private static WebElement getTxt_popup;
	
	
	public PopUp_Handler(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
	
	public static void click_popupBtn_Yes(){
		driver.switchTo().defaultContent();
		String str_popup_text=getTxt_popup.getText();
		Reporter.log("str_popup_text :"+str_popup_text,bool);
		btn_Yes.click();	
	}
	
	public static void click_popupBtn_No(){
		driver.switchTo().defaultContent();
		String str_popup_text=getTxt_popup.getText();
		Reporter.log("str_popup_text :"+str_popup_text,bool);
		btn_No.click();
		
	}
	
	public static void click_popupBtn_OK(){
		driver.switchTo().defaultContent();
		String str_popup_text=getTxt_popup.getText();
		Reporter.log("str_popup_text :"+str_popup_text,bool);
		btn_OK.click();	
	}

	
	public static String get_popUpMessage(){
		driver.switchTo().defaultContent();
		String str_popup_text=getTxt_popup.getText();
		Reporter.log("str_popup_text :"+str_popup_text,bool);
		return str_popup_text;	
	}
	
	
	
	
	
}
