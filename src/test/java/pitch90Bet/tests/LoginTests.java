package pitch90Bet.tests;

import org.junit.Test;
import pitch90Bet.pages.LoginPage;
import pitch90Bet.pages.MainPage;

public class LoginTests extends TestBase {

    LoginPage loginPage = new LoginPage(driver);
    MainPage mainPage = new MainPage(driver);

    @Test
    public void validLogin() {

        driver.get("http://localhost:8000/");

        mainPage.clickOnLoginButton();
        loginPage.setPhone("22222222")
                .setPwdField("123")
                .clickLogButton();
        mainPage.checkSuccessLogin();
    }

    @Test
    public void invalidLogin() {

        driver.get("http://localhost:8000/");

        mainPage.clickOnLoginButton();
        loginPage.setPhone("22222222")
                .setPwdField("1232")
                .clickLogButton();
        mainPage.checkUnsuccessLogin();
    }

    @Test
    public void emptyFieldsLogin() {

        driver.get("http://localhost:8000/");

        mainPage.clickOnLoginButton();
        loginPage.setPhone("")
                .setPwdField("")
                .clickLogButton();
        mainPage.checkUnsuccessLogin();
    }

    @Test
    public void invalidPasswordLogin() {

        driver.get("http://localhost:8000/");

        mainPage.clickOnLoginButton();
        loginPage.setPhone("22222222")
                .setPwdField("")
                .clickLogButton();
        mainPage.checkUnsuccessLogin();
    }

    @Test
    public void invalidPhoneLogin() {

        driver.get("http://localhost:8000/");

        mainPage.clickOnLoginButton();
        loginPage.setPhone("2")
                .setPwdField("")
                .clickLogButton();
        mainPage.checkUserNotExists();
    }

    @Test
    public void emptyPhonePasswordRecovery() {

        driver.get("http://localhost:8000/");

        mainPage.clickOnLoginButton();
        loginPage.clickForgotPasswordButton()
                .clickContinueButton();
    }

    @Test
    public void invalidPhonePasswordRecovery() {

        driver.get("http://localhost:8000/");

        mainPage.clickOnLoginButton();
        loginPage.setPhone("2")
                .clickForgotPasswordButton()
                .clickContinueButton();
    }

    @Test
    public void emptyCodePasswordRecovery() {

        driver.get("http://localhost:8000/");

        mainPage.clickOnLoginButton();
        loginPage .clickForgotPasswordButton()
                .setRecoveryPhone("22222222")
                .clickContinueButton()
                .setNewPassword("123")
                .setRepeatPassword("123")
                .setCodeRecoveryPassword("")
                .clickContinueRecoveryButton();
    }

    @Test
    public void invalidCodePasswordRecovery() {

        driver.get("http://localhost:8000/");

        mainPage.clickOnLoginButton();
        loginPage .clickForgotPasswordButton()
                .setRecoveryPhone("222222222")
                .clickContinueButton()
                .setNewPassword("123")
                .setRepeatPassword("123")
                .setCodeRecoveryPassword("123")
                .clickContinueRecoveryButton();
    }

    @Test
    public void emptyNewPasswordRecovery() {

        driver.get("http://localhost:8000/");

        mainPage.clickOnLoginButton();
        loginPage .clickForgotPasswordButton()
                .setRecoveryPhone("22222222")
                .clickContinueButton()
                .setNewPassword("")
                .setRepeatPassword("123")
                .setCodeRecoveryPassword("123")
                .clickContinueRecoveryButton();
        mainPage.checkUserNotExists();
    }

    @Test
    public void emptyRepeatPasswordRecovery() {

        driver.get("http://localhost:8000/");

        mainPage.clickOnLoginButton();
        loginPage .clickForgotPasswordButton()
                .setRecoveryPhone("22222222")
                .clickContinueButton()
                .setNewPassword("123")
                .setRepeatPassword("")
                .setCodeRecoveryPassword("123")
                .clickContinueRecoveryButton();
        mainPage.checkUserNotExists();
    }

    @Test
    public void samePasswordRecovery() {

        driver.get("http://localhost:8000/");

        mainPage.clickOnLoginButton();
        loginPage .clickForgotPasswordButton()
                .setRecoveryPhone("22222222")
                .clickContinueButton()
                .setNewPassword("123")
                .setRepeatPassword("123")
                .setCodeRecoveryPassword("123")
                .clickContinueRecoveryButton();
    }

    @Test
    public void ssuccessRecovery() {

        driver.get("http://localhost:8000/");

        mainPage.clickOnLoginButton();
        loginPage .clickForgotPasswordButton()
                .setRecoveryPhone("22222222")
                .clickContinueButton()
                .setNewPassword("123")
                .setRepeatPassword("123")
                .setCodeRecoveryPassword("123")
                .clickContinueRecoveryButton();
    }
}
