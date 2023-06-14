/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DanhSach_HocSinh_Interface;

/**
 *
 * @author Administrator
 */
public class XuLiDanhSachHocSinh {
    public static void main(String[] args) {
         DanhSachHS_Interface danhSachHS = new DanhSachHS_Interface();
         danhSachHS.them(new HocSinhCap1("A01", "Duy 01", "Nam", 5, 6));
         danhSachHS.them(new HocSinhCap1("A02", "Duy 02", "Nu", 5, 4));
         danhSachHS.them(new HocSinhMauGiao("M01", "Duy 03", "Nam", 1));
         danhSachHS.them(new HocSinhMauGiao("M02", "Duy 04", "Nu", 6));
         System.out.println("Danh sach hoc sinh truoc xoa");
         danhSachHS.in();
         System.out.println("Danh sach hoc sinh sau xoa");
         HocSinh hs = danhSachHS.getDanhSachHS().get(1);
         danhSachHS.xoa(hs);
         danhSachHS.in();
    }
}
   
    
