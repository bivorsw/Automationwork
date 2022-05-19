import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Amazon {
    public static void main(String[] args) {

                System.setProperty("webdriver.chrome.driver","C://chromedriver.exe");
                WebDriver driver=new ChromeDriver();
                driver.get("https://www.amazon.com/");
                driver.get("https://www.amazon.com/gp/bestsellers/?ref_=nav_cs_bestsellers");
            }
    }

