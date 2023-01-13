package day4_xpath_cssSelector;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_CssSelector {
    public static void main(String[] args) throws InterruptedException {


 //  1.gerekli ayarlari yapin
        System.setProperty("webdriver.chromedriver.driver","src/drivers/chromedriver 2");
        WebDriver driver=new ChromeDriver();
        driver.navigate().to("https://www.amazon.com");
        Thread.sleep(5000);
 // 2- https://www.amazon.com/ adresine gidin

        driver.get("https://www.amazon.com");
 // 3- Browseri tam sayfa yapin
        driver.manage().window().maximize();
//4- Sayfayi “refresh” yapin
        driver.navigate().refresh();
//5- Sayfa basliginin “Spend less” ifadesi icerdigini test edin
        String expectedMetin="Spend Less";
        String actualTitle=driver.getTitle();
        if (actualTitle.contains(expectedMetin)){
            System.out.println();
//6- Gift Cards sekmesine basin

//7- Birthday butonuna basin
//8- Best Seller bolumunden ilk urunu tiklayin
//9- Gift card details’den 25 $’i secin
//10-Urun ucretinin 25$ oldugunu test edin
//11-Sayfayi kapatin
           // (//li[@class=‘a-carousel-card acswidget-carousel__card’])[1]
           // (//button[@id=‘gc-mini-picker-amount-1’])[1]
           // (//span[text()=‘$25.00’])[1]
    }
}}
