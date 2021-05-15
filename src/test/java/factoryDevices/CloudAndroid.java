package factoryDevices;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class CloudAndroid implements IDevice {

    @Override
    public AppiumDriver create() throws MalformedURLException {

        DesiredCapabilities caps = new DesiredCapabilities();

        // Set your access credentials
        caps.setCapability("browserstack.user", "humbertoguadalup1");
        caps.setCapability("browserstack.key", "Edr32kpJfEZxFop4es1t");

        // Set URL of the application under test
        caps.setCapability("app", "bs://eb7a8558e4c1e65fef7e76fe6997fa7c48901ce1");

        // Specify device and os_version for testing
        caps.setCapability("device", "Google Pixel 3");
        caps.setCapability("os_version", "9.0");

        // Set other BrowserStack capabilities
        caps.setCapability("project", "WhenDo");
        caps.setCapability("build", "Java Android");
        caps.setCapability("name", "Humberto Guadalupe y Juan de Dios");


        // Initialise the remote Webdriver using BrowserStack remote URL
        // and desired capabilities defined above
        AndroidDriver<AndroidElement> driver = new AndroidDriver<AndroidElement>(
                new URL("http://hub.browserstack.com/wd/hub"), caps);

        // Invoke driver.quit() after the test is done to indicate that the test is completed.
        return driver;

    }
}
