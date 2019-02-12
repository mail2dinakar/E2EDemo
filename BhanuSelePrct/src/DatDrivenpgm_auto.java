import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Lib.ReadExceldataConstructorclass;

public class DatDrivenpgm_auto {
	WebDriver driver;
	
	@Test(dataProvider="passingdata")
	public void datadriven(String Username,String Password) throws InterruptedException
	{
		
		System.setProperty("webdriver.chrome.driver","C:/Users/Bhanu/Desktop/new_downloads/chromedriver_win32(1)/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://demosite.center/wordpress/wp-login.php");
		
		driver.findElement(By.id("user_login")).sendKeys(Username);
		driver.findElement(By.id("user_pass")).sendKeys(Password);
		driver.findElement(By.id("wp-submit")).click();
		Thread.sleep(5000);
		
		Assert.assertTrue(driver.getTitle().contains("Dashboard"),"Invalid Credintials - User unable to login");
		
		System.out.println("Pasge Title verified User is able to login successful");
		
	}
		
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
		
	}
		
	
	@DataProvider(name="passingdata")
	public Object[][] passdata()
	{
		ReadExceldataConstructorclass excel=new ReadExceldataConstructorclass("F:\\new_workspace_neon\\BhanuSelePrct\\src\\testdata\\inputdata.xlsx");
		
		int rows = excel.getrowcount(0);
		
		Object[][] data = new Object[4][2];
		
		for (int i=0;i<rows;i++)
		{
			data[i][0] = excel.getData(0, i, 0);
			data[i][1] = excel.getData(0, i, 1);
			
		}
		
		return data;
		
	}
		
		
		

}
