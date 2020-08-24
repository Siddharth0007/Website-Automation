package stepdefinations;


import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import cucumber.api.junit.Cucumber;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

import pageobject.homepage;
import resources.base;


@RunWith(Cucumber.class)
public class stepdefination extends base {

	homepage hp;
	WebDriver driver;
	
	 

	    @Given("^user starts the browser and enters the url$")
	    public void user_starts_the_browser_and_enters_the_url() throws Throwable {
	    	driver=BrowserConfig();
	    	driver.get(prop.getProperty("url"));
	    }

	    @Then("^user click on login button$")
	    public void user_click_on_login_button() throws Throwable {
	       hp=new homepage(driver);
	       Thread.sleep(3000);
	        hp.getlogin().click();
	      
	    }
	    @Then("^user enters the (.+) name And clicks on contuine$")
	    public void user_enters_the_name_and_clicks_on_contuine(String username) throws Throwable {
	       hp.getemail().sendKeys(username);
	       hp.getloginbutton().click();
	       Thread.sleep(3000);
	    }

	    @Then("^user enters the (.+) name And clicks on Login$")
	    public void user_enters_the_name_and_clicks_on_login(String password) throws Throwable {
	    	hp.getpassword().sendKeys(password);
		       hp.getloginbutton().click();
		       Thread.sleep(3000);
		       
	    }

		   @Then("^user close the browser$")
		   public void user_close_the_browser() throws Throwable {
		    	    driver.close();   
		    	    }
		   
		   
		   
		   
		   
	    

}

