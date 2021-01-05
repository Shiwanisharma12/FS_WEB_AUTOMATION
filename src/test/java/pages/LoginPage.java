package pages;

import com.typesafe.config.Config;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.yecht.Data;
import utilities.ConfigLoader;

import java.util.Set;
import java.util.concurrent.TimeUnit;

public class LoginPage extends PageObject {
    private static final String logo = "//img[@src='Content/images/home/app-logo-main-white.png']";
    @FindBy(xpath = "//button[text()='Login']")
    WebElement loginButton;
    private static final String username = "//input[@id='user_username']";
    private static final String password = "//input[@id='user_password']";
    private static final String cancel = "//button[text()='Cancel']";
    private static final String signIn = " //button[@id='signIn']";
    private static final String signIndisplay = "//div[text()='Sign In']";
    private static final String checkbox = "(//input[@type='checkbox'])[1]";
    private static final String blankUsernameError = "//div[text()='A valid username is required']";
    private static final String blankPasswordError = "//div[text()='A valid password is required']";
    private static final String facebook = "//div[@aria-label='Sign in with Facebook']";
    private static final String github = "//div[@aria-label='Sign in with GitHub']";
    private static final String google = "//div[@aria-label='Sign in with Google']";
    private static final String apple = "//div[@aria-label='Sign in with Apple']";
    private static final String invalidCredentialerror = "//div[text()='Invalid username or password.']";
    private static final String version = "//h2[text()='FieldSeeker GIS Version : ']";
    private static final String versionValue = "//span[@id='spnAppVersion']";
    private static final String build = "//h4[@class='version-titleB']";
    private static final String buildDate = "//h5[@class='version-titleC']";
    private static final String signInwithText = "(//div[@class='accordion-title'])[1]";
    private static final String signInwithArcgis = "//span[text()='Sign in to ArcGIS Enterprise with']";
    private static final String arcgisLogin = "//div[@class='accordion-title']";
    private static final String buildDatevalue = "//span[@id='spnBuildDate']";
    private static final String serviceRequestheading = "(//span[text()='Service Requests'])[1]";
    private static final String serviceRequeatpiechart = "//canvas[@id='canvasPie']";
    private static final String inspectionDisplay = "//span[text()='Inspections']";
    private static final String inspectionGraph = "//canvas[@id='canvasInspections']";
    private static final String productTreatmentDisplay = "//span[text()='Product Treatment Acres']";
    private static final String productTreatmentGraph = "//canvas[@id='canvasTreatments']";
    private static final String acresTreatedgraph = "//canvas[@id='canvasTreatmentAreas']";
    @FindBy(xpath = "(//div[@class='toolsBox'])[1]")
    private WebElement mapReview;
    private static final String blank = "/html/body";
    private static final String serviceRequestButton = "(//div[@class='toolsBox'])[2]";
    private static final String buildNo = "//span[@id='spnBuildNo']";
    @FindBy(xpath = "(//div[@class='toolsBox'])[3]")
    private WebElement labtoolButton;
    private static final String productInventorybutton = "(//div[@class='toolsBox'])[5]";
    private static final String proposedTreatmentButton = "(//div[@class='toolsBox'])[6]";
    private static final String configuration = "(//div[@class='toolsBox'])[7]";
    private static final String maintainanceMapdisplay = "(//div[@class='toolsBox'])[9]";
    private static final String gateway = "(//div[@class='toolsBox'])[10]";
    private static final String userDatareview = "(//div[@class='toolsBox'])[11]";
    private static final String enterpriseDatareview = "(//div[@class='toolsBox'])[10]";
    private static final String logout = "//i[@class='fa fa-power-off']";
    private static final String forgotUsername = "//a[text()='Forgot username?']";
    private static final String forgotPassword = "//a[text()='Forgot password?']";
    private static final String privacy = "//div[@class='privacy-link']";
    private static final String arcgisOrganizationUrl = "(//div[@class='accordion-title'])[2]";
    private static final String loader = "//div[@id='loading-img']";


    Config config = ConfigLoader.load();
    int pageloadWait = Integer.parseInt(config.getString("Page_Load_Time"));
    int elementloadWait = Integer.parseInt(config.getString("Element_Load_Time"));
    int long_wait = Integer.parseInt(config.getString("Element_Load_Time"));


    public void navigateTourl()
    {
        waitFor(elementloadWait);
        openUrl(config.getString("base_url"));
        openUrl(config.getString("base_url"));

//        getDriver().manage().window().maximize();
        getDriver().manage().window().setSize(new Dimension(1920, 1080));

    }

