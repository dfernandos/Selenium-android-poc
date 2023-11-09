import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

class SobrePageObject {

    private AppiumDriver driver;

    // Define page elements using By locators
    private By menu = By.xpath("//android.widget.ImageView[@content-desc=\"More options\"]");

    private By btnSbre = By.id("com.example.ecoapp:id/title");

    private By message = By.id("android:id/message");
    public SobrePageObject(AppiumDriver driver) {
        this.driver = driver;
    }

    // Methods to interact with page elements
    public String validateSobreMessage() {
        WebElement menu = driver.findElement(this.menu);
        menu.click();

        WebElement btnCadastrar = driver.findElement(this.btnSbre);
        btnCadastrar.click();

        WebElement messageElement = driver.findElement(this.message);

        String messageFromApp = messageElement.getText();

        return messageFromApp;

    }
}
