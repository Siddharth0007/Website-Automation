package stepdefinations;


import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import cucumber.api.junit.Cucumber;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import static resources.uilities.datadriver.getTest;
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
	       try {
	       WaitForWebelement(hp.getlogin());
	       Assert.assertTrue(hp.getlogin().isDisplayed(), "login button is displayed");
	       hp.getlogin().click();
	       Thread.sleep(3000);
	       }catch(Exception e) {
	       Assert.fail("Login button not displayed"); 
	       }
	       
	    }
	    @Then("^user enters the \"(.+)\" name And clicks on contuine$")
	    public void user_enters_the_name_and_clicks_on_contuine(String username) throws Throwable {
	    	try {
	     WaitForWebelement(hp.getemail());
	     hp.getemail().sendKeys(getTest(username));
	     Assert.assertTrue(hp.getemail().isDisplayed());
	     hp.getloginbutton().click();
	     Thread.sleep(3000);
	    	} catch(Exception e) {}
	    }

	    
	   @Then("^user enters the \"(.+)\" name And clicks on Login$")
	   public void user_enters_the_name_and_clicks_on_login(String password) throws Throwable {
	    	 try {
	    	WaitForWebelement(hp.getpassword());
	    	Assert.assertTrue(hp.getpassword().isDisplayed());
	    	hp.getpassword().sendKeys(getTest(password));
		    hp.getloginbutton().click();
		    Thread.sleep(3000);  
	    	 } catch(Exception e)  {}    
	    }
	    
	    @Then("^user verify the error message$")
	    public void user_verify_the_error_message() throws Throwable {
	    	try { 
	    	 WaitForWebelement(hp.getErrorMessage());
	    	 hp.getErrorMessage().isDisplayed();
	    	 Assert.assertTrue(hp.getErrorMessage().isDisplayed(),"Invaild Email or password");
	    	 } catch(Exception e)  {}	
	    }

	    @Then("^user click on signup button$")
	    public void user_click_on_signup_button() throws Throwable {
	    	try { 
	    	 WaitForWebelement(hp.getsignup());
	    	 hp.getsignup().click();
	    	 Thread.sleep(3000);
	         } catch(Exception e)  {}
	    }
	    
	     @Then("^user clicks on contuine$")
	      public void user_clicks_on_contuine() throws Throwable {
	        WaitForWebelement(hp.getemail());
	       	hp.getloginbutton().click();
	       	WaitForWebelement(hp.getEmailError());
	       	Assert.assertTrue(hp.getEmailError().isDisplayed(), "Error message fuction working fine");
	       	Thread.sleep(4000);
	        }  
	    
	      @Then("^user enters the \"([^\"]*)\"$")
	      public void user_enters_the_something(String strArg1) throws Throwable {
	         WaitForWebelement(hp.getemail());
	   	     hp.getemail().sendKeys(getTest(strArg1));
	   	     Assert.assertTrue(hp.getemail().isDisplayed());
	        }

	      @Then("^click on signup with mobile$")
	      public void click_on_signup_with_mobile() throws Throwable {
	         hp.getsignwithmobile().click();
	         Thread.sleep(3000);  
	        }
	      
	      @Then("^user enter the \"([^\"]*)\"$")
	      public void user_enter_the_something(String strArg1) throws Throwable {
	          hp.getname().sendKeys(getTest(strArg1));
	      }

	      @Then("^user enter \"([^\"]*)\"$")
	      public void user_enter_something(String strArg1) throws Throwable {
	    	  hp.getlastname().sendKeys(getTest(strArg1));
	      }

	      @Then("^user have to enter the \"([^\"]*)\"$")
	      public void user_have_to_enter_the_something(String strArg1) throws Throwable {
	    	  hp.getmobile().sendKeys(getTest(strArg1));
	      }

	      @Then("^user has to enter the \"([^\"]*)\"$")
	      public void user_has_to_enter_the_something(String strArg1) throws Throwable {
	    	  hp.getsignemail().sendKeys(getTest(strArg1));	  
	      }
	      @Then("^user enter to the \"([^\"]*)\"$")
	      public void user_enter_to_the_something(String strArg1) throws Throwable {
	    	  hp.getsignpassword().sendKeys(getTest(strArg1));
	    	  Thread.sleep(3000);
	      }
	      @Then("^user click on male button$")
	      public void user_click_on_male_button() throws Throwable {
	           hp.getfemale().click();
	          Thread.sleep(3000);
	      }
	      @Then("^user click on final button$")
	      public void user_click_on_final_button() throws Throwable {
	    	  Thread.sleep(3000);
	    	  Assert.assertTrue(hp.getsignupbutton().isDisplayed());
	          hp.getsignupbutton().click();
	          Thread.sleep(7000);
	      }
	        
	      @Then("^User Opens a product$")
	      public void user_opens_a_product() throws Throwable {
	          driver.navigate().to("https://p72.bewakoof.com/p/scarlet-red-plain-t-shirt-for-men");
	      }

	      @Then("^user select the size$")
	      public void user_select_the_size() throws Throwable {
	    	  Thread.sleep(3000);
	    	  hp.getsize().click();
	      }

	      @Then("^user click on Add to bag button$")
	      public void user_click_on_add_to_bag_button() throws Throwable {
	    	  Thread.sleep(3000);
	    	  hp.getaddtobag().click();
	      }

	      @Then("^user click on cart button$")
	      public void user_click_on_cart_button() throws Throwable {
	    	  Thread.sleep(3000);
	    	  hp.getaddtocardbutton().click();
	    	  Thread.sleep(3000);
	      }

	      @Then("^user click on select delivery address$")
	      public void user_click_on_select_delivery_address() throws Throwable {
	    	  Thread.sleep(3000);
	    	  hp.getselectaddress().click();
	      }

	      @Then("^user click on address$")
	      public void user_click_on_address() throws Throwable {
	    	  Thread.sleep(3000);
	    	  hp.getaddress().click();
	      }

	      @Then("^user click on COD option$")
	      public void user_click_on_cod_option() throws Throwable {
	    	  Thread.sleep(3000);
	    	  hp.getCOD().click();
	      }

	      @Then("^user click on Pay with cash button$")
	      public void user_click_on_pay_with_cash_button() throws Throwable {
	    	  Thread.sleep(3000);
	    	  hp.getpaycash().click();
	    	  Thread.sleep(3000);
	    	 }
	      
	      @Then("^user click on credit and debit$")
	      public void user_click_on_credit_and_debit() throws Throwable {
	    	  Thread.sleep(3000);
	    	  hp.getdebit().click();
	    	  
	      }

	      @Then("^user click on card$")
	      public void user_click_on_card() throws Throwable {
	    	  Thread.sleep(3000);
	    	  hp.getaddcard().click();
	    	  
	      }
	      @Then("^user had to enter the \"([^\"]*)\"$")
	      public void user_had_to_enter_the_something(String strArg1) throws Throwable {
	    	  Thread.sleep(3000);
	    	  hp.getcvv().sendKeys(getTest(strArg1));
	    	 
	      }
	      
	      @Then("^user click on paynow button$")
	      public void user_click_on_paynow_button() throws Throwable {
	    	  Thread.sleep(1000);
	    	  hp.getpaynow().click();
	    	  
	      }
	      
	      
	      @Then("^user click on cardsubmit button$")
	      public void user_click_on_cardsubmit_button() throws Throwable {
	    	  Thread.sleep(1000);
	    	  hp.getcardsubmit().click();
	    	  Thread.sleep(3000);
	      }

	      @Then("^user submit the \"([^\"]*)\"$")
	      public void user_submit_the_something(String strArg1) throws Throwable {
	    	  Thread.sleep(4000);
	    	  hp.getotp().sendKeys(getTest(strArg1));
	    	  }
	      
	      
	      @Then("^user entering the \"([^\"]*)\"$")
	      public void user_entering_the_something(String strArg1) throws Throwable {
	    	  Thread.sleep(3000);
	    	  hp.getcoupon().sendKeys(getTest(strArg1));
	    	  Thread.sleep(1000);
	    	  hp.getapplybutton().click();
	      }
	      
	      @Then("^user click on have a coupon$")
	      public void user_click_on_have_a_coupon() throws Throwable {
		    	hp.getcouponbutton().click();
		    	Thread.sleep(2000);
	      }
	      
	      @Then("^user click on select delivery address1$")
	      public void user_click_on_select_delivery_address1() throws Throwable {
	    	  Thread.sleep(3000);
	    	  hp.getselectaddress1().click();
	      }
	      
	      @Then("^user click on address1$")
	      public void user_click_on_address1() throws Throwable {
	    	  Thread.sleep(3000);
	    	  hp.getaddress1().click(); 
	      }
	      
	      @Then("^user click on confirm button$")
	      public void user_click_on_confirm_button() throws Throwable {
	    	  Thread.sleep(3000);
	    	  hp.getconfirmorder().click();
	    	  Thread.sleep(3000);
	      }
	      
		   @Then("^user close the browser$")
		   public void user_close_the_browser() throws Throwable {
		    	    driver.close();   
		    	    }
		   
		   
		   
}

