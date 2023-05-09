package starter.altashop.Categories;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class GetAllProductCategory {
    protected static String url = "https://altashop-api.fly.dev/api/";

    @Step("I set the GET api endpoints")
    public String GETApiEndpointscategory(){
        return url + "categories";
    }
    @Step("I send HTTP api GET request")
    public void HTTPApiGETRequestcategory(){
        SerenityRest.given()
                .when()
                .get(GETApiEndpointscategory());
    }
    @Step("I receive valid HTTP response code 200 for GET All product category")
    public void HTTPResponseCodeForGETAllProductCategory(){
        restAssuredThat(response -> response.statusCode(200));

    }
    @Step("I received valid data for all product category")
    public void ValidDataForAllProductCategory(){
        restAssuredThat(response -> response.statusCode(200));
    }
}
