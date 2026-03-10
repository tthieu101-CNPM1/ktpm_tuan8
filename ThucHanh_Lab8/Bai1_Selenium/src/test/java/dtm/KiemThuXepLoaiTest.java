package dtm;

import org.testng.Assert;
import org.testng.annotations.Test;

public class KiemThuXepLoaiTest {

    public static String xepLoai(int diemTB, boolean coThiLai) {
        if (diemTB < 0 || diemTB > 10) {
            return "Diem khong hop le";
        }
        if (diemTB >= 8.5) {
            return "Gioi";
        } else if (diemTB >= 7.0) {
            return "Kha";
        } else if (diemTB >= 5.5) {
            return "Trung Binh";
        } else {
            if (coThiLai) {
                return "Thi lai";
            }
            return "Yeu - Hoc lai";
        }
    }

    @Test(description = "Phu nhanh Node 1-True: Diem ngoai le")
    public void kiemThuDiemNgoaiLe() {
        Assert.assertEquals(xepLoai(11, true), "Diem khong hop le");
    }

    @Test(description = "Phu nhanh Node 3-True: Diem Gioi")
    public void kiemThuDiemGioi() {
        Assert.assertEquals(xepLoai(9, false), "Gioi");
    }

    @Test(description = "Phu nhanh Node 5-True: Diem Kha")
    public void kiemThuDiemKha() {
        Assert.assertEquals(xepLoai(7, true), "Kha");
    }

    @Test(description = "Phu nhanh Node 7-True: Diem Trung Binh")
    public void kiemThuDiemTrungBinh() {
        Assert.assertEquals(xepLoai(6, false), "Trung Binh");
    }

    @Test(description = "Phu nhanh Node 9-True: Diem Thi Lai")
    public void kiemThuDiemThiLai() {
        Assert.assertEquals(xepLoai(4, true), "Thi lai");
    }

    @Test(description = "Phu nhanh Node 9-False: Diem Yeu")
    public void kiemThuDiemYeu() {
        Assert.assertEquals(xepLoai(2, false), "Yeu - Hoc lai");
    }
}