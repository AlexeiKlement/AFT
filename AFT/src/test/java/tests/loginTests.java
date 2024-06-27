package tests;

import org.junit.Test;
import org.openqa.selenium.By;

import static org.testng.AssertJUnit.assertEquals;
import static org.testng.AssertJUnit.assertTrue;

public class loginTests extends BaseTest {
    @Test
    public void correctLogin() {
        loginPage.open();
        loginPage.login("standard_user", "secret_sauce");
        assertEquals(driver.findElement(By.cssSelector("[class=title]")).getText(), "Products");
    }

    @Test
    public void incorrectLogin() {
        loginPage.open();
        loginPage.login("user", "secret_sauce");
        assertEquals(driver.findElement(By.cssSelector("[class=error-button]")).getText(), "");

    }

    @Test
    public void incorrectPassword() {
        loginPage.open();
        loginPage.login("standard_user", "secret");
        assertTrue(driver.findElement(By.cssSelector("[class=form_group]")).isDisplayed());

    }

    @Test
    public void emptyInputFields() {
        loginPage.open();
        loginPage.login("", "");
        assertTrue(driver.findElement(By.cssSelector("[class=form_group]")).isDisplayed());

    }
}

