package SeleniuPack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class iFrame 
{
	
	@Test
	public void testframe()
	{
	System.setProperty("webdriver.chrome.driver","C:/Users/Bhanu/Desktop/new_downloads/chromedriver_win32(1)/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	driver.get("https://dev16230.service-now.com/");
	
	int total_frames = driver.findElements(By.tagName("iframe")).size();
	System.out.println("Total Frames in application is:" +total_frames);

	driver.switchTo().frame("user_name");
	
	driver.findElement(By.xpath(".//*[@id='user_name']")).click();
	
	driver.findElement(By.id(".//*[@id='user_name']")).sendKeys("userid");
	

	
	driver.switchTo().defaultContent();

	
}
}
