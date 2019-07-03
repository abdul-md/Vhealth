package Generics;

import org.openqa.selenium.By;
import SetUp.LaunchSetup;

public class All_Buttons extends LaunchSetup
{

	
	public static void homeButton_click()
	{
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//a[@title='Home']/img")).click();
	}
	
	public static void backButton_click()
	{
		driver.switchTo().defaultContent();
		driver.findElement(By.cssSelector("#tdBack")).click();
		driver.switchTo().frame(0);
	}
	
	
	public void x_button_closePopup(){
//		driver.findElement(By.xpath("//div[@class='x-window x-window-plain x-resizable-pinned']//div[contains(@class,'x-tool')]")).click();
		driver.findElement(By.xpath("//div[@class='x-window x-window-plain x-resizable-pinned']//div[@class='x-tool x-tool-close']")).click();
	}
}
