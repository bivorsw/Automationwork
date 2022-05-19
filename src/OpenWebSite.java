import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.FileWriter;


public class OpenWebSite {
    public static void main(String[] args) {
        //Open amazon.com and save its title to the sitename.txt file.
        System.setProperty("webdriver.chrome.driver","C://chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.amazon.com/");

        try {
            File f = new File("amazon2.txt");
            if (f.createNewFile()) {
                System.out.println("File is successfully created" + f.getName());
                FileWriter myWriter = new FileWriter("amazon2.txt");
                myWriter.write(driver.getTitle());
                myWriter.close();
            } else {
                System.out.println("Seems like file already exist.");
            }
        } catch (Exception e) {
            System.out.println("An error occurred. " + e.getMessage());
}

    }
}
