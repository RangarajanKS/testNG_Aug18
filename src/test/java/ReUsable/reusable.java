package ReUsable;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;

public class reusable
{

    public String getGlobaldata(String key)
    {
        String data = null;
        try
        {
            Properties prop = new Properties();
            prop.load(new FileInputStream(System.getProperty("user.dir")+"/global.properties"));
            data = prop.getProperty(key);
          //  prop.getProperty(key)
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }


        return data;
    }

    public WebDriver getDriver(){
        WebDriver driver = null;
        try{
        //    System.setProperty("webdriver.chrome.driver", getGlobaldata("chromedriverpath"));
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get(getGlobaldata("url"));
            driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        }
        catch(Exception e){e.printStackTrace();}
        return driver;
    }

}

