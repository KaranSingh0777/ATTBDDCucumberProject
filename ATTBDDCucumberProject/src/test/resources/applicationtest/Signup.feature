Feature: Registration functionality
Scenario: Creation of account for a user
Given User should be at the registration Page
When User enters following information
| Erin | Smith | erinsmith@gmail.com | 9988445264 | 
| Robert | White | robertwhite@gmail.com | 9458445264 |
And Click on submit button
Then User gets Created
