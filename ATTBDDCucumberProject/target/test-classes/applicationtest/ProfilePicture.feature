Feature: Profile functionaly
Scenario: Add profile for a user
Given user should be at home page 
When user click on add profile button
And upload the image 
Then profile should get added

Scenario: Update profile for a user
Given user should be at home page 
When user click on edit link
And update the image 
Then profile should get upated 

Scenario: Delete profile for a user
Given user should be at home page 
When user click on delete profile button
Then profile should get deleted 