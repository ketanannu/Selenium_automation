package Selenium.Cucumber;

import java.io.File;
import java.io.IOException;

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

	static WebDriver driver = null;

	@Before
	public void BeforeSteps() throws Exception {

		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\ba06875\\Desktop\\Dataa from Test User\\geckodriver-v0.21.0-win64\\geckodriver.exe");
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ba06875\\Desktop\\Dataa from Test User\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://www.buybuybaby.com");

		driver.findElement(By.xpath("//a[@id='closeButton']")).click();
		driver.manage().window().maximize();
		Thread.sleep(5000);

	}

	@After
	public void AfterSteps(Scenario scenario) throws IOException {

	byte[] src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
		scenario.embed(src, "image/png");
		System.out.println("Screenshot Capture");
		driver.close();
		 
	}};

