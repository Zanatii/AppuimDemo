package Pages;

import Actions.MobileActions;
import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RadioGroup {
    private WebDriver driver;
    private By snack_radiobutton = AppiumBy.id("io.appium.android.apis:id/snack");

    public RadioGroup(WebDriver driver) {
        this.driver = driver;
    }

    public RadioGroup clickSnack() {
        driver.findElement(snack_radiobutton).click();
        return new RadioGroup(driver);
    }
    public String getSnack_radiobutton() {
        return driver.findElement(snack_radiobutton).getAttribute("checked");
    }
}
