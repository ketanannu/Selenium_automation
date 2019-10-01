package Selenium.Cucumber;

import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import cucumber.api.Scenario;

public class TakeScreenshot {

	public static void takeScreenShot(WebDriver driver, Scenario scenario) throws IOException {
		TakesScreenshot sc = (TakesScreenshot) driver;
		byte[] screenshot = sc.getScreenshotAs(OutputType.BYTES);
		scenario.embed(screenshot, "image/png");
	}
}
