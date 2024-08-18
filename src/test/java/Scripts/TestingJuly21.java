package Scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;

public class TestingJuly21 {
    WebDriver driver;

    @BeforeSuite
    @Parameters({"url"})
    public void launch_Test_Application(String url) {
        System.out.println("this is Before Suite");
        driver = new ChromeDriver();

        // this is launch teh docker url in chrome browser
        driver.manage().window().maximize();


    }

    @BeforeTest
    public void launchURL() {
        System.out.println("This is BeforeTest");
        //this is initialization of chrome driver
        //   driver.get(url);
        String URL = "https://www.saucedemo.com/";
        driver.get(URL);

        // Wait for some time to load web page successfully.
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    @BeforeClass
    @Parameters({"Username", "Password"})
    public void Login(String Username, String Password) {
        System.out.println("This is BeforeClass");
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

    @Test(enabled = false)
    public void ValidateUser() throws InterruptedException {
        WebElement VU = driver.findElement(By.id("react-burger-menu-btn"));
        //div[text()='Swag Labs']
        VU.click();
        WebElement AllItems = driver.findElement(By.id("inventory_sidebar_link"));
        Thread.sleep(5000);

        if (AllItems.getText().equals("All Items")) {
            System.out.println("AllItems validated and present");
        } else {
            System.out.println("AllItems validated and not present");
        }

        AllItems.click();


    }

    @AfterClass
    public void LogoutButtonClick() {
        {
            System.out.println("this is  After Class");
           WebElement Logoutbutton= driver.findElement(By.xpath("//a[text()='Logout']"));

            Logoutbutton.click();
        }
    }

        @AfterTest
        public void CloseBrowser() {
            {
                System.out.println("this is  After Test");

                driver.close();
            }
        }
            @AfterSuite
            public void QuitBrowser() {
                {
                    System.out.println("this is After Suite");

                    driver.quit();
                }

        }
}
