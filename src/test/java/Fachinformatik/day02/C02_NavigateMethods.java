package Fachinformatik.day02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class C02_NavigateMethods {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();

        //
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        options.addArguments("--disable-dev-shm-usage");
        options.addArguments("--no-sandbox");

        // start ChromeDriver
        WebDriver driver = new ChromeDriver(options);
        driver.navigate().to("https://techproeducation.com");
        driver.navigate().to("https://amazon.com");
        driver.manage().window().maximize();
        System.out.println("amazon page= " + driver.getTitle());
        driver.navigate().back();
        System.out.println("techpro page  = " + driver.getTitle());
        driver.navigate().forward();
        System.out.println("amazon page url" + driver.getCurrentUrl());
        driver.navigate().refresh();

        driver.close();
    }
    }

