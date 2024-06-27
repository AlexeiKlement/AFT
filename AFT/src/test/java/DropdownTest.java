import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import static org.testng.AssertJUnit.assertTrue;

public class DropdownTest extends BaseTest {
    @Test
    public void dropdownTest() {
        driver.get("https://the-internet.herokuapp.com/dropdown");
        WebElement dropdown = driver.findElement(By.id("dropdown"));
        Select select = new Select(dropdown);
        //select.selectByVisibleText('Option 1');
        select.selectByIndex(1);
        //select.selectByValue("2");
        assertTrue(select.getFirstSelectedOption().isSelected());


    }
}
