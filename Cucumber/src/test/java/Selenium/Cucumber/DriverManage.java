package Selenium.Cucumber;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

//comment the above line and uncomment below line to use Chrome
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverManage {

	private static WebDriver driver; 
	
	public void chromeDriver() throws InterruptedException
	{
		// System.setProperty(
		// "webdrivr.gecko.driver","C:\\Users\\ba06875\\Desktop\\Dataa from Test
		// User\\geckodriver-v0.21.0-win64\\geckodriver.exe" );

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ba06875\\Desktop\\Dataa from Test User\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("http://www.gmail.com");
		driver.findElement(By.id("identifierId")).sendKeys("surabhi.er@gmail.com");
		Thread.sleep(20000);
		driver.findElement(By.xpath("//*[@class='RveJvd snByac']")).click();

		Thread.sleep(20000);
		driver.findElement(By.name("password")).sendKeys("4$Billion");
		Thread.sleep(200);
		driver.findElement(By.xpath("//*[@class='ZFr60d CeoRYc']")).click();
	}

	public void name() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ba06875\\Desktop\\Dataa from Test User\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.gmail.com");
		System.out.println("hello");
	}
	
	public void closeBrowser() {
		driver.quit();
	}

}
