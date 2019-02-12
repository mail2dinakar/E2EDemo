package com.hybridFramework.testbase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class testbase {

WebDriver driver;
	


public void getBrowser(String browser){
	if(System.getProperty("os.name").contains("Window")){
		if(browser.equalsIgnoreCase("firefox")){
			//https://github.com/mozilla/geckodriver/releases
			System.out.println(System.getProperty("user.dir"));
			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"/drivers/geckodriver.exe");
			driver = new FirefoxDriver();
		}
		else if(browser.equalsIgnoreCase("chrome")){
			//https://chromedriver.storage.googleapis.com/index.html
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/drivers/chromedriver.exe");
			driver = new ChromeDriver();
		}
	}
	else if(System.getProperty("os.name").contains("Mac")){
		System.out.println(System.getProperty("os.name"));
		if(browser.equalsIgnoreCase("firefox")){
			System.out.println(System.getProperty("user.dir"));
			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"/drivers/geckodriver");
			driver = new FirefoxDriver();
		}
		else if(browser.equalsIgnoreCase("chrome")){
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/drivers/chromedriver");
			driver = new ChromeDriver();
		}
	}

}

	public static void main(String[] args){
 testbase test = new testbase();
 test.getBrowser("firefox");
}
}

