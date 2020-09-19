package resources;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class base {


    public WebDriver driver;
    public Properties prop = new Properties();
   // public WebDriverWait wait = new WebDriverWait(driver,30);
   // @Test
    public WebDriver BrowserConfig() throws Exception {
        String path = System.getProperty("user.dir");

        FileInputStream fis = new FileInputStream(path+"/src/main/java/resources/config.properties");
        prop.load(fis);

        String browserName = prop.getProperty("browser");
        System.out.println("Browser Invoked is :"+browserName);

        if(browserName.equalsIgnoreCase("chrome"))
        {
            System.setProperty("webdriver.chrome.driver",path+"/drivers/chrome/chromedriver");
            driver = new ChromeDriver();
        }

        else if (browserName.equalsIgnoreCase("firefox"))
        {
            System.setProperty("webdriver.gecko.driver",path+"\\drivers\\firefox\\geckodriver.exe");
            driver = new FirefoxDriver();
        }

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

       return driver;
    }
    
    public void WaitForWebelement(WebElement element)
    {
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.visibilityOf(element));
    }
}