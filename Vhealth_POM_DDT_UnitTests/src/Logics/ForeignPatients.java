package Logics;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import Generics.ConstantsAll;
import SetUp.LaunchSetup;

public class ForeignPatients extends LaunchSetup {
	
	public static void foreignerVisaInfo() throws InterruptedException {
		driver.switchTo().defaultContent();
		driver.switchTo().frame(0);
		driver.findElement(By.id("rbtnForign")).click();
		driver.findElement(By.id("linkVisa")).click();
		driver.switchTo().defaultContent();
		driver.switchTo().frame("crkAscExtWindowPopupFrame");
		Select sel= new Select(driver.findElement(By.id("ddlCountry")));
		sel.selectByVisibleText("BERMUDA");
		ConstantsAll.calenderMultipleSelectByIndex_DatePickerToday(1);
		driver.findElement(By.id("txtPassPortNo")).sendKeys("173571");
		driver.findElement(By.id("txtVISANumber")).sendKeys("892642");
		driver.findElement(By.id("rbtnNonVirinchiMedVISA")).click();
		driver.findElement(By.id("txtRemarks")).sendKeys("Test Remarks");
		driver.findElement(By.id("//button[text()='Ok']")).click();
		ConstantsAll.calenderMultipleSelectByIndex_DatePickerToday(2);
		driver.findElement(By.id("btnSave")).click();
		
	}
	

}
