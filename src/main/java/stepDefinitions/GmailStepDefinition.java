package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class GmailStepDefinition {
	
	static WebDriver driver;
	
	@Given("^google application is loaded$")
	public void google_load()  throws Exception{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://www.google.com");	
	}
	
	@When("^user enters as data in search box$")
	public void searchData() {
		driver.findElement(By.name("q")).sendKeys("India");
	}
	
	@And("^user clicks on search button$")
	public void clickSearch() {
		driver.findElement(By.name("q")).submit();
	}
	
	@Then("^results should be displayed$")
	public void verifyResults() {
		System.out.println("Data is displayed");
		
	}
}
