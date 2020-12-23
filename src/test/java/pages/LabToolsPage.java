package pages;

import com.typesafe.config.Config;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utilities.ConfigLoader;

import java.security.cert.X509Certificate;
import java.util.concurrent.TimeUnit;


public class LabToolsPage extends PageObject {


    Config config = ConfigLoader.load();
    int pageloadWait = Integer.parseInt(config.getString("Page_Load_Time"));
    int elementloadWait = Integer.parseInt(config.getString("Element_Load_Time"));
    int long_wait = Integer.parseInt(config.getString("long_wait"));

    @FindBy(xpath = "(//div[@class='toolsBox'])[3]")
    private WebElement labtoolButton;
    @FindBy(xpath = "(//div[@class='form-actions center']/button)[1]")
    private WebElement newEntrybutton;
    @FindBy(xpath = "//button[@id='btn_closeEntry']")
    private WebElement processClose;
    @FindBy(xpath = "//h4[text()='Add Trap Data']")
    private WebElement newEntrypopup;
    @FindBy(xpath = "//td[text()='#10 AFB']/../td[1]")
    private WebElement area;
    @FindBy(xpath = "//button[@id='btnselecSiteOK']")
    private WebElement okButton;
    @FindBy(xpath = "(//a[@data-toggle='collapse'])[1]")
    private WebElement trapDatabox;
    @FindBy(xpath = "//*[@id='date-timepicker1']")
    private WebElement startDate;
    @FindBy(xpath = "//*[@id='date-timepicker2']")
    private WebElement endDate;
    @FindBy(xpath = "//select[@id='ddl_fieldtech']/option[text()='Brad Clark']")
    private WebElement fieldTech;
    @FindBy(xpath = "//select[@id='ddl_fieldtech']/option[text()='Chris McCabe']")
    private WebElement editFieldtech;
    @FindBy(xpath = "//select[@id='ddl_fieldtech']")
    private WebElement fieldTechclick;
    @FindBy(xpath = "/html/body/div[3]/ul/li[1]/div/div[1]/table/thead/tr[1]/th[2]")
    private WebElement yearHit1;
    @FindBy(xpath = "//button[@id='btnAddTrapdata']")
    private WebElement save;
    @FindBy(xpath = "/html/body/div[3]/ul/li[1]/div/div[2]/table/thead/tr/th[2]")
    private WebElement yearHit2;
    @FindBy(xpath = "/html/body/div[4]/ul/li[1]/div/div[1]/table/thead/tr[1]/th[2]")
    private WebElement endDateyearhit1;
    @FindBy(xpath = "/html/body/div[4]/ul/li[1]/div/div[2]/table/thead/tr/th[2]")
    private WebElement endDateyeaarhit2;
    @FindBy(xpath = "(//span[text()='2020'])[1]")
    private WebElement year;
    @FindBy(xpath = "(//span[text()='Dec'])[1]")
    private WebElement month;
    @FindBy(xpath = "(//td[text()='7'])[1]")
    private WebElement selectstartDate;
    @FindBy(xpath = "(//span[text()='2021'])[2]")
    private WebElement endYear;
    @FindBy(xpath = "(//span[text()='Dec'])[2]")
    private WebElement endMonth;
    @FindBy(xpath = "/html/body/div[4]/ul/li[1]/div/div[1]/table/tbody/tr[2]/td[3]")
    private WebElement selectendDate;
    @FindBy(xpath = "(//span[@class='fa fa-clock-o'])[1]")
    private WebElement clock;
    @FindBy(xpath = "(//span[@data-action='showHours'])[1]")
    private WebElement hours;
    @FindBy(xpath = "(//span[@data-action='showHours'])[2]")
    private WebElement endHours;
    @FindBy(xpath = "(//td[text()='06'])[1]")
    private WebElement selectHours;
    @FindBy(xpath = "(//td[text()='06'])[2]")
    private WebElement selectEndhours;
    @FindBy(xpath = "(//span[@data-action='showMinutes'])[1]")
    private WebElement minutes;
    @FindBy(xpath = "(//span[@data-action='showMinutes'])[2]")
    private WebElement endDateminutes;
    @FindBy(xpath = "(//td[@class='minute'][text()='25'])[1]")
    private WebElement selectMinutes;
    @FindBy(xpath = "(//td[@class='minute'][text()='25'])[2]")
    private WebElement selectendDateMinutes;
    @FindBy(xpath = "//label[text()='Site Condition : ']")
    private WebElement switchFocus;
    @FindBy(xpath = "//div[text()='Data saved successfully']")
    private WebElement successMessage;
    @FindBy(xpath = "//i[@processed='closed']")
    private WebElementFacade processed;
    private static final String trapData = "(//a[@class='accordion-toggle collapsed'])[2]";
    private static final String trapType = "//*/select[@id='ddl_traptype']//option[text()='BG Counter']";
    private static final String editTraptype = "//*/select[@id='ddl_traptype']//option[text()='CDC Light Trap CO2']";
    private static final String selectEditedtraptype = "//*/select[@id='ddl_traptypeFilter']/option[text()='CDC Light Trap CO2']";
    private static final String activityType = "//*/select[@id='ddl_activitytype']//option[text()='Retrieve']";
    private static final String search = "//button[@id='btn_Search']";
    @FindBy(xpath = "//*/select[@id='ddl_MapArea']/option[text()='FNWS']")
    private WebElement selectMaparea;
    @FindBy(xpath = "//*/select[@id='ddl_traptypeFilter']/option[text()='BG Counter']")
    private WebElement selectTraptype;
    @FindBy(xpath = "(//th[@class='datepicker-switch'])[1]")
    private WebElement datepicker;
    @FindBy(xpath = "(//i[@class='fa fa-calendar'])[1]")
    private WebElement calendar1;
    @FindBy(xpath = "(//i[@class='fa fa-calendar'])[2]")
    private WebElement calendar2;
    @FindBy(xpath = "/html/body/div[7]/div[2]/table/thead/tr/th[2]")
    private WebElement filterStartYearhit1;
    @FindBy(xpath = "/html/body/div[7]/div[3]/table/tbody/tr/td/span[2]")
    private WebElement filterStartyearhit2;
    @FindBy(xpath = "/html/body/div[7]/div[3]/table/tbody/tr/td/span[3]")
    private WebElement filterendyearhit2;
    @FindBy(xpath = "/html/body/div[7]/div[2]/table/tbody/tr/td/span[12]")
    private WebElement filterStratmonth;
    @FindBy(xpath = "/html/body/div[7]/div[1]/table/tbody/tr[2]/td[2]")
    private WebElement filterStartdate;
    @FindBy(xpath = "/html/body/div[7]/div[1]/table/tbody/tr[2]/td[3]")
    private WebElement filterEnddate;
    @FindBy(xpath = "(//input[@class='amtCheckbox'])[1]")
    private WebElement selectFirstentry;
    @FindBy(xpath = " //input[@id='amtSelectAll']")
    private WebElement selectAllcheckbox;
    @FindBy(xpath = "//select[@id='ddl_ftechnician_closeentry']/option[@value='Chris McCabe']")
    private WebElement closeEntrytechnician;
    @FindBy(xpath = "//button[@id='btn_deleteEntry']")
    private WebElement delete;
    @FindBy(xpath = "//button[@id='btn_NotifyAmt']")
    private WebElement yes1;
    @FindBy(xpath = "//button[@id='btn_DeleteAMT']")
    private WebElement yes2;
    @FindBy(xpath = "//button[@id='btn_closeEntry']")
    private WebElement closeEntrybutton;
    @FindBy(xpath = "//*/div[@id='LabToolsTable_wrapper']/table/tbody/tr[1]/td[7]")
    private WebElement technicianName;
    @FindBy(xpath = "//button[@id='btn_SavecloseEntry']")
    private WebElement closeOkay;
    @FindBy(xpath = " //button[@id='btn_SavePool_Edit']")
    private WebElement editSave;
    @FindBy(xpath = "//button[@class='btn btn-sm btn-danger pull-right']")
    private WebElement closeEditpool;
    @FindBy(xpath = "//input[@id='chk_isprossedcheck']")
    private WebElement closedEntrycheckbox;
    @FindBy(xpath = "//button[@id='btn_reopenEntry']")
    private WebElement reopenButton;
    @FindBy(xpath = "//button[@id='btn_ResetSearch']")
    private WebElement resetSearchbutton;
    @FindBy(xpath = "(//select[@id='ddl_MapArea']/option[text()='---Select---'])[1]")
    private WebElement resetMapvalue;
    @FindBy(xpath = "(//select[@id='ddl_traptypeFilter']/option[text()='---Select---'])[1]")
    private WebElement resetTrapvalue;
    @FindBy(xpath = "//button[@id='btn_editpool']")
    private WebElement editPool;
    @FindBy(xpath = "(//table[@id='EditPoolsGD']/tbody/tr/td[1])[1]")
    private WebElement editPoolfirstRow;
    @FindBy(xpath = "//button[@id='btn_OpenEditPool']")
    private WebElement openEditpool;
    @FindBy(xpath = "//table[@id='tbl_AddPool_edit']/tbody//input[@class='form-control numericOnly']")
    private WebElement editedValue;
    private static String reopendisable = "//button[@id='btn_reopenEntry']";
    @FindBy(xpath = "((//*//div[@class='dataTables_wrapper no-footer']/table/tbody/tr)[1])/td[2]")
    private WebElement tap;
    @FindBy(xpath = "//table[@id='largeDataTableLarva']/tbody/tr[1]")
    private WebElement tapOnLarvalsamplesFirstentry;

