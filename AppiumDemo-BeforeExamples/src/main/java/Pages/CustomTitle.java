package Pages;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class CustomTitle {
    private WebDriver driver;
    private By leftIsBest_edit = AppiumBy.id("io.appium.android.apis:id/left_text_edit");
    private By changeLeft_button = AppiumBy.accessibilityId("Change Left");
    private By leftIsBestTitle_text = AppiumBy.id("io.appium.android.apis:id/left_text");

    public CustomTitle(WebDriver driver){
        this.driver = driver;
    }
    public CustomTitle editLeftIsBest(String edit){
        driver.findElement(leftIsBest_edit).clear();
        driver.findElement(leftIsBest_edit).sendKeys(edit);
        driver.findElement(changeLeft_button).click();
        return new CustomTitle(driver);
    }
    public String getLeftISBestTitle(){
        return driver.findElement(leftIsBestTitle_text).getText();
    }
}
