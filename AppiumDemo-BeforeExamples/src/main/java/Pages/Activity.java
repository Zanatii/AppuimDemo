package Pages;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Activity {
    private WebDriver driver;
    private By customTitle_Button = AppiumBy.accessibilityId("Custom Title");
    public Activity(WebDriver driver){
        this.driver = driver;
    }
    public CustomTitle clickCustomTitle(){
        driver.findElement(customTitle_Button).click();
        return new CustomTitle(driver);
    }
}
