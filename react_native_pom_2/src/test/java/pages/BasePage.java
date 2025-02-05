package pages;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BasePage {
    AppiumDriver driver;

    // Initializes the driver to control the app.
    // It initializes page elements, so they can be used automatically.
    public BasePage(AppiumDriver appiumDriver) {
        this.driver = appiumDriver;
        PageFactory.initElements(new AppiumFieldDecorator(appiumDriver), this);
    }

    // reusable method for different WebElements
    public void waitForVisibility(WebElement element){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public void clickBlock(String block){
        driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().text(\"" + block + "\")")).click();
    }

    public void scrollToText(String text){
        driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().className(\"android.widget.ScrollView\")).scrollTextIntoView(\"" + text + "\")"));
    }

}
