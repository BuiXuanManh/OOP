package tuan1;

import java.util.Scanner;

public class DiemSinhVien {
	private int masv;
	private String hoten;
	private double dLT,dTH;
	private double dTB;
	public int getMasv() {
		return masv;
	}
	public void setMasv(int masv) {
		if (masv>0) {
			this.masv = masv;
		} else {
			System.out.println("loi");
		}
	}
	public String getHoten() {
		return hoten;
	}
	public void setHoten(String hoten) {
		if (hoten!="") {
			this.hoten = hoten;
		} else {
			System.out.println("loi");
		}
	}
	public double getdLT() {
		return dLT;
	}
	public void setdLT(double dLT) {
		if ((0<dLT||dLT==0) && (dLT<10||dLT==10)) {
			this.dLT = dLT;
		} else {
			System.out.println("loi");
		}
	}
	public double getdTH() {
		return dTH;
	}
	public void setdTH(double dTH) {
		if ((0<dTH||dTH==0) && (dTH<10||dTH==10)) {
			this.dTH = dTH;
		} else {
			System.out.println("loi");
		}
	}
	public DiemSinhVien() {}
	public DiemSinhVien(int masv, String ht, double dLT,double dTH, double dTB) {
		this.hoten= ht;
		this.masv=masv;
		this.dLT=dLT;
		this.dTH=dTH;
		this.dTB=dTB;
	}
	public double getdTB() {
		return (getdLT()+getdTH())/2;
	}
	@Override
	public String toString() {
		String s="";
		s=s+s.format("\tma sv\tten sinh vien\tdiem lt\tdiem th\tdiem tb\n%10d \t%-10s\t%.2f\t%.2f\t%.2f",getMasv(),getHoten(),getdLT(),getdTH(),getdTB());
		return s;
	}
	public static void main(String[] args) {
		DiemSinhVien dsv = new DiemSinhVien();
		try {
			do {
		Scanner sc= new Scanner(System.in);
		System.out.println("nhap ma sinh vien");
		int masv = sc.nextInt();
		System.out.println("ten sinh vien");
		String hoten = sc.next();
		System.out.println("diem ly thuyet");
		double lt = sc.nextDouble();
		System.out.println("diem thuc hanh");
		double th= sc.nextDouble();
		double dTB=(lt+th)/2;
		DiemSinhVien dsv1 = new DiemSinhVien(masv,hoten,lt,th,dTB);
		System.out.println(dsv1);
		} while (dsv!=null);	
		}catch (Exception e) {
			// TODO: handle exception
		}
	}
}
