package pitch90Bet.pages;

import com.sun.org.apache.regexp.internal.RE;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pitch90Bet.tests.TestBase;

public class RegistrationPage extends TestBase {

    private WebDriver driver;

    @FindBy(xpath = "//input[@type='number']")
    WebElement phoneField;

    @FindBy(xpath = "//input[@type='password']")
    WebElement passwordField;

    @FindBy(xpath = "//input[@type='password']")
    WebElement smsCodeField;

    @FindBy(xpath = "//div[contains(text(),'I accept the')]")
    WebElement acceptCheckbox;

    @FindBy(xpath = "//div[contains(text(),'I am over 18 years old')]")
    WebElement over18yearsCheckbox;

    @FindBy(xpath = "//button[contains(text(),'Send code')]")
    WebElement sendCodeButton;

    @FindBy(xpath = "//button[contains(text(),'Registration')]")
    WebElement registrationButton;

    @FindBy(xpath = "//div[contains(text(),'Do Not Include 0 When Entering Your Number; Start with 7 or 1')]")
    WebElement registrationAttentionText;


    public RegistrationPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public RegistrationPage setPhone(String phone){
        this.phoneField.clear();
        this.phoneField.sendKeys(phone);
        return new RegistrationPage(driver);
    }

    public RegistrationPage setPassword(String password){
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@type='password']")));
        this.passwordField.clear();
        this.passwordField.sendKeys(password);
        return new RegistrationPage(driver);
    }

    public RegistrationPage setSMSCodeField(String code){
        this.smsCodeField.clear();
        this.smsCodeField.sendKeys(code);
        return new RegistrationPage(driver);
    }

    public RegistrationPage clickOnAceeptCheckbox() {
        acceptCheckbox.click();
        return new RegistrationPage(driver);
    }

    public RegistrationPage clickOnOver18yearsOldCheckbox() {
        over18yearsCheckbox.click();
        return new RegistrationPage(driver);
    }

    public RegistrationPage clickOnSendCodeButton(){
        sendCodeButton.click();
        return new RegistrationPage(driver);
    }

    public void clickOnRegisterButton(){
        registrationButton.click();
    }

    public void checkRegistrationAttentionText(){
        Assert.assertEquals("Do Not Include 0 When Entering Your Number; Start with 7 or 1", registrationAttentionText.getText());
    }
}
