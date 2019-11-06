package Selenium.Cucumber;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefination_Ideaboard {

	CommonClasses common = new CommonClasses();
	static WebDriver driver = Hooks.driver;
//public String Url ="https://www.buybuybaby.com/";
	 

	@When("^Create Ideaboard$")
	public void create_ib() throws Throwable {
		{
            Thread.sleep(10000);
			driver.findElement(By.xpath("//a[@data-type ='idea-board']")).click();
			Thread.sleep(15000);
			driver.findElement(By.xpath("//*[contains(text(),'Create Idea Board')]")).click();
			Thread.sleep(15000);
			driver.findElement(By.xpath("//*[@id='create-ideaboardName']")).click();
			driver.findElement(By.xpath("//*[@class='FormInput_2C3A8T input-text']")).sendKeys("My fav Ideaboard");
			Thread.sleep(17000);
			driver.findElement(By.xpath("//button[contains(text(),'Save')][@id='createIdeaBoard-submit']")).click();
			Thread.sleep(15000);
			String ideaboardname = driver.findElement(By.xpath("//*[@class='Ideaboard-inline_DEXLji flex']")).getText();
			System.out.println(ideaboardname);
			driver.findElement(By.xpath("//*[@class='m2']")).click();
			Thread.sleep(5000);

		}
	}

	@Then("^Add product to ideaboard from PDP$")
	public void add_prod_from_pdp() throws Throwable
	{
		//String url = "https://www.buybuybaby.com/";
		//driver.get(Url);
		Thread.sleep(15000);
		driver.findElement(By.id("searchInput")).sendKeys("Toy");
		Thread.sleep(15000);
		driver.findElement(By.xpath("//*[@aria-label ='Search']")).click();
		Thread.sleep(15000);
		JavascriptExecutor scroll1 = (JavascriptExecutor) driver;
		scroll1.executeScript("window.scrollBy(0,200)", "");
		Thread.sleep(15000);
		driver.findElement(By.xpath("//*[@id='pdp-ideaboard-icon0']")).click();
		Thread.sleep(15000);
		driver.findElement(By.xpath("//button[@class='input-button Button_5b9DYQ activePressed Button_3G2SkB SelectIdeaboardList_6PFlfS ml1']")).click();
		Thread.sleep(15000);
	}

	@And("^Add product to ideaboard from PLP$")
	public void add_product_from_plp() throws Throwable
	{
		Thread.sleep(15000);
		;driver.findElement(By.id("searchInput")).sendKeys("tree");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@aria-label ='Search']")).click();
		Thread.sleep(5000);
		
		Thread.sleep(5000);
		driver.findElement(By.id("pdp-ideaboard-icon0")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//button[@class='input-button Button_5b9DYQ activePressed Button_3G2SkB SelectIdeaboardList_6PFlfS ml1']")).click();
		Thread.sleep(10000);

	}


	@Then("^Add more product$")
	public void add_more_product() throws Throwable
	{
	
		Thread.sleep(10000);

		driver.findElement(By.id("searchInput")).sendKeys("1010233607");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@aria-label ='Search']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[@elementclicked='Image']")).click();
		Thread.sleep(10000);
		driver.findElement(By.id("pdp-ideaboard-icon")).click();
		Thread.sleep(17000);
		driver.findElement(By.xpath("//button[@class='input-button Button_5b9DYQ activePressed Button_3G2SkB SelectIdeaboardList_6PFlfS ml1']")).click();
		Thread.sleep(10000);


	}


	@And("^Add few more product to ideaboard from PLP$")
	public void add_3more_product_from_pdp() throws Throwable
	{
		Thread.sleep(10000);
	
		driver.findElement(By.id("searchInput")).sendKeys("Sheet");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@aria-label ='Search']")).click();
		Thread.sleep(5000);
		JavascriptExecutor scroll = (JavascriptExecutor) driver;
		scroll.executeScript("window.scrollBy(0,200)", "");
		Thread.sleep(10000);
		driver.findElement(By.id("pdp-ideaboard-icon2")).click();
		Thread.sleep(12000);	
		driver.findElement(By.xpath("//button[@class='input-button Button_5b9DYQ activePressed Button_3G2SkB SelectIdeaboardList_6PFlfS ml1']")).click();
		Thread.sleep(12000);
		JavascriptExecutor scroll11 = (JavascriptExecutor) driver;
		scroll11.executeScript("window.scrollBy(0,600)", "");
		Thread.sleep(10000);
			


		driver.findElement(By.id("pdp-ideaboard-icon6")).click();
		Thread.sleep(10000);	
	
	}

	@Then("^Verify for non loggedin user unable to add more than 4 product without log in$")
	public void writereview() throws Throwable {
		{
			driver.findElement(By.xpath("//*[@class='input-button fol']")).click();
			Thread.sleep(5000);
		 String actualmessagepleaseloginmsg = driver.findElement(By.xpath("//h1[contains(text(),'Sign In')]")).getText();
			//*[@id='signin-email']
			String expectedmessagepleaseloginmsg="Sign In";

			if (actualmessagepleaseloginmsg.equals(expectedmessagepleaseloginmsg)) {
			System.out.println("Case pass:-Please login to create second ideaboard");


			} else {
				System.out.println("Case Fail:-Message not appear");


}}}};