    public void fieldSeekerLogo() {

        getDriver().findElement(By.xpath(logo)).isDisplayed();
    }

    public void signInbutton() {
        getDriver().findElement(By.xpath(signIndisplay)).isDisplayed();
    }

    public void loginButton() {

        waitABit(elementloadWait);
        waitFor(loginButton).withTimeoutOf(long_wait,TimeUnit.SECONDS).isDisplayed();
    }


    public void windowSwitch() throws InterruptedException {
        Thread.sleep(5000);
        Set<String> windows = getDriver().getWindowHandles();
        for (String ws : windows)
        {
            getDriver().switchTo().window(ws);
        }
    }

    public void usernameDisplay() {

        getDriver().findElement(By.xpath(username)).isDisplayed();
    }

    public void passwordDisplay() {

        getDriver().findElement(By.xpath(password)).isDisplayed();
    }

    public void cancelDisplay() {
        getDriver().findElement(By.xpath(cancel)).isDisplayed();

    }

    public void signIndisplay() {

        getDriver().findElement(By.xpath(signIn)).isDisplayed();
    }

    public void signIncheckbox() {

        getDriver().findElement(By.xpath(checkbox)).isDisplayed();
    }

    public void password() {
        waitABit(2000);
        String PWD = config.getString("Password");
        getDriver().findElement(By.xpath(password)).sendKeys(PWD);
    }


    public void blankUsernameError(String blankUsername) {

        getDriver().findElement(By.xpath(blankUsernameError)).isDisplayed();
        String text = getDriver().findElement(By.xpath(blankUsernameError)).getText();
        Assert.assertEquals(text.trim(), blankUsername.trim());
    }

    public void signIn() {

        getDriver().findElement(By.xpath(signIn)).click();
        waitABit(elementloadWait);
    }

    public void login() {

        waitABit(pageloadWait);
        withTimeoutOf(long_wait,TimeUnit.SECONDS).waitFor(loginButton).waitUntilClickable().click();
    }

    public void username() throws InterruptedException {

        windowSwitch();
        String UN = config.getString("Username");
        getDriver().findElement(By.xpath(username)).sendKeys(UN);
    }

    public void blankPasswordError(String blankPassword)
    {
        getDriver().findElement(By.xpath(blankPasswordError)).isDisplayed();
        String text = getDriver().findElement(By.xpath(blankPasswordError)).getText();
        Assert.assertEquals(text.trim(), blankPassword.trim());

    }

    public void cancel() throws InterruptedException {

        getDriver().findElement(By.xpath(cancel)).click();
        windowSwitch();
    }

    public void githubLink() {
        getDriver().findElement(By.xpath(github)).isDisplayed();

    }

    public void facebookLink() {

        getDriver().findElement(By.xpath(facebook)).isDisplayed();

    }

    public void googleLink() {
        getDriver().findElement(By.xpath(google)).isDisplayed();

    }

    public void appleLink() {
        getDriver().findElement(By.xpath(apple)).isDisplayed();

    }


    public void incorrectUsername() {

        getDriver().findElement(By.xpath(username)).sendKeys("Shiwani511998");

    }

    public void incorrectPassword() {
        getDriver().findElement(By.xpath(password)).sendKeys("sjshdjsks");
    }

    public void invalidCredentialserrorMessage(String message) {

        getDriver().findElement(By.xpath(invalidCredentialerror)).isDisplayed();
        String text = getDriver().findElement(By.xpath(invalidCredentialerror)).getText();
        Assert.assertEquals(text.trim(), message.trim());
    }

    public void serviveRequestDisplay() throws InterruptedException {
        waitABit(elementloadWait);
        windowSwitch();
        getDriver().findElement(By.xpath(serviceRequestheading)).isDisplayed();
    }

    public void serviceRequestpieChart() {

        getDriver().findElement(By.xpath(serviceRequeatpiechart)).isDisplayed();
    }

    public void inspectionDisplay() {
        getDriver().findElement(By.xpath(inspectionDisplay)).isDisplayed();

    }


    public void inspectionGraph() {
        getDriver().findElement(By.xpath(inspectionGraph)).isDisplayed();

    }

    public void productTreatmentDisplay() {

        getDriver().findElement(By.xpath(productTreatmentDisplay)).isDisplayed();


    }
    public void productTreatmentGraph() {

        getDriver().findElement(By.xpath(productTreatmentGraph)).isDisplayed();

    }

