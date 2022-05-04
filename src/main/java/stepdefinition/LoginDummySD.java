package stepdefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginDummySD {

    @Given("I am on login page of billing page")
    public void i_am_on_login_page_of_billing_page() {
        System.out.println("I am on login page of billing page");
    }
    @When("I enter correct username and correct password on billing page")
    public void i_enter_correct_username_and_correct_password_on_billing_page() {
        System.out.println("I enter correct username and correct password on billing page");
    }
    @When("I click on login button of billing page")
    public void i_click_on_login_button_of_billing_page() {
        System.out.println("I click on login button of billing page");
    }
    @Then("I should be redirected to Dashboard")
    public void i_should_be_redirected_to_dashboard() {
        System.out.println("I should be redirected to Dashboard");
    }

    @When("I enter incorrect username and incorrect password on billing page")
    public void iEnterIncorrectUsernameAndIncorrectPasswordOnBillingPage() {
        System.out.println("I enter incorrect username and incorrect password on billing page");
    }

    @Then("I should get error")
    public void iShouldGetError() {
        System.out.println("I should get error");
    }

    @When("I enter blank username and password on billing page")
    public void iEnterBlankUsernameAndPasswordOnBillingPage() {
        System.out.println("I enter blank username and password on billing page");
    }

    @Then("I should get another error")
    public void iShouldGetAnotherError() {
        System.out.println("I should get another error");
    }

    @When("I enter username as {string} and password as {string} on billing page")
    public void iEnterUsernameAsAndPasswordAsOnBillingPage(String username, String password) {
        System.out.println("Username:"+username);
        System.out.println("Password:"+password);
    }
}
