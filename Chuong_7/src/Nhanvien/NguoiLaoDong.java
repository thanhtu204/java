package Nhanvien;

import java.util.Scanner;

import Ngay.Ngay;

public abstract  class NguoiLaoDong {
protected String hoTen;
protected Ngay ngaySinh;
protected double heSoLuong;
public NguoiLaoDong() {
	
}
public String getHoTen() {
	return hoTen;
}
public void setHoTen(String hoTen) {
	this.hoTen = hoTen;
}
public Ngay getNgaySinh() {
	return ngaySinh;
}
public void setNgaySinh(Ngay ngaySinh) {
	this.ngaySinh = ngaySinh;
}
public double getHeSoLuong() {
	return heSoLuong;
}
public void setHeSoLuong(double heSoLuong) {
	this.heSoLuong = heSoLuong;
}
public void nhapThongTin() {
	Scanner s =new Scanner(System.in);
	System.out.print("Nhap ho ten: ");
	this.hoTen = s.nextLine();
	this.ngaySinh = new Ngay();
	System.out.print("Nhap ngay sinh: ");
	this.ngaySinh.getDay();
	System.out.print("Nhap thang sinh: ");
	this.ngaySinh.getMonth();
	System.out.print("Nhap he so luong: ");
	this.heSoLuong=s.nextDouble();
	}
public  void xuatThongTin() {
	System.out.print("Ho ten: "+this.hoTen+"-Ngay sinh: "+this.ngaySinh.getDay()+this.ngaySinh.getMonth());
}
public abstract double ThuNhap();
	


	
}
