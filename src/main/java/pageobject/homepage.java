package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class homepage {
	WebDriver driver;
 public homepage(WebDriver driver ) {
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
}
