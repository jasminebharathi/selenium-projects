package org.example;
import org.example.Dropdown;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Assignment3 {
 public static void main (String[] args){
     WebDriver driver = new ChromeDriver();
     driver.get("https://rahulshettyacademy.com/loginpagePractise/");
     driver.findElement(By.id("username")).sendKeys("rahulshettyacademy");
     driver.findElement(By.id("password")).sendKeys("learning");
     driver.findElement(By.xpath("//input[@value='user']")).click();
     //Thread.sleep(3000);

     WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(7000));
     wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("okayBtn")));
     driver.findElement(By.id("okayBtn")).click();
    WebElement options = driver.findElement(By.xpath("//select[@class='form-control']"));
    Select drop = new Select(options);
    drop.selectByVisibleText("Consultant");
    driver.findElement(By.id("terms")).click();
    driver.findElement(By.id("signInBtn")).click();
     wait.until(ExpectedConditions.visibilityOfElementLocated(By.partialLinkText("Checkout")));
     List<WebElement> products = driver.findElements(By.xpath("//button[@class ='btn btn-info']"));
     for (int i =0;i< products.size();i++)
     {
         products.get(i).click();

     }


 }
}
