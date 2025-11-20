package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Test {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://sso.teachable.com/secure/9521/identity/login/password?force=true");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        driver.findElement(By.xpath("// *[@id='email']")).sendKeys("bhuvanshree09@gmail.com");
        driver.findElement(By.xpath("// *[@type='password']")).sendKeys("Jas@123");
        driver.findElement(By.xpath("// *[@name='commit']"));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@value='Next']")));
        System.out.println(driver.findElement(By.tagName("h2")).getText());


    }


}