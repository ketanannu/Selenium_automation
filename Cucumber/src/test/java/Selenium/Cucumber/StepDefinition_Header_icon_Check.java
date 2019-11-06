package Selenium.Cucumber;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition_Header_icon_Check {

	static WebDriver driver = Hooks.driver;
	CommonClasses common =  new CommonClasses();

//	public String Url ="https://www.buybuybaby.com/";

	
 @When("^Verify Ideaboard icon appear and clickable from Homepage$")
	public void header_ideaboard_icon() throws Throwable {
		{

		    Thread.sleep(5000); 
		
	
		 		
		 		 if( driver.findElement(By.xpath("//a[@data-type ='idea-board']")).isDisplayed())
				 {
		 			 driver.findElement(By.xpath("//a[@data-type ='idea-board']")).click(); Thread.sleep(5000);
		 			Thread.sleep(5000);
		 			 System.out.println("Ideaboard Appear");
				 }
				else if (!driver.findElement(By.xpath("//a[@data-type ='idea-board']")).isDisplayed())
				{
				System.out.println("Ideaboard Not Appeared");
			 }
		}
	}

	@Then("^Verify cart icon appear and clickable from Homepage$")
	public void header_cart_ideaboard_icon() throws Throwable 
		{

	    Thread.sleep(5000); 
		 if(driver.findElement(By.xpath("//a[@rel='nofollow']")).isDisplayed())
		 {
 			driver.findElement(By.xpath("//a[@rel='nofollow']")).click();Thread.sleep(5000);
 			Thread.sleep(5000);
 			 System.out.println("#########Pass");
		 }
		else if (!driver.findElement(By.xpath("//a[@rel='nofollow']")).isDisplayed())
		{
		System.out.println("#########Error");
	 }
		}
		
	@Then("^Verify registry appear and clickable from Homepage$")
		public void header_registry_ideaboard_icon() throws Throwable 
			{
			 Thread.sleep(5000);

	 		 if( driver.findElement(By.xpath("//a[@data-type='registry']")).isDisplayed())
			 {
	 			driver.findElement(By.xpath("//a[@data-type='registry']")).click();
	 			  Thread.sleep(5000);
	 			 System.out.println("Registry page appear");
			 }
			else if (!driver.findElement(By.xpath("//a[@data-type='registry']")).isDisplayed())
			{
			System.out.println("Registry page not appear");
		 }
		 
			}
		@And("^Verify signin icon appear and clickable from Homepage$")
		public void header_signin_ideaboard_icon() throws Throwable 
			{
			  Thread.sleep(5000);

			  
		 		 if(driver.findElement(By.xpath("//a[@id ='accountLink']")).isDisplayed())
				 {
		 			 driver.findElement(By.xpath("//a[@id ='accountLink']")).click();
		 			  Thread.sleep(5000);
		 			 System.out.println("Sign in page appear");
				 }
				else if (!driver.findElement(By.xpath("//a[@id ='accountLink']")).isDisplayed())
				{
				System.out.println("Sign in page not appear");
			 }
			}
		
	};

