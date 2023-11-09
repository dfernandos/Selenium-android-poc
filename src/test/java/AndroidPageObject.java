import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

class AndroidPageObject {

    private AppiumDriver driver;

    // Define page elements using By locators
    private By menu = By.xpath("//android.widget.ImageButton[@content-desc='Open navigation drawer']");

    public AndroidPageObject(AppiumDriver driver) {
        this.driver = driver;
    }

    // Methods to interact with page elements
    public void enterUsername() {
        WebElement usernameInput = driver.findElement(this.menu);
        usernameInput.click();
    }
}
