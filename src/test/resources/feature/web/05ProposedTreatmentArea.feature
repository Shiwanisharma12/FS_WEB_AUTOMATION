Feature: Proposed Treatment Area module automation

  Background:

    Given I navigate to FieldSeeker application
    When I click on login button
    And  I enter username in username field
    And  I enter password in Password field
    And  I click on signIn button
    And  I see Lab tools

#  //proposed area treatment tab
#
  Scenario Outline: Creation and verification of new entry in map tab
    When I click on map tab and search for "<Map area>"
    And  I click on layer list and turn on all the layers
    And  I click on edit button of map tab and search for "proposedtreatment"
    And  I click on proposed treatment template
    And  I draw the polygon on map by select draw option on "Do you want to copy shape or draw manually?" dialog box
    And  I create new proposed treatment entry as "<Name>","<Method>","<Priority>","<Comment>"
    And  I close the proposed entry pop up box
    And  I navigate back to dashboard
    And  I click on proposed treatment tab
    And  I search new proposed treatment entry as "Automation@123"
    And  I verify new entry is displayed as "<dueDate>","<Method>","<Priority>","<Name>"

    Examples:
      | Name           | Method   | Priority | Comment                    | dueDate             | Map area |
      | Automation@123 | Airplane | Critical | Comment added successfully | 11/05/2021 00:00 am | Jerome   |

  Scenario Outline: Edit PTA button functionality verification for PTA TAB
    And  I click on proposed treatment tab
    And  I search new proposed treatment entry as "Automation@123"
    And  I click on first entry of PTA tab
    And  I click on edit PTA button
    And  I select "<Product>"and enter "<app rate>"
    And  I click on update button of pta tab
    And  I verify successful message as "Record updated successfully."
    And  I click on first entry and click on first entry action button
    And  I verify values "<Product>" and "<app rate>" are visible
    And  I save the changes
    And  I verify successful message as "Record updated successfully."
    Examples:
      | Product  | app rate |
      | Abate 1% | 8        |


  Scenario Outline: ULV Treatment form submission and verifying vehicle value has been deducted correctly
#    When I navigate back to dashboard from product Inventory tab
    When I click on product Inventory tab
    And  I get vehicles "<vehicle Value>" value
    And  I navigate back to dashboard from product Inventory tab
    And  I click on proposed treatment tab
    And  I search new proposed treatment entry as "Automation@123"
    And  I click on first entry and click on enter treatment button
    When I fill ULV Treatment mandartory fields as "<Field Tech>","<vehicle Value>","<Product>","<Sprayer>","<Total fog hours>","<Flow rate>"
    And  I click on save Button to save the treatment form
    Then I verify successful message as "New treatment saved successfully."
    And  I navigate back to dashboard from product Inventory tab
    When I click on product Inventory tab
    And  I get vehicles "<Total fog hours>""<vehicle Value>" value and verify spray foot value is deducted from vehicle's value

    Examples:
      | Field Tech | Product  | Sprayer     | Total fog hours | Flow rate | vehicle Value |
      | Brad Clark | Abate 1% | Backpack #1 | 0.5             | 0.5       | Truck 107     |

  Scenario Outline: Regular Treatment form submission and verifying vehicle value has been deducted correctly
