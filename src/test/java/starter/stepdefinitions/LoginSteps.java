package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import net.thucydides.core.annotations.Steps;
import starter.altashop.Authentication.Information;
import starter.altashop.Authentication.Login;
import starter.altashop.Authentication.Register;

public class LoginSteps {
    @Steps
    Login login;
    @Steps
    Information information;
    @Steps
    Register register;
    @Given("I have valid credentials")
    public void iHaveValidCredentials() {
        login.iHaveValidCredentials();
    }

    @When("I submit a POST request to {string} with email {string} and password {string}")
    public void iSubmitAPOSTRequestToWithEmailAndPassword(String endpoint, String email, String password) {
        login.iSubmitAPOSTRequestToWithEmailAndPassword();
    }

    @Then("I receive valid HTTP response code Login {int}")
    public void iShouldGetAResponseCode(int arg0) {
        login.iShouldGetAResponseCode();
    }


    @Given("I set GET endpoints")
    public void iSetGETEndpoints() {
        information.iSetGETEndpoints();
    }

    @When("I send GET HTTP request")
    public void iSendAGETRequestToTheUserAPIEndpoints() {
        information.iSendAGETRequestToTheUserAPIEndpoints();
    }

    @Then("I receive valid HTTP response code {int} for get user information")
    public void iReceiveValidHTTPResponseCodeForGetUserInformation(int arg0) {
        information.iReceiveValidHTTPResponseCodeForGetUserInformation();
    }

    @And("I receive valid data of the user")
    public void iReceiveValidDataOfTheUser() {
        information.iReceiveValidDataOfTheUser();
    }

    @Given("I register using the correct data")
    public void iRegisterUsingTheCorrectData() {
        register.RegisterUsingTheCorrectData();
    }

    @When("I submit a POST request to {string} with fullname {string}, email {string} and password {string}")
    public void iSubmitAPOSTRequestToWithFullnameEmailAndPassword(String endpoint, String fullname, String email, String password) {
        register.POSTRequestToWithFullnameEmailAndPassword();
    }

    @Then("I receive valid HTTP response code register {int}")
    public void iReceiveValidHTTPResponseCodeRegister(int arg0) {
        register.ValidHTTPResponseCodeRegister();
    }

    @And("register successfully")
    public void registerSuccessfully() {
        register.registerSuccessfully();
    }
}
