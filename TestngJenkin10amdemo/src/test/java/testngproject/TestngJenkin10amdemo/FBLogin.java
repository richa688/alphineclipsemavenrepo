package testngproject.TestngJenkin10amdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class FBLogin {
	
	@Test
	public void login()
	{
		// open browser
				WebDriver driver = new ChromeDriver();
				
				// go to fb
				driver.get("https://www.facebook.com/");
				
				//find element & store
				WebElement ele=driver.findElement(By.id("email"));
				
				// write data
				ele.sendKeys("abc@gmail.com");

	}
	
	

}
