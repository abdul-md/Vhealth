package SetUp;

import java.io.File;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.automationtesting.excelreport.Xl;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;









public class LaunchSetup
{
	public static WebDriver driver;
	public static WebDriverWait wait_1;
	public static Boolean bool=false;
	public static long start; 
	public static long finish;
	public static long totalTime;

//	public static String url="http://192.168.49.54/vh_43/security/loginpage.aspx";
//	public static String url="http://192.168.49.54/vh_43_2/MainScreen/MainScreenMenu.aspx";
	public static String url="http://192.168.49.54/vh_48_2/MainScreen/MainScreenMenu.aspx";
	
	
	@BeforeClass
	public static void ffProfile()
	{
		////code for UI-TimeDescriptor = captures initial start time
		  start = System.currentTimeMillis();
	
//		 	ProfilesIni allProfiles = new ProfilesIni();
//		    FirefoxProfile profile = allProfiles.getProfile("default");
		  //  profile.setPreference("dom.max_script_run_time", 0);
//		    profile.setPreference("accessibility.typeaheadfind.enabletimeout", false);
//		    profile.setPreference("javascript.enabled", true);
		    //profile.setPreference("extensions.firebug.currentVersion", "2.0.7"); //(here you can include the version you currently have)
		    //profile.setPreference("extensions.firebug.showStackTrace", true);
		    //profile.setPreference("extensions.firebug.delayLoad", false);
		    //profile.setPreference("extensions.firebug.showFirstRunPage", false);
		    
//		    profile.setPreference("extensions.firebug.allPagesActivation", "on");
		    
		    //profile.setPreference("extensions.firebug.console.enableSites", true);
		    //profile.setPreference("extensions.firebug.defaultPanelName", "console");
//		    driver = new FirefoxDriver(profile);
		    driver = new FirefoxDriver();
		    driver.manage().timeouts().pageLoadTimeout(9, TimeUnit.SECONDS);
		    LaunchSetup.implicitWait_10s_MAX();
		  
		    LaunchSetup.launchApp();
	}
	
	
	public static void wait123()
	{
		 wait_1 =new WebDriverWait(driver, 20);
	}
	
	
	public static void implicitWait_30s_MAX()
	{
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
	
	public static void implicitWait_10s_MAX()
	{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}	
	
	public static void implicitWait_20s_MAX()
	{
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}	
	
	public static void implicitWait_3s_MAX()
	{
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	}

	public static void implicitWait_6s_MAX()
	{
		driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
	}
	
	public static void launchApp()
	{
		driver.manage().deleteAllCookies();
		//driver=new FirefoxDriver();
		driver.get(url);
		Dimension dimension1=new Dimension(200,200);
		driver.manage().window().setSize(dimension1);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.cssSelector("#LinkLogin")).click();
		
		
	}

	
	@AfterMethod
	public void TearDown(ITestResult result) throws Exception{
		Xl.generateReport("Excel-Report.xlsx");
		
	if (result.getStatus() == ITestResult.FAILURE ){
	TakesScreenshot ts = (TakesScreenshot)driver;
	File srcFile = ts.getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(srcFile, new File("C:/selenium/"+result.getName()+TimeUnit.SECONDS+".jpg"));
	//result.getname() method will give you current test case name.
	//./ScreenShots/ tell you that, in your current directory, create folder ScreenShots. dot represents current directory
	}
	}
	
	
	

	
	
	@AfterClass
	public static void closeApp() throws Exception
	
	{
//		ExcelReportGenerator.generateExcelReport("MyProject.xls", "D:\\ExcelResults");
		
//		Xl.generateReport("Excel-Report.xlsx");
		
		
		//code for UI-TimeDescriptor = Captures end time, calculates and prints
		 finish = System.currentTimeMillis();
		 totalTime = finish - start; 
		 System.out.println("start time :"+start);
		 System.out.println("Total Time for page load - "+totalTime); 
		 System.out.println("end time :"+finish);
		
		
//		driver.close();
//		driver.quit();
	}
	
	
}
