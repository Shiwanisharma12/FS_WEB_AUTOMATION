Feature: Login screen scenarios automation

  Background:
    When I navigate to FieldSeeker application
    When I verify user is not logged in

  Scenario: Verify login landing screen elements
    Then I see the frontier precision logo
    And  I see the sign in option
    And  I see the login button
    And  I see the FieldSeeker GIS Version
    And  I see the Build
    And  I see the Build Date
    And  I close the window


  Scenario: Verify login screen elements and links
    When I click on login button
    Then I see the username field
    And  I see the password field
    And  I see the cancel button
    And  I see the sign in button
    And  I see the keep me signed in checkbox
    And  I see the github ,facebook,google,apple link
    And  I see text "Sign in with"
    And  I see Arcgis login with arrow
    And  I see Forgot username orForgot password
    And  I see Privacy
    And  I see Your ArcGIS is organisation's URL


  Scenario: Verify username empty field error message
    When  I click on login button
    And   I enter password in Password field
    And   I click on signIn button of login
    And   I see error message for empty ussername as " A valid username is required"


  Scenario: Verify password empty field error message
    When I click on login button
    When I verify user is not logged in
    And  I enter username in username field
    And  I click on signIn button of login
    And  I see error message as "A valid password is required"


  Scenario: Verify Incorrect username and password error hint
    When    I click on login button
    And     I enter incorrect username in username field
    And     I enter incorrect password in password field
    And     I click on signIn button of login
    And     I see the errorhint message as "Invalid username or password."

  Scenario: Successfully login and verify all dashboard screen elements
    When I click on login button
    And  I enter username in username field
    And  I enter password in Password field
    And  I click on signIn button
    And  I see Map review button
    And  I see Service Requests button
    And  I see Lab tools
    And  I see product inventory
    And  I see proposed treatment area
    And  I see configuration
    And  I see Maintainance map
    And  I see Gateway Sync
    And  I see Data review















