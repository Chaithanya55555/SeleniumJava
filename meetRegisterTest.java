package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class meetRegisterTest {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://qameetup.ccbp.tech/");
        WebElement registrationButton = driver.findElement(By.id("registerButton"));
        registrationButton.click();
        String expectedUrl = "https://qameetup.ccbp.tech/register";
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.urlToBe(expectedUrl));
        String currentUrl = driver.getCurrentUrl();
        if (currentUrl.equals(expectedUrl)){
            System.out.println("Navigated to register page");
        }
        WebElement name = driver.findElement(By.name("name"));
        name.sendKeys("Name");
        WebElement topic = driver.findElement(By.id("topic"));
        Select choice = new Select(topic);
        choice.selectByVisibleText("Games");
        WebElement registrationsubmit = driver.findElement(By.tagName("button"));
        registrationsubmit.submit();
        String expectedUrlRegister = "https://qameetup.ccbp.tech/";
        WebDriverWait waitRegister = new WebDriverWait(driver, Duration.ofSeconds(10));
        waitRegister.until(ExpectedConditions.urlToBe(expectedUrlRegister));
        String currentUrlRegister = driver.getCurrentUrl();
        if (currentUrlRegister.equals(expectedUrlRegister)){
            System.out.println("Navigated to Home page");
        }
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.get("https://qameetup.ccbp.tech/random-text");
        String expectedRandomText = "https://qameetup.ccbp.tech/not-found";
        WebDriverWait waitRamdomText = new WebDriverWait(driver, Duration.ofSeconds(10));
        waitRamdomText.until(ExpectedConditions.urlToBe(expectedRandomText));
        String currentUrlRamdomText = driver.getCurrentUrl();
        if (currentUrlRamdomText.equals(expectedRandomText)){
            System.out.println("Navigated to not found page");
        }
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.quit();
    }
}
