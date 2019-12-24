package packageOne;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class ClassTwo {
	
	@Test
	  public void testTwo(){
		  
		System.setProperty("webdriver.chrome.driver", "drivers//chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		 
		 driver.get("https://compendiumdev.co.uk/selenium/basic_web_page.html");
		 
		 driver.close();
		  
	  }

}
