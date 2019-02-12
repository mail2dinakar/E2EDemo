package SeleniuPack;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Muliwindowpgm {

	@Test
	public void testselenium() {
		System.setProperty("webdriver.chrome.driver","C:/Users/Bhanu/Desktop/new_downloads/chromedriver_win32(1)/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.hdfcbank.com/assets/popuppages/netbanking.htm?src=hp");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("html/body/div[4]/div[2]/div[1]/a")).click();
		String window1 = driver.getWindowHandle();
		System.out.println("Window Titlte of first page:"+driver.getTitle());
		
		for(String Window2:driver.getWindowHandles())
		{
		driver.switchTo().window(Window2);
		}
		driver.close(); 
		driver.switchTo().window(window1);
				
						
	}

}
