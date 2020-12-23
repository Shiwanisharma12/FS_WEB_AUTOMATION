package pages;

import com.typesafe.config.Config;
import net.thucydides.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utilities.ConfigLoader;

import java.util.concurrent.TimeUnit;

public class configurationPage extends PageObject {

    Config config = ConfigLoader.load();
    int pageloadWait = Integer.parseInt(config.getString("Page_Load_Time"));
    int elementloadWait = Integer.parseInt(config.getString("Element_Load_Time"));
    int long_wait = Integer.parseInt(config.getString("Element_Load_Time"));

    @FindBy(xpath = "(//div[@class='toolsBox'])[7]")
    private WebElement configurationTab;
    @FindBy(xpath = "//table[@id='ConfigToolsTable']/tbody/tr/td[text()='addlocationlayer']/../td/a[@class='EditRowReview edit-treatment']/i[@class='fa fa-edit']")
    private WebElement editAddlocationLayer;
    @FindBy(xpath = "//h4[text()='Edit FieldSeeker Configuration']")
    private WebElement editFieldSeekerconfigurationBox;
    @FindBy(xpath = "//input[@id='txtDefaultValue']")
    private WebElement defaultValueinputField;
    @FindBy(xpath = "//button[@id='btnSave_FieldConfig']")
    private WebElement updateButton;
    @FindBy(xpath = "//div[text()='Record updated successfully']")
    private WebElement successfullyUpdatemessage;
    @FindBy(xpath = "//table[@id='ConfigToolsTable']/tbody/tr[2]")
    private WebElement firstConfigEntry;
    @FindBy(xpath = "//a[@href='#tab2MosquitoSpecies']")
    private WebElement mosquitoSpeciesTab;
    @FindBy(xpath = "//h4[text()='Add Mosquito Species']")
    private WebElement addMosquitospeciesbox;
    @FindBy(xpath = "//button[@id='btnAdd_MosquitoSpecies']")
    private WebElement addButtonmosquitoSpecies;
    @FindBy(xpath = "//input[@id='txtMosquitoName']")
    private WebElement entryName;
    @FindBy(xpath = "(//input[@type='search'])[1]")
    private WebElement searchConfigentry;
    @FindBy(xpath = "(//a[@class='EditRowReview edit-treatment'])[11]")
    private WebElement editMosquitospeciesBtn;
    @FindBy(xpath = "//h4[@id='lblHeading_Mosquito']")
    private WebElement editMosquitospeciesBox;
    @FindBy(xpath = "//input[@id='txtMosquitoName']")
    private WebElement mosquitoSpeciesEditedname;
    @FindBy(xpath = "//button[@id='btnSave_MosquitoSpecies']")
    private WebElement mosquitoSpeciesSavebutton;
    @FindBy(xpath = "//a[text()='Product']")
    private WebElement productTab;
    @FindBy(xpath = "//a[@id='lnkLarviciding']")
    private WebElement larvicidingTab;
    @FindBy(xpath = "//a[text()='ULV']")
    private WebElement ulvTab;
    @FindBy(xpath = "//button[@id='btnAdd_Product']")
    private WebElement addProductbutton;
    @FindBy(xpath = "//input[@id='txtProductName']")
    private WebElement larvicingNamefield ;
    @FindBy(xpath = "//input[@id='txtProductName']")
    private WebElement uavNamefield ;
    @FindBy(xpath = "//input[@id='txtProduct_Value']")
    private WebElement larvicingValuefield;
    @FindBy(xpath = "//input[@id='txtProduct_Value']")
    private WebElement uavValuefield;
    @FindBy(xpath = "//input[@id='txtProduct_Duration']")
    private WebElement larvicingDurationfield ;
    @FindBy(xpath = "//input[@id='txtProduct_Duration']")
    private WebElement uavDurationfield ;
    @FindBy(xpath = "//input[@id='txtProduct_LRange']")
    private WebElement larvicingLrangefield ;
    @FindBy(xpath = "//input[@id='txtProduct_LRange']")
    private WebElement uavLrangefield  ;
    @FindBy(xpath = "//input[@id='txtProduct_HRange']")
    private WebElement larvicidingHrangefield;
    @FindBy(xpath = "//input[@id='txtProduct_HRange']")
    private WebElement uavHrangefield;
    @FindBy(xpath = "//input[@id='txtProduct_ChemregNo']")
    private WebElement larvicingChemregNo ;
    @FindBy(xpath = "//input[@id='txtProduct_ChemregNo']")
    private WebElement uavChemregNo ;
    @FindBy(xpath = "//button[@id='btnSave_Product']")
    private WebElement larvicidingSavebutton ;
    @FindBy(xpath = "(//input[@type='search'])[2]")
    private WebElement larvidingSearchfield;
    @FindBy(xpath = "(//input[@type='search'])[4]")
    private WebElement gatewaySearchfield;
    @FindBy(xpath = "(//i[@class='fa fa-edit'])[21]")
    private WebElement larvicingFirstentryEditbutton;
    @FindBy(xpath = "//h4[text()='Edit Product']")
    private WebElement editLarvicidingproductDialogBox;
    @FindBy(xpath = "//button[@id='btnSave_Product']")
    private WebElement larvicingUpdatebtn ;
    @FindBy(xpath = "//input[@id='txtProduct_MixRate']")
    private WebElement mixrateField ;
    @FindBy(xpath = "//input[@id='txtProduct_AI1']")
    private WebElement AIField ;
    @FindBy(xpath = "//select[@id='selProduct_Diluent']/option[@value='Oil']")
    private WebElement dilutent ;
    @FindBy(xpath = "//a[text()='Technician']")
    private WebElement technicianTab ;
    @FindBy(xpath = "//button[@id='btnAdd_Technicain']")
    private WebElement technicianTabaddBtn ;
    @FindBy(xpath = "//h4[@id='lblHeading_Technician']")
    private WebElement addTechnicianbox ;
    @FindBy(xpath = "//input[@id='txtTechnicianName']")
    private WebElement technicianTabnameField ;
    @FindBy(xpath = "//button[@id='btnSave_Technician']")
    private WebElement technicianSavebtn ;
    @FindBy(xpath = "//button[@id='btnSave_Technician']")
    private WebElement technicianUpdatebtn ;
    @FindBy(xpath = "(//input[@type='search'])[3]")
    private WebElement technicianSearchfield ;
    @FindBy(xpath = "(//i[@class='fa fa-edit'])[31]")
    private WebElement technicianTabfirstEntry ;
    @FindBy(xpath = "//a[@href='#tab6TrapTypeMapping']")
    private WebElement trapTypemappingTab  ;
    @FindBy(xpath = "//button[@id='btnOpen_TrapType']")
    private WebElement trapTypemappingTabaddBtn  ;
    @FindBy(xpath = "//h4[text()='Add Trap Type Mapping']")
    private WebElement trapTypemappingTabbox  ;
    @FindBy(xpath = "//h4[@id='hdrAddTrapType']")
    private WebElement trapTypeditTabbox  ;
    @FindBy(xpath = "//button[@id='btnAdd_TrapType']")
    private WebElement trapTypemappingSavebtn  ;
    @FindBy(xpath = "(//input[@type='search'])[5]")
    private WebElement trapTrapsearch  ;
    @FindBy(xpath = "//table[@id='TrapTypeTable']/tbody/tr[1]/td[3]/a/i[@class='fa fa-edit']")
    private WebElement trapTypeeditBtn  ;
    @FindBy(xpath = "//button[@id='btnAdd_TrapType']")
    private WebElement trapTypeupdateBtn  ;
    @FindBy(xpath = "//table[@id='TrapTypeTable']/tbody/tr[1]/td[3]/a[2]/i[@class='fa fa-trash']")
    private WebElement trapTypedeleteBtn  ;
    @FindBy(xpath = "//button[@id='btnAdd_DeleteTrapType']")
    private WebElement confirmDelete1;
    private static String loader="//div[@id='loading-img']";
    @FindBy(xpath = "//select[@id='selProduct_Active']/option[text()='True']")
    private WebElement larvicidingStatus ;
    @FindBy(xpath = "//input[@id='chkActive_Product']")
    private WebElement hideInactivecheckBox ;
    @FindBy(xpath = "//td[text()='No matching records found']")
    private WebElement noRecordfound ;
    @FindBy(xpath = "//input[@id='chkActive_Technician']")
    private WebElement technicianHideinactiveCheckbox ;
    @FindBy(xpath = "//table[@id='GatewayReprsent']/tbody/tr[1]/td[6]/a/i[@class='fa fa-edit']")
    private WebElement gatewayFirstentryEditbutton ;
    @FindBy(xpath = "//h4[text()='Edit Gateway Information']")
    private WebElement editGatewayinformationBox;
    @FindBy(xpath = "//input[@id='txtState']")
    private WebElement gatewayStatefield;
    @FindBy(xpath = "//button[@id='btn_SaveGatewayField']")
    private WebElement gatewayConfirmbtn;
    @FindBy(xpath = "//a[text()='Gateway Sync']")
    private WebElement gatewaySynctab;
    @FindBy(xpath = "//button[@id='btn_addFlock']")
    private WebElement addFlocksaveBtn;
    @FindBy(xpath = "//button[@id='btn_OpenFlock_SL']")
    private WebElement addFlockbtn;
    @FindBy(xpath = "(//select[@id='ddl_Available_band']/option)[1]")
    private WebElement selectBand;
    @FindBy(xpath = "//button[@id='btn_fwd_band']")
    private WebElement moveBand;
    @FindBy(xpath = "(//h4[text()='Flock Details'])[2]")
    private WebElement flockDetailspopupBox;
    @FindBy(xpath = "(//select[@id='ddl_FlockAtSite_SL']/option)[1]")
    private WebElement flockSite;
    @FindBy(xpath = "//a[text()='Sentinel Flock']")
    private WebElement sentinalFlocktab;




