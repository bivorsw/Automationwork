import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
        WebElement radiobutton = driver.findElement(By.xpath("//*[@id=\"radio-buttons\"]/input[2]"));
        radiobutton.click();
        Thread.sleep(2000);
        WebElement radiobutton2 = driver.findElement(By.xpath("//*[@id=\"radio-buttons\"]/input[2]"));
        radiobutton2.click();
        Thread.sleep(1000);
        WebElement radiobutton3 = driver.findElement(By.xpath("//*[@id=\"radio-buttons\"]/input[4]"));
        radiobutton3.click();
        Thread.sleep(1000);
        driver.quit();

    }

}
