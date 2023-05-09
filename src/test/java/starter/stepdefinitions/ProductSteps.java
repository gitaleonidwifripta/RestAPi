package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.altashop.produk.*;

public class ProductSteps {
    @Steps
    GetALLProduct getallproduct;
    @Steps
    GetIdProduct getidproduct;
    @Steps
    DeleteProduct deleteproduct;
    @Steps
    GetProductRating getproductrating;
    @Steps
    GetProductComment getproductcomment;
    @Steps
    PostProduct postproduct;
    @Steps
    PostRating postrating;
    @Steps
    PostComment postcomment;
    @Given("I set GET endpoints product")
    public void iSetGETEndpointsProduct() {
        getallproduct.GETEndpointsProduct();
    }

    @When("I send GET HTTP request product")
    public void iSendGETHTTPRequestProduct() {
        getallproduct.GETHTTPRequestProduct();
    }

    @Then("I receive valid HTTP response code {int}")
    public void iReceiveValidHTTPResponseCode(int arg0) {
        getallproduct.ValidHTTPResponseCodegetallproduct();
    }

    @And("I received valid data for all products")
    public void iReceivedValidDataForAllProducts() {
        getallproduct.ValidDataForAllProducts();
    }

    @Given("I set GET endpoints by id")
    public void iSetGETEndpointsById() {
        getidproduct.GETEndpointsById();
    }

    @When("I send GET HTTP request by id")
    public void iSendGETHTTPRequestById() {
        getidproduct.GETHTTPRequestById();
    }

    @Then("I receive a valid HTTP response code {int} for Get id data products")
    public void iReceiveAValidHTTPResponseCodeForGetIdDataProducts(int arg0) {
        getidproduct.AValidHTTPResponseCodeForGetIdDataProducts();
    }

    @And("I receive valid data for id products")
    public void iReceiveValidDataForIdProducts() {
        getidproduct.ValidDataForIdProducts();
    }

    @Given("I set DELETE endpoints")
    public void iSetDELETEEndpoints() {
        deleteproduct.DELETEEndpoints();
    }

    @When("I send DELETE HTTP request")
    public void iSendDELETEHTTPRequest() {
        deleteproduct.DELETEHTTPRequest();
    }

    @Then("I receive a valid HTTP response code {int} in products DELETE")
    public void iReceiveAValidHTTPResponseCodeInProductsDELETE(int arg0) {
        deleteproduct.ValidHTTPResponseCodeInProductsDELETE();
    }

    @Given("I set GET endpoints by rating")
    public void iSetGETEndpointsByRating() {
        getproductrating.GETEndpointsByRating();
    }

    @When("I send GET HTTP request by rating")
    public void iSendGETHTTPRequestByRating() {
        getproductrating.GETHTTPRequestByRating();
    }

    @Then("I receive valid HTTP response code {int} for Get rating data products")
    public void iReceiveValidHTTPResponseCodeForGetRatingDataProducts(int arg0) {
        getproductrating.ValidHTTPResponseCodeForGetRatingDataProducts();
    }

    @And("I receive valid data for rating products")
    public void iReceiveValidDataForRatingProducts() {
        getproductrating.ValidDataForRatingProducts();
    }

    @Given("I set GET endpoints by comment")
    public void iSetGETEndpointsByComment() {
        getproductcomment.GETEndpointsByComment();
    }

    @When("I send GET HTTP request by comment")
    public void iSendGETHTTPRequestByComment() {
        getproductcomment.GETHTTPRequestByComment();
    }

    @Then("I receive valid HTTP response code {int} for Get comment data products")
    public void iReceiveValidHTTPResponseCodeForGetCommentDataProducts(int arg0) {
        getproductcomment.ValidHTTPResponseCodeForGetCommentDataProducts();
    }

    @And("I receive valid data for comment products")
    public void iReceiveValidDataForCommentProducts() {
        getproductcomment.ValidDataForCommentProducts();
    }

    @Given("I set POST endpoints product")
    public void iSetPOSTEndpointsProduct() {
        postproduct.POSTEndpointsProduct();
    }

    @When("I submit a POST request product")
    public void iSubmitAPOSTRequestToWithNameDescriptionPriceAndCategories() {
        postproduct.POSTRequestToWithNameDescriptionPriceAndCategories();
    }

    @Then("I receive a valid HTTP response code {int} in products POST")
    public void iReceiveAValidHTTPResponseCodeInProductsPOST(int arg0) {
        postproduct.HTTPResponseCodeInProductsPOST();
    }

    @And("I receive valid data for new product")
    public void iReceiveValidDataForNewProduct() {
        postproduct.ValidDataForNewProduct();
    }


    @Given("I set POST endpoints by rating")
    public void iSetPOSTEndpointsByRating() {
        postrating.POSTEndpointsByRating();
    }

    @When("I send POST HTTP request by rating")
    public void iSendPOSTHTTPRequestByRating() {
        postrating.POSTHTTPRequestByRating();
    }

    @Then("I receive valid HTTP response code {int} in products rating POST")
    public void iReceiveValidHTTPResponseCodeInProductsRatingPOST(int arg0) {
        postrating.HTTPResponseCodeInProductsRatingPOST();
    }

    @And("I receive valid data for assign product rating")
    public void iReceiveValidDataForAssignProductRating() {
        postrating.ValidDataForAssignProductRating();
    }

    @Given("I set POST endpoints by comment")
    public void iSetPOSTEndpointsByComment() {
        postcomment.POSTEndpointsByComment();
    }

    @When("I send POST HTTP request by comment")
    public void iSendPOSTHTTPRequestByComment() {
        postcomment.POSTHTTPRequestByComment();
    }

    @Then("I receive valid HTTP response code {int} in products comment POST")
    public void iReceiveValidHTTPResponseCodeInProductsCommentPOST(int arg0) {
        postcomment.ValidHTTPResponseCodeInProductsCommentPOST();
    }

    @And("I receive valid data for new comment")
    public void iReceiveValidDataForNewComment() {
        postcomment.ValidDataForNewComment();
    }
}
