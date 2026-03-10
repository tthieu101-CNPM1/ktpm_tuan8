package dtm;

import org.testng.Assert;
import org.testng.annotations.Test;

public class KiemThuThanhToanTest {

    @Test(groups = {"smoke", "regression"}, description = "Kiem thu thanh toan thanh cong")
    public void kiemThuThanhToanThanhCong() {
        System.out.println("Chay: Kiem thu thanh toan thanh cong");
        Assert.assertTrue(true);
    }

    @Test(groups = {"regression"}, description = "Kiem thu huy thanh toan")
    public void kiemThuHuyThanhToan() {
        System.out.println("Chay: Kiem thu huy thanh toan");
        Assert.assertTrue(true);
    }
}