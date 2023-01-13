package day03_lacators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C02_ByClassName {
    public static void main(String[] args) throws InterruptedException {

        //amazona'a gidip nutella icin arama yapin
        //ilk sayfada cikan urunlerin icerinde
        //en yuksek foyatliyi bulunuz
        System.setProperty("webdriver.chromedriver.driver","src/drivers/chromedriver 2");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://www.amazon.com");
        WebElement aramaKutusu=driver.findElement(By.id("twotabsearchtextbox"));
        aramaKutusu.sendKeys("Nutella"+ Keys.ENTER);

        List<WebElement>fiyatlarListesi=driver.findElements(By.className("a-price-whole"));
        //System.out.println(fiyatlarListesi);
        //WebElement obje oldugundan direk yazilamaz bunun icin for-each loop kullanarak
        // her bir webelement uzerindeki yazilari tek tek yazdirmaliyix

        for (WebElement each:fiyatlarListesi
             ) {
            System.out.println(each.getText()+"");
        }
       /*en yuksek fıyatı bulabılmek ıcın java bılgımızı kullanmalıyız.
       1 - web elementlerden getText ıle fıyatı strıng olarak alın
       2- Strıng fiyatı kıyaslama yapabılmek için Integer'a çevirin
       3- en yuksek fıyatı bulup yazdırın*/
        String fiyatStr;
        Integer fiyatInt;
        Integer enYuksekFiyat=0;
        for (WebElement each:fiyatlarListesi
             ) {
            fiyatStr= each.getText();
            fiyatInt=Integer.parseInt(fiyatStr);
            if (fiyatInt>enYuksekFiyat){
                enYuksekFiyat=fiyatInt;}}

                System.out.println();
        System.out.println("En Yuksek urun fiyati:" + enYuksekFiyat);





        Thread.sleep(3000);
        driver.close();
    }
}
