package tests;

import org.junit.jupiter.api.Test;
import pages.BasePage;
import pages.DatePickerPage;

public class DatePickerTest extends BaseTest{
    BasePage basePage;
    DatePickerPage datePickerPage;

    @Test
    public void pickTomorrowDateTest(){
        basePage = new BasePage(driver);
        datePickerPage = new DatePickerPage(driver);
        basePage.clickBlock("Date Picker");
        datePickerPage.clickSelectDate();
        datePickerPage.selectTomorrowDay();






    }












}
