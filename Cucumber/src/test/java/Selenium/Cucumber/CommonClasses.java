package Selenium.Cucumber;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.Scenario;
import cucumber.api.java.en.Then;

public class CommonClasses {
	
	static WebDriver driver = Hooks.driver;
	
	//Search Product
	public void search_product() throws Throwable {
		{
			driver.findElement(By.id("searchInput")).sendKeys("1010233607");
			Thread.sleep(5000);
			driver.findElement(By.xpath("//*[@aria-label ='Search']")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("//a[@elementclicked='Image']")).click();
		}}

	public void signin() throws Throwable {
		
		driver.findElement(By.xpath("//*[@id='accountLink']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id='signin-email']")).sendKeys("ketan@gmail.com");

		driver.findElement(By.xpath("//*[@id='signin-password']")).sendKeys("Test@123");
		Thread.sleep(5000);

		driver.findElement(By.xpath("//button[@id='signin-submit']")).click();
		Thread.sleep(5000);
		
	}



		public void takeScreenShot(WebDriver driver, Scenario scenario) throws IOException
		{
			TakesScreenshot sc = (TakesScreenshot) driver;
			byte[] screenshot = sc.getScreenshotAs(OutputType.BYTES);
			scenario.embed(screenshot, "image/png");
		}
	
		public void shipto() throws Throwable
		{
		//Click on ship to link 
		Thread.sleep(4000);
		driver.findElement(By.xpath("//a[contains(text(),'Click here')]")).click();
		
		JavascriptExecutor scroll1 = (JavascriptExecutor) driver;
		scroll1.executeScript("window.scrollBy(0,500)", "");
		Thread.sleep(8000);
						driver.findElement(By.xpath("//button[@id='ShipToUSA']")).click();
						Thread.sleep(8000);
	
	}
	
	public void scroll()
	{
		JavascriptExecutor scroll1 = (JavascriptExecutor) driver;
		scroll1.executeScript("window.scrollBy(0,500)", "");
	}};



