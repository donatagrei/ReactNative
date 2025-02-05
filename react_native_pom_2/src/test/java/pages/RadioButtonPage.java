package pages;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

public class RadioButtonPage extends BasePage{

    public RadioButtonPage(AppiumDriver appiumDriver) {
        super(appiumDriver);
    }

    public void chooseGender(String gender) {
        waitForVisibility(driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().text(\"" + gender + "\")")));
        driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().text(\"" + gender + "\")")).click();
    }




}
