package Scripts;

import ReUsable.reusable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import ReUsable.reusable;
import org.testng.annotations.Test;

import java.time.Duration;

public class PropTryclass
{
    WebDriver driver;

    reusable RES;
    @BeforeClass
    public void launchApp()
    {

        try {
            RES = new reusable();
            //System.setProperty("webdriver.chrome.driver", RES.getGlobaldata("chromedriverpath"));
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get(RES.getGlobaldata("url"));
            driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }


    @Test
    public void validateCartFunctionality(){
        try {


            // Do Login
            loginToSauce();
            //    readAvailableProductsData();


        }
        catch(Exception e){e.printStackTrace();}
    }

    public void loginToSauce()
    {
        try
        {
            driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys(RES.getGlobaldata("Username"));
            driver.findElement(By.xpath("//input[@id='password']")).sendKeys(RES.getGlobaldata("Password"));
            driver.findElement(By.xpath("//input[@id='login-button']")).click();
            driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
            if (driver.findElement(By.xpath("//button[text()='Open Menu']")).isDisplayed())
            {
                System.out.println("User Logged in Success ......");
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }

    }



}
