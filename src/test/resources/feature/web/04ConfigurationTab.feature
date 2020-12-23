Feature: Configuration tools module automation

  Background:
    Given I navigate to FieldSeeker application
    When I click on login button
    And  I enter username in username field
    And  I enter password in Password field
    And  I click on signIn button
    And  I see Lab tools
    And  I click on configuration box


  Scenario: Verify user is able to edit any record in fieldseeker config
    When I click on edit button of first config setting name addlocationlayer
    And  I enter default value as "WetlandsLine"
    And  I click on update button
    Then I verify successful message as "Record updated successfully"
    And  I verify first field seeker config entry as "addlocationlayer Text WetlandsLine"


  Scenario: Verify user is able to add the entry in mosquito species tab
    When I click on moquito species tab
    And  I click on add button of mosquito species
    And  I enter name of the mosquito species entry as "Automation_testing_1"
    And  I click on save button to save mosquito species entry
    Then  I verify successful message as "Data saved successfully"


  Scenario: Verify user is able to search and edit the entry in mosquito species tab
    When I click on moquito species tab
    And  I search config entry "Automation_testing_1"
    And  I edit the config entry by changing name to "FS_Automation_testing"
    And  I click on save button to save mosquito species edited value
    Then I verify successful message as "Record updated successfully"

  Scenario Outline: Verify user is able to add the entry in product larviciding tab
    When I click on product tab
    Then I click on larviciding tab
    And  I click on add button of larvicing tab
    And  I fill larvicing product mandatory details
      | name   | value   | duration   | L range   | H range   | chemreg no.   |
      | <name> | <value> | <duration> | <L range> | <H range> | <chemreg no.> |
    And  I select area unit value as "acre"
    And  I select measure value as "briquet"
    And  I set active field status as "True"
    And  I click on save button to save larvicing product
    Then  I verify successful message as "Data saved successfully"

    Examples:
      | name                   | value | duration | L range | H range | chemreg no. |
      | AutomationTestingFirst | Alpha | 3        | 10      | 20      | 0987        |

  Scenario Outline: Verify user is able to search and edit the entry in product larviciding tab
    When I click on product tab
    Then I click on larviciding tab
    And  I search the entry name by "AutomationTesting"
    And  I check the hideInactive checkbox
    And  I verify larviciding active status is "True"
    And  I click on edit button of larvicing tab first entry
    And  I fill larvicing product mandatory details
      | name   | value   | duration   | L range   | H range   | chemreg no.   |
      | <name> | <value> | <duration> | <L range> | <H range> | <chemreg no.> |
    And  I select area unit value as "acre"
    And  I set active field status as "False"
    And  I click on update button to save larvicing product
    Then I verify successful message as "Record updated successfully"
    Examples:
      | name                    | value | duration | L range | H range | chemreg no. |
      | AutomationTestingEdited | beta  | 10       | 20      | 25      | 5678-1234   |

 Scenario: Verify larviciding product hide inactive functionality
   When I click on product tab
   Then I click on larviciding tab
   And  I search the entry name by "AutomationTestingEdited"
   And  I verify larviciding active status is "False"
   And  I check the hideInactive checkbox
   Then  I verify "No matching records found"

  Scenario Outline: Verify user is able to add the entry in product ULV tab
    When I click on product tab
    Then I click on ULV tab
    And  I click on add button of ULV tab
    And  I fill ULV product mandatory details
      | name   | value   | duration   | L range   | H range   | chemreg no.   | mixrate   | A.I   |
      | <name> | <value> | <duration> | <L range> | <H range> | <chemreg no.> | <mixrate> | <A.I> |
    And  I select area unit value as "acre"
    And  I select measure value as "briquet"
    And  I select diluent value as "oil"
    And  I set active field status as "True"
    And  I click on save button to save larvicing product
    Then I verify successful message as "Data saved successfully"

    Examples:
      | name                 | value | duration | L range | H range | chemreg no. | mixrate | A.I |
      | AutomationTestingULV | Alpha | 1        | 5       | 20      | 1234-5678   | 100     | 15  |

  Scenario Outline: Verify user is able to search and edit the entry in product ULV tab
    When I click on product tab
    Then I click on ULV tab
    And  I search the entry name by "AutomationTestingULV"
    And  I check the hideInactive checkbox
    And  I verify larviciding active status is "True"
    And  I click on edit button of larvicing tab first entry
    And  I fill ULV product mandatory details
      | name   | value   | duration   | L range   | H range   | chemreg no.   | mixrate   | A.I   |
      | <name> | <value> | <duration> | <L range> | <H range> | <chemreg no.> | <mixrate> | <A.I> |
    And  I select area unit value as "acre"
    And  I set active field status as "False"
    And  I click on update button to save larvicing product
    Then I verify successful message as "Record updated successfully"
    Examples:
      | name               | value | duration | L range | H range | chemreg no. | mixrate | A.I |
      | EditedAutomationUlv | gama  | 10       | 20      | 25      | 5678-1234   | 100     | 15  |

  Scenario: Verify ULV product hide inactive functionality
   When I click on product tab
   Then I click on ULV tab
   And  I search the entry name by "EditedAutomationUlv"
   And  I verify UlV active status is "False"
   And  I check the hideInactive checkbox
   Then  I verify "No matching records found"


  Scenario: Verify user is able to add the entry in technician tab of configuration tool
    Then I click on technician tab
    And  I click on add button of technician tab
    And  I enter name as "technicianAutomation"
    And  I set technician active field status as "True"
    And  I click on save button to save techinician value
   Then I verify successful message as "Data saved successfully"

  Scenario: Verify user is able to search and edit the entry in  technician tab
    Then I click on technician tab
    And  I search the technician entry name by "technicianAutomation"
    And  I verify technician active status is "True"
    And  I click on edit button of technician tab first entry
    And  I enter name as "AutomationTesting"
    And  I set technician active field status as "False"
    And  I click on update button to save technician name
   Then I verify successful message as "Record updated successfully"

  Scenario: Verify technician product hide inactive functionality
    Then I click on technician tab
    And  I search the technician entry name by "AutomationTesting"
    And  I verify technician active status is "False"
    And  I check the technician hideInactive checkbox
    Then I verify "No matching records found"



  Scenario: Verify user is able to add the entry in trap type mapping
    When I click on trap type mapping tab
    And  I click on add button of trap type mapping
    And  I fill FieldSeeker Trap Type mandatory field as "Ovitrap"
    And  I fill Gateway Value mandatory field as "BGSENT"
    And  I click on add button to save trap type mapping detaisl
    Then I verify successful message as "Record updated successfully"

  Scenario: Verify user is able to search and edit the entry in trap type mapping
    When I click on trap type mapping tab
    And  I search traptype mapping entry as "BGSENT"
    And  I click on edit button of trap type mapping
    And  I fill Gateway Value mandatory field as "CO2"
    And  I click on update button to save trap type mapping details
    Then I verify successful message as "Record updated successfully"


  Scenario: Verify user is able to search and delete the entry in trap type mapping
    When I click on trap type mapping tab
    And  I search traptype mapping entry as "CO2"
    And  I click on delete button of trap type mapping
    Then I verify successful message as "Deleted Successfully!!"


  Scenario: Verify user is able to search and edit gateway sync entry
    When I click on gateway sync tab
    And  I search gateway entry name by "FWRS"
    And  I click on edit button of first gateway entry
    And  I change state to "California"
    And  I click on confirm button
    Then I verify successful message as "Record updated successfully"

  Scenario: Verify user is able to add flock in configuration tool
    When I click on sentinel flock tab
    And  I click on add flock button
    And  I fill mandatory fields of flock details
    And  I click on add flock save button
