#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template


Feature: Search the hotel in Adactin App
  I want to use this feature to test the functionality of Adactin App

 
   Scenario Outline: Search deatiails upon filling the search values
   
  	Given when the user is on the login page
    When user enters "<username>", "<password>"
    And user clicks on login button
    And login is successfull
    And Search page is displayed
    And user selects "<location>", "<rooms>", "<checkindate>", "<checkoutdate>", "<adults>"
    And user clicks on search
    Then search results should be displayed 
    
      Examples: 
      | username  | password | location | rooms | checkindate | checkoutdate | adults |
      | RajendraBabu07 | 8J1O4L | Sydney | 1 | 13/01/2023 | 14/01/2023 | 2 |
      | vasuvespag | vasu1234 | London | 2 | 15/01/2023 | 16/01/2023 | 3 |
      