package pageobject;

import java.util.List;

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
 
 @FindBy(xpath="//span[@class='msgs']/p")
 private WebElement EmailError;
 
 @FindBy(xpath="//span[@id='mob_toast_error']")
 private WebElement ErrorMessage;
 
 @FindBy(id="mob_sign_up")
 private WebElement signup;
 
 @FindBy(xpath="//button[@class='signupWidMobileBtn']")
 private WebElement signwithmobile;
 
 @FindBy(xpath="//input[@name='fname']")
 private WebElement name;
 
 @FindBy(xpath="//input[@name='lname']")
 private WebElement lastname;
 
 @FindBy(xpath="//input[@name='mobile']")
 private WebElement mobile;
 
 @FindBy(xpath="//input[@name='email']")
 private WebElement signemail;
 
 @FindBy(xpath="//input[@name='password']")
 private WebElement signpassword;
 
 @FindBy(xpath="//div[@class='genderBtnHolder']/span[1]")
 private WebElement female;
 
 @FindBy(xpath="//button[@class='loginSubmit']")
 private WebElement signupbutton;
 
 @FindBy(xpath="//*[@id=\"testSizes_M\"]")
 private WebElement size;
 
 @FindBy(id="addToCart")
 private WebElement addtobag;
 
 @FindBy(xpath="//*[@id=\"testHeaderCart\"]/a")
 private WebElement addtocardbutton;
 
 @FindBy(xpath="//*[@id=\"app\"]/div/div[2]/div/div[5]/div/div/div[2]/div[15]/button")
 private WebElement selectaddress;
 
 @FindBy(xpath="//*[@id=\"app\"]/div/div[2]/div/div[5]/div/div/div[2]/div[16]/button")
 private WebElement selectaddress1;
 

 
 @FindBy(xpath="//*[@id=\"address14655139\"]/div/button")
 private WebElement address;
 
 @FindBy(id="testPaymentGateway-4")
 private WebElement COD; 
 
 @FindBy(id="testPaymentGateway-0")
 private WebElement debit;
 
 @FindBy(xpath="//*[@id=\"app\"]/div/div[2]/div[5]/div/div[1]/div[2]/div[2]/div[2]/div/div/div/div/button")
 private WebElement paycash; 
 
 @FindBy(xpath="//*[@id=\"e1df7a55-4268-446d-9dd2-ec71bbbb982b0\"]")
 private WebElement addcard; 
 
 @FindBy(id="e1df7a55-4268-446d-9dd2-ec71bbbb982b")
 private WebElement cvv;
 
 @FindBy(xpath="//button[@type='submit']")
 private WebElement paynow;

 @FindBy(id="password")
 private WebElement otp;

 @FindBy(id="submitBtn")
 private WebElement cardsubmit;
 
 @FindBy(xpath="//*[@id=\"testHaveGiftCard\"]")
 private WebElement couponbutton;
 
 @FindBy(xpath="//*[@id=\"promocode\"]/div/div/div/div/div/div/form/div/input")
 private WebElement coupon;
 
 @FindBy(xpath="//*[@id=\"promocode\"]/div/div/div/div/div/div/div/button")
 private WebElement applybutton;
 
 @FindBy(xpath="//*[@id=\"address14655169\"]/div/button")
 private WebElement address1;
 
 @FindBy(xpath="//*[@id=\"app\"]/div/div[2]/div[5]/div/div[2]/div[14]/button")
 private WebElement confirmorder;

 
 
 
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
public WebElement getsignup() {
	 
	 return signup;
}
public WebElement getsignwithmobile() {
	 
	 return signwithmobile;
}
	 
public WebElement getname() {
		 
		 return name;	 
}
public WebElement getlastname() {
	 return lastname;		 

}
 public WebElement getmobile() {
	 return mobile;		 

}
 public WebElement getsignemail() {
	 return signemail;		 

}
 public WebElement getsignpassword() { 
	 return signpassword;		 

}
 public WebElement getfemale() { 
	 return female;		 
}
 public WebElement getsignupbutton() { 
	 return  signupbutton;		 
}
 
 public WebElement getaddtobag() { 
	 return addtobag;		 
}
 
 public WebElement getaddtocardbutton() { 
	 return addtocardbutton;		 
}
 public WebElement getselectaddress() { 
	 return selectaddress;		 
}
 public WebElement getaddress() { 
	 return address;		 
}
 public WebElement getCOD() { 
	 return COD;		 
}
 public WebElement getpaycash() { 
	 return paycash;		 
}
 public WebElement getsize() { 
	 return size;		 
}
 public WebElement getdebit() { 
	 return debit;		 
}
 public WebElement getaddcard() { 
	 return addcard;		 
}
 public WebElement getcvv() { 
	 return cvv;		 
}
 
 public WebElement getpaynow() { 
	 return paynow;
}
 public WebElement getotp() { 
	 return otp;
}
 public WebElement getcardsubmit() { 
	 return cardsubmit;
 }
 
 public WebElement getcoupon() { 
	 return coupon; 
}
 public WebElement getcouponbutton() { 
	 return couponbutton;
}
 
 public WebElement getapplybutton() { 
	 return applybutton; 
}
 
 public WebElement getselectaddress1() { 
	 return selectaddress1;
}
 public WebElement getaddress1() { 
	 return address1;		 
}
 public WebElement getconfirmorder() { 
	 return confirmorder;		 
}
 
}