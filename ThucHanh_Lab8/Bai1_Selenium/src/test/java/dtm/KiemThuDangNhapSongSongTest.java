package dtm;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class KiemThuDangNhapSongSongTest {

    @BeforeMethod
    public void thietLap() {
        QuanLyDriver.khoiTaoDriver("chrome");
    }

    @Test(description = "Kiem thu dang nhap song song")
    public void kiemThuDangNhap() throws InterruptedException {
        QuanLyDriver.layDriver().get("https://www.saucedemo.com");
        System.out.println("Thread ID Dang Nhap: " + Thread.currentThread().getId());
        Thread.sleep(5000); // Dung 5 giay de ho tro chup anh man hinh 2 trinh duyet
        Assert.assertEquals(QuanLyDriver.layDriver().getTitle(), "Swag Labs");
    }

    @AfterMethod
    public void ketThuc() {
        QuanLyDriver.dongDriver();
    }
}