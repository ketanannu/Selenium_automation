package Selenium.Cucumber;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.When;

public class Step_defination_signIn {
	
	static WebDriver driver = Hooks.driver;
	//public String Url ="https://www.buybuybaby.com/?web3feo";
	CommonClasses common =  new CommonClasses();
	@When("^User SignIn$")
	public void sign_in() throws Throwable {
		{
			
	Thread.sleep(5000);
	 
	if(driver.findElement(By.xpath("//button[@data-locator='checkout-crossicon']")).isDisplayed())
	 {
	 driver.findElement(By.xpath("//button[@data-locator='checkout-crossicon']")).
	  click(); Thread.sleep(5000);
	 }
	else if (!driver.findElement(By.xpath("//button[@data-locator='checkout-crossicon']")).isDisplayed())
	{
	System.out.println("Element not found");
	}
	Thread.sleep(5000);
	  driver.findElement(By.xpath("//*[@id='accountLink']")).click();
	Thread.sleep(5000);
	driver.findElement(By.xpath("//*[@id='signin-email']")).sendKeys("ketan@gmail.com");

	driver.findElement(By.xpath("//*[@id='signin-password']")).sendKeys("Test@123");
	Thread.sleep(5000);

	driver.findElement(By.xpath("//button[@id='signin-submit']")).click();
	Thread.sleep(5000);
	System.out.print("USer us is able to sign in ");
	
		
	 }
	}	
		
		
		
	}	;

