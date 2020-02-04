package stepDefinitions;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
public class StepDefinition {

    @Given("^User on Landing Page$")
    public void user_on_landing_page() throws Throwable {
    	System.out.println("I'm inside Given Command");
      
    }

    @When("^User Login into application with username and password$")
    public void user_login_into_application_with_username_and_password() throws Throwable {
    	System.out.println("I'm inside When Command");

      
    }

    @Then("^Home page is populated$")
    public void home_page_is_populated() throws Throwable {
    	System.out.println("I'm inside Then Command");

      
    }

    @And("^Cards are displayed$")
    public void cards_are_displayed() throws Throwable {
    	System.out.println("I'm inside AND Command");

        
    }

}