    public void editAddlocationLayer() {
        waitABit(elementloadWait);
        waitFor(editAddlocationLayer).withTimeoutOf(long_wait, TimeUnit.SECONDS).waitUntilClickable().click();
        waitABit(elementloadWait);
        waitFor(editFieldSeekerconfigurationBox).withTimeoutOf(long_wait, TimeUnit.SECONDS).waitUntilVisible();
    }

    public void configurationTab() {

        waitABit(pageloadWait);
        waitFor(configurationTab).withTimeoutOf(long_wait, TimeUnit.SECONDS).waitUntilClickable().click();
    }

    public void defaultValue(String defaultValue) {
        waitABit(elementloadWait);
        waitFor(defaultValueinputField).withTimeoutOf(long_wait, TimeUnit.SECONDS).clear();
        waitFor(defaultValueinputField).withTimeoutOf(long_wait, TimeUnit.SECONDS).sendKeys(defaultValue);
    }

    public void updateBtn() {

        waitABit(elementloadWait);
        waitFor(updateButton).withTimeoutOf(long_wait, TimeUnit.SECONDS).waitUntilClickable().click();
        waitForAbsenceOf(loader).withTimeoutOf(long_wait,TimeUnit.SECONDS);
    }

    public void updateSuccessmsg(String updateMsg) {

        waitFor(getDriver().findElement(By.xpath("//div[text()='"+updateMsg+"']"))).withTimeoutOf(long_wait, TimeUnit.SECONDS).isDisplayed();
        String msg = waitFor(getDriver().findElement(By.xpath("//div[text()='"+updateMsg+"']"))).withTimeoutOf(long_wait, TimeUnit.SECONDS).waitUntilVisible().getText();
        Assert.assertEquals(msg.trim(), updateMsg.trim());
    }

