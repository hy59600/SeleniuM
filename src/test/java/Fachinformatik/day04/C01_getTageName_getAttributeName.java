package Fachinformatik.day04;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class C01_getTageName_getAttributeName {
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
        WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));

        String actualTagName = searchBox.getTagName();
        String expectedTag = "input";
        System.out.println(actualTagName);
        if (actualTagName.equals(expectedTag)) {
            System.out.println("Test Passed");

        } else System.out.println("Test Failed");
        String actualAtributName = searchBox.getAttribute("name");
        String expectedAtribuname = "field-keywords";
        if (expectedAtribuname.equals(actualAtributName)) {
            System.out.println("Test Passed");

        } else System.out.println("Test Failed");

        driver.close();
    }}