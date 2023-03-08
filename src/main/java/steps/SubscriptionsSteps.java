package steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import library.BaseSteps;
import library.Config;
import pageObject.SignUpPageObject;
import pageObject.SubscriptionPageObject;
import pageObject.UnfollowPLayerPageObject;
import pageObject.loginPageObject;

import java.io.IOException;

public class SubscriptionsSteps extends BaseSteps{
    private BaseSteps base;
    private loginPageObject loginpage;
    private SubscriptionPageObject subscription;
    boolean result;

    public SubscriptionsSteps(BaseSteps base){
        this.base=base;
        loginpage = new loginPageObject(base.driver);
        subscription= new SubscriptionPageObject(base.driver);
    }
    @Given("^I land on dashboard page$")
    public void landing() throws IOException, InterruptedException {
        subscription.navigateTo(config.getHost());
        loginpage.userName(config.getUserName());
        loginpage.password(config.getPassword());
        loginpage.clickLoginButton();
        Thread.sleep(3000);

    }

    @When("^I click on subscriptions button on the left menu$")
    public void ıClickOnSubscriptionsButtonOnTheLeftMenu() throws InterruptedException {
        subscription.subscriptionButton();
    }

    @Then("^I land on subscriptions page$")
    public void ıLandOnSubscriptionsPage() {
    }

    @When("^I click on create one button$")
    public void ıClickOnCreateOneButton() throws InterruptedException {
        subscription.createsubscription();
    }

    @Then("^I land on subscription detail page monthly selected as default$")
    public void ıLandOnSubscriptionDetailPageMonthlySelectedAsDefault() {

    }

    @When("^I type credit card info on the page$")
    public void ıTypeCreditCardInfoOnThePage() {
        subscription.PaymentPage();
    }

    @And("^I click on submit button$")
    public void ıClickOnSubmitButton() {
    }
}
