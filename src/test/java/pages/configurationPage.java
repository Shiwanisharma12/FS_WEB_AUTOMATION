package pages;

import com.typesafe.config.Config;
import net.thucydides.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utilities.ConfigLoader;
import utilities.RandomGenerator;

import java.util.concurrent.TimeUnit;

public class configurationPage extends PageObject {

    Config config = ConfigLoader.load();
    int pageloadWait = Integer.parseInt(config.getString("Page_Load_Time"));
    int elementloadWait = Integer.parseInt(config.getString("Element_Load_Time"));
    int long_wait = Integer.parseInt(config.getString("Element_Load_Time"));

    @FindBy(xpath = "//span[text()='Configuration']")
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
    private WebElement larvicingNamefield;
    @FindBy(xpath = "//input[@id='txtProductName']")
    private WebElement uavNamefield;
    @FindBy(xpath = "//input[@id='txtProduct_Value']")
    private WebElement larvicingValuefield;
    @FindBy(xpath = "//input[@id='txtProduct_Value']")
    private WebElement uavValuefield;
    @FindBy(xpath = "//input[@id='txtProduct_Duration']")
    private WebElement larvicingDurationfield;
    @FindBy(xpath = "//input[@id='txtProduct_Duration']")
    private WebElement uavDurationfield;
    @FindBy(xpath = "//input[@id='txtProduct_LRange']")
    private WebElement larvicingLrangefield;
    @FindBy(xpath = "//input[@id='txtProduct_LRange']")
    private WebElement uavLrangefield;
    @FindBy(xpath = "//input[@id='txtProduct_HRange']")
    private WebElement larvicidingHrangefield;
    @FindBy(xpath = "//input[@id='txtProduct_HRange']")
    private WebElement uavHrangefield;
    @FindBy(xpath = "//input[@id='txtProduct_ChemregNo']")
    private WebElement larvicingChemregNo;
    @FindBy(xpath = "//input[@id='txtProduct_ChemregNo']")
    private WebElement uavChemregNo;
    @FindBy(xpath = "//button[@id='btnSave_Product']")
    private WebElement larvicidingSavebutton;
    @FindBy(xpath = "(//input[@type='search'])[2]")
    private WebElement larvidingSearchfield;
    @FindBy(xpath = "(//input[@type='search'])[4]")
    private WebElement gatewaySearchfield;
    @FindBy(xpath = "//table[@id='LarvicidingMainGD']/tbody/tr[1]/td[18]/a/i[@class='fa fa-edit']")
    private WebElement larvicingFirstentryEditbutton;
    @FindBy(xpath = "//h4[text()='Edit Product']")
    private WebElement editLarvicidingproductDialogBox;
    @FindBy(xpath = "//button[@id='btnSave_Product']")
    private WebElement larvicingUpdatebtn;
    @FindBy(xpath = "//input[@id='txtProduct_MixRate']")
    private WebElement mixrateField;
    @FindBy(xpath = "//input[@id='txtProduct_AI1']")
    private WebElement AIField;
    @FindBy(xpath = "//select[@id='selProduct_Diluent']/option[@value='Oil']")
    private WebElement dilutent;
    @FindBy(xpath = "//a[text()='Technician']")
    private WebElement technicianTab;
    @FindBy(xpath = "//button[@id='btnAdd_Technicain']")
    private WebElement technicianTabaddBtn;
    @FindBy(xpath = "//h4[@id='lblHeading_Technician']")
    private WebElement addTechnicianbox;
    @FindBy(xpath = "//input[@id='txtTechnicianName']")
    private WebElement technicianTabnameField;
    @FindBy(xpath = "//button[@id='btnSave_Technician']")
    private WebElement technicianSavebtn;
    @FindBy(xpath = "//button[@id='btnSave_Technician']")
    private WebElement technicianUpdatebtn;
    @FindBy(xpath = "(//input[@type='search'])[3]")
    private WebElement technicianSearchfield;
    @FindBy(xpath = "(//i[@class='fa fa-edit'])[31]")
    private WebElement technicianTabfirstEntry;
    @FindBy(xpath = "//a[@href='#tab6TrapTypeMapping']")
    private WebElement trapTypemappingTab;
    @FindBy(xpath = "//button[@id='btnOpen_TrapType']")
    private WebElement trapTypemappingTabaddBtn;
    @FindBy(xpath = "//h4[text()='Add Trap Type Mapping']")
    private WebElement trapTypemappingTabbox;
    @FindBy(xpath = "//h4[@id='hdrAddTrapType']")
    private WebElement trapTypeditTabbox;
    @FindBy(xpath = "//button[@id='btnAdd_TrapType']")
    private WebElement trapTypemappingSavebtn;
    @FindBy(xpath = "(//input[@type='search'])[5]")
    private WebElement trapTrapsearch;
    @FindBy(xpath = "//table[@id='TrapTypeTable']/tbody/tr[1]/td[3]/a/i[@class='fa fa-edit']")
    private WebElement trapTypeeditBtn;
    @FindBy(xpath = "//button[@id='btnAdd_TrapType']")
    private WebElement trapTypeupdateBtn;
    @FindBy(xpath = "//table[@id='TrapTypeTable']/tbody/tr[1]/td[3]/a[2]/i[@class='fa fa-trash']")
    private WebElement trapTypedeleteBtn;
    @FindBy(xpath = "//button[@id='btnAdd_DeleteTrapType']")
    private WebElement confirmDelete1;
    private static String loader = "//div[@id='loading-img']";
    @FindBy(xpath = "//select[@id='selProduct_Active']/option[text()='True']")
    private WebElement larvicidingStatus;
    @FindBy(xpath = "//input[@id='chkActive_Product']")
    private WebElement hideInactivecheckBox;
    @FindBy(xpath = "//td[text()='No matching records found']")
    private WebElement noRecordfound;
    @FindBy(xpath = "//input[@id='chkActive_Technician']")
    private WebElement technicianHideinactiveCheckbox;
    @FindBy(xpath = "//table[@id='GatewayReprsent']/tbody/tr[1]/td[6]/a/i[@class='fa fa-edit']")
    private WebElement gatewayFirstentryEditbutton;
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
        withTimeoutOf(long_wait, TimeUnit.SECONDS).waitFor(editAddlocationLayer).waitUntilClickable().click();
        waitABit(elementloadWait);
        withTimeoutOf(long_wait, TimeUnit.SECONDS).waitFor(editFieldSeekerconfigurationBox).waitUntilVisible();
    }

    public void configurationTab() {

        waitABit(elementloadWait);
        withTimeoutOf(long_wait, TimeUnit.SECONDS).waitFor(configurationTab).waitUntilClickable().click();
    }

    public void defaultValue(String defaultValue) {
        waitABit(elementloadWait);
        withTimeoutOf(long_wait, TimeUnit.SECONDS).waitFor(defaultValueinputField).clear();
        withTimeoutOf(long_wait, TimeUnit.SECONDS).waitFor(defaultValueinputField).sendKeys(defaultValue);
    }

    public void updateBtn() {

        waitABit(elementloadWait);
        withTimeoutOf(long_wait, TimeUnit.SECONDS).waitFor(updateButton).waitUntilClickable().click();
        withTimeoutOf(long_wait, TimeUnit.SECONDS).waitForAbsenceOf(loader);
    }

    public void updateSuccessmsg(String updateMsg) {

        withTimeoutOf(long_wait, TimeUnit.SECONDS).waitFor(getDriver().findElement(By.xpath("//div[text()='" + updateMsg + "']"))).isDisplayed();
        String msg = withTimeoutOf(long_wait, TimeUnit.SECONDS).waitFor(getDriver().findElement(By.xpath("//div[text()='" + updateMsg + "']"))).waitUntilVisible().getText();
        Assert.assertEquals(msg.trim(), updateMsg.trim());
    }

    public void firstConfigentry(String entry) {

        withTimeoutOf(long_wait, TimeUnit.SECONDS).waitFor(firstConfigEntry).waitUntilVisible();
        String msg = withTimeoutOf(long_wait, TimeUnit.SECONDS).waitFor(firstConfigEntry).getText();
        Assert.assertEquals(msg.trim(), entry.trim());
        waitFor(pageloadWait);

    }

    public void mosquitoSpeciestab() {

        waitABit(elementloadWait);
        withTimeoutOf(long_wait, TimeUnit.SECONDS).waitFor(mosquitoSpeciesTab).waitUntilClickable().click();
    }

    public void addConfigurationspeciesBtn() {
        waitABit(elementloadWait);
        withTimeoutOf(long_wait, TimeUnit.SECONDS).waitFor(addButtonmosquitoSpecies).waitUntilClickable().click();
        waitABit(elementloadWait);
        withTimeoutOf(long_wait, TimeUnit.SECONDS).waitFor(addMosquitospeciesbox).waitUntilVisible();

    }

    public void mosquitoSpeciesEntryname(String name) {

        waitABit(elementloadWait);
        withTimeoutOf(long_wait, TimeUnit.SECONDS).waitFor(entryName).clear();
        waitABit(elementloadWait);
        waitFor(entryName).withTimeoutOf(long_wait, TimeUnit.SECONDS).sendKeys(name + RandomGenerator.randomAlphanumeric(2));


    }

    public void saveMosquitospeciesEntry() throws InterruptedException {

        waitABit(elementloadWait);
        withTimeoutOf(long_wait, TimeUnit.SECONDS).waitFor(mosquitoSpeciesSavebutton).waitUntilClickable().click();
        withTimeoutOf(long_wait, TimeUnit.SECONDS).waitForAbsenceOf(loader);
    }

    public void searchConfigentry(String searchedEntry) {

        waitABit(elementloadWait);
        withTimeoutOf(long_wait, TimeUnit.SECONDS).waitFor(searchConfigentry).sendKeys(searchedEntry);
        waitABit(elementloadWait);

    }

    public void editMosquitospeciesEntryname(String name) {

        waitABit(elementloadWait);
        withTimeoutOf(long_wait, TimeUnit.SECONDS).waitFor(editMosquitospeciesBtn).waitUntilClickable().click();
        waitABit(elementloadWait);
        withTimeoutOf(long_wait, TimeUnit.SECONDS).waitFor(editMosquitospeciesBox).waitUntilVisible();
        waitABit(elementloadWait);
        withTimeoutOf(long_wait, TimeUnit.SECONDS).waitFor(mosquitoSpeciesEditedname).clear();
        waitFor(elementloadWait);
        withTimeoutOf(long_wait, TimeUnit.SECONDS).waitFor(mosquitoSpeciesEditedname).sendKeys(name + RandomGenerator.randomAlphanumeric(2));

    }

    public void editMosquitospeciesSavebtn() {
        waitABit(elementloadWait);
        withTimeoutOf(long_wait, TimeUnit.SECONDS).waitFor(mosquitoSpeciesSavebutton).waitUntilClickable().click();
        withTimeoutOf(long_wait, TimeUnit.SECONDS).waitForAbsenceOf(loader);

    }

    public void productTab() {

        waitABit(elementloadWait);
        withTimeoutOf(long_wait, TimeUnit.SECONDS).waitForAbsenceOf(loader);
        withTimeoutOf(long_wait, TimeUnit.SECONDS).waitFor(productTab).waitUntilClickable().click();
    }

    public void larvicidingTab() {

        waitABit(elementloadWait);
        withTimeoutOf(long_wait, TimeUnit.SECONDS).waitFor(larvicidingTab).waitUntilClickable().click();
    }

    public void addProductbutton() {

        waitABit(pageloadWait);
        withTimeoutOf(long_wait, TimeUnit.SECONDS).waitFor(addProductbutton).waitUntilClickable().click();

    }

    public void larvicidingAddproductDetails(String name,String value,String duration,String lrange,String hrange,String ChemregNo,String mixrate,String AI) {

        waitABit(elementloadWait);
        withTimeoutOf(long_wait, TimeUnit.SECONDS).waitFor(larvicingNamefield).clear();
        withTimeoutOf(long_wait, TimeUnit.SECONDS).waitFor(larvicingNamefield).sendKeys(name+RandomGenerator.randomAlphanumeric(2));
        waitABit(elementloadWait);
        withTimeoutOf(long_wait, TimeUnit.SECONDS).waitFor(larvicingValuefield).clear();
        withTimeoutOf(long_wait, TimeUnit.SECONDS).waitFor(larvicingValuefield).sendKeys(value+RandomGenerator.randomAlphanumeric(2));
        waitABit(elementloadWait);
        withTimeoutOf(long_wait, TimeUnit.SECONDS).waitFor(larvicingDurationfield).clear();
        withTimeoutOf(long_wait, TimeUnit.SECONDS).waitFor(larvicingDurationfield).sendKeys(duration);
        waitABit(elementloadWait);
        withTimeoutOf(long_wait, TimeUnit.SECONDS).waitFor(larvicingLrangefield).clear();
        withTimeoutOf(long_wait, TimeUnit.SECONDS).waitFor(larvicingLrangefield).sendKeys(lrange);
        waitABit(elementloadWait);
        withTimeoutOf(long_wait, TimeUnit.SECONDS).waitFor(larvicidingHrangefield).clear();
        withTimeoutOf(long_wait, TimeUnit.SECONDS).waitFor(larvicidingHrangefield).sendKeys(hrange);
        waitABit(elementloadWait);
        withTimeoutOf(long_wait, TimeUnit.SECONDS).waitFor(larvicingChemregNo).clear();
        withTimeoutOf(long_wait, TimeUnit.SECONDS).waitFor(larvicingChemregNo).sendKeys(ChemregNo);
        waitABit(elementloadWait);
        withTimeoutOf(long_wait, TimeUnit.SECONDS).waitFor(mixrateField).clear();
        withTimeoutOf(long_wait, TimeUnit.SECONDS).waitFor(mixrateField).sendKeys(mixrate);
        waitABit(elementloadWait);
        withTimeoutOf(long_wait, TimeUnit.SECONDS).waitFor(AIField).clear();
        withTimeoutOf(long_wait, TimeUnit.SECONDS).waitFor(AIField).sendKeys(AI);

    }

    public void larvicidingSavebutton() {

        waitABit(elementloadWait);
        withTimeoutOf(long_wait, TimeUnit.SECONDS).waitFor(larvicidingSavebutton).waitUntilClickable().click();
        withTimeoutOf(long_wait, TimeUnit.SECONDS).waitForAbsenceOf(loader);

    }

    public void areaValue(String areaValue) {

        waitABit(elementloadWait);
        withTimeoutOf(long_wait, TimeUnit.SECONDS).waitFor(getDriver().findElement(By.xpath("//option[@value='" + areaValue + "']"))).waitUntilClickable().click();

    }

    public void searchlarvicingEntry(String name) {

        waitABit(elementloadWait);
        withTimeoutOf(long_wait, TimeUnit.SECONDS).waitFor(larvidingSearchfield).sendKeys(name);
    }

    public void larvicidingFirstentryEditbutton() {

        waitABit(pageloadWait);
        withTimeoutOf(long_wait, TimeUnit.SECONDS).waitFor(larvicingFirstentryEditbutton).waitUntilClickable().click();
        waitABit(elementloadWait);
        withTimeoutOf(long_wait, TimeUnit.SECONDS).waitFor(editLarvicidingproductDialogBox).waitUntilVisible();
    }

    public void larvicidingMeasureValue(String measureValue) {

        waitABit(elementloadWait);
        withTimeoutOf(long_wait, TimeUnit.SECONDS).waitFor(getDriver().findElement(By.xpath("//option[@value='" + measureValue + "']"))).waitUntilClickable().click();

    }

    public void larvicidingUpdatebtn() {

        waitABit(elementloadWait);
        withTimeoutOf(long_wait, TimeUnit.SECONDS).waitFor(larvicingUpdatebtn).waitUntilClickable().click();
        withTimeoutOf(long_wait, TimeUnit.SECONDS).waitForAbsenceOf(loader);


    }

    public void ulvTab() {

        waitABit(elementloadWait);
        withTimeoutOf(long_wait, TimeUnit.SECONDS).waitFor(ulvTab).waitUntilClickable().click();
    }

    public void diluent(String diluentValue) {

        waitABit(elementloadWait);
        withTimeoutOf(long_wait, TimeUnit.SECONDS).waitFor(dilutent).waitUntilClickable().click();
    }

    public void UAVAddproductDetails(String name, String value, String duration, String lrange, String hrange, String chemregNo, String mixrate, String ai) {

        waitABit(elementloadWait);
        withTimeoutOf(long_wait, TimeUnit.SECONDS).waitFor(uavNamefield).clear();
        waitFor(uavNamefield).withTimeoutOf(long_wait, TimeUnit.SECONDS).sendKeys(name);
        waitABit(elementloadWait);
        withTimeoutOf(long_wait, TimeUnit.SECONDS).waitFor(uavValuefield).clear();
        withTimeoutOf(long_wait, TimeUnit.SECONDS).waitFor(uavValuefield).sendKeys(value);
        waitABit(elementloadWait);
        withTimeoutOf(long_wait, TimeUnit.SECONDS).waitFor(uavDurationfield).clear();
        withTimeoutOf(long_wait, TimeUnit.SECONDS).waitFor(uavDurationfield).sendKeys(duration);
        waitABit(elementloadWait);
        withTimeoutOf(long_wait, TimeUnit.SECONDS).waitFor(uavLrangefield).clear();
        withTimeoutOf(long_wait, TimeUnit.SECONDS).waitFor(uavLrangefield).sendKeys(lrange);
        waitABit(elementloadWait);
        withTimeoutOf(long_wait, TimeUnit.SECONDS).waitFor(uavHrangefield).clear();
        withTimeoutOf(long_wait, TimeUnit.SECONDS).waitFor(uavHrangefield).sendKeys(hrange);
        waitABit(elementloadWait);
        withTimeoutOf(long_wait, TimeUnit.SECONDS).waitFor(uavChemregNo).clear();
        withTimeoutOf(long_wait, TimeUnit.SECONDS).waitFor(uavChemregNo).sendKeys(chemregNo);
        waitABit(elementloadWait);
        withTimeoutOf(long_wait, TimeUnit.SECONDS).waitFor(mixrateField).clear();
        withTimeoutOf(long_wait, TimeUnit.SECONDS).waitFor(mixrateField).sendKeys(mixrate);
        waitABit(elementloadWait);
        withTimeoutOf(long_wait, TimeUnit.SECONDS).waitFor(AIField).clear();
        withTimeoutOf(long_wait, TimeUnit.SECONDS).waitFor(AIField).sendKeys(ai);

    }

    public void technicianTab() {

        waitABit(pageloadWait);
        withTimeoutOf(long_wait, TimeUnit.SECONDS).waitFor(technicianTab).waitUntilClickable().click();
    }

    public void technicianTabaddBtn() {

        waitABit(elementloadWait);
        withTimeoutOf(long_wait, TimeUnit.SECONDS).waitFor(technicianTabaddBtn).waitUntilClickable().click();
        withTimeoutOf(long_wait, TimeUnit.SECONDS).waitFor(addTechnicianbox).waitUntilVisible();
    }

    public void technicianNamefield(String name) {

        waitABit(elementloadWait);
        withTimeoutOf(long_wait, TimeUnit.SECONDS).waitFor(technicianTabnameField).clear();
        withTimeoutOf(long_wait, TimeUnit.SECONDS).waitFor(technicianTabnameField).sendKeys(name);
    }

    public void technicianSavebtn() {
        waitABit(elementloadWait);
        withTimeoutOf(long_wait, TimeUnit.SECONDS).waitFor(technicianSavebtn).waitUntilClickable().click();
        withTimeoutOf(long_wait, TimeUnit.SECONDS).waitForAbsenceOf(loader);

    }

    public void technicianUpdatebtn() {

        waitABit(elementloadWait);
        withTimeoutOf(long_wait, TimeUnit.SECONDS).waitFor(technicianUpdatebtn).waitUntilClickable().click();
        withTimeoutOf(long_wait, TimeUnit.SECONDS).waitForAbsenceOf(loader);

    }

    public void technicianSerachfield(String name) {

        waitABit(elementloadWait);
        withTimeoutOf(long_wait, TimeUnit.SECONDS).waitFor(technicianSearchfield).sendKeys(name);
    }

    public void technicianTabfirstEntry() {

        waitABit(elementloadWait);
        withTimeoutOf(long_wait, TimeUnit.SECONDS).waitFor(technicianTabfirstEntry).waitUntilClickable().click();
    }

    public void trapTypemappingTab() {

        waitABit(elementloadWait);
        withTimeoutOf(long_wait, TimeUnit.SECONDS).waitFor(trapTypemappingTab).waitUntilClickable().click();
    }

    public void trapTypemappingTabaddBtn() {

        waitABit(elementloadWait);
        withTimeoutOf(long_wait, TimeUnit.SECONDS).waitFor(trapTypemappingTabaddBtn).waitUntilClickable().click();
        waitABit(elementloadWait);
        withTimeoutOf(long_wait, TimeUnit.SECONDS).waitFor(trapTypemappingTabbox).waitUntilVisible();
    }

    public void fieldSeekertrapType(String fieldValue) {

        waitABit(elementloadWait);
        withTimeoutOf(long_wait, TimeUnit.SECONDS).waitFor(getDriver().findElement(By.xpath("//select[@id='selTrapType']/option[@value='" + fieldValue + "']"))).waitUntilClickable().click();
    }

    public void fillGatewayvalue(String gateWayvalue) {

        waitABit(elementloadWait);
        withTimeoutOf(long_wait, TimeUnit.SECONDS).waitFor(getDriver().findElement(By.xpath("//select[@id='selAddMappingValue']/option[@value='" + gateWayvalue + "']"))).waitUntilClickable().click();
    }

    public void addTraptypeMappingbtn() {

        waitABit(elementloadWait);
        withTimeoutOf(long_wait, TimeUnit.SECONDS).waitFor(trapTypemappingSavebtn).waitUntilClickable().click();
        withTimeoutOf(long_wait, TimeUnit.SECONDS).waitForAbsenceOf(loader);


    }

    public void trapTypemappingSearchfield(String entry) {

        waitABit(elementloadWait);
        withTimeoutOf(long_wait, TimeUnit.SECONDS).waitFor(trapTrapsearch).sendKeys(entry);
    }

    public void trapTypeeditBtn() {

        waitABit(elementloadWait);
        withTimeoutOf(long_wait, TimeUnit.SECONDS).waitFor(trapTypeeditBtn).waitUntilClickable().click();
        waitABit(elementloadWait);
        withTimeoutOf(long_wait, TimeUnit.SECONDS).waitFor(trapTypeditTabbox).waitUntilVisible();
    }

    public void trapTypeupdateBtn() {

        waitABit(elementloadWait);
        withTimeoutOf(long_wait, TimeUnit.SECONDS).waitFor(trapTypeupdateBtn).waitUntilClickable().click();
        withTimeoutOf(long_wait, TimeUnit.SECONDS).waitForAbsenceOf(loader);

    }

    public void trapTypedelete() {

        waitABit(elementloadWait);
        withTimeoutOf(long_wait, TimeUnit.SECONDS).waitFor(trapTypedeleteBtn).waitUntilClickable().click();
        waitABit(elementloadWait);
        withTimeoutOf(long_wait, TimeUnit.SECONDS).waitFor(confirmDelete1).waitUntilClickable().click();
        withTimeoutOf(long_wait, TimeUnit.SECONDS).waitForAbsenceOf(loader);

    }

    public void larvicidingStatus(String status) {

        waitABit(elementloadWait);
        withTimeoutOf(long_wait, TimeUnit.SECONDS).waitFor(getDriver().findElement(By.xpath("//select[@id='selProduct_Active']/option[text()='" + status + "']"))).waitUntilClickable().click();

    }

    public void larvicingHideinactive() {

        waitABit(elementloadWait);
        withTimeoutOf(long_wait, TimeUnit.SECONDS).waitFor(hideInactivecheckBox).waitUntilClickable().click();
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
        withTimeoutOf(long_wait, TimeUnit.SECONDS).waitFor(hideInactivecheckBox).waitUntilClickable().click();
    }

    public void noRecordfound(String message) {

        waitABit(elementloadWait);
        String noRecordmessage = waitFor(noRecordfound).withTimeoutOf(long_wait, TimeUnit.SECONDS).getText();
        Assert.assertEquals(noRecordmessage, message);
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
        withTimeoutOf(long_wait, TimeUnit.SECONDS).waitFor(getDriver().findElement(By.xpath("//select[@id='selTechnician_Active']/option[text()='" + status + "']"))).waitUntilClickable().click();


    }

    public void technicianCheckbox() {

        waitABit(elementloadWait);
        withTimeoutOf(long_wait, TimeUnit.SECONDS).waitFor(technicianHideinactiveCheckbox).waitUntilClickable().click();

    }

    public void gatewaySearchfield(String entry) {

        waitABit(elementloadWait);
        withTimeoutOf(long_wait, TimeUnit.SECONDS).waitFor(gatewaySearchfield).sendKeys(entry);

    }

    public void gatewayFirstentryEditbutton() {

        waitABit(elementloadWait);
        withTimeoutOf(long_wait, TimeUnit.SECONDS).waitFor(gatewayFirstentryEditbutton).waitUntilClickable().click();
        withTimeoutOf(long_wait, TimeUnit.SECONDS).waitFor(editGatewayinformationBox).waitUntilVisible();


    }

    public void gatewayState(String state) {

        waitABit(elementloadWait);
        withTimeoutOf(long_wait, TimeUnit.SECONDS).waitFor(gatewayStatefield).clear();
        withTimeoutOf(long_wait, TimeUnit.SECONDS).waitFor(gatewayStatefield).withTimeoutOf(long_wait, TimeUnit.SECONDS).sendKeys(state);
    }

    public void confirmBtn() {
        waitABit(elementloadWait);
        withTimeoutOf(long_wait, TimeUnit.SECONDS).waitFor(gatewayConfirmbtn).waitUntilClickable().click();
        withTimeoutOf(long_wait, TimeUnit.SECONDS).waitForAbsenceOf(loader);

    }

    public void gatewaySynctab() {

        waitABit(elementloadWait);
        withTimeoutOf(long_wait, TimeUnit.SECONDS).waitFor(gatewaySynctab).waitUntilClickable().click();
    }

    public void addFlock() {

        waitABit(elementloadWait);
        withTimeoutOf(long_wait, TimeUnit.SECONDS).waitFor(addFlockbtn).waitUntilClickable().click();
    }

    public void flockSite() {

        waitABit(elementloadWait);
        withTimeoutOf(long_wait, TimeUnit.SECONDS).waitFor(addFlockbtn).waitUntilVisible();
        waitABit(elementloadWait);
        withTimeoutOf(long_wait, TimeUnit.SECONDS).waitFor(flockSite).waitUntilClickable().click();
    }

    public void selectBands() {
        waitABit(elementloadWait);
        withTimeoutOf(long_wait, TimeUnit.SECONDS).waitFor(selectBand).waitUntilClickable().click();
        waitABit(elementloadWait);
        withTimeoutOf(long_wait, TimeUnit.SECONDS).waitFor(moveBand).waitUntilClickable().click();
    }

    public void addFlocksaveBtn() {

        waitABit(elementloadWait);
        withTimeoutOf(long_wait, TimeUnit.SECONDS).waitFor(addFlocksaveBtn).waitUntilClickable().click();
    }

    public void sentinalFlocktab() {

        waitABit(elementloadWait);
        withTimeoutOf(long_wait, TimeUnit.SECONDS).waitFor(sentinalFlocktab).waitUntilClickable().click();
    }
}
