Feature: Home page functionality
Scenario: Validate title
Given User is at landing page
Then page title should contains "Shopping"

Scenario:  Veerify cart icon
Given User is at landing page
Then cart icon should get displayed

Scenario: Checkout the deals section
Given User is at landing page
When User click on summer section deal 


Scenario: login to app
Given User is at landing page
When User clicks on signin button 
And User enters username as "9326897118"
And User enters password as "1234" with signin
