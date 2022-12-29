package Tests;
import Actions.MobileActions;
import Pages.Api_Demos;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import java.net.MalformedURLException;
import java.net.URL;

public class TestCases {
    WebDriver driver;

    @BeforeMethod
    public void setupDevice() throws MalformedURLException {
        String AppName = System.getProperty("user.dir") + "\\src\\test\\resources\\TestDataFiles\\ApiDemos-debug.apk";
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("platformName", "Android");
        caps.setCapability("appium:deviceName", "Android Emulator");
        caps.setCapability("appium:app", AppName);
        caps.setCapability("appium:platformVersion", "11.0");
        caps.setCapability("appium:automationName", "UiAutomator2");
        driver = new AndroidDriver(new URL("http://localhost:4723/"), caps);
        new MobileActions(driver);
    }

    @Test
    public void testClickAction() {
        String text = new Api_Demos(driver)
                .clickAccessibility1()
                .getAccessibility1Text();
        Assert.assertEquals(text, "Accessibility Node Provider");
    }

    @Test(dependsOnMethods = "testClickAction")
    public void testTyping() {
        String text = new Api_Demos(driver)
                .clickApp()
                .clickActivity()
                .clickCustomTitle()
                .editLeftIsBest("Appium")
                .getLeftISBestTitle();
        Assert.assertEquals(text, "Appium");
    }

    @Test(dependsOnMethods = "testClickAction")
    public void testCheckBox() {
        String status = new Api_Demos(driver)
                .clickAccessibility1()
                .clickAccessibilityNodeQuerying()
                .clickCheckBox()
                .getConquerWorld();
        Assert.assertEquals(status, "true");
    }
    @Test(dependsOnMethods = "testCheckBox")
    public void testScrolling() {
        String text = new Api_Demos(driver)
                .clickGraphics()
                .clickScaleToFit()
                .getScaleFit_text();
        Assert.assertEquals(text,"Graphics/ScaleToFit");
    }
    @Test(dependsOnMethods = "testScrolling")
    public void testSwiping() {
        new Api_Demos(driver)
                .clickGraphics()
                .clickVertices()
                .swipeRightOnElement()
                .swipeLeftOnElement();
    }

    @Test(dependsOnMethods = "testSwiping")
    public void testRadioButton() {
        String status = new Api_Demos(driver)
                .clickViews()
                .clickRadioGroup()
                .clickSnack()
                .getSnack_radiobutton();
        Assert.assertEquals(status, "true");
    }

    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
