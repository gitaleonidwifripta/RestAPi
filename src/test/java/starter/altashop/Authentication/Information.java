package starter.altashop.Authentication;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;


public class Information {
    protected static String url = "https://altashop-api.fly.dev/api/auth/";

    @Step("I set GET endpoints")
    public String iSetGETEndpoints(){
        return url + "info";
    }
    @Step("I send GET HTTP request")
    public void iSendAGETRequestToTheUserAPIEndpoints(){
        SerenityRest.given().header("Authorization","Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJGdWxsbmFtZSI6IkdpdGEgTGVvbmkgZHdpIGZyaXAiLCJFbWFpbCI6ImdpdGFsZWUyMUBnbWFpbC5jb20ifQ.TGsRtCS1_W5fQoxLxVSMhDknX_uoRVw_0tYCGs1StVE")
                .get(iSetGETEndpoints());
    }
    @Step("I receive valid HTTP response code 200 for get user information")
    public void iReceiveValidHTTPResponseCodeForGetUserInformation(){
        restAssuredThat(response -> response.statusCode(200));

    }
    @Step("I receive valid data of the user")
    public void iReceiveValidDataOfTheUser(){
        restAssuredThat(response -> response.statusCode(200));
    }
}