#    When I navigate back to dashboard
    When I click on product Inventory tab
    And  I get vehicles "<vehicle Value>" value
    And  I navigate back to dashboard from product Inventory tab
    And  I click on proposed treatment tab
    And  I search new proposed treatment entry as "Automation@123"
    And  I click on first entry and click on enter treatment button
    And  I fill Regular Treatment mandatory fields as "<Field Tech>","<Product>","<equipment>","<quantity>","<vehicle Value>"
    And  I click on save Button to save the treatment form
    Then I verify successful message as "New treatment saved successfully."
    And  I navigate back to dashboard from product Inventory tab
    When I click on product Inventory tab
    And  I verify "<quantity>" entered in regular treatment form has been deducted from vehicle's quantity "<vehicle Value>" in poduct inventory tab
    Examples:
      | Field Tech |  | Product  | equipment   | quantity | vehicle Value |
      | Brad Clark |  | Abate 1% | Spreader #2 | 10       | Truck 107     |

  Scenario Outline: Verify user is able to submit the ULV Treatment without selecting vehicle
    And  I click on proposed treatment tab
    And  I search new proposed treatment entry as "Automation@123"
    And  I click on first entry and click on enter treatment button
    When I fill ULV Treatment mandartory fields as "<Field Tech>","<Product>","<Sprayer>","<Total fog hours>","<Flow rate>"
    And  I click on save Button to save the treatment form
    Then I verify successful message as "New treatment saved successfully."

    Examples:
      | Field Tech | Product    | Sprayer     | Total fog hours | Flow rate |
      | Brad Clark | Zenivex E4 | Backpack #1 | 0.5             | 0.5       |


  Scenario Outline: Regular Treatment form submission and verifying vehicle value has been deducted correctly
    And  I click on proposed treatment tab
    And  I search new proposed treatment entry as "Automation@123"
    And  I click on first entry and click on enter treatment button
    And  I fill Regular Treatment mandatory fields as "<Field Tech>","<Product>","<equipment>","<quantity>"
    And  I click on save Button to save the treatment form
    Then I verify successful message as "New treatment saved successfully."
    Examples:
      | Field Tech |  | Product  | equipment   | quantity |
      | Brad Clark |  | Abate 1% | Spreader #2 | 10       |

  Scenario Outline: Verification of delete button functionality
    And  I click on proposed treatment tab
    And  I search new proposed treatment entry as "<Name>"
    And  I click on first entry and click on delete button
    And  I accept the alert box with message "Are you sure you wish to delete the proposed treatment area(s)?"
    And  I verify successful message as "Treatment exists for the selected proposed treatment area, cannot delete the selected records."

    Examples:
      | Name           |
      | Automation@123 |


  Scenario Outline: To verify if user able to update the data of any PTA record from action button
    And  I click on proposed treatment tab
    And  I search new proposed treatment entry as "Automation@123"
    And  I click on first entry and click on first entry action button
    And  I edit details as "<name>","<method>","<priority>"
    And  I save the changes
    And  I verify successful message as "Record updated successfully."

    Examples:
      | name                  | method | priority |
      | TestingAutomation@789 | Argo   | High     |


  Scenario: To verify the Print Functionality in PTA
    And  I click on proposed treatment tab
    And  I click on the dropdown to check all options are available
    And  I select one option of print type and click on print button and verify print button converts to printing
#    And  I click on prinout button,I will redirect to next tab and verify heading as "proposed treatment area" and date


  Scenario Outline: Complete button functionality
    When I click on map tab and search for "<Map area>"
    And  I click on layer list and turn on all the layers
    And  I click on edit button of map tab and search for "proposedtreatment"
    And  I click on proposed treatment template
    And  I draw the polygon on map by select draw option on "Do you want to copy shape or draw manually?" dialog box
    And  I create new proposed treatment entry as "<Name>","<Method>","<Priority>","<Comment>"
    And  I close the proposed entry pop up box
    And  I navigate back to dashboard
    And  I click on proposed treatment tab
    And  I search new proposed treatment entry as "<Name>"
    And  I verify new entry is displayed as "<dueDate>","<Method>","<Priority>","<Name>"
    And  I click on first entry and click on complete button button
    And  I verify successful message as "Record updated successfully."
    And  I click on review completed treatment area and search record by "<Name>"
    And  I verify new entry is displayed as "<dueDate>","<Method>","<Priority>","<Name>"

    Examples:
      | Name                 | Method   | Priority | Comment                    | dueDate             | Map area |
      | RecordForCompleteTab | Airplane | Critical | Comment added successfully | 11/05/2021 00:00 am | Jerome   |


  Scenario Outline: Verification of delete functionality when treatment does not exist for record
    When I click on map tab and search for "<Map area>"
    And  I click on layer list and turn on all the layers
    And  I click on edit button of map tab and search for "proposedtreatment"
    And  I click on proposed treatment template
    And  I draw the polygon on map by select draw option on "Do you want to copy shape or draw manually?" dialog box
    And  I create new proposed treatment entry as "<Name>","<Method>","<Priority>","<Comment>"
    And  I close the proposed entry pop up box
    And  I navigate back to dashboard
    And  I click on proposed treatment tab
    And  I search new proposed treatment entry as "<Name>"
    And  I click on edit filter button
    And  I apply filters as "<Method>","<Priority>","<zone>"
    And  I verify records according to applied filters like "<Method>","<Priority>","<zone>" are shown
    When I click on select all button
    And  I click on delete button
    And  I accept the alert box with message "Are you sure you wish to delete the proposed treatment area(s)?"
    And  I verify successful message as "The selected proposed treatment area deleted successfully"

    Examples:
      | Name              | Method   | Priority | Comment                    | zone   | Map area |
      | RecordForDeletion | Airplane | Critical | Comment added successfully | Jerome | Jerome   |


