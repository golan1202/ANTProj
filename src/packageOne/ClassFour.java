package packageOne;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class ClassFour {
	
	@Test
	  public void testFour(){
		  
		System.setProperty("webdriver.chrome.driver", "drivers//chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		 
		 driver.get("http://book.theautomatedtester.co.uk");
		 
		 driver.close();
		  
	  }

}
