package Selenium.Cucumber;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.When;

public class Step_defination_url {
	
	CommonClasses common =  new CommonClasses();

	static WebDriver driver = Hooks.driver;
	//public String Url ="https://www.buybuybaby.com/";


	@When("^User opens new \"([^\"]*)\"$")
public void fetch_url(String urls) throws Throwable 
		{
			
				driver.get(urls);		
				System.out.println(urls);
					
				
				}	
					
					
					
					};


	
	
	
