package Pages;

import Actions.MobileActions;
import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Vertices {
    WebDriver driver;
    private By verticesWidget_widget = AppiumBy.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]");
    public Vertices(WebDriver driver){
        this.driver = driver;
        new MobileActions(driver);
    }
    public Vertices swipeRightOnElement(){
        MobileActions.swipeRightOnElement(verticesWidget_widget,driver);
        return new Vertices(driver);
    }
    public Vertices swipeLeftOnElement(){
        MobileActions.swipeLeftOnElement(verticesWidget_widget);
        return new Vertices(driver);
    }
}
