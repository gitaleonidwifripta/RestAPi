package starter.altashop.produk;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;


public class GetALLProduct {
    protected static String url = "https://altashop-api.fly.dev/api/";

    @Step("I set GET endpoints product")
    public String GETEndpointsProduct(){
        return url + "products";
    }
    @Step("I send GET HTTP request product")
    public void GETHTTPRequestProduct(){
        SerenityRest.given()
                .when()
                .get(GETEndpointsProduct());
    }
    @Step("I receive valid HTTP response code 200")
    public void ValidHTTPResponseCodegetallproduct(){
        restAssuredThat(response -> response.statusCode(200));

    }
    @Step("I received valid data for all products")
    public void ValidDataForAllProducts(){
        restAssuredThat(response -> response.statusCode(200));
    }
}

