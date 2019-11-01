package Selenium.Cucumber;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.EmailAttachment;
import org.apache.commons.mail.MultiPartEmail;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition_Email_Cucumber_Report {

	static WebDriver driver = Hooks.driver;
	CommonClasses common =  new CommonClasses();
	public String Url ="https://www.buybuybaby.com/";

	@When("^Send email to admin$")
	public void email_report() throws Throwable {
		{
			Thread.sleep(5000);
			//driver.close();
			Thread.sleep(5000);
			 EmailAttachment attachment = new EmailAttachment();
			  attachment.setPath("C:\\Users\\ba06875\\Desktop\\Dataa from Test User\\eclipse-workspace\\eclipse-workspace\\Cucumber\\target\\CucumberReport\\cucumber-html-reports\\overview-features.html");
			//  attachment.setPath("C:/Screenshot/error1.png");
			  attachment.setDisposition(EmailAttachment.ATTACHMENT);
			  attachment.setDescription("Error screenshot");
			  attachment.setName("Report");

				
			  // Create the email message
			  MultiPartEmail email = new MultiPartEmail();
			    email.setHostName("smtp.gmail.com");
				email.setSmtpPort(587);
				email.setAuthenticator(new DefaultAuthenticator("ketanketuarora@gmail.com", "Ketu@123"));
				email.setSSLOnConnect(true);
				email.setFrom("ketanketuarora@gmail.com");
				email.setSubject("TestMail");
				email.setMsg("This is a test mail ... :-)");
				email.addTo("ketanketuarora@gmail.com");
				
				// add the attachment
			  email.attach(attachment);

			  // send the email
			 email.send();
			System.out.print("##### Email Send Please Check #####");
			//driver.get(Url);
			
		}
		
	}};