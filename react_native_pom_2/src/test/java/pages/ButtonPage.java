package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

public class ButtonPage extends BasePage {

    public ButtonPage(AppiumDriver appiumDriver) {
        super(appiumDriver);
    }

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Button\")")
    WebElement buttonBlock;

    public void clickButtonBlock() {
        buttonBlock.isDisplayed();
        buttonBlock.click();
    }

}
