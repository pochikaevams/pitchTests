package pitch90Bet.tests;

import org.junit.Test;
import pitch90Bet.pages.MainPage;

public class MainPageTests extends TestBase {

    MainPage mainPage = new MainPage(driver, wait);

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
        mainPage.checkSoccerSportOpened();
    }

    @Test
    public void liveCategory() {

        driver.get("http://localhost:8000/");

        mainPage.clickOnLive();
        mainPage.clickFirstItemInLiveCategory();
        mainPage.checkLiveHeaderOpened();
    }

    @Test
    public void openTodaysCategory() {

        driver.get("http://localhost:8000/");

        mainPage.clickOnTodays();
        mainPage.checkTodaysOpened();
    }

    @Test
    public void openLiveFromBar() {

        driver.get("http://localhost:8000/");

        mainPage.clickOnLiveCategoryInBar();
        mainPage.clickFirstItemInLiveCategory();
        mainPage.checkLiveHeaderOpened();
    }

    @Test
    public void openSportFromBar() {

        driver.get("http://localhost:8000/");

        mainPage.clickOnLiveCategoryInBar();
        mainPage.clickOnSportCategoryInBar();
        mainPage.clickFirstItemInSportCategory();
        mainPage.checkSoccerSportOpened();
    }

    @Test
    public void openVirtualFromBar() {

        driver.get("http://localhost:8000/");

        mainPage.clickOnVirtualInBar();
        mainPage.checkVirtualOpened();
    }

    @Test
    public void openHelpFromBar() {

        driver.get("http://localhost:8000/");

        mainPage.clickOnHelpInBar();
        mainPage.checkHelpPageOpened();
    }

    @Test
    public void openAboutUsFromBar() {

        driver.get("http://localhost:8000/");

        mainPage.clickOnAboutUsInBar();
        mainPage.checkAboutUsPageOpened();
    }

    @Test
    public void setIn1ClickSwitchBox() {

        driver.get("http://localhost:8000/");

        mainPage.clickOn1ClickSwitchBox();
    }

}
