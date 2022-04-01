Feature: LoginTestCases


@gmailLogin
Scenario: Gmail Login
Given google application is loaded
When user enters as data in search box
And user clicks on search button
Then results should be displayed
