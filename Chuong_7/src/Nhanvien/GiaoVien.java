package Nhanvien;

import java.util.Scanner;

public class GiaoVien extends NguoiLaoDong{
	private int ngayVL;
	private int soGV;
	private double tien1hv;
	private String NV;
	public GiaoVien() {
		}
	public int getNgayVL() {
		return ngayVL;
	}

	public void setNgayVL(int ngayVL) {
		this.ngayVL = ngayVL;
	}
	public double getSoGV() {
		return soGV;
	}
	public void setSoGV(int soGV) {
		this.soGV = soGV;
	}
	public double getTien1hv() {
		return tien1hv;
	}
	public void setTien1hv(double tien1hv) {
		this.tien1hv = tien1hv;
	}
	@Override
	public void nhapThongTin() {
		super.nhapThongTin();
		Scanner s = new Scanner(System.in);
		System.out.print("Ngay vao lam viec: ");
		this.ngayVL = s.nextInt();
		System.out.print("so gio vuot: ");
		this.soGV = s.nextInt();
		System.out.print("Nhap tien mot gio vuot: ");
		this.tien1hv = s.nextInt();
	}
	@Override
	public void xuatThongTin() {
		// TODO Auto-generated method stub
		super.xuatThongTin();
		System.out.print("-Thu nhap: ");
		
	}
	
	@Override
	public double ThuNhap() {
		// TODO Auto-generated method stub
		return this.tienLuongcb()+this.tienVuotGio()+this.phuCap();
	}
	public double tienLuongcb() {
		// TODO Auto-generated method stub
		return 0;
	}	
	public double tienVuotGio() {
		// TODO Auto-generated method stub
		return this.soGV*this.tien1hv;
	}
	public double phuCap() {
		// TODO Auto-generated method stub
		return 360*1/100;
	}
	public double hhhh{
		if(this.NV=="A")
			return  this.tienLuongcb();

	}

}
