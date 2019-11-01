package Selenium.Cucumber;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.When;

public class Step_defination_ship_to {
	
	CommonClasses common =  new CommonClasses();

	static WebDriver driver = Hooks.driver;
	//public String Url ="https://www.buybuybaby.com/";

	@When("^User is able to change currency fro ship to modal$")
	public void ship_to_currency_change() throws Throwable {
		{
			JavascriptExecutor scroll1 = (JavascriptExecutor) driver;
			Thread.sleep(5000);
			scroll1.executeScript("window.scrollBy(0,3000)", "");
			Thread.sleep(5000);
			driver.findElement(By.xpath("//button[@name='shipToLink']")).click();
			Thread.sleep(25000);
		
	Thread.sleep(5000);
   
    Thread.sleep(5000);
	driver.findElement(By.xpath("//button[@id='ShipToUSA']")).click();
	
	Thread.sleep(5000);	Thread.sleep(5000);	Thread.sleep(5000);
	
	
	
		}}}
