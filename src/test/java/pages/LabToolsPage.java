package pages;

import com.typesafe.config.Config;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utilities.ConfigLoader;

import java.util.concurrent.TimeUnit;


public class LabToolsPage extends PageObject {


    Config config = ConfigLoader.load();
    int pageloadWait = Integer.parseInt(config.getString("Page_Load_Time"));
    int elementloadWait = Integer.parseInt(config.getString("Element_Load_Time"));
    int long_wait = Integer.parseInt(config.getString("long_wait"));

    @FindBy(xpath = "//span[text()='Lab Tools']")
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
    @FindBy(xpath = "/html/body/div[4]/ul/li[1]/div/div[1]/table/thead/tr[1]/th[2]")
    private WebElement yearHit1;
    @FindBy(xpath = "//button[@id='btnAddTrapdata']")
    private WebElement save;
    @FindBy(xpath = "//html/body/div[4]/ul/li[1]/div/div[2]/table/thead/tr/th[2]")
    private WebElement yearHit2;
    @FindBy(xpath = "/html/body/div[5]/ul/li[1]/div/div[1]/table/thead/tr[1]/th[2]")
    private WebElement endDateyearhit1;
    @FindBy(xpath = "/html/body/div[5]/ul/li[1]/div/div[2]/table/thead/tr/th[2]")
    private WebElement endDateyeaarhit2;
    @FindBy(xpath = "/html/body/div[4]/ul/li[1]/div/div[3]/table/tbody/tr/td/span[2]")
    private WebElement year;
    @FindBy(xpath = "/html/body/div[4]/ul/li[1]/div/div[2]/table/tbody/tr/td/span[12]")
    private WebElement month;
    @FindBy(xpath = "/html/body/div[4]/ul/li[1]/div/div[1]/table/tbody/tr[2]/td[2]")
    private WebElement selectstartDate;
    @FindBy(xpath = "/html/body/div[5]/ul/li[1]/div/div[3]/table/tbody/tr/td/span[3]")
    private WebElement endYear;
    @FindBy(xpath = "/html/body/div[5]/ul/li[1]/div/div[2]/table/tbody/tr/td/span[12]")
    private WebElement endMonth;
    @FindBy(xpath = "/html/body/div[5]/ul/li[1]/div/div[1]/table/tbody/tr[2]/td[3]")
    private WebElement selectendDate;
    @FindBy(xpath = "/html/body/div[4]/ul/li[2]/a/span")
    private WebElement clock;
    @FindBy(xpath = "/html/body/div[5]/ul/li[2]/a/span")
    private WebElement clock2;


