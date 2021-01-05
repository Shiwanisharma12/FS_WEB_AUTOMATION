package pages;

import com.typesafe.config.Config;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utilities.ConfigLoader;

import java.util.concurrent.TimeUnit;

public class larvalSamplespage extends PageObject {
    Config config = ConfigLoader.load();
    int pageloadWait = Integer.parseInt(config.getString("Page_Load_Time"));
    int elementloadWait = Integer.parseInt(config.getString("Element_Load_Time"));
    int long_wait = Integer.parseInt(config.getString("Element_Load_Time"));


    @FindBy(xpath = "//a[@href='#tab2LarvalSamples']")
    private WebElement larvalSamplestab;
    @FindBy(xpath = "//button[@id='btnNewInsSample']")
    private WebElement newEntryButoon;
    @FindBy(xpath = "//h4[text()='Add Inspection Sample']")
    private WebElement addInspectionSamples;
    @FindBy(xpath = "//button[@id='btnselectMIOk']")
    private WebElement selectLocationok;
    @FindBy(xpath = "//td[text()='Point location']/../td[1]")
    private WebElement locationNames;
    @FindBy(xpath = "(//input[@placeholder='Location Name'])[1]")
    private WebElement locationNameplaceholder;
    @FindBy(xpath = "(//input[@placeholder='Sample ID'])[1]")
    private WebElement sampleIdplaceholder;
    @FindBy(xpath = "//h4[text()='Inspection Sample Details']")
    private WebElement inspectionSamplesdetails;
    @FindBy(xpath = "//input[@id='txtSampelId']")
    private WebElement sampleId;
    @FindBy(xpath = "//select[@id='ddl_FieldTechnician']/option[@value='Brad Clark']")
    private WebElement fieldTechnician;
    @FindBy(xpath = "//button[@id='btn_AddMosInsSam']")
    private WebElement addButton;
    @FindBy(xpath = "//div[text()='Added Inspection Sample successfully']")
    private WebElement successMessage;
    @FindBy(xpath = "//input[@id='txtSampleID']")
    private WebElement searchSampleid;
    @FindBy(xpath = "//input[@id='txtLocationID']")
    private WebElement searchLocation;
    @FindBy(xpath = "//button[@id='btnLarvalSearch']")
    private WebElement larvalSearchbtn;
    @FindBy(xpath = "//table[@id='largeDataTableLarva']/tbody/tr[1]")
    private WebElement tapOnfirstEntry;
    @FindBy(xpath = "//button[@id='btnCloseEntry']")
    private WebElement larvalClosebtn;
    @FindBy(xpath = "//select[@id='selLSFTechnician']/Option[@value='Brad Clark']")
    private WebElement technicianCloseentry;
    @FindBy(xpath = "(//h4[text()='Lab Tools - Select Technician'])[2]")
    private WebElement larvalTechnicianpopup;
    @FindBy(xpath = "//button[@id='btnLSMDOK']")
    private WebElement closeOkay;
    @FindBy(xpath = "//div[text()='1 Data Updated Successfully.']")
    private WebElement successCloseentryMsg;
    @FindBy(xpath = "//input[@id='chkShowClosedAct']")
    private WebElement closeActivityrecordsCheckbox;
    @FindBy(xpath = "//button[@id='btnReopenEntry']")
    private WebElement closeLarvalentry;
    //    private static String loader = "//div[@id='loading-img']";
    @FindBy(xpath = "(//input[@id='lsSelectAll'])[1]")
    private WebElement selectAlllarvalEntry;
    @FindBy(xpath = "//button[@id='btnDeleteEntry']")
    private WebElement deleteLarval;
    @FindBy(xpath = "//button[@id='btn_NotifyLarval']")
    private WebElement deleteLarvalconfirmation1;
    @FindBy(xpath = "//button[@id='btn_DeleteLarval']")
    private WebElement deleteLarvalconfirmation2;
    @FindBy(xpath = "//div[@id='loading-img']")
    private WebElementFacade loader;
    @FindBy(xpath = "//div[text()='Record deleted Successfully']")
    private WebElement successfulDeletedmsg;
    @FindBy(xpath = "//button[@id='btnLarvalSrReset']")
    private WebElement larvalResetcriteriaBtn;
    @FindBy(xpath = "//button[@id='btnAddNewLSDetails']")
    private WebElement addlabdataBtn;
    @FindBy(xpath = "//h4[text()='Inspection Sample Detail Edit']")
    private WebElement labDataeditToolbox;
    @FindBy(xpath = "//input[@id='txtFieldLarvaeCnt']")
    private WebElement fieldLarvaecount;
    @FindBy(xpath = "//input[@id='txtFieldPupaeCnt']")
    private WebElement fieldPupaecount;
    @FindBy(xpath = "//a[@href='#LabDataTabs']")
    private WebElement labDatatab;
    @FindBy(xpath = "//select[@id='selLSLabSpecies']/option[@value='A.India']")
    private WebElement labSpecies;
    @FindBy(xpath = "//button[@id='btnLSSaveClose']")
    private WebElement saveClose;
    @FindBy(xpath = "//div[@id='dateLarvaSample']")
    private WebElement startDatecalendar;
    @FindBy(xpath = "/html/body/div[8]/div[1]/table/thead/tr[1]/th[2]")
    private WebElement startYear1;
    @FindBy(xpath = "/html/body/div[8]/div[2]/table/thead/tr/th[2]")
    private WebElement startDateyear2;
    @FindBy(xpath = "/html/body/div[8]/div[3]/table/tbody/tr/td/span[2]")
    private WebElement startyear;
    @FindBy(xpath = "/html/body/div[8]/div[2]/table/tbody/tr/td/span[10]")
    private WebElement startMonth;
    @FindBy(xpath = "/html/body/div[8]/div[1]/table/tbody/tr[3]/td[3]")
    private WebElement startDate;
    @FindBy(xpath = "//div[@id='dateLarvaSample1']")
    private WebElement endDatecalendar;
    @FindBy(xpath = "/html/body/div[8]/div[1]/table/thead/tr[1]/th[2]")
    private WebElement endDateyear1;
    @FindBy(xpath = "/html/body/div[8]/div[2]/table/thead/tr/th[2]")
    private WebElement endDateyear2;
    @FindBy(xpath = "/html/body/div[8]/div[3]/table/tbody/tr/td/span[2]")
    private WebElement endYear;
    @FindBy(xpath = "/html/body/div[8]/div[2]/table/tbody/tr/td/span[10]")
    private WebElement endMonth;
    @FindBy(xpath = "/html/body/div[8]/div[1]/table/tbody/tr[3]/td[3]")
    private WebElement endDate;
    @FindBy(xpath = "(//input[@class='lsCheckbox'])[1]")
    private WebElement firstEntrycheckbox;
    @FindBy(xpath = "//input[@id='txtLabLarvaeCnt']")
    private WebElement labDatalarvaeCount;
    @FindBy(xpath = "//input[@id='txtLabPupaeCnt']")
    private WebElement labDatapupaeCount;
    @FindBy(xpath = "//input[@id='txtLabEggCnt']")
    private WebElement labDataeggCount;
    @FindBy(xpath = "//table[@id='tblLarvalFieldData']/tbody/tr[1]")
    private WebElement larvalfiedDataentry;
    @FindBy(xpath = "//table[@id='tblLarvalLabResult']/tbody/tr[1]")
    private WebElement larvalLabresult;
    @FindBy(xpath = "(//a[text()='Lab Result'])[2]")
    private WebElement labResulttab;
    @FindBy(xpath = "//table[@id='tblLarvalFieldData']/tbody/tr[1]/td[9]/a/i[@class='fa fa-edit']")
    private WebElement editEntryrecord;
    @FindBy(xpath = "//button[text()='Edit Filter']")
    private WebElement editFilter;
    @FindBy(xpath = "//div[@id='startDate']/span/i[@class='fa fa-calendar']")
    private WebElement startDateEditfilterCalendar;
    @FindBy(xpath = "/html/body/div[10]/div[1]/table/thead/tr[1]/th[2]")
    private WebElement startDateEditedfilterYear1;
    @FindBy(xpath = "/html/body/div[10]/div[2]/table/thead/tr/th[2]")
    private WebElement startDateEditedfilterYear2;
    @FindBy(xpath = "/html/body/div[10]/div[3]/table/tbody/tr/td/span[2]")
    private WebElement startDateeditedFilteryear;
    @FindBy(xpath = "/html/body/div[10]/div[2]/table/tbody/tr/td/span[10]")
    private WebElement startDateeditedFiltermonth;
    @FindBy(xpath = "/html/body/div[10]/div[1]/table/tbody/tr[3]/td[3]")
    private WebElement startDateeditedFilterdate;
    @FindBy(xpath = "//div[@id='endDate']/span/i[@class='fa fa-calendar']")
    private WebElement endDateEditfilterCalendar;
    @FindBy(xpath = "/html/body/div[10]/div[1]/table/thead/tr[1]/th[2]")
    private WebElement endDateEditedfilterYear1;
    @FindBy(xpath = "/html/body/div[10]/div[2]/table/thead/tr/th[2]")
    private WebElement endDateEditedfilterYear2;
    @FindBy(xpath = "/html/body/div[10]/div[3]/table/tbody/tr/td/span[2]")
    private WebElement endDateeditedFilteryear;
    @FindBy(xpath = "/html/body/div[10]/div[2]/table/tbody/tr/td/span[10]")
    private WebElement endDateeditedFiltermonth;
    @FindBy(xpath = "/html/body/div[10]/div[1]/table/tbody/tr[3]/td[3]")
    private WebElement endDateeditedFilterdate;
    @FindBy(xpath = "//button[@id='btnApplyFilter']")
    private WebElement applyFilter;
    @FindBy(xpath = "//input[@id='txtFieldEggCnt']")
    private WebElement fieldeggcount;
    @FindBy(xpath = "//div[text()='Data saved successfully']")
    private WebElement successMessagetrapType;