#  ---------------------------------------------------------------------------------------------------------export tab automation

  Scenario Outline: Verification of select all and export functionality with KML
    And  I click on proposed treatment tab
    And  I search new proposed treatment entry as "<Name>"
    When I click on select all button
    And  I click on export button by selecting KML
    And  I go on exported proposed treatment area tab
    And  verify record has been exported from PTA tab to exported PTA tab by searching "<Name>"
    And  I verify new entry is displayed as "<dueDate>","<Method>","<Priority>","<Name>"

    Examples:
      | Name                  | Method | Priority | dueDate             |
      | TestingAutomation@789 | Argo   | High     | 11/05/2021 00:00 am |


  Scenario Outline: Export button functionality with NO1
    When I click on map tab and search for "<Map area>"
    And  I click on layer list and turn on all the layers
    And  I click on edit button of map tab and search for "proposedtreatment"
    And  I click on proposed treatment template
    And  I draw the polygon on map by select draw option on "Do you want to copy shape or draw manually?" dialog box
    And  I create new proposed treatment entry as "<Name>","<Method>","<Priority>","<Comment>"
    And  I close the proposed entry pop up box
    And  I navigate back to dashboard
    And  I click on proposed treatment tab
    And  I search new proposed treatment entry as "<Name>"
    And  I click on first entry of PTA tab
    And  I click on export button by selecting NO1 and enter zip folder name as "<zip file name>"
    And  I go on exported proposed treatment area tab
    And  verify record has been exported from PTA tab to exported PTA tab by searching "<Name>"
    And  I verify new entry is displayed as "<dueDate>","<Method>","<Priority>","<Name>"

    Examples:
      | Name         | Method   | Priority | Comment                    | dueDate             | Map area | zip file name     |
      | RecordforNO1 | Airplane | Critical | Comment added successfully | 11/05/2020 00:00 am | Jerome   | AutomationZipfile |


  Scenario Outline: Export button functionality with SHP
    When I click on map tab and search for "<Map area>"
    And  I click on layer list and turn on all the layers
    And  I click on edit button of map tab and search for "proposedtreatment"
    And  I click on proposed treatment template
    And  I draw the polygon on map by select draw option on "Do you want to copy shape or draw manually?" dialog box
    And  I create new proposed treatment entry as "<Name>","<Method>","<Priority>","<Comment>"
    And  I close the proposed entry pop up box
    And  I navigate back to dashboard
    And  I click on proposed treatment tab
    And  I search new proposed treatment entry as "<Name>"
    And  I click on first entry of PTA tab
    And  I click on export button by selecting SHP
    And  I go on exported proposed treatment area tab
    And  verify record has been exported from PTA tab to exported PTA tab by searching "<Name>"
    And  I verify new entry is displayed as "<dueDate>","<Method>","<Priority>","<Name>"

    Examples:
      | Name         | Method   | Priority | Comment                    | dueDate             | Map area | zip file name     |
      | RecordforSHP | Airplane | Critical | Comment added successfully | 11/05/2021 00:00 am | Jerome   | AutomationZipfile |


  Scenario Outline: Verification of delete functionality when treatment does not exist for record
    And  I click on proposed treatment tab
    And  I go on exported proposed treatment area tab
    And  verify record has been exported from PTA tab to exported PTA tab by searching "<Name>"
    And  I go on exported proposed treatment area tab
