import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UniversityWork {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C://chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://webdriveruniversity.com/Contact-Us/contactus.html");

        WebElement firstName=driver.findElement(By.name("first_name"));
        WebElement lastName=driver.findElement(By.name("last_name"));
        WebElement email=driver.findElement(By.name("email"));
        WebElement comments=driver.findElement(By.name("message"));

        firstName.sendKeys( "Bivor");
        lastName.sendKeys( "Swar");
        email.sendKeys( "bivor123@gmail.com");
        comments.sendKeys(  "New Account Created");
        Thread.sleep(3000);

//it did not took any unique name of submit button using tagname or name so i have used xpath
        WebElement submit=driver.findElement(By.xpath("//*[@id=\"form_buttons\"]/input[2]"));
        submit.click();
        Thread.sleep(5000);
        driver.close();

    }
}
