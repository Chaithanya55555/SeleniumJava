package org.example;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class loginTest1 {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://qaebank.ccbp.tech/ebank/login");
        WebElement username = driver.findElement(By.className("input-field"));
        username.sendKeys("94957");
        System.out.println("Username entered");
        driver.quit();
    }
}
