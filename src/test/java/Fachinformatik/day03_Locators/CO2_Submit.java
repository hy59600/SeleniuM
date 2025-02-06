package Fachinformatik.day03_Locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class CO2_Submit {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();

        //
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        options.addArguments("--disable-dev-shm-usage");
        options.addArguments("--no-sandbox");

        // start ChromeDriver
        WebDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

        // go to amazon.com, take a locate of Searchbox
        driver.get("https://amazon.com");
        driver.findElement(By.name("field-keywords"));
        driver.findElement(By.name("field-keywords")).sendKeys("iphone");
        Thread.sleep(3000);
        driver.findElement(By.name("field-keywords")).submit();

        driver.navigate().back();

        driver.findElement(By.name("field-keywords")).sendKeys("samsung");
        driver.findElement(By.name("field-keywords")).submit();
    //close the website
        driver.close();




    }
}
