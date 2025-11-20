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
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class WindowHandle {
    public static void main(String[] args){
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/loginpagePractise/");
        driver.findElement(By.xpath("//a[@class='blinkingText']")).click();
        Set<String> windows = driver.getWindowHandles();
        Iterator<String> tx = windows.iterator();
        String parentId = tx.next();
        String childId = tx.next();
        driver.switchTo().window(childId);
        System.out.println(driver.findElements(By.xpath("")));
    }
}
