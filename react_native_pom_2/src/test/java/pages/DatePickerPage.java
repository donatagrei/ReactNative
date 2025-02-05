package pages;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

import java.util.List;

public class DatePickerPage extends BasePage {
    public DatePickerPage(AppiumDriver appiumDriver) {
        super(appiumDriver);
    }

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Select Date\")")
    WebElement selectDateButton;

    @AndroidFindBy(uiAutomator = "android:id/next")
    WebElement nextMonthButton;

    public void clickSelectDate() {
        selectDateButton.click();
    }

    public List<WebElement> getMonthViewList() {
        List<WebElement> monthViewList = driver.findElements(AppiumBy.androidUIAutomator("new UiSelector().className(\"android.view.View\").clickable(true)"));
        return monthViewList;
    }

    public void clickNextMonth() {
        nextMonthButton.click();
    }


    public void selectTomorrowDay() {

        String dateOfToday = driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().resourceId(\"android:id/date_picker_header_date\")")).getText();
        String nth = dateOfToday.substring(dateOfToday.length() - 1);
        int todayDate = Integer.parseInt(nth);
        int tomorrowDate = todayDate;
        int monthDaysCount = getMonthViewList().size();

            if (tomorrowDate < monthDaysCount) {
                tomorrowDate++;
                driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().text(\"" + tomorrowDate + "\")")).click();
            } else {
                tomorrowDate = 1;
                clickNextMonth();
                driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().text(\"" + tomorrowDate + "\")")).click();
            }
            // yra tokia klase LocalDate, duoda šiandieną
    }
}


