    @FindBy(xpath = "/html/body/div[4]/ul/li[3]/div/div[1]/table/tbody/tr[2]/td[1]/span")
    private WebElement hours;
    @FindBy(xpath = "/html/body/div[5]/ul/li[3]/div/div[1]/table/tbody/tr[2]/td[1]/span")
    private WebElement endHours;
    @FindBy(xpath = "/html/body/div[4]/ul/li[3]/div/div[2]/table/tr[2]/td[2]")
    private WebElement selectHours;
    @FindBy(xpath = "/html/body/div[5]/ul/li[3]/div/div[2]/table/tr[2]/td[2]")
    private WebElement selectEndhours;
    @FindBy(xpath = "/html/body/div[4]/ul/li[3]/div/div[1]/table/tbody/tr[2]/td[3]/span")
    private WebElement minutes;
    @FindBy(xpath = "/html/body/div[5]/ul/li[3]/div/div[1]/table/tbody/tr[2]/td[3]/span")
    private WebElement endDateminutes;
    @FindBy(xpath = "/html/body/div[4]/ul/li[3]/div/div[3]/table/tr[2]/td[2]")
    private WebElement selectMinutes;
    @FindBy(xpath = "/html/body/div[5]/ul/li[3]/div/div[3]/table/tr[2]/td[2]")
    private WebElement selectendDateMinutes;
    @FindBy(xpath = "//*[@id='collapseTwo']/div/div/div[4]/label")
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
    @FindBy(xpath = "/html/body/div[8]/div[2]/table/tbody/tr/td/span[12]")
    private WebElementFacade filterEndmonth;
    @FindBy(xpath = "/html/body/div[8]/div[2]/table/thead/tr/th[2]")
    private WebElement filterStartYearhit1;
    @FindBy(xpath = "/html/body/div[8]/div[3]/table/tbody/tr/td/span[2]")
    private WebElement filterStartyearhit2;
    @FindBy(xpath = "/html/body/div[8]/div[3]/table/tbody/tr/td/span[3]")
    private WebElement filterendyearhit2;
    @FindBy(xpath = "/html/body/div[8]/div[2]/table/tbody/tr/td/span[12]")
    private WebElement filterStratmonth;
    @FindBy(xpath = "/html/body/div[8]/div[1]/table/tbody/tr[2]/td[2]")
    private WebElement filterStartdate;
    @FindBy(xpath = "/html/body/div[8]/div[1]/table/tbody/tr[2]/td[3]")
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
    @FindBy(xpath = "/html/body/div[9]/div[1]/table/thead/tr[1]/th[2]")
    private WebElement poolyear1;
    @FindBy(xpath = "/html/body/div[9]/div[2]/table/thead/tr/th[2]")
    private WebElement poolyear2;
    @FindBy(xpath = "/html/body/div[9]/div[3]/table/tbody/tr/td/span[2]")
    private WebElement poolFinalyear;
    @FindBy(xpath = "/html/body/div[9]/div[2]/table/tbody/tr/td/span[12]")
    private WebElement poolMonth;
    @FindBy(xpath = "/html/body/div[9]/div[1]/table/tbody/tr[2]/td[2]")
    private WebElement poolDate;
    @FindBy(xpath = "//button[@id='btn_SavePool']")
    private WebElement savePool;
    @FindBy(xpath = "//div[text()='successfully deleted']")
    private WebElement successfulDeletedmessage;
    @FindBy(xpath = "/html/body/div[4]/ul/li[3]/div/div[1]/table/tbody/tr[2]/td[5]/button[text()='AM']")
    private WebElementFacade amStartdate;
    @FindBy(xpath = "/html/body/div[4]/ul/li[3]/div/div[1]/table/tbody/tr[2]/td[5]/button[text()='PM']")
    private WebElement pmStartdate;
    @FindBy(xpath = "/html/body/div[5]/ul/li[3]/div/div[1]/table/tbody/tr[2]/td[5]/button[text()='AM']")
    private WebElementFacade amEnddate;
    @FindBy(xpath = "/html/body/div[5]/ul/li[3]/div/div[1]/table/tbody/tr[2]/td[5]/button[text()='PM']")
    WebElement pmEnddate;
    @FindBy(xpath = "/html/body/div[8]/div[2]/table/thead/tr/th[2]")
    WebElement filterEndyearhit1;
    @FindBy(xpath = "/html/body/div[8]/div[3]/table/tbody/tr/td/span[3]")
    WebElement filterEndyearhit2;
    //    private static final String loader = "//div[@id='loading-img']";
    @FindBy(xpath = "//div[@id='loading-img']")
    private WebElementFacade loader;
    @FindBy(xpath = "//button[text()='Update']")
    WebElement updatePoolvalue;


    public void labTool() {

        waitABit(elementloadWait);
        withTimeoutOf(long_wait, TimeUnit.SECONDS).waitFor(labtoolButton).waitUntilEnabled();
        withTimeoutOf(long_wait, TimeUnit.SECONDS).waitFor(labtoolButton).waitUntilClickable().click();
    }

    public void newEntry() {

        waitFor(pageloadWait);
        if (withTimeoutOf(long_wait, TimeUnit.SECONDS).waitFor(loader).isVisible()) {
            withTimeoutOf(60, TimeUnit.SECONDS).waitForAbsenceOf("//div[@id='loading-img']");
        }
        waitABit(elementloadWait);
        withTimeoutOf(long_wait, TimeUnit.SECONDS).waitFor(newEntrybutton).waitUntilClickable().click();
    }


