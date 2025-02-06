package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

public class ModalPage extends BasePage {

    public ModalPage(AppiumDriver appiumDriver) {
        super(appiumDriver);
    }

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Open Modal\")")
    WebElement openModalButton;

    @AndroidFindBy(uiAutomator = "new UiSelector().textStartsWith(\"Lorem ipsum dolor sit amet consectetur\")")
    WebElement ModalTitlePopUp;

    public void clickOpenModalButton() {
        openModalButton.click();
    }

    public boolean isModalTitlePopUpDisplayed() {
        return ModalTitlePopUp.isDisplayed();
    }

    // Checks whether the pop up includes some text or not
    public boolean isModalTitlePopUpText(String substring) {
        String wholeText = ModalTitlePopUp.getText();
        return wholeText.contains(substring);
    }

}
