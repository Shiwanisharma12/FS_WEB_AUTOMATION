package steps.web;

import com.typesafe.config.Config;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.JavascriptExecutor;
import pages.LabToolsPage;
import pages.LoginPage;
import pages.ProposedTreatmentPage;
import utilities.ConfigLoader;

import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;

public class LabtoolsStep {
    LoginPage page;
    LabToolsPage Labpage;
    ProposedTreatmentPage proposedTreatmentPage;


    @And("^I click on Labtools box$")
    public void iClickOnLabtoolsBox() throws InterruptedException {

        Labpage.labTool();
    }

    @And("^I click on New entry and verify Add Trap Data pop up appears$")
    public void iClickOnNewEntryAndVerifyAddTrapDataPopUpAppears() throws InterruptedException {
        Labpage.newEntry();
        Labpage.verifyPopup();
    }

    @And("^I select area and click on OK button$")
    public void iSelectAreaAndClickOnOKButton()
    {
        Labpage.area();
    }

    @Then("^I land on Trap data pop up box$")
    public void iLandOnTrapDataPopUpBox()
    {
        Labpage.trapDatabox();
    }


    @And("^I select Field tech option$")
    public void iSelectFieldTechOption()
    {
        Labpage.fieldTech();
    }

    @And("^I click on save button$")
    public void iClickOnSaveButton()
    {
        Labpage.save();
    }


    @And("^I select start date and time$")
    public void iSelectStartDateAndTime()
    {
        Labpage.startDate();
        Labpage.timeForstartDate();
    }


    @And("^I select end date and time$")
    public void iSelectEndDateAndTime()
    {
        Labpage.endDate();
        Labpage.timeForendDate();

    }

    @And("^I verify successful message as \"([^\"]*)\"$")
    public void iVerifySuccessfulMessageAs(String message)
    {
        Labpage.successMessage(message);

    }

    @And("^I open trap data details$")
    public void iOpenTrapDataDetails()
    {
        Labpage.trapDatadetails();
    }

    @And("^I fill trap type and trap Activity type fields$")
    public void iFillTrapTypeAndTrapActivityTypeFields()
    {
        Labpage.trapType();
        Labpage.activityType();
    }

    @When("^I click on search button$")
    public void iClickOnSearchButton()
    {
        Labpage.search();

    }

    @And("^I select Map area type$")
    public void iSelectMapAreaType()
    {
        Labpage.mapArea();
    }

    @And("^I select Trap type$")
    public void iSelectTrapType()
    {
        Labpage.selectTraptype();
    }


    @And("^I select start date$")
    public void iSelectStartDate()
    {
        Labpage.filterStartdate();
    }

    @And("^I select end date$")
    public void iSelectEndDate()
    {
        Labpage.filterEnddate();
    }

    @And("^I see all the new entries as \"([^\"]*)\"$")
    public void iSeeAllTheNewEntriesAs(String message)
    {
        Labpage.filteredNewentries(message);

    }

    @And("^I click on first entry$")
    public void iClickOnFirstEntry()
    {

        Labpage.entry1();
    }

    @And("^I click on edit button$")
    public void iClickOnEditButton()
    {
        Labpage.editButton();
    }

    @And("^I change the field type$")
    public void iChangeTheFieldType()
    {
        Labpage.changeFieldType();
    }

    @And("^I change the field type from Brad Clark to Chris McCabe$")
    public void iChangeTheFieldTypeFromBradClarkToChrisMcCabe()
    {
        Labpage.changeFieldType();
    }


    @And("^I change the Trap type from BG counter to CDC Light Trap CO$")
    public void iChangeTheTrapTypeFromBGCounterToCDCLightTrapCO()
    {
        Labpage.changeTraptype();
    }

    @And("^I select changed value of  Trap type$")
    public void iSelectChangedValueOfTrapType()
    {
        Labpage.editedTraptype();
    }

    @And("^I select the first entry$")
    public void iSelectTheFirstEntry()
    {
        Labpage.selectFirstentry();
    }


    @And("^I delete the first entry after accepting all the alert message$")
    public void iDeleteTheFirstEntryAfterAcceptingAllTheAlertMessage()
    {
        Labpage.delete();

    }