    public void firstConfigentry(String entry)  {

        waitFor(firstConfigEntry).withTimeoutOf(long_wait, TimeUnit.SECONDS).isDisplayed();
        String msg = waitFor(firstConfigEntry).withTimeoutOf(long_wait, TimeUnit.SECONDS).getText();
        System.out.println(msg);
        Assert.assertEquals(msg.trim(), entry.trim());
        waitFor(elementloadWait);

    }

    public void mosquitoSpeciestab() {

        waitABit(elementloadWait);
        waitFor(mosquitoSpeciesTab).withTimeoutOf(long_wait, TimeUnit.SECONDS).waitUntilVisible();
        waitFor(mosquitoSpeciesTab).withTimeoutOf(long_wait, TimeUnit.SECONDS).waitUntilClickable().click();
    }

    public void addConfigurationspeciesBtn() {
        waitABit(elementloadWait);
        waitFor(addButtonmosquitoSpecies).withTimeoutOf(long_wait, TimeUnit.SECONDS).waitUntilClickable().click();
        waitABit(elementloadWait);
        waitFor(addMosquitospeciesbox).withTimeoutOf(long_wait, TimeUnit.SECONDS).waitUntilVisible();

    }

    public void mosquitoSpeciesEntryname(String name) {

        waitABit(elementloadWait);
        waitFor(entryName).withTimeoutOf(long_wait, TimeUnit.SECONDS).clear();
        waitABit(elementloadWait);
        waitFor(entryName).withTimeoutOf(long_wait, TimeUnit.SECONDS).sendKeys(name);


    }

