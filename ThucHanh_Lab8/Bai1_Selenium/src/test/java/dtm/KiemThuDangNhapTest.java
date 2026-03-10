package dtm;

import org.testng.Assert;
import org.testng.annotations.Test;

public class KiemThuDangNhapTest {

    @Test(groups = {"smoke", "regression"}, description = "Kiem thu dang nhap thanh cong")
    public void kiemThuDangNhapThanhCong() {
        System.out.println("Chay: Kiem thu dang nhap thanh cong");
        Assert.assertTrue(true);
    }

    @Test(groups = {"regression"}, description = "Kiem thu dang nhap that bai")
    public void kiemThuDangNhapThatBai() {
        System.out.println("Chay: Kiem thu dang nhap that bai");
        Assert.assertTrue(true);
    }
}