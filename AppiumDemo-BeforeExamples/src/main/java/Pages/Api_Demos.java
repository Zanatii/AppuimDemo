package Pages;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class Api_Demos {
    private WebDriver driver;
    private By app_button = AppiumBy.accessibilityId("App");
    private By Accessibility1_button = new AppiumBy.ByAccessibilityId("Access'ibility");
    private By Graphics_button = new AppiumBy.ByAccessibilityId("Graphics");
    private By Views_button = new AppiumBy.ByAccessibilityId("Views");

    public Api_Demos(WebDriver driver){
        this.driver = driver;
    }
    public App clickApp(){
        driver.findElement(app_button).click();
        return new App(driver);
    }
    public Accessibility1 clickAccessibility1(){
        driver.findElement(Accessibility1_button).click();
        return new Accessibility1(driver);
    }
    public Graphics clickGraphics(){
        driver.findElement(Graphics_button).click();
        return new Graphics(driver);
    }
    public Views clickViews(){
        driver.findElement(Views_button).click();
        return new Views(driver);
    }
}
