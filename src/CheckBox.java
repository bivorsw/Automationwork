import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");

        WebElement checkbox1 = driver.findElement(By.xpath("//*[@id=\"checkboxes\"]/label[2]/input"));
        checkbox1.click();
        Thread.sleep(1000);
        // for unselecting the box2
        WebElement checkbox2 = driver.findElement(By.xpath("//*[@id=\"checkboxes\"]/label[3]/input"));
        checkbox2.click();
        Thread.sleep(1000);
        driver.close();


    }
}