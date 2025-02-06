package Fachinformatik.day04;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.List;

public class CO02_WebelementLocator {
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

        driver.get("https://amazon.com");
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("city bike", Keys.ENTER);

        //let Result write down
        driver.findElement(By.className("a-button-input")).click();
        List<WebElement> Result= driver.findElements(By.className("sg-col-inner"));

        System.out.println("Result  = " + Result.get(0).getText());



       String[] ResultNum=Result.get(0).getText().split(" ");
        System.out.println("ReultNum ="+ ResultNum[3]);
// take first product's locate
       List<WebElement> products =driver.findElements(By.className("s-image"));

      //driver.findElement(By.className("a-icon s-pc-sidesheet-close-icon")).click();
       WebElement firs_product=products.get(2);
      //
       firs_product.click();
        System.out.println("firs_product.isEnabled() = " + firs_product.isEnabled());

        System.out.println("firs_product.isSelected() = " + firs_product.isSelected());

        System.out.println("firs_product.isDisplayed() = " + firs_product.isDisplayed());

        driver.close();

    }
}