#    And  I click on edit filter button
#    And  I apply filters as "<Method>","<Priority>","<zone>"
#    And  I verify records according to applied filters like "<Method>","<Priority>","<zone>" are shown
    When I click on select all button
    And  I click on delete button
    And  I accept the alert box with message "Are you sure you wish to delete the proposed treatment area(s)?"
    And  I verify successful message as "The selected proposed treatment area deleted successfully"

    Examples:
      | Name   | Method   | Priority | Comment                    | zone   | Map area |
      | Record | Airplane | Critical | Comment added successfully | Jerome | Jerome   |


  Scenario Outline: Edit PTA button functionality verification for exported PTA TAB
    And  I click on proposed treatment tab
    And  I go on exported proposed treatment area tab
    And  I search new proposed treatment entry as "TestingAutomation@789"
    And  I click on first entry of PTA tab
    And  I click on edit PTA button
    And  I select "<Product>"and enter "<app rate>"
    And  I click on update button of pta tab
    And  I verify successful message as "Record updated successfully."
    And  I click on first entry and click on first entry action button
    And  I verify values "<Product>" and "<app rate>" are visible
    And  I save the changes
    Examples:
      | Product  | app rate |
      | Abate 1% | 8        |

  Scenario Outline: ULV Treatment form submission and verifying vehicle value has been deducted correctly in export tab
#    When I navigate back to dashboard from product Inventory tab
    When I click on product Inventory tab
    And  I get vehicles "<vehicle Value>" value
    And  I navigate back to dashboard from product Inventory tab
    And  I click on proposed treatment tab
    And  I go on exported proposed treatment area tab
    And  I search new proposed treatment entry as "<Name>"
    And  I click on first entry and click on enter treatment button
    When I fill ULV Treatment mandartory fields as "<Field Tech>","<vehicle Value>","<Product>","<Sprayer>","<Total fog hours>","<Flow rate>"
    And  I click on save Button to save the treatment form
    Then I verify successful message as "New treatment saved successfully."
    And  I navigate back to dashboard from product Inventory tab
    When I click on product Inventory tab
    And  I get vehicles "<Total fog hours>""<vehicle Value>" value and verify spray foot value is deducted from vehicle's value

    Examples:
      | Field Tech | Product  | Sprayer     | Total fog hours | Flow rate | vehicle Value | Name                  |
      | Brad Clark | Abate 1% | Backpack #1 | 0.5             | 0.5       | Truck 107     | TestingAutomation@789 |

  Scenario Outline: Regular Treatment form submission and verifying vehicle value has been deducted correctly in exported tab
