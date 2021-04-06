package Util.Pojos;

import io.restassured.response.Response;
import org.junit.Assert;

import java.util.List;

public class JSonResponseHelper {

    public static void responseValidations(Response response, List<String> responseElement){
        for(String check: responseElement){
        Assert.assertNotNull(response.then().extract().path(check));}

    }

}