    public void area() {
        waitABit(elementloadWait);
        withTimeoutOf(long_wait, TimeUnit.SECONDS).waitFor(getDriver().findElement(By.xpath("   (//th[text()='Area'])[1]"))).waitUntilClickable().click();
        withTimeoutOf(long_wait, TimeUnit.SECONDS).waitFor(area).waitUntilClickable().click();
        withTimeoutOf(long_wait, TimeUnit.SECONDS).waitFor(okButton).waitUntilClickable().click();

    }

    public void trapDatabox() {

        withTimeoutOf(long_wait, TimeUnit.SECONDS).waitFor(trapDatabox).isDisplayed();
    }

    public void startDate() throws InterruptedException {

        waitABit(elementloadWait);
        withTimeoutOf(long_wait,TimeUnit.SECONDS).waitFor(startDate).waitUntilClickable().click();
        waitABit(elementloadWait);
        withTimeoutOf(long_wait,TimeUnit.SECONDS).waitFor(yearHit1).waitUntilClickable().click();
        waitABit(elementloadWait);
        withTimeoutOf(long_wait,TimeUnit.SECONDS).waitFor(yearHit2).waitUntilClickable().click();
        waitABit(elementloadWait);
        withTimeoutOf(long_wait,TimeUnit.SECONDS).waitFor(year).waitUntilClickable().click();
        waitABit(elementloadWait);
        withTimeoutOf(long_wait,TimeUnit.SECONDS).waitFor(month).waitUntilClickable().click();
        waitABit(elementloadWait);
        withTimeoutOf(long_wait,TimeUnit.SECONDS).waitFor(selectstartDate).waitUntilClickable().click();
    }

    public void endDate() {

        waitABit(elementloadWait);
        withTimeoutOf(long_wait, TimeUnit.SECONDS).waitFor(endDate).waitUntilClickable().click();
        waitABit(elementloadWait);
        withTimeoutOf(long_wait, TimeUnit.SECONDS).waitFor(endDateyearhit1).waitUntilClickable().click();
        waitABit(elementloadWait);
        withTimeoutOf(long_wait, TimeUnit.SECONDS).waitFor(endDateyeaarhit2).waitUntilClickable().click();
        waitABit(elementloadWait);
        withTimeoutOf(long_wait, TimeUnit.SECONDS).waitFor(endYear).waitUntilClickable().click();
        waitABit(elementloadWait);
        withTimeoutOf(long_wait, TimeUnit.SECONDS).waitFor(endMonth).waitUntilClickable().click();
        waitABit(elementloadWait);
        withTimeoutOf(long_wait, TimeUnit.SECONDS).waitFor(selectendDate).waitUntilClickable().click();
    }

    public void fieldTech() {

        waitABit(elementloadWait);
        withTimeoutOf(long_wait, TimeUnit.SECONDS).waitFor(fieldTechclick).click();
        withTimeoutOf(long_wait, TimeUnit.SECONDS).waitFor(fieldTech).waitUntilClickable().click();

    }

    public void save() {

        waitABit(pageloadWait);
        withTimeoutOf(35, TimeUnit.SECONDS).waitFor(save).waitUntilClickable().click();
        waitForAbsenceOf("//div[@id='loading-img']").withTimeoutOf(60, TimeUnit.SECONDS);
    }

