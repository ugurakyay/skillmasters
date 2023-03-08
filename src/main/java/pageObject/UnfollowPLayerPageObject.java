package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UnfollowPLayerPageObject {
    protected WebDriver driver;
    public WebDriverWait wait;
    boolean result;
    String UnfollowPLayerPageObject = null;

    public UnfollowPLayerPageObject(WebDriver driver){
        this.driver = driver;
    }
    public void navigateTo(String url) {
        driver.get(url);
        driver.manage().window().maximize();
    }

    public void PlayerDetail() throws InterruptedException {
        driver.findElement(By.xpath("/html/body/div[6]/div/div[2]/div/div/table/tbody/tr[2]/td[4]/a")).click();
        Thread.sleep(7000);

    }
    public void StopWatch() throws InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"dark-top-bar\"]/a")).click();
        Thread.sleep(3000);
    }
    public void BacktoDashboard() throws InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"dark-top-bar\"]/button")).click();
        Thread.sleep(3000);
    }


}
