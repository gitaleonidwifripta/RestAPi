package starter.altashop.Categories;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class DeleteProductCategory {
    protected String url = "https://altashop-api.fly.dev/api/";
    @Step("I set the DELETE api endpoints")
    public String DELETEApiEndpointscategory(){
        return url + "categories/11320";
    }

    @Step("I send HTTP api DELETE request for category")
    public void DELETERequestForCategory(){
        SerenityRest.given().delete(DELETEApiEndpointscategory());
    }
    @Step("I receive valid HTTP response code {int} for category DELETE")
    public void ValidHTTPResponseCodeForCategoryDELETE(){
        restAssuredThat(response -> response.statusCode(200));
    }
}
