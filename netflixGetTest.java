
package org.example;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class netflixGetTest {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Desktop\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe\\");
        WebDriver obj = new  ChromeDriver();
        obj.get("https://www.netflix.com/in/");
        obj.quit();

    }
}