    public void timeForstartDate() {
        waitABit(elementloadWait);
        withTimeoutOf(long_wait, TimeUnit.SECONDS).waitFor(clock).waitUntilClickable().click();
        waitABit(elementloadWait);
        withTimeoutOf(long_wait, TimeUnit.SECONDS).waitFor(hours).waitUntilClickable().click();
        waitABit(elementloadWait);
        withTimeoutOf(long_wait, TimeUnit.SECONDS).waitFor(selectHours).waitUntilClickable().click();
        waitABit(elementloadWait);
        withTimeoutOf(long_wait, TimeUnit.SECONDS).waitFor(minutes).waitUntilClickable().click();
        waitABit(elementloadWait);
        withTimeoutOf(long_wait, TimeUnit.SECONDS).waitFor(selectMinutes).waitUntilClickable().click();
        if ((amStartdate).isVisible()) {
            withTimeoutOf(3, TimeUnit.SECONDS).waitFor(amStartdate).waitUntilClickable().click();
            withTimeoutOf(3, TimeUnit.SECONDS).waitFor(pmStartdate).isVisible();
            waitABit(elementloadWait);
            withTimeoutOf(3, TimeUnit.SECONDS).waitFor(switchFocus).waitUntilClickable().click();
        }
        else
            {
            withTimeoutOf(3, TimeUnit.SECONDS).waitFor(pmStartdate).isVisible();
            withTimeoutOf(long_wait, TimeUnit.SECONDS).waitFor(switchFocus).waitUntilClickable().click();

        }
    }

    public void timeForendDate() {

        waitABit(elementloadWait);
        withTimeoutOf(long_wait, TimeUnit.SECONDS).waitFor(clock2).waitUntilClickable().click();
        waitABit(elementloadWait);
        withTimeoutOf(long_wait, TimeUnit.SECONDS).waitFor(endHours).waitUntilClickable().click();
        waitABit(elementloadWait);
        withTimeoutOf(long_wait, TimeUnit.SECONDS).waitFor(selectEndhours).waitUntilClickable().click();
        waitABit(elementloadWait);
        withTimeoutOf(long_wait, TimeUnit.SECONDS).waitFor(endDateminutes).waitUntilClickable().click();
        waitABit(elementloadWait);
        withTimeoutOf(long_wait, TimeUnit.SECONDS).waitFor(selectendDateMinutes).waitUntilClickable().click();
        waitABit(elementloadWait);
        if ((amEnddate).isVisible()) {
            waitABit(elementloadWait);
            withTimeoutOf(long_wait, TimeUnit.SECONDS).waitFor(amEnddate).waitUntilClickable().click();
            withTimeoutOf(long_wait, TimeUnit.SECONDS).waitFor(pmEnddate).waitUntilVisible();
            withTimeoutOf(long_wait, TimeUnit.SECONDS).waitFor(switchFocus).waitUntilClickable().click();
        } else {
            withTimeoutOf(long_wait, TimeUnit.SECONDS).waitFor(pmEnddate).waitUntilVisible();
            withTimeoutOf(long_wait, TimeUnit.SECONDS).waitFor(switchFocus).waitUntilClickable().click();

        }

    }

    public void successMessage(String message) {
        String text = withTimeoutOf(long_wait,TimeUnit.SECONDS).waitFor(getDriver().findElement(By.xpath("//div[text()='" + message + "']"))).getText();
        System.out.println(text);
        Assert.assertEquals(text, message);
        waitABit(pageloadWait);
    }

    public void trapDatadetails() {

        waitABit(elementloadWait);
        withTimeoutOf(long_wait, TimeUnit.SECONDS).waitFor(getDriver().findElement(By.xpath(trapData))).waitUntilClickable().click();
    }

    public void trapType() {

        waitABit(elementloadWait);
        withTimeoutOf(long_wait, TimeUnit.SECONDS).waitFor(getDriver().findElement(By.xpath(trapType))).waitUntilClickable().click();

    }

    public void activityType() {

        withTimeoutOf(long_wait, TimeUnit.SECONDS).waitFor(getDriver().findElement(By.xpath(activityType))).waitUntilClickable().click();
        waitABit(elementloadWait);

    }

    public void search() {

        waitABit(elementloadWait);
        withTimeoutOf(long_wait, TimeUnit.SECONDS).waitFor(getDriver().findElement(By.xpath(search))).waitUntilClickable().click();
        waitABit(pageloadWait);

    }

