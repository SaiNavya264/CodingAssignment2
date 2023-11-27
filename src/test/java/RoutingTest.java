import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import java.time.Duration;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class RoutingTest {
    public static void main(String[]args){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\saina\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://qaroutingtest.ccbp.tech/");
        WebElement about=driver.findElement(By.linkText("About"));
        about.click();
         String expectedUrl="https://qaroutingtest.ccbp.tech/about";

         WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
         wait.until(ExpectedConditions.urlToBe(expectedUrl));
         String currentUrl=driver.getCurrentUrl();
         if(currentUrl.equals(expectedUrl)){
             System.out.println("Navigated to About page");
         }

        WebElement contact1=driver.findElement(By.partialLinkText("Contact"));
        contact1.click();
        String contactUrl="https://qaroutingtest.ccbp.tech/contact";
        String currentUrl2=driver.getCurrentUrl();
        if(currentUrl2.equals(contactUrl)){
            System.out.println("Navigated to Contact page");
        }

    }
}
