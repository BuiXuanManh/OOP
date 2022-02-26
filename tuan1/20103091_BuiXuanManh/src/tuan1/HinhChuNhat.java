package tuan1;

import java.util.Scanner;

public class HinhChuNhat {
	private double chieuDai;
	private double chieuRong;
	public double getChieuDai() {
		return chieuDai;
	}
	public void setChieuDai(double d) {
		if (d>0) {
			this.chieuDai = d;
		} else {
			System.out.println("loi chieu dai");
		}
		
	}
	public double getChieuRong() {
		return chieuRong;
	}
	public void setChieuRong(double r) {
		if (r>0) {
			this.chieuRong = r;
		} else {
			System.out.println("loi chieu rong");
		}
		
	}
	public double getDienTich(){
		return getChieuDai()*getChieuRong();
	}
	public double getChuVi() {
		return (getChieuDai()+getChieuRong())*2;
	}
	public HinhChuNhat(double d, double r) {
		this.chieuDai=d;
		this.chieuRong=r;
	}
	public HinhChuNhat() {};
	public static void main(String[] args) {
		HinhChuNhat hcn = new HinhChuNhat();
		HinhChuNhat hcnc= new HinhChuNhat(3,7);
		System.out.println("Dien Tich la :"+ hcnc.getDienTich());
		System.out.println("Chu  vi la:"+ hcnc.getChuVi());
		Scanner sc = new Scanner(System.in);
		System.out.println("nhap chieu dai:");
		double d=sc.nextDouble();
		System.out.println("nhap chieu rong");
		double r= sc.nextDouble();
		HinhChuNhat hcn1= new HinhChuNhat(d,r);
		System.out.println("Dien tich:"+hcn1.getDienTich());
		System.out.println("Chu vi:"+hcn1.getChuVi());
		hcn.setChieuDai(d);
		hcn.setChieuRong(r);
		System.out.println("Dien tich la:"+hcn.getDienTich());
		System.out.println("Chu vi la:"+hcn.getChuVi());
	}
}
