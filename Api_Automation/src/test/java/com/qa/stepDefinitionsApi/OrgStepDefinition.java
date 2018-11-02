package com.qa.stepDefinitionsApi;

import org.junit.Assert;

import com.qa.base.TestBaseApi;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;

public class OrgStepDefinition extends TestBaseApi{
	TestBaseApi base;
	String url;
	RequestSpecification httpReq;
	Response response;
	ResponseBody body;
	@Given("^Set web application url to the application url$")
	public void set_web_application_url_to_the_application_url() throws Throwable {	   
	   base = new TestBaseApi();
	   url = prop.getProperty("ApiURL");	   
	}

	@Given("^get api endpoint as proper url$")
	public void get_api_endpoint_as_proper_url() throws Throwable {
		url = prop.getProperty("ApiURL");//+ prop.getProperty("ApiserviceURL");
		RestAssured.baseURI = url;
	}

	@Given("^Set HEADER param response accept type as json type$")
	public void set_HEADER_param_response_accept_type_as_json_type() throws Throwable {
	   httpReq = RestAssured.given();
	  // httpReq.header("Content-Type", "application/json");	   
	}

	@When("^Raise GET HTTP request$")
	public void raise_GET_HTTP_request() throws Throwable {
	   response = httpReq.request(Method.GET,prop.getProperty("ApiserviceURL"));
	  }

	@Then("^Valid HTTP response should be received$")
	public void valid_HTTP_response_should_be_received() throws Throwable {
		String stringBody = response.getBody().asString();
	    System.out.println(stringBody);
	    Assert.assertEquals(true,stringBody.contains("Hyderabad"));
	}
	@Then("^Response http code should be (\\d+)$")
	public void response_http_code_should_be(int arg1) throws Throwable {
	   Assert.assertEquals(RESPONSE_STATUS_CODE_200, response.getStatusCode());	   
	}

	@Then("^Response BODY should not be null or empty$")
	public void response_BODY_should_not_be_null_or_empty() throws Throwable {
	   Assert.assertNotNull(response.body());	   
	}

}
