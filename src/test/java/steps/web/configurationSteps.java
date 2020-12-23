package steps.web;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.configurationPage;

import java.util.List;
import java.util.Map;

public class configurationSteps {
    configurationPage configurationPage;

    @When("^I click on edit button of first config setting name addlocationlayer$")
    public void iClickOnEditButtonOfFirstConfigSettingNameAddlocationlayer()
    {
        configurationPage.editAddlocationLayer();
    }

    @And("^I click on configuration box$")
    public void iClickOnConfigurationBox()
    {
        configurationPage.configurationTab();
    }

    @And("^I enter default value as \"([^\"]*)\"$")
    public void iEnterDefaultValueAs(String defaultValue)
    {
        configurationPage.defaultValue(defaultValue);
    }

    @And("^I click on update button$")
    public void iClickOnUpdateButton()
    {
        configurationPage.updateBtn();
    }

    @And("^I verify message as \"([^\"]*)\"$")
    public void iVerifyMessageAs(String updateMsg)
    {
        configurationPage.updateSuccessmsg(updateMsg);

    }

    @And("^I verify first field seeker config entry as \"([^\"]*)\"$")
    public void iVerifyFirstFieldSeekerConfigEntryAs(String entry) throws InterruptedException {
        configurationPage.firstConfigentry(entry);
    }

    @When("^I click on moquito species tab$")
    public void iClickOnMoquitoSpeciesTab()
    {
        configurationPage.mosquitoSpeciestab();
    }

    @And("^I click on add button of mosquito species$")
    public void iClickOnAddButtonOfMosquitoSpecies()
    {
        configurationPage.addConfigurationspeciesBtn();
    }


    @And("^I enter name of the mosquito species entry as \"([^\"]*)\"$")
    public void iEnterNameOfTheMosquitoSpeciesEntryAs(String name)
    {
        configurationPage.mosquitoSpeciesEntryname(name);

    }

    @And("^I click on save button to save mosquito species entry$")
    public void iClickOnSaveButtonToSaveMosquitoSpeciesEntry() throws InterruptedException {
        configurationPage.saveMosquitospeciesEntry();
    }

    @And("^I search config entry \"([^\"]*)\"$")
    public void iSearchConfigEntry(String searchedEntry)
    {
        configurationPage.searchConfigentry(searchedEntry);

    }

    @Then("^I edit the config entry by changing name to \"([^\"]*)\"$")
    public void iEditTheConfigEntryByChangingNameTo(String name)
    {
       configurationPage.editMosquitospeciesEntryname(name);
    }

    @And("^I click on save button to save mosquito species edited value$")
    public void iClickOnSaveButtonToSaveMosquitoSpeciesEditedValue()
    {
        configurationPage.editMosquitospeciesSavebtn();


    }

    @When("^I click on product tab$")
    public void iClickOnProductTab()
    {
        configurationPage.productTab();
    }

    @Then("^I click on larviciding tab$")
    public void iClickOnLarvicidingTab()
    {
        configurationPage.larvicidingTab();
    }

    @And("^I click on add button of larvicing tab$")
    public void iClickOnAddButtonOfLarvicingTab()
    {
        configurationPage.addProductbutton();
    }

    @And("^I fill larvicing product mandatory details$")
    public void iFillLarvicingProductMandatoryDetails(DataTable dataTable)
    {
        List<Map<String, String>> list = dataTable.asMaps(String.class, String.class);
        String Name = list.get(0).get("name");
        String Value = list.get(0).get("value");
        String Duration = list.get(0).get("duration");
        String Lrange = list.get(0).get("L range");
        String Hrange = list.get(0).get("H range");
        String ChemregNo = list.get(0).get("chemreg no.");
        configurationPage.larvicidingAddproductDetails(Name, Value, Name,Value,Duration,Lrange,Hrange,ChemregNo);
    }

    @And("^I click on save button to save larvicing product$")
    public void iClickOnSaveButtonToSaveLarvicingProduct()
    {
        configurationPage.larvicidingSavebutton();
    }

    @And("^I select area unit value as \"([^\"]*)\"$")
    public void iSelectAreaUnitValueAs(String areaValue)
    {
        configurationPage.areaValue(areaValue);
    }


