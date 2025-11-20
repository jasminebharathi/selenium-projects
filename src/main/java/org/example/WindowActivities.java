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
public class WindowActivities {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        WebElement staticDropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
        Select dropDown = new Select(staticDropdown);
        dropDown. selectByIndex(3);
       System.out.println(dropDown .getFirstSelectedOption().getText());
       dropDown.selectByVisibleText("AED");
        System.out.println(dropDown .getFirstSelectedOption().getText());
        dropDown.selectByValue("INR");
        System.out.println(dropDown .getFirstSelectedOption().getText());

    }
}