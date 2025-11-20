import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class GoogleTest {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://sso.teachable.com/secure/9521/identity/login/password?force=true");
       WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
       driver.findElement(By.id("email")).sendKeys("Jas@gmail.com");
       driver.findElement(By.id("email")).sendKeys("pass");
       driver.findElement(By.name("commit")).click();
      wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@value='Next']")));
       driver.findElement(By.linkText("Forgot Password")).click();
      wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@value='Next']")));
       driver.findElement(By.id("email")).sendKeys("jasminebharathi93@gmail.com");
       driver.findElement((By.xpath("//*[@value='Next']"))).click();



    }
}
