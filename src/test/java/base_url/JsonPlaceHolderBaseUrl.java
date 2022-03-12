package base_url;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;
import org.json.JSONObject;
import org.junit.Before;

public class JsonPlaceHolderBaseUrl {

    protected RequestSpecification spec04;

    @Before
    public void setUp(){
        spec04 = new RequestSpecBuilder().setBaseUri("https://jsonplaceholder.typicode.com").build();
    public JSONObject setUpPutData(){
        JSONObject expectedRequest= new JSONObject();
        expectedRequest.put("userId",21);
        expectedRequest.put("title","Wash the dishes");
        expectedRequest.put("completed",false);
        return expectedRequest;


    }
}