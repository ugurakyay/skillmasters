package steps;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import library.BaseSteps;
import pageObject.StaredPageObject;
import pageObject.UnfollowPLayerPageObject;
import pageObject.WatchlistPageObject;
import pageObject.loginPageObject;

public class UnfollowPLayerSteps {

    private BaseSteps base;
    private loginPageObject loginpage;
    private UnfollowPLayerPageObject unfollow;
    boolean result;

    public UnfollowPLayerSteps(BaseSteps base){
        this.base=base;
        unfollow = new UnfollowPLayerPageObject(base.driver);
    }


    @When("^I click on Player name in watchlist$")
    public void clickplayer() throws InterruptedException {
        unfollow.PlayerDetail();

    }
    @Then("^I land on Player detail page$")
    public void playerdetail(){


    }

    @When("^I click on stop watch button$")
    public void ıClickOnStopWatchButton() throws InterruptedException {
        unfollow.StopWatch();

    }

    @Then("^I see button name changed to “add to watchlist again”$")
    public void ıSeeButtonNameChangedToAddToWatchlistAgain() throws InterruptedException {
        unfollow.BacktoDashboard();
    }

    @When("^I click on back button$")
    public void ıClickOnBackButton() {
    }

    @Then("^I land on Dashboard page$")
    public void ıLandOnDashboardPage() {
    }

    @When("^I click on stopped following$")
    public void ıClickOnStoppedFollowing() {
    }

    @Then("^I see unfollowed players in stopped following$")
    public void ıSeeUnfollowedPlayersInStoppedFollowing() {
    }
}
