package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;

public class loginPageObject {
    protected WebDriver driver;
    public WebDriverWait wait;
    boolean result;
    String subWindowHandler = null;


    public loginPageObject(WebDriver driver){ this.driver = driver;}
    public void navigateTo(String url) {
        driver.get(url);
        driver.manage().window().maximize();
    }
    public void userName(String username){
        /*wait = new WebDriverWait(driver,10000);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"navbarHeader\"]/ul/li[4]/a")));
        driver.findElement(By.xpath("//*[@id=\"navbarHeader\"]/ul/li[4]/a")).click();
        driver.findElement(By.xpath("//*[@id=\"navbarHeader\"]/ul/li[4]/div/a[1]")).click();
        Set<String> handles = driver.getWindowHandles(); // get all window handles
        Iterator<String> iterator = handles.iterator();
        while (iterator.hasNext()){
            subWindowHandler = iterator.next();
        }
        driver.switchTo().window(subWindowHandler);
        driver.findElement(By.xpath("//*[@id=\"ajax-login-form2\"]/div[1]/input")).sendKeys(username);
         */
        driver.findElement(By.id("email")).sendKeys(username);

    }
    public void password(String password) throws InterruptedException {

        /*driver.findElement(By.xpath("//*[@id=\"ajax-login-form2\"]/div[2]/input")).sendKeys(password);
        driver.findElement(By.xpath("//*[@id=\"ajax-login-form2\"]/div[3]/label/span")).click();
        */
        driver.findElement(By.id("password")).sendKeys(password);
        Thread.sleep(5000);
    }
    public void clickLoginButton() throws InterruptedException, IOException {
        //driver.findElement(By.xpath("//*[@id=\"ajax-login-form2\"]/div[4]/button")).click();
        driver.findElement(By.className("button full gr-orange action-btn")).click();


    }

}