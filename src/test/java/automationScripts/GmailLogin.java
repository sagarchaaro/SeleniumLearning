package automationScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GmailLogin {
	
	
	@Test
	void gmailLogin(){
		System.out.println("This testcase is for Gmail Login");
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.name("q")).sendKeys("India");
		driver.findElement(By.name("q")).submit();
		
		
	}

}