    public void saveMosquitospeciesEntry() throws InterruptedException {

        waitABit(elementloadWait);
        waitFor(mosquitoSpeciesSavebutton).withTimeoutOf(long_wait, TimeUnit.SECONDS).waitUntilClickable().click();
        waitForAbsenceOf(loader).withTimeoutOf(long_wait,TimeUnit.SECONDS);
    }

    public void searchConfigentry(String searchedEntry) {

        waitABit(elementloadWait);
        waitFor(searchConfigentry).withTimeoutOf(long_wait, TimeUnit.SECONDS).sendKeys(searchedEntry);
        waitABit(elementloadWait);

    }

    public void editMosquitospeciesEntryname(String name) {

        waitABit(elementloadWait);
        waitFor(editMosquitospeciesBtn).withTimeoutOf(long_wait, TimeUnit.SECONDS).waitUntilClickable().click();
        waitABit(elementloadWait);
        waitFor(editMosquitospeciesBox).withTimeoutOf(long_wait, TimeUnit.SECONDS).waitUntilVisible();
        waitABit(elementloadWait);
        waitFor(mosquitoSpeciesEditedname).withTimeoutOf(long_wait, TimeUnit.SECONDS).clear();
        waitFor(elementloadWait);
        waitFor(mosquitoSpeciesEditedname).withTimeoutOf(long_wait, TimeUnit.SECONDS).sendKeys(name);

    }

    public void editMosquitospeciesSavebtn() {
        waitABit(elementloadWait);
        waitFor(mosquitoSpeciesSavebutton).withTimeoutOf(long_wait, TimeUnit.SECONDS).waitUntilClickable().click();
        waitForAbsenceOf(loader).withTimeoutOf(long_wait,TimeUnit.SECONDS);

    }

    public void productTab() {

        waitABit(elementloadWait);
        waitForAbsenceOf(loader).withTimeoutOf(long_wait,TimeUnit.SECONDS);
        waitFor(productTab).withTimeoutOf(long_wait, TimeUnit.SECONDS).waitUntilClickable().click();
    }

    public void larvicidingTab() {

        waitABit(elementloadWait);
        waitFor(larvicidingTab).withTimeoutOf(long_wait, TimeUnit.SECONDS).waitUntilClickable().click();
    }

    public void addProductbutton() {

        waitABit(pageloadWait);
        waitFor(addProductbutton).withTimeoutOf(long_wait, TimeUnit.SECONDS).waitUntilClickable().click();

    }

