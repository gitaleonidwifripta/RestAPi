package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.altashop.order.GetAllOrder;
import starter.altashop.order.GetIdOrder;
import starter.altashop.order.PostOrder;

public class OrderSteps {
    @Steps
    GetAllOrder getallorder;
    @Steps
    PostOrder postorder;
    @Steps
    GetIdOrder getidorder;
    @Given("I set the GET api endpoint for order")
    public void iSetTheGETApiEndpointForOrder() {
        getallorder.GETApiEndpointForOrder();
    }

    @When("I send HTTP api GET request for order")
    public void iSendHTTPApiGETRequestForOrder() {
        getallorder.HTTPApiGETRequestForOrder();
    }

    @Then("I receive valid HTTP response code {int} for get all data order")
    public void iReceiveValidHTTPResponseCodeForGetAllDataOrder(int arg0) {
        getallorder.ValidHTTPResponseCodeForGetAllDataOrder();
    }

    @And("I received valid data for all order")
    public void iReceivedValidDataForAllOrder() {
        getallorder.ValidDataForAllOrder();
    }


    @Given("I set the POST api endpoints in order")
    public void iSetThePOSTApiEndpointsInOrder() {
        postorder.POSTApiEndpointsInOrder();
    }

    @When("I send HTTP api POST request for order")
    public void iSendHTTPApiPOSTRequestForOrder() {
        postorder.piPOSTRequestForOrder();
    }

    @Then("I receive a valid HTTP response code {int} on the order POST")
    public void iReceiveAValidHTTPResponseCodeOnTheOrderPOST(int arg0) {
        postorder.ValidHTTPResponseCodeOnTheOrderPOST();
    }

    @And("I receive valid data for create new order")
    public void iReceiveValidDataForCreateNewOrder() {
        postorder.ValidDataForCreateNewOrder();
    }

    @Given("I set the GET api endpoint for order by id")
    public void iSetTheGETApiEndpointForOrderById() {
        getidorder.GETApiEndpointForOrderById();
    }

    @When("I send HTTP api GET request for order by id")
    public void iSendHTTPApiGETRequestForOrderById() {
        getidorder.ApiGETRequestForOrderById();
    }

    @Then("I receive valid HTTP response code {int} for get id data order")
    public void iReceiveValidHTTPResponseCodeForGetIdDataOrder(int arg0) {
        getidorder.HTTPResponseCodeForGetIdDataOrder();
    }

    @And("I receive valid data for id order")
    public void iReceiveValidDataForIdOrder() {
        getidorder.ValidDataForIdOrder();
    }
}
