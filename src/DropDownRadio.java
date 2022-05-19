import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownRadio {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
        Thread.sleep(2000);
        Select drop= new Select(driver.findElement(By.id("dropdowm-menu-1")));
        Select down1 =new Select(driver.findElement(By.id("dropdowm-menu-2")));
        Select down2 =new Select(driver.findElement(By.id("dropdowm-menu-3")));
                drop.selectByIndex(2);
                down1.selectByIndex(3);
                down2.selectByIndex(2);
        Thread.sleep(8000);
        driver.close();


    }
}
