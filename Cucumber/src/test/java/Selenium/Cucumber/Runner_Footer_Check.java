package Selenium.Cucumber;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(monochrome = true,tags = { "@FooterCheck" }, glue = { "Selenium.Cucumber" }, features = {
		"feature/" }, plugin = { "pretty", "json:target/jsonFolder/cucumber17.json" ,"html:target/htmlFolder/"})
public class Runner_Footer_Check {

};
