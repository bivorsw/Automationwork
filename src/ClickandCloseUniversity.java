import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class ClickandCloseUniversity {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C://chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://webdriveruniversity.com/Click-Buttons/index.html");

        WebElement clickme=driver.findElement(By.xpath("//*[@id=\"button1\"]/p"));
        clickme.click();

        Thread.sleep(2000);
        WebElement close=driver.findElement(By.xpath("//*[@id=\"myModalClick\"]/div/div/div[3]/button"));
        close.click();
        driver.close();

    }
}
