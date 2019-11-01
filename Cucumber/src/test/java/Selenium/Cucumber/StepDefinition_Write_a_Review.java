package Selenium.Cucumber;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition_Write_a_Review {

	static WebDriver driver = Hooks.driver;
	CommonClasses common =  new CommonClasses();

//	public String Url ="https://www.buybuybaby.com/";

	@When("^Signin$")
	public void signin() throws Throwable {
		{
			//driver.get(url);
			Thread.sleep(5000);
			driver.findElement(By.xpath("//*[@id='accountLink']")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("//*[@id='signin-email']")).sendKeys("ketan@gmail.com");

			driver.findElement(By.xpath("//*[@id='signin-password']")).sendKeys("Test@123");
			Thread.sleep(5000);

			driver.findElement(By.xpath("//button[@id='signin-submit']")).click();
			Thread.sleep(5000);
			
		}
	}

	@Then("^Search Product$")
	public void search_product() throws Throwable {
		{	
			Thread.sleep(5000);
			driver.findElement(By.id("searchInput")).sendKeys("1010233607");
			Thread.sleep(5000);
			driver.findElement(By.xpath("//*[@aria-label ='Search']")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("//a[@elementclicked='Image']")).click();
		}
	}

	@Then("^Write Review$")
	public void writereview() throws Throwable {
		{
			Thread.sleep(5000);
			String str = driver.findElement(By.xpath("//span[text()='Write Review']/../..")).getText();
			System.out.println(str);
			Thread.sleep(15000);
			driver.findElement(By.xpath("//span[text()='Write Review']/../..")).click();

			Thread.sleep(15000);
			//driver.findElement(By.xpath("//*[@id='bv-radio-rating-2']")).click();
			Thread.sleep(5000);
		driver.findElement(By.xpath("//span[@id='bv-radio-rating-2']")).click();
			Thread.sleep(15000);
			System.out.println("Scroll");
			// fill the form
			// driver.findElement(By.xpath("//*[@class='bv-submission-star-ratingbv-submission-rater-0
			// bv-radio-input bv-rating-input
			// bv-requiredbv-submission-star-rating-appliedbv-submission-star-rating-live']")).click();
			JavascriptExecutor scroll1 = (JavascriptExecutor) driver;
			scroll1.executeScript("window.scrollBy(0,300)", "");

			Thread.sleep(10000);
			System.out.println("Checking username");

			/*if(driver.findElement(By.xpath("//*[@id='bv-text-field-usernickname']")).isDisplayed())
			{
			  WebElement uname =
			  driver.findElement(By.xpath("//*[@id='bv-text-field-usernickname']"));
			  uname.sendKeys("Ketan");
			  
			  driver.findElement(By.id("bv-text-field-userlocation")).sendKeys("Texas");
			}
			else if (!driver.findElement(By.xpath("//*[@id='bv-text-field-usernickname']")).isDisplayed())
			{
				System.out.println("nick name is not asked");
			}
			*/
			WebElement option1 = driver.findElement(By.id("bv-checkbox-reviews-termsAndConditions"));
			if (option1.isSelected()) {
				System.out.println("Checkbox is Toggled On");
			} else {
				System.out.println("Checkbox is Toggled Off");

				WebElement radio1 = driver.findElement(By.id("bv-checkbox-reviews-termsAndConditions"));
				radio1.click();
				driver.findElement(By.name("bv-submit-button")).click();
			}
		}
	}

	@Then("^Review Submit$")
	public void reviewSubmit() throws Throwable {
		{
			Thread.sleep(4000);
			String ReviewSubmitMessgae = driver.findElement(By.xpath("//*[@class='bv-submission-text']")).getText();
			System.out.println(ReviewSubmitMessgae);
			System.out.println("#### Write a Review Submitted###");

		}
	}
@When("^Print value$")
public void value()
{
System.out.println("************ EXECUTED***********");
}

};