    @And("^I search the entry name by \"([^\"]*)\"$")
    public void iSearchTheEntryNameBy(String name)
    {
        configurationPage.searchlarvicingEntry(name);
    }

    @And("^I click on edit button of larvicing tab first entry$")
    public void iClickOnEditButtonOfLarvicingTabFirstEntry()
    {
        configurationPage.larvicidingFirstentryEditbutton();
    }

    @And("^I select measure value as \"([^\"]*)\"$")
    public void iSelectMeasureValueAs(String measureValue)
    {
        configurationPage.larvicidingMeasureValue(measureValue);
    }

    @And("^I click on update button to save larvicing product$")
    public void iClickOnUpdateButtonToSaveLarvicingProduct()
    {
        configurationPage.larvicidingUpdatebtn();
    }

    @Then("^I click on ULV tab$")
    public void iClickOnULVTab()
    {
        configurationPage.ulvTab();


    }

    @And("^I click on add button of ULV tab$")
    public void iClickOnAddButtonOfULVTab()
    {
        configurationPage.addProductbutton();
    }

    @And("^I fill ULV product mandatory details$")
    public void iFillULVProductMandatoryDetails(DataTable dataTable)
    {
        List<Map<String, String>> list = dataTable.asMaps(String.class, String.class);
        String Name = list.get(0).get("name");
        String Value = list.get(0).get("value");
        String Duration = list.get(0).get("duration");
        String Lrange = list.get(0).get("L range");
        String Hrange = list.get(0).get("H range");
        String ChemregNo = list.get(0).get("chemreg no.");
        String mixrate = list.get(0).get("mixrate");
        String AI = list.get(0).get("A.I");

        configurationPage.UAVAddproductDetails(Name,Value,Duration,Lrange,Hrange,ChemregNo,mixrate,AI);
    }

    @And("^I select diluent value as \"([^\"]*)\"$")
    public void iSelectDiluentValueAs(String diluentValue)
    {
        configurationPage.diluent(diluentValue);
    }

    @Then("^I click on technician tab$")
    public void iClickOnTechnicianTab()
    {
        configurationPage.technicianTab();
    }

    @And("^I click on add button of technician tab$")
    public void iClickOnAddButtonOfTechnicianTab()
    {
        configurationPage.technicianTabaddBtn();
    }

    @And("^I enter name as \"([^\"]*)\"$")
    public void iEnterNameAs(String name)
    {
        configurationPage.technicianNamefield(name);

    }

    @And("^I click on save button to save techinician value$")
    public void iClickOnSaveButtonToSaveTechinicianValue()
    {
        configurationPage.technicianSavebtn();
    }

    @And("^I click on update button to save technician name$")
    public void iClickOnUpdateButtonToSaveTechnicianName()
    {
        configurationPage.technicianUpdatebtn();
    }

    @And("^I search the technician entry name by \"([^\"]*)\"$")
    public void iSearchTheTechnicianEntryNameBy(String name)
    {
        configurationPage.technicianSerachfield(name);
    }

    @And("^I click on edit button of technician tab first entry$")
    public void iClickOnEditButtonOfTechnicianTabFirstEntry()
    {
        configurationPage.technicianTabfirstEntry();
    }

    @When("^I click on trap type mapping tab$")
    public void iClickOnTrapTypeMappingTab()
    {
        configurationPage.trapTypemappingTab();
    }

    @And("^I click on add button of trap type mapping$")
    public void iClickOnAddButtonOfTrapTypeMapping()
    {
        configurationPage.trapTypemappingTabaddBtn();
    }

    @And("^I fill FieldSeeker Trap Type mandatory field as \"([^\"]*)\"$")
    public void iFillFieldSeekerTrapTypeMandatoryFieldAs(String fieldValue)
    {
        configurationPage.fieldSeekertrapType(fieldValue);
    }

    @And("^I fill Gateway Value mandatory field as \"([^\"]*)\"$")
    public void iFillGatewayValueMandatoryFieldAs(String gateWayvalue)
    {
        configurationPage.fillGatewayvalue(gateWayvalue);
    }

    @And("^I click on add button to save trap type mapping detaisl$")
    public void iClickOnAddButtonToSaveTrapTypeMappingDetaisl()
    {
        configurationPage.addTraptypeMappingbtn();
    }

