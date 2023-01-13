package day03_lacators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C03_ByLinkText {
    public static void main(String[] args) {

        System.setProperty("webdriver.chromedriver.driver", "src/drivers/chromedriver 2");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://www.amazon.com");
        WebElement giftCardLinki = driver.findElement(By.linkText("Gift Cards"));
        giftCardLinki.click();
        //istenen sayfaya gittigini test etmek icin
        //tikle Girft Card icerdigini test eder.


        String expectedKelime = "Gift Cards";
        String actualTitle = driver.getTitle();

        if (actualTitle.contains(expectedKelime)) {
            System.out.println("Gift Cards testi PASSED");
        } else {
            System.out.println("Gift Cards testi FAILED");
        }
    }}
