package tests;

import org.junit.jupiter.api.Test;
import pages.ButtonPage;

public class ButtonTest extends BaseTest {
    ButtonPage buttonPage;


    @Test
    public void clickButtonBlock(){
        buttonPage = new ButtonPage(driver);
        buttonPage.clickButtonBlock();
    }

}
