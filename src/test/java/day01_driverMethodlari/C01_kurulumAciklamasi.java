package day01_driverMethodlari;

public class C01_kurulumAciklamasi {
}
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

 Selenium jar dosyalari ile projeye eklendiğinde, kullanmak istenen tum browser’larin driver’larinin da
  projeye eklenmesi gerekmektedir.
Kullanilacak browser’a ait driver projeye eklendikten sonra,
 her class’da bilgisayardaki browser’i yönetecek bir WebDriver objesi oluşturulur
 ve o obje yardimiyla WebDriver Class’indaki hazir method’lar kullanılabilir.
WebDriver objesi oluşturmak ve objeye kullanılacak browser’a uygun değeri atamak için main method icerisinde
1) Java’daki setProperty(" webdriver.chrome.driver ", " driverPath"); ile sistem ayarlari yapılır.
System.setProperty("webdriver.chromedriver.driver” ,”src/driver/chromedriver"); /MAC
 System.setProperty("webdriver.chrome.driver","src/driver/chromedriver.exe"); /WINDOWS
2) WebDriver driver= new ChromeDriver( ); ile webdriver objesi oluşturulur ve istenen browser’a
uygun değer atamasi yapılır.

Selenium ile otomasyon yapabilmenin ilk adimi WebDriver Class’indan obje olusturmaktir.




1- Test otomasyonu nedir ? :

Manuel olarak klavye, mouse kullanarak yapabildigimiz testleri,
 yazdigimiz kodlar araciligiyla yapmaya denir.

2- Yazilim testi nedir ? :

 Yazilim yapmaya baslarken ortaya konulan requirement’larin
yazilim tarafindan karsilanip, karsilanmadiginin test edilmesidir.

3- Bunu tespit edebilmek icin developer’lar kodlamaya basladiginda,
gereksinimleri incelemeye baslariz, gereksinimler cercevesinde expected result’lari belirleriz,
developerlar kodlarini bitirip test envoirenment’ina yukledikten sonra,
hazirladigimiz pozitif ve negative test senaryolarini calistirarak actual sonuclari elde edip,
expected result ile actual result ayni mi diye bakariz.
Ayni ise testimiz passed, ayni degilse testimiz failed olur.
Software testi icin tasarim asamasinda belirlenen sonuclar (Expected Result) ile
uygulamanin kendisinden alinan sonuclar (Actual Result) karsilastirilir.
Expected ve actual result birbirine esit ise test basarili (Test Passed), Expected ve actual
result birbirine esit degilse test basarisiz (Test Failed) olarak raporlanir.
Test asamalarinin ve test sonuclarini anlasilabilir olmasi, testin kisa olmasindan önemlidir.
Ornegin; gidilen sayfanin title degerinin belirli bir kelimeyi icerdigi test edilmek isteniyorsa,
expected ve actual degerler kaydedilip, bir if else blogu icerisinde istenen test yapilip,
sonuc yazdirilabilir.


4- Selenium nedir ?
Selenium browser’lari otomate edecek toollarin calismasina imkan taniyan bir suite’dir.
Selenium browser’lari otomate eder, bu gucle ne yapacaginiz size kalmis.

5- Selenium browser’lari nasil kontrol eder ?

Kullandagimiz programla dili ile,
calistigimiz IDE’de olusturacagimiz webdriver sayesinde bilgisayarimizda i
stedigimiz browser’i kullanarak testlerimizi yapabiliriz.


*/