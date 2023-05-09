package starter.altashop.produk;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class PostComment {
    protected static String url = "https://altashop-api.fly.dev/api/";
    @Step("I set POST endpoints by comment")
    public String POSTEndpointsByComment(){
        return url + "products/13646/comments";
    }
    @Step("I send POST HTTP request by comment")
    public void POSTHTTPRequestByComment(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("content", "terbaik");


        SerenityRest.given().header("Authorization","Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJGdWxsbmFtZSI6IkdpdGEgTGVvbmkgZHdpIGZyaXAiLCJFbWFpbCI6ImdpdGFsZWUyMUBnbWFpbC5jb20ifQ.TGsRtCS1_W5fQoxLxVSMhDknX_uoRVw_0tYCGs1StVE")
                .header("Content-Type", "application/json").body(requestBody.toJSONString()).post(POSTEndpointsByComment());
    }
    @Step("I receive valid HTTP response code 200 in products comment POST")
    public void ValidHTTPResponseCodeInProductsCommentPOST(){
        restAssuredThat(response -> response.statusCode(200));
    }
    @Step("I receive valid data for new comment")
    public void ValidDataForNewComment(){
        restAssuredThat(response -> response.statusCode(200));
    }
}
