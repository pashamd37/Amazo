import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

import static java.lang.Thread.*;

public class Amaz {
    public static void main(String[] args){


        System.setProperty("webdriver.chrome.driver","C:\\Users\\mohammadp\\Desktop\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.flipkart.com/");
        driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);

        driver.manage().window().maximize();
        driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();
        driver.findElement(By.name("q")).sendKeys("Iphones");
        driver.findElement(By.className("vh79eN")).click();
        driver.findElement(By.className("_3wU53n")).click();
      



























    }
}
