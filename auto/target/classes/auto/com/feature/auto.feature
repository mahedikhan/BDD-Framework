 Feature: AutoTReader HomePage Functionality
 
 Scenario: Verify HomePage Elements are present
 
 Given user is already on AutoTrader HomePage
 When Browse by Make is present
 Then Browse by Style is present
 Then Advanced Search is present
 Then Search button is present
 Then Drop Downs make and model is present
 
 Scenario Outline: Verify Advanced Search Functionality
 
 Given user is on AdvancedSearch Page
 When user enter "<zipcode>" in text box
 Then user select certified checkbox under condition
 Then user select convertible checkbox under style
 And user select from year to year
 And user select make, model and trim section 
 Then user click search button
  
 Examples:
       |zipcode|
       |30004|
 
 