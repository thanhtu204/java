import java.time.LocalDate;
import java.util.Scanner;

public abstract class NguoiLaoDong {
	 protected String hoTen;
	    protected LocalDate ngaySinh;
	    protected Double heSoLuong;
	    protected LocalDate ngayVaolam;
	    public Double getHeSoLuong() {
			return heSoLuong;
		}

		public LocalDate getNgayVaolam() {
			return ngayVaolam;
		}

		public void setNgayVaolam(LocalDate ngayVaolam) {
			this.ngayVaolam = ngayVaolam;
		}

		public void setHeSoLuong(Double heSoLuong) {
			this.heSoLuong = heSoLuong;
		}

		

	   

	    

	    public NguoiLaoDong() {

	    }

	    public String getHoTen() {
	        return hoTen;
	    }

	    public void setHoTen(String hoTen) {
	        this.hoTen = hoTen;
	    }

	    public LocalDate getNgaySinh() {
	        return ngaySinh;
	    }

	    public void setNgaySinh(LocalDate ngaySinh) {
	        this.ngaySinh = ngaySinh;
	    }

	   


	  

	    

	 

	    public void nhapThongTin() {
	        
	        Scanner s = new Scanner(System.in);
	        System.out.print("Nhap ho ten: ");
	        while (true) {
	        	 this.hoTen = s.nextLine();
	        	 if(!this.hoTen.trim().isEmpty())
	        		 break;
	        	 else
	        		 System.out.print("Vui long nhap ho ten: ");
	        	 
	        	
			}
        	  
	      
	        System.out.print("Nhap ngay vao lam co dang: yyyy-mm-dd: ");
	        String nvl=s.nextLine();
	        this.ngayVaolam=LocalDate.parse(nvl);
	      
	        System.out.print("Nhap ngay sinh co:  ");
	        String ns=s.nextLine();
	        
	        while(true) {
	        	System.out.print("Nhap he so luong: ");
	       	        try {
				this.heSoLuong=Double.parseDouble(s.nextLine());
				break;
			} catch (Exception e) {
				System.out.print("vui long nhap kieu du lieu so");
				System.out.println();
			}
	           
	        }
	    
	    }

	    public void xuatThongTin() {
	        System.out.print("Ho ten: " + this.hoTen + "-Ngay sinh: " + this.ngaySinh);
	    }

	    public abstract double ThuNhap();

	    public double tienLuongCB() {
	        return this.heSoLuong * 150000;
	    }
}
