package Pages;

import Actions.MobileActions;
import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Graphics {
    private WebDriver driver;

    private By vertices_button = AppiumBy.accessibilityId("Vertices");
    private By scaleToFit_button = new AppiumBy.ByAccessibilityId("ScaleToFit");
    public Graphics(WebDriver driver){
        this.driver = driver;
        new MobileActions(driver);
    }
    public Vertices clickVertices(){
        MobileActions.scrollDownToSpecificText("Vertices");
        driver.findElement(vertices_button).click();
        return new Vertices(driver);
    }
    public ScaleToFit clickScaleToFit(){
        MobileActions.scrollDownToSpecificText("ScaleToFit");
        driver.findElement(scaleToFit_button).click();
        return new ScaleToFit(driver);
    }

}