    public void larvalSamplestab() {

        waitABit(pageloadWait);
        if (loader.isVisible()) {
            withTimeoutOf(360, TimeUnit.SECONDS).waitForAbsenceOf("//div[@id='loading-img']");
        }
        withTimeoutOf(long_wait, TimeUnit.SECONDS).waitFor(larvalSamplestab).waitUntilClickable().click();
    }

    public void larvalNewentryButton() {

        waitABit(elementloadWait);
        withTimeoutOf(long_wait, TimeUnit.SECONDS).waitFor(newEntryButoon).waitUntilClickable().click();
        waitABit(elementloadWait);
        withTimeoutOf(long_wait, TimeUnit.SECONDS).waitFor(addInspectionSamples).waitUntilVisible();

    }

    public void selectLocationname(String location) {

        waitABit(elementloadWait);
//        waitFor(getDriver().findElement(By.xpath("//*[@id='tbl_MosquitoInssort']/thead/tr/th[3]"))).withTimeoutOf(long_wait, TimeUnit.SECONDS).click();
        getJavascriptExecutorFacade().executeScript("arguments[0].scrollIntoView(true);", element(locationNames));
        waitABit(elementloadWait);
        withTimeoutOf(long_wait, TimeUnit.SECONDS).waitFor(locationNames).waitUntilClickable().click();
        waitABit(elementloadWait);


    }

