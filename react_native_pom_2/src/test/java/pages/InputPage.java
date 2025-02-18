package pages;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

public class InputPage extends BasePage { //extends PageBase class, inheriting its properties and methods.

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Input\")")
    WebElement inputBlock;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Text Input\")")
    WebElement textInputWithLabelTitle;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Email\").instance(1)")
    WebElement inputWithPlaceholderEmail;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Colored Placeholder\")")
    WebElement inputWithColoredPlaceholder;

    
    public InputPage(AppiumDriver appiumDriver) {
        super(appiumDriver);
    }

    public void clickInputBlock() {
        waitForVisibility(inputBlock);
        inputBlock.click();
    }

    public String checkTextInputWithLabelTitle() {
        return textInputWithLabelTitle.getText();
    }

    public void insertTextToInputWithPlaceholderEmail(String text) {
        inputWithPlaceholderEmail.sendKeys(text);
    }

    public void insertTextToInputWithColoredPlaceholder(String text) {
        inputWithColoredPlaceholder.sendKeys(text);
    }

}


