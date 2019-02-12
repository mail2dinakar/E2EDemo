package SeleniuPack;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class irctctest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:/Users/Bhanu/Desktop/new_downloads/chromedriver_win32(1)/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.irctc.co.in/eticketing/loginHome.jsf");
		
		driver.findElement(By.id("usernameId")).sendKeys("bindu3");
		driver.findElement(By.className("loginPassword")).sendKeys("sonymony");

		Scanner scan =new Scanner(System.in);      // System.in is input steam - For I/O operations 
		System.out.println("Capture image is :");
				
		String captcha = scan.nextLine();
		
		
	    driver.findElement(By.className("loginCaptcha")).sendKeys(captcha);
		driver.findElement(By.id("loginbutton")).click();
	    
		
		String url = driver.getCurrentUrl();
		
		
		if(url.equals("https://www.irctc.co.in/eticketing/home"))
			{
			System.out.println("Login Succssfull");
			}
			else 
			{	System.out.println("Unsuccessful");
			}
		
	
	}
}

