package pitch90Bet.tests;

import org.junit.Test;
import pitch90Bet.pages.MainPage;

public class MainPageTests extends TestBase {

    MainPage mainPage = new MainPage(driver);

    @Test
    public void topEventDropDownPoopUp() {

        driver.get("http://localhost:8000/");

        mainPage.clickOnTopEventDropDownOpen();
        mainPage.clickOnTopEventDropDownClose();
        mainPage.checkTopEventDropDownOpened();
    }

    @Test
    public void sportCategory() {

        driver.get("http://localhost:8000/");

        mainPage.clickOnSport();
        mainPage.clickFirstItemInSportCategory();
        mainPage.checkSoccerOpened();
    }

}