    @FindBy(xpath = "(//div[@class='dataTables_scrollBody']/table/tbody/tr[1])[1]/td[2]/input")
    WebElement males;
    @FindBy(xpath = "(//div[@class='dataTables_scrollBody']/table/tbody/tr[1])[1]/td[3]/input")
    private WebElement females;
    @FindBy(xpath = "(//button[@class='AddTrapActivity btn btn-xs btn-submit'])[1]")
    private WebElement addPool;
    @FindBy(xpath = "//button[@id='btn_Createpool']")
    private WebElement createPoolButton;
    @FindBy(xpath = "//*//select[@id='ddl_poolLab']/option[text()='Internal Lab']")
    private WebElement laboratory;
    @FindBy(xpath = "//input[@id='txt_labdatesent']")
    private WebElement poolCalendar;
    @FindBy(xpath = "(//th[@class='datepicker-switch'])[1]")
    private WebElement poolyear1;
    @FindBy(xpath = "/html/body/div[8]/div[2]/table/thead/tr/th[2]")
    private WebElement poolyear2;
    @FindBy(xpath = "/html/body/div[8]/div[3]/table/tbody/tr/td/span[2]")
    private WebElement poolFinalyear;
    @FindBy(xpath = "/html/body/div[8]/div[2]/table/tbody/tr/td/span[12]")
    private WebElement poolMonth;
    @FindBy(xpath = "/html/body/div[8]/div[1]/table/tbody/tr[2]/td[2]")
    private WebElement poolDate;
    @FindBy(xpath = "//button[@id='btn_SavePool']")
    private WebElement savePool;
    @FindBy(xpath = "//div[text()='successfully deleted']")
    private WebElement successfulDeletedmessage;
    @FindBy(xpath = "(//button[text()='AM'])[1]")
    private WebElementFacade amStartdate;
    @FindBy(xpath = "(//button[text()='PM'])[1]")
    private WebElement pmStartdate;
    @FindBy(xpath = "(//button[text()='AM'])[2]")
    private WebElementFacade amEnddate;
    @FindBy(xpath = "(//button[text()='PM'])[2]")
    WebElement pmEnddate;
    //    private static final String loader = "//div[@id='loading-img']";
    @FindBy(xpath = "//div[@id='loading-img']")
    private WebElementFacade loader;
    @FindBy(xpath = "//button[text()='Update']")
    WebElement updatePoolvalue;


