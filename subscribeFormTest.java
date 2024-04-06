package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class subscribeFormTest {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://qasubscribe.ccbp.tech/");
        WebElement name = driver.findElement(By.id("name"));
        name.sendKeys("Rahul");
        System.out.println("Name is entered");
        WebElement email = driver.findElement(By.id("email"));
        name.sendKeys("rahul123@.com");
        System.out.println("Email is entered");
        WebElement subscribeButton = driver.findElement(By.className("btn"));
        subscribeButton.submit();
        System.out.println("Subscription is completed");
        driver.close();
    }
}
