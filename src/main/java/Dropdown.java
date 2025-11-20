package org.example;
//package org.example;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
public class Dropdown {
    public static void main(String[] args){
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
        driver.findElement(By.xpath("//a[@value='BLR']")).click();
        driver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1")).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='ctl00_mainContent_ddl_destinationStation1']//option[@value='MAA']")));
        driver.findElement(By.xpath("//*[@id='ctl00_mainContent_ddl_destinationStation1']//option[@value='MAA']")).click();










    }
}
