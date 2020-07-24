package pitch90Bet.pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pitch90Bet.tests.TestBase;

public class MainPage extends TestBase {

    private WebDriver driver;

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

    @FindBy(xpath = "//*[@id=\"root\"]/div/div/main/div/div[1]/nav/ul/li[1]/ul/li[1]/a")
    WebElement firstSubItemInSportCategory;

    public MainPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickOnLoginButton(){
        login.click();
    }

    public void clickOnRegisterButton(){
        register.click();
    }

    public void checkSuccessLogin() {
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[@class='notification__text']")));
        WebElement element = driver.findElement(By.xpath("//span[@class='notification__text']"));
        String strng = element.getText();
        Assert.assertTrue(strng.contains("Sign In success"));
    }

    public void checkUnsuccessLogin() {
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[@class='notification__text']")));
        WebElement element = driver.findElement(By.xpath("//span[@class='notification__text']"));
        String strng = element.getText();
        Assert.assertTrue(strng.contains("Uncorrected password"));
    }

    public void checkEmptyPasswordLoginError() {
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[@class='notification__text']")));
        WebElement element = driver.findElement(By.xpath("//span[@class='notification__text']"));
        String strng = element.getText();
        Assert.assertTrue(strng.contains("Uncorrected password"));
    }

    public void checkUnsuccessRegistration() {
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[@class='notification__text']")));
        WebElement element = driver.findElement(By.xpath("//span[@class='notification__text']"));
        String strng = element.getText();
        Assert.assertTrue(strng.contains("Request execution failed."));
    }

    public void checkUserNotExists() {
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[@class='notification__text']")));
        WebElement element = driver.findElement(By.xpath("//span[@class='notification__text']"));
        String strng = element.getText();
        Assert.assertTrue(strng.contains("Such a user does not exist"));
    }

    public void checkTopEventDropDownOpened() {
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='root']/div/div/main/div/div[1]/nav/div[1]/a[1]")));
        topEventsDropDownFirstElement.isDisplayed();
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

    public void clickFirstItemInSportCategory() {
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"root\"]/div/div/main/div/div[1]/nav/ul/li[1]/div/span[2]")));
        firstItemInSportCategory.click();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"root\"]/div/div/main/div/div[1]/nav/ul/li[1]/ul/li[1]/a")));
        firstSubItemInSportCategory.click();
    }

    public void checkSoccerOpened() {
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"root\"]/div/div/main/div/div[2]/div/div/div[1]/div[1]/div[1]/span[2]")));
        WebElement element = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/main/div/div[2]/div/div/div[1]/div[1]/div[1]/span[2]"));
        String strng = element.getText();
        Assert.assertTrue(strng.contains("SOCCER"));
    }
}
