package pitch90Bet.pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import pitch90Bet.helper.Wait;
import pitch90Bet.tests.TestBase;

public class MainPage extends TestBase {

    private WebDriver driver;
    private final Wait wait;

    @FindBy(xpath = "//button[contains(text(),'Login')]")
    WebElement login;

    @FindBy(xpath = "//button[contains(text(),'Registration')]")
    WebElement register;

    @FindBy(xpath = "//*[@id=\"root\"]/div/div/main/div/div[1]/nav/div[1]/div")
    WebElement topEventsDropDownClose;

    @FindBy(xpath = "//*[@id=\"root\"]/div/div/main/div/div[1]/nav/div[1]/div")
    WebElement topEventsDropDownOpen;

    @FindBy(xpath = "//*[@id='root']/div/div/main/div/div[1]/nav/div[1]/a[1]")
    WebElement topEventsDropDownFirstElement;

    @FindBy(xpath = "//*[@id=\"root\"]/div/div/main/div/div[1]/nav/div[3]/div[1]/div")
    WebElement sportCategory;

    @FindBy(xpath = "//*[@id=\"root\"]/div/div/main/div/div[1]/nav/ul/li[1]/div/span[2]")
    WebElement firstItemInSportCategory;

    @FindBy(xpath = "//*[@id=\"root\"]/div/div/main/div/div[1]/nav/ul/li[1]/a/span")
    WebElement firstItemInLiveCategory;

    @FindBy(xpath = "//*[@id=\"root\"]/div/div/main/div/div[1]/nav/ul/li[1]/ul/li[1]/a")
    WebElement firstSubItemInSportCategory;

    @FindBy(xpath = "//span[@class='notification__text']")
    WebElement notificationAlert;

    @FindBy(xpath = "//*[@id='root']/div/div/main/div/div[2]/div/div/div[1]/div[1]/div[1]/span[2]")
    WebElement headTextOfSportEvent;

    @FindBy(xpath = "//*[@id=\"root\"]/div/div/main/div/div[2]/div/article/section/div/div[1]")
    WebElement headTextOfLiveEvent;

    @FindBy(xpath = "//*[@id=\"root\"]/div/div/main/div/div[1]/nav/div[3]/div[2]/div")
    WebElement liveCategory;

    @FindBy(xpath = "//*[@id=\"root\"]/div/div/div/header/div[2]/div[2]/div/a[1]")
    WebElement todaysPage;

    public MainPage(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        this.wait = new Wait(driver, 5);
    }

    public void clickOnLoginButton(){

        wait.visibilityOf(login).click();
    }

    public void clickOnRegisterButton(){
        register.click();
    }

    public void checkSuccessLogin() {
        Assert.assertTrue(wait.visibilityOf(notificationAlert).getText().contains("Sign In success"));
    }

    public void checkUnsuccessfulLogin() {
        Assert.assertTrue(wait.visibilityOf(notificationAlert).getText().contains("Uncorrected password"));
    }

    public void checkEmptyPasswordLoginError() {
        Assert.assertTrue(wait.visibilityOf(notificationAlert).getText().contains("Uncorrected password"));
    }

    public void checkUnsuccessfulRegistration() {
        Assert.assertTrue(wait.visibilityOf(notificationAlert).getText().contains("Request execution failed."));
    }

    public void checkUserNotExists() {
        Assert.assertTrue(wait.visibilityOf(notificationAlert).getText().contains("Such a user does not exist"));
    }

    public void checkTopEventDropDownOpened() {
        wait.visibilityOf(topEventsDropDownFirstElement).isDisplayed();
    }

    public void clickOnTopEventDropDownClose(){
        topEventsDropDownClose.click();
    }

    public void clickOnTopEventDropDownOpen(){
        topEventsDropDownOpen.click();
    }

    public void clickOnSport(){
        sportCategory.click();
    }

    public void clickOnLive(){
        liveCategory.click();
    }

    public void clickFirstItemInSportCategory() {
        wait.visibilityOf(firstItemInSportCategory).click();
        wait.visibilityOf(firstSubItemInSportCategory).click();
    }

    public void clickFirstItemInLiveCategory() {
        wait.visibilityOf(firstItemInLiveCategory).click();
    }

    public void checkSoccerSportOpened() {
        Assert.assertTrue(wait.visibilityOf(headTextOfSportEvent).getText().contains("SOCCER"));
    }

    public void checkLiveHeaderOpened() {
        Assert.assertTrue(wait.visibilityOf(headTextOfLiveEvent).isDisplayed());
    }
}
