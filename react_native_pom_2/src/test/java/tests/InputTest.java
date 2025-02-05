package tests;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import pages.BasePage;
import pages.InputPage;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class InputTest extends BaseTest {
    BasePage basePage;
    InputPage inputPage;

    @Test
    public void openInputBlock() {
        inputPage = new InputPage(driver);
        inputPage.clickInputBlock();
        assertEquals("Text Input", inputPage.checkTextInputWithLabelTitle());
    }

    @ParameterizedTest
    @CsvSource(value = {"Laba, diena", "Testing, is cool", "Test, hard"})
    public void parameterizedInputFieldsTest(String firstInput, String secondInput) {
        basePage = new BasePage(driver);
        inputPage = new InputPage(driver);
        basePage.clickBlock("Input");
        basePage.scrollToText("Source Code");
        inputPage.insertTextToInputWithPlaceholderEmail(firstInput);
        inputPage.insertTextToInputWithColoredPlaceholder(secondInput);
    }

}
