import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class DragDrop {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://webdriveruniversity.com/Actions/index.html");
        Thread.sleep(1000);
        //Using Action class for drag and drop.
        Actions act=new Actions(driver);

        WebElement source= driver.findElement(By.xpath("//*[@id=\"draggable\"]/p/b"));
        WebElement destination= driver.findElement(By.xpath("//*[@id=\"droppable\"]/p/b"));

        //Dragged and dropped.
        act.clickAndHold(source).pause(Duration.ofSeconds(2)).moveToElement(destination).release().build().perform();


    }

}