    public void selectLocationokay() {

        waitABit(elementloadWait);
        withTimeoutOf(long_wait, TimeUnit.SECONDS).waitFor(selectLocationok).click();
        withTimeoutOf(long_wait, TimeUnit.SECONDS).waitFor(inspectionSamplesdetails).waitUntilVisible();
    }

    public void sampleId(String sampleid) {

        waitABit(elementloadWait);
        withTimeoutOf(long_wait, TimeUnit.SECONDS).waitFor(sampleId).sendKeys(sampleid);
    }

    public void technicianType() {

        waitABit(elementloadWait);
        withTimeoutOf(long_wait, TimeUnit.SECONDS).waitFor(fieldTechnician).waitUntilClickable().click();
        waitABit(elementloadWait);
        withTimeoutOf(long_wait, TimeUnit.SECONDS).waitFor(addButton).waitUntilClickable().click();
    }

    public void newEntrysuccessMessage() throws InterruptedException {

        withTimeoutOf(long_wait, TimeUnit.SECONDS).waitFor(successMessage).waitUntilVisible();
        String text = successMessage.getText();
        Assert.assertEquals(text, text);
        Thread.sleep(4000);
    }

    public void sampleIdsearchField(String sampleid) {

        waitABit(elementloadWait);
        withTimeoutOf(long_wait, TimeUnit.SECONDS).waitFor(searchSampleid).sendKeys(sampleid);

    }

