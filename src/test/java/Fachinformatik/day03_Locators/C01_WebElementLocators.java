package Fachinformatik.day03_Locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class C01_WebElementLocators {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();

        //
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        options.addArguments("--disable-dev-shm-usage");
        options.addArguments("--no-sandbox");

        // start ChromeDriver
        WebDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();

        //go to Amazon Web Site and take a locate of Searchbox and write iphone in the Searchbox and let it seacrh

        driver.get("https://amazon.com");
       //driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone", Keys.ENTER);




    }
}
