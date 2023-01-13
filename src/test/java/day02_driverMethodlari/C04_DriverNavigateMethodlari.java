package day02_driverMethodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C04_DriverNavigateMethodlari {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chromedriver.driver","src/drivers/chromedriver 2");
        WebDriver driver=new ChromeDriver();
        driver.navigate().to("https://www.amazon.com");
        Thread.sleep(5000);
        //get ile ayni islemi yapar
        driver.get("https://www.wisequarter.com");

        Thread.sleep(5000);
        //yeniden amazona donelim
        driver.navigate().back();


        Thread.sleep(5000);

        driver.navigate().forward();


        driver.quit();
    }
}
