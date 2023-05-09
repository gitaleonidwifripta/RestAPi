package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.altashop.Categories.DeleteProductCategory;
import starter.altashop.Categories.GetAllProductCategory;
import starter.altashop.Categories.GetIdProductCategory;
import starter.altashop.Categories.PostProductCategory;

public class ProductCategorySteps {
    @Steps
    GetAllProductCategory getallcategory;
    @Steps
    GetIdProductCategory getidproductcategory;
    @Steps
    DeleteProductCategory deletecategory;
    @Steps
    PostProductCategory postproductcategory;
    @Given("I set the GET api endpoints")
    public void iSetTheGETApiEndpointscategory() {
        getallcategory.GETApiEndpointscategory();
    }

    @When("I send HTTP api GET request")
    public void iSendHTTPApiGETRequestcategory() {
        getallcategory.HTTPApiGETRequestcategory();
    }

    @Then("I receive valid HTTP response code {int} for GET All product category")
    public void iReceiveValidHTTPResponseCodeForGETAllProductCategory(int arg0) {
        getallcategory.HTTPResponseCodeForGETAllProductCategory();
    }

    @And("I received valid data for all product category")
    public void iReceivedValidDataForAllProductCategory() {
        getallcategory.ValidDataForAllProductCategory();
    }

    @Given("I set the GET api endpoints by id")
    public void iSetTheGETApiEndpointsByIdcategory() {
        getidproductcategory.GETApiEndpointsByIdcategory();
    }

    @When("I send HTTP api GET request by id")
    public void iSendHTTPApiGETRequestByIdcategory() {
        getidproductcategory.GETRequestByIdcategory();
    }

    @Then("I receive valid HTTP response code {int} for GET id product category")
    public void iReceiveValidHTTPResponseCodeForGETIdProductCategory(int arg0) {
        getidproductcategory.HTTPResponseCodeForGETIdProductCategory();
    }

    @And("I received valid data for id product category")
    public void iReceivedValidDataForIdProductCategory() {
        getidproductcategory.ValidDataForIdProductCategory();
    }

    @Given("I set the DELETE api endpoints")
    public void iSetTheDELETEApiEndpointscategory() {
        deletecategory.DELETEApiEndpointscategory();
    }

    @When("I send HTTP api DELETE request for category")
    public void iSendHTTPApiDELETERequestForCategory() {
        deletecategory.DELETERequestForCategory();
    }

    @Then("I receive valid HTTP response code {int} for category DELETE")
    public void iReceiveValidHTTPResponseCodeForCategoryDELETE(int arg0) {
        deletecategory.ValidHTTPResponseCodeForCategoryDELETE();
    }

    @Given("I set the POST api endpoints in category")
    public void iSetThePOSTApiEndpointsInCategory() {
        postproductcategory.POSTApiEndpointsInCategory();
    }

    @When("I send HTTP api POST request")
    public void iSendHTTPApiPOSTRequest() {
        postproductcategory.HTTPApiPOSTRequest();
    }

    @Then("I receive valid HTTP response code {int} in product category")
    public void iReceiveValidHTTPResponseCodeInProductCategory(int arg0) {
        postproductcategory.HTTPResponseCodeInProductCategory();
    }

    @And("I receive valid data for new product category")
    public void iReceiveValidDataForNewProductCategory() {
        postproductcategory.ValidDataForNewProductCategory();
    }
}
