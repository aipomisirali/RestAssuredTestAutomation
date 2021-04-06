package JUnitRestAssuredRequests;
import io.restassured.response.Response;
import static  io.restassured.RestAssured.given;
import org.junit.Test;
public class GetRequestInCucumber {
    @Test
    public void JesonPlaceHolder(){
        Response response= given().when().get("https://jsonplaceholder.typicode.com/users");//.then().statusCode(200);
      System.out.print(response.body().asString());

     given().when().get("https://jsonplaceholder.typicode.com/users").then().statusCode(200);

    }


}
