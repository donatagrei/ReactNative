package tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pages.BasePage;
import pages.ModalPage;
import pages.RadioButtonPage;

public class ModalTest extends BaseTest{
    BasePage basePage;
    ModalPage modalPage;

    @Test
    public void modalTest(){
        basePage = new RadioButtonPage(driver);
        modalPage = new ModalPage(driver);
        basePage.clickBlock("Modal");
        modalPage.clickOpenModalButton();
        Assertions.assertTrue(modalPage.isModalTitlePopUpDisplayed());
        Assertions.assertTrue(modalPage.isModalTitlePopUpText("Lorem ipsum dolor sit amet consectetur"));
    }

}
