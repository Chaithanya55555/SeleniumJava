package org.example;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class snapchatTest {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Desktop\\WebDriver\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe\\");
        WebDriver obj = new ChromeDriver();
        obj.get("https://www.snapchat.com");
        String title = obj.getTitle();
        System.out.println("webPageTitle: " + title);
        obj.quit();
    }
}