#    When I navigate back to dashboard
    When I click on product Inventory tab
    And  I get vehicles "<vehicle Value>" value
    And  I navigate back to dashboard from product Inventory tab
    And  I click on proposed treatment tab
    And  I go on exported proposed treatment area tab
    And  I search new proposed treatment entry as "<Name>"
    And  I click on first entry and click on enter treatment button
    And  I fill Regular Treatment mandatory fields as "<Field Tech>","<Product>","<equipment>","<quantity>","<vehicle Value>"
    And  I click on save Button to save the treatment form
    Then I verify successful message as "New treatment saved successfully."
    And  I navigate back to dashboard from product Inventory tab
    When I click on product Inventory tab
    And  I verify "<quantity>" entered in regular treatment form has been deducted from vehicle's quantity "<vehicle Value>" in poduct inventory tab
    Examples:
      | Field Tech |  | Product  | equipment   | quantity | vehicle Value | Name                  |
      | Brad Clark |  | Abate 1% | Spreader #2 | 10       | Truck 107     | TestingAutomation@789 |

  Scenario Outline: Verify user is able to submit the ULV Treatment without selecting vehicle in exported tab
    And  I click on proposed treatment tab
    And  I go on exported proposed treatment area tab
    And  I search new proposed treatment entry as "<Name>"
    And  I click on first entry and click on enter treatment button
    When I fill ULV Treatment mandartory fields as "<Field Tech>","<Product>","<Sprayer>","<Total fog hours>","<Flow rate>"
    And  I click on save Button to save the treatment form
    Then I verify successful message as "New treatment saved successfully."

    Examples:
      | Field Tech | Product    | Sprayer     | Total fog hours | Flow rate | Name                  |
      | Brad Clark | Zenivex E4 | Backpack #1 | 0.5             | 0.5       | TestingAutomation@789 |


  Scenario Outline: Regular Treatment form submission and verifying vehicle value has been deducted correctly in exported tab
    And  I click on proposed treatment tab
    And  I go on exported proposed treatment area tab
    And  I search new proposed treatment entry as "<Name>"
    And  I click on first entry and click on enter treatment button
    And  I fill Regular Treatment mandatory fields as "<Field Tech>","<Product>","<equipment>","<quantity>"
    And  I click on save Button to save the treatment form
    Then I verify successful message as "New treatment saved successfully."
    Examples:
      | Field Tech |  | Product  | equipment   | quantity | Name                  |
      | Brad Clark |  | Abate 1% | Spreader #2 | 10       | TestingAutomation@789 |

  Scenario Outline: Verification of delete button functionality
    And  I click on proposed treatment tab
    And  I go on exported proposed treatment area tab
    And  I search new proposed treatment entry as "<Name>"
    And  I click on first entry and click on delete button
    And  I accept the alert box with message "Are you sure you wish to delete the proposed treatment area(s)?"
    And  I verify successful message as "Treatment exists for the selected proposed treatment area, cannot delete the selected records."

    Examples:
      | Name                  |
      | TestingAutomation@789 |


  Scenario Outline: To verify if user able to update the data of any PTA record from action button
    And  I click on proposed treatment tab
    And  I go on exported proposed treatment area tab
    And  I search new proposed treatment entry as "TestingAutomation@789"
    And  I click on first entry and click on first entry action button
    And  I edit details as "<name>","<method>","<priority>"
    And  I save the changes
    And  I verify successful message as "Record updated successfully."

    Examples:
      | name           | method | priority |
      | Automation@123 | Argo   | High     |


  Scenario: To verify the Print Functionality in PTA
    And  I click on proposed treatment tab
    And  I go on exported proposed treatment area tab
    And  I click on the dropdown to check all options are available
    And  I select one option of print type and click on print button and verify print button converts to printing
#    And  I click on prinout button,I will redirect to next tab and verify heading as "proposed treatment area" and date


  Scenario Outline: Complete button functionality
    When I click on map tab and search for "<Map area>"
    And  I click on layer list and turn on all the layers
    And  I click on edit button of map tab and search for "proposedtreatment"
    And  I click on proposed treatment template
    And  I draw the polygon on map by select draw option on "Do you want to copy shape or draw manually?" dialog box
    And  I create new proposed treatment entry as "<Name>","<Method>","<Priority>","<Comment>"
    And  I close the proposed entry pop up box
    And  I navigate back to dashboard
    And  I click on proposed treatment tab
    And  I search new proposed treatment entry as "<Name>"
    And  I verify new entry is displayed as "<dueDate>","<Method>","<Priority>","<Name>"
    When I click on select all button
    And  I click on export button by selecting KML
    And  I go on exported proposed treatment area tab
    And  verify record has been exported from PTA tab to exported PTA tab by searching "<Name>"
    And  I click on first entry and click on complete button button
    And  I verify successful message as "Record updated successfully."
    And  I click on review completed treatment area and search record by "<Name>"
    And  I verify new entry is displayed as "<dueDate>","<Method>","<Priority>","<Name>"

    Examples:
      | Name                 | Method   | Priority | Comment                    | dueDate             | Map area |
      | RecordForCompleteTab | Airplane | Critical | Comment added successfully | 11/05/2021 00:00 am | Jerome   |




