package tuan2;

import java.util.Scanner;

public class HinhTamGiac {
	private double ma,mb,mc,chuVi,dienTich;
	private String kieu;
	public double getMa() {
		return ma;
	}

	public void setMa(double ma) {
		if (ma>0) {
			this.ma = ma;
		} else {
		}
		this.ma = ma;
	}

	public double getMb() {
		return mb;
	}

	public void setMb(double mb) {
		if (mb>0) {
			this.mb = mb;
		} else {
		}
	}
	public double getMc() {
		return mc;
	}
	public void setMc(double mc) {
		if (mc>0) {
			this.mc = mc;
		} else {
		}
	}
	public double getchuVi() {
		return (getMa()+getMb()+getMc());
	}
	public double getdienTich() {
		return(Math.sqrt((getchuVi()/2)*((getchuVi()/2)-getMa())*((getchuVi()/2)-getMb())*((getchuVi()/2))-getMc()));
	}
	public String getKieu() {
		return kieu;
	}
	public HinhTamGiac() {}
	public HinhTamGiac(double ma, double mb, double mc, double dienTich, double chuVi,String kieu) {
		this.ma=ma;
		this.mb=mb;
		this.mc=mc;
		this.chuVi=chuVi;
		this.dienTich=dienTich;
		this.kieu=kieu;
	}
	public String toString() {
		String s="";
		s=s+s.format("\tcanh ma\tcanh mb\tcanh mc\tdien tich\tchu vi\tkieu\n\t%.2f \t%.2f\t%.2f\t%.2f\t\t%.2f\t%-10s",getMa(),getMb(),getMc(),getdienTich(),getchuVi(),getKieu());
		return s;
	}
	public static void main(String[] args) {
		HinhTamGiac htg= new HinhTamGiac();
		try {
			do {
		Scanner sc= new Scanner(System.in);
		System.out.println("nhap canh ma");
		double ma=sc.nextDouble();
		System.out.println("nhap canh mb");
		double mb=sc.nextDouble();
		System.out.println("nhap canh mc");
		double mc=sc.nextDouble();
		double cv=ma+mb+mc;
		double p=cv/2;
		double dt=Math.sqrt(p*(p-ma)*(p-mb)*(p-mc));
		String kieu = "";
		if((ma+mb>mc)&&(ma+mc>mb)&&(mb+mc>ma)) kieu ="thuong";
		if((ma==mb)||(mb==mc)||(ma==mc)) kieu= "can";
		if((ma==mb)&&(mb==mc)) kieu= "deu";
		if((ma+mb<=mc)||(ma+mc<=mb)||(mb+mc<=ma))  kieu= "khong phai";
		HinhTamGiac htg1 = new HinhTamGiac(ma,mb,mc,cv,dt,kieu);
		System.out.println(htg1);
			} while (htg!=null);	
		}catch (Exception e) {
		}
	}
}
