package JUnitRestAssuredRequests;

import Util.Pojos.Address;
import Util.Pojos.FirstUserPOJO;
import Util.Pojos.GeoInfo;
import io.restassured.http.ContentType;


import static  io.restassured.RestAssured.given;
import org.junit.Test;

public class PutRequestJSon {


    @Test
    public void putReqUpate() {

        FirstUserPOJO user = new FirstUserPOJO();
        Address adressObj = new Address();
        GeoInfo GeoObect = new GeoInfo();
        GeoObect.setLat("90.3159");
        GeoObect.setLng("81.1396");
        adressObj.setStreet("Kudas Light");
        adressObj.setSuite("Apt. 44");
        adressObj.setCity("Swenborough");
        adressObj.setZipcode("34398-3874");
        adressObj.setGeoInfoObject(GeoObect);

        user.setId(55);
        user.setName("nne yyyham");
        user.setUsername("Zret");
        user.setEmail("Sendere@april.biz");
        user.setAdressObject(adressObj);

        given().contentType(ContentType.JSON).when().body(user).get("https://jsonplaceholder.typicode.com/users/1")
                .then().statusCode(200).log().all();
    }
    @Test
    public void PatchReqUpate() {

        FirstUserPOJO user = new FirstUserPOJO();
        Address adressObj = new Address();
        GeoInfo GeoObect = new GeoInfo();


        adressObj.setCity("OOOOOOough");
        adressObj.setZipcode("34398-3874");
        adressObj.setGeoInfoObject(GeoObect);

        user.setId(1);
        user.setName("Meanne Graham");
        user.setUsername("Zret");
        user.setEmail("Sendere@april.biz");
        user.setAdressObject(adressObj);

        given().contentType(ContentType.JSON).when().body(user).get("https://jsonplaceholder.typicode.com/users/1")
                .then().statusCode(200).log().all();
    }
}
