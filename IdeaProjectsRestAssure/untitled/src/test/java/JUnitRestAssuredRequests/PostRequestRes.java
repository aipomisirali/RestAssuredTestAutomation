package JUnitRestAssuredRequests;
import Util.Pojos.Address;
import Util.Pojos.FirstUserPOJO;
import Util.Pojos.GeoInfo;
import io.restassured.http.ContentType;

import static  io.restassured.RestAssured.given;
import org.junit.Test;

public class PostRequestRes {
    @Test
    public void postJasonRequest(){
        FirstUserPOJO user=new FirstUserPOJO();
        Address adressObj=new Address();
        GeoInfo GeoObect=new GeoInfo();
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

        given().contentType(ContentType.JSON).when().body(user).post("https://jsonplaceholder.typicode.com/users")
                .then().statusCode(201).log().all();
    }
}
