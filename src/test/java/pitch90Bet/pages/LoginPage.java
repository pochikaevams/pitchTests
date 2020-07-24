package pitch90Bet.pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pitch90Bet.tests.TestBase;

public class LoginPage extends TestBase {

    @FindBy(name = "login")
    public WebElement usernameField;

    @FindBy(name = "password")
    public WebElement pwdField;

    @FindBy(xpath = "//button[contains(text(),'Login')]")
    public  WebElement loginButton;

    @FindBy(xpath = "//div[@class='auth__switch-item', contains(text(),'Login')]")
    public WebElement loginTab;

    @FindBy(xpath = "//*[@id='modal-root']/div[2]/div/div/form/label/div[2]/div/input")
    public WebElement recoveryPhoneField;

    @FindBy(xpath = "//*[@id='modal-root']/div[2]/div/div/form/label[1]/div[2]/div/input")
    public WebElement newRecoveryPasswordField;

    @FindBy(xpath = "//*[@id='modal-root']/div[2]/div/div/form/label[2]/div[2]/div/input")
    public WebElement repeatRecoveryPasswordField;

    @FindBy(xpath = "//*[@id='modal-root']/div[2]/div/div/form/label[3]/div[2]/div/input")
    public WebElement codeRecoveryPasswordField;

    @FindBy(className = "auth__switch-item1")
    public WebElement registerTab;

    @FindBy(className = "sign-in__recovery")
    public WebElement forgotPasswordButton;

    @FindBy(xpath = "/html/body/div[2]/div[2]/div/div/form/button")
    public WebElement continueButton;

    @FindBy(xpath = "//*[@id='modal-root']/div[2]/div/div/form/button")
    public WebElement continueRecoveryButton;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public LoginPage setPhone(String phone){
        this.usernameField.clear();
        this.usernameField.sendKeys(phone);
        return new LoginPage(driver);
    }

    public LoginPage setRecoveryPhone(String phone){
        this.recoveryPhoneField.clear();
        this.recoveryPhoneField.sendKeys(phone);
        return new LoginPage(driver);
    }

    public LoginPage setPwdField(String password){
        this.pwdField.clear();
        this.pwdField.sendKeys(password);
        return new LoginPage(driver);
    }

    public void clickLogButton(){
        loginButton.click();
    }

    public void clickLoginTab() {
        loginTab.click();
    }

    public void clickRegisterTab(){
        registerTab.click();
    }

    public LoginPage clickForgotPasswordButton(){
        forgotPasswordButton.click();
        return new LoginPage(driver);
    }

    public LoginPage clickContinueButton(){
        continueButton.click();
        return new LoginPage(driver);
    }

    public LoginPage clickContinueRecoveryButton(){
        continueRecoveryButton.click();
        return new LoginPage(driver);
    }


    public LoginPage setNewPassword(String password) {
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='modal-root']/div[2]/div/div/form/label[1]/div[2]/div/input")));
        newRecoveryPasswordField.sendKeys(password);
        return new LoginPage(driver);
    }

    public LoginPage setRepeatPassword(String password) {
        repeatRecoveryPasswordField.sendKeys(password);
        return new LoginPage(driver);
    }

    public LoginPage setCodeRecoveryPassword(String code) {
        codeRecoveryPasswordField.sendKeys(code);
        return new LoginPage(driver);
    }
}

