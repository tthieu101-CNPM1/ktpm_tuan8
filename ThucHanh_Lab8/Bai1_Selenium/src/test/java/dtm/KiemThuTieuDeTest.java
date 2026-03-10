package dtm;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class KiemThuTieuDeTest {
    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com");
    }

    @Test(description = "Kiem thu tieu de trang chu")
    public void testTieuDe() {
        String expectedTitle = "Swag Labs";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle, "Tieu de trang khong dung!");
    }

    @Test(description = "Kiem thu URL trang chu")
    public void testURL() {
        String actualUrl = driver.getCurrentUrl();
        Assert.assertTrue(actualUrl.contains("saucedemo"), "URL khong hop le!");
    }

    @Test(description = "Kiem thu nguon trang")
    public void testNguonTrang() {
        String pageSource = driver.getPageSource();
        Assert.assertTrue(pageSource.contains("Sauce Labs"), "Nguon trang khong chua chuoi ky tu mong doi!");
    }

    @Test(description = "Kiem thu hien thi form dang nhap")
    public void testHienThiFormDangNhap() {
        WebElement usernameField = driver.findElement(By.id("user-name"));
        WebElement passwordField = driver.findElement(By.id("password"));
        WebElement loginBtn = driver.findElement(By.id("login-button"));

        Assert.assertTrue(usernameField.isDisplayed(), "Truong username khong hien thi");
        Assert.assertTrue(passwordField.isDisplayed(), "Truong password khong hien thi");
        Assert.assertTrue(loginBtn.isDisplayed(), "Nut login khong hien thi");
    }

    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}