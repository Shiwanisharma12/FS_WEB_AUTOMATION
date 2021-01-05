package steps.web;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import pages.LabToolsPage;
import pages.LoginPage;
import pages.ProposedTreatmentPage;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class ProposedTreatmentSteps {

    ProposedTreatmentPage proposedTreatmentPage;


    @And("^I click on layer list and turn on all the layers$")
    public void iClickOnLayerListAndTurnOnAllTheLayers() {
        proposedTreatmentPage.setScalevalue();
        proposedTreatmentPage.layerListBtn();
        proposedTreatmentPage.operationalLayetbtn();
        proposedTreatmentPage.turnAlllayerOn();
        proposedTreatmentPage.closeLayerPopupbox();

    }

    @And("^I click on edit button of map tab and search for \"([^\"]*)\"$")
    public void iClickOnEditButtonOfMapTabAndSearchFor(String template) {
        proposedTreatmentPage.editBtn();
        proposedTreatmentPage.searchIneditBox(template);
    }

    @And("^I click on proposed treatment template$")
    public void iClickOnProposedTreatmentTemplate() {
        proposedTreatmentPage.proposedTemplate();
    }


    @And("^I navigate back to dashboard$")
    public void iNavigateBackToDashboard() {
        proposedTreatmentPage.navigateTodashboard();
    }

    @And("^I click on proposed treatment tab$")
    public void iClickOnProposedTreatmentTab() {

        proposedTreatmentPage.proposedTreatmenttab();
    }


    @And("^I search new proposed treatment entry as \"([^\"]*)\"$")
    public void iSearchNewProposedTreatmentEntryAs(String entry) throws InterruptedException {
        proposedTreatmentPage.searchProposedtreatmentEntry(entry);
        proposedTreatmentPage.dateAscendingorder();
    }


    @And("^I create new proposed treatment entry as \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
    public void iCreateNewProposedTreatmentEntryAs(String name, String method, String priority, String comment) throws InterruptedException {
        proposedTreatmentPage.newProposedtreatmentEntry(name, method, priority, comment);

    }

    @And("^I close the proposed entry pop up box$")
    public void iCloseTheProposedEntryPopUpBox() {
        proposedTreatmentPage.closeProposedtreatmentPopupbox();
    }

    @And("^I verify new entry is displayed as \"([^\"]*)\"$")
    public void iVerifyNewEntryIsDisplayedAs(String entry) {
        proposedTreatmentPage.searchedNewentryResult(entry);
    }

    @And("^I verify new entry is displayed as \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
    public void iVerifyNewEntryIsDisplayedAs(String dueDate, String method, String priority, String name) {
        proposedTreatmentPage.getValuefromTable(dueDate, method, priority, name);
    }

    @When("^I fill ULV Treatment mandartory fields as \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
    public void iFillULVTreatmentMandartoryFieldsAs(String FieldTech, String vehicle, String product, String sprayer, String Totalfoghours, String Flowrate) throws InterruptedException {

        proposedTreatmentPage.startDate();
        proposedTreatmentPage.endDate();
        proposedTreatmentPage.fieldTech(FieldTech);
        proposedTreatmentPage.vehicleField(vehicle);
        proposedTreatmentPage.setProductsField(product);
        proposedTreatmentPage.sprayerField(sprayer);
        proposedTreatmentPage.totalFoghoursField(Totalfoghours);
        proposedTreatmentPage.fieldTechfield(Flowrate);

    }

    @And("^I fill Regular Treatment mandatory fields as \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
    public void iFillRegularTreatmentMandatoryFieldsAs(String FieldTech, String product, String equipment) {
        proposedTreatmentPage.regularTreatmentTab();
        proposedTreatmentPage.fieldTech(FieldTech);
        proposedTreatmentPage.setProductsField(product);
        proposedTreatmentPage.equipmentField(equipment);


    }

    @And("^I click on save Button to save the treatment form$")
    public void iClickOnSaveButtonToSaveTheTreatmentForm() {
        proposedTreatmentPage.saveTreatmentform();

    }

    @And("^I click on first entry and click on enter treatment button$")
    public void iClickOnFirstEntryAndClickOnEnterTreatmentButton() {
        proposedTreatmentPage.firstEntryclick();
        proposedTreatmentPage.enterTreatmentbtn();
    }


    @When("^I click on product Inventory tab$")
    public void iClickOnProductInventoryTab() {
        proposedTreatmentPage.productInventorytab();
    }

    @And("^I get vehicles \"([^\"]*)\" value$")
    public void iGetVehiclesValue(String vehiclevalue) throws InterruptedException {

        proposedTreatmentPage.productInventoryvehicleValue(vehiclevalue);

    }

    @And("^I get total spray foot value which will be deducted in vehicles value$")
    public void iGetTotalSprayFootValueWhichWillBeDeductedInVehiclesValue() throws InterruptedException {
        proposedTreatmentPage.totalSprayfoot();
    }

    @And("^I navigate back to dashboard from product Inventory tab$")
    public void iNavigateBackToDashboardFromProductInventoryTab() {
        proposedTreatmentPage.navigateBackfromProductInventorytab();

    }


    @And("^I get vehicles \"([^\"]*)\"\"([^\"]*)\" value and verify spray foot value is deducted from vehicle's value$")
    public void iGetVehiclesValueAndVerifySprayFootValueIsDeductedFromVehicleSValue(String fogHours, String vehiclevalue) throws InterruptedException {
//        proposedTreatmentPage.productInventoryvehicleValue(vehiclevalue);
        proposedTreatmentPage.equatingValues(fogHours, vehiclevalue);

    }


    @And("^I verify \"([^\"]*)\" entered in regular treatment form has been deducted from vehicle's quantity value in poduct inventory tab$")
    public void iVerifyEnteredInRegularTreatmentFormHasBeenDeductedFromVehicleSQuantityValueInPoductInventoryTab(String enteredQty) throws InterruptedException {
        proposedTreatmentPage.equatingValuesForregularTreatment(enteredQty, enteredQty);
    }

    @And("^I verify \"([^\"]*)\" entered in regular treatment form has been deducted from vehicle's quantity \"([^\"]*)\" in poduct inventory tab$")
    public void iVerifyEnteredInRegularTreatmentFormHasBeenDeductedFromVehicleSQuantityInPoductInventoryTab(String enteredQty, String vehicleValue) throws InterruptedException {
        proposedTreatmentPage.equatingValuesForregularTreatment(enteredQty, vehicleValue);

    }

    @When("^I fill ULV Treatment mandartory fields as \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
    public void iFillULVTreatmentMandartoryFieldsAs(String FieldTech, String product, String sprayer, String Totalfoghours, String Flowrate) throws InterruptedException {
        proposedTreatmentPage.startDate();
        proposedTreatmentPage.endDate();
        proposedTreatmentPage.fieldTech(FieldTech);
        proposedTreatmentPage.setProductsField(product);
        proposedTreatmentPage.sprayerField(sprayer);
        proposedTreatmentPage.totalFoghoursField(Totalfoghours);
        proposedTreatmentPage.fieldTechfield(Flowrate);
    }

    @And("^I fill Regular Treatment mandatory fields as \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
    public void iFillRegularTreatmentMandatoryFieldsAs(String FieldTech, String product, String equipment, String quantity) throws InterruptedException {
        proposedTreatmentPage.regularTreatmentTab();
        proposedTreatmentPage.startDate();
        proposedTreatmentPage.endDate();
        proposedTreatmentPage.regularTreatmentTab();
        proposedTreatmentPage.fieldTech(FieldTech);
        proposedTreatmentPage.setProductsField(product);
        proposedTreatmentPage.equipmentField(equipment);
        proposedTreatmentPage.quantityField(quantity);
    }

    @And("^I fill Regular Treatment mandatory fields as \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
    public void iFillRegularTreatmentMandatoryFieldsAs(String FieldTech, String product, String equipment, String quantity, String vehicleValue) throws InterruptedException {
        proposedTreatmentPage.regularTreatmentTab();
        proposedTreatmentPage.startDate();
        proposedTreatmentPage.endDate();
        proposedTreatmentPage.regularTreatmentTab();
        proposedTreatmentPage.fieldTech(FieldTech);
        proposedTreatmentPage.vehicleField(vehicleValue);
        proposedTreatmentPage.setProductsField(product);
        proposedTreatmentPage.equipmentField(equipment);
        proposedTreatmentPage.quantityField(quantity);
    }

    @And("^I click on first entry and click on first entry action button$")
    public void iClickOnFirstEntryAndClickOnFirstEntryActionButton() {
        proposedTreatmentPage.actionBtn();
    }

    @And("^I edit details as \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
    public void iEditDetailsAs(String changedName, String changedMethod, String changedPriority) {
        proposedTreatmentPage.editName(changedName);
        proposedTreatmentPage.editMethod(changedMethod);
        proposedTreatmentPage.editPriority(changedPriority);

    }

    @And("^I save the changes$")
    public void iSaveTheChanges() {
        proposedTreatmentPage.saveChanges();
    }

    @And("^I click on the dropdown to check all options are available$")
    public void iClickOnTheDropdownToCheckAllOptionsAreAvailable() {
        proposedTreatmentPage.printDropdown();
        proposedTreatmentPage.dropDownoptions();
    }

    @And("^I select one option of print type and click on print button and verify print button converts to printing$")
    public void iSelectOneOptionOfPrintTypeAndClickOnPrintButtonAndVerifyPrintButtonConvertsToPrinting() throws InterruptedException {
//        proposedTreatmentPage.selectPrintoption();
        proposedTreatmentPage.printBtn();
    }

    @And("^I click on prinout button,I will redirect to next tab and verify heading as \"([^\"]*)\" and date$")
    public void iClickOnPrinoutButtonIWillRedirectToNextTabAndVerifyHeadingAsAndDate(String arg0) throws InterruptedException {
        proposedTreatmentPage.printFunctionality();

    }

    @When("^I click on select all button$")
    public void iClickOnSelectAllButton() {
        proposedTreatmentPage.selectAllFunctionality();

    }

    @And("^I click on export button by selecting KML$")
    public void iClickOnExportButtonBySelectingKML() throws IOException, InterruptedException {
        proposedTreatmentPage.exportWithkmlButtonFunctionality();

    }

    @And("^I go on exported proposed treatment area tab$")
    public void iGoOnExportedProposedTreatmentAreaTab() throws InterruptedException {
        proposedTreatmentPage.exportedPTAtab();
    }


    @And("^verify record has been exported from PTA tab to exported PTA tab by searching \"([^\"]*)\"$")
    public void verifyRecordHasBeenExportedFromPTATabToExportedPTATabBySearching(String entry) throws InterruptedException {

        proposedTreatmentPage.searchProposedtreatmentEntry(entry);


    }


    @And("^I accept the alert box with message \"([^\"]*)\"$")
    public void iAcceptTheAlertBoxWithMessage(String msg) {
        proposedTreatmentPage.verifyAlert(msg);

    }

    @And("^I click on first entry and click on complete button button$")
    public void iClickOnFirstEntryAndClickOnCompleteButtonButton() {
        proposedTreatmentPage.firstEntryclick();
        proposedTreatmentPage.completeButton();
    }

    @And("^I click on review completed treatment area and search record by \"([^\"]*)\"$")
    public void iClickOnReviewCompletedTreatmentAreaAndSearchRecordBy(String entry) throws InterruptedException {
        proposedTreatmentPage.reviewCompletedTreatmenttab();
        proposedTreatmentPage.searchProposedtreatmentEntry(entry);

    }

    @And("^I click on edit filter button$")
    public void iClickOnEditFilterButton() {
        proposedTreatmentPage.editFilterbtn();
    }

    @And("^I apply filters as \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
    public void iApplyFiltersAs(String method, String priority, String zone) {
        proposedTreatmentPage.filterValues(method, priority, zone);
        proposedTreatmentPage.getRecords();
    }

    @And("^I verify records according to applied filters like \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\" are shown$")
    public void iVerifyRecordsAccordingToAppliedFiltersLikeAreShown(String Method, String Priority, String zone) {
        proposedTreatmentPage.filteredRecordsdetailsVerifiication(Method, Priority, zone);
    }

    @And("^I click on delete button$")
    public void iClickOnDeleteButton() {

        proposedTreatmentPage.deleteBtn();

    }

    @And("^I click on first entry and click on delete button$")
    public void iClickOnFirstEntryAndClickOnDeleteButton() {
        proposedTreatmentPage.firstEntryclick();
        proposedTreatmentPage.deleteBtn();
    }


    @When("^I click on map tab and search for \"([^\"]*)\"$")
    public void iClickOnMapTabAndSearchFor(String mapArea) throws InterruptedException {
        proposedTreatmentPage.mapTab();
        proposedTreatmentPage.searchMapfield(mapArea);

    }


    @And("^I draw the polygon on map by select draw option on \"([^\"]*)\" dialog box$")
    public void iDrawThePolygonOnMapBySelectDrawOptionOnDialogBox(String message) {
        proposedTreatmentPage.drawOptiondialogBox(message);
        proposedTreatmentPage.polygon();

    }

    @And("^I go to complete proposed treatment area tab$")
    public void iGoToCompleteProposedTreatmentAreaTab() {
        proposedTreatmentPage.completeButton();

    }

    @And("^I click on edit PTA button$")
    public void iClickOnEditPTAButton() {
        proposedTreatmentPage.editPTAbtn();
    }

    @And("^I select \"([^\"]*)\"and enter \"([^\"]*)\"$")
    public void iSelectAndEnter(String product, String apprate) {
        proposedTreatmentPage.editptaProductField(product);
        proposedTreatmentPage.editPtaApprateField(apprate);
    }


    @And("^I click on first entry of PTA tab$")
    public void iClickOnFirstEntryOfPTATab() {
        proposedTreatmentPage.firstEntryclick();

    }


    @And("^I verify values \"([^\"]*)\" and \"([^\"]*)\" are visible$")
    public void iVerifyValuesAndAreVisible(String product, int apprate) {
        proposedTreatmentPage.verifyProduct(product);
//        proposedTreatmentPage.verifyApprate(apprate);

    }

    @And("^I click on update button of pta tab$")
    public void iClickOnUpdateButtonOfPtaTab() {
        proposedTreatmentPage.updatePTA();
    }


    @And("^I click on export button by selecting NO(\\d+) and enter zip folder name as \"([^\"]*)\"$")
    public void iClickOnExportButtonBySelectingNOAndEnterZipFolderNameAs(int arg0, String foldername) throws InterruptedException {
        proposedTreatmentPage.exportWithNO1ButtonFunctionality();
        proposedTreatmentPage.enterZipfolderName(foldername);
        proposedTreatmentPage.downloadBtn();

    }

    @And("^I click on export button by selecting SHP$")
    public void iClickOnExportButtonBySelectingSHP() {
        proposedTreatmentPage.exportwithSHPbtnFunctionality();
    }
}
