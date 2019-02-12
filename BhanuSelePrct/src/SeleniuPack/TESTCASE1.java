package SeleniuPack;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TESTCASE1 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:/Users/Bhanu/Desktop/new_downloads/chromedriver_win32(1)/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in/");
	
	//driver.findElement(By.className("gb_P")).click();
	//driver.navigate().to("https://accounts.google.com/signin/v2/identifier?service=mail&passive=true&rm=false&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F%3Ftab%3Dwm&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
	
	//if(driver.findElement(By.linkText("Gmail")).isDisplayed())
	//System.out.println("Gmaillink exists - passed");
	//else
	//System.out.println("Gmaillink not existed- Failed");
	
	/*boolean linkstatus = driver.findElement(By.linkText("Gmail")).isDisplayed();
		if(linkstatus == true)
		{
		System.out.println("Gmaillink exists - passed");
		}
		else
		{
		System.out.println("Gmaillink not existed- Failed");
		}
	*/
	
		
	
    
	try
     {
     if(driver.findElement(By.linkText("Gmailbbb")).isDisplayed())
     {
     	System.out.println("Gmail link exists - passed");
     }
     }
     catch(NoSuchElementException e)
     {
     System.out.println("Gmail link not existed- Failed");	 
     }    	
    }
}