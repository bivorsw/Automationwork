import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.*;
import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;

public class JavaClassScreenShot {
        public static void main(String[] args) throws IOException, InterruptedException {
            System.setProperty("webdriver.chrome.driver","C://chromedriver.exe");
            WebDriver driver=new ChromeDriver();
            driver.get("https://javaguide.technologychannel.org/");
            File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(src,new File("C:\\hello\\screenshot.png"));
            Desktop.getDesktop().open(new File("C:\\hello"));
            Thread.sleep(1000);
            driver.close();

//            String path = Paths.get("").toAbsolutePath().toString();
//            System.out.println("My Directory is: "+path);
//            String path = System.getProperty("c:\\hello");
//            System.out.println("My Screenshot = " + path);

        }

}
