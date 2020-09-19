package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class signup {
	WebDriver driver;
 public signup(WebDriver driver ) {
	 this.driver=driver;
	 PageFactory.initElements(driver, this);
	
}
 
 @FindBy(id="loginLink")
 private WebElement login;
 
 @FindBy(id="mob_email_id")
 private WebElement email;
 
 @FindBy(id="mob_password")
 private WebElement password;
 
 @FindBy(id="mob_continue_submit")
 private WebElement loginbutton;
 
 @FindBy(xpath="//*[@id=\"mob_email_mobile_no\"]/span[4]/p")
 private WebElement EmailError;
 
 @FindBy(xpath="//span[@id='mob_toast_error']")
 private WebElement ErrorMessage;
 
 

 
 public WebElement getlogin() {
	 
	 return login;
 }
public WebElement getemail() {
	 
	 return email;
 }
public WebElement getpassword() {
	 
	 return password;
}
public WebElement getloginbutton() {
	 
	 return loginbutton;
}
public WebElement getEmailError() {
	 
	 return EmailError;
}
public WebElement getErrorMessage() {
	 
	 return ErrorMessage;

}
}