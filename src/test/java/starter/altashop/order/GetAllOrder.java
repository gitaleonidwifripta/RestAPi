package starter.altashop.order;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class GetAllOrder {
    protected static String url = "https://altashop-api.fly.dev/api/";

    @Step("I set the GET api endpoint for order")
    public String GETApiEndpointForOrder(){
        return url + "orders";
    }
    @Step("I send HTTP api GET request for order")
    public void HTTPApiGETRequestForOrder(){

        SerenityRest.given().header("Authorization","Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJGdWxsbmFtZSI6IkdpdGEgTGVvbmkgZHdpIGZyaXAiLCJFbWFpbCI6ImdpdGFsZWUyMUBnbWFpbC5jb20ifQ.TGsRtCS1_W5fQoxLxVSMhDknX_uoRVw_0tYCGs1StVE")
                .get(GETApiEndpointForOrder());
    }
    @Step("I receive valid HTTP response code 200 for get all data order")
    public void ValidHTTPResponseCodeForGetAllDataOrder(){
        restAssuredThat(response -> response.statusCode(200));

    }
    @Step("I received valid data for all order")
    public void ValidDataForAllOrder(){
        restAssuredThat(response -> response.statusCode(200));
    }
}
