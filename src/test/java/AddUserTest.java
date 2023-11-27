import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import java.time.Duration;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
public class AddUserTest {
    public static void main(String[]args){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\saina\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://qaadduser.ccbp.tech/");
        WebElement user=driver.findElement(By.id("name"));
        user.sendKeys("rahul");
        WebElement pswrd=driver.findElement(By.id("email"));
        pswrd.sendKeys("rahul@2021");

        WebElement countryDropdown = driver.findElement(By.tagName("select"));
        Select countrySelect = new Select(countryDropdown);

        // Select an option by visible text
        countrySelect.selectByValue("Active");

        WebElement gender=driver.findElement(By.id("genderMale"));
        gender.click();

        WebElement submit=driver.findElement(By.className("btn-primary"));
        submit.click();
        driver.quit();

    }
}
