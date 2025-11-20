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
import java.util.concurrent.TimeUnit;

public class Shopcart {
    public static void main (String[] args){
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("https://rahulshettyacademy.com/seleniumPractise/");
        String[] items = {"Carrot","Tomato","Brinjal"};
        for(int i =0; i< items.length; i++)
        {
            driver.findElement(By.xpath("//*[contains(text(),'" + items[i] + "')]//following-sibling::div[@class='product-action']//button[text()='ADD TO CART']")).click();
           driver.findElement(By.xpath("//img[@alt ='Cart']")).click();
           driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();
           driver.findElement(By.xpath("//input[@class ='promoCode']")).sendKeys("rahulshettyacademy");
           driver.findElement(By.xpath("//button[@class ='promoBtn']")).click();
        }

    }
}
