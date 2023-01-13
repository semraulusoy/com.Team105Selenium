package day02_driverMethodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C03_DriverMethodlari {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chromedriver.driver", "src/drivers/chromedriver 2");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.amazon.com");
        System.out.println(driver.getPageSource());
        Thread.sleep(3000);

        //pagesource"un MEOW icerdigini test edin


        String pageSource=driver.getPageSource();
        String expectedKelime="MEOW";
        if(pageSource.contains(expectedKelime)){
            System.out.println("Page source testi PASSED");}
        else {
            System.out.println("page source testi failed");}


        driver.close();
    }
}