    public void larvicidingAddproductDetails(String mixrate, String AI, String name, String value, String duration, String lrange, String hrange, String ChemregNo) {

        waitABit(elementloadWait);
        waitFor(larvicingNamefield).withTimeoutOf(long_wait, TimeUnit.SECONDS).clear();
        waitFor(larvicingNamefield).withTimeoutOf(long_wait, TimeUnit.SECONDS).sendKeys(name);
        waitABit(elementloadWait);
        waitFor(larvicingValuefield).withTimeoutOf(long_wait, TimeUnit.SECONDS).clear();
        waitFor(larvicingValuefield).withTimeoutOf(long_wait, TimeUnit.SECONDS).sendKeys(value);
        waitABit(elementloadWait);
        waitFor(larvicingDurationfield).withTimeoutOf(long_wait, TimeUnit.SECONDS).clear();
        waitFor(larvicingDurationfield).withTimeoutOf(long_wait, TimeUnit.SECONDS).sendKeys(duration);
        waitABit(elementloadWait);
        waitFor(larvicingLrangefield).withTimeoutOf(long_wait, TimeUnit.SECONDS).clear();
        waitFor(larvicingLrangefield).withTimeoutOf(long_wait, TimeUnit.SECONDS).sendKeys(lrange);
        waitABit(elementloadWait);
        waitFor(larvicidingHrangefield).withTimeoutOf(long_wait, TimeUnit.SECONDS).clear();
        waitFor(larvicidingHrangefield).withTimeoutOf(long_wait, TimeUnit.SECONDS).sendKeys(hrange);
        waitABit(elementloadWait);
        waitFor(larvicingChemregNo).withTimeoutOf(long_wait, TimeUnit.SECONDS).clear();
        waitFor(larvicingChemregNo).withTimeoutOf(long_wait, TimeUnit.SECONDS).sendKeys(ChemregNo);
        waitABit(elementloadWait);
        waitFor(mixrateField).withTimeoutOf(long_wait, TimeUnit.SECONDS).clear();
        waitFor(mixrateField).withTimeoutOf(long_wait, TimeUnit.SECONDS).sendKeys(mixrate);
        waitABit(elementloadWait);
        waitFor(AIField).withTimeoutOf(long_wait, TimeUnit.SECONDS).clear();
        waitFor(AIField).withTimeoutOf(long_wait, TimeUnit.SECONDS).sendKeys(AI);

    }

    public void larvicidingSavebutton() {

        waitABit(elementloadWait);
        waitFor(larvicidingSavebutton).withTimeoutOf(long_wait, TimeUnit.SECONDS).waitUntilClickable().click();
        waitForAbsenceOf(loader).withTimeoutOf(long_wait,TimeUnit.SECONDS);

    }

    public void areaValue(String areaValue) {

        waitABit(elementloadWait);
        waitFor(getDriver().findElement(By.xpath("//option[@value='"+areaValue+"']"))).withTimeoutOf(long_wait, TimeUnit.SECONDS).waitUntilClickable().click();

    }

    public void searchlarvicingEntry(String name) {

        waitABit(elementloadWait);
        waitFor(larvidingSearchfield).withTimeoutOf(long_wait, TimeUnit.SECONDS).sendKeys(name);
    }

    public void larvicidingFirstentryEditbutton() {

        waitABit(pageloadWait);
        waitFor(larvicingFirstentryEditbutton).withTimeoutOf(long_wait, TimeUnit.SECONDS).waitUntilClickable().click();
        waitABit(elementloadWait);
        waitFor(editLarvicidingproductDialogBox).withTimeoutOf(long_wait, TimeUnit.SECONDS).waitUntilVisible();
    }

    public void larvicidingMeasureValue(String measureValue) {

        waitABit(elementloadWait);
        waitFor(getDriver().findElement(By.xpath("//option[@value='"+measureValue+"']"))).withTimeoutOf(long_wait, TimeUnit.SECONDS).waitUntilClickable().click();

    }

    public void larvicidingUpdatebtn() {

        waitABit(elementloadWait);
        waitFor(larvicingUpdatebtn).withTimeoutOf(long_wait, TimeUnit.SECONDS).waitUntilClickable().click();
        waitForAbsenceOf(loader).withTimeoutOf(long_wait,TimeUnit.SECONDS);


    }

    public void ulvTab() {

        waitABit(elementloadWait);
        waitFor(ulvTab).withTimeoutOf(long_wait, TimeUnit.SECONDS).waitUntilClickable().click();
    }

    public void diluent(String diluentValue) {

        waitABit(elementloadWait);
        waitFor(dilutent).withTimeoutOf(long_wait, TimeUnit.SECONDS).waitUntilClickable().click();
    }

