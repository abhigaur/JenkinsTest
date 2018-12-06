package TestJenkins.TestJenkins;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LaunchGoogle {

		@Test
public void launchGoogleHome(){
		 
System.setProperty("webdriver.chrome.driver", "C:\\TestJenkins\\src\\main\\java\\TestJenkins\\TestJenkins\\chromedriver.exe");
 
// Initialize browser
WebDriver driver=new ChromeDriver();
 
// Open facebook
driver.get("http://www.google.com");
 
// Maximize browser
 
driver.manage().window().maximize();
 
}
		


}
