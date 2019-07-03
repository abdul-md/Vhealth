package Tests;

import org.testng.annotations.Test;
import Pages.LoginPage;
import org.testng.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.testng.annotations.BeforeTest;


public class LoginTest
{
WebDriver driver;

@BeforeTest
public void setup()
{
//    System.setProperty("webdriver.firefox.marionette","pathToGeckodriver");
	ProfilesIni allProfiles = new ProfilesIni();
	FirefoxProfile profile = allProfiles.getProfile("default");
	profile.setPreference("dom.max_script_run_time", 0);
	profile.setPreference("accessibility.typeaheadfind.enabletimeout", false);
	profile.setPreference("javascript.enabled", true);
	profile.setPreference("extensions.firebug.allPagesActivation", "on");
	driver=new FirefoxDriver(profile);
    driver.manage().window().maximize();
    driver.get("http://192.168.49.54/vh_48_2/security/loginpage.aspx");
//    driver.findElement(By.id("LinkLogin")).click();
}
@Test(priority=1)
public void verify1() throws InterruptedException
{
    LoginPage login=new LoginPage(driver);
    login.set_username("adm");
    login.press_TAB();
    login.set_password("adminhhrhhr");
    login.click_loginbutton();
    String actual=driver.findElement(By.xpath("//span[@class='ext-mb-text']")).getText();
    login.click_OKButton();
    Assert.assertEquals(actual,"User does not exist");
}
@Test(priority=2)
public void verify2() throws InterruptedException
{
    LoginPage login=new LoginPage(driver);
    login.set_username("admin");
    login.press_TAB();
    login.set_password("admrhrhrhr");
    login.click_loginbutton();
    String actual=driver.findElement(By.xpath("//span[@class='ext-mb-text']")).getText();
    login.click_OKButton();
    Assert.assertEquals(actual,"User does not exist");
}
@Test(priority=3)
public void verify3()
{
    LoginPage login=new LoginPage(driver);
    login.set_username("charaksupport");
    login.press_TAB();
    login.set_password("charak");
    login.click_loginbutton();
//  Assert.assertEquals(driver.findElement(By.xpath(".//*[@id='tdHeaderText']/b")).getText(), "Welcome to V-HEALTH");
    Assert.assertTrue(driver.getPageSource().contains("PatientBannerField"));
//  System.out.println(driver.getPageSource());
}

}