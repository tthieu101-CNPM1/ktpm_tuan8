package dtm;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class KiemThuGioHangSongSongTest {

    @BeforeMethod
    public void thietLap() {
        QuanLyDriver.khoiTaoDriver("chrome");
    }

    @Test(description = "Kiem thu gio hang song song")
    public void kiemThuGioHang() throws InterruptedException {
        QuanLyDriver.layDriver().get("https://demoqa.com");
        System.out.println("Thread ID Gio Hang: " + Thread.currentThread().getId());
        Thread.sleep(5000); // Dung 5 giay de ho tro chup anh man hinh 2 trinh duyet
        Assert.assertTrue(QuanLyDriver.layDriver().getCurrentUrl().contains("demoqa"));
    }

    @AfterMethod
    public void ketThuc() {
        QuanLyDriver.dongDriver();
    }
}