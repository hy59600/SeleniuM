package Fachinformatik.day03_Locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;
import java.util.List;

public class C03_findelement {

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
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

        // go to amazon.com, take a locate of Searchbox
       driver.get("https://amazon.com");
        List<WebElement> listofLinks=driver.findElements(By.tagName("a"));
        System.out.println("The number of Links " + listofLinks.size());
       /* for (WebElement w: listofLinks) {
            System.out.println(w.getText());


        }*/

        //with Lambda
        listofLinks.forEach(link -> {if (!link.getText().isEmpty())

            System.out.println("link.getText().isEmpty() = " + link.getText());
        });
        System.out.println("///////////////////////////////////////////////////////////////");
        //Shop deals in Ele
        System.out.println(" = " + driver.findElement(By.linkText("Shop great deals now")).getText());
        driver.close();
    }
}
