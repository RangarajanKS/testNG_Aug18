package Scripts;

import PageObject.SigninPage;
import com.beust.jcommander.Parameter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import ReUsable.reusable;

import java.time.Duration;

public class SauceLabTesting {
    WebDriver driver;

    reusable RES;

    SigninPage sp;

    @BeforeSuite
   // @Parameters({"url"})
    public void launch_Test_Application() {
try{
        RES = new reusable();
       // System.setProperty("webdriver.chrome.driver", RES.getGlobaldata("chromedriverpath"));
        System.out.println("this is Before Suite");

        driver = new ChromeDriver();
        //this is initialization of chrome driver
        driver.get(RES.getGlobaldata("url"));
        // this is launch teh docker url in chrome browser
        driver.manage().window().maximize();

        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
    }
catch(Exception e)
{
    e.printStackTrace();
}


}




@Test(enabled = true)
    public void ValidateHeader() {
        WebElement headerElement = driver.findElement(By.xpath("//div[text()='Swag Labs']"));
        //div[text()='Swag Labs']
        Boolean display = headerElement.isDisplayed();
        if (headerElement.isDisplayed()) {
            System.out.println("header validated");
        } else {
            System.out.println("header not validated");
        }
    }

@BeforeTest
@Parameters({"Username","Password"})
    public void Login(String Username , String Password)
    {
        sp = new SigninPage();

        sp.Username();
        sp.Password();
        sp.Submit();

        WebElement UN = driver.findElement(By.id("user-name"));
        //div[text()='Swag Labs']
        UN.sendKeys(Username);
        WebElement PW = driver.findElement(By.id("password"));
        //div[text()='Swag Labs']
        PW.sendKeys(Password);
        //login-button
        WebElement Lb = driver.findElement(By.id("login-button"));
        //div[text()='Swag Labs']
        Lb.click();
    }
    @Test(enabled = true)

    public void ValidateUser() throws InterruptedException {
        WebElement VU = driver.findElement(By.id("react-burger-menu-btn"));
        //div[text()='Swag Labs']
        VU.click();
        WebElement AllItems = driver.findElement(By.id("inventory_sidebar_link"));
        Thread.sleep(5000);

        if (AllItems.getText().equals("All Items"))
        {
            System.out.println("AllItems validated and present");
        } else {
            System.out.println("AllItems validated and not present");
        }

        AllItems.click();


    }


    @AfterSuite
    public void QuitBrowser() {
        {
            System.out.println("this is After Suite");

            driver.quit();
        }


    }
}
