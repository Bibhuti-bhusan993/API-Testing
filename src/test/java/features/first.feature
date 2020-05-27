Feature: Verify first API test 
Scenario: Verify GET method API 

	Given User hit POST API 
	When User updated place details with PUT method 
	Given User send GET request and verify response in API 
	Then User delete the place with DELETE method 
	