    public void UAVAddproductDetails(String name, String value, String duration, String lrange, String hrange, String chemregNo, String mixrate, String ai) {

        waitABit(elementloadWait);
        waitFor(uavNamefield).withTimeoutOf(long_wait, TimeUnit.SECONDS).clear();
        waitFor(uavNamefield).withTimeoutOf(long_wait, TimeUnit.SECONDS).sendKeys(name);
        waitABit(elementloadWait);
        waitFor(uavValuefield).withTimeoutOf(long_wait, TimeUnit.SECONDS).clear();
        waitFor(uavValuefield).withTimeoutOf(long_wait, TimeUnit.SECONDS).sendKeys(value);
        waitABit(elementloadWait);
        waitFor(uavDurationfield).withTimeoutOf(long_wait, TimeUnit.SECONDS).clear();
        waitFor(uavDurationfield).withTimeoutOf(long_wait, TimeUnit.SECONDS).sendKeys(duration);
        waitABit(elementloadWait);
        waitFor(uavLrangefield).withTimeoutOf(long_wait, TimeUnit.SECONDS).clear();
        waitFor(uavLrangefield).withTimeoutOf(long_wait, TimeUnit.SECONDS).sendKeys(lrange);
        waitABit(elementloadWait);
        waitFor(uavHrangefield).withTimeoutOf(long_wait, TimeUnit.SECONDS).clear();
        waitFor(uavHrangefield).withTimeoutOf(long_wait, TimeUnit.SECONDS).sendKeys(hrange);
        waitABit(elementloadWait);
        waitFor(uavChemregNo).withTimeoutOf(long_wait, TimeUnit.SECONDS).clear();
        waitFor(uavChemregNo).withTimeoutOf(long_wait, TimeUnit.SECONDS).sendKeys(chemregNo);
        waitABit(elementloadWait);
        waitFor(mixrateField).withTimeoutOf(long_wait, TimeUnit.SECONDS).clear();
        waitFor(mixrateField).withTimeoutOf(long_wait, TimeUnit.SECONDS).sendKeys(mixrate);
        waitABit(elementloadWait);
        waitFor(AIField).withTimeoutOf(long_wait, TimeUnit.SECONDS).clear();
        waitFor(AIField).withTimeoutOf(long_wait, TimeUnit.SECONDS).sendKeys(ai);

    }

    public void technicianTab() {

        waitABit(pageloadWait);
        waitFor(technicianTab).withTimeoutOf(long_wait, TimeUnit.SECONDS).waitUntilClickable().click();
    }

    public void technicianTabaddBtn() {

        waitABit(elementloadWait);
        waitFor(technicianTabaddBtn).withTimeoutOf(long_wait, TimeUnit.SECONDS).waitUntilClickable().click();
        waitFor(addTechnicianbox).withTimeoutOf(long_wait,TimeUnit.SECONDS).waitUntilVisible();
    }

    public void technicianNamefield(String name) {

        waitABit(elementloadWait);
        waitFor(technicianTabnameField).withTimeoutOf(long_wait, TimeUnit.SECONDS).clear();
        waitFor(technicianTabnameField).withTimeoutOf(long_wait, TimeUnit.SECONDS).sendKeys(name);
    }

    public void technicianSavebtn()
    {
        waitABit(elementloadWait);
        waitFor(technicianSavebtn).withTimeoutOf(long_wait, TimeUnit.SECONDS).waitUntilClickable().click();
        waitForAbsenceOf(loader).withTimeoutOf(long_wait,TimeUnit.SECONDS);

    }

    public void technicianUpdatebtn() {

        waitABit(elementloadWait);
        waitFor(technicianUpdatebtn).withTimeoutOf(long_wait, TimeUnit.SECONDS).waitUntilClickable().click();
        waitForAbsenceOf(loader).withTimeoutOf(long_wait,TimeUnit.SECONDS);

    }

    public void technicianSerachfield(String name) {

        waitABit(elementloadWait);
        waitFor(technicianSearchfield).withTimeoutOf(long_wait, TimeUnit.SECONDS).sendKeys(name);
    }

    public void technicianTabfirstEntry() {

        waitABit(elementloadWait);
        waitFor(technicianTabfirstEntry).withTimeoutOf(long_wait, TimeUnit.SECONDS).waitUntilClickable().click();
    }

    public void trapTypemappingTab() {

        waitABit(elementloadWait);
        waitFor(trapTypemappingTab).withTimeoutOf(long_wait, TimeUnit.SECONDS).waitUntilClickable().click();
    }

