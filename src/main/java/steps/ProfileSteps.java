package steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import library.BaseSteps;
import pageObject.ProfilePageObject;
import pageObject.StaredPageObject;
import pageObject.loginPageObject;

public class ProfileSteps extends BaseSteps {

    private BaseSteps base;
    private loginPageObject loginpage;
    private ProfilePageObject profile;
    boolean result;


    public ProfileSteps(BaseSteps base) {
        this.base=base;
        loginpage = new loginPageObject(base.driver);
        profile = new ProfilePageObject(base.driver);
    }
    @When("^I click on Manage profile button on the left menu$")
    public void manageProfile() throws InterruptedException {
        profile.ProfileButton();
    }


    @Then("^I land on my profile page$")
    public void ıLandOnMyProfilePage() {
    }

    @When("^I type new password$")
    public void ıTypeNewPassword() {
        profile.NewPassword();
    }

    @And("^I type password validation$")
    public void ıTypePasswordValidation() {
        profile.ValidatePass();
    }

    @And("^I click on update password button$")
    public void ıClickOnUpdatePasswordButton() {
        profile.updatePasswordButton();
    }

    @Then("^I see Your password is updated message$")
    public void ıSeeYourPasswordIsUpdatedMessage() {

    }
}
