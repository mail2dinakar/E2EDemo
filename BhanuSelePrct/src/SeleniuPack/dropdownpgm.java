package SeleniuPack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdownpgm {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver","C:/Users/Bhanu/Desktop/new_downloads/chromedriver_win32(1)/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("u_0_1")).sendKeys("BhanuC");
		
		driver.findElement(By.id("u_0_3")).sendKeys("Bitra");
		
		driver.findElement(By.id("u_0_6")).sendKeys("8805277281");
		
		driver.findElement(By.xpath(".//*[@id='u_0_d']")).sendKeys("Janice@2014");
		
		//Day-selectByIndex
		WebElement birth_dayDD = driver.findElement(By.id("day"));
		Select DayDD = new Select(birth_dayDD);		
		DayDD.selectByIndex(10);
		
		//Month	- selectByValue
		WebElement birth_monthDD = driver.findElement(By.id("month"));
		Select monthDD = new Select(birth_monthDD);		
		monthDD.selectByValue("Aug");
		
		// year - selectByVisibleText
		WebElement birth_yearDD = driver.findElement(By.id("year"));
		Select yearDD = new Select(birth_yearDD);		
		yearDD.selectByVisibleText("1985");
		
		driver.quit();
		
	}

}
