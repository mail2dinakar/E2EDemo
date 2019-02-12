package SeleniuPack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class TextareaFF {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:/Users/Bhanu/Desktop/new_downloads/chromedriver_win32(1)/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.co.in/?gfe_rd=cr&ei=KbMvWeC8JonT8gfh946gAw");
		
		driver.manage().window().maximize();
		
		//driver.findElement(By.xpath(".//*[@id='gs_htif0']")).sendKeys("HDFC netnanking");
		
		driver.findElement(By.id("gs_htif0")).sendKeys("HDFC");
		
		//driver.findElement(By.xpath(".//*[@id='tsf']/div[2]/div[3]/center/input[1]")).click();
		
		
	}

}
