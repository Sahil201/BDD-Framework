package qa.tesco.web.pages;

import driver.DriverHelpers;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.startsWith;
import static org.hamcrest.MatcherAssert.assertThat;

public class Login extends DriverHelpers{

//    @FindBy(xpath = "//a[@title='Sign in']")
//    public WebElement signInBtn;






    public void onHomePage(){
        // validate user on home page
        String homePageTitle = driver.getTitle();
        assertThat(homePageTitle,is(startsWith("Argos")));
    }


    public void clickOnSignInBtn(){
        // click on sign in button
//        signInBtn.click();
    }

}


