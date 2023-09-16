@feature1
Feature: Campaign functionality
@sanity
Scenario: Creation of Campaign
Given user is at campaign page
When user click on campaign button 
And User enters the information 
And user click on save button 
Then Campaign should get created

@regression
Scenario: Scheduling of campaign 
Given user is at campaign page
When user click on edit campaign
And User enters the sending information 
And user click on Schedule button 
Then Campaign should get Schedule

@functional
Scenario: sent campaign 
Given user is at campaign page
When user click on sent campaign
Then user should see the sent count