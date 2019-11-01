package Selenium.Cucumber;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.When;

public class Step_defination_Add_To_Cart {

	static WebDriver driver = Hooks.driver;
	//public String Url ="https://www.buybuybaby.com/";
	CommonClasses common =  new CommonClasses();

	@When("^user is able to add product to Cart from PDP page$")
	public void add_Registry() throws Throwable {
		{
			
			Thread.sleep(7000);
			/*driver.findElement(By.xpath("//a[contains(text(),'Click here')]")).click();

			JavascriptExecutor scroll1 = (JavascriptExecutor) driver;
			scroll1.executeScript("window.scrollBy(0,500)", "");
			Thread.sleep(8000);
			driver.findElement(By.xpath("//button[@id='ShipToUSA']")).click();
			Thread.sleep(8000);
			driver.findElement(By.xpath("//*[@title='close']")).click();
			*///Flag
			Thread.sleep(5000);

		//	common.signin();
			Thread.sleep(4000);

			System.out.println("HELLO");
			driver.findElement(By.id("searchInput")).sendKeys("1010233607");
			Thread.sleep(5000);
			driver.findElement(By.xpath("//*[@aria-label ='Search']")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("//a[@elementclicked='Image']")).click();

			Thread.sleep(10000);
			//add to cart
			driver.findElement(By.xpath("//button[@data-locator='pdp-addtocartbutton']")).click();
			Thread.sleep(10000);
			//view cart
			driver.findElement(By.xpath("//*[@data-locator ='atcmodal_viewcartandcheckoutctabtn']")).click();
			//verify the user is on cart page
			Thread.sleep(5000);
			String expectedcartpage = "Order Summary";

			String actualcartpage =	driver.findElement(By.xpath("//h2[@class='Cart_5GaGzQ']")).getText();

			Thread.sleep(5000);

			if (actualcartpage.equals(expectedcartpage)) {
				System.out.print("Product added to cart sucessfully : You are on "+actualcartpage +" page");


			} else {
				System.out.println("###### ##Cart page not open ,You are on wrong page"+actualcartpage);

			}	
			
			}}}
