package Pages;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class Accessibility1 {
    private WebDriver driver;
    private By accessibilityNodeProvider_button = new AppiumBy.ByAccessibilityId("Accessibility Node Provider");
    private By accessibilityNodeQuerying_button = new AppiumBy.ByAccessibilityId("Accessibility Node Querying");
    public Accessibility1(WebDriver driver){
        this.driver = driver;
    }
    public String getAccessibility1Text(){
        return driver.findElement(accessibilityNodeProvider_button).getText();
    }
    public AccessibilityNodeQuerying clickAccessibilityNodeQuerying(){
        driver.findElement(accessibilityNodeQuerying_button).click();
        return new AccessibilityNodeQuerying(driver);
    }
}