    public void labTool() {

        waitForAbsenceOf("//div[@id='loading-img']").withTimeoutOf(60, TimeUnit.SECONDS);
        waitABit(pageloadWait);
        waitFor(labtoolButton).withTimeoutOf(long_wait, TimeUnit.SECONDS).waitUntilClickable().click();
    }

    public void newEntry() {

        waitFor(pageloadWait);
        waitForAbsenceOf("//div[@id='loading-img']").withTimeoutOf(60, TimeUnit.SECONDS);
        waitFor(newEntrybutton).withTimeoutOf(long_wait, TimeUnit.SECONDS).waitUntilClickable().click();
    }


    public void area() {
        waitABit(elementloadWait);
        waitFor(getDriver().findElement(By.xpath("   (//th[text()='Area'])[1]"))).withTimeoutOf(long_wait, TimeUnit.SECONDS).waitUntilClickable().click();
        waitFor(area).withTimeoutOf(long_wait, TimeUnit.SECONDS).waitUntilClickable().click();
        waitFor(okButton).withTimeoutOf(long_wait, TimeUnit.SECONDS).waitUntilClickable().click();

    }

    public void trapDatabox() {

        waitFor(trapDatabox).withTimeoutOf(long_wait, TimeUnit.SECONDS).isDisplayed();
    }

