import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class ComparePrice {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C://chromedriver.exe");
        WebDriver driver=new ChromeDriver();
         driver.get("https://www.ebay.com/itm/154613773340?epid=10049287446&hash=item23ffb2f41c:g:wkUAAOSwlvthQ5FM");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
          String ebayprice =driver.findElement(By.id("prcIsum")).getText();

        ebayprice=ebayprice.replace("$","");
        ebayprice=ebayprice.replace("US","");
        ebayprice=ebayprice.replace(",","");


        driver.get("https://www.amazon.com/Apple-iPhone-13-Pro-Max/dp/B09LPDM924/ref=sr_1_2?crid=2YE2R4RF9HNGH&keywords=iphone%2B13%2Bpro%2Bmax%2B128gb%2Bunlocked&qid=1652317132&sprefix=iphone%2B13%2Bpro%2Bmax%2B128gb%2Bunlocked%2Caps%2C76&sr=8-2&th=1");
        String amazonprice =driver.findElement(By.xpath("//*[@id=\"corePrice_desktop\"]/div/table/tbody/tr[2]/td[2]/span[1]/span[2]")).getText();
        amazonprice=amazonprice.replace("$","");
        amazonprice=amazonprice.replace(",","");

        System.out.println("Ebay Price is " +ebayprice);
        System.out.println("Amazon Price is "+amazonprice);

        Double ebayPriceInDouble = Double.parseDouble(ebayprice);
        Double amazonriceInDouble = Double.parseDouble(amazonprice);

        if(ebayPriceInDouble < amazonriceInDouble){
            System.out.println("Ebay website price is less i.e. "+ebayPriceInDouble+". Amazon price is "+amazonriceInDouble);
        }else{
            System.out.println("Amazon website price is less i.e. "+amazonriceInDouble+". Ebay price is "+ebayPriceInDouble);
        }


    }
}