    public void locationSearchfield(String searchlocation) {

        waitABit(elementloadWait);
        withTimeoutOf(long_wait, TimeUnit.SECONDS).waitFor(searchLocation).sendKeys(searchlocation);
    }

    public void searchResults(String entry) {

        waitABit(pageloadWait);
        int row = getDriver().findElements(By.xpath("//table[@id='largeDataTableLarva']/tbody/tr")).size();
        for (int i = 1; i <= row; i++) {
            String result = getDriver().findElement(By.xpath("//table[@id='largeDataTableLarva']/tbody/tr[" + i + "]")).getText();
            Assert.assertEquals(entry, result);


        }
    }

    public void larvalSearchbtn() {

        waitABit(elementloadWait);
        withTimeoutOf(long_wait, TimeUnit.SECONDS).waitFor(larvalSearchbtn).click();
        if (loader.isVisible()) {
            withTimeoutOf(360, TimeUnit.SECONDS).waitForAbsenceOf("//div[@id='loading-img']");
        }

    }

    public void tapOnfirstEntry() {

        waitABit(elementloadWait);
        withTimeoutOf(long_wait, TimeUnit.SECONDS).waitFor(tapOnfirstEntry).click();

    }

    public void closeLarvalentry() {

        waitABit(elementloadWait);
        withTimeoutOf(long_wait, TimeUnit.SECONDS).waitFor(larvalClosebtn).waitUntilClickable().click();
        if (loader.isVisible()) {
            withTimeoutOf(360, TimeUnit.SECONDS).waitForAbsenceOf("//div[@id='loading-img']");
        }
    }

    public void selectTechniciantoCloseentry() {
        waitABit(elementloadWait);
        withTimeoutOf(long_wait, TimeUnit.SECONDS).waitFor(larvalTechnicianpopup).waitUntilVisible();
        waitABit(elementloadWait);
        withTimeoutOf(long_wait, TimeUnit.SECONDS).waitFor(technicianCloseentry).waitUntilClickable().click();
    }

    public void closeOkay() {

        waitABit(elementloadWait);
        withTimeoutOf(long_wait, TimeUnit.SECONDS).waitFor(closeOkay).waitUntilClickable().click();
    }

    public void closeSuccessmsg(String message) {
        if (loader.isVisible()) {
            withTimeoutOf(360, TimeUnit.SECONDS).waitForAbsenceOf("//div[@id='loading-img']");
        }
        waitFor(successCloseentryMsg).withTimeoutOf(long_wait, TimeUnit.SECONDS).waitUntilVisible();
        String text = withTimeoutOf(long_wait, TimeUnit.SECONDS).waitFor(successCloseentryMsg).getText();
        Assert.assertEquals(text, message);
    }

    public void closedLarvalentryCheckbox() {
        waitABit(elementloadWait);
        withTimeoutOf(long_wait, TimeUnit.SECONDS).waitFor(closeActivityrecordsCheckbox).waitUntilClickable().click();
    }

