package starter.altashop.Authentication;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class Login {
    protected static String url = "https://altashop-api.fly.dev/api/auth/";
    @Step("I have valid credentials")
    public String iHaveValidCredentials(){
        return url + "login";
    }
    @Step("I submit a POST request to {string} with email gitalee21@gmail.com and password gitale88")
    public void iSubmitAPOSTRequestToWithEmailAndPassword(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("email", "gitalee21@gmail.com");
        requestBody.put("password", "gitale88");

        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toJSONString()).post(iHaveValidCredentials());
    }
    @Step("I receive valid HTTP response code Login 200")
    public void iShouldGetAResponseCode(){

        restAssuredThat(response -> response.statusCode(200));
    }

}
