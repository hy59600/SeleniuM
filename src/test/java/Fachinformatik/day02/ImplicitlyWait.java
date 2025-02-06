package Fachinformatik.day02;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class ImplicitlyWait {
    public static void main(String[] args) {
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

        String amazonUrl="https://amazon.com";
        String techproUrl="https://techproeducation.com";

        driver.get(techproUrl);
        driver.get(amazonUrl);
        String actualTitle=driver.getTitle();
        String expectedWort="Techpro";
        driver.navigate().back();
if(actualTitle.contains(expectedWort)){
    System.out.println("Test passed");
}else System.out.println("Test Failed"+ actualTitle);

driver.navigate().forward();

if(driver.getTitle().contains("Amazon")){
    System.out.println("Test passed");
}else System.out.println("Test failed"+ actualTitle);

driver.close();
    }
}
