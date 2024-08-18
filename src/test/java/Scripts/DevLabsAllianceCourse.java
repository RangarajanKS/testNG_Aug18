package Scripts;

import PageObject.SigninPage;
import ReUsable.reusable;
import org.openqa.selenium.Alert;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.time.Duration;

public class DevLabsAllianceCourse
{
    WebDriver driver;

    reusable RES;

    SigninPage sp;

    @BeforeClass
    // @Parameters({"url2"})
    public void launch_Test_Application()
    {
        try
        {
            RES = new reusable();
            // System.setProperty("webdriver.chrome.driver", RES.getGlobaldata("chromedriverpath"));
            System.out.println("this is Before Suite");

            driver = new ChromeDriver();
            //this is initialization of chrome driver
            driver.get(RES.getGlobaldata("url2"));
            // this is launch teh docker url in chrome browser
            driver.manage().window().maximize();

            driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }

    @Test
    public void TalkToOurAdvisor_PopUp() throws NoAlertPresentException, InterruptedException {
//WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(15));
      //  driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        //wait.until(ExpectedConditions.alertIsPresent());
     Thread.sleep(15000);
        Alert alrt = driver.switchTo().alert();
        alrt.dismiss();
    }

}
