package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Q2 {
    public static void main(String[] args) {

       // 1 - Driver olusturalim
    System.setProperty("webdriver.Chromedriver.driver","src/drivers/chromedriver 2");
     //   2 - Java class'imiza chromedriver.exe'yi tanitalim
    WebDriver driver=new ChromeDriver();
    //3 - Driver'in tum ekrani kaplamasini saglayalim
        driver.manage().window().maximize();
       // 4 - Driver'a sayfanın yuklenmesini 10.000 milisaniye (10 saniye) boyunca beklesini
        // söyleyelim. Eger oncesinde sayfa yuklenirse, beklemeyi bıraksin.

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
   // 5 - "https://www.otto.de" adresine gidelim
    driver.get("https://www.otto.de");

    //    6 - Bu web adresinin sayfa basligini (title) ve adres (url)ini alalim
        String titleotto=driver.getTitle();
        String Urlotto=driver.getCurrentUrl();

       // 7 - Title ve url'nin "OTTO" kelimesini icerip icermedigini kontrol edelim
       String expData="otto";
        if (titleotto.contains(expData))
            System.out.println("Test PASSED");
        else System.out.println("OTTO title test FAILED");

        if (Urlotto.contains(expData))
            System.out.println("Test PASSED");
        else System.out.println("otto Url test FAILED");
       // 8 - Ardindan "https://wisequarter.com/" adresine gidelim
        driver.navigate().to("https://wisequarter.com/");

        //9 - Bu adresin basligini ve Url alalim ve "Quarter" kelimesini icerip icermedigini kontrol edelim
        String titleQuarter=driver.getTitle();
        String UrlQuarter=driver.getCurrentUrl();
        String expDataQuarter="Quarter";
        if (titleQuarter.contains(expDataQuarter))
            System.out.println("Test PASSED");
        else System.out.println("Quarter title test FAILED");

        if (UrlQuarter.contains(expDataQuarter))
            System.out.println("Test PASSED");
        else System.out.println(" UrlQuarter test FAILED");

        //10- Bir onceki web sayfamiza geri donelim
        driver.navigate().back();
        //11- Sayfayi yenileyelim
        driver.navigate().refresh();
        //12- Daha sonra web sayfamiza tekrar donelim ve oldugumuz sayfayi kapatalim
        driver.navigate().forward();
        driver.close();
        //13- En son adim olarak butun sayfalarimizi kapatmis olalim
        driver.quit();

}}
