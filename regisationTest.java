package org.example;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.Select;
import java.time.Duration;
public class regisationTest {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulnxttrends.ccbp.tech/");
        WebElement userName = driver.findElement(By.name("name"));
        userName.sendKeys("rahul");
        System.out.println("User Name is successfully entered");
        WebElement email = driver.findElement(By.name("email"));
        email.sendKeys("rahul@example.com");
        System.out.println("Email is successfully entered");
        WebElement password = driver.findElement(By.name("password"));
        password.sendKeys("rahul@2021");
        System.out.println("Password is successfully entered");
        WebElement gender = driver.findElement(By.name("gender"));
        gender.click();
        WebElement country = driver.findElement(By.name("country"));
        Select choice = new Select(country);
        choice.selectByIndex(1);
        WebElement termsConditions = driver.findElement(By.name("terms"));
        termsConditions.click();
        WebElement register = driver.findElement(By.id("submitBtn"));
        register.click();
        WebElement login = driver.findElement(By.linkText("Log in"));
        login.click();
        String expectedUrl = "https://rahulnxttrendz.ccbp.tech/login";
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.urlToBe(expectedUrl));
        String currentUrl = driver.getCurrentUrl();
        if (currentUrl.equals(expectedUrl)){
            System.out.println("Navigation is completed");
        }else {
            System.out.println("Navigation is failed");
        }

        driver.close();
    }
}
