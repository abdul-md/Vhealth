package Constants.LoginCredentials;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import SetUp.LaunchSetup;

public class Login_Credentials extends LaunchSetup{

	public static void adminLogin()
	{
	
//        driver.switchTo().activeElement().sendKeys("charaksupport");
//		driver.findElement(By.name("txtUserName")).sendKeys("VTL2400");
		driver.findElement(By.name("txtUserName")).sendKeys("charaksupport");
        ((JavascriptExecutor)driver).executeScript("document.getElementById('txtPwd').removeAttribute('disabled');");
		
        Actions act=new Actions(driver);
		act.sendKeys(Keys.TAB).build().perform();
		
		driver.findElement(By.name("txtPwd")).sendKeys("charak");		
		driver.findElement(By.id("btnLogin")).click();			
	
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//button[text()='Proceed']")).click();
//		PopUp_Handler.click_popupBtn_OK();	
		driver.switchTo().frame("ifrmWorkPage");

	}

	
}
