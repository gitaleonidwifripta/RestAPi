package starter.altashop.produk;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class GetIdProduct {
    protected static String url = "https://altashop-api.fly.dev/api/";

    @Step("I set GET endpoints by id")
    public String GETEndpointsById(){
        return url+ "products/13369";
    }
    @Step("I send GET HTTP request by id")
    public void GETHTTPRequestById(){
        SerenityRest.given().header("Authorization","Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJGdWxsbmFtZSI6IkdpdGEgTGVvbmkgZHdpIGZyaXAiLCJFbWFpbCI6ImdpdGFsZWUyMUBnbWFpbC5jb20ifQ.TGsRtCS1_W5fQoxLxVSMhDknX_uoRVw_0tYCGs1StVE")
                .get(GETEndpointsById());
    }
    @Step("I receive a valid HTTP response code 200 for Get id data products")
    public void AValidHTTPResponseCodeForGetIdDataProducts(){
        restAssuredThat(response -> response.statusCode(200));
    }
    @Step("I receive valid data for id products")
    public void ValidDataForIdProducts(){

    }

}
