package steps.web;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.WebElement;
import org.yecht.Data;
import pages.LoginPage;
import utilities.ConfigLoader;

import java.util.List;
import java.util.Map;

public class LoginSteps {

    LoginPage page;
    static boolean loginStatus = false;

    @When("^I navigate to FieldSeeker application$")
    public void iNavigateToFieldSeekerApplication() {
        page.navigateTourl();
    }

    @And("^I see the frontier precision logo$")
    public void iSeeTheFrontierPrecisionLogo() {
        page.fieldSeekerLogo();
    }

    @And("^I see the sign in option$")
    public void iSeeTheSignInOption() {
        page.signInbutton();
    }

    @And("^I see the login button$")
    public void iSeeTheLoginButton() {
        page.loginButton();
    }


    @Then("^I see the username field$")
    public void iSeeTheUsernameField() throws InterruptedException {
        page.windowSwitch();
        page.usernameDisplay();
    }

    @And("^I see the password field$")
    public void iSeeThePasswordField() {
        page.passwordDisplay();
    }

    @And("^I see the cancel button$")
    public void iSeeTheCancelButton() {
        page.cancelDisplay();
    }

    @And("^I see the sign in button$")
    public void iSeeTheSignInButton() {
        page.signIndisplay();
    }

    @And("^I see the keep me signed in checkbox$")
    public void iSeeTheKeepMeSignedInCheckbox() {
        page.signIncheckbox();
    }

    @And("^I enter password in Password field$")
    public void iEnterPasswordInPasswordField() {
        if (!loginStatus) {

            page.password();
        }
    }

    @And("^I see the error message as \"([^\"]*)\"$")
    public void iSeeTheErrorMessageAs(String blankUsername) {
        page.blankUsernameError(blankUsername);
    }

    @And("^I click on signIn button$")
    public void iClickOnSignInButton() throws InterruptedException {
        if (!loginStatus) {
            page.signIn();
            page.windowSwitch();

        }


    }


    @When("^I click on login button$")
    public void iClickOnLoginButton() throws InterruptedException {
        if (!loginStatus) {
            page.login();
            page.windowSwitch();
        }
    }


    @And("^I see error message as \"([^\"]*)\"$")
    public void iSeeErrorMessageAs(String blankPassword) throws InterruptedException {
        page.blankPasswordError(blankPassword);
        page.closeWindow();
        page.windowSwitch();

    }

    @And("^I enter username in username field$")
    public void iEnterUsernameInUsernameField() throws InterruptedException {
        if (!loginStatus) {

            page.username();
        }
    }

    @And("^I land on login landing screen$")
    public void iLandOnLoginLandingScreen() {

        page.fieldSeekerLogo();
        page.signInbutton();
        page.loginButton();
    }

    @And("^I click on cancel button$")
    public void iClickOnCancelButton() throws InterruptedException {
        page.cancel();


    }

    @And("^I enter incorrect username in username field$")
    public void iEnterIncorrectUsernameInUsernameField() {
        page.incorrectUsername();
    }

    @And("^I enter incorrect password in password field$")
    public void iEnterIncorrectPasswordInPasswordField() {
        page.incorrectPassword();
    }


    @And("^I see the errorhint message as \"([^\"]*)\"$")
    public void iSeeTheErrorhintMessageAs(String message) throws InterruptedException {
        page.invalidCredentialserrorMessage(message);
        page.closeWindow();
        page.windowSwitch();
    }

    @And("^I see the Service Requests section with piechart$")
    public void iSeeTheServiceRequestsSectionWithPiechart() throws InterruptedException {

        page.serviveRequestDisplay();
        page.serviceRequestpieChart();
    }

    @And("^I see the Inspections section with graph$")
    public void iSeeTheInspectionsSectionWithGraph() {
        page.inspectionDisplay();
        page.inspectionGraph();
    }

    @And("^I see the Product Treatment section with graph$")
    public void iSeeTheProductTreatmentSectionWithGraph() {
        page.productTreatmentDisplay();
        page.productTreatmentGraph();
    }

    @And("^I see the Acres Treated section with graph$")
    public void iSeeTheAcresTreatedSectionWithGraph() {
        page.acresTreatedsectionDisplay();
        page.acresTreatedgraph();
    }

