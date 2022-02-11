package BDD.StepDefinition;

import static org.junit.Assert.assertEquals;
//import static org.junit.Assert.assertTrue;

import org.junit.runner.RunWith;

import BDD.Resources.Helper;
import BDD.Resources.TestDataProvider;
import POJO.Place;
//import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import static io.restassured.RestAssured.*;

@RunWith(Cucumber.class)
public class StepDefinitions {
    RequestSpecification request;
    ResponseSpecification responseSpecification;
    Response response;

    
    
    @Given("AddPlace JSON Payload {string} {string} {string}")
    public void add_place_json_payload(String name, String language, String address) throws Exception {
        // Write code here that turns the phrase above into concrete actions

        System.out.println("This is start atgiven");
        Helper helper = new Helper();
        TestDataProvider testData = new TestDataProvider();
        RequestSpecification reqSpec = helper.getNewRequest();
        Place newPlace = testData.getPlace(name,language,address);

        responseSpecification = helper.createResponse();

        request = given().log().all().spec(reqSpec).body(newPlace);

    }

    @When("^User wants to add new place with Post Request$")
    public void user_wants_to_add_new_place_with_Post_Request() {
        
        response = request.when().post("/maps/api/place/add/json").then().log().all().spec(responseSpecification).extract()
                    .response();

                    System.out.println("This is start at when");

        System.out.println("Response is"+response.toString());

    }

    @Then("^Place should be added through AddPlace API with a response code 200$")
    public void place_should_be_added_through_AddPlace_API_with_a_response_code_200 () {

        assertEquals(response.getStatusCode(),200);
        

        System.out.println("This is start at Then");




    }

    @Then("{string} is {string}")
    public void is(String responseAttribute, String expectedResult) {
        // Write code here that turns the phrase above into concrete actions

    }

}
