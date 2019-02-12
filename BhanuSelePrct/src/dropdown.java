import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdown {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:/Users/Bhanu/Desktop/new_downloads/chromedriver_win32(1)/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.wikipedia.org/");
		
		driver.manage().window().maximize();
		
		
		
		/*Select select = new Select(driver.findElement(By.xpath(".//*[@id='searchLanguage']")));
		select.selectByValue("la");
		List<WebElement> list = select.getOptions();
		List<WebElement> list1 = driver.findElements(By.tagName("option"));
		for(int i=0;i<list1.size();i++)
		{
			System.out.println(list1.get(i).getText());
		}
	*/
		
		WebElement MultiDD = driver.findElement(By.xpath(".//*[@id='searchLanguage']"));
		
		List<WebElement> Options = MultiDD.findElements(By.tagName("option"));
		
		for(int i=0 ; i< Options.size(); i++)
		{
			System.out.println(Options.get(i).getAttribute("lang"));
		}
	
		
		WebElement Alllinks = driver.findElement(By.xpath(".//*[@id='www-wikipedia-org']/div[6]"));
		List<WebElement> linklist = Alllinks.findElements(By.tagName("a"));
		for(int i=0;i<linklist.size();i++)
		{
			System.out.println(linklist.get(i).getAttribute("href"));
			
		}
		System.out.println("Total links in block is" +linklist.size());
	}
	

}
