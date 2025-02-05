package pages;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

public class InputPage extends BasePage { //extends PageBase class, inheriting its properties and methods.

    //locates an Android UI element using uiAutomator strategy
    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Input\")")
    WebElement inputBlock;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Text Input\")")
    WebElement textInputWithLabelTitle;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Email\").instance(1)")
    WebElement inputWithPlaceholderEmail;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Colored Placeholder\")")
    WebElement inputWithColoredPlaceholder;

    // Constructor is essential for proper initialization of the AppiumDriver within
    // both the InputPage and its superclass PageBase
    public InputPage(AppiumDriver appiumDriver) {
        super(appiumDriver);
    }

    // Method which waits for element and then clicks that element
    public void clickInputBlock() {
        waitForVisibility(inputBlock);
        inputBlock.click();
    }

    // Returns text of the element
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


