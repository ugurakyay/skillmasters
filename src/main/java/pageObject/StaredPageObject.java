package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class StaredPageObject {
    protected WebDriver driver;
    public WebDriverWait wait;
    boolean result;
    String StaredPageObject = null;

    public StaredPageObject(WebDriver driver){ this.driver = driver;}

    public void navigateTo(String url) {
        driver.get(url);
        driver.manage().window().maximize();
    }

    public void CheckStarred() throws InterruptedException {
        driver.findElement(By.xpath("/html/body/div[6]/div/div[2]/div/div/table/tbody/tr[2]/td[8]/a")).click();

        //driver.findElement(By.xpath("/html/body/div[7]/div/div[1]/div[1]/span[2]")).click();

        driver.switchTo().alert().accept();

        Thread.sleep(3000);


    }
    public void staredTab(){
        driver.findElement(By.xpath("/html/body/div[6]/div/div[1]/div[1]/span[2]")).click();
    }

    public void uncheckstar(){
        driver.findElement(By.xpath("/html/body/div[6]/div/div[2]/div/div/table/tbody/tr[2]/td[8]/a/i")).click();
        driver.switchTo().alert().accept();

    }




    




}
