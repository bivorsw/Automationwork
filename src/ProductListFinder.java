import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.WebElement;


import java.util.ArrayList;
import java.util.List;

public class ProductListFinder {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C://chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://webdriveruniversity.com/");

                driver.manage().window().maximize();

        driver.findElement(By.xpath("//*[@id=\"page-object-model\"]")).click();

        ArrayList tabs = new ArrayList(driver.getWindowHandles());
        driver.switchTo().window((String) tabs.get(1));



        List<WebElement> elements = driver.findElements(By.className("sub-heading"));


        int total = 0;

        for(WebElement e : elements){
            System.out.println(e.getText());
            total = total +1;
        }

        System.out.println("Total no of items "+total);



    }
}