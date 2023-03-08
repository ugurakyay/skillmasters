package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProfilePageObject {
    protected WebDriver driver;
    public WebDriverWait wait;
    boolean result;
    String ProfilePageObject = null;

    public ProfilePageObject(WebDriver driver){
        this.driver = driver;
    }
    public void navigateTo(String url) {
        driver.get(url);
        driver.manage().window().maximize();
    }

    public void ProfileButton() throws InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"style-3\"]/div/ul/li[3]/a/span[2]")).click();
        Thread.sleep(2000);
    }

    public void NewPassword(){
        driver.findElement(By.id("password")).sendKeys("12345678");

    }
    public void ValidatePass(){
        driver.findElement(By.id("re-password")).sendKeys("12345678");

    }
    public void updatePasswordButton(){
        driver.findElement(By.xpath("//*[@id=\"_passwordForm\"]/div/div[3]/a")).click();
    }


}
