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

    @FindBy(xpath = "//*[@id=\"root\"]/div/div/main/div/div[2]/nav/div[1]/a[3]")
    WebElement todaysCategory;

    @FindBy(xpath = "//*[@id=\"root\"]/div/div/main/div/div[2]/div/div/li[1]/a/span[2]")
    WebElement firstElementTodaysCategory;

    @FindBy(xpath = "//*[@id=\"root\"]/div/div/div/header/div[2]/div[2]/div/a[2]")
    WebElement livePage;

    @FindBy(xpath = "//*[@id=\"root\"]/div/div/div/header/div[2]/div[2]/div/a[3]")
    WebElement sportPage;

    @FindBy(xpath = "//*[@id=\"root\"]/div/div/div/header/div[2]/div[2]/div/a[4]")
    WebElement virtualPage;

    @FindBy(xpath = "//*[@id=\"root\"]/div/div/main/div/div[2]/div/a[1]/img")
    WebElement firstItemInVirtual;

    @FindBy(xpath = "//*[@id=\"root\"]/div/div/div/header/div[2]/div[2]/div/a[5]")
    WebElement helpInBar;

    @FindBy(xpath = "//*[@id=\"root\"]/div/div/main/div/div[2]/div/article/p[1]/span")
    WebElement textOnHelpPage;

    @FindBy(xpath = "//*[@id=\"root\"]/div/div/div/header/div[2]/div[2]/div/a[6]")
    WebElement aboutUsInBar;

    @FindBy(xpath = "//*[@id=\"root\"]/div/div/main/div/div[2]/article/div[2]/h1")
    WebElement textOnAboutUsPage;

    @FindBy(xpath = "//*[@id=\"root\"]/div/div/div/header/div[2]/div[3]/div/div[3]")
    WebElement in1ClickSwitchBox;

    @FindBy(xpath = "//*[@id=\"root\"]/div/div/main/div/div[2]/footer/div/div[1]/nav/ul/li[1]/a")
    WebElement todaysInFooter;

    @FindBy(xpath = "//*[@id=\"root\"]/div/div/main/div/div[2]/footer/div/div[1]/nav/ul/li[2]/a")
    WebElement liveInFooter;

    @FindBy(xpath = "//*[@id=\"root\"]/div/div/main/div/div[2]/footer/div/div[1]/nav/ul/li[3]/a")
    WebElement sportInFooter;

    @FindBy(xpath = "//*[@id=\"root\"]/div/div/main/div/div[2]/footer/div/div[1]/nav/ul/li[4]/a")
    WebElement virtualInFooter;

    @FindBy(xpath = "//*[@id=\"root\"]/div/div/main/div/div[2]/footer/div/div[1]/nav/ul/li[5]/a")
    WebElement helpInFooter;

    @FindBy(xpath = "//*[@id=\"root\"]/div/div/main/div/div[2]/footer/div/div[1]/nav/ul/li[6]/a")
    WebElement aboutUsInFooter;

    @FindBy(xpath = "//*[@id=\"root\"]/div/div/main/div/div[2]/footer/div/div[1]/nav/ul/li[7]/a")
    WebElement RGSInFooter;

    @FindBy(xpath = "//*[@id=\"root\"]/div/div/main/div/div[2]/footer/div/div[1]/nav/ul/li[8]/a")
    WebElement privacyPolicyInFooter;

    @FindBy(xpath = "//*[@id=\"root\"]/div/div/main/div/div[2]/footer/div/div[1]/nav/ul/li[9]/a")
    WebElement bonusRulesInFooter;

    @FindBy(xpath = "//*[@id=\"root\"]/div/div/main/div/div[2]/footer/div/div[1]/nav/ul/li[10]/a")
    WebElement termsInFooter;

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

    public void clickOnTodays(){
        livePage.click();
    }

    public void clickFirstItemInSportCategory() {
        wait.visibilityOf(firstItemInSportCategory).click();
        wait.visibilityOf(firstSubItemInSportCategory).click();
    }

    public void clickFirstItemInLiveCategory() {
        wait.visibilityOf(firstItemInLiveCategory).click();
    }

    public void clickOnLiveCategoryInBar() {
        wait.visibilityOf(livePage).click();
    }

    public void clickOnSportCategoryInBar() {
        wait.visibilityOf(sportPage).click();
    }

    public void clickOnVirtualInBar() {
        wait.visibilityOf(virtualPage).click();
    }

    public void clickOnHelpInBar() {
        wait.visibilityOf(helpInBar).click();
    }

    public void clickOnAboutUsInBar() {
        wait.visibilityOf(aboutUsInBar).click();
    }

    public void checkSoccerSportOpened() {
        Assert.assertTrue(wait.visibilityOf(headTextOfSportEvent).getText().contains("SOCCER"));
    }

    public void checkVirtualOpened() {
        Assert.assertTrue(wait.visibilityOf(firstItemInVirtual).isDisplayed());
    }

    public void checkHelpPageOpened() {
        Assert.assertTrue(wait.visibilityOf(textOnHelpPage).getText().contains("Terms and Conditions"));
    }

    public void checkAboutUsPageOpened() {
        Assert.assertTrue(wait.visibilityOf(textOnAboutUsPage).getText().contains("Need Help, Clarity, Assistance? Contact Us."));
    }

    public void checkLiveHeaderOpened() {
        Assert.assertTrue(wait.visibilityOf(headTextOfLiveEvent).isDisplayed());
    }

    public void checkTodaysOpened() {
        Assert.assertTrue(wait.visibilityOf(todaysCategory).isDisplayed());
        Assert.assertTrue(wait.visibilityOf(firstElementTodaysCategory).isDisplayed());
    }

    public void clickOn1ClickSwitchBox(){
        in1ClickSwitchBox.click();
    }

    public void clickOnTodaysInFooter() {
        wait.visibilityOf(todaysInFooter).click();
    }

    public void clickOnLiveInFooter() {
        wait.visibilityOf(liveInFooter).click();
    }

    public void clickOnSportInFooter() {
        wait.visibilityOf(sportInFooter).click();
    }

    public void clickOnVirtualInFooter() {
        wait.visibilityOf(virtualInFooter).click();
    }

    public void clickOnHelpInFooter() {
        wait.visibilityOf(helpInFooter).click();
    }

    public void clickOnAboutUsInFooter() {
        wait.visibilityOf(aboutUsInFooter).click();
    }

    public void clickOnRGSInFooter() {
        wait.visibilityOf(RGSInFooter).click();
    }

    public void clickOnPrivacyPolicyInFooter() {
        wait.visibilityOf(privacyPolicyInFooter).click();
    }

    public void clickOnBonusRulesInFooter() {
        wait.visibilityOf(bonusRulesInFooter).click();
    }

    public void clickOnTermsAndConditionsInFooter() {
        wait.visibilityOf(termsInFooter).click();
    }
}
