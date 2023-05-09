package starter.altashop.produk;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class DeleteProduct {
    protected String url = "https://altashop-api.fly.dev/api/";
    @Step("I set DELETE endpoints")
    public String DELETEEndpoints(){
        return url + "products/11365";
    }

    @Step("I send DELETE HTTP request")
    public void DELETEHTTPRequest(){
        SerenityRest.given().delete(DELETEEndpoints());
    }
    @Step("I receive a valid HTTP response code 200 in products DELETE")
    public void ValidHTTPResponseCodeInProductsDELETE(){
        restAssuredThat(response -> response.statusCode(200));
    }
}
