package day02_driverMethodlari;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C07_DriverfindElementMethodu {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chromedriver.driver","src/drivers/chromedriver 2");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://www.amazon.com");
        WebElement aramaKutusu =  driver.findElement(By.id("twotabsearchtextbox"));
        aramaKutusu.sendKeys("Lindt");
        aramaKutusu.clear();
        Thread.sleep(5000);
        aramaKutusu.sendKeys("Nutella");
        aramaKutusu.submit();
        Thread.sleep(5000);
        driver.close();

    }
}
