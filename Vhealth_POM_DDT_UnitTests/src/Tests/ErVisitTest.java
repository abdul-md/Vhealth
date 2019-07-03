package Tests;


import java.io.IOException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import Constants.LoginCredentials.Login_Credentials;
import Constants.PageNavigation.PageNavigation;
import NewExcelTest.ExcelDATA_Provider;
import Pages.ErVisitPage;
import SetUp.LaunchSetup;


public class ErVisitTest  extends LaunchSetup{
	

	@Test(priority=0)
	public static void loginTest() {
		Login_Credentials.adminLogin();	
		PageNavigation.ER_ErVisit();	
	}
	

	 @DataProvider(name="excelData")
	    public Object[][] readExcel() throws InvalidFormatException, IOException {
	        return ExcelDATA_Provider.readExcel("C:/Users/abdul.md/Desktop/TestData1.xlsx", "ER Visit");
	    }
	 
	 
	@Test(priority=1, dataProvider="excelData")
	public static void ER_visit(String PatName, String MobileNumber, String Age) throws InterruptedException{	
		//ER visit form submission
		ErVisitPage pg_erVisit=new ErVisitPage(driver);
		Select sel1=new Select(pg_erVisit.ddl_PatientPrefix());
		sel1.selectByIndex(1);
		pg_erVisit.txtBx_PatientFirstname().sendKeys(PatName);
		pg_erVisit.txtBx_Address1().sendKeys(" banjara hills");
		Select sel2=new Select(pg_erVisit.ddl_ER_Physician());
		sel2.selectByIndex(1);
		Select sel3=new Select(pg_erVisit.ddl_Gender());
		sel3.selectByIndex(2);
		Select sel4=new Select(pg_erVisit.ddl_MartialStatus());
		sel4.selectByIndex(1);
		pg_erVisit.txtBx_Age().sendKeys(""+Age);
		pg_erVisit.rbtn_No().click();
		
		pg_erVisit.btn_Save().click();
		driver.switchTo().defaultContent();
		driver.switchTo().frame("crkAscExtWindowPopupFrame");
		driver.findElement(By.xpath("//*[text()='Proceed Anyway']")).click();
		driver.switchTo().defaultContent();
		Thread.sleep(1500);
		String str=pg_erVisit.popup_text().getText();
		System.out.println("str :"+str);
		driver.findElement(By.xpath("//*[text()='OK']")).click();
		driver.switchTo().frame(0);
		pg_erVisit.btn_Print().click();
		driver.switchTo().defaultContent();
		driver.switchTo().frame("crkAscExtWindowPopupFrame");
		String str1=driver.findElement(By.id("divDateOfReg")).getText();
		System.out.println("str1  :"+str1);
		
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//*[@class='x-window x-window-plain x-resizable-pinned']//*[@class='x-tool x-tool-close']")).click();
	
		PageNavigation.ER_ErVisit();
		
		
		
		
		
		
	}

}
