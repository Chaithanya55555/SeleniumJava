package org.example;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
public class toggleButtonTest {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://qashowhide.ccbp.tech/");
        WebElement FirstButtonShow = driver.findElement(By.id("firstname"));
        FirstButtonShow.click();
        WebElement SecondButtonShow = driver.findElement(By.id("lastname"));
        SecondButtonShow.click();
        WebElement FirstButtonHide = driver.findElement(By.id("firstname"));
        FirstButtonHide.click();
        WebElement SecondButtonHide = driver.findElement(By.id("lastname"));
        SecondButtonHide.click();
        driver.close();
    }
}
