package pitch90Bet.tests;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class TestBase {
    protected static WebDriver driver;
    protected static WebDriverWait wait;

    @BeforeClass
    public static void setUp() {


        System.setProperty("webdriver.chrome.driver","/Users/mariapochikaeva/Downloads/chromedriver");
        driver = new ChromeDriver();
        // driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.manage().window().maximize();
        wait = new WebDriverWait(driver, 100);
    }

    @After
    public void cleanUp(){
        driver.manage().deleteAllCookies();
    }
    @AfterClass
    public static void tearDown(){

        driver.close();
    }

}