    public void startDate() {
        waitFor(pageloadWait);
        waitFor(startDate).withTimeoutOf(long_wait, TimeUnit.SECONDS).waitUntilClickable().click();
        waitABit(elementloadWait);
        waitFor(yearHit1).withTimeoutOf(long_wait, TimeUnit.SECONDS).waitUntilClickable().click();
        waitABit(elementloadWait);
        waitFor(yearHit2).withTimeoutOf(long_wait, TimeUnit.SECONDS).waitUntilClickable().click();
        waitABit(elementloadWait);
        waitFor(year).withTimeoutOf(long_wait, TimeUnit.SECONDS).waitUntilClickable().click();
        waitABit(pageloadWait);
        waitFor(month).withTimeoutOf(long_wait, TimeUnit.SECONDS).waitUntilClickable().click();
        waitABit(elementloadWait);
        waitFor(selectstartDate).withTimeoutOf(long_wait, TimeUnit.SECONDS).waitUntilClickable().click();
        waitABit(elementloadWait);
    }

    public void endDate() {

        waitABit(elementloadWait);
        waitFor(endDate).withTimeoutOf(long_wait, TimeUnit.SECONDS).waitUntilClickable().click();
        waitABit(elementloadWait);
        waitFor(endDateyearhit1).withTimeoutOf(long_wait, TimeUnit.SECONDS).waitUntilClickable().click();
        waitABit(elementloadWait);
        waitFor(endDateyeaarhit2).withTimeoutOf(long_wait, TimeUnit.SECONDS).waitUntilClickable().click();
        waitABit(pageloadWait);
        waitFor(endYear).withTimeoutOf(long_wait, TimeUnit.SECONDS).waitUntilClickable().click();
        waitABit(elementloadWait);
        waitFor(endMonth).withTimeoutOf(long_wait, TimeUnit.SECONDS).waitUntilClickable().click();
        waitABit(elementloadWait);
        waitFor(selectendDate).withTimeoutOf(long_wait, TimeUnit.SECONDS).waitUntilClickable().click();
        waitABit(elementloadWait);
    }

    public void fieldTech() {

        waitABit(elementloadWait);
        waitFor(fieldTechclick).withTimeoutOf(long_wait, TimeUnit.SECONDS).click();
        waitFor(fieldTech).withTimeoutOf(long_wait, TimeUnit.SECONDS).waitUntilClickable().click();

    }

    public void save() {

        waitABit(pageloadWait);
        withTimeoutOf(35, TimeUnit.SECONDS).waitFor(save).waitUntilClickable().click();
        waitForAbsenceOf("//div[@id='loading-img']").withTimeoutOf(60, TimeUnit.SECONDS);
    }

    public void timeForstartDate() {
        waitABit(elementloadWait);
        waitFor(clock).withTimeoutOf(long_wait, TimeUnit.SECONDS).waitUntilVisible();
        waitFor(clock).withTimeoutOf(long_wait, TimeUnit.SECONDS).waitUntilClickable().click();
        waitABit(elementloadWait);
        waitFor(hours).withTimeoutOf(long_wait, TimeUnit.SECONDS).waitUntilClickable().click();
        waitABit(elementloadWait);
        waitFor(selectHours).withTimeoutOf(long_wait, TimeUnit.SECONDS).waitUntilClickable().click();
        waitABit(elementloadWait);
        waitFor(minutes).withTimeoutOf(long_wait, TimeUnit.SECONDS).waitUntilClickable().click();
        waitABit(elementloadWait);
        waitFor(selectMinutes).withTimeoutOf(long_wait, TimeUnit.SECONDS).waitUntilClickable().click();
        waitABit(elementloadWait);
        if ((amStartdate).isVisible()) {

            waitFor(amStartdate).waitUntilClickable().click();
            waitFor(pmStartdate).isDisplayed();
            waitFor(switchFocus).withTimeoutOf(long_wait, TimeUnit.SECONDS).waitUntilClickable().click();
        } else {
            waitFor(pmStartdate).withTimeoutOf(long_wait, TimeUnit.SECONDS).isVisible();
            waitFor(switchFocus).withTimeoutOf(long_wait, TimeUnit.SECONDS).waitUntilClickable().click();

        }
    }

