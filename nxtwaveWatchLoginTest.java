package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class nxtwaveWatchLoginTest {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://qanxtwatch.ccbp.tech/login");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        WebElement username = driver.findElement(By.id("userNameInput"));
        username.sendKeys("rahul");
        System.out.println("Email is entered");
        WebElement password = driver.findElement(By.id("passwordInput"));
        password.sendKeys("rahul@2021");
        System.out.println("Password is entered");
        WebElement loginButton = driver.findElement(By.id("loginButton"));
        password.submit();
        System.out.println("Login is completed");
        String expectedUrl = "https://qanxtwatch.ccbp.tech/";
        WebDriverWait wait = new  WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.urlToBe(expectedUrl));
        String currentUrl  = driver.getCurrentUrl();
        if (currentUrl.equals(expectedUrl)){
            System.out.println("Logged in successfully");
            System.out.println(driver.getTitle());
        }
        WebElement logout  = driver.findElement(By.id("desktopLogoutButton"));
        logout.click();
        WebElement logoutConfirm  = driver.findElement(By.id("desktopConfirmButton"));
        logoutConfirm.click();
        String expectedUrlhome = "https://qanxtwatch.ccbp.tech/login";
        WebDriverWait waithome = new  WebDriverWait(driver, Duration.ofSeconds(10));
        waithome.until(ExpectedConditions.urlToBe(expectedUrlhome));
        String currentUrlhome  = driver.getCurrentUrl();
        if (currentUrlhome.equals(expectedUrlhome)){
            System.out.println("Logged out successfully");
            System.out.println(driver.getTitle());
        }
        driver.quit();
    }
}
