package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class KubernatesPage {
    public   WebDriver driver= null;

    public KubernatesPage(WebDriver driver){
        this.driver = driver;
    }


    public String headerLink(String linkName)
    {
        return "//div[@id='main_navbar']//a[text()='"+linkName+"']";

    }


    public String allElements(String component) {

        List<WebElement> elements = driver.findElements(By.xpath("//div[@id='main_navbar']//ul//li"));
        for (WebElement element : elements) {
            String items = element.getText();
            System.out.println("items are -" +items );
            if (items.contains(component)) {
                element.click();
            }

        }


        return component;
    }


}