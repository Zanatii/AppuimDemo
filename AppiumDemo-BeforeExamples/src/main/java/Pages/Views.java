package Pages;

import Actions.MobileActions;
import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Views {
    private WebDriver driver;
    private By radioGroup_button = new AppiumBy.ByAccessibilityId("Radio Group");

    public Views(WebDriver driver){
        this.driver = driver;
        new MobileActions(driver);
    }
    public RadioGroup clickRadioGroup(){
        MobileActions.scrollDownToSpecificText("Radio Group");
        driver.findElement(radioGroup_button).click();
        return new RadioGroup(driver);
    }
}
