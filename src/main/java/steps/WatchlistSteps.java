package steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import library.BaseSteps;
import library.CaptureScreenshot;
import pageObject.WatchlistPageObject;
import pageObject.loginPageObject;

import java.io.IOException;

public class WatchlistSteps extends BaseSteps {

    private CaptureScreenshot screenshot;
    private BaseSteps base;
    private loginPageObject loginpage;
    private WatchlistPageObject watchList;
    boolean result;
    
    public WatchlistSteps(BaseSteps base){
            this.base = base;
            loginpage = new loginPageObject(base.driver);
            watchList = new WatchlistPageObject(base.driver);
        }
 
    @Given("^logged in user can see WatchList$")
    public void loggedInUserCanSeeWatchList() throws IOException, InterruptedException {
        watchList.navigateTo(config.getHost());
        loginpage.userName(config.getUserName());
        loginpage.password(config.getPassword());
        loginpage.clickLoginButton();
        Thread.sleep(3000);

    }

    @And("^user can see watchlist \\(if watchlist is empty go next step\\)$")
    public void userCanSeeWatchlistIfWhatclistIsEmptyGoNextStep() throws InterruptedException {
        watchList.watchlistplayeradd();

    }

    @And("^user press Go to Player Database button$")
    public void userPressGoToPlayerDatabaseButton() throws InterruptedException {
        System.out.println("player database");

        
    }

    @Then("^user go to Player database Tab$")
    public void userGoToPlayerDatabaseTab() {

        System.out.println("Player DataBAse TAB");
    }

    @And("^user can press eye icon in action colon$")
    public void userCanPressEyeIconInActionColon() throws InterruptedException {
        watchList.clickEyeButton();
    }

    @Then("^user can see player details$")
    public void userCanSeePlayerDetails() {

        System.out.println("Plaeyr DEtails Page");
    }

    @And("^user can add watch list player$")
    public void userCanAddWatchListPlayer() {
        watchList.addusertoWatchList();
    }

    @And("^user can add notes this player$")
    public void userCanAddNotesThisPlayer() throws InterruptedException {
        watchList.AddNotes();
    }

    @And("^user click Back button$")
    public void userClickBackButton() throws InterruptedException {
        watchList.BackButton();
    }

    @Then("^user can see this player in watchlist Tab$")
    public void userCanSeeThisPlayerInWhatchlistTab() {

        System.out.println("Watch List add Player");
    }

    @And("^user can click starred colon star icon$")
    public void userCanClickStarredColonStarIcon() throws InterruptedException {

        watchList.AddFavorite();
    }

    @Then("^user can see this player in starred tab$")
    public void userCanSeeThisPlayerInStarredTab() throws InterruptedException {


    }
}
