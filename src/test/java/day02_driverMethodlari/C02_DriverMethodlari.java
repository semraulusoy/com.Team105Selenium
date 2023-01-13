package day02_driverMethodlari;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_DriverMethodlari {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.Chromedriver.driver","src/drivers/chromedriver 2");
        WebDriver driver=new ChromeDriver();

        //sayfayi tam ekran yapalim
        driver.manage().window().maximize();
        System.out.println("Maxsimize window boyutlari"+driver.manage().window().getSize());
        Thread.sleep(3000);

        //sayfayi full screen yapalim
        driver.manage().window().fullscreen();
        System.out.println("fullscreen window boyutlari"+driver.manage().window().getSize());
        System.out.println("full screen window konumu"+driver.manage().window().getSize());

        //browseri istedigimiz konuma ve boyuta getirelim
        driver.manage().window().setPosition(new Point(100,100));
        driver.manage().window().setSize(new Dimension(300,300));

        Thread.sleep(3000);
        driver.close();

    }
}
