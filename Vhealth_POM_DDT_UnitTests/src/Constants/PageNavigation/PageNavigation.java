package Constants.PageNavigation;

import org.openqa.selenium.By;


import Generics.All_Buttons;
import SetUp.LaunchSetup;

public class PageNavigation extends LaunchSetup{
	
	public static void ER_ErVisit(){
		All_Buttons.homeButton_click();
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//img[@title='OP & ER']")).click();
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//h6[text()='ER']")).click();
		driver.findElement(By.xpath("//a[text()='ER Visit']")).click();
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//*[text()='No']")).click();
		driver.switchTo().frame(0);	
	}

	public static void OP_Reg_PatReg() throws InterruptedException{
		All_Buttons.homeButton_click();
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//img[@title='OP & ER']")).click();
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//h6[text()='Registration']")).click();
		driver.findElement(By.xpath("//a[text()='Referral Patients']")).click();
		driver.findElement(By.id("btnGenRegister")).click();
		if (driver.findElement(By.className("ext-mb-text")).getText().equalsIgnoreCase("Is patient not available in  the list?")) {
			driver.switchTo().defaultContent();
			driver.findElement(By.xpath("//button[text()='Yes']")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//button[text()='No']")).click();
			driver.switchTo().frame(0);
		}
		else {
			driver.switchTo().defaultContent();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//button[text()='No']")).click();
			driver.switchTo().frame(0);
		}
		
	}

	
	public static void OP_OPBilling_OpdConsultation(){
		All_Buttons.homeButton_click();
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//img[@title='OP & ER']")).click();
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//h6[text()='OP Billing']")).click();
		driver.findElement(By.xpath("//a[text()='OPD Consultation']")).click();
		driver.switchTo().defaultContent();
	}
	
}
