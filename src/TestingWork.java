import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;

public class TestingWork {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C://chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://webdriveruniversity.com/");

                driver.manage().window().maximize();

        driver.findElement(By.xpath("//*[@id=\"button-clicks\"]/div/div[1]/h1")).click();
        driver.getWindowHandle();
        ArrayList tabs = new ArrayList(driver.getWindowHandles());
        driver.switchTo().window((String) tabs.get(1));

        driver.findElement(By.xpath("//*[@id=\"button1\"]/p")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"myModalClick\"]/div/div/div[3]/button")).click();
        Thread.sleep(1000);
        driver.quit();


    }
}