    public void timeForendDate() {

        waitABit(elementloadWait);
        waitFor(clock).withTimeoutOf(long_wait, TimeUnit.SECONDS).waitUntilClickable().click();
        waitABit(elementloadWait);
        waitFor(endHours).withTimeoutOf(long_wait, TimeUnit.SECONDS).waitUntilClickable().click();
        waitABit(elementloadWait);
        waitFor(selectEndhours).withTimeoutOf(long_wait, TimeUnit.SECONDS).waitUntilClickable().click();
        waitABit(elementloadWait);
        waitFor(endDateminutes).withTimeoutOf(long_wait, TimeUnit.SECONDS).waitUntilClickable().click();
        waitABit(elementloadWait);
        waitFor(selectendDateMinutes).withTimeoutOf(long_wait, TimeUnit.SECONDS).waitUntilClickable().click();
        waitABit(elementloadWait);

        if ((amEnddate).isVisible()) {
            waitFor(amEnddate).waitUntilClickable().click();
            waitFor(pmEnddate).isDisplayed();
            waitFor(switchFocus).withTimeoutOf(long_wait, TimeUnit.SECONDS).waitUntilClickable().click();
        } else {
            waitFor(pmEnddate).withTimeoutOf(long_wait, TimeUnit.SECONDS).isVisible();
            waitFor(switchFocus).withTimeoutOf(long_wait, TimeUnit.SECONDS).waitUntilClickable().click();

        }

    }

    public void successMessage(String message) {
        waitABit(2000);
        if (loader.isVisible()) {
            withTimeoutOf(360, TimeUnit.SECONDS).waitForAbsenceOf("//div[@id='loading-img']");
        }
        withTimeoutOf(360, TimeUnit.SECONDS).waitFor(getDriver().findElement(By.xpath("//div[text()='" + message + "']"))).waitUntilVisible();
        String text = getDriver().findElement(By.xpath("//div[text()='" + message + "']")).getText();
        System.out.println(text);
        Assert.assertEquals(text, message);
        waitABit(pageloadWait);
    }

    public void trapDatadetails() {

        waitABit(elementloadWait);
        getDriver().findElement(By.xpath(trapData)).click();
    }

    public void trapType() {

        waitABit(elementloadWait);
        getDriver().findElement(By.xpath(trapType)).click();

    }

    public void activityType() {

        getDriver().findElement(By.xpath(activityType)).click();
        waitABit(elementloadWait);

    }

    public void search() {

        waitABit(elementloadWait);
        getDriver().findElement(By.xpath(search)).click();
        waitABit(pageloadWait);

    }

    public void mapArea() {

        waitABit(elementloadWait);
        waitFor(selectMaparea).withTimeoutOf(long_wait, TimeUnit.SECONDS).click();
    }

    public void selectTraptype() {

        waitABit(elementloadWait);
        waitFor(selectTraptype).withTimeoutOf(long_wait, TimeUnit.SECONDS).click();
    }

    public void filteredNewentries(String message) {
        waitABit(pageloadWait);
        int row = getDriver().findElements(By.xpath("(//table[@id='LabToolsTable']/tbody/tr[@role='row'])")).size();
        for (int i = 1; i <= row; i++) {
            String entry = getDriver().findElement(By.xpath("(//table[@id='LabToolsTable']/tbody/tr[@role='row'])[" + i + "]")).getText();
            System.out.println(entry);
            Assert.assertEquals(message, entry);
        }

    }

    public void filterStartdate() {

        waitABit(elementloadWait);
        waitFor(calendar1).withTimeoutOf(long_wait, TimeUnit.SECONDS).waitUntilClickable().click();
        waitABit(elementloadWait);
        waitFor(datepicker).withTimeoutOf(long_wait, TimeUnit.SECONDS).waitUntilClickable().click();
        waitABit(elementloadWait);
        waitFor(filterStartYearhit1).withTimeoutOf(long_wait, TimeUnit.SECONDS).waitUntilClickable().click();
        waitABit(elementloadWait);
        waitFor(filterStartyearhit2).withTimeoutOf(long_wait, TimeUnit.SECONDS).waitUntilClickable().click();
        waitABit(elementloadWait);
        waitFor(filterStratmonth).withTimeoutOf(long_wait, TimeUnit.SECONDS).waitUntilClickable().click();
        waitABit(elementloadWait);
        waitFor(filterStartdate).withTimeoutOf(long_wait, TimeUnit.SECONDS).waitUntilClickable().click();

    }