    public void reopenLarvalentry() {
        waitABit(elementloadWait);
        withTimeoutOf(long_wait, TimeUnit.SECONDS).waitFor(closeLarvalentry).waitUntilClickable().click();
        if (loader.isVisible()) {
            withTimeoutOf(360, TimeUnit.SECONDS).waitForAbsenceOf("//div[@id='loading-img']");
        }
    }

    public void selectAlllarvalEntry() {

        waitABit(elementloadWait);
        withTimeoutOf(long_wait, TimeUnit.SECONDS).waitFor(selectAlllarvalEntry).waitUntilClickable().click();
    }

    public void deleteLarvalbutton() {
        waitABit(elementloadWait);
        withTimeoutOf(long_wait, TimeUnit.SECONDS).waitFor(deleteLarval).waitUntilClickable().click();
        waitABit(elementloadWait);
        withTimeoutOf(long_wait, TimeUnit.SECONDS).waitFor(deleteLarvalconfirmation1).waitUntilClickable().click();
        waitABit(elementloadWait);
        withTimeoutOf(long_wait, TimeUnit.SECONDS).waitFor(deleteLarvalconfirmation2).waitUntilClickable().click();
        if (loader.isVisible()) {
            withTimeoutOf(360, TimeUnit.SECONDS).waitForAbsenceOf("//div[@id='loading-img']");
        }

    }

    public void deleteLarvalMsg(String deletedMsg) {
        if (loader.isVisible()) {
            withTimeoutOf(360, TimeUnit.SECONDS).waitForAbsenceOf("//div[@id='loading-img']");
        }
        withTimeoutOf(long_wait, TimeUnit.SECONDS).waitFor(successfulDeletedmsg).waitUntilVisible();
        String text = withTimeoutOf(long_wait, TimeUnit.SECONDS).waitFor(successfulDeletedmsg).getText();
        Assert.assertEquals(text, deletedMsg);
    }

    public void larvalResetcriteria() {

        waitABit(elementloadWait);
        withTimeoutOf(long_wait, TimeUnit.SECONDS).waitFor(larvalResetcriteriaBtn).waitUntilClickable().click();


    }

    public void blankSampleidField() {

        waitABit(elementloadWait);
//        String value = waitFor(searchSampleid).getText();
//        value.isEmpty();
        withTimeoutOf(long_wait, TimeUnit.SECONDS).waitFor(sampleIdplaceholder).isDisplayed();

    }

    public void blanklocationField() {

        waitABit(elementloadWait);
        waitFor(locationNameplaceholder).isDisplayed();

    }

    public void btnAddNewLSDetails() {

        waitABit(elementloadWait);
        withTimeoutOf(long_wait, TimeUnit.SECONDS).waitFor(addlabdataBtn).waitUntilClickable().click();
    }

    public void addFielddata(String larvaeCount, String pupaeCount, String eggCount) {

        waitABit(elementloadWait);
        withTimeoutOf(long_wait, TimeUnit.SECONDS).waitFor(labDataeditToolbox).waitUntilVisible();
        waitABit(elementloadWait);
        fieldLarvaecount.clear();
        withTimeoutOf(long_wait, TimeUnit.SECONDS).waitFor(fieldLarvaecount).sendKeys(larvaeCount);
        waitABit(elementloadWait);
        fieldPupaecount.clear();
        withTimeoutOf(long_wait, TimeUnit.SECONDS).waitFor(fieldPupaecount).sendKeys(pupaeCount);
        waitABit(elementloadWait);
        fieldeggcount.clear();
        withTimeoutOf(long_wait, TimeUnit.SECONDS).waitFor(fieldeggcount).sendKeys(eggCount);

    }

