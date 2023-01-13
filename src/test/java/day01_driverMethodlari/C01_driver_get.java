package day01_driverMethodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/* JAR DOSYALARIYLA SELENIUM KURULUMU
1. https://www.selenium.dev/downloads/adresine gidin
2. Selenium Client&Web Driver Language Bindings altinda Java Driver'ini download edin (hangisi aktif gecerliyse)
3. Browser altinda Chrome documentationlinkini tiklayalim
Chromeun kendi sayfasina gidip Current Stable Release i tiklayip size uygun olan surumu download edin
indirilen surum ile bilgisayarinizdaki Chrome browser surumunun ayni oldugundan emin olun
4. src altinda resources director'si olusturun
5.Bu klasor altinda drivers ve libraries klSORLERI OLUSTURUN
6.INDIRDIGIMIZ CHROME DRIVERI DRIVERS KLASORUNE SELENIUM JAVA dosyasini ise libraries klasorune cikartin
7.intellij'de yeni project/package/class olusturalim ve class icinde main method olusturun
8.File/Project Structure /Modules/Dependencies kismindan jar dosyalarini yulkeyin (selenium dosyasinin icinde bir de
lib dosyasi var onu da acip o dosyalarida ekleyin apply deyip ok e basin

 Selenium jar dosyalari ile projeye eklendiğinde, kullanmak istenen tum browser’larin driver’larinin da projeye eklenmesi gerekmektedir.
Kullanilacak browser’a ait driver projeye eklendikten sonra, her class’da bilgisayardaki browser’i yönetecek bir WebDriver objesi oluşturulur ve o obje yardimiyla WebDriver Class’indaki hazir method’lar kullanılabilir.
WebDriver objesi oluşturmak ve objeye kullanılacak browser’a uygun değeri atamak için main method icerisinde
1) Java’daki setProperty(" webdriver.chrome.driver ", " driverPath"); ile sistem ayarlari yapılır.
System.setProperty("webdriver.chrome.driver” ,”src/driver/chromedriver"); /MAC System.setProperty("webdriver.chrome.driver","src/driver/chromedriver.exe");
\\WINDOWS
2) WebDriver driver= new ChromeDriver( ); ile webdriver objesi oluşturulur ve istenen browser’a uygun değer atamasi yapılır.


*/

public class C01_driver_get {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chorome.driver","src/drivers/chromedriver 2");


        WebDriver driver= (WebDriver) new ChromeDriver();

        driver.get("https:www.amazon.com");
        Thread.sleep(5000);
        driver.close();
/* 1- Selenium jar dosyalarini ve chromedriver'ini manuel olarak sisteme
tanitmis olduk.

Eger firefox veya safari ile calismamiz gerekirse bu defa da
onlarin driver'larini indirip, manuel olarak
9.satirda olan driver'lari tanimlamaliyiz.

2- 12.satirda ChromeDriver() constructor'ini kullanarak bir obje olusturduk
bu objeyi kullanmasak bile
bu satirdan dolayi bos bir browser acilir

3- driver.get(url) driver'i yazdigimiz url'e goturur
url yazarken www yazmasak dahi calisir
ancak https:// yazmazsak method calismaz.
*/


    }
}
