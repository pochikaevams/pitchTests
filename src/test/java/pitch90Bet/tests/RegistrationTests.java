package pitch90Bet.tests;

import org.junit.Test;
import pitch90Bet.pages.LoginPage;
import pitch90Bet.pages.MainPage;
import pitch90Bet.pages.RegistrationPage;

public class RegistrationTests extends TestBase {

    RegistrationPage registrationPage = new RegistrationPage(driver);
    MainPage mainPage = new MainPage(driver);

    @Test
    public void invalidRegistration() {

        driver.get("http://localhost:8000/");

        mainPage.clickOnRegisterButton();
        registrationPage.setPhone("1234567899")
                .clickOnSendCodeButton()
                .setPassword("123")
                .setSMSCodeField("123")
                .clickOnAceeptCheckbox()
                .clickOnOver18yearsOldCheckbox()
                .clickOnRegisterButton();
        mainPage.checkUnsuccessRegistration();
    }

    @Test
    public void emptyFieldsRegistration() {

        driver.get("http://localhost:8000/");

        mainPage.clickOnRegisterButton();
        registrationPage
                .clickOnSendCodeButton()
                .setPhone("")
                .setPassword("")
                .setSMSCodeField("")
                .clickOnAceeptCheckbox()
                .clickOnOver18yearsOldCheckbox()
                .clickOnRegisterButton();
        registrationPage.checkRegistrationAttentionText();
    }

    @Test
    public void invalidCodeRegistration() {

        driver.get("http://localhost:8000/");

        mainPage.clickOnRegisterButton();
        registrationPage.setPhone("1202601453")
                .clickOnSendCodeButton()
                .setPassword("123")
                .setSMSCodeField("123")
                .clickOnAceeptCheckbox()
                .clickOnOver18yearsOldCheckbox()
                .clickOnRegisterButton();
        mainPage.checkUnsuccessRegistration();
    }

    @Test
    public void noCheckboxRegistration() {

        driver.get("http://localhost:8000/");

        mainPage.clickOnRegisterButton();
        registrationPage.setPhone("1202601453")
                .clickOnSendCodeButton()
                .setPassword("123")
                .setSMSCodeField("123")
                .clickOnRegisterButton();
        registrationPage.checkRegistrationAttentionText();
    }
}
