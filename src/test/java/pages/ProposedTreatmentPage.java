package pages;

import com.typesafe.config.Config;
import cucumber.api.java.bs.A;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import utilities.ConfigLoader;
import utilities.LoadProperties;

import javax.el.ELException;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class ProposedTreatmentPage extends PageObject {


    Config config = ConfigLoader.load();
    int pageloadWait = Integer.parseInt(config.getString("Page_Load_Time"));
    int elementloadWait = Integer.parseInt(config.getString("Element_Load_Time"));
    int long_wait = Integer.parseInt(config.getString("Element_Load_Time"));


    private static final String mapTab = "//span[text()='Map']";
    private static final String loadingSquares = "//div[@id='app-loading']";
    private static final String topHeader = "//div[@class=\"container-section jimu-float-leading\"]";
    private static final String layerListbtn = "//img[@src=\"/map/widgets/LayerList/images/icon.png?wab_dv=2.7\"]";
    private static final String operationalLayerbtn = "//div[@class=\"feature-action icon-operation\"]";
    private static final String turnAlllayerOncheckbox = "//div[@itemid=\"turnAllLayersOn\"]";
    private static final String closeLayerPopupbox = "//div[@class='close-btn jimu-float-trailing']";
    private static final String editbtn = "//img[@src=\"/map/widgets/Edit/images/icon.png?wab_dv=2.7\"]";
    private static final String editPopupBox = "//div[text()='Edit']";
    private static final String searchField = "//input[@placeholder=\"Search templates\"]";
    private static final String proposedTemplate = "(//div[text()='ProposedTreatmentArea'])[2]";
    private static final String mapLoader = "//div[text()='Loading...']";
    private static final String zoomInbtn = "(//span[text()='+'])[1]";
    private static final String overlay = "//div[@id='map_layers']";
    private static final String measurementBtn = "//div[@id='dijit__WidgetBase_0']";
    @FindBy(xpath = "//div[text()='Do you want to copy shape or draw manually?']")
    private WebElementFacade drawManuallypopupBox;
    private static final String drawOption = "//div[contains(@class,\"jimu-btn jimu-popup-action-btn jimu-float-trailing jimu-trailing-margin1\") and text()='Draw']";
    private static final String pointC = "";
    private static final String navigateTodashboard = "//font[text()=\"Back to Dashboard\"]";
    @FindBy(xpath = "//span[text()='Proposed Treatment Area']")
    WebElementFacade proposedTreatmenttab;
    private static final String scaleValue = "(//div[@class=\"esriScalebarLabel esriScalebarLineLabel esriScalebarSecondNumber\"])[1]";
    private static final String zoomOutbtn = "//*[text()='–']";
    private static final String zoomInbtnMap = "//div[contains(@class,\"esriSimpleSliderIncrementButton\")]";
    private static final String nameField = "(//input[@class=\"dijitReset dijitInputInner\"])[1]";
    private static final String monthScrolldown = "//span[@class=\"dijitReset dijitInline dijitArrowButtonInner\"]";
    private static final String year = "//span[@class=\"dijitInline dijitCalendarNextYear\" and text()=\"2021\"]";
    private static final String month = "(//div[@class=\"dijitCalendarMonthLabel\" and text()=\"November\"])[2]";
    private static final String date = "(//span[@class=\"dijitCalendarDateLabel\" and text()='5'])[1]";
    private static final String commentField = "(//input[@class=\"dijitReset dijitInputInner\"])[5]";
    private static final String saveBtn = "//span[@class=\"dijitReset dijitInline dijitButtonText\" and text()=\"Save\"]";
    private static final String closeProposedtreatmentPopupbox = "//span[@class=\"dijitReset dijitInline dijitButtonText\" and text()='Close']";
    private static final String searchedNewentryResult = "//*/table[@id=\"tblProposedTreatment\"]/tbody/tr[1]";
    @FindBy(xpath = "//input[@type='search']")
    WebElementFacade productTreatmentSearchfield;
    //    private static final String productTreatmentSearchfield = "//input[@type=\"search\"]";
    private static final String totalfoghoursField = "//input[@id=\"txtTotalFogHours\"]";
    private static final String txtFlowrateField = "//input[@id=\"txtFlowRate\"]";
    private static final String startDatefield = "//input[@id='txtStartDate']";
    private static final String endDatefield = "//input[@id=\"txtEndDate\"]";
    private static final String regularTreatmentTab = "(//span[@class=\"checkmark\"])[2]";
    private static final String saveTreatmentform = "//button[@id=\"btnSaveNewTreatment\"]";
    private static final String enterTreatmentbtn = "//button[@id=\"btnEnterTreatment\"]";
    private static final String quantityField = "//input[@id='txtProductQty']";
    @FindBy(xpath = "//div[text()='Please wait data is loading']")
    private WebElementFacade dataLoadingmessage;
    @FindBy(xpath = "//*/table[@id='tblInventory']/tbody/tr/td[text()='Truck 107']")
    WebElementFacade vehicle107;
    @FindBy(xpath = "(//table[@id='tblProducts']/tbody/tr/td[2])[1]")
    WebElementFacade productQuantity;
    private static final String productInventorytab = "(//div[@class=\"toolsBox\"])[5]";
    private static final String totalSprayfootValue = "//input[@id=\"txtProductVol\"]";
    private static final String dashboardLinkonProductinventoryTab = "//a[text()=\"Dashboard\"]";
    private static final String endDate = "(//table[@class=\"table-condensed\"]/tbody/tr/td[text()='31'])[4]";
    private static final String firstEntryactionBtn = "(//a[@class='EditRowReview edit-treatment']/i[@class='fa fa-edit'])[1]";
    private static final String editNamefield = "//input[@id='txtName_Edit']";
    private static final String saveChangesBtn = "//button[@id='btnSave_Edit']";
    private static final String printDropdown = "//div[contains(@class,'dijitReset dijitArrowButtonInner')]";
    private static final String selectAllbtn = "//button[text()='Select All']";
    private static final String getRecords = "//button[@id='btn_GetRecords']";
    @FindBy(xpath = "//input[@id='esri_dijit_Search_0_input']")
    WebElementFacade searchMapfield;
    @FindBy(xpath = "//button[@id='btn_AddProductAppRate']")
    WebElementFacade editPTAbtn;
    @FindBy(xpath = "//input[@id='txtAppRate']")
    WebElementFacade enterApprateField;
    @FindBy(xpath = "//button[@id='btnSave_ProductPTA']")
    WebElementFacade updatePTAbtn;
    //    @FindBy(xpath = "//input[@id='txtApprate_Edit']")
//    WebElementFacade ptaApprateField;
    private static String ptaApprateField = "//*[@id='txtApprate_Edit']";
    private static final String ptaProductfield = "//*[@id='selProduct_Edit']";
    private static final String dateAscendingorder = "//th[@class='sorting_asc']";
    //    private static final String mapAreaclick="//li[text()='Twin Falls, ID, USA']";
    private static final String mapAreaclick = "//li[text()='Jerome']";
    @FindBy(xpath = "//table[@id='tblProposedTreatment']/tbody/tr")
    WebElement proposedTreatmenttable;
    static WebDriver driver;

    @FindBy(xpath = "//button[text()='Remove Selection']")
    private WebElementFacade removeSelection;
    String text;
    private static String loader = "//div[@id='loading-img']";
    @FindBy(xpath = "//td[text()='A3 Landscape']")
    private WebElementFacade a3Landscape;
    @FindBy(xpath = "//td[text()='A3 Portrait']")
    private WebElementFacade a3Portrait;
    @FindBy(xpath = "//td[text()='A4 Landscape']")
    private WebElementFacade a4Landscape;
    @FindBy(xpath = "//td[text()='A4 Portrait']")
    private WebElementFacade a4Portrait;
    @FindBy(xpath = "//td[text()='Letter ANSI A Landscape']")
    private WebElementFacade letterANSIAlandscape;
    @FindBy(xpath = "//td[text()='Letter ANSI A Portrait']")
    private WebElementFacade LetterANSIAPortrait;
    @FindBy(xpath = "//td[text()='Tabloid ANSI B Landscape']")
    private WebElementFacade TabloidANSIBLandscape;
    @FindBy(xpath = "//td[text()='Tabloid ANSI B Portrait']")
    private WebElementFacade TabloidANSIBPortrait;
    @FindBy(xpath = "//td[text()='MAP_ONLY']")
    private WebElementFacade MapOnly;
    private static String printBtn = "//div[text()='Print']";
    @FindBy(xpath = "//div[text()='Printing']")
    private WebElementFacade printingBtn;
    @FindBy(xpath = "//a[text()='Printout']")
    WebElementFacade printOutbtn;
    private static String completeBtnPTAtab = "//button[@id=\"btnComplete\"]";
    private static String reviewCompletedTreatmenttab = "//a[@id=\"lnkReviewTreatment\"]";
    @FindBy(xpath = "//button[@id='btnExport']")
    WebElementFacade exportBtn;
    private static String KMLBtn = "//a[text()='KML']";
    private static String NO1Btn = "//a[text()='N01']";
    private static String No1Folderfield = "//input[@id='txtFilename']";
    private static String downnloadBtn = "//button[@id='ExportFile']";
    private static String SHPbtn = "//a[text()='SHP']";
    @FindBy(xpath = "//a[@id='lnkExportedTreatment']")
    WebElementFacade exportedPTAtab;
    private static String deleteBtn = "//button[@id='btnDeletePTA']";
    private static String editFilterbtn = "//button[@id='btneditFilters']";
    LoginPage page;
    double initialvehicleValue;
    double sprayFootvalue;
    double finalVehicleValue;


    public void mapTab() throws InterruptedException {

        waitABit(pageloadWait);
        withTimeoutOf(360, TimeUnit.SECONDS).waitFor(getDriver().findElement(By.xpath(mapTab))).waitUntilVisible();
        withTimeoutOf(360, TimeUnit.SECONDS).waitFor(getDriver().findElement(By.xpath(mapTab))).waitUntilClickable().click();
        withTimeoutOf(360, TimeUnit.SECONDS).waitForAbsenceOf(loadingSquares);
        withTimeoutOf(360, TimeUnit.SECONDS).waitForAbsenceOf(overlay);
        withTimeoutOf(360, TimeUnit.SECONDS).waitForPresenceOf(By.xpath(zoomInbtn));
        waitABit(elementloadWait);

    }

    public void layerListBtn() {

        waitABit(elementloadWait);
        withTimeoutOf(120, TimeUnit.SECONDS).waitForPresenceOf(By.xpath(layerListbtn));
        withTimeoutOf(35, TimeUnit.SECONDS).waitFor(getDriver().findElement(By.xpath(layerListbtn))).waitUntilClickable().click();
        waitABit(elementloadWait);
        withTimeoutOf(120, TimeUnit.SECONDS).waitForPresenceOf(By.xpath(operationalLayerbtn));
    }

    public void operationalLayetbtn() {

        waitABit(elementloadWait);
        withTimeoutOf(35, TimeUnit.SECONDS).waitFor(getDriver().findElement(By.xpath(operationalLayerbtn))).waitUntilClickable().click();
    }

    public void turnAlllayerOn() {

        waitABit(elementloadWait);
        withTimeoutOf(35, TimeUnit.SECONDS).waitFor(getDriver().findElement(By.xpath(turnAlllayerOncheckbox))).waitUntilClickable().click();
    }

    public void closeLayerPopupbox() {
        waitABit(pageloadWait);
        withTimeoutOf(35, TimeUnit.SECONDS).waitFor(getDriver().findElement(By.xpath(closeLayerPopupbox))).waitUntilClickable().click();
    }

    public void editBtn() {

        waitABit(elementloadWait);
        withTimeoutOf(35, TimeUnit.SECONDS).waitFor(getDriver().findElement(By.xpath(editbtn))).waitUntilClickable().click();
        withTimeoutOf(35, TimeUnit.SECONDS).waitFor(getDriver().findElement(By.xpath(editPopupBox))).waitUntilVisible();
    }

    public void searchIneditBox(String template) {

        waitABit(elementloadWait);
        withTimeoutOf(360, TimeUnit.SECONDS).waitFor(getDriver().findElement(By.xpath(searchField))).sendKeys(template);
    }

    public void proposedTemplate() {

        waitABit(pageloadWait);
        withTimeoutOf(35, TimeUnit.SECONDS).waitFor(getDriver().findElement(By.xpath(proposedTemplate))).waitUntilClickable().click();
        waitABit(elementloadWait);
        Actions action = new Actions(getDriver());
        action.moveByOffset(200, 100).perform();
        action.click();


    }

    public void polygon() {

        waitABit(elementloadWait);
//        polygon code


    }

    public void drawOptiondialogBox(String message) {
        if (drawManuallypopupBox.isVisible()) {
            waitABit(elementloadWait);
            String text = drawManuallypopupBox.getText();
            Assert.assertEquals(text, message);
            waitABit(elementloadWait);
            withTimeoutOf(35, TimeUnit.SECONDS).waitFor(getDriver().findElement(By.xpath(drawOption))).waitUntilClickable().click();

        }
    }

    public void navigateTodashboard() {

        waitABit(elementloadWait);
        withTimeoutOf(35, TimeUnit.SECONDS).waitFor(getDriver().findElement(By.xpath(navigateTodashboard))).waitUntilClickable().click();
    }

    public void proposedTreatmenttab() {

        waitABit(pageloadWait);
        withTimeoutOf(360, TimeUnit.SECONDS).waitFor(proposedTreatmenttab).waitUntilEnabled();
        withTimeoutOf(360, TimeUnit.SECONDS).waitFor(proposedTreatmenttab).waitUntilClickable().click();
    }

    public void searchProposedtreatmentEntry(String entry) {

        waitFor(pageloadWait);
        withTimeoutOf(360, TimeUnit.SECONDS).waitFor(productTreatmentSearchfield).clear();
        withTimeoutOf(360, TimeUnit.SECONDS).waitFor(productTreatmentSearchfield).sendKeys(entry);

    }

    public void setScalevalue() {
        waitABit(elementloadWait);
        int value = this.getScalevalue();
//        String btnXpath = value < 2 ? zoomOutbtn : zoomInbtnMap;
        int tried = 0;
        waitABit(pageloadWait);
        while ((value >= 2) && (tried < 20)) {
//              getDriver().findElement(By.xpath(zoomInbtnMap)).click();

            Actions action = new Actions(getDriver());
            action.moveByOffset(200, 100).perform();
            action.click();
            waitABit(elementloadWait);
            getDriver().findElement(By.tagName("html")).sendKeys(Keys.chord(Keys.CONTROL, Keys.ADD));
            waitABit(elementloadWait);

//            System.out.println("About to zoom in");
//            for (int i = 0; i < 3; i++) {
//                robot.keyPress(KeyEvent.VK_CONTROL);
//                robot.keyPress(KeyEvent.VK_ADD);
//                robot.keyRelease(KeyEvent.VK_ADD);
//                robot.keyRelease(KeyEvent.VK_CONTROL);


            value = this.getScalevalue();
            tried++;
        }
    }


    public int getScalevalue() {
        waitABit(elementloadWait);
        String text = getDriver().findElement(By.xpath(scaleValue)).getText().replaceAll("[^0-9]", "");
        System.out.println(text);
        return Integer.parseInt(text);
    }

    public void newProposedtreatmentEntry(String name, String method, String priority, String comment) throws InterruptedException {
        Thread.sleep(5000);
        withTimeoutOf(35, TimeUnit.SECONDS).waitFor(getDriver().findElement(By.xpath(nameField))).waitUntilVisible();
        withTimeoutOf(35, TimeUnit.SECONDS).waitFor(getDriver().findElement(By.xpath(nameField))).sendKeys(name);
        waitABit(elementloadWait);
        withTimeoutOf(35, TimeUnit.SECONDS).waitFor(getDriver().findElement(By.xpath("(//input[@value=\"▼ \"])[1]"))).waitUntilClickable().click();
        withTimeoutOf(35, TimeUnit.SECONDS).waitFor(getDriver().findElement(By.xpath("//div[contains(@class,'dijitReset dijitMenuItem') and text()='" + method + "']"))).waitUntilClickable().click();
        waitABit(elementloadWait);
        withTimeoutOf(35, TimeUnit.SECONDS).waitFor(getDriver().findElement(By.xpath("(//input[@value=\"▼ \"])[2]"))).waitUntilClickable().click();
        withTimeoutOf(35, TimeUnit.SECONDS).waitFor(getDriver().findElement(By.xpath("//div[contains(@class,'dijitReset dijitMenuItem') and text()='" + priority + "']"))).waitUntilClickable().click();
        dueDate();
        withTimeoutOf(35, TimeUnit.SECONDS).waitFor(getDriver().findElement(By.xpath(commentField))).sendKeys(comment);
        withTimeoutOf(35, TimeUnit.SECONDS).waitFor(getDriver().findElement(By.xpath(saveBtn))).waitUntilClickable().click();

    }

    private void dueDate() {


        withTimeoutOf(60, TimeUnit.SECONDS).waitFor(getDriver().findElement(By.xpath("(//input[@value=\"▼ \"])[3]"))).waitUntilClickable().click();
        withTimeoutOf(60, TimeUnit.SECONDS).waitFor(getDriver().findElement(By.xpath(year))).waitUntilClickable().click();
        withTimeoutOf(60, TimeUnit.SECONDS).waitFor(getDriver().findElement(By.xpath("//span[contains(@class,'dijitReset dijitInline dijitArrowButtonInner')]"))).waitUntilClickable().click();
        withTimeoutOf(60, TimeUnit.SECONDS).waitFor(getDriver().findElement(By.xpath(month))).waitUntilClickable().click();
        withTimeoutOf(60, TimeUnit.SECONDS).waitFor(getDriver().findElement(By.xpath(date))).waitUntilClickable().click();

    }


    public void closeProposedtreatmentPopupbox() {

        waitABit(elementloadWait);
        withTimeoutOf(60, TimeUnit.SECONDS).waitFor(getDriver().findElement(By.xpath(closeProposedtreatmentPopupbox))).waitUntilClickable().click();
    }

    public void searchedNewentryResult(String entry) {

        waitABit(elementloadWait);
        withTimeoutOf(60, TimeUnit.SECONDS).waitFor(getDriver().findElement(By.xpath(searchedNewentryResult))).waitUntilClickable().click();
        waitABit(elementloadWait);
        String proposedTreatmententry = withTimeoutOf(60, TimeUnit.SECONDS).waitFor(getDriver().findElement(By.xpath(searchedNewentryResult))).getText();
        System.out.println(proposedTreatmententry);
        Assert.assertEquals(proposedTreatmententry, entry);
    }

    public void getValuefromTable(String dueDate, String method, String priority, String name) {
        waitABit(elementloadWait);
        String showedDuedate = getDriver().findElement(By.xpath("//*/table[@id='tblProposedTreatment']/tbody/tr[1]/td[1]")).getText();
        Assert.assertEquals(showedDuedate, dueDate);
        String showedMethod = getDriver().findElement(By.xpath("//*/table[@id='tblProposedTreatment']/tbody/tr[1]/td[2]")).getText();
        Assert.assertEquals(showedMethod, method);
        String showedPriority = getDriver().findElement(By.xpath("//*/table[@id='tblProposedTreatment']/tbody/tr[1]/td[3]")).getText();
        Assert.assertEquals(showedPriority, priority);
        String showedName = getDriver().findElement(By.xpath("//*/table[@id='tblProposedTreatment']/tbody/tr[1]/td[4]")).getText();
        Assert.assertEquals(showedName, name);
    }

    public void fieldTech(String fieldTech) {

        waitABit(elementloadWait);
        withTimeoutOf(35, TimeUnit.SECONDS).waitFor(getDriver().findElement(By.xpath("//*/select[@id='selFieldTech']/option[text()='" + fieldTech + "']"))).waitUntilClickable().click();

    }

    public void vehicleField(String vehicle) {

        waitABit(elementloadWait);
        withTimeoutOf(35, TimeUnit.SECONDS).waitFor(getDriver().findElement(By.xpath("//*/select[@id='selVehicle']/option[text()='" + vehicle + "']"))).waitUntilVisible();
        withTimeoutOf(35, TimeUnit.SECONDS).waitFor(getDriver().findElement(By.xpath("//*/select[@id='selVehicle']/option[text()='" + vehicle + "']"))).waitUntilClickable().click();

    }

    public void setProductsField(String product) {

        waitABit(elementloadWait);
        withTimeoutOf(35, TimeUnit.SECONDS).waitFor(getDriver().findElement(By.xpath("//*/select[@id='selProducts']/option[text()='" + product + "']"))).waitUntilVisible();
        withTimeoutOf(35, TimeUnit.SECONDS).waitFor(getDriver().findElement(By.xpath("//*/select[@id='selProducts']/option[text()='" + product + "']"))).waitUntilClickable().click();


    }

    public void sprayerField(String sprayer) {


        waitABit(elementloadWait);
        withTimeoutOf(35, TimeUnit.SECONDS).waitFor(getDriver().findElement(By.xpath("//*/select[@id='selSprayer']/option[text()='" + sprayer + "']"))).waitUntilVisible();
        withTimeoutOf(35, TimeUnit.SECONDS).waitFor(getDriver().findElement(By.xpath("//*/select[@id='selSprayer']/option[text()='" + sprayer + "']"))).waitUntilClickable().click();


    }


    public void totalFoghoursField(String totalfoghours) {

        waitABit(elementloadWait);
        withTimeoutOf(35, TimeUnit.SECONDS).waitFor(getDriver().findElement(By.xpath(totalfoghoursField))).clear();
        withTimeoutOf(35, TimeUnit.SECONDS).waitFor(getDriver().findElement(By.xpath(totalfoghoursField))).sendKeys(totalfoghours);

    }

    public void fieldTechfield(String flowrate) {

        waitABit(elementloadWait);
        withTimeoutOf(35, TimeUnit.SECONDS).waitFor(getDriver().findElement(By.xpath(txtFlowrateField))).clear();
        withTimeoutOf(35, TimeUnit.SECONDS).waitFor(getDriver().findElement(By.xpath(txtFlowrateField))).sendKeys(flowrate);

    }

    public void startDate() throws InterruptedException {

        waitABit(elementloadWait);
        withTimeoutOf(35, TimeUnit.SECONDS).waitFor(getDriver().findElement(By.xpath(startDatefield))).waitUntilVisible();
        withTimeoutOf(35, TimeUnit.SECONDS).waitFor(getDriver().findElement(By.xpath(startDatefield))).waitUntilClickable().click();

    }

    public void endDate() {

        waitABit(elementloadWait);
        withTimeoutOf(35, TimeUnit.SECONDS).waitFor(getDriver().findElement(By.xpath(endDatefield))).waitUntilVisible();
        withTimeoutOf(35, TimeUnit.SECONDS).waitFor(getDriver().findElement(By.xpath(endDatefield))).waitUntilClickable().click();

    }

    public void equipmentField(String equipment) {

        waitABit(elementloadWait);
        withTimeoutOf(35, TimeUnit.SECONDS).waitFor(getDriver().findElement(By.xpath("//*/select[@id='selEquipment']/option[text()='" + equipment + "']"))).waitUntilVisible();
        withTimeoutOf(35, TimeUnit.SECONDS).waitFor(getDriver().findElement(By.xpath("//*/select[@id='selEquipment']/option[text()='" + equipment + "']"))).waitUntilClickable().click();


    }

    public void regularTreatmentTab() {

        waitABit(elementloadWait);
        withTimeoutOf(35, TimeUnit.SECONDS).waitFor(getDriver().findElement(By.xpath(regularTreatmentTab))).waitUntilClickable().click();

    }

    public void saveTreatmentform() {
        waitABit(elementloadWait);
        withTimeoutOf(35, TimeUnit.SECONDS).waitFor(getDriver().findElement(By.xpath(saveTreatmentform))).waitUntilClickable().click();


    }

    public void firstEntryclick() {

        waitABit(elementloadWait);
        withTimeoutOf(35, TimeUnit.SECONDS).waitFor(getDriver().findElement(By.xpath("//*/table[@id='tblProposedTreatment']/tbody/tr[1]"))).waitUntilClickable().click();

    }

    public void enterTreatmentbtn() {

        waitABit(elementloadWait);
        withTimeoutOf(35, TimeUnit.SECONDS).waitFor(getDriver().findElement(By.xpath(enterTreatmentbtn))).waitUntilClickable().click();
        waitABit(2000);
        for (int i = 1; i <= 5; i++) {
            if (dataLoadingmessage.isVisible()) {
                waitABit(pageloadWait);
                withTimeoutOf(35, TimeUnit.SECONDS).waitFor(getDriver().findElement(By.xpath(enterTreatmentbtn))).waitUntilClickable().click();
            }
        }

        waitABit(elementloadWait);
    }

    public void quantityField(String quantity) {
        waitABit(elementloadWait);
        withTimeoutOf(35, TimeUnit.SECONDS).waitFor(getDriver().findElement(By.xpath(quantityField))).sendKeys(quantity);

    }

    public void productInventorytab() {
        waitABit(elementloadWait);
        withTimeoutOf(35, TimeUnit.SECONDS).waitFor(getDriver().findElement(By.xpath(productInventorytab))).waitUntilClickable().click();
        waitABit(pageloadWait);
    }

    public void productInventoryvehicleValue(String vehiclevalue) throws InterruptedException {

        waitABit(pageloadWait);
        withTimeoutOf(360, TimeUnit.SECONDS).waitFor(vehicle107).waitUntilVisible();
        withTimeoutOf(360, TimeUnit.SECONDS).waitFor(getDriver().findElement(By.xpath("//*/table[@id='tblInventory']/tbody/tr/td[text()='" + vehiclevalue + "']"))).waitUntilClickable().click();
        withTimeoutOf(360, TimeUnit.SECONDS).waitFor(productQuantity).waitUntilVisible();
        String Value = getDriver().findElement(By.xpath("(//table[@id='tblProducts']/tbody/tr/td[2])[1]")).getText().split(" ")[0];
        initialvehicleValue = Double.parseDouble(Value);
        System.out.println(initialvehicleValue);
    }

    public void totalSprayfoot() throws InterruptedException {

        waitABit(elementloadWait);
        Thread.sleep(5000);
        String Value = getDriver().findElement(By.xpath(totalSprayfootValue)).getText();
        sprayFootvalue = Double.parseDouble(Value);
        System.out.println(sprayFootvalue);

    }

    public void navigateBackfromProductInventorytab() {

        waitABit(elementloadWait);
        withTimeoutOf(35, TimeUnit.SECONDS).waitFor(getDriver().findElement(By.xpath(dashboardLinkonProductinventoryTab))).waitUntilClickable().click();


    }

    public void equatingValues(String fogHours, String vehiclevalue) throws InterruptedException {
        waitABit(pageloadWait);
        withTimeoutOf(360, TimeUnit.SECONDS).waitFor(getDriver().findElement(By.xpath("//*/table[@id='tblInventory']/tbody/tr/td[text()='" + vehiclevalue + "']"))).waitUntilClickable().click();
        String Value = withTimeoutOf(360, TimeUnit.SECONDS).waitFor(getDriver().findElement(By.xpath("(//table[@id='tblProducts']/tbody/tr/td[2])[1]"))).getText().split(" ")[0];
        finalVehicleValue = Double.parseDouble(Value);
        System.out.println(finalVehicleValue);
        Double Fhrs = Double.parseDouble(fogHours);
        double x = initialvehicleValue - (Fhrs * 10.5 * 5280 * 300) / 43550;
        System.out.println(x);
        Assert.assertEquals(finalVehicleValue, x, (Fhrs * 10.5 * 5280 * 300) / 43550);

    }

    public void equatingValuesForregularTreatment(String enteredQty, String vehiclevalue) throws InterruptedException {

        waitABit(pageloadWait);
        withTimeoutOf(360, TimeUnit.SECONDS).waitFor(getDriver().findElement(By.xpath("//*/table[@id='tblInventory']/tbody/tr/td[text()='" + vehiclevalue + "']"))).waitUntilClickable().click();
        waitABit(elementloadWait);
        String Value = withTimeoutOf(60, TimeUnit.SECONDS).waitFor(getDriver().findElement(By.xpath("(//table[@id='tblProducts']/tbody/tr/td[2])[1]"))).getText().split(" ")[0];
        finalVehicleValue = Double.parseDouble(Value);
        System.out.println(finalVehicleValue);
        Double QTY = Double.parseDouble(enteredQty);
        Double x = initialvehicleValue - QTY;
        System.out.println(x);
        Assert.assertEquals(finalVehicleValue, x, QTY);

    }

    public void actionBtn() {

        waitABit(elementloadWait);
        withTimeoutOf(35, TimeUnit.SECONDS).waitFor(getDriver().findElement(By.xpath(firstEntryactionBtn))).waitUntilClickable().click();

    }

    public void editName(String changedName) {

        waitABit(elementloadWait);
        withTimeoutOf(60, TimeUnit.SECONDS).waitFor(getDriver().findElement(By.xpath(editNamefield))).clear();
        withTimeoutOf(60, TimeUnit.SECONDS).waitFor(getDriver().findElement(By.xpath(editNamefield))).sendKeys(changedName);


    }

    public void editMethod(String changedMethod) {

        waitABit(elementloadWait);
        withTimeoutOf(35, TimeUnit.SECONDS).waitFor(getDriver().findElement(By.xpath("//select[@id='selMethod_Edit']/option[@value='" + changedMethod + "']"))).waitUntilClickable().click();


    }

    public void editPriority(String changedPriority) {

        waitABit(elementloadWait);
        withTimeoutOf(35, TimeUnit.SECONDS).waitFor(getDriver().findElement(By.xpath("//select[@id='selPriority_Edit']/option[@value='" + changedPriority + "']"))).waitUntilClickable().click();


    }

    public void saveChanges() {

        waitABit(elementloadWait);
        withTimeoutOf(35, TimeUnit.SECONDS).waitFor(getDriver().findElement(By.xpath(saveChangesBtn))).waitUntilClickable().click();
    }

    public void printDropdown() {

        waitABit(pageloadWait);
        withTimeoutOf(35, TimeUnit.SECONDS).waitFor(getDriver().findElement(By.xpath(printDropdown))).waitUntilClickable().click();

    }


    public void dropDownoptions() {

        withTimeoutOf(35, TimeUnit.SECONDS).waitFor(a3Landscape).waitUntilVisible();
        withTimeoutOf(35, TimeUnit.SECONDS).waitFor(a3Portrait).waitUntilVisible();
        withTimeoutOf(35, TimeUnit.SECONDS).waitFor(a4Landscape).waitUntilVisible();
        withTimeoutOf(35, TimeUnit.SECONDS).waitFor(a4Portrait).waitUntilVisible();
        withTimeoutOf(35, TimeUnit.SECONDS).waitFor(a3Landscape).waitUntilVisible();
        withTimeoutOf(35, TimeUnit.SECONDS).waitFor(LetterANSIAPortrait).waitUntilVisible();
        withTimeoutOf(35, TimeUnit.SECONDS).waitFor(letterANSIAlandscape).waitUntilVisible();
        withTimeoutOf(35, TimeUnit.SECONDS).waitFor(TabloidANSIBLandscape).waitUntilVisible();
        withTimeoutOf(35, TimeUnit.SECONDS).waitFor(MapOnly).waitUntilVisible();

    }

    public void selectPrintoption() {

        waitABit(elementloadWait);
        withTimeoutOf(35, TimeUnit.SECONDS).waitFor(printOutbtn).waitUntilClickable().click();
    }

    public void printBtn() throws InterruptedException {

        waitABit(elementloadWait);
        withTimeoutOf(35, TimeUnit.SECONDS).waitFor(getDriver().findElement(By.xpath(printBtn))).waitUntilClickable().click();
        waitABit(elementloadWait);
        withTimeoutOf(35, TimeUnit.SECONDS).waitFor(printingBtn).waitUntilClickable().click();
        Thread.sleep(8000);
        withTimeoutOf(35, TimeUnit.SECONDS).waitFor(printOutbtn).waitUntilVisible();
    }

    public void printFunctionality() throws InterruptedException {
        waitABit(elementloadWait);
        withTimeoutOf(35, TimeUnit.SECONDS).waitFor(printOutbtn).waitUntilClickable().click();
        waitABit(pageloadWait);
        page.windowSwitch();
    }

    public void selectAllFunctionality() {

        waitABit(elementloadWait);
        withTimeoutOf(35, TimeUnit.SECONDS).waitFor(getDriver().findElement(By.xpath(selectAllbtn))).waitUntilClickable().click();
        withTimeoutOf(35, TimeUnit.SECONDS).waitFor(removeSelection).waitUntilVisible();

    }

    public void exportWithkmlButtonFunctionality() throws IOException, InterruptedException {
        String browserName = LoadProperties.getWebdriverProperties("webdriver.driver");
        String downloadFilepath = "C:\\Demo code\\FieldSeeker_Automation_WEB\\src\\test\\resources\\ExportedFiles";

        if (browserName.equals("chrome")) {
            HashMap<String, Object> chromePrefs = new HashMap<String, Object>();
            chromePrefs.put("profile.default_content_settings.popups", 0);
            chromePrefs.put("download.default_directory", downloadFilepath);
            ChromeOptions options = new ChromeOptions();
            options.setExperimentalOption("prefs", chromePrefs);
            DesiredCapabilities cap = DesiredCapabilities.chrome();
            cap.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
            cap.setCapability(ChromeOptions.CAPABILITY, options);

            File dir = new File(downloadFilepath);
            File[] preDouwloadContents = dir.listFiles();
            System.out.println(preDouwloadContents);
            waitFor(pageloadWait);
            Thread.sleep(5000);
            waitFor(exportBtn).waitUntilClickable().withTimeoutOf(long_wait, TimeUnit.SECONDS).click();
            waitABit(elementloadWait);
            getDriver().findElement(By.xpath(KMLBtn)).click();
            waitABit(pageloadWait);
            File[] postDouwloadContents = dir.listFiles();
            Assert.assertEquals((postDouwloadContents.length - 1), preDouwloadContents.length);
            waitABit(elementloadWait);

        }
    }

    public void exportedPTAtab() throws InterruptedException {

        waitABit(elementloadWait);
        withTimeoutOf(360, TimeUnit.SECONDS).waitFor(exportedPTAtab).waitUntilClickable().click();
    }

    public void deleteBtn() {
        waitABit(elementloadWait);
        withTimeoutOf(360, TimeUnit.SECONDS).waitFor(getDriver().findElement(By.xpath(deleteBtn))).waitUntilClickable().click();
    }

    public void verifyAlert(String msg) {

        waitABit(elementloadWait);
        Alert alert = getDriver().switchTo().alert();
        String alertMessage = getDriver().switchTo().alert().getText();
        Assert.assertEquals(alertMessage, msg);
        waitABit(pageloadWait);
        alert.accept();
    }

    public void completeButton() {


        waitABit(elementloadWait);
        withTimeoutOf(35, TimeUnit.SECONDS).waitFor(getDriver().findElement(By.xpath(completeBtnPTAtab))).waitUntilClickable().click();

    }

    public void reviewCompletedTreatmenttab() {


        waitABit(elementloadWait);
        withTimeoutOf(35, TimeUnit.SECONDS).waitFor(getDriver().findElement(By.xpath(reviewCompletedTreatmenttab))).waitUntilClickable().click();

    }

    public void editFilterbtn() {

        waitABit(elementloadWait);
        withTimeoutOf(35, TimeUnit.SECONDS).waitFor(getDriver().findElement(By.xpath(editFilterbtn))).waitUntilClickable().click();

    }

    public void filterValues(String method, String priority, String zone) {
        waitABit(elementloadWait);
        withTimeoutOf(35, TimeUnit.SECONDS).waitFor(getDriver().findElement(By.xpath("//select[@id='ddl_Method']/option[text()='" + method + "']"))).waitUntilClickable().click();
        withTimeoutOf(35, TimeUnit.SECONDS).waitFor(getDriver().findElement(By.xpath("//select[@id='ddl_Priority']/option[text()='" + priority + "']"))).waitUntilClickable().click();
//        withTimeoutOf(35, TimeUnit.SECONDS).waitFor(getDriver().findElement(By.xpath("//select[@id='ddl_Zone']/option[text()='" + zone + "']"))).waitUntilClickable().click();


    }

    public void getRecords() {

        waitABit(elementloadWait);
        withTimeoutOf(35, TimeUnit.SECONDS).waitFor(getDriver().findElement(By.xpath(getRecords))).waitUntilClickable().click();
    }

    public void filteredRecordsdetailsVerifiication(String method, String priority, String zone) {
        waitABit(pageloadWait);
        int xpathCount = getDriver().findElements(By.xpath("//table[@id='tblProposedTreatment']/tbody/tr")).size();
        System.out.println(xpathCount);
        for (int i = 1; i <= xpathCount; i++) {
            waitABit(pageloadWait);
            String shownMethod = getDriver().findElement(By.xpath("//*/table[@id=\"tblProposedTreatment\"]/tbody/tr[" + i + "]/td[2]")).getText();
            Assert.assertEquals(shownMethod, method);
            String showedPriority = getDriver().findElement(By.xpath("//*/table[@id=\"tblProposedTreatment\"]/tbody/tr[" + i + "]/td[3]")).getText();
            Assert.assertEquals(showedPriority, priority);
//            String showedZone = getDriver().findElement(By.xpath("//*/table[@id=\"tblProposedTreatment\"]/tbody/tr[" + i + "]/td[5]")).getText();
//            Assert.assertEquals(showedZone, zone);
        }
    }

    public void searchMapfield(String mapArea) {
        waitABit(pageloadWait);
        withTimeoutOf(360, TimeUnit.SECONDS).waitFor(searchMapfield).waitUntilVisible();
        withTimeoutOf(360, TimeUnit.SECONDS).waitFor(searchMapfield).sendKeys(mapArea + " ");
        waitABit(5000);
        withTimeoutOf(360, TimeUnit.SECONDS).waitFor(getDriver().findElement(By.xpath(mapAreaclick))).waitUntilClickable().click();
        waitABit(elementloadWait);
        withTimeoutOf(360, TimeUnit.SECONDS).waitFor(getDriver().findElement(By.xpath("//span[@class='searchIcon esri-icon-search']"))).waitUntilClickable().click();

    }

    public void dateAscendingorder() {

        waitABit(elementloadWait);
        withTimeoutOf(35, TimeUnit.SECONDS).waitFor(getDriver().findElement(By.xpath(dateAscendingorder))).waitUntilClickable().click();

    }

    public void editPTAbtn() {

        waitABit(elementloadWait);
        withTimeoutOf(60, TimeUnit.SECONDS).waitFor(editPTAbtn).waitUntilClickable().click();
    }

    public void editptaProductField(String product) {

        waitABit(elementloadWait);
        withTimeoutOf(35, TimeUnit.SECONDS).waitFor(getDriver().findElement(By.xpath("//select[@id='selProductApprate']/option[text()='" + product + "']"))).waitUntilClickable().click();

    }

    public void editPtaApprateField(String apprate) {

        waitABit(elementloadWait);
        withTimeoutOf(35, TimeUnit.SECONDS).waitFor(enterApprateField).clear();
        withTimeoutOf(35, TimeUnit.SECONDS).waitFor(enterApprateField).sendKeys(apprate);

    }

    public void verifyProduct(String product) {

        waitABit(pageloadWait);
        Select dropdown = new Select(getDriver().findElement(By.xpath(ptaProductfield)));
        WebElement option = dropdown.getFirstSelectedOption();
        String text = option.getText();
        Assert.assertEquals(product, text);
    }

    public void verifyApprate(int apprate) {

        waitABit(elementloadWait);
        String text = getDriver().findElement(By.xpath(ptaApprateField)).getText();
        Assert.assertEquals(text, apprate);
    }

    public void updatePTA() {

        waitABit(elementloadWait);
        waitFor(updatePTAbtn).waitUntilClickable().withTimeoutOf(long_wait, TimeUnit.SECONDS).click();

    }

    public void exportWithNO1ButtonFunctionality() throws InterruptedException {

        waitABit(elementloadWait);
        withTimeoutOf(360, TimeUnit.SECONDS).waitFor(exportBtn).waitUntilClickable().click();
        withTimeoutOf(360, TimeUnit.SECONDS).waitFor(getDriver().findElement(By.xpath(NO1Btn))).waitUntilClickable().click();

    }

    public void enterZipfolderName(String foldername) {

        waitABit(elementloadWait);
        withTimeoutOf(360, TimeUnit.SECONDS).waitFor(getDriver().findElement(By.xpath(No1Folderfield))).sendKeys(foldername);

    }

    public void downloadBtn() {

        waitABit(elementloadWait);
        withTimeoutOf(360, TimeUnit.SECONDS).waitFor(getDriver().findElement(By.xpath(downnloadBtn))).waitUntilClickable().click();

    }

    public void exportwithSHPbtnFunctionality() {
        waitABit(elementloadWait);
        withTimeoutOf(360, TimeUnit.SECONDS).waitFor(exportBtn).waitUntilEnabled();
        withTimeoutOf(360, TimeUnit.SECONDS).waitFor(exportBtn).waitUntilClickable().click();
        withTimeoutOf(360, TimeUnit.SECONDS).waitFor(getDriver().findElement(By.xpath(SHPbtn))).waitUntilClickable().click();
    }
}



