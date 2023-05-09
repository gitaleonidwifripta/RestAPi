package starter.altashop.order;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class GetIdOrder {
    protected static String url = "https://altashop-api.fly.dev/api/";

    @Step("I set the GET api endpoint for order by id")
    public String GETApiEndpointForOrderById(){
        return url+ "orders/10776";
    }
    @Step("I send HTTP api GET request for order by id")
    public void ApiGETRequestForOrderById(){
        SerenityRest.given().header("Authorization","Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJGdWxsbmFtZSI6IkdpdGEgTGVvbmkgZHdpIGZyaXAiLCJFbWFpbCI6ImdpdGFsZWUyMUBnbWFpbC5jb20ifQ.TGsRtCS1_W5fQoxLxVSMhDknX_uoRVw_0tYCGs1StVE")
                .get(GETApiEndpointForOrderById());
    }
    @Step("I receive valid HTTP response code 200 for get id data order")
    public void HTTPResponseCodeForGetIdDataOrder(){
        restAssuredThat(response -> response.statusCode(200));
    }
    @Step("I receive valid data for id order")
    public void ValidDataForIdOrder(){

    }
}
