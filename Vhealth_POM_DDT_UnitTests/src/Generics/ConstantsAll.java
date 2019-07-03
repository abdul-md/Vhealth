package Generics;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import Generics.PopUp_Handler;
import SetUp.LaunchSetup;

public class ConstantsAll extends LaunchSetup
{
	
	
	public static void calenderDatePickerToday() throws InterruptedException
	{
		Thread.sleep(1500);
//		driver.findElement(By.xpath("//img[@class='x-form-trigger x-form-date-trigger']")).click();
		driver.findElement(By.xpath("//tr[6]//img[contains(@class,'x-form-trigger x-form-date-trigger')]")).click();
		driver.findElement(By.xpath("//button[text()='Today']")).click();	
	}

	public static void calenderMultipleSelectByIndex_DatePickerToday(int handleMultipleCalenderBy_index) throws InterruptedException
	{
		Thread.sleep(500);
		driver.findElement(By.xpath("(//img[contains(@class,'x-form-trigger x-form-date-trigger')])["+handleMultipleCalenderBy_index+"]")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//button[text()='Today']")).click();	
	}
	
	
	
	public static void logout()
	{
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//img[@src='../App_Themes/Images/VhealthIcons/LogOut_new.png']")).click();
		PopUp_Handler.click_popupBtn_Yes();
	}
	
	
	
	public static void select_wards_and_rooms_based_on_availability()
	{
		
		
		//wardssssssssssssssssssssssssss				
		List< WebElement> allgreenwards=driver.findElements(By.xpath("//table[@id='tblWardStatus']//td[@style='background-color:Green;width:75px;']"));
			System.out.println("allgreenward size"+allgreenwards.size());
		
			for (int i = 0; i < allgreenwards.size(); i++) 
			{
			String allgreenwardstext=allgreenwards.get(i).getText();
			
			System.out.println("allgreenwards value ::"+allgreenwardstext);
			
			String colors=allgreenwards.get(i).getCssValue("background-color");
			
			System.out.println("colors :: "+colors +"  value:: " +allgreenwardstext);
			
			String greencolor="rgba(0, 128, 0, 1)";
			
			if(colors.equals(greencolor))
			{	
				System.out.println("pass");
				WebElement ele12=allgreenwards.get(i);
				Actions act1=new Actions(driver);
				act1.doubleClick(ele12).perform();
				System.out.println("actions");					
				break;
			}
			else
			{
				System.out.println("failed to find available room@table1 for selecting wards with (value::green color)");
			}	
			}
			
			
			String winhandler28=driver.getWindowHandle();
			driver.switchTo().window(winhandler28);
			driver.switchTo().frame("crkAscExtWindowPopupFrame");
			
			
//roomssssssssssssssssssss	
		List< WebElement> allgreenroom=driver.findElements(By.xpath("//table[@id='tblRoomStatus']//td[@style='background-color:Green;width:30px;color:white;cursor:default;']"));
			System.out.println("allgreenroom size"+allgreenroom.size());
	
			for (int i = 0; i < allgreenroom.size(); i++) 
			{
			String allgreenroomtext=allgreenroom.get(i).getText();
			
			System.out.println("allgreenroom value ::"+allgreenroomtext);
			
			String colors=allgreenroom.get(i).getCssValue("background-color");
			
			System.out.println("colors :: "+colors +"  value:: " +allgreenroomtext);
			
			String greencolor="rgba(0, 128, 0, 1)";
			
			if(colors.equals(greencolor))
			{	
				System.out.println("pass");
				WebElement ele12=allgreenroom.get(i);
				Actions act1=new Actions(driver);
				act1.doubleClick(ele12).perform();
				System.out.println("actions");					
				break;
				}
				
			else
				{
				System.out.println("failed to find available room@table2 for selecting room with (value::green color)");
				}	
			
			}

		
	}
	
	

	
}
