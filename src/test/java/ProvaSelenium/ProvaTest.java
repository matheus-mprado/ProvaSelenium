package ProvaSelenium;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import Page.AuthPO;
import Page.HomePO;
import Page.TShirtPO;

public class ProvaTest extends BaseTest {
    private static HomePO homePage;
    private static TShirtPO tshirtPage;
    private static AuthPO authPage;

    @Before
    public void preparaTestes() {
        homePage = new HomePO(driver);
        authPage = new AuthPO(driver);
        tshirtPage = new TShirtPO(driver);
    }

    @Test
    public void T001_CreateAccount() {
        // preparaTestes();
        homePage.BTNLogin.click();
        authPage.fillInputEmailCreate("teste@gmail.com");

        authPage.initCreateAccount();

        assertTrue(authPage.LBLCreateAccount.isDisplayed());
        assertTrue(authPage.LBLPersonInfo.isDisplayed());
    }

    @Test
    public void T002_LoginFail() {
        // preparaTestes();
        homePage.BTNLogin.click();
        authPage.fillInputEmailLogin("teste@gmail.com");
        authPage.fillInputPasswordLogin("123123");

        authPage.initLoginAccount();

        assertTrue(authPage.MSGErrorLogin.isDisplayed());
    }

    @Test
    public void T003_VerifySectionSpecialsExist() {
        // preparaTestes();
        homePage.BTNTShirtMenu.click();
        assertEquals("T-shirts", tshirtPage.LBLCategoryName.getText());

        assertTrue(tshirtPage.SECSpecialsBlock.isDisplayed());
    }
}