#----------------------------completed tab scenarios

  Scenario: To verify the Print Functionality in PTA
    And  I click on proposed treatment tab
    And  I go to complete proposed treatment area tab
    And  I click on the dropdown to check all options are available
    And  I select one option of print type and click on print button and verify print button converts to printing
#    And  I click on prinout button,I will redirect to next tab and verify heading as "proposed treatment area" and date

  Scenario Outline: To verify the functionality of edit filter button
    And  I click on proposed treatment tab
    And  I go to complete proposed treatment area tab
    And  I click on edit filter button
    And  I apply filters as "<Method>","<Priority>","<zone>"
    And  I verify records according to applied filters like "<Method>","<Priority>","<zone>" are shown

    Examples:
      | Method   | Priority |  | zone   |
      | Airplane | Critical |  | Jerome |

  Scenario Outline: Edit PTA button functionality verification for PTA TAB
    And  I click on proposed treatment tab
    And  I click on review completed treatment area and search record by "<Name>"
    And  I click on first entry of PTA tab
    And  I click on edit PTA button
    And  I select "<Product>"and enter "<app rate>"
    And  I click on update button of pta tab
    And  I verify successful message as "Record updated successfully."
    And  I click on first entry and click on first entry action button
    And  I verify values "<Product>" and "<app rate>" are visible
    And  I save the changes
    And  I verify successful message as "Record updated successfully."
    Examples:
      | Product  | app rate | Name                 |
      | Abate 1% | 8        | RecordForCompleteTab |


  Scenario Outline: Verification of select all and export functionality with KML
    And  I click on proposed treatment tab
    And  I click on review completed treatment area and search record by "<Name>"
    When I click on select all button
    And  I click on export button by selecting KML
    And  I go on exported proposed treatment area tab
    And  verify record has been exported from PTA tab to exported PTA tab by searching "<Name>"
    And  I verify new entry is displayed as "<dueDate>","<Method>","<Priority>","<Name>"

    Examples:
      | Name                 | Method | Priority | dueDate             |
      | RecordForCompleteTab | Argo   | High     | 11/05/2021 00:00 am |


  Scenario Outline: Export button functionality with NO1
    And  I click on proposed treatment tab
    And  I click on review completed treatment area and search record by "<Name>"
    And  I click on first entry of PTA tab
    And  I click on export button by selecting NO1 and enter zip folder name as "<zip file name>"
    And  I go on exported proposed treatment area tab
    And  verify record has been exported from PTA tab to exported PTA tab by searching "<Name>"
    And  I verify new entry is displayed as "<dueDate>","<Method>","<Priority>","<Name>"

    Examples:
      | Name                 | Method   | Priority | Comment                    | dueDate             | Map area | zip file name     |
      | RecordForCompleteTab | Airplane | Critical | Comment added successfully | 11/05/2021 00:00 am | Jerome   | AutomationZipfile |


  Scenario Outline: Export button functionality with SHP
    And  I click on proposed treatment tab
    And  I click on review completed treatment area and search record by "<Name>"
    And  I click on first entry of PTA tab
    And  I click on export button by selecting SHP
    And  I go on exported proposed treatment area tab
    And  verify record has been exported from PTA tab to exported PTA tab by searching "<Name>"
    And  I verify new entry is displayed as "<dueDate>","<Method>","<Priority>","<Name>"

    Examples:
      | Name                 | Method   | Priority | Comment                    | dueDate             | Map area | zip file name     |
      | RecordForCompleteTab | Airplane | Critical | Comment added successfully | 11/05/2020 00:00 am | Jerome   | AutomationZipfile |


















