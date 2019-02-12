package SeleniuPack;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Muliwindow {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:/Users/Bhanu/Desktop/new_downloads/chromedriver_win32(1)/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.hdfcbank.com/");
		
		driver.manage().window().maximize();
		WebElement ele = driver.findElement(By.xpath(".//*[@id='element2']/div[1]/div/div[5]/div[1]/div[2]/div[1]/div/div[1]"));
			
			
		//Actions act=new Actions(driver);
		//act.moveToElement(ele).perform();
		//List<WebElement> list=driver.findElements(By.xpath("//div[@class='expand']//ul//li"));
	    //int i = list.size();
		//for(int a =1 ; a< i;a++){
		//WebElement  element = list.get(a);
		//String text = element.getAttribute("innerHTML");
        //System.out.println("Name : " +text);	}
		
						
	}

}