    public void filterEnddate() {
        waitABit(elementloadWait);
        waitFor(calendar2).withTimeoutOf(long_wait, TimeUnit.SECONDS).waitUntilClickable().click();
        waitABit(elementloadWait);
        waitFor(datepicker).withTimeoutOf(long_wait, TimeUnit.SECONDS).waitUntilClickable().click();
        waitABit(elementloadWait);
        waitFor(filterStartYearhit1).withTimeoutOf(long_wait, TimeUnit.SECONDS).waitUntilClickable().click();
        waitABit(elementloadWait);
        waitFor(filterendyearhit2).withTimeoutOf(long_wait, TimeUnit.SECONDS).waitUntilClickable().click();
        waitABit(elementloadWait);
        waitFor(filterStratmonth).withTimeoutOf(long_wait, TimeUnit.SECONDS).waitUntilClickable().click();
        waitABit(elementloadWait);
        waitFor(filterEnddate).withTimeoutOf(long_wait, TimeUnit.SECONDS).waitUntilClickable().click();

    }

    public void entry1() {
        waitABit(pageloadWait);
        getDriver().findElement(By.xpath("(//table[@id='LabToolsTable']/tbody/tr[@role='row'])[1]")).click();
    }

    public void editButton() {
        waitABit(pageloadWait);
        waitFor(getDriver().findElement(By.xpath("//button[@id='btn_editTrapData']"))).waitUntilClickable().withTimeoutOf(60, TimeUnit.SECONDS).click();
    }

    public void changeFieldType() {

        waitABit(elementloadWait);
        waitFor(fieldTechclick).withTimeoutOf(long_wait, TimeUnit.SECONDS).click();
        waitFor(editFieldtech).withTimeoutOf(long_wait, TimeUnit.SECONDS).click();


    }

    public void changeTraptype() {
        waitABit(elementloadWait);
        getDriver().findElement(By.xpath(trapData)).click();
        waitABit(elementloadWait);
        getDriver().findElement(By.xpath(editTraptype)).click();

    }

    public void editedTraptype() {
        waitABit(elementloadWait);
        getDriver().findElement(By.xpath(selectEditedtraptype)).click();

    }

    public void selectFirstentry() {

        waitABit(pageloadWait);
        waitFor(selectFirstentry).withTimeoutOf(long_wait, TimeUnit.SECONDS).click();


    }

    public void delete() {

        waitABit(elementloadWait);
        waitFor(delete).withTimeoutOf(long_wait, TimeUnit.SECONDS).waitUntilClickable().click();
        waitABit(elementloadWait);
        waitFor(yes1).withTimeoutOf(long_wait, TimeUnit.SECONDS).waitUntilClickable().click();
        waitABit(elementloadWait);
        waitFor(yes2).withTimeoutOf(long_wait, TimeUnit.SECONDS).waitUntilClickable().click();
        waitABit(elementloadWait);
//        waitForAbsenceOf(loader).withTimeoutOf(pageloadWait,TimeUnit.SECONDS);

    }

    public void deletedSuccessfully(String deletedMessage) {

        waitForAbsenceOf("//div[@id='loading-img']").withTimeoutOf(60, TimeUnit.SECONDS);
        waitFor(successfulDeletedmessage).withTimeoutOf(long_wait, TimeUnit.SECONDS).isVisible();
        waitABit(pageloadWait);
    }


    public void closeEntry()
    {
        waitABit(elementloadWait);
        waitFor(closeOkay).withTimeoutOf(long_wait, TimeUnit.SECONDS).waitUntilClickable().click();

    }


    public void selectValuestoCloseentries() {

        waitABit(elementloadWait);
        String entry = waitFor(technicianName).getText();
        System.out.println(entry);
        waitABit(elementloadWait);
        waitFor(closeEntrybutton).withTimeoutOf(long_wait, TimeUnit.SECONDS).waitUntilClickable().click();
        waitABit(pageloadWait);
        getDriver().findElement(By.xpath("//*/select[@id='ddl_ftechnician_closeentry']/option[text()='" + entry + "']")).click();


    }

