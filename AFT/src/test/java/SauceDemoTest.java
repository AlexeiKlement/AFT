import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

import static org.testng.AssertJUnit.*;

public class SauceDemoTest {
    @Test
    public void SwagLabs() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver browser = new ChromeDriver();
        browser.get("https://www.saucedemo.com/inventory.html");
        browser.findElement(By.name("user-name")).sendKeys("standard_user");
        browser.findElement(By.cssSelector("[type=password]")).sendKeys("secret_sauce");
        browser.findElement(By.name("login-button")).click();
        String done = browser.findElement(By.xpath("//div[text()='Sauce Labs Bike Light']")).getText();
        assertEquals(done, "Sauce Labs Bike Light");
        browser.quit();
    }

    @Test
    public void SwagLabs2() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver browser = new ChromeDriver();
        browser.get("https://www.saucedemo.com/inventory.html");
        browser.findElement(By.name("user-name")).sendKeys("standard_user");
        browser.findElement(By.cssSelector("[type=password]")).sendKeys("secret_sauce");
        browser.findElement(By.name("login-button")).click();
        String done = browser.findElement(By.id("item_3_title_link")).getText();
        assertEquals(done, "Test.allTheThings() T-Shirt (Red)");
        browser.quit();
    }

    @Test
    public void SwagLabs3() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver browser = new ChromeDriver();
        browser.get("https://www.saucedemo.com/inventory.html");
        browser.findElement(By.name("user-name")).sendKeys("standard_user");
        browser.findElement(By.cssSelector("[type=password]")).sendKeys("secret_sauce");
        browser.findElement(By.name("login-button")).click();
        browser.findElement(By.cssSelector("#item_3_title_link"));
        String done = browser.findElement(By.cssSelector("#item_3_title_link")).getText();
        assertEquals(done, "Test.allTheThings() T-Shirt (Red)");
        browser.quit();
    }

    @Test
    public void SwagLabs4() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver browser = new ChromeDriver();
        browser.get("https://www.saucedemo.com/inventory.html");
        browser.findElement(By.name("user-name")).sendKeys("standard_user");
        browser.findElement(By.cssSelector("[type=password]")).sendKeys("secret_sauce");
        browser.findElement(By.name("login-button")).click();
        String done = browser.findElement(By.xpath("//div[text()='Sauce Labs Onesie']")).getText();
        assertEquals(done, "Sauce Labs Onesie");
        browser.quit();
    }

    @Test
    public void SwagLabs5() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver browser = new ChromeDriver();
        browser.get("https://www.saucedemo.com/inventory.html");
        browser.findElement(By.name("user-name")).sendKeys("standard_user");
        browser.findElement(By.cssSelector("[type=password]")).sendKeys("secret_sauce");
        browser.findElement(By.name("login-button")).click();
        browser.findElement(By.xpath("//div[text()='Sauce Labs Onesie']"));
        Boolean isPresent = browser.findElement(By.xpath("//div[text()='Sauce Labs Onesie']//preceding::div[@class='inventory_item_description']")).isDisplayed();
        assertTrue("done", isPresent);
        browser.quit();
    }

    @Test
    public void SwagLabs6() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        //options.addArguments("start-maximized");
        options.addArguments("headless");
        WebDriver browser = new ChromeDriver(options);
        browser.manage().timeouts().implicitlyWait(1, TimeUnit.MILLISECONDS);
        browser.get("https://www.saucedemo.com/inventory.html");
        browser.findElement(By.name("user-name")).sendKeys("standard_user");
        browser.findElement(By.cssSelector("[type=password]")).sendKeys("secret_sauce");
        browser.findElement(By.name("login-button")).click();
        browser.findElement(By.xpath("//button[text()='Add to cart']")).click();
        Boolean inPresents = browser.findElement(By.name("remove-sauce-labs-backpack")).isDisplayed();
        assertTrue("done", inPresents);
        browser.quit();
    }
}