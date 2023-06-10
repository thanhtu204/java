import java.util.Scanner;

public class NhanVien extends NguoiLaoDong{

    private String chucVu;
    private String loaiNV;

    public NhanVien() {
    }

    public String getChucVu() {
        return chucVu;
    }

    public void setChucVu(String chucVu) {
        this.chucVu = chucVu;
    }

    public String getLoaiNV() {
        return loaiNV;
    }

    public void setLoaiNV(String loaiNV) {
        this.loaiNV = loaiNV;
    }

    @Override
    public void xuatThongTin() {
        super.xuatThongTin(); //To change body of generated methods, choose Tools | Templates.
        System.out.print("-Xep Loai: "+ThuNhap());
    }

    @Override
    public void nhapThongTin() {
        Scanner s = new Scanner(System.in);
        super.nhapThongTin(); //To change body of generated methods, choose Tools | Templates.
        System.out.print("Nhap chuc vu: ");
        this.chucVu=s.nextLine();
        System.out.print("Nhap loai nhan vien co 3 loai nhan vien A,B,C: ");
        do{
        	this.loaiNV=s.nextLine();
         if( (loaiNV.equalsIgnoreCase("A") ||loaiNV.equalsIgnoreCase("B")||loaiNV.equalsIgnoreCase("C")) ){
        break;
         } else {
        	 System.out.print("vui long nhap lai: ");
      	 }
          }while (!loaiNV.equalsIgnoreCase("A") ||!loaiNV.equalsIgnoreCase("B")||!loaiNV.equalsIgnoreCase("C"));        
           }
    

    
    @Override
    public double ThuNhap() {
         double luongcb = this.tienLuongCB();
    double phanTram = 0;
                 
           if(this.loaiNV.equalsIgnoreCase("A")){
        phanTram=100;
      }
                else if(this.loaiNV.equalsIgnoreCase("B")){    
                    phanTram=80;
                }
                else if (this.loaiNV.equalsIgnoreCase("C"))
                    phanTram=50;
                        
                              
                  return luongcb+luongcb*phanTram/100;
    }
    
    
 
    
}
