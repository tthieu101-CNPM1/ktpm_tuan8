package dtm;

import org.testng.Assert;
import org.testng.annotations.Test;

public class KiemThuGioHangTest {

    @Test(groups = {"smoke", "regression"}, description = "Kiem thu them san pham vao gio")
    public void kiemThuThemSanPham() {
        System.out.println("Chay: Kiem thu them san pham");
        Assert.assertTrue(true);
    }

    @Test(groups = {"regression"}, description = "Kiem thu xoa san pham khoi gio")
    public void kiemThuXoaSanPham() {
        System.out.println("Chay: Kiem thu xoa san pham");
        Assert.assertTrue(true);
    }
}