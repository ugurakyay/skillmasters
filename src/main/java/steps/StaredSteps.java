package steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import library.BaseSteps;
import pageObject.StaredPageObject;
import pageObject.loginPageObject;

import java.io.IOException;

public class StaredSteps extends BaseSteps {
    private BaseSteps base;
    private loginPageObject loginpage;
    private StaredPageObject staredlist;
    boolean result;


    public StaredSteps(BaseSteps base) {
        this.base=base;
        loginpage = new loginPageObject(base.driver);
        staredlist = new StaredPageObject(base.driver);
    }

    @Given("^I added player in watchlist$")
    public void loggedInUserCanSeeStaredlist() throws IOException, InterruptedException {
        loginpage.navigateTo(config.getHost());
        loginpage.userName(config.getUserName());
        loginpage.password(config.getPassword());
        loginpage.clickLoginButton();
        Thread.sleep(3000);

    }
    @When("^I click on star icon on the player$")
    public  void clickStar() throws InterruptedException {
        staredlist.CheckStarred();

    }
    @And("^I click on OK on message popup$")
    public void pressStaredTab(){
        staredlist.staredTab();

    }


    @Then("^I see selected star is colored$")
    public void usercanseeStared() throws InterruptedException {
        Thread.sleep(3000);
        staredlist.uncheckstar();


    }



}
