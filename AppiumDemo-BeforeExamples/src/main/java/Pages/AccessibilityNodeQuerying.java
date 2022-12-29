package Pages;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class AccessibilityNodeQuerying {
    private WebDriver driver;
    private By conquerWorld_checkbox = AppiumBy.xpath("(//android.widget.CheckBox[@resource-id=\"io.appium.android.apis:id/tasklist_finished\"])[3]");
    public AccessibilityNodeQuerying(WebDriver driver){
        this.driver = driver;
    }
    public AccessibilityNodeQuerying clickCheckBox(){
        driver.findElement(conquerWorld_checkbox).click();
        return new AccessibilityNodeQuerying(driver);
    }
    public String getConquerWorld(){
        return driver.findElement(conquerWorld_checkbox).getAttribute("checked");
    }
}
