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

public class Assigment2 {
    public static void main (String[] args){
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/angularpractice/");
        driver.findElement(By.name("name")).sendKeys("JasmineBharathi");
        driver.findElement(By.name("email")).sendKeys("jasminebharathi93@gmail.com");
        driver.findElement(By.id("exampleInputPassword1")).sendKeys("Jasmine@123");
        driver.findElement(By.id("exampleCheck1")).click();
        System.out.println(driver.findElement(By.id("exampleCheck1")).isSelected());
        WebElement Dropdown = driver.findElement(By.id("exampleFormControlSelect1"));
        Select drop = new Select(Dropdown);
        drop.selectByVisibleText("Female");
        driver.findElement(By.id("inlineRadio2")).click();
        driver.findElement(By.name("bday")).sendKeys("btn-success");
        

    }

}
