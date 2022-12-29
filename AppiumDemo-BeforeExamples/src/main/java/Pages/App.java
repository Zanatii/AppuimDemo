package Pages;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class App {
    private WebDriver driver;
    private By activity_Button = AppiumBy.accessibilityId("Activity");
    public App(WebDriver driver){
        this.driver = driver;
    }
    public Activity clickActivity(){
        driver.findElement(activity_Button).click();
        return new Activity(driver);
    }


}
