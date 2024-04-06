package org.example;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class partialLinktest {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://qacompany.ccbp.tech/");
        WebElement Home = driver.findElement(By.linkText("Home"));
        Home.click();
        System.out.println("Click on home completed");
        WebElement aboutUs = driver.findElement(By.linkText("About us"));
        aboutUs.click();
        System.out.println("Click on aboutUs completed");
        WebElement services = driver.findElement(By.linkText("Services"));
        services.click();
        System.out.println("Click on services completed");
        WebElement contactUs = driver.findElement(By.linkText("Contact us"));
        contactUs.click();
        System.out.println("Click on contactUs completed");
        driver.close();
    }
}
