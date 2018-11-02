Feature: Rest Api get testing using Rest Assured

Background:	
	Given Set web application url to the application url
	
Scenario:Get request
Given get api endpoint as proper url
	Given Set HEADER param response accept type as json type	
	When Raise GET HTTP request 
	Then Valid HTTP response should be received 
	Then Response http code should be 200	 
	Then Response BODY should not be null or empty 
	 