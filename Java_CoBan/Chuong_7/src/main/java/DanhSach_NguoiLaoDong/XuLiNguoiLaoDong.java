/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DanhSach_NguoiLaoDong;

import javacb.duy.chuong_7.Ngay;

/**
 *
 * @author Administrator
 */
public class XuLiNguoiLaoDong {
    public static void main(String[] args) {
        DanhSachNguoiLD dsnld= new DanhSachNguoiLD();
        dsnld.themNLD(new NLD_GiaoVien("Duy 01", new Ngay(1, 1, 2000), new Ngay(2, 2, 2015), 2.3, 1, 2));
        dsnld.themNLD(new NLD_GiaoVien("Duy 02", new Ngay(2, 2, 2000), new Ngay(3, 3, 2015), 2.9, 1, 2));
        dsnld.themNLD(new NLD_NhanVien("Duy 03", new Ngay(3, 3, 2000), new Ngay(4, 4, 2000), 3.5, "A"));
        dsnld.inNguoiLaoDong();
    }
}
