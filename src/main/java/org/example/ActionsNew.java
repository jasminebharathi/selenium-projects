package org.example;
import com.beust.ah.A;
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
import org.openqa.selenium.interactions.Actions;
public class ActionsNew {
    public static void main (String[] args){
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.in");
        Actions a = new Actions(driver);


    }




}

