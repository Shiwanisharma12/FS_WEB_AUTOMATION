package pages;

import com.typesafe.config.Config;
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
    private static String loader="//div[@id='loading-img']";
    @FindBy(xpath = "(//input[@id='lsSelectAll'])[1]")
    private WebElement selectAlllarvalEntry;
    @FindBy(xpath = "//button[@id='btnDeleteEntry']")
    private WebElement deleteLarval;
    @FindBy(xpath = "//button[@id='btn_NotifyLarval']")
    private WebElement deleteLarvalconfirmation1;
    @FindBy(xpath = "//button[@id='btn_DeleteLarval']")
    private WebElement deleteLarvalconfirmation2;
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
    @FindBy(xpath = "(//th[@class='datepicker-switch'])[1]")
    private WebElement startYear1;
    @FindBy(xpath = "(//th[@class='datepicker-switch'])[2]")
    private WebElement startDateyear2;
    @FindBy(xpath = "(//div[@class='datepicker-years']/table/tbody/tr/td/span[text()='2020'])[5]")
    private WebElement startyear;
    @FindBy(xpath = "(//div[@class='datepicker-months']/table/tbody/tr/td/span[text()='Oct'])[5]")
    private WebElement startMonth;
    @FindBy(xpath = "(//div[@class='datepicker-days']/table/tbody/tr/td[text()='13'])[5]")
    private WebElement startDate;
    @FindBy(xpath = "//div[@id='dateLarvaSample1']")
    private WebElement endDatecalendar;
    @FindBy(xpath = "(//th[@class='datepicker-switch'])[1]")
    private WebElement endDateyear1;
    @FindBy(xpath = "(//th[@class='datepicker-switch'])[2]")
    private WebElement endDateyear2;
    @FindBy(xpath = "(//div[@class='datepicker-years']/table/tbody/tr/td/span[text()='2020'])[5]")
    private WebElement endYear;
    @FindBy(xpath = "(//div[@class='datepicker-months']/table/tbody/tr/td/span[text()='Oct'])[5]")
    private WebElement endMonth;
    @FindBy(xpath = "(//div[@class='datepicker-days']/table/tbody/tr/td[text()='13'])[5]")
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
    @FindBy(xpath = "(//div[@class='datepicker-days']/table/thead/tr/th[2])[9]")
    private WebElement startDateEditedfilterYear1;
    @FindBy(xpath = "(//div[@class='datepicker-months']/table/thead/tr/th[2])[5]")
    private WebElement startDateEditedfilterYear2;
    @FindBy(xpath = "(//div[@class='datepicker-years']/table/tbody/tr/td/span[text()='2020'])[5]")
    private WebElement startDateeditedFilteryear ;
    @FindBy(xpath = "(//div[@class='datepicker-months']/table/tbody/tr/td/span[text()='Oct'])[5]")
    private WebElement startDateeditedFiltermonth ;
    @FindBy(xpath = "(//div[@class='datepicker-days']/table/tbody/tr/td[text()='13'])[5]")
    private WebElement startDateeditedFilterdate ;
    @FindBy(xpath = "//div[@id='endDate']/span/i[@class='fa fa-calendar']")
    private WebElement endDateEditfilterCalendar;
    @FindBy(xpath = "(//div[@class='datepicker-days']/table/thead/tr/th[2])[9]")
    private WebElement endDateEditedfilterYear1;
    @FindBy(xpath = "(//div[@class='datepicker-months']/table/thead/tr/th[2])[5]")
    private WebElement endDateEditedfilterYear2;
    @FindBy(xpath = "(//div[@class='datepicker-years']/table/tbody/tr/td/span[text()='2020'])[5]")
    private WebElement endDateeditedFilteryear ;
    @FindBy(xpath = "(//div[@class='datepicker-months']/table/tbody/tr/td/span[text()='Oct'])[5]")
    private WebElement endDateeditedFiltermonth ;
    @FindBy(xpath = "(//div[@class='datepicker-days']/table/tbody/tr/td[text()='13'])[5]")
    private WebElement endDateeditedFilterdate ;
    @FindBy(xpath = "//button[@id='btnApplyFilter']")
    private WebElement applyFilter ;
    @FindBy(xpath = "//input[@id='txtFieldEggCnt']")
    private WebElement fieldeggcount ;
    @FindBy(xpath = "//div[text()='Data saved successfully']")
    private WebElement successMessagetrapType;







    public void larvalSamplestab() {

        waitABit(pageloadWait);
        waitForAbsenceOf(loader).withTimeoutOf(long_wait,TimeUnit.SECONDS);
        waitFor(larvalSamplestab).withTimeoutOf(long_wait, TimeUnit.SECONDS).waitUntilClickable().click();
    }

    public void larvalNewentryButton() {

        waitABit(elementloadWait);
        waitFor(newEntryButoon).withTimeoutOf(long_wait, TimeUnit.SECONDS).waitUntilClickable().click();
        waitABit(elementloadWait);
        waitFor(addInspectionSamples).withTimeoutOf(long_wait, TimeUnit.SECONDS).waitUntilVisible();

    }

    public void selectLocationname(String location) {

        waitABit(elementloadWait);
//        waitFor(getDriver().findElement(By.xpath("//*[@id='tbl_MosquitoInssort']/thead/tr/th[3]"))).withTimeoutOf(long_wait, TimeUnit.SECONDS).click();
        getJavascriptExecutorFacade().executeScript("arguments[0].scrollIntoView(true);", element(locationNames));
        waitABit(elementloadWait);
        waitFor(locationNames).withTimeoutOf(long_wait, TimeUnit.SECONDS).waitUntilClickable().click();
        waitABit(elementloadWait);


    }

    public void selectLocationokay() {

        waitABit(elementloadWait);
        waitFor(selectLocationok).withTimeoutOf(long_wait, TimeUnit.SECONDS).click();
        waitFor(inspectionSamplesdetails).withTimeoutOf(long_wait, TimeUnit.SECONDS).waitUntilVisible();
    }

    public void sampleId(String sampleid) {

        waitABit(elementloadWait);
        waitFor(sampleId).withTimeoutOf(long_wait, TimeUnit.SECONDS).sendKeys(sampleid);
    }

    public void technicianType() {

        waitABit(elementloadWait);
        waitFor(fieldTechnician).withTimeoutOf(long_wait, TimeUnit.SECONDS).waitUntilClickable().click();
        waitABit(elementloadWait);
        waitFor(addButton).withTimeoutOf(long_wait, TimeUnit.SECONDS).waitUntilClickable().click();
    }

    public void newEntrysuccessMessage() throws InterruptedException {

        waitFor(successMessage).waitUntilVisible().withTimeoutOf(long_wait, TimeUnit.SECONDS);
        String text = successMessage.getText();
        Assert.assertEquals(text, text);
        Thread.sleep(4000);
    }

    public void sampleIdsearchField(String sampleid) {

        waitABit(elementloadWait);
        waitFor(searchSampleid).withTimeoutOf(long_wait, TimeUnit.SECONDS).sendKeys(sampleid);

    }

    public void locationSearchfield(String searchlocation) {

        waitABit(elementloadWait);
        waitFor(searchLocation).withTimeoutOf(long_wait, TimeUnit.SECONDS).sendKeys(searchlocation);
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
        waitFor(larvalSearchbtn).withTimeoutOf(long_wait, TimeUnit.SECONDS).click();
        waitForAbsenceOf(loader).withTimeoutOf(long_wait,TimeUnit.SECONDS);


    }

    public void tapOnfirstEntry() {

        waitABit(elementloadWait);
        waitFor(tapOnfirstEntry).withTimeoutOf(long_wait, TimeUnit.SECONDS).click();

    }

    public void closeLarvalentry() {

        waitABit(elementloadWait);
        waitFor(larvalClosebtn).withTimeoutOf(long_wait, TimeUnit.SECONDS).waitUntilClickable().click();
        waitForAbsenceOf(loader).withTimeoutOf(long_wait,TimeUnit.SECONDS);

    }

    public void selectTechniciantoCloseentry() {
        waitABit(elementloadWait);
        waitFor(larvalTechnicianpopup).withTimeoutOf(long_wait, TimeUnit.SECONDS).waitUntilVisible();
        waitABit(elementloadWait);
        waitFor(technicianCloseentry).withTimeoutOf(long_wait, TimeUnit.SECONDS).waitUntilClickable().click();
    }

    public void closeOkay() {

        waitABit(elementloadWait);
        waitFor(closeOkay).withTimeoutOf(long_wait, TimeUnit.SECONDS).waitUntilClickable().click();
    }

    public void closeSuccessmsg(String message) {
        waitForAbsenceOf(loader).withTimeoutOf(long_wait,TimeUnit.SECONDS);
        waitFor(successCloseentryMsg).withTimeoutOf(long_wait, TimeUnit.SECONDS).waitUntilVisible();
        String text = waitFor(successCloseentryMsg).withTimeoutOf(long_wait, TimeUnit.SECONDS).getText();
        Assert.assertEquals(text, message);
    }

    public void closedLarvalentryCheckbox() {
        waitABit(elementloadWait);
        waitFor(closeActivityrecordsCheckbox).withTimeoutOf(long_wait, TimeUnit.SECONDS).waitUntilClickable().click();
    }

    public void reopenLarvalentry() {
        waitABit(elementloadWait);
        waitFor(closeLarvalentry).withTimeoutOf(long_wait, TimeUnit.SECONDS).waitUntilClickable().click();
        waitForAbsenceOf(loader).withTimeoutOf(pageloadWait,TimeUnit.SECONDS);

    }

    public void selectAlllarvalEntry() {

        waitABit(elementloadWait);
        waitFor(selectAlllarvalEntry).withTimeoutOf(long_wait, TimeUnit.SECONDS).waitUntilClickable().click();
    }

    public void deleteLarvalbutton() {
        waitABit(elementloadWait);
        waitFor(deleteLarval).withTimeoutOf(long_wait, TimeUnit.SECONDS).waitUntilClickable().click();
        waitABit(elementloadWait);
        waitFor(deleteLarvalconfirmation1).withTimeoutOf(long_wait, TimeUnit.SECONDS).waitUntilClickable().click();
        waitABit(elementloadWait);
        waitFor(deleteLarvalconfirmation2).withTimeoutOf(long_wait, TimeUnit.SECONDS).waitUntilClickable().click();
        waitForAbsenceOf(loader).withTimeoutOf(pageloadWait,TimeUnit.SECONDS);



    }

    public void deleteLarvalMsg(String deletedMsg) {

        waitForAbsenceOf(loader).withTimeoutOf(long_wait,TimeUnit.SECONDS);
        waitFor(1);
        waitFor(successfulDeletedmsg).withTimeoutOf(long_wait, TimeUnit.SECONDS).waitUntilVisible();
        String text = waitFor(successfulDeletedmsg).withTimeoutOf(long_wait, TimeUnit.SECONDS).getText();
        Assert.assertEquals(text, deletedMsg);
    }

    public void larvalResetcriteria() {

        waitABit(elementloadWait);
        waitFor(larvalResetcriteriaBtn).withTimeoutOf(long_wait, TimeUnit.SECONDS).waitUntilClickable().click();


    }

    public void blankSampleidField() {

        waitABit(elementloadWait);
//        String value = waitFor(searchSampleid).getText();
//        value.isEmpty();
        waitFor(sampleIdplaceholder).isDisplayed();

    }

    public void blanklocationField() {

        waitABit(elementloadWait);
        waitFor(locationNameplaceholder).isDisplayed();

    }

    public void btnAddNewLSDetails() {

        waitABit(elementloadWait);
        waitFor(addlabdataBtn).withTimeoutOf(long_wait, TimeUnit.SECONDS).waitUntilClickable().click();
    }

    public void addFielddata(String larvaeCount, String pupaeCount, String eggCount) {

        waitABit(elementloadWait);
        waitFor(labDataeditToolbox).withTimeoutOf(long_wait, TimeUnit.SECONDS).waitUntilVisible();
        waitABit(elementloadWait);
        fieldLarvaecount.clear();
        waitFor(fieldLarvaecount).withTimeoutOf(long_wait, TimeUnit.SECONDS).sendKeys(larvaeCount);
        waitABit(elementloadWait);
        fieldPupaecount.clear();
        waitFor(fieldPupaecount).withTimeoutOf(long_wait, TimeUnit.SECONDS).sendKeys(pupaeCount);
        waitABit(elementloadWait);
        fieldeggcount.clear();
        waitFor(fieldeggcount).withTimeoutOf(long_wait, TimeUnit.SECONDS).sendKeys(eggCount);

    }

    public void labDatatab(String eggcount, String larvaeCount, String pupaeCount)
    {
        waitABit(elementloadWait);
        waitFor(labDatatab).withTimeoutOf(long_wait, TimeUnit.SECONDS).waitUntilClickable().click();
        waitABit(elementloadWait);
        waitFor(labSpecies).withTimeoutOf(long_wait, TimeUnit.SECONDS).waitUntilClickable().click();
        waitABit(elementloadWait);
        waitFor(labDatalarvaeCount).withTimeoutOf(long_wait, TimeUnit.SECONDS).clear();
        waitFor(labDatalarvaeCount).withTimeoutOf(long_wait, TimeUnit.SECONDS).sendKeys(larvaeCount);
        waitFor(labDatapupaeCount).withTimeoutOf(long_wait, TimeUnit.SECONDS).clear();
        waitFor(labDatapupaeCount).withTimeoutOf(long_wait, TimeUnit.SECONDS).sendKeys(pupaeCount);
        waitFor(labDataeggCount).withTimeoutOf(long_wait, TimeUnit.SECONDS).clear();
        waitFor(labDataeggCount).withTimeoutOf(long_wait, TimeUnit.SECONDS).sendKeys(eggcount);
    }

    public void saveClose() {

        waitABit(elementloadWait);
        waitFor(saveClose).withTimeoutOf(long_wait, TimeUnit.SECONDS).waitUntilClickable().click();
        waitForAbsenceOf(loader).withTimeoutOf(long_wait,TimeUnit.SECONDS);
    }

    public void startDate() {
        waitABit(elementloadWait);
        waitFor(startDatecalendar).withTimeoutOf(long_wait, TimeUnit.SECONDS).waitUntilClickable().click();
        waitABit(elementloadWait);
        waitFor(startYear1).withTimeoutOf(long_wait, TimeUnit.SECONDS).waitUntilClickable().click();
        waitABit(elementloadWait);
        waitFor(startDateyear2).withTimeoutOf(long_wait, TimeUnit.SECONDS).waitUntilClickable().click();
        waitABit(elementloadWait);
        waitFor(startyear).withTimeoutOf(long_wait, TimeUnit.SECONDS).waitUntilClickable().click();
        waitABit(elementloadWait);
        waitFor(startMonth).withTimeoutOf(long_wait, TimeUnit.SECONDS).waitUntilClickable().click();
        waitABit(elementloadWait);
        waitFor(startDate).withTimeoutOf(long_wait, TimeUnit.SECONDS).waitUntilClickable().click();
    }

    public void endDate() {

        waitABit(elementloadWait);
        waitFor(endDatecalendar).withTimeoutOf(long_wait, TimeUnit.SECONDS).waitUntilClickable().click();
        waitABit(elementloadWait);
        waitFor(endDateyear1).withTimeoutOf(long_wait, TimeUnit.SECONDS).waitUntilClickable().click();
        waitABit(elementloadWait);
        waitFor(endDateyear2).withTimeoutOf(long_wait, TimeUnit.SECONDS).waitUntilClickable().click();
        waitABit(elementloadWait);
        waitFor(endYear).withTimeoutOf(long_wait, TimeUnit.SECONDS).waitUntilClickable().click();
        waitABit(elementloadWait);
        waitFor(endMonth).withTimeoutOf(long_wait, TimeUnit.SECONDS).waitUntilClickable().click();
        waitABit(elementloadWait);
        waitFor(endDate).withTimeoutOf(long_wait, TimeUnit.SECONDS).waitUntilClickable().click();
    }

    public void firstEntrycheckbox() {

        waitABit(elementloadWait);
        waitFor(firstEntrycheckbox).withTimeoutOf(long_wait, TimeUnit.SECONDS).waitUntilClickable().click();
    }


    public void larvalFielddataEntry(String entry) {

        waitABit(pageloadWait);
        waitForAbsenceOf(loader).withTimeoutOf(long_wait,TimeUnit.SECONDS);
        waitFor(larvalfiedDataentry).withTimeoutOf(long_wait, TimeUnit.SECONDS).isDisplayed();
        String text=  waitFor(larvalfiedDataentry).withTimeoutOf(long_wait, TimeUnit.SECONDS).getText();
        System.out.println(text);
        Assert.assertEquals(text,entry);
    }

    public void larvalFieldlabResult(String entry) {

        waitABit(elementloadWait);
        waitFor(larvalLabresult).withTimeoutOf(long_wait, TimeUnit.SECONDS).isDisplayed();
        String text=  waitFor(larvalLabresult).withTimeoutOf(long_wait, TimeUnit.SECONDS).getText();
        System.out.println(text);
        Assert.assertEquals(text,entry);
    }

    public void labResulttab() {

        waitABit(elementloadWait);
        waitFor(labResulttab).withTimeoutOf(long_wait, TimeUnit.SECONDS).waitUntilClickable().click();
    }

    public void editLarvalfieldRecord() {

        waitABit(elementloadWait);
        waitFor(editEntryrecord).withTimeoutOf(long_wait, TimeUnit.SECONDS).waitUntilClickable().click();
    }


    public void editFilter() {
        waitABit(elementloadWait);
        waitFor(editFilter).withTimeoutOf(long_wait, TimeUnit.SECONDS).waitUntilClickable().click();
        startDateforLocation();
        endDateforLocation();
        applyFilter();
    }

    private void applyFilter() {

        waitABit(elementloadWait);
        waitFor(applyFilter).withTimeoutOf(long_wait, TimeUnit.SECONDS).waitUntilClickable().click();
    }

    private void startDateforLocation() {
        waitABit(elementloadWait);
        waitFor(startDateEditfilterCalendar).withTimeoutOf(long_wait, TimeUnit.SECONDS).waitUntilClickable().click();
        waitABit(elementloadWait);
        waitFor(startDateEditedfilterYear1).withTimeoutOf(long_wait, TimeUnit.SECONDS).waitUntilClickable().click();
        waitABit(elementloadWait);
        waitFor(startDateEditedfilterYear2).withTimeoutOf(long_wait, TimeUnit.SECONDS).waitUntilClickable().click();
        waitABit(elementloadWait);
        waitFor(startDateeditedFilteryear).withTimeoutOf(long_wait, TimeUnit.SECONDS).waitUntilClickable().click();
        waitABit(elementloadWait);
        waitFor(startDateeditedFiltermonth).withTimeoutOf(long_wait, TimeUnit.SECONDS).waitUntilClickable().click();
        waitABit(elementloadWait);
        waitFor(startDateeditedFilterdate).withTimeoutOf(long_wait, TimeUnit.SECONDS).waitUntilClickable().click();
    }

    private void endDateforLocation() {

        waitABit(elementloadWait);
        waitFor(endDateEditfilterCalendar).withTimeoutOf(long_wait, TimeUnit.SECONDS).waitUntilClickable().click();
        waitABit(elementloadWait);
        waitFor(endDateEditedfilterYear1).withTimeoutOf(long_wait, TimeUnit.SECONDS).waitUntilClickable().click();
        waitABit(elementloadWait);
        waitFor(endDateEditedfilterYear2).withTimeoutOf(long_wait, TimeUnit.SECONDS).waitUntilClickable().click();
        waitABit(elementloadWait);
        waitFor(endDateeditedFilteryear).withTimeoutOf(long_wait, TimeUnit.SECONDS).waitUntilClickable().click();
        waitABit(elementloadWait);
        waitFor(endDateeditedFiltermonth).withTimeoutOf(long_wait, TimeUnit.SECONDS).waitUntilClickable().click();
        waitABit(elementloadWait);
        waitFor(endDateeditedFilterdate).withTimeoutOf(long_wait, TimeUnit.SECONDS).waitUntilClickable().click();
    }


    public void trapTypeSuccessmessage(String messge) {

        waitFor(successMessagetrapType).withTimeoutOf(long_wait,TimeUnit.SECONDS).isVisible();
        String text = successMessagetrapType.getText();
        Assert.assertEquals(text,messge);

    }
}
