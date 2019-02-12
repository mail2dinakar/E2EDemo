package SeleniuPack;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class calender {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver","C:/Users/Bhanu/Desktop/new_downloads/chromedriver_win32(1)/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.redbus.in/");
		
		driver.findElement(By.xpath(".//*[@id='search']/div/div[3]/span")).click();
				
		Thread.sleep(2000);		
		//static calender selection 
		//	driver.findElement(By.xpath(".//*[@id='rb-calendar_onward_cal']/table/tbody/tr[4]/td[7]")).click();  	
		
		//dynamic calender selection 
		
		List<WebElement> dates=driver.findElements(By.xpath("//div[@id='rb-calendar_onward_cal']/table[1]//td")); 
		
		int total_dates = dates.size();
		
		for(int i=0; i<total_dates;i++)
			
		{
			String day=dates.get(i).getText();
			if (day.equalsIgnoreCase("31"))
			{
				dates.get(i).click();
				break;
			}				
		}
		
	}

}
