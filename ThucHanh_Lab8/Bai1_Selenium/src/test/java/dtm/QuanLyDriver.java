package dtm;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class QuanLyDriver {
    // ThreadLocal: moi thread co bien driver rieng biet
    private static ThreadLocal<WebDriver> tlDriver = new ThreadLocal<>();

    public static void khoiTaoDriver(String trinhDuyet) {
        WebDriver driver;
        switch (trinhDuyet.toLowerCase()) {
            case "firefox":
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();
                break;
            default:
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
        }
        driver.manage().window().maximize();
        tlDriver.set(driver);
    }

    public static WebDriver layDriver() {
        return tlDriver.get();
    }

    public static void dongDriver() {
        if (tlDriver.get() != null) {
            tlDriver.get().quit();
            tlDriver.remove(); // rat quan trong: tranh memory leak
        }
    }
}