    public void labDatatab(String eggcount, String larvaeCount, String pupaeCount) {
        waitABit(elementloadWait);
        withTimeoutOf(long_wait, TimeUnit.SECONDS).waitFor(labDatatab).waitUntilClickable().click();
        waitABit(elementloadWait);
        withTimeoutOf(long_wait, TimeUnit.SECONDS).waitFor(labSpecies).waitUntilClickable().click();
        waitABit(elementloadWait);
        withTimeoutOf(long_wait, TimeUnit.SECONDS).waitFor(labDatalarvaeCount).clear();
        withTimeoutOf(long_wait, TimeUnit.SECONDS).waitFor(labDatalarvaeCount).sendKeys(larvaeCount);
        withTimeoutOf(long_wait, TimeUnit.SECONDS).waitFor(labDatapupaeCount).clear();
        withTimeoutOf(long_wait, TimeUnit.SECONDS).waitFor(labDatapupaeCount).sendKeys(pupaeCount);
        withTimeoutOf(long_wait, TimeUnit.SECONDS).waitFor(labDataeggCount).clear();
        withTimeoutOf(long_wait, TimeUnit.SECONDS).waitFor(labDataeggCount).sendKeys(eggcount);
    }

    public void saveClose() {

        waitABit(elementloadWait);
        withTimeoutOf(long_wait, TimeUnit.SECONDS).waitFor(saveClose).waitUntilClickable().click();
        if (loader.isVisible()) {
            withTimeoutOf(360, TimeUnit.SECONDS).waitForAbsenceOf("//div[@id='loading-img']");
        }
    }

    public void startDate() {
        waitABit(elementloadWait);
        withTimeoutOf(long_wait, TimeUnit.SECONDS).waitFor(startDatecalendar).waitUntilClickable().click();
        waitABit(elementloadWait);
        withTimeoutOf(long_wait, TimeUnit.SECONDS).waitFor(startYear1).waitUntilClickable().click();
        waitABit(elementloadWait);
        withTimeoutOf(long_wait, TimeUnit.SECONDS).waitFor(startDateyear2).waitUntilClickable().click();
        waitABit(elementloadWait);
        withTimeoutOf(long_wait, TimeUnit.SECONDS).waitFor(startyear).waitUntilClickable().click();
        waitABit(elementloadWait);
        withTimeoutOf(long_wait, TimeUnit.SECONDS).waitFor(startMonth).waitUntilClickable().click();
        waitABit(elementloadWait);
        withTimeoutOf(long_wait, TimeUnit.SECONDS).waitFor(startDate).waitUntilClickable().click();
    }

    public void endDate() {

        waitABit(elementloadWait);
        withTimeoutOf(long_wait, TimeUnit.SECONDS).waitFor(endDatecalendar).waitUntilClickable().click();
        waitABit(elementloadWait);
        withTimeoutOf(long_wait, TimeUnit.SECONDS).waitFor(endDateyear1).waitUntilClickable().click();
        waitABit(elementloadWait);
        withTimeoutOf(long_wait, TimeUnit.SECONDS).waitFor(endDateyear2).waitUntilClickable().click();
        waitABit(elementloadWait);
        withTimeoutOf(long_wait, TimeUnit.SECONDS).waitFor(endYear).waitUntilClickable().click();
        waitABit(elementloadWait);
        withTimeoutOf(long_wait, TimeUnit.SECONDS).waitFor(endMonth).waitUntilClickable().click();
        waitABit(elementloadWait);
        withTimeoutOf(long_wait, TimeUnit.SECONDS).waitFor(endDate).waitUntilClickable().click();
    }

    public void firstEntrycheckbox() {

        waitABit(elementloadWait);
        withTimeoutOf(long_wait, TimeUnit.SECONDS).waitFor(firstEntrycheckbox).waitUntilClickable().click();
    }


    public void larvalFielddataEntry(String entry) {

        waitABit(pageloadWait);
        if (loader.isVisible()) {
            withTimeoutOf(360, TimeUnit.SECONDS).waitForAbsenceOf("//div[@id='loading-img']");
        }
        withTimeoutOf(long_wait, TimeUnit.SECONDS).waitFor(larvalfiedDataentry).isDisplayed();
        String text = withTimeoutOf(long_wait, TimeUnit.SECONDS).waitFor(larvalfiedDataentry).getText();
        System.out.println(text);
        Assert.assertEquals(text, entry);
    }

