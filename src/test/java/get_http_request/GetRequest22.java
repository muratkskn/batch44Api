package get_http_request;

import org.junit.Test;
import test_data.HerokuTestData;

import java.util.HashMap;

public class GetRequest22 extends HerOkuAppBaseUrl{


    /*
https://restful-booker.herokuapp.com/booking/47
       {
           "firstname": "Ali",
           "lastname": "Can",
           "totalprice": 500,
           "depositpaid": true,
           "bookingdates": {
               "checkin": "2022-02-01",
               "checkout": "2022-02-11"
          }
       }
1) JsonPhat
2) De-Serialization
*/

@Test
    public void test22(){

    spec05.pathParams("first","booking","second",47);


    HerokuTestData expectedObje=new HerokuTestData();
    HashMap<String,Object> expectedTestDataMap= expectedObje.setUpTestData();
    System.out.println(expectedTestDataMap);
}



}
