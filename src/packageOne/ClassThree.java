package packageOne;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class ClassThree {
	
	@Test
	  public void testThree(){
		  
		System.setProperty("webdriver.chrome.driver", "drivers//chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		 
		 driver.get("http://newtours.demoaut.com");
		 
		 driver.close();	  
		  
	  }

}