    @And("^I verify successful deleted message as \"([^\"]*)\"$")
    public void iVerifySuccessfulDeletedMessageAs(String deletedMessage)
    {
        Labpage.deletedSuccessfully(deletedMessage);
    }



    @And("^I select the first entry and get the technician name$")
    public void iSelectTheFirstEntryAndGetTheTechnicianName()
    {
        Labpage.selectFirstentry();


    }


    @And("^I get the technician name and I click on close entry and select the technician name$")
    public void iGetTheTechnicianNameAndIClickOnCloseEntryAndSelectTheTechnicianName()
    {
        Labpage.selectValuestoCloseentries();

    }

    @And("^I close the entry$")
    public void iCloseTheEntry()
    {
           Labpage.closeEntry();
    }

    @And("^I click on show closed activity records checkbox$")
    public void iClickOnShowClosedActivityRecordsCheckbox()
    {
        Labpage.closedEntrycheckbox();
    }

    @And("^I see the closed entry as \"([^\"]*)\"$")
    public void iSeeTheClosedEntryAs(String message)
    {
        Labpage.showClosedentry(message);
    }

    @And("^I click on reopen entry button$")
    public void iClickOnReopenEntryButton() throws InterruptedException {

        Labpage.reopenEntryButton();
    }

    @And("^I tap on first entry$")
    public void iTapOnFirstEntry()
    {
        Labpage.tapOnfirstEntry();
    }


    @And("^I send males value as \"([^\"]*)\" and send female value as \"([^\"]*)\" and I click on add button and I create pool by selecting pool parameters and verify success message \"([^\"]*)\"$")
    public void iSendMalesValueAsAndSendFemaleValueAsAndIClickOnAddButtonAndICreatePoolBySelectingPoolParametersAndVerifySuccessMessage(String male, String female, String message) throws InterruptedException {
        Labpage.maleFemalevalue(male,female);
        Labpage.createPool();
        Labpage.poolDate(message);
    }


    @And("^I verify close entry button is initially disabled$")
    public void iVerifyCloseEntryButtonIsInitiallyDisabled()
    {
        Labpage.reopenDisable();
    }

    @And("^I select all entries by clicking on selectAll$")
    public void iSelectAllEntriesByClickingOnSelectAll()
    {
        Labpage.selectAll();
    }

    @And("^I select the techician$")
    public void iSelectTheTechician()
    {
        Labpage.closeEntrytechnician();
    }

    @And("^I close the selected entry$")
    public void iCloseTheSelectedEntry()
    {
        Labpage.processClose();
    }

    @And("^I click on processed reopen entry button$")
    public void iClickOnProcessedReopenEntryButton()
    {
        Labpage.processedReopenbutton();
    }

    @And("^I click on reset search criteria button$")
    public void iClickOnResetSearchCriteriaButton()
    {
        Labpage.resetSearchbutton();
    }

    @And("^I verify map area trap type selected values dicards$")
    public void iVerifyMapAreaTrapTypeSelectedValuesDicards()
    {
        Labpage.resetMapvalue();
        Labpage.resetTrapvalue();
    }

    @And("^I fill trap type as bg counter and trap Activity type fields$")
    public void iFillTrapTypeAsBgCounterAndTrapActivityTypeFields()
    {
        Labpage.trapType();
        Labpage.activityType();
    }

    @And("^I send males value as \"([^\"]*)\" and send female value as \"([^\"]*)\" and I click on update button and I edit pool by selecting pool parameters$")
    public void  iSendMalesValueAsAndSendFemaleValueAsAndIClickOnUpdateButtonAndIEditPoolBySelectingPoolParameters(String male, String female)
    {
        Labpage.maleFemalevalue(male,female);

    }

    @And("^I click on edit pool button and verify success message \"([^\"]*)\"$")
    public void iClickOnEditPoolButtonAndVerifySuccessMessage(String message)
    {
        Labpage.updatePoolvalue();
        Labpage.editPool();
        Labpage.editSuccessmessage(message);

    }

    @And("^I tap on first larval entry$")
    public void iTapOnFirstLarvalEntry()
    {
        Labpage.tapOnLarvalFirstentry();
    }


}
