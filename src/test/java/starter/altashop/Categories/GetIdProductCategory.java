package starter.altashop.Categories;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class GetIdProductCategory {
    protected static String url = "https://altashop-api.fly.dev/api/";

    @Step("I set the GET api endpoints by id")
    public String GETApiEndpointsByIdcategory(){
        return url+ "categories/13064";
    }
    @Step("I send HTTP api GET request by id")
    public void GETRequestByIdcategory(){
        SerenityRest.given()
                .when()
                .get(GETApiEndpointsByIdcategory());
    }
    @Step("I receive valid HTTP response code 200 for GET id product category")
    public void HTTPResponseCodeForGETIdProductCategory(){
        restAssuredThat(response -> response.statusCode(200));
    }
    @Step("I received valid data for id product category")
    public void ValidDataForIdProductCategory(){

    }
}
