package steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import library.BaseSteps;
import pageObject.SignUpPageObject;

public class SignUpSteps extends BaseSteps{
    private BaseSteps base;
    private SignUpPageObject signup;
    boolean result;

    public SignUpSteps(BaseSteps base) {
        this.base = base;
        signup = new SignUpPageObject(base.driver);
    }

    @Given("^open browser enter$")
    public void openBrowserEnter() throws InterruptedException {
        signup.navigateTo(config.getHost());
        Thread.sleep(1000);
    }

    @When("^user see homepage area$")
    public void userSeeHomepageArea() {
        System.out.println("home page");
    }


    @And("^user press sign up$")
    public void userPressSignUp() {
        signup.signUpButton();
    }

    @And("^user sign up screen$")
    public void userSignUpScreen() {
        System.out.println("Sign Up Page");
    }

    @Then("^user chose“ I am a recruiter”$")
    public void userChoseIAmARecruiter() {
        signup.Recruiterbutton();

    }

    @And("^user fill the field$")
    public void userFillTheField() throws InterruptedException {
        signup.RecruiterForm();
    }
    @And("^user click sign up$")
    public void userClickSignUp() {
        System.out.println("sign up button");
    }

    @And("^user chose sport type, enter school name$")
    public void userChoseSportTypeEnterSchoolName() throws InterruptedException {
        signup.ChooseSkill();

    }


    @Then("^user see dashboard$")
    public void userSeeDashboard() {
        System.out.println("dashboard");
    }



}
