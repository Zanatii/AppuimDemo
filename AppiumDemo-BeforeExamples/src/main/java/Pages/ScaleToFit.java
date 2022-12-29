package Pages;

import Actions.MobileActions;
import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ScaleToFit {
    private WebDriver driver;
    private By scaleFit_text = AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.view.ViewGroup/android.widget.TextView");

    public ScaleToFit(WebDriver driver){
        this.driver = driver;
        new MobileActions(driver);
    }

    public String getScaleFit_text() {
        return driver.findElement(scaleFit_text).getText();
    }
}
