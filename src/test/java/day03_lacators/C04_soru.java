package day03_lacators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C04_soru {
    public static void main(String[] args) throws InterruptedException {

       //* 1- Bir test class’i olusturun ilgili ayarlari yapin

       System.setProperty("webdriver.chromedriver.driver","src/drivers/chromedriver 2");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

       // 2- https://www.automationexercise.com/ adresine gidin

        driver.get("https://www.automationexercise.com");

       // 3- Sayfada 147 adet link bulundugunu test edin.
        List<WebElement> LinkListesi=driver.findElements(By.tagName("a"));
        if (LinkListesi.size()==147){
            System.out.println("Link listesi testi PASSED");
        }else {
            System.out.println("Link Listesi testi FAILED");}

       // 4- Products linkine tiklayin
        driver.findElement(By.partialLinkText(" Products")).click();

       // 5- special offer yazisinin gorundugunu test edin
        WebElement specialOfferElementi=driver.findElement(By.partialLinkText("sale_image"));
        if (specialOfferElementi.isDisplayed()){
            System.out.println("Special offer testi PASSED");}else {
            System.out.println("Special offer testi FAILED");}

       // 6- Sayfayi kapatin

        /*NoSuchElementException driver findElement ile aradigi */








        Thread.sleep(5000);
        driver.close();
    }
}
