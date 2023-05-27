package baitap;

import java.util.Scanner;

public class PtBac2 {
 int a,b,c,denta;
 double x1,x2;
	

public void Nhapphuongpt() {
	Scanner S = new Scanner(System.in);
	 
     System.out.print("Nhap he so a: ");
     this.a=S.nextInt();
     System.out.print("Nhap he so b: ");
     this.b = S.nextInt();
     System.out.print("Nhap he so c: ");
     this.c=S.nextInt();
     
}
private int Tinhdenta() {
	this.denta= (int) ((Math.pow(b, 2))-4*a*c);
	return this.denta;
}
public String Xuatkq() {
	String kq="";
	Tinhdenta();
	System.out.println(this.denta);
		if(Tinhdenta()>0) {
		System.out.println("Phuong trinh co 2 nghiem phan biet");
		this.x1=(-this.b+Math.sqrt(this.denta))/(2*this.a);
		this.x2=(-this.b-Math.sqrt(this.denta))/(2*this.a);
		
		kq = "Phuong trinh co nghiem x1= "+this.x1+"\n"+"Phuong trinh co nghiem x2= "+this.x2;
		return kq;
	}
	
	if(Tinhdenta()==0) {
		System.out.println("Phuong trinh co nghiem kep nghiem");
		this.x1=this.x2=-this.b/(2*this.a);
		kq="Phuong trinh co nghiem x= "+this.x1;
		return kq;
	}
	else
		System.out.println("Phuong trinh vo nghiem");
	return kq;
	
}
}