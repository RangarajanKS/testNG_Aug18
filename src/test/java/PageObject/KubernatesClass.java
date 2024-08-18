package PageObject;

import ReUsable.reusable;
import action.Actions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class KubernatesClass {

    WebDriver driver;

    reusable RES;
    Actions ACT;
    KubernatesPage kp;

    @BeforeClass
    public void launchApp() {

        try {


            RES = new reusable();
            //System.setProperty("webdriver.chrome.driver", RES.getGlobaldata("chromedriverpath"));
            driver = new ChromeDriver();
            kp = new KubernatesPage(driver);
            ACT = new Actions(driver);
            driver.manage().window().maximize();
            Thread.sleep(2000);
            driver.get(RES.getGlobaldata("url"));
            driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void allElementsValidation() throws InterruptedException
    {
Thread.sleep(2000);
        ACT.CheckForElement(kp.headerLink("Partners"));
        Thread.sleep(2000);
            kp.allElements("Versions");


    }

    @Test
    public void Print_All_Links() throws InterruptedException
    {
        int links = driver.findElements(By.xpath("//a")).size();
        System.out.println("Total links count ==>"+links);


        for(int i=1;i<links;i++){


            String link = driver.findElement(By.xpath("(//a)["+i+"]")).getText();
            System.out.println("The link with position==>"+i+" is==>"+link);




        }


    }
}