    public void mapArea() {

        waitABit(elementloadWait);
        withTimeoutOf(long_wait, TimeUnit.SECONDS).waitFor(selectMaparea).waitUntilClickable().click();
    }

    public void selectTraptype() {

        waitABit(elementloadWait);
        withTimeoutOf(long_wait, TimeUnit.SECONDS).waitFor(selectTraptype).waitUntilClickable().click();
    }

    public void filteredNewentries(String map, String trapType) {
        waitABit(pageloadWait);
        int row = getDriver().findElements(By.xpath("(//table[@id='LabToolsTable']/tbody/tr[@role='row'])")).size();
        for (int i = 1; i <= row; i++) {
            String mapArea = getDriver().findElement(By.xpath("//table[@id='LabToolsTable']/tbody/tr[" + i + "]/td[3]")).getText();
            Assert.assertEquals(mapArea, map);

            String gettrapType = getDriver().findElement(By.xpath("//table[@id='LabToolsTable']/tbody/tr[" + i + "]/td[4]")).getText();
            Assert.assertEquals(gettrapType, trapType);

        }

    }

    public void filterStartdate() {

        waitABit(pageloadWait);
        withTimeoutOf(long_wait, TimeUnit.SECONDS).waitFor(calendar1).waitUntilClickable().click();
        withTimeoutOf(long_wait, TimeUnit.SECONDS).waitFor(datepicker).waitUntilClickable().click();
        withTimeoutOf(long_wait, TimeUnit.SECONDS).waitFor(filterStartYearhit1).waitUntilClickable().click();
        withTimeoutOf(long_wait, TimeUnit.SECONDS).waitFor(filterStartyearhit2).waitUntilClickable().click();
        withTimeoutOf(long_wait, TimeUnit.SECONDS).waitFor(filterStratmonth).waitUntilClickable().click();
        withTimeoutOf(long_wait, TimeUnit.SECONDS).waitFor(filterStartdate).waitUntilClickable().click();


    }

    public void filterEnddate() {
        waitABit(elementloadWait);
        withTimeoutOf(long_wait, TimeUnit.SECONDS).waitFor(calendar2).waitUntilClickable().click();
        withTimeoutOf(long_wait, TimeUnit.SECONDS).waitFor(datepicker).waitUntilClickable().click();
        withTimeoutOf(long_wait, TimeUnit.SECONDS).waitFor(filterEndyearhit1).waitUntilClickable().click();
        withTimeoutOf(long_wait, TimeUnit.SECONDS).waitFor(filterEndyearhit2).waitUntilClickable().click();
        withTimeoutOf(long_wait, TimeUnit.SECONDS).waitFor(filterEndmonth).waitUntilClickable().click();
        withTimeoutOf(long_wait, TimeUnit.SECONDS).waitFor(filterEnddate).waitUntilClickable().click();

    }

    public void entry1() {
        waitABit(pageloadWait);
        withTimeoutOf(long_wait, TimeUnit.SECONDS).waitFor(getDriver().findElement(By.xpath("(//table[@id='LabToolsTable']/tbody/tr[@role='row'])[1]"))).waitUntilClickable().click();
    }

    public void editButton() {
        waitABit(pageloadWait);
        withTimeoutOf(long_wait, TimeUnit.SECONDS).waitFor(getDriver().findElement(By.xpath("//button[@id='btn_editTrapData']"))).waitUntilClickable().click();
    }

    public void changeFieldType() {

        waitABit(elementloadWait);
        withTimeoutOf(long_wait, TimeUnit.SECONDS).waitFor(fieldTechclick).waitUntilClickable().click();
        withTimeoutOf(long_wait, TimeUnit.SECONDS).waitFor(editFieldtech).waitUntilClickable().click();


    }

