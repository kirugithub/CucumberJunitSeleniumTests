package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class MyStepdefs {
    private WebDriver driver ;

    @Given("I am viewing the Google home page")
    public void iAmViewingTheGoogleHomePage() {
        System.out.println("Given");
    }

    @When("I submit a search for {string}")
    public void iSubmitASearchForCucumber(String input) {
        System.out.println("when  "+ input +"  is entered");
    }

    @Then("the search is performed")
    public void theSearchIsPerformed() {
        System.out.println("Then");
    }

    @And("the Cucumber.io website is included on the first page of results")
    public void theCucumberIoWebsiteIsIncludedOnTheFirstPageOfResults() {
        System.out.println("And");

    }
}
