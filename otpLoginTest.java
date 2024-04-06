package org.example;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
public class otpLoginTest {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://qaotploginpage.ccbp.tech");
        WebElement userName = driver.findElement(By.id("email"));
        userName.sendKeys("example@gmail.com");
        WebElement otpButton = driver.findElement(By.className("send-otp-btn"));
        otpButton.click();
        String exceptedTitle = "OTP Verification";
        String currentTitle = driver.getTitle();
        if (currentTitle.equals(exceptedTitle)){
            System.out.println("OTP sent successfully");
            System.out.println(driver.getTitle());
        }
        WebElement otp = driver.findElement(By.id("otp"));
        otp.sendKeys("123456");
        WebElement verifyotp = driver.findElement(By.id("verifyOtpBtn"));
        verifyotp.click();
        String expectedUrl = "https://qaotploginpage.ccbp.tech/home";
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.urlToBe(expectedUrl));
        String currentUrl= driver.getCurrentUrl();
        if (currentUrl.equals(expectedUrl)){
            System.out.println("Logged in successfully");
            System.out.println(driver.getTitle());
        }
        driver.close();
    }
}
