package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.apache.commons.lang3.RandomStringUtils.randomNumeric;


public class SignUpPageObject {
    protected WebDriver driver;
    public WebDriverWait wait;
    boolean result;
    String subWindowHandler = null;

    public SignUpPageObject(WebDriver driver){ this.driver = driver;}

    public void navigateTo(String url) {
        driver.get(url);
        driver.manage().window().maximize();
    }

    public void signUpButton (){
        driver.findElement(By.xpath("/html/body/div[3]/div/div/div/div/div/div/div[2]/div/form/div[4]/button")).click();
    }

    public void Recruiterbutton(){
        driver.findElement(By.xpath("//*[@id=\"new_coach\"]/div[2]/div/span[2]")).click();
    }

    public void RecruiterForm() throws InterruptedException {
        driver.findElement(By.id("first_name")).sendKeys("Test");
        driver.findElement(By.id("last_name")).sendKeys("Automation");
        driver.findElement(By.id("email")).sendKeys("test.automation"+randomNumeric(4)+"@gmail.com");
        driver.findElement(By.id("password")).sendKeys("12345678");
        driver.findElement(By.id("password_confirmation")).sendKeys("12345678");
        driver.findElement(By.xpath("//*[@id=\"new_coach\"]/div[8]/input")).click();
        Thread.sleep(4000);
    }

    public void ChooseSkill() throws InterruptedException {
        driver.findElement(By.id("skill")).click();
        Thread.sleep(1000);
        Select se = new Select(driver.findElement(By.xpath("//*[@id=\"skill\"]")));
        se.selectByValue(String.valueOf(6));
        /*Actions action = new Actions(driver);
        WebElement we = driver.findElement(By.xpath("//*[@id=\"skill\"]"));
        action.moveToElement(we).moveToElement(driver.findElement(By.xpath("//*[@id=\"skill\"]/option[2]"))).click();
        Thread.sleep(2000);
        */
        driver.findElement(By.id("university")).sendKeys("Test Universty");
        driver.findElement(By.xpath("//*[@id=\"firstUseForm\"]/div[3]/button")).click();
        Thread.sleep(2000);

    }






}
