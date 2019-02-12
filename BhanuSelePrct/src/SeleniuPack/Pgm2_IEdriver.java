package SeleniuPack;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Pgm2_IEdriver {

	
	
	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.ie.driver", "C:/Users/Bhanu/Desktop/new_downloads/IEDriverServer_x64_3.2.0/IEDriverServer.exe");
  
		WebDriver driver = new InternetExplorerDriver();
		
		driver.get("https://accounts.google.com/signin/v2/identifier?flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		
		driver.findElement(By.id("identifierId")).sendKeys("bhanu.bitra@gmail.com");
			
		System.out.println(driver.getTitle());
		
		//driver.close();
		
	}

}
