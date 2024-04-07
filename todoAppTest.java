package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class todoAppTest {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://qatodos.ccbp.tech/");
        driver.manage().window().maximize();
        WebElement taskEnter = driver.findElement(By.className("todo-user-input"));
        taskEnter.sendKeys("First task");
        WebElement addButton = driver.findElement(By.id("addTodoButton"));
        addButton.click();
        try{
            Thread.sleep(3000);
        }catch (InterruptedException e){
            throw  new RuntimeException();
        }
        WebElement taskEntersec = driver.findElement(By.className("todo-user-input"));
        taskEntersec.sendKeys("Second task");
        WebElement addButtonsec = driver.findElement(By.id("addTodoButton"));
        addButtonsec.click();
        try{
            Thread.sleep(3000);
        }catch (InterruptedException e){
            throw  new RuntimeException();
        }
        WebElement taskEnterthree = driver.findElement(By.className("todo-user-input"));
        taskEnterthree.sendKeys("Third task");
        WebElement addButtonthird = driver.findElement(By.id("addTodoButton"));
        addButtonthird.click();
        try{
            Thread.sleep(3000);
        }catch (InterruptedException e){
            throw  new RuntimeException();
        }
        WebElement checkbox1 = driver.findElement(By.id("label1"));
        checkbox1.click();
        WebElement checkbox2 = driver.findElement(By.id("label3"));
        checkbox2.click();
        try {
            Thread.sleep(3000);
        }catch (InterruptedException e){
            throw new RuntimeException();
        }
        driver.quit();
    }
}
