import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SauceDemoTest {
    @Test
    public void SwagLabs() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver browser = new ChromeDriver();
        browser.get("https://www.saucedemo.com/inventory.html");
        browser.findElement(By.name("user-name")).sendKeys("standard_user");
        browser.findElement(By.cssSelector("[type=password]")).sendKeys("secret_sauce");
        browser.findElement(By.name("login-button")).click();
        browser.findElement(By.cssSelector("[data-test=inventory-item-name"));
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
        browser.findElement(By.id("item_3_title_link"));
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
        browser.findElement(By.xpath("//div[text()='Sauce Labs Onesie']"));
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
        browser.findElement(By.xpath("//div[text()='Sauce Labs Onesie']//preceding::div[@class='inventory_item_description']"));
        browser.quit();
    }

    @Test
    public void SwagLabs6() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver browser = new ChromeDriver();
        browser.get("https://www.saucedemo.com/inventory.html");
        browser.findElement(By.name("user-name")).sendKeys("standard_user");
        browser.findElement(By.cssSelector("[type=password]")).sendKeys("secret_sauce");
        browser.findElement(By.name("login-button")).click();
        browser.findElement(By.xpath("//button[text()='Add to cart']")).click();
        browser.findElement(By.name("remove-sauce-labs-backpack"));

        browser.quit();
    }

}



