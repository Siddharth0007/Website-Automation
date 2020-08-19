package stepdefinations;

import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pageobject.homepage;
import resources.base;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
public class stepdefination extends base {

	homepage hp;
	WebDriver driver;
	
	 

	    @Given("^user starts the browser and enters the url$")
	    public void user_starts_the_browser_and_enters_the_url() throws Throwable {
	    	driver=BrowserConfig();
	    	driver.get(prop.getProperty("url"));
	    }

	    @Then("^user enters the (.+) name And clicks on contuine$")
	    public void user_enters_the_name_and_clicks_on_contuine(String username) throws Throwable {
	       
	    }

	    @Then("^user enters the (.+) name And clicks on Login$")
	    public void user_enters_the_name_and_clicks_on_login(String password) throws Throwable {
	        
	    }

	}