    public void trapTypemappingTabaddBtn() {

        waitABit(elementloadWait);
        waitFor(trapTypemappingTabaddBtn).withTimeoutOf(long_wait, TimeUnit.SECONDS).waitUntilClickable().click();
        waitABit(elementloadWait);
        waitFor(trapTypemappingTabbox).withTimeoutOf(long_wait, TimeUnit.SECONDS).waitUntilVisible();
    }

    public void fieldSeekertrapType(String fieldValue) {

        waitABit(elementloadWait);
        waitFor(getDriver().findElement(By.xpath("//select[@id='selTrapType']/option[@value='"+fieldValue+"']"))).withTimeoutOf(long_wait, TimeUnit.SECONDS).waitUntilClickable().click();
    }

    public void fillGatewayvalue(String gateWayvalue) {

        waitABit(elementloadWait);
        waitFor(getDriver().findElement(By.xpath("//select[@id='selAddMappingValue']/option[@value='"+gateWayvalue+"']"))).withTimeoutOf(long_wait, TimeUnit.SECONDS).waitUntilClickable().click();
    }

    public void addTraptypeMappingbtn() {

        waitABit(elementloadWait);
        waitFor(trapTypemappingSavebtn).withTimeoutOf(long_wait, TimeUnit.SECONDS).waitUntilClickable().click();
        waitForAbsenceOf(loader).withTimeoutOf(long_wait,TimeUnit.SECONDS);



    }

    public void trapTypemappingSearchfield(String entry) {

        waitABit(elementloadWait);
        waitFor(trapTrapsearch).withTimeoutOf(long_wait, TimeUnit.SECONDS).sendKeys(entry);
    }

    public void trapTypeeditBtn() {

        waitABit(elementloadWait);
        waitFor(trapTypeeditBtn).withTimeoutOf(long_wait, TimeUnit.SECONDS).waitUntilClickable().click();
        waitABit(elementloadWait);
        waitFor(trapTypeditTabbox).withTimeoutOf(long_wait, TimeUnit.SECONDS).waitUntilVisible(); }

    public void trapTypeupdateBtn() {

        waitABit(elementloadWait);
        waitFor(trapTypeupdateBtn).withTimeoutOf(long_wait, TimeUnit.SECONDS).waitUntilClickable().click();
        waitForAbsenceOf(loader).withTimeoutOf(long_wait,TimeUnit.SECONDS);

    }

    public void trapTypedelete() {

        waitABit(elementloadWait);
        waitFor(trapTypedeleteBtn).withTimeoutOf(long_wait, TimeUnit.SECONDS).waitUntilClickable().click();
        waitABit(elementloadWait);
        waitFor(confirmDelete1).withTimeoutOf(long_wait, TimeUnit.SECONDS).waitUntilClickable().click();
        waitForAbsenceOf(loader).withTimeoutOf(long_wait,TimeUnit.SECONDS);

    }

    public void larvicidingStatus(String status) {

        waitABit(elementloadWait);
        waitFor(getDriver().findElement(By.xpath("//select[@id='selProduct_Active']/option[text()='"+status+"']"))).withTimeoutOf(long_wait, TimeUnit.SECONDS).waitUntilClickable().click();

    }

    public void larvicingHideinactive() {

        waitABit(elementloadWait);
        waitFor(hideInactivecheckBox).withTimeoutOf(long_wait, TimeUnit.SECONDS).waitUntilClickable().click();
    }

    public void larvicingActiveentries(String status) {

        int row = getDriver().findElements(By.xpath("(//table[@id='LarvicidingMainGD']/tbody/tr[@role='row'])")).size();
        System.out.println(row);
        for (int i = 1; i <= row; i++) {
            String entry = getDriver().findElement(By.xpath("//table[@id='LarvicidingMainGD']/tbody/tr[" + i + "]/td[17]")).getText();
            System.out.println(entry);
            Assert.assertEquals(status, entry);

        }
    }

    public void verifyActivestatus(String status) {

        String entry = getDriver().findElement(By.xpath("//table[@id='LarvicidingMainGD']/tbody/tr[1]/td[17]")).getText();
        Assert.assertEquals(status, entry);

    }

