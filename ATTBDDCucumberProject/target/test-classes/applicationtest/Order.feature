Feature:  Order functionality

Background: 
Given User should be logged in to the application
When User should be at the orders page

Scenario: Fetching previously placed order information 
When User click on the past order button
Then User should be able to see the past order information 

Scenario: Fetching current placed order information 
When User click on the current order button
Then User should be able to see the current order information 

Scenario: Fetching cancelled order information 
When User click on the cancelled order button
Then User should be able to see the cancelled order information 
