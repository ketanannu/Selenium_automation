package Selenium.Cucumber;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition_Buying_Guide {

	static WebDriver driver = Hooks.driver;
	CommonClasses common =  new CommonClasses();

//	public String Url ="https://www.buybuybaby.com/";

	
 @When("^Click on Buying Guide$")
	public void clickbuyingguide() throws Throwable {
		{
			Thread.sleep(5000);
			driver.findElement(By.id("searchInput")).sendKeys("1062752978");
			Thread.sleep(5000);
			driver.findElement(By.xpath("//button[@aria-label ='Search']")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("//a[@elementclicked='Image']")).click();
			Thread.sleep(5000);
			JavascriptExecutor scroll1 = (JavascriptExecutor) driver;
		
			scroll1.executeScript("window.scrollBy(0,800)", "");
			Thread.sleep(5000);
			driver.findElement(By.xpath("//a[@data-locator='pdp-buyingguidelink']")).click();
			Thread.sleep(5000);
			Thread.sleep(5000);
			Thread.sleep(5000);
		}
	}

	@Then("^Click on Go Back Guide$")
	public void gobacktoguide() throws Throwable {
		{
			Thread.sleep(5000);
		driver.findElement(By.xpath("//a[@class='oc-simple-guide-breadcrumb oc-simple-guide-breadcrumb-header theme-family-sans']")).click();
		Thread.sleep(5000);

		}
	}
};

