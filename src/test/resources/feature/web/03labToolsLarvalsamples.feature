Feature: LabTools larval module automation

  Background:
    Given I navigate to FieldSeeker application
    When I click on login button
    And  I enter username in username field
    And  I enter password in Password field
    And  I click on signIn button
    And  I see Lab tools
    And  I click on Labtools box
    And  I click on Larval samples

  Scenario: Creating new entry of larval samples tab
    When I click on new entry button
    And  I select location name as "Point location"
    And  I click on ok button
    And  I enter sample id as "12345"
    And  I select field technician value as brad clark
    Then I verify larval successful message as "Added Inspection Sample successfully"
    When I verify user is not logged in



  Scenario: Search larval entry by applying filters and verify correct entries are visible
    When I enter sample id in sampleId search field as "12345"
    And  I enter location name in location search field as "Point location"
    And  I select start date of larval entry
    And  I select end date of larval entry
    And  I click on search button of larval tab
    Then I verify search result as "10/13/2020 00:18 pm 10/13/2020 00:18 pm 12345 Point location Jerome FSAdministrator 0 0 1 Brad Clark";

  Scenario: Search larval entry by applying filters and close entry
    When I enter sample id in sampleId search field as "12345"
    And  I enter location name in location search field as "Point location"
    And  I select start date of larval entry
    And  I select end date of larval entry
    And  I click on search button of larval tab
    And  I select the first larval entry
    And  I close the larval first entry
    And  I select technician to close larval entry
    And  I click on ok button to close the entry
    Then  I verify close entry successful message as "1 Data Updated Successfully."

  Scenario: Search larval entry by applying filters and reopen the close entry
    When I enter sample id in sampleId search field as "12345"
    And  I enter location name in location search field as "Point location"
    And  I select start date of larval entry
    And  I select end date of larval entry
    And  I click on show closed larval activity records checkbox
    And  I click on search button of larval tab
    And  I select the first larval entry
    And  I reopen the laval entry
    Then I verify close entry successful message as "1 Data Updated Successfully."

  Scenario: Reset the search criteria
    When I enter sample id in sampleId search field as "12345"
    And  I enter location name in location search field as "Point location"
    And  I click on larval reset search criteria button
    Then I verify sample id field and location search value removed

  Scenario: Add larval field data and lab results in records
    When I enter sample id in sampleId search field as "12345"
    And  I enter location name in location search field as "Point location"
    And  I select start date of larval entry
    And  I select end date of larval entry
    And  I click on search button of larval tab
    And  I tap on first larval entry
    And  I click on add Button
    And  I enter field larvae count as "10" and field pupae count as "10" and "10" in egg count in fielData tab
    And  I enter larvae count as "20" pupae count as "20" and egg count "20"in lab data tab
    And  I save the data
    And  I verify lab data entry as "12345 10 10 10"
    And  I verify lab results as "12345 A.India 20 20 20"


  Scenario: Edit data in larval field data and in lab result field and verify result
    When I enter sample id in sampleId search field as "12345"
    And  I enter location name in location search field as "Point location"
    And  I select start date of larval entry
    And  I select end date of larval entry
    And  I click on search button of larval tab
    And  I tap on first larval entry
    And  I click on edit button of larval entry
    And  I enter field larvae count as "30" and field pupae count as "40" and "50" in egg count in fielData tab
    And  I enter larvae count as "10" pupae count as "20" and egg count "30"in lab data tab
    And  I save the data
    And  I verify lab data entry as "12345 30 40 50"
    And  I verify lab results as "12345 A.India 20 30 10"


  Scenario: Delete the entry by selecting all the entries
    When I enter sample id in sampleId search field as "12345"
    And  I enter location name in location search field as "Point location"
    And  I select start date of larval entry
    And  I select end date of larval entry
    And  I click on show closed larval activity records checkbox
    And  I click on search button of larval tab
    And  I select the all larval entry by select all checkbox
    And  I click on delete button to delete larval entries
#    Then I verify larval deleted successful message as "Record deleted Successfully"
