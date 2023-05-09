package starter.altashop.Categories;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class PostProductCategory {
    protected static String url = "https://altashop-api.fly.dev/api/";
    @Step("I set the POST api endpoints in category")
    public String POSTApiEndpointsInCategory(){
        return url + "categories";
    }
    @Step("I send HTTP api POST request")
    public void HTTPApiPOSTRequest(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("name", "Skincare");
        requestBody.put("description", "Skincare terbaik untuk merawat wajah");

        SerenityRest.given().header("Authorization","Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJGdWxsbmFtZSI6IkdpdGEgTGVvbmkgZHdpIGZyaXAiLCJFbWFpbCI6ImdpdGFsZWUyMUBnbWFpbC5jb20ifQ.TGsRtCS1_W5fQoxLxVSMhDknX_uoRVw_0tYCGs1StVE")
                .header("Content-Type", "application/json").body(requestBody.toJSONString()).post(POSTApiEndpointsInCategory());
    }
    @Step("I receive valid HTTP response code 200 in product category")
    public void HTTPResponseCodeInProductCategory(){
        restAssuredThat(response -> response.statusCode(200));
    }
    @Step("I receive valid data for new product category")
    public void ValidDataForNewProductCategory(){
        restAssuredThat(response -> response.statusCode(200));
    }

}
