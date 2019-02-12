package SeleniuPack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class handlingElements {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver","C:/Users/Bhanu/Desktop/new_downloads/chromedriver_win32(1)/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();
		
		
		System.out.println("Current URL is :" +driver.getCurrentUrl());

		driver.navigate().to("https://www.facebook.com/");
		System.out.println("navigated TO the URL :" +driver.getCurrentUrl());
		
		driver.navigate().back();
		System.out.println("navigated Back to :" +driver.getCurrentUrl());
		
		driver.navigate().forward();
		System.out.println("navigated Forwards to :" +driver.getCurrentUrl());
	}

}