    public void changeTraptype() {
        waitABit(elementloadWait);
        withTimeoutOf(long_wait, TimeUnit.SECONDS).waitFor(getDriver().findElement(By.xpath(trapData))).waitUntilClickable().click();
        waitABit(elementloadWait);
        withTimeoutOf(long_wait, TimeUnit.SECONDS).waitFor(getDriver().findElement(By.xpath(editTraptype))).waitUntilClickable().click();

    }

    public void editedTraptype() {
        waitABit(elementloadWait);
        withTimeoutOf(long_wait, TimeUnit.SECONDS).waitFor(getDriver().findElement(By.xpath(selectEditedtraptype))).waitUntilClickable().click();

    }

    public void selectFirstentry() {

        waitABit(pageloadWait);
        withTimeoutOf(long_wait, TimeUnit.SECONDS).waitFor(selectFirstentry).waitUntilClickable().click();


    }

    public void delete() {

        waitABit(elementloadWait);
        withTimeoutOf(long_wait, TimeUnit.SECONDS).waitFor(delete).waitUntilClickable().click();
        waitABit(elementloadWait);
        withTimeoutOf(long_wait, TimeUnit.SECONDS).waitFor(yes1).waitUntilClickable().click();
        waitABit(elementloadWait);
        withTimeoutOf(long_wait, TimeUnit.SECONDS).waitFor(yes2).waitUntilClickable().click();
        waitABit(1000);

    }

    public void deletedSuccessfully(String deletedMessage)
    {

        if (loader.isVisible())
        {
            withTimeoutOf(360, TimeUnit.SECONDS).waitForAbsenceOf("//div[@id='loading-img']");
        }
        withTimeoutOf(120, TimeUnit.SECONDS).waitFor(successfulDeletedmessage).waitUntilVisible();
        waitABit(pageloadWait);
    }


    public void closeEntry() {
        waitABit(elementloadWait);
        withTimeoutOf(long_wait, TimeUnit.SECONDS).waitFor(closeOkay).waitUntilClickable().click();

    }


    public void selectValuestoCloseentries() {

        waitABit(elementloadWait);
        String entry = waitFor(technicianName).getText();
        System.out.println(entry);
        waitABit(elementloadWait);
        withTimeoutOf(long_wait, TimeUnit.SECONDS).waitFor(closeEntrybutton).waitUntilClickable().click();
        waitABit(pageloadWait);
        withTimeoutOf(long_wait, TimeUnit.SECONDS).waitFor(getDriver().findElement(By.xpath("//*/select[@id='ddl_ftechnician_closeentry']/option[text()='" + entry + "']"))).waitUntilClickable().click();
    }

