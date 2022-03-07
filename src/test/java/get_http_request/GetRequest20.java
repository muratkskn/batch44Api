package get_http_request;

import base_url.JsonPlaceHolderBaseUrl;
import io.restassured.response.Response;
import org.junit.Test;

import java.util.HashMap;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.equalTo;

public class GetRequest20 extends JsonPlaceHolderBaseUrl {

     /*
https://jsonplaceholder.typicode.com/todos/2
1) Status kodunun 200,
2) respose body'de,
         "completed": değerinin false
         "title": değerinin "quis ut nam facilis et officia qui"
         "userId" sinin 1 ve
    header değerlerinden
         "via" değerinin "1.1 vegur" ve
         "Server" değerinin "cloudflare" olduğunu test edin…
*/



@Test
public void test20(){
    //
    //
    //
    //

    spec04.pathParams("parametre1 ","todos","parametre2");
    HashMap<String, Object> expectedData = new HashMap<>();
    expectedData.put("statusCode", 200);
    expectedData.put("completed", false);
    expectedData.put("userId", 1);
    expectedData.put("via", "1.1 vegur");
    expectedData.put("title","quis ut nam facilis et officia qui");
    expectedData.put("Server", "cloudflare");

    Response response= given().spec(spec04).when().get("/{parametre1}/{parametre2");
    response.prettyPrint();

    //Matcher ile
    response.then().headers("via",equalTo("1.1 vegur")
                    ,"Server",equalTo("cloudflare")).
            body("completed",equalTo(false)
                    ,"userId",equalTo(1)
                    ,"title",equalTo("quis ut nam facilis et officia qui"));

    response.then().assertThat()
            .statusCode((Integer)expectedData.get("statusCode"))
            .headers("via",equalTo(expectedData.get("via")),"server",equalTo(expectedData.get("server")))
            .body("completed",equalTo(expectedData.get("completed"))
                    ,"title",equalTo(expectedData.get("title")),"userId", equalTo(expectedData.get("userId")));
}

}
