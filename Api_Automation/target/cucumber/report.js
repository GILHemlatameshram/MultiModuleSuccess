$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("D:/MyStudy/BDD/JITAutomation/Api_Automation/src/main/resources/com/qa/featuresApi/OrgFeature.feature");
formatter.feature({
  "line": 1,
  "name": "Rest Api get testing using Rest Assured",
  "description": "",
  "id": "rest-api-get-testing-using-rest-assured",
  "keyword": "Feature"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "Set web application url to the application url",
  "keyword": "Given "
});
formatter.match({
  "location": "OrgStepDefinition.set_web_application_url_to_the_application_url()"
});
formatter.result({
  "duration": 956715836,
  "status": "passed"
});
formatter.scenario({
  "line": 6,
  "name": "Get request",
  "description": "",
  "id": "rest-api-get-testing-using-rest-assured;get-request",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 7,
  "name": "get api endpoint as proper url",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "Set HEADER param response accept type as json type",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "Raise GET HTTP request",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "Valid HTTP response should be received",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "Response http code should be 200",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "Response BODY should not be null or empty",
  "keyword": "Then "
});
formatter.match({
  "location": "OrgStepDefinition.get_api_endpoint_as_proper_url()"
});
formatter.result({
  "duration": 1359119211,
  "status": "passed"
});
formatter.match({
  "location": "OrgStepDefinition.set_HEADER_param_response_accept_type_as_json_type()"
});
formatter.result({
  "duration": 429824128,
  "status": "passed"
});
formatter.match({
  "location": "OrgStepDefinition.raise_GET_HTTP_request()"
});
formatter.result({
  "duration": 6791656208,
  "status": "passed"
});
formatter.match({
  "location": "OrgStepDefinition.valid_HTTP_response_should_be_received()"
});
formatter.result({
  "duration": 108590866,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "200",
      "offset": 29
    }
  ],
  "location": "OrgStepDefinition.response_http_code_should_be(int)"
});
formatter.result({
  "duration": 10233330,
  "status": "passed"
});
formatter.match({
  "location": "OrgStepDefinition.response_BODY_should_not_be_null_or_empty()"
});
formatter.result({
  "duration": 141825,
  "status": "passed"
});
});