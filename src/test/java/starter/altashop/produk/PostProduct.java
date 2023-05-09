package starter.altashop.produk;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class PostProduct {
    protected static String url = "https://altashop-api.fly.dev/api/";
    @Step("I set POST endpoints product")
    public String POSTEndpointsProduct(){
        return url + "products";
    }
    @Step("I submit a POST request product")
    public void POSTRequestToWithNameDescriptionPriceAndCategories(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("name", "kipas angin");
        requestBody.put("description", "mengeluarkan angin sangat kencang");
        requestBody.put("price", 100);
        JSONArray categoriesArray = new JSONArray();
        categoriesArray.add(12541);
        requestBody.put("categories", categoriesArray);

        SerenityRest.given().header("Authorization","Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJGdWxsbmFtZSI6IkdpdGEgTGVvbmkgZHdpIGZyaXAiLCJFbWFpbCI6ImdpdGFsZWUyMUBnbWFpbC5jb20ifQ.TGsRtCS1_W5fQoxLxVSMhDknX_uoRVw_0tYCGs1StVE")
                .header("Content-Type", "application/json").body(requestBody.toJSONString()).post(POSTEndpointsProduct());
    }
    @Step("I receive a valid HTTP response code 200 in products POST")
    public void HTTPResponseCodeInProductsPOST(){
        restAssuredThat(response -> response.statusCode(200));
    }
    @Step("I receive valid data for new product")
    public void ValidDataForNewProduct(){
        restAssuredThat(response -> response.statusCode(200));
    }
}