    public void checkInactivecheckbox() {

        waitABit(elementloadWait);
        waitFor(hideInactivecheckBox).withTimeoutOf(long_wait, TimeUnit.SECONDS).waitUntilClickable().click();
    }

    public void noRecordfound(String message) {

        waitABit(elementloadWait);
        String noRecordmessage=waitFor(noRecordfound).withTimeoutOf(long_wait, TimeUnit.SECONDS).getText();
        Assert.assertEquals(noRecordmessage,message);
    }

    public void ulvStatus(String status) {

        String entry = getDriver().findElement(By.xpath("//table[@id='LarvicidingMainGD']/tbody/tr[1]/td[17]")).getText();
        Assert.assertEquals(status, entry);
    }

    public void technicianActivestatus(String status) {

        String entry = getDriver().findElement(By.xpath("//table[@id='TechnicianMainGD']/tbody/tr[1]/td[10]")).getText();
        Assert.assertEquals(status, entry);
    }

    public void setTechnicianstatus(String status) {

        waitABit(elementloadWait);
        waitFor(getDriver().findElement(By.xpath("//select[@id='selTechnician_Active']/option[text()='"+status+"']"))).withTimeoutOf(long_wait, TimeUnit.SECONDS).waitUntilClickable().click();


    }

    public void technicianCheckbox() {

        waitABit(elementloadWait);
        waitFor(technicianHideinactiveCheckbox).withTimeoutOf(long_wait, TimeUnit.SECONDS).waitUntilClickable().click();

    }

    public void gatewaySearchfield(String entry) {

        waitABit(elementloadWait);
        waitFor(gatewaySearchfield).withTimeoutOf(long_wait, TimeUnit.SECONDS).sendKeys(entry);

    }

    public void gatewayFirstentryEditbutton() {

        waitABit(elementloadWait);
        waitFor(gatewayFirstentryEditbutton).withTimeoutOf(long_wait, TimeUnit.SECONDS).waitUntilClickable().click();
        waitFor(editGatewayinformationBox).withTimeoutOf(long_wait, TimeUnit.SECONDS).waitUntilVisible();


    }

    public void gatewayState(String state) {

        waitABit(elementloadWait);
        waitFor(gatewayStatefield).clear();
        waitFor(gatewayStatefield).withTimeoutOf(long_wait, TimeUnit.SECONDS).sendKeys(state);
    }

    public void confirmBtn() {
        waitABit(elementloadWait);
        waitFor(gatewayConfirmbtn).withTimeoutOf(long_wait, TimeUnit.SECONDS).waitUntilClickable().click();
        waitForAbsenceOf(loader).withTimeoutOf(long_wait,TimeUnit.SECONDS);

    }

    public void gatewaySynctab() {

        waitABit(elementloadWait);
        waitFor(gatewaySynctab).withTimeoutOf(long_wait, TimeUnit.SECONDS).waitUntilClickable().click();
    }

    public void addFlock() {

        waitABit(elementloadWait);
        waitFor(addFlockbtn).withTimeoutOf(long_wait, TimeUnit.SECONDS).waitUntilClickable().click();
    }

    public void flockSite() {

        waitABit(elementloadWait);
        waitFor(addFlockbtn).withTimeoutOf(long_wait, TimeUnit.SECONDS).waitUntilVisible();
        waitABit(elementloadWait);
        waitFor(flockSite).withTimeoutOf(long_wait, TimeUnit.SECONDS).waitUntilClickable().click();
    }

    public void selectBands() {
        waitABit(elementloadWait);
        waitFor(selectBand).withTimeoutOf(long_wait, TimeUnit.SECONDS).waitUntilClickable().click();
        waitABit(elementloadWait);
        waitFor(moveBand).withTimeoutOf(long_wait, TimeUnit.SECONDS).waitUntilClickable().click();
    }

    public void addFlocksaveBtn() {

        waitABit(elementloadWait);
        waitFor(addFlocksaveBtn).withTimeoutOf(long_wait, TimeUnit.SECONDS).waitUntilClickable().click();
    }

    public void sentinalFlocktab() {

        waitABit(elementloadWait);
        waitFor(sentinalFlocktab).withTimeoutOf(long_wait, TimeUnit.SECONDS).waitUntilClickable().click();
    }
}