    @And("^I search traptype mapping entry as \"([^\"]*)\"$")
    public void iSearchTraptypeMappingEntryAs(String entry)
    {
        configurationPage.trapTypemappingSearchfield(entry);
    }

    @And("^I click on edit button of trap type mapping$")
    public void iClickOnEditButtonOfTrapTypeMapping()
    {
        configurationPage.trapTypeeditBtn();
    }

    @And("^I click on update button to save trap type mapping details$")
    public void iClickOnUpdateButtonToSaveTrapTypeMappingDetails()
    {
        configurationPage.trapTypeupdateBtn();
    }

    @And("^I click on delete button of trap type mapping$")
    public void iClickOnDeleteButtonOfTrapTypeMapping()
    {
        configurationPage.trapTypedelete();
    }

    @And("^I set active field status as \"([^\"]*)\"$")
    public void iSetActiveFieldStatusAs(String status)
    {
        configurationPage.larvicidingStatus(status);
    }

    @And("^I click on larviciding hide inactive checkbox$")
    public void iClickOnLarvicidingHideInactiveCheckbox()
    {
        configurationPage.larvicingHideinactive();
    }

    @Then("^I verify all entries status as \"([^\"]*)\"$")
    public void iVerifyAllEntriesStatusAs(String status)
    {
        configurationPage.larvicingActiveentries(status);

    }

    @And("^I verify larviciding active status is \"([^\"]*)\"$")
    public void iVerifyLarvicidingActiveStatusIs(String status)
    {
        configurationPage.verifyActivestatus(status);
    }

    @And("^I check the hideInactive checkbox$")
    public void iCheckTheHideInactiveCheckbox()
    {
        configurationPage.checkInactivecheckbox();
    }

    @Then("^I verify \"([^\"]*)\"$")
    public void iVerify(String message)
    {
        configurationPage.noRecordfound(message);
    }

    @And("^I verify UlV active status is \"([^\"]*)\"$")
    public void iVerifyUlVActiveStatusIs(String status)
    {
        configurationPage.ulvStatus(status);
    }

    @And("^I verify technician active status is \"([^\"]*)\"$")
    public void iVerifyTechnicianActiveStatusIs(String status)
    {
        configurationPage.technicianActivestatus(status);
    }

    @And("^I set technician active field status as \"([^\"]*)\"$")
    public void iSetTechnicianActiveFieldStatusAs(String status)
    {
        configurationPage.setTechnicianstatus(status);
    }

    @And("^I check the technician hideInactive checkbox$")
    public void iCheckTheTechnicianHideInactiveCheckbox()
    {
        configurationPage.technicianCheckbox();
    }

    @And("^I search gateway entry name by \"([^\"]*)\"$")
    public void iSearchGatewayEntryNameBy(String entry)
    {
        configurationPage.gatewaySearchfield(entry);
    }

    @And("^I click on edit button of first gateway entry$")
    public void iClickOnEditButtonOfFirstGatewayEntry()
    {
        configurationPage.gatewayFirstentryEditbutton();

    }

    @And("^I change state to \"([^\"]*)\"$")
    public void iChangeStateTo(String state)
    {
        configurationPage.gatewayState(state);
    }

    @And("^I click on confirm button$")
    public void iClickOnConfirmButton()
    {
        configurationPage.confirmBtn();
    }

    @When("^I click on gateway sync tab$")
    public void iClickOnGatewaySyncTab()
    {
        configurationPage.gatewaySynctab();
    }


    @When("^I click on add flock button$")
    public void iClickOnAddFlockButton()
    {
        configurationPage.addFlock();
    }

    @And("^I fill mandatory fields of flock details$")
    public void iFillMandatoryFieldsOfFlockDetails()
    {
        configurationPage.flockSite();
        configurationPage.selectBands();
    }

    @And("^I click on add flock save button$")
    public void iClickOnAddFlockSaveButton()
    {
        configurationPage.addFlocksaveBtn();
    }

    @When("^I click on sentinel flock tab$")
    public void iClickOnSentinelFlockTab()
    {
        configurationPage.sentinalFlocktab();
    }
}