    public void larvalFieldlabResult(String entry) {

        waitABit(elementloadWait);
        withTimeoutOf(long_wait, TimeUnit.SECONDS).waitFor(larvalLabresult).isDisplayed();
        String text = withTimeoutOf(long_wait, TimeUnit.SECONDS).waitFor(larvalLabresult).getText();
        System.out.println(text);
        Assert.assertEquals(text, entry);
    }

    public void labResulttab() {

        waitABit(elementloadWait);
        withTimeoutOf(long_wait, TimeUnit.SECONDS).waitFor(labResulttab).waitUntilClickable().click();
    }

    public void editLarvalfieldRecord() {

        waitABit(elementloadWait);
        withTimeoutOf(long_wait, TimeUnit.SECONDS).waitFor(editEntryrecord).waitUntilClickable().click();
    }


    public void editFilter() {
        waitABit(elementloadWait);
        withTimeoutOf(long_wait, TimeUnit.SECONDS).waitFor(editFilter).waitUntilClickable().click();
        startDateforLocation();
        endDateforLocation();
        applyFilter();
    }

    private void applyFilter() {

        waitABit(elementloadWait);
        withTimeoutOf(long_wait, TimeUnit.SECONDS).waitFor(applyFilter).waitUntilClickable().click();
    }

    private void startDateforLocation() {
        waitABit(elementloadWait);
        withTimeoutOf(long_wait, TimeUnit.SECONDS).waitFor(startDateEditfilterCalendar).waitUntilClickable().click();
        waitABit(elementloadWait);
        withTimeoutOf(long_wait, TimeUnit.SECONDS).waitFor(startDateEditedfilterYear1).waitUntilClickable().click();
        waitABit(elementloadWait);
        withTimeoutOf(long_wait, TimeUnit.SECONDS).waitFor(startDateEditedfilterYear2).waitUntilClickable().click();
        waitABit(elementloadWait);
        withTimeoutOf(long_wait, TimeUnit.SECONDS).waitFor(startDateeditedFilteryear).waitUntilClickable().click();
        waitABit(elementloadWait);
        withTimeoutOf(long_wait, TimeUnit.SECONDS).waitFor(startDateeditedFiltermonth).waitUntilClickable().click();
        waitABit(elementloadWait);
        withTimeoutOf(long_wait, TimeUnit.SECONDS).waitFor(startDateeditedFilterdate).waitUntilClickable().click();
    }

    private void endDateforLocation() {

        waitABit(elementloadWait);
        withTimeoutOf(long_wait, TimeUnit.SECONDS).waitFor(endDateEditfilterCalendar).waitUntilClickable().click();
        waitABit(elementloadWait);
        withTimeoutOf(long_wait, TimeUnit.SECONDS).waitFor(endDateEditedfilterYear1).waitUntilClickable().click();
        waitABit(elementloadWait);
        withTimeoutOf(long_wait, TimeUnit.SECONDS).waitFor(endDateEditedfilterYear2).waitUntilClickable().click();
        waitABit(elementloadWait);
        withTimeoutOf(long_wait, TimeUnit.SECONDS).waitFor(endDateeditedFilteryear).waitUntilClickable().click();
        waitABit(elementloadWait);
        withTimeoutOf(long_wait, TimeUnit.SECONDS).waitFor(endDateeditedFiltermonth).waitUntilClickable().click();
        waitABit(elementloadWait);
        withTimeoutOf(long_wait, TimeUnit.SECONDS).waitFor(endDateeditedFilterdate).waitUntilClickable().click();
    }


    public void trapTypeSuccessmessage(String messge) {

        withTimeoutOf(long_wait, TimeUnit.SECONDS).waitFor(successMessagetrapType).isVisible();
        String text = successMessagetrapType.getText();
        Assert.assertEquals(text, messge);

    }
}