    @And("^I see Map review button$")
    public void iSeeMapReviewButton() throws InterruptedException {

        page.mapReviewDisplay();
    }


    @And("^I see Lab tools$")
    public void iSeeLabTools() {

        if (!loginStatus) {
            page.labToolsDisplay();
            loginStatus = true;
        }
    }

    @And("^I see product inventory$")
    public void iSeeProductInventory() {
        page.productInventorydisplay();
    }

    @And("^I see proposed treatment area$")
    public void iSeeProposedTreatmentArea() {
        page.proposedTreatmentareaDisplay();
    }

    @And("^I see configuration$")
    public void iSeeConfiguration()
    {
        page.configurationDisplay();
    }

    @And("^I see Maintainance map$")
    public void iSeeMaintainanceMap() {
        page.maintainanceMapdisplay();
    }

    @And("^I see Gateway Sync$")
    public void iSeeGatewaySync() {
        page.gatewaySyncdisplay();
    }

    @And("^I see Data review$")
    public void iSeeDataReview() {
        page.dataReviewdisplay();
    }

    @And("^I see Service Requests button$")
    public void iSeeServiceRequestsButton() {
        page.serviceRequestbuttonDisplay();
    }


    @And("^I logout from the application$")
    public void iLogoutFromTheApplication() {

        if (loginStatus) {
            page.logout();
            loginStatus = false;
        }
    }

    @Given("^I verify user is not logged in$")
    public void iVerifyUserIsNotLoggedIn() {
        if (loginStatus) {
            page.logout();
            loginStatus = false;
        }

    }


    @And("^I see text \"([^\"]*)\"$")
    public void iSeeText(String arg0) {
        page.signInwith();
    }

    @And("^I see Arcgis login with arrow$")
    public void iSeeArcgisLoginWithArrow() {
        page.arcgisLogin();
    }


    @And("^I see Forgot username orForgot password$")
    public void iSeeForgotUsernameOrForgotPassword() {
        page.forgotCredentials();
    }

    @And("^I see Privacy$")
    public void iSeePrivacy() {
        page.privacy();
    }

    @And("^I see Your ArcGIS is organisation's URL$")
    public void iSeeYourArcGISIsOrganisationSURL() throws InterruptedException {
        if (ConfigLoader.environment.equals("user")) {
            page.arcgisOrganizationUrl();
            page.closeWindow();
            page.windowSwitch();
        }
    }

    @And("^I see the github ,facebook,google,apple link$")
    public void iSeeTheGithubFacebookGoogleAppleLink() {
        if (ConfigLoader.environment.equals("user")) {
            page.githubLink();
            page.facebookLink();
            page.googleLink();
            page.appleLink();
        }
    }

    @And("^I see the FieldSeeker GIS Version$")
    public void iSeeTheFieldSeekerGISVersion() {
        page.version();
    }

    @And("^I see the Build$")
    public void iSeeTheBuild() {
        page.build();
    }

    @And("^I see the Build Date$")
    public void iSeeTheBuildDate() {
        page.buildDate();

    }

    @And("^I switch back to previous window$")
    public void iSwitchBackToPreviousWindow() {

        if (!loginStatus) {
            page.previousWindow();


        }
    }

    @And("^I close the window$")
    public void iCloseTheWindow()
    {
        page.closeWindow();
    }

    @And("^I click on signIn button of login$")
    public void iClickOnSignInButtonOfLogin()
    {
        page.signIn();
    }

    @And("^I see error message for empty ussername as \"([^\"]*)\"$")
    public void iSeeErrorMessageForEmptyUssernameAs(String arg0) throws InterruptedException {
        page.blankUsernameError(arg0);
        page.closeWindow();
        page.windowSwitch();
    }

//    @And("^user enter credentials$")
//    public void userEnterCredentials(DataTable dataTable)
//    {
//        for (int i=0;i<=2;i++) {
//            String email = dataTable.asMaps(String.class, String.class).get(0).get("userEmail");
//            String password = dataTable.asMaps(String.class, String.class).get(0).get("password");
//            page.invalidUsername(email);
//            page.invalidPassword(password);
//        }
//
//    }
//
//    @Then("^the error message is displayed \"([^\"]*)\"$")
//    public void theErrorMessageIsDisplayed(String errorMessage)
//    {
//        page.errorMessage();
//    }
}




