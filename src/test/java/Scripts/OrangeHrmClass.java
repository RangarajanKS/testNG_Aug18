package Scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import ReUsable.reusable;

import java.time.Duration;

public class OrangeHrmClass
{
   private WebDriver driver;

    reusable RES;


    @BeforeClass
    public void launchApp(){


        try {
            RES = new reusable();
          //  System.setProperty("webdriver.chrome.driver", RES.getGlobaldata("chromedriverpath"));
            driver = RES.getDriver();
        }
        catch(Exception e){e.printStackTrace();}
    }


    @Test
    public void DoorangehrmliveTest(){




    }


    @AfterClass
    public void closeApp(){


        driver.quit();
    }

}
