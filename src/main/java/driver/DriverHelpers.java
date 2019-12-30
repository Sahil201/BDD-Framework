package driver;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class DriverHelpers {

    public static WebDriver driver;

    public static String browserName = "chrome";

    public DriverHelpers(){
        PageFactory.initElements(driver,this);}


    public void openBrowser(){
        if (browserName.equals("chrome")) {
            System.setProperty("driver.webdriver.chrome", "chromedriver");
            driver = new ChromeDriver();
        }
        else {

        }
    }

    public void maximizeBrowser(){
        driver.manage().window().maximize();
    }
    public void getUrl(String url){
        driver.get(url);
    }
    public void impWait(){
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    }
    public void deleteCookies(){
        driver.manage().deleteAllCookies();
    }

    public void closeBrowser(){
        driver.quit();
    }

}