    public void closedEntrycheckbox() {

        waitABit(elementloadWait);
        waitFor(closedEntrycheckbox).withTimeoutOf(long_wait, TimeUnit.SECONDS).waitUntilClickable().click();

    }

    public void showClosedentry(String message) {

        waitABit(8000);
        String text = getDriver().findElement(By.xpath("//*/div[@id='LabToolsTable_wrapper']/table/tbody/tr[1]")).getText();
        System.out.println(text);
//        Assert.assertEquals(message, text);
    }

    public void reopenEntryButton() throws InterruptedException {
        if ((processed).isVisible()) {
            waitABit(pageloadWait);
            waitFor(reopenButton).withTimeoutOf(long_wait, TimeUnit.SECONDS).waitUntilClickable().click();
            waitFor(elementloadWait);
            Thread.sleep(5000);


        } else {
            selectValuestoCloseentries();
            closeEntry();
            waitABit(pageloadWait);
            selectFirstentry();
            waitFor(reopenButton).withTimeoutOf(long_wait, TimeUnit.SECONDS).waitUntilClickable().click();
            Thread.sleep(5000);

        }
    }

    public void tapOnfirstEntry() {

        waitABit(pageloadWait);
        waitFor(tap).withTimeoutOf(long_wait, TimeUnit.SECONDS).waitUntilClickable().click();

    }

    public void createPool() throws InterruptedException {

        waitABit(elementloadWait);
        String text = getDriver().findElement(By.xpath("(//*//div[@class='dataTables_wrapper no-footer']/table/tbody/tr)[1]/td[7]")).getText();
        System.out.println(text);
        waitABit(elementloadWait);
        waitFor(addPool).waitUntilClickable().withTimeoutOf(long_wait, TimeUnit.SECONDS).click();
        waitFor(getDriver().findElement(By.xpath("//div[@id='loading-img']"))).withTimeoutOf(long_wait, TimeUnit.SECONDS).waitUntilNotVisible();
        Thread.sleep(6000);
        getJavascriptExecutorFacade().executeScript("arguments[0].scrollIntoView(true);", element(createPoolButton));
        waitFor(createPoolButton).waitUntilClickable().withTimeoutOf(long_wait, TimeUnit.SECONDS).click();
        waitABit(pageloadWait);
        waitFor(getDriver().findElement(By.xpath("//*[@id='CreatePoolModal']/div/div/div[1]/h4"))).withTimeoutOf(long_wait, TimeUnit.SECONDS).isPresent();
        waitFor(laboratory).waitUntilClickable().withTimeoutOf(long_wait, TimeUnit.SECONDS).click();
        waitABit(elementloadWait);
        getDriver().findElement(By.xpath("//*//select[@id='ddl_poolTechnician']/option[text()='" + text + "']")).click();
    }


    public void poolDate(String message) {

        waitFor(poolCalendar).withTimeoutOf(long_wait, TimeUnit.SECONDS).waitUntilClickable().click();
        waitFor(poolyear1).withTimeoutOf(long_wait, TimeUnit.SECONDS).waitUntilClickable().click();
        waitFor(poolyear2).withTimeoutOf(long_wait, TimeUnit.SECONDS).waitUntilClickable().click();
        waitFor(poolFinalyear).withTimeoutOf(long_wait, TimeUnit.SECONDS).waitUntilClickable().click();
        waitFor(poolMonth).withTimeoutOf(long_wait, TimeUnit.SECONDS).waitUntilClickable().click();
        waitFor(poolDate).withTimeoutOf(long_wait, TimeUnit.SECONDS).waitUntilClickable().click();
        waitFor(savePool).withTimeoutOf(long_wait, TimeUnit.SECONDS).waitUntilClickable().click();
        waitABit(1000);
        waitForAbsenceOf("//div[@id='loading-img']").withTimeoutOf(60, TimeUnit.SECONDS);
        waitFor(successMessage).waitUntilVisible().withTimeoutOf(long_wait, TimeUnit.SECONDS).waitUntilVisible();
        String entry = successMessage.getText();
        Assert.assertEquals(message, entry);


    }

    public void maleFemalevalue(String male, String female) {
        waitABit(elementloadWait);
        waitFor(males).waitUntilVisible().withTimeoutOf(long_wait, TimeUnit.SECONDS).clear();
        waitFor(males).waitUntilVisible().withTimeoutOf(long_wait, TimeUnit.SECONDS).sendKeys(male);
        waitFor(females).waitUntilVisible().withTimeoutOf(long_wait, TimeUnit.SECONDS).clear();
        waitFor(females).waitUntilVisible().withTimeoutOf(long_wait, TimeUnit.SECONDS).sendKeys(female);

    }

