package tests;
import org.testng.annotations.Test;
import static org.testng.AssertJUnit.assertEquals;
import static org.testng.AssertJUnit.assertTrue;

public class loginTests extends BaseTest {
    @Test
    public void correctLogin() {
        loginPage.open();
        loginPage.login("standard_user", "secret_sauce");
        assertEquals(ProductsPage.getTitle(), "Products");
    }
    @Test
    public void incorrectLogin() {
        loginPage.open();
        loginPage.login("user", "secret_sauce");
        assertEquals(ProductsPage.getButton(), "");
    }
    @Test
    public void incorrectPassword() {
        loginPage.open();
        loginPage.login("standard_user", "secret");
        assertTrue(ProductsPage.getGroup());
    }
    @Test
    public void emptyInputFields() {
        loginPage.open();
        loginPage.login("", "");
        assertTrue(ProductsPage.getForm());

    }
}