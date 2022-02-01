package BDD.StepDefinition;

import org.junit.runner.RunWith;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
public class StepDefinitions
{
    @Given("^AddPlace JSON Payload$")
    public void buildJSONPayload(){

    }
    @When("^User wants to add new place with Post Request$")
    public void addPlace()
    {

    }
    @Then("^Place should be added through AddPlace API with a response code 200$")
    public void validateResponse()
    {

    }
    @And("^Status is OK$")
    public void validateStatus()
    {

    }
    @And("^Scope is App$")
    public void validateScope()
    {
        
    }

}


