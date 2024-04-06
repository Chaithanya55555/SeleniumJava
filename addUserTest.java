package org.example;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class addUserTest {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://qaadduser.ccbp.tech/");
        WebElement name = driver.findElement(By.name("name"));
        name.sendKeys("Name");
        try{
            Thread.sleep(1000);
        }catch (InterruptedException e){
            throw new RuntimeException();
        }
        WebElement email = driver.findElement(By.name("email"));
        email.sendKeys("Email");
        try{
            Thread.sleep(1000);
        }catch (InterruptedException e){
            throw new RuntimeException();
        }
        WebElement select = driver.findElement(By.id("status"));
        Select choice = new Select(select);
        choice.selectByValue("Active");
        try{
            Thread.sleep(1000);
        }catch (InterruptedException e){
            throw new RuntimeException();
        }
        WebElement gender = driver.findElement(By.id("genderFemale"));
        gender.click();
        try{
            Thread.sleep(1000);
        }catch (InterruptedException e){
            throw new RuntimeException();
        }
        WebElement submit  = driver.findElement(By.tagName("button"));
        gender.click();
        try{
            Thread.sleep(1000);
        }catch (InterruptedException e){
            throw new RuntimeException();
        }
        System.out.println("Add user form submitted");
        driver.quit();
    }
}
