package stepDefinations;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import qa.tesco.web.pages.Login;

public class LoginStepDef {

    Login login = new Login();

    @Given("^as a user I am on homepage$")
    public void as_a_user_I_am_on_homepage() {
        login.onHomePage();
    }


    @When("^I click on sign in page$")
    public void i_click_on_sign_in_page() {

    }

    @Then("^I navigate to sign in page$")
    public void i_navigate_to_sign_in_page() {

    }

    @When("^I enter email address as \"([^\"]*)\"$")
    public void i_enter_email_address_as(String arg1) {

    }

    @When("^I enter password as \"([^\"]*)\"$")
    public void i_enter_password_as(String arg1) {

    }

    @When("^I click on Sign In button$")
    public void i_click_on_Sign_In_button() {

    }

    @Then("^I sign in successfully$")
    public void i_sign_in_successfully() {

    }
}
