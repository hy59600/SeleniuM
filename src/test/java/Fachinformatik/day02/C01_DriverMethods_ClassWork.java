package Fachinformatik.day02;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class C01_DriverMethods_ClassWork {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();

        //
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        options.addArguments("--disable-dev-shm-usage");
        options.addArguments("--no-sandbox");

        // start ChromeDriver
        WebDriver driver = new ChromeDriver(options);

        // open Web site
        driver.get("https://www.amazon.com/");
        String actualTitle=driver.getTitle();
        String expectedTitle="Amazon";
        if(actualTitle.contains(expectedTitle)){
            System.out.println("Test Passed");
        }else System.out.println("Test Failed");

        String actualURL= driver.getCurrentUrl();
        String expectedURL= "https://wwww.amazon.com";
        if (actualURL.contains(expectedURL)){
            System.out.println("Test Passed");
        }else System.out.println("Test Fail");
        driver.close();
    }
}