    public void acresTreatedsectionDisplay() {

        getDriver().findElement(By.xpath(productTreatmentGraph)).isDisplayed();

    }

    public void acresTreatedgraph() {
        waitABit(elementloadWait);
        getDriver().findElement(By.xpath(acresTreatedgraph)).isDisplayed();

    }

    public void mapReviewDisplay() {

        waitForAbsenceOf(loader).withTimeoutOf(60, TimeUnit.SECONDS);
        waitABit(5000);
        waitFor(mapReview).withTimeoutOf(20, TimeUnit.SECONDS).isDisplayed();

    }

    public void labToolsDisplay() {


        waitABit(pageloadWait);
        waitFor(labtoolButton).withTimeoutOf(20, TimeUnit.SECONDS).isDisplayed();
    }

    public void productInventorydisplay() {

        getDriver().findElement(By.xpath(productInventorybutton)).isDisplayed();

    }

    public void proposedTreatmentareaDisplay() {

        getDriver().findElement(By.xpath(proposedTreatmentButton)).isDisplayed();
    }

    public void configurationDisplay() {

        getDriver().findElement(By.xpath(configuration)).isDisplayed();

    }

    public void maintainanceMapdisplay() {

        getDriver().findElement(By.xpath(maintainanceMapdisplay)).isDisplayed();
    }

    public void gatewaySyncdisplay() {

        if (ConfigLoader.environment.equals("user")) {
            getDriver().findElement(By.xpath(gateway)).isDisplayed();
        }


    }

    public void dataReviewdisplay() {

        if (ConfigLoader.environment.equals("user")) {
            getDriver().findElement(By.xpath(userDatareview)).isDisplayed();
        } else if (ConfigLoader.environment.equals("enterprise")) {
            getDriver().findElement(By.xpath(enterpriseDatareview)).isDisplayed();
        }

    }

    public void serviceRequestbuttonDisplay() {

        getDriver().findElement(By.xpath(serviceRequestButton)).isDisplayed();

    }

    public void logout() {

        waitABit(elementloadWait);
        getDriver().findElement(By.xpath(logout)).click();

    }

    public void version() {

        getDriver().findElement(By.xpath(LoginPage.version)).isDisplayed();
        String text = getDriver().findElement(By.xpath(versionValue)).getText();
        Assert.assertEquals(config.getString("Version").trim(), text.trim());
    }

    public void build() {
        getDriver().findElement(By.xpath(LoginPage.build)).isDisplayed();
        String text = getDriver().findElement(By.xpath(buildNo)).getText();
        Assert.assertEquals(config.getString("Build").trim(), text.trim());


    }

    public void buildDate() {

        getDriver().findElement(By.xpath(LoginPage.buildDate)).isDisplayed();
        String text = getDriver().findElement(By.xpath(buildDatevalue)).getText();
        Assert.assertEquals(config.getString("Build_Date"), text.trim());
        getDriver().close();
    }


    public void signInwith() {

        if (ConfigLoader.environment.equals("user")) {
            getDriver().findElement(By.xpath(LoginPage.signInwithText)).isDisplayed();

        } else if (ConfigLoader.environment.equals("enterprise")) {
            getDriver().findElement(By.xpath(LoginPage.signInwithArcgis)).isDisplayed();

        }
    }

    public void arcgisLogin() {

        getDriver().findElement(By.xpath(LoginPage.arcgisLogin)).isDisplayed();

    }

    public void forgotCredentials() {

        if (ConfigLoader.environment.equals("user")) {
            getDriver().findElement(By.xpath(LoginPage.forgotUsername)).isDisplayed();
            getDriver().findElement(By.xpath(LoginPage.forgotPassword)).isDisplayed();
        } else if (ConfigLoader.environment.equals("enterprise")) {
            getDriver().findElement(By.xpath(LoginPage.forgotPassword)).isDisplayed();
        }
    }

    public void privacy() {

        if (ConfigLoader.environment.equals("user")) {
            getDriver().findElement(By.xpath(LoginPage.privacy)).isDisplayed();
        }

    }

    public void arcgisOrganizationUrl() {

        getDriver().findElement(By.xpath(LoginPage.arcgisOrganizationUrl)).isDisplayed();

    }

    public void previousWindow() {

        Set<String> windows = getDriver().getWindowHandles();
        for (String ws : windows) {
            getDriver().switchTo().window(ws);
            break;
        }
    }

    public void closeWindow() {

        getDriver().close();
    }



}


