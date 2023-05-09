package starter.altashop.produk;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class PostRating {
    protected static String url = "https://altashop-api.fly.dev/api/";
    @Step("I set POST endpoints by rating")
    public String POSTEndpointsByRating(){
        return url + "products/13646/ratings";
    }
    @Step("I send POST HTTP request by rating")
    public void POSTHTTPRequestByRating(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("count", 4);


        SerenityRest.given().header("Authorization","Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJGdWxsbmFtZSI6IkdpdGEgTGVvbmkgZHdpIGZyaXAiLCJFbWFpbCI6ImdpdGFsZWUyMUBnbWFpbC5jb20ifQ.TGsRtCS1_W5fQoxLxVSMhDknX_uoRVw_0tYCGs1StVE")
                .header("Content-Type", "application/json").body(requestBody.toJSONString()).post(POSTEndpointsByRating());
    }
    @Step("I receive valid HTTP response code 200 in products rating POST")
    public void HTTPResponseCodeInProductsRatingPOST(){
        restAssuredThat(response -> response.statusCode(200));
    }
    @Step("I receive valid data for assign product rating")
    public void ValidDataForAssignProductRating(){
        restAssuredThat(response -> response.statusCode(200));
    }
}
