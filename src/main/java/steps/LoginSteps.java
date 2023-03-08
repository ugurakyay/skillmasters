package steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import library.BaseSteps;
import org.openqa.selenium.WebDriver;
import pageObject.loginPageObject;

import java.io.IOException;

public class LoginSteps extends BaseSteps {

    private WebDriver base;
    private final loginPageObject loginpage;
    boolean result;

    public LoginSteps(BaseSteps base) {
        this.base = base;
        loginpage = new loginPageObject(base.driver);

    }

    @Given("^open browser enter address$")
    public void openBrowserEnterAddress() throws InterruptedException {
        loginpage.navigateTo(config.getHost());
        Thread.sleep(3000);
    }

    @When("^user see username and password area$")
    public void userSeeUsernameAndPasswordArea() {
        loginpage.userName(config.getUserName());
    }

    @And("^user press sign in$")
    public void userPressSignIn() throws InterruptedException {
        loginpage.password(config.getPassword());
        Thread.sleep(1000);
    }

    @Then("^user see dashboard screen$")
    public void userSeeDashboardScreen() throws IOException, InterruptedException {
        loginpage.clickLoginButton();
        Thread.sleep(9000);
    }
}

