package Pages;


import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage 
{

	@FindBy(id = "txtUserName")
	WebElement username;
	@FindBy(id = "txtPwd")
	WebElement password;
	@FindBy(id = "btnLogin")
	WebElement button_login;
	@FindBy(xpath = "//button[text()='OK']")
	WebElement button_OK;

	public LoginPage(WebDriver driver) {
		// initialize elements
		PageFactory.initElements(driver, this);

	}

	public void set_username(String usern) {
		username.clear();
		username.sendKeys(usern);
	}

	public void set_password(String userp) {
		password.clear();
		password.sendKeys(userp);
	}

	public void press_TAB() {
//		button.submit();
		username.sendKeys(Keys.TAB);
	}
	
	public void click_loginbutton() {
		button_login.click();
	}
	
	public void click_OKButton()
	{
		button_OK.click();
	}
}