package StepDephs;

import Util.Pojos.Address;
import Util.Pojos.FirstUserPOJO;
import Util.Pojos.GeoInfo;
import Util.Pojos.JSonResponseHelper;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import java.util.ArrayList;
import java.util.List;

import static io.restassured.RestAssured.given;

public class PostReqStepdefs {
    private RequestSpecification request;
    private Response response;
    FirstUserPOJO user = new FirstUserPOJO();
    Address adressObj = new Address();
    GeoInfo GeoObect = new GeoInfo();

    @Given("URI for API")
    public void uri_for_api() {

        GeoObect.setLat("-37.3159");
        GeoObect.setLng("81.1496");
        adressObj.setStreet("Kulas Light");
        adressObj.setSuite("Apt. 556");
        adressObj.setCity("Gwenborough");
        adressObj.setZipcode("92998-3874");
        adressObj.setGeoInfoObject(GeoObect);

        user.setId(55);
        user.setName("Leanne Graham");
        user.setUsername("Bret");
        user.setEmail("Sincere@april.biz");
        user.setAdressObject(adressObj);
    }

    @When("user sends a post Request")
    public void user_sends_a_post_request() {
        request = given().header("Content-Type", "application/json")
                .header("Accept-Charset", "UFT-8")
                .log().headers();
    }

    @Then("User should get correct Response")
    public void user_should_get_correct_response() {
        response = request.when().body(user).post("https://jsonplaceholder.typicode.com/users/");

        response.then().statusCode(201).log().all();
        List<String> expectedResponse = new ArrayList<String>();
        expectedResponse.add("name");
        expectedResponse.add("username");
        expectedResponse.add("email");


        JSonResponseHelper.responseValidations(response, expectedResponse);

    }


}

