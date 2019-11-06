package Selenium.Cucumber;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.When;

public class Step_defination_Add_registry {

	static WebDriver driver = Hooks.driver;
	//public String Url = "https://www.buybuybaby.com/";
	CommonClasses common = new CommonClasses();

	

	@When("^user is able to add product to Registry from PDP page$")
	public void add_Registry() throws Throwable {
		{
			Thread.sleep(4000);
			
			 
		//	 Click on ship to link
			Thread.sleep(10000);
			CommonClasses common =  new CommonClasses();
			
			JavascriptExecutor scroll1 = (JavascriptExecutor) driver;
			scroll1.executeScript("window.scrollBy(0,3000)", "");
			Thread.sleep(2000);
			JavascriptExecutor scroll2= (JavascriptExecutor) driver;
			scroll2.executeScript("window.scrollBy(0,1000)", "");
			Thread.sleep(10000);
			//common.shipto();
			driver.findElement(By.xpath("//*[@id='accountLink']")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("//*[@id='signin-email']")).sendKeys("ketan@gmail.com");

			driver.findElement(By.xpath("//*[@id='signin-password']")).sendKeys("Test@123");
			Thread.sleep(5000);

			driver.findElement(By.xpath("//button[@id='signin-submit']")).click();
			Thread.sleep(5000);

			Thread.sleep(5000);
			Thread.sleep(5000);
			Thread.sleep(5000);

			System.out.println("HELLO");
			driver.findElement(By.id("searchInput")).sendKeys("1010233607");
			Thread.sleep(5000);
			driver.findElement(By.xpath("//*[@aria-label ='Search']")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("//a[@elementclicked='Image']")).click();

			Thread.sleep(10000);

			// ####Add to regstry###
			driver.findElement(By.xpath("//button[@data-locator='atr_addtoregistry_button']")).click();

			// ####Verify user is on create registry page####
			Thread.sleep(5000);

			driver.findElement(By.xpath("//*[@class='StyledImageList-inline_77jqxN']")).click();
           
			
			Thread.sleep(5000);
			{

				Thread.sleep(5000);
				String expectedcartpage = "Analyze My Registry";

				String actualcartpage = driver.findElement(By.xpath("//div[@data-locator='registry-analyzebtn']"))
						.getText();

				Thread.sleep(5000);

				if (actualcartpage.equals(expectedcartpage)) {
					System.out.print("Product added to Registry sucessfully : You are on " + actualcartpage + " page");

				} else {
					System.out.println("###### ##Registry page not open ,You are on wrong page" + actualcartpage);

				}

			}
		}
	}

}
