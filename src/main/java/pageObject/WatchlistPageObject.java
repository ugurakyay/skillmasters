package pageObject;

import gherkin.lexer.Th;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.sql.SQLOutput;
import java.util.List;

public class WatchlistPageObject {

    protected WebDriver driver;
    public WebDriverWait wait;
    boolean result;
    String WatchlistPageObject = null;

    public WatchlistPageObject (WebDriver driver){ this.driver = driver;}

    public void navigateTo(String url) {
        driver.get(url);
        driver.manage().window().maximize();
    }

    public void watchlistplayeradd() throws InterruptedException {
        /*WebElement GoToButton =         driver.findElement(By.cssSelector("body > div.main.active > div > div.row > div > div > table > tbody > tr:nth-child(2) > td > button"));

        if (GoToButton.isDisplayed()) {
            driver.findElement(By.cssSelector("body > div.main.active > div > div.row > div > div > table > tbody > tr:nth-child(2) > td > button")).click();
            Thread.sleep(3000);
        }
        else {
            driver.findElement(By.xpath("/html/body/div[7]/div/div[2]/div/div/table/tbody/tr[2]/td[4]/a")).click();
            Thread.sleep(2000);

        }

         */

        driver.findElement(By.cssSelector("body > div.main.active > div > div.row > div > div > table > tbody > tr:nth-child(2) > td > button")).click();
        Thread.sleep(4000);



        //driver.findElement(By.xpath("/html/body/div[6]/div/div[2]/div/div/table/tbody/tr[2]/td/button")).click();
    }
    public void GotoPlayerDatabase() throws InterruptedException {
        //driver.findElement(By.cssSelector("#DataTables_Table_0 > tbody > tr:nth-child(1) > td:nth-child(2) > a")).click();
        //Thread.sleep(3000);
    }
    public void clickEyeButton() throws InterruptedException {

        driver.findElement(By.xpath("//*[@id=\"DataTables_Table_0\"]/tbody/tr[1]/td[9]/a")).click();
        //driver.findElement(By.xpath("//*[@id=\"DataTables_Table_0\"]/tbody/tr[1]/td[2]")).click();
        Thread.sleep(7000);

    }
    public void addusertoWatchList(){
        driver.findElement(By.xpath("//*[@id=\"dark-top-bar\"]/a")).click();
    }
    public void AddNotes() throws InterruptedException {
        driver.findElement(By.id("recruiter_note")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("recruiter_note")).sendKeys("Test Automation");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"_noteForm\"]/div[2]/button")).click();

    }

    public void BackButton() throws InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"dark-top-bar\"]/button")).click();
        Thread.sleep(3000);
        //driver.findElement(By.xpath("/html/body/div[7]/div/div[1]/div[1]/span[1]")).click();
        Thread.sleep(2000);
    }

    public void AddFavorite() throws InterruptedException {
        driver.findElement(By.xpath("/html/body/div[7]/div/div[2]/div/div/table/tbody/tr[2]/td[8]/a/i")).click();
        driver.switchTo().alert().accept();
        Thread.sleep(3000);
    }


}
