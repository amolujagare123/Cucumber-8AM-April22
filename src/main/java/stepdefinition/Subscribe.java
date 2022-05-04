package stepdefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Subscribe {

    @Given("^I am on user subscription page$")
    public void i_am_on_user_subscription_page() throws Throwable {

    }

    @When("^I enter (.+) ,(.+) ,(.+)$")
    public void i_enter_(String name, String contact, String email) throws Throwable {

        System.out.println("name="+name);
        System.out.println("contact="+contact);
        System.out.println("email="+email);

    }

    @Then("^user should be subscribed$")
    public void user_should_be_subscribed() throws Throwable {

    }

    @And("^I click on subscribe button$")
    public void i_click_on_subscribe_button() throws Throwable {

    }
}
