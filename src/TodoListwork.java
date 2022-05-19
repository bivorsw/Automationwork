import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TodoListwork {
    public static void main(String[] args) throws InterruptedException {
        String[] names = {"ABC", "XYZ", "MNO"};
        System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://webdriveruniversity.com/To-Do-List/index.html");
        WebElement inputBox = driver.findElement(By.tagName("input"));

        for (String name : names) {
            inputBox.sendKeys(name);
            Thread.sleep(2000);

            inputBox.sendKeys(Keys.RETURN);
        }
        WebElement deleteBox= driver.findElement(By.xpath("//*[@id=\"container\"]/ul/li[5]/span/i"));
        deleteBox.click();

    }
}
