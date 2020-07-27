package pitch90Bet.helper;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeoutException;

public class Wait {

        private static final Logger LOGGER = (Logger) LogManager.getLogger(Wait.class);
        private final int timeoutInSeconds;

        public Wait(WebDriver driver, int timeoutInSeconds) {
            this.timeoutInSeconds = timeoutInSeconds;
        }

        public WebElement visibilityOf(WebElement webElement) {
            return prepare(webElement, true, timeoutInSeconds);
        }

        public void invisibilityOf(WebElement webElement) {
            if (isDisplayed(webElement, true))
                prepare(webElement, false, timeoutInSeconds);
        }

        private WebElement prepare(WebElement webElement, boolean isVisible, int timeOutInSeconds) {
            long endTime = System.currentTimeMillis() + (timeOutInSeconds * 1000);

            try {
                while (isDisplayed(webElement, isVisible)) {
                    if (System.currentTimeMillis() > endTime)
                        throw new TimeoutException();

                    Thread.sleep(350);
                }

                return webElement;
            } catch (TimeoutException | InterruptedException e) {
                LOGGER.debug(e);
                return null;
            }
        }

        private boolean isDisplayed(WebElement iosElement, boolean isVisible) {
            try {
                iosElement.isDisplayed();
                return !isVisible;
            } catch (NoSuchElementException ex) {
                return isVisible;
            }
        }
    }
