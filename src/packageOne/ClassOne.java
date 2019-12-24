package packageOne;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class ClassOne {
	
  
  @Test
  public void testOne() throws IOException{
	  
	  System.setProperty("webdriver.chrome.driver", "drivers//chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		 
		 driver.get("http://omayo.blogspot.in");
		 
		 //screenshot
		 File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		 FileUtils.copyFile(screenshotFile, new File("screenshots\\screenshot1.jpg"));
				 
		 driver.close(); 
	  
  }
  
  
}
