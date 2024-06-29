package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
public class ProductsPage {
    WebDriver driver;

    public ProductsPage(WebDriver driver) {

        this.driver = driver;
    }

    private final By TITLE = By.cssSelector("[class=title]");

    public String getTitle() {
        return driver.findElement(TITLE).getText();
    }

    private final By error_button = By.cssSelector("[class=error-button]");

    public String getButton() {
        return driver.findElement(error_button).getText();
    }

    private final By form_group = By.cssSelector("[class=form_group]");

    public boolean getGroup() {
        return driver.findElement(form_group).isDisplayed();
    }

    private final By Form_group = By.cssSelector("[class=form_group]");

    public boolean getForm() {
        return driver.findElement(Form_group).isDisplayed();
    }
}


