package steps.web;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.larvalSamplespage;

public class larvalSamplessteps {

    larvalSamplespage larvalpage;

    @And("^I click on Larval samples$")
    public void iClickOnLarvalSamples()
    {
        larvalpage.larvalSamplestab();
    }

    @When("^I click on new entry button$")
    public void iClickOnNewEntryButton()
    {
        larvalpage.larvalNewentryButton();
    }


    @And("^I click on ok button$")
    public void iClickOnOkButton()
    {
        larvalpage.selectLocationokay();
    }

    @And("^I enter sample id as \"([^\"]*)\"$")
    public void iEnterSampleIdAs(String sampleId)
    {
        larvalpage.sampleId(sampleId);
    }

    @And("^I select field technician value as brad clark$")
    public void iSelectFieldTechnicianValueAsBradClark()
    {
        larvalpage.technicianType();

    }

    @And("^I verify larval successful message as \"([^\"]*)\"$")
    public void iVerifyLarvalSuccessfulMessageAs(String msg) throws InterruptedException {
       larvalpage.newEntrysuccessMessage();
    }

    @When("^I enter sample id in sampleId search field as \"([^\"]*)\"$")
    public void iEnterSampleIdInSampleIdSearchFieldAs(String sampleid)
    {
        larvalpage.sampleIdsearchField(sampleid);
    }


    @And("^I select location name as \"([^\"]*)\"$")
    public void iSelectLocationNameAs(String location)
    {
        larvalpage.editFilter();
        larvalpage.selectLocationname(location);

    }

    @And("^I enter location name in location search field as \"([^\"]*)\"$")
    public void iEnterLocationNameInLocationSearchFieldAs(String searchLocation)
    {
        larvalpage.locationSearchfield(searchLocation);
    }

    @And("^I verify search result as \"([^\"]*)\";$")
    public void iVerifySearchResultAs(String entry)
    {
        larvalpage.searchResults(entry);
    }

    @And("^I click on search button of larval tab$")
    public void iClickOnSearchButtonOfLarvalTab()
    {
        larvalpage.larvalSearchbtn();
    }


    @And("^I close the larval first entry$")
    public void iCloseTheLarvalFirstEntry()
    {
        larvalpage.closeLarvalentry();
    }

    @And("^I select technician to close larval entry$")
    public void iSelectTechnicianToCloseLarvalEntry()
    {
        larvalpage.selectTechniciantoCloseentry();
    }

    @And("^I click on ok button to close the entry$")
    public void iClickOnOkButtonToCloseTheEntry()
    {
        larvalpage.closeOkay();
    }

    @And("^I verify close entry successful message as \"([^\"]*)\"$")
    public void iVerifyCloseEntrySuccessfulMessageAs(String message)
    {
        larvalpage.closeSuccessmsg(message);
    }

    @And("^I click on show closed larval activity records checkbox$")
    public void iClickOnShowClosedLarvalActivityRecordsCheckbox()
    {
        larvalpage.closedLarvalentryCheckbox();
    }

    @And("^I reopen the laval entry$")
    public void iReopenTheLavalEntry()
    {
        larvalpage.reopenLarvalentry();
    }

    @And("^I select the all larval entry by select all checkbox$")
    public void iSelectTheAllLarvalEntryBySelectAllCheckbox()
    {
        larvalpage.selectAlllarvalEntry();
    }

    @And("^I click on delete button to delete larval entries$")
    public void iClickOnDeleteButtonToDeleteLarvalEntries()
    {
        larvalpage.deleteLarvalbutton();
    }

    @Then("^I verify larval deleted successful message as \"([^\"]*)\"$")
    public void iVerifyLarvalDeletedSuccessfulMessageAs(String deletedMsg)
    {
        larvalpage.deleteLarvalMsg(deletedMsg);

    }

    @And("^I click on larval reset search criteria button$")
    public void iClickOnLarvalResetSearchCriteriaButton()
    {
        larvalpage.larvalResetcriteria();
    }

    @Then("^I verify sample id field and location search value removed$")
    public void iVerifySampleIdFieldAndLocationSearchValueRemoved()
    {
        larvalpage.blankSampleidField();
        larvalpage.blanklocationField();

    }

    @And("^I click on add Button$")
    public void iClickOnAddButton()
    {
        larvalpage.btnAddNewLSDetails();
    }


    @And("^I save the data$")
    public void iSaveTheData()
    {
        larvalpage.saveClose();

    }

    @And("^I select the first larval entry$")
    public void iSelectTheFirstLarvalEntry()
    {
        larvalpage.firstEntrycheckbox();

    }

    @And("^I select start date of larval entry$")
    public void iSelectStartDateOfLarvalEntry()
    {
        larvalpage.startDate();
    }

    @And("^I select end date of larval entry$")
    public void iSelectEndDateOfLarvalEntry()
    {
        larvalpage.endDate();
    }

    @And("^I verify lab data entry as \"([^\"]*)\"$")
    public void iVerifyLabDataEntryAs(String entry) throws InterruptedException {
        Thread.sleep(3000);
        larvalpage.larvalFielddataEntry(entry);

    }

    @And("^I verify lab results as \"([^\"]*)\"$")
    public void iVerifyLabResultsAs(String entry) throws InterruptedException {
        larvalpage.labResulttab();
        Thread.sleep(3000);
        larvalpage.larvalFieldlabResult(entry);
    }


    @And("^I enter larvae count as \"([^\"]*)\" pupae count as \"([^\"]*)\" and egg count \"([^\"]*)\"in lab data tab$")
    public void iEnterLarvaeCountAsPupaeCountAsAndEggCountInLabDataTab(String larvaeCount, String pupaeCount, String eggcount)
    {
        larvalpage.labDatatab(larvaeCount, pupaeCount,eggcount);

    }

    @And("^I click on edit button of larval entry$")
    public void iClickOnEditButtonOfLarvalEntry()
    {
        larvalpage.editLarvalfieldRecord();
    }


    @And("^I enter field larvae count as \"([^\"]*)\" and field pupae count as \"([^\"]*)\" and \"([^\"]*)\" in egg count in fielData tab$")
    public void iEnterFieldLarvaeCountAsAndFieldPupaeCountAsAndInEggCountInFielDataTab(String larvaeCount, String pupaeCount, String eggCount)
    {
        larvalpage.addFielddata(larvaeCount,pupaeCount,eggCount);

    }

    @Then("^I verify traptype successful message as \"([^\"]*)\"$")
    public void iVerifyTraptypeSuccessfulMessageAs(String messge)
    {
        larvalpage.trapTypeSuccessmessage(messge);
    }
}
