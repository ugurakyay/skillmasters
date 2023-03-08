package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SubscriptionPageObject {
    protected WebDriver driver;
    public WebDriverWait wait;
    boolean result;
    String SubscriptionPageObject = null;

    public SubscriptionPageObject(WebDriver driver){
        this.driver = driver;
    }
    public void navigateTo(String url) {
        driver.get(url);
        driver.manage().window().maximize();
    }
    public void subscriptionButton () throws InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"style-3\"]/div/ul/li[2]/a/span[2]")).click();
        Thread.sleep(2000);
    }

    public void createsubscription() throws InterruptedException {
        driver.findElement(By.xpath("/html/body/div[6]/div/div[2]/div/table/tbody/tr[3]/td/a")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[5]/div/p/a")).click();
        Thread.sleep(2000);
    }

    public void PaymentPage(){
        driver.findElement(By.id("first_name")).sendKeys("Test");
        driver.findElement(By.id("last_name")).sendKeys("Automation");
        driver.findElement(By.id("card_number")).sendKeys("4242424242424242");
        driver.findElement(By.id("month")).sendKeys("12");
        driver.findElement(By.id("year")).sendKeys("25");
        driver.findElement(By.id("cvc")).sendKeys("000");
        driver.findElement(By.xpath("//*[@id=\"subscriptionForm\"]/div/div[8]/button")).click();
    }
}
