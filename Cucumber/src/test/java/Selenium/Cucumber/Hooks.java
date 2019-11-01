package Selenium.Cucumber;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {

	CommonClasses common = new CommonClasses();
	
	

	static WebDriver driver = null;
	// public String Url ="https://www.buybuybaby.com/";

	@SuppressWarnings("unused")
	@Before
	public void BeforeSteps() throws Throwable {
		
		
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\ba06875\\Desktop\\Dataa from Test User\\geckodriver-v0.21.0-win64\\geckodriver.exe");
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ba06875\\Desktop\\Dataa from Test User\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
					
		driver.manage().window().maximize();
//driver.get(Url);
		
		 String Url = ExcelRead2.readURLFromExcel();
		 driver.get(Url+"?web3feo");
		
		    Thread.sleep(5000); Thread.sleep(5000);
		  driver.findElement(By.xpath("//a[contains(text(),'Click here')]")).click();
		  Thread.sleep(5000);
		  driver.findElement(By.xpath("//button[@id='ShipToUSA']")).click();
		  Thread.sleep(5000);
		  if(driver.findElement(By.xpath("//button[@data-locator='checkout-crossicon']")).isDisplayed())
			 {
			 driver.findElement(By.xpath("//button[@data-locator='checkout-crossicon']")).
			  click(); Thread.sleep(5000);
			 }
			else if (!driver.findElement(By.xpath("//button[@data-locator='checkout-crossicon']")).isDisplayed())
			{
			System.out.println("Checkout Not appeared");
		 }}

	@After
	public void AfterSteps(Scenario scenario) throws IOException {

		byte[] src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
		scenario.embed(src, "image/png");
		System.out.println("Screenshot Capture");
		// driver.close();

	}
};
