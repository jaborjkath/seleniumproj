package testgchromewebdriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;

public class TestGchrome {
	public static void main(String[] args) throws InterruptedException{
		//-----------------------------------
		//System.out.println("Hello!");
		  // Optional. If not specified, WebDriver searches the PATH for chromedriver.       
		  //System.setProperty("webdriver.chrome.driver", "C:\\wamp\\www\\seleniumproj\\somedrivers\\chromedriver\\chromedriver.exe");           
		  System.setProperty("webdriver.chrome.driver", "C:\\wamp\\www\\seleniumproj\\assign\\drivers\\chromedriver.exe");            
		  WebDriver driver = new ChromeDriver(); 
		  
		  //sample 1
		  /*driver.get("http://www.google.com/");    

		  Thread.sleep(5000);  // Let the user actually see something!     
		
		  WebElement searchBox = driver.findElement(By.name("q"));
		
		  searchBox.sendKeys("Coursera");     
		
		  searchBox.submit();    
		
		  Thread.sleep(5000);  // Let the user actually see something!  
		  
		  driver.quit();  
		  */

		  //sample 2
		  
		  driver.get("https://www.coursera.org/specializations/software-testing-automation");
		  Thread.sleep(5000);  // Let the user actually see something!   
		  WebElement search = driver.findElement(
				By.cssSelector("input[placeholder='What do you want to learn?']")
		  );

		  search.sendKeys("economics");
          search.sendKeys(Keys.ENTER);

          Thread.sleep(5000); 
		  driver.quit();  
		 } 
	}