    public void closedEntrycheckbox() {

        waitABit(elementloadWait);
        withTimeoutOf(long_wait, TimeUnit.SECONDS).waitFor(closedEntrycheckbox).waitUntilClickable().click();

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
            withTimeoutOf(long_wait, TimeUnit.SECONDS).waitFor(reopenButton).waitUntilClickable().click();
            waitFor(elementloadWait);
            Thread.sleep(5000);


        } else {
            selectValuestoCloseentries();
            closeEntry();
            waitABit(pageloadWait);
            selectFirstentry();
            withTimeoutOf(long_wait, TimeUnit.SECONDS).waitFor(reopenButton).waitUntilClickable().click();
            Thread.sleep(5000);

        }
    }

    public void tapOnfirstEntry() {

        waitABit(pageloadWait);
        withTimeoutOf(long_wait, TimeUnit.SECONDS).waitFor(tap).waitUntilClickable().click();

    }

    public void createPool() throws InterruptedException {

        waitABit(elementloadWait);
        String text = getDriver().findElement(By.xpath("(//*//div[@class='dataTables_wrapper no-footer']/table/tbody/tr)[1]/td[7]")).getText();
        System.out.println(text);
        waitABit(elementloadWait);
        withTimeoutOf(long_wait, TimeUnit.SECONDS).waitFor(addPool).waitUntilClickable().click();
        withTimeoutOf(long_wait, TimeUnit.SECONDS).waitFor(getDriver().findElement(By.xpath("//div[@id='loading-img']"))).waitUntilNotVisible();
        Thread.sleep(6000);
        getJavascriptExecutorFacade().executeScript("arguments[0].scrollIntoView(true);", element(createPoolButton));
        withTimeoutOf(long_wait, TimeUnit.SECONDS).waitFor(createPoolButton).waitUntilClickable().click();
        waitABit(pageloadWait);
        withTimeoutOf(long_wait, TimeUnit.SECONDS).waitFor(getDriver().findElement(By.xpath("//*[@id='CreatePoolModal']/div/div/div[1]/h4"))).isPresent();
        withTimeoutOf(long_wait, TimeUnit.SECONDS).waitFor(laboratory).waitUntilClickable().click();
        waitABit(elementloadWait);
        withTimeoutOf(long_wait, TimeUnit.SECONDS).waitFor(getDriver().findElement(By.xpath("//*//select[@id='ddl_poolTechnician']/option[text()='" + text + "']"))).waitUntilClickable().click();
    }


    public void poolDate(String message) {

        withTimeoutOf(long_wait, TimeUnit.SECONDS).waitFor(poolCalendar).waitUntilClickable().click();
        withTimeoutOf(long_wait, TimeUnit.SECONDS).waitFor(poolyear1).waitUntilClickable().click();
        withTimeoutOf(long_wait, TimeUnit.SECONDS).waitFor(poolyear2).waitUntilClickable().click();
        withTimeoutOf(long_wait, TimeUnit.SECONDS).waitFor(poolFinalyear).waitUntilClickable().click();
        withTimeoutOf(long_wait, TimeUnit.SECONDS).waitFor(poolMonth).waitUntilClickable().click();
        withTimeoutOf(long_wait, TimeUnit.SECONDS).waitFor(poolDate).waitUntilClickable().click();
        withTimeoutOf(long_wait, TimeUnit.SECONDS).waitFor(savePool).waitUntilClickable().click();
        waitABit(1000);
        if (withTimeoutOf(long_wait, TimeUnit.SECONDS).waitFor(loader).isVisible()) {

            withTimeoutOf(60, TimeUnit.SECONDS).waitForAbsenceOf("//div[@id='loading-img']");
        }

        withTimeoutOf(long_wait, TimeUnit.SECONDS).waitFor(successMessage).waitUntilVisible();
        String entry = successMessage.getText();
        Assert.assertEquals(message, entry);


    }

    public void maleFemalevalue(String male, String female) {
        waitABit(elementloadWait);
        withTimeoutOf(long_wait, TimeUnit.SECONDS).waitFor(males).waitUntilVisible().clear();
        withTimeoutOf(long_wait, TimeUnit.SECONDS).waitFor(males).waitUntilVisible().sendKeys(male);
        withTimeoutOf(long_wait, TimeUnit.SECONDS).waitFor(females).waitUntilVisible().clear();
        withTimeoutOf(long_wait, TimeUnit.SECONDS).waitFor(females).waitUntilVisible().sendKeys(female);

    }

    public void verifyPopup() {

        waitABit(elementloadWait);
        withTimeoutOf(long_wait, TimeUnit.SECONDS).waitFor(newEntrypopup).isDisplayed();
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
        withTimeoutOf(long_wait, TimeUnit.SECONDS).waitFor(selectAllcheckbox).click();


    }

    public void closeEntrytechnician() {

        waitABit(elementloadWait);
        withTimeoutOf(long_wait, TimeUnit.SECONDS).waitFor(closeEntrytechnician).waitUntilClickable().click();
        withTimeoutOf(long_wait, TimeUnit.SECONDS).waitFor(closeOkay).waitUntilClickable().click();
    }

    public void processClose() {

        waitABit(elementloadWait);
        withTimeoutOf(long_wait, TimeUnit.SECONDS).waitFor(processClose).waitUntilClickable().click();

    }

    public void processedReopenbutton() {

        waitABit(elementloadWait);
        withTimeoutOf(long_wait, TimeUnit.SECONDS).waitFor(reopenButton).waitUntilClickable().click();
    }

    public void resetSearchbutton() {

        waitABit(elementloadWait);
        withTimeoutOf(long_wait, TimeUnit.SECONDS).waitFor(resetSearchbutton).waitUntilClickable().click();


    }

    public void resetMapvalue() {
        waitABit(elementloadWait);
        withTimeoutOf(long_wait, TimeUnit.SECONDS).waitFor(resetMapvalue).waitUntilClickable().click();
    }

    public void resetTrapvalue() {

        waitABit(elementloadWait);
        withTimeoutOf(long_wait, TimeUnit.SECONDS).waitFor(resetTrapvalue).waitUntilClickable().click();
    }

    public void editPool(String message) throws InterruptedException {

        waitABit(pageloadWait);
        getJavascriptExecutorFacade().executeScript("arguments[0].scrollIntoView(true);", element(editPool));
        waitABit(pageloadWait);
        withTimeoutOf(long_wait, TimeUnit.SECONDS).waitFor(editPool).waitUntilClickable().click();
        waitABit(pageloadWait);
        withTimeoutOf(long_wait, TimeUnit.SECONDS).waitFor(editPoolfirstRow).waitUntilClickable().click();
        waitABit(pageloadWait);
        withTimeoutOf(long_wait, TimeUnit.SECONDS).waitFor(openEditpool).waitUntilClickable().click();
        waitABit(pageloadWait);
        withTimeoutOf(long_wait, TimeUnit.SECONDS).waitFor(editedValue).clear();
        withTimeoutOf(long_wait, TimeUnit.SECONDS).waitFor(editedValue).sendKeys("20");
        waitABit(elementloadWait);
        withTimeoutOf(long_wait, TimeUnit.SECONDS).waitFor(editSave).waitUntilClickable().click();
        withTimeoutOf(long_wait, TimeUnit.SECONDS).waitFor(successMessage).waitUntilVisible();
        String entry = successMessage.getText();
        Assert.assertEquals(message, entry);
        if (withTimeoutOf(long_wait, TimeUnit.SECONDS).waitFor(loader).isVisible()) {
            withTimeoutOf(60, TimeUnit.SECONDS).waitForAbsenceOf("//div[@id='loading-img']");
        }
        withTimeoutOf(long_wait, TimeUnit.SECONDS).waitFor(successMessage).waitUntilVisible();
        withTimeoutOf(long_wait, TimeUnit.SECONDS).waitFor(closeEditpool).waitUntilClickable().click();


    }

    public void updatePoolvalue() {

        waitABit(elementloadWait);
        withTimeoutOf(360, TimeUnit.SECONDS).waitFor(updatePoolvalue).waitUntilClickable().click();
        if (withTimeoutOf(long_wait, TimeUnit.SECONDS).waitFor(loader).isVisible()) {
            withTimeoutOf(60, TimeUnit.SECONDS).waitForAbsenceOf("//div[@id='loading-img']");
        }
    }


    public void editSuccessmessage(String message) {

        if (withTimeoutOf(long_wait, TimeUnit.SECONDS).waitFor(loader).isVisible()) {
            withTimeoutOf(60, TimeUnit.SECONDS).waitForAbsenceOf("//div[@id='loading-img']");
        }
        withTimeoutOf(long_wait, TimeUnit.SECONDS).waitFor(successMessage).waitUntilVisible();
        String entry = successMessage.getText();
        Assert.assertEquals(message, entry);

    }

    public void tapOnLarvalFirstentry() {

        waitABit(elementloadWait);
        withTimeoutOf(long_wait, TimeUnit.SECONDS).waitForAbsenceOf("//div[@id='loading-img']");
        withTimeoutOf(long_wait, TimeUnit.SECONDS).waitFor(tapOnLarvalsamplesFirstentry).waitUntilClickable().click();
    }


}

