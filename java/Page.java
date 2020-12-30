package PageObject;

import org.openqa.selenium.WebDriver;

/**
 * @author Joran Van Grunderbeek
 */

public abstract class Page {

    WebDriver driver;
    String path = "http://localhost:8081/Opdracht1_war_exploded/";

    public Page(WebDriver driver) {
        this.driver = driver;
    }

    public WebDriver getDriver() {
        return driver;
    }

    public String getPath() {
        return path;
    }

    public String getTitle() {
        return driver.getTitle();
    }
}
