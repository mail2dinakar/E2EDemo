import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DatDrivenpgm {
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
		Object[][] data = new Object[4][2];
		data[0][0]="admin1";
		data[0][1]="demo1";
		
		data[1][0]="admin";
		data[1][1]="demo123";
		
		data[2][0]="admin2";
		data[2][1]="demo1";
		
		data[3][0]="admin3";
		data[3][1]="demo1";
		
		
		return data;
		
	}
		
		
		

}
