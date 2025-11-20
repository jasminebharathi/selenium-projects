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
public class UpdatedDropdown {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        System.out.println(driver. findElement(By.id("ctl00_mainContent_chk_SeniorCitizenDiscount")).isSelected());
        driver. findElement(By.id("ctl00_mainContent_chk_SeniorCitizenDiscount")).click();
        System.out.println(driver. findElement(By.id("ctl00_mainContent_chk_SeniorCitizenDiscount")).isSelected());

        //count the number of checkboxes
        System.out.println(driver.findElements(By.cssSelector("Input[type='checkbox']")).size());
        driver.findElement(By.id("divpaxinfo")).click();
        try {
            Thread.sleep(2000); // 2 seconds
        } catch (InterruptedException e) {
            e.printStackTrace(); // or log it
        }

        for (int i =1;i<5;i++)
        {
         driver.findElement(By.id("hrefIncAdt")).click();
        }
        driver.findElement(By.id("btnclosepaxoption")).click();
        System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
    }
}

