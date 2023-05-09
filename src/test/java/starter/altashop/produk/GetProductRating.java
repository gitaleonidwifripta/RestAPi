package starter.altashop.produk;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class GetProductRating {
    protected static String url = "https://altashop-api.fly.dev/api/";

    @Step("I set GET endpoints by rating")
    public String GETEndpointsByRating(){
        return url + "products/2/ratings";
    }
    @Step("I send GET HTTP request by rating")
    public void GETHTTPRequestByRating(){
        SerenityRest.given()
                .when()
                .get(GETEndpointsByRating());
    }
    @Step("I receive valid HTTP response code 200 for Get rating data products")
    public void ValidHTTPResponseCodeForGetRatingDataProducts(){
        restAssuredThat(response -> response.statusCode(200));

    }
    @Step("I receive valid data for rating products")
    public void ValidDataForRatingProducts(){

    }
}
