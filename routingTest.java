package org.example;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class routingTest {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://qaroutingtest.ccbp.tech/");
        WebElement about = driver.findElement(By.linkText("About"));
        about.click();
        String expectedUrl = "https://qaroutingtest.ccbp.tech/about";
        try{
            Thread.sleep(3000);
        }catch (InterruptedException e){
            throw new RuntimeException();
        }
        String currentUrl = driver.getCurrentUrl();
        if (currentUrl.equals(expectedUrl)){
            System.out.println("Navigated about page");
        }
        WebElement contact = driver.findElement(By.partialLinkText("Contact"));
        contact.click();
        String expectedContactUrl = "https://qaroutingtest.ccbp.tech/contact";
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        String currentContactUrl = driver.getCurrentUrl();
        if (currentContactUrl.equals(expectedContactUrl)){
            System.out.println("Navigated contact page");
        }
        driver.close();
    }
}
