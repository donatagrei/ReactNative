package tests;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.provider.ValueSource;
import pages.BasePage;
import pages.RadioButtonPage;
import org.junit.jupiter.params.ParameterizedTest;

public class RadioButtonTest extends BaseTest {
    BasePage basePage;
    RadioButtonPage radioButtonPage;

    @Test
    public void radioGroupButtonsTest() {
        basePage = new RadioButtonPage(driver);
        radioButtonPage = new RadioButtonPage(driver);
        basePage.clickBlock("Radio Button");
        radioButtonPage.chooseGender("Female");
        radioButtonPage.chooseGender("Other");
        radioButtonPage.chooseGender("Male");
    }

    @ParameterizedTest
    @ValueSource(strings = {"Female", "Other", "Male"})
    public void parameterizedRadioButtonsTest(String gender) {
        basePage = new RadioButtonPage(driver);
        radioButtonPage = new RadioButtonPage(driver);
        basePage.clickBlock("Radio Button");
        radioButtonPage.chooseGender(gender);
   }

}
