import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class SobreTest {

    private static AppiumDriver driver;

    @BeforeEach
    public void setUp() throws MalformedURLException {
        // Set up the desired capabilities for the Android device and app
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Pixel_4");
        capabilities.setCapability(MobileCapabilityType.APP, "/Users/danieloliveira/Downloads/EmporioPW3/app/build/outputs/apk/debug/app-debug.apk");
        capabilities.setCapability("automationName", "UiAutomator2"); // For Android
        // Initialize the AppiumDriver with the specified capabilities
        driver = new AndroidDriver(new URL("http://0.0.0.0:4723/"), capabilities);
    }

    @AfterAll
    public static void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }

    @Test
    public void sobreTest() {
        SobrePageObject sobrePageObject = new SobrePageObject(driver);
        String messageFromApp = sobrePageObject.validateSobreMessage();

        System.out.println(messageFromApp);
        Assertions.assertEquals(messageFromApp, "Daniel Oliveira\n" +
                "\n" +
                " PW3 \n" +
                " 5 semestre");
    }
}
