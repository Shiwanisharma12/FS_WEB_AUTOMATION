Feature: LabTools module automation

  Background:

    Given I navigate to FieldSeeker application
    When I click on login button
    And  I enter username in username field
    And  I enter password in Password field
    And  I click on signIn button
    And  I see Lab tools
    And  I click on Labtools box


  Scenario: Creating new entry of adult mosquito trapping tab

    And  I click on New entry and verify Add Trap Data pop up appears
    And  I select area and click on OK button
    Then I land on Trap data pop up box
    And  I select start date and time
    And  I select end date and time
    And  I select Field tech option
    And  I open trap data details
    And  I fill trap type and trap Activity type fields
    And  I click on save button
    Then I verify successful message as "Data saved successfully"

  Scenario: Search entry by applying filters and verify correct entries are visible
    And  I select Map area type
    And  I select Trap type
    And  I select start date
    And  I select end date
    And  I click on search button
    And  I see all the new entries as "#10 AFB FNWS BG Counter 12/07/2021 06:25 pm Brad Clark"

  Scenario: I edit entry
    And  I select Map area type
    And  I select Trap type
    And  I select start date
    And  I select end date
    And  I click on search button
   And   I click on first entry
    And  I click on edit button
    And  I change the field type from Brad Clark to Chris McCabe
    And  I change the Trap type from BG counter to CDC Light Trap CO
    And  I click on save button
   Then  I verify successful message as "Data saved successfully"

  Scenario: I search edited entry and verify changes

    And  I select Map area type
    And  I select changed value of  Trap type
    And  I select start date
    And  I select end date
    And  I click on search button
    And  I see all the new entries as "#10 AFB FNWS CDC Light Trap CO2 12/07/2021 06:25 pm Chris McCabe"

  Scenario: I close entry
    And  I select Map area type
    And  I select changed value of  Trap type
    And  I select start date
    And  I select end date
    And  I click on search button
    And  I select the first entry
    And  I get the technician name and I click on close entry and select the technician name
    And  I close the entry

  Scenario: I verify entry has been closed

    And  I select Map area type
    And  I select changed value of  Trap type
    And  I select start date
    And  I select end date
    And  I click on show closed activity records checkbox
    And  I click on search button
    And  I see the closed entry as "#10 AFB FNWS CDC Light Trap CO2 12/07/2021 06:25 pm Chris McCabe Chris McCabe "

  Scenario: I reopen the closed entry
    And  I select Map area type
    And  I select changed value of  Trap type
    And  I select start date
    And  I select end date
    And  I click on show closed activity records checkbox
    And  I click on search button
    And  I verify close entry button is initially disabled
    When I select the first entry
    And  I click on reopen entry button

  Scenario: I verify the reset search criteria
    And  I select Map area type
    And  I select changed value of  Trap type
    And  I select start date
    And  I select end date
    And  I click on reset search criteria button
    And  I verify map area trap type selected values dicards


  Scenario: I create pool
    And  I select Map area type
    And  I select changed value of  Trap type
    And  I select start date
    And  I select end date
    And  I click on search button
    And  I tap on first entry
    And  I send males value as "100" and send female value as "150" and I click on add button and I create pool by selecting pool parameters and verify success message "Data saved successfully"


  Scenario: I edit pool
    And  I select Map area type
    And  I select changed value of  Trap type
    And  I select start date
    And  I select end date
    And  I click on search button
    And  I tap on first entry
    And  I send males value as "200" and send female value as "300" and I click on update button and I edit pool by selecting pool parameters
    And  I click on edit pool button and verify success message "Data saved successfully"


  Scenario: I delete entry by clicking on select all
    And  I select Map area type
    And  I select changed value of  Trap type
    And  I select start date
    And  I select end date
    And  I click on show closed activity records checkbox
    And  I click on search button
    And  I select all entries by clicking on selectAll
    And  I delete the first entry after accepting all the alert message
    And  I verify successful deleted message as "successfully deleted"













