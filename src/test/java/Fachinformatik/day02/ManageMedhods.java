package Fachinformatik.day02;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class ManageMedhods {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();

        //
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        options.addArguments("--disable-dev-shm-usage");
        options.addArguments("--no-sandbox");

        // start ChromeDriver
        WebDriver driver = new ChromeDriver(options);
        System.out.println("the position of the page = " + driver.manage().window().getPosition());
        driver.manage().window().getSize();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));// wait 5 sec
        driver.get("https://techproeducation.com");

        System.out.println("driver.manage().window().getSize() = " + driver.manage().window().getPosition());
        Thread.sleep(3000);
        System.out.println("driver.manage().window().getPosition() = " + driver.manage().window().getSize());
        driver.manage().window().minimize();
        driver.manage().window().fullscreen();
        driver.manage().window().setPosition(new Point(50,50));
        driver.manage().window().setSize(new Dimension(600,600));
        driver.close();//close the page
        driver.quit();//close all the  pages
    }
}
