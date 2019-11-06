package Selenium.Cucumber;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition_FooterCheck {

	static WebDriver driver = Hooks.driver;
	CommonClasses common =  new CommonClasses();

//	public String Url ="https://www.buybuybaby.com/";

	@When("^Email Us, Rebates, To the Trade,Explore Our Other Brands links are present in footer$")
	public void signin() throws Throwable {

	    Thread.sleep(5000); Thread.sleep(5000);
	

		JavascriptExecutor scroll1 = (JavascriptExecutor) driver;
		JavascriptExecutor scroll11 = (JavascriptExecutor) driver;
	scroll1.executeScript("window.scrollBy(0,4000)", "");
		Thread.sleep(5000);
		JavascriptExecutor scroll111 = (JavascriptExecutor) driver;
		scroll111.executeScript("window.scrollBy(0,500)", "");
		
		
	 		 if( driver.findElement(By.xpath("//a[contains(text(),'Help')]")).isDisplayed()) 
	 		 
	 		{
	 			 Thread.sleep(5000);
	 			String Emil = driver.findElement(By.xpath("//a[contains(text(),'Help')]")).getText();
	 			 System.out.println(Emil +" link is present in footer");
	 		 }
	 		 
	 		 if(driver.findElement(By.xpath("//a[contains(text(),'Rebates')]")).isDisplayed())
	 		 {
	 			
	 			Thread.sleep(5000);
	 			 String Reb = driver.findElement(By.xpath("//a[contains(text(),'Rebates')]")).getText();
	 			
	 			System.out.println(Reb + " link is present in footer");
	 		 }
	 		 
	 		 if( driver.findElement(By.xpath("//a[contains(text(),'To the Trade')]")).isDisplayed()) 
	 		 {
	 			Thread.sleep(5000);
	 			 String TTT =driver.findElement(By.xpath("//a[contains(text(),'To the Trade')]")).getText();
	 			 System.out.println(TTT + " link is present in footer");
	 		 }
	 		 

				JavascriptExecutor scroll222 = (JavascriptExecutor) driver;
			scroll222.executeScript("window.scrollBy(0,1000)", "");
				Thread.sleep(1000);
	 		 
	 		 if(driver.findElement(By.xpath("//*[@class='SisterBrands_3hXySf m0']")).isDisplayed())
	 		 {
	 			Thread.sleep(5000);
	 			 String LabelExplore = driver.findElement(By.xpath("//*[@class='SisterBrands_3hXySf m0']")).getText();
	 			System.out.println(LabelExplore + " Link is present in Footer section");
	 			
	 		 }
	 		 
		}
	

};