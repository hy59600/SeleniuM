package Fachinformatik.day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_DriverMetods {
    public static void main(String[] args) {
        System.setProperty("chromeDriver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.get("https://amazon.com");

    }
}
