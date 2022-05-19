import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.awt.*;
import java.io.File;
import java.io.IOException;

public class Barcode {
    public static void main(String[] args) throws InterruptedException, IOException {
       System.setProperty("webdriver.edge.driver", "C://msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.get("https://qrgenerator.technologychannel.org/");
        driver.manage().window().maximize();

       driver.findElement(By.xpath("//*[@id=\"input\"]")).sendKeys("Learning Selenium");

        File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(src,new File("C:\\hello\\screenshot.png"));
        Desktop.getDesktop().open(new File("C:\\hello"));
        Thread.sleep(1000);
        driver.close();

    }
}