    public void verifyPopup() {

        waitABit(elementloadWait);
        waitFor(newEntrypopup).withTimeoutOf(long_wait, TimeUnit.SECONDS).isDisplayed();
    }

    public void reopenDisable() {

        waitABit(elementloadWait);
        if (!(reopenButton).isEnabled()) {
            System.out.println("reopen button disability is verified");
        } else {
            System.out.println("reopen button is not working properly");
        }


    }

    public void selectAll() {

        waitABit(elementloadWait);
        waitFor(selectAllcheckbox).withTimeoutOf(long_wait, TimeUnit.SECONDS).click();


    }

    public void closeEntrytechnician() {

        waitABit(elementloadWait);
        waitFor(closeEntrytechnician).withTimeoutOf(long_wait, TimeUnit.SECONDS).click();
        waitFor(closeOkay).withTimeoutOf(long_wait, TimeUnit.SECONDS).click();
    }

    public void processClose() {

        waitABit(elementloadWait);
        waitFor(processClose).withTimeoutOf(long_wait, TimeUnit.SECONDS).click();

    }

    public void processedReopenbutton() {

        waitABit(elementloadWait);
        waitFor(reopenButton).withTimeoutOf(long_wait, TimeUnit.SECONDS).click();
    }

    public void resetSearchbutton() {

        waitABit(elementloadWait);
        waitFor(resetSearchbutton).withTimeoutOf(long_wait, TimeUnit.SECONDS).click();


    }

    public void resetMapvalue() {
        waitABit(elementloadWait);
        waitFor(resetMapvalue).withTimeoutOf(long_wait, TimeUnit.SECONDS).isVisible();
    }

    public void resetTrapvalue() {

        waitABit(elementloadWait);
        waitFor(resetTrapvalue).withTimeoutOf(long_wait, TimeUnit.SECONDS).isVisible();
    }

    public void editPool() {

        waitABit(pageloadWait);
        getJavascriptExecutorFacade().executeScript("arguments[0].scrollIntoView(true);", element(editPool));
        waitABit(pageloadWait);
        waitFor(editPool).withTimeoutOf(long_wait, TimeUnit.SECONDS).waitUntilClickable().click();
        waitABit(pageloadWait);
        waitFor(editPoolfirstRow).withTimeoutOf(long_wait, TimeUnit.SECONDS).waitUntilClickable().click();
        waitABit(pageloadWait);
        waitFor(openEditpool).withTimeoutOf(long_wait, TimeUnit.SECONDS).waitUntilClickable().click();
        waitABit(pageloadWait);
        editedValue.clear();
        waitFor(editedValue).withTimeoutOf(long_wait, TimeUnit.SECONDS).sendKeys("20");
        waitABit(elementloadWait);
        waitFor(editSave).withTimeoutOf(long_wait, TimeUnit.SECONDS).waitUntilClickable().click();
        waitABit(pageloadWait);
        waitForAbsenceOf("//div[@id='loading-img']").withTimeoutOf(60, TimeUnit.SECONDS);
        waitFor(closeEditpool).withTimeoutOf(long_wait, TimeUnit.SECONDS).waitUntilClickable().click();


    }

    public void updatePoolvalue() {

        waitABit(elementloadWait);
        waitFor(updatePoolvalue).withTimeoutOf(long_wait, TimeUnit.SECONDS).waitUntilClickable().click();
        waitForAbsenceOf("//div[@id='loading-img']").withTimeoutOf(60, TimeUnit.SECONDS);
    }


    public void editSuccessmessage(String message) {

        waitFor(successMessage).waitUntilVisible().withTimeoutOf(long_wait, TimeUnit.SECONDS).isDisplayed();
        String entry = successMessage.getText();
        Assert.assertEquals(message, entry);

    }

    public void tapOnLarvalFirstentry() {

        waitABit(elementloadWait);
        waitForAbsenceOf("//div[@id='loading-img']").withTimeoutOf(60, TimeUnit.SECONDS);
        waitFor(tapOnLarvalsamplesFirstentry).withTimeoutOf(long_wait, TimeUnit.SECONDS).waitUntilClickable().click();
    }


}

