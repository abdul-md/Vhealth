package Logics;

import org.openqa.selenium.By;

import SetUp.LaunchSetup;

public class PatientSearch extends LaunchSetup{

	public static void searchByMRN(String enter_MRN){
		driver.switchTo().defaultContent();
		driver.findElement(By.id("rdBtnSearchByMRN")).click();
		driver.findElement(By.id("txtPatSearch")).clear();
		driver.findElement(By.id("txtPatSearch")).sendKeys(enter_MRN);
		driver.findElement(By.id("btnGo")).click();		
	}
	
	public static void searchByIP(String enter_IP_number){
		driver.switchTo().defaultContent();
		driver.findElement(By.id("rdBtnSearchByVisitNum")).click();
		driver.findElement(By.id("txtPatSearch")).clear();
		driver.findElement(By.id("txtPatSearch")).sendKeys(enter_IP_number);
		driver.findElement(By.id("btnGo")).click();		
	}
	
	public static void SearchBYCellNum(String enter_CellPhone_number){
		driver.switchTo().defaultContent();
		driver.findElement(By.id("rdBtnSearchBYCellNum")).click();
		driver.findElement(By.id("txtPatSearch")).clear();
		driver.findElement(By.id("txtPatSearch")).sendKeys(enter_CellPhone_number);
		driver.findElement(By.id("btnGo")).click();		
	}
	
	
}
