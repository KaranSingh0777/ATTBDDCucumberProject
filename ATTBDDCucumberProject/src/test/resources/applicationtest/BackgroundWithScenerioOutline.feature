Feature: profile feature 
Background:
Given user should be at profile page 
Scenario Outline: create profile for new user
When User enter first name as "<firstname>"
And User enter last name as "<lastname>"
And user enter City name as "<city>"
Then profile get created

Examples:

| firstname | lastname | city |
| shahjad | ali | pune |
| Aron | severs | Austin |