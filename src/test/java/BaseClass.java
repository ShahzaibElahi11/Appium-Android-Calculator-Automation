import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.net.MalformedURLException;
import java.net.URL;

public class BaseClass {

    AndroidDriver driver;

    @BeforeTest
    public void setup() throws MalformedURLException {

        DesiredCapabilities capabilities = new DesiredCapabilities();

        capabilities.setCapability("appium:deviceName","Infinix NOTE 11");
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("appium:automationName","uiautomator2");
        capabilities.setCapability("appium:platformVersion", "12");
        capabilities.setCapability("appium:appPackage","com.transsion.calculator");
        capabilities.setCapability("appium:appActivity", "com.transsion.calculator.Calculator");

        URL url = new URL("http://127.0.0.1:4723/");

        driver = new AndroidDriver(url, capabilities);
        System.out.println("Application Started...");

    }

    @AfterTest
    public void teardown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
