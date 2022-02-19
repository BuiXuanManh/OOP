package tuan1;

import java.util.Scanner;

public class Hcn {
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
	public double getDienTich() {
		return getChieuDai()*getChieuRong();
	}
	public double getChuVi() {
		return (getChieuDai()+getChieuRong())*2;
	}
	public Hcn(double d,double r) {
		this.chieuDai=d;
		this.chieuRong=r;
	}
	public Hcn() {};
	public static void main(String[] args) {
		Hcn h = new Hcn();
		Hcn hc = new Hcn(7,4);
		System.out.println("Dien tich la:"+ hc.getDienTich());
		System.out.println("Chu Vi la:"+hc.getChuVi());
		Scanner sc = new Scanner(System.in);
		System.out.println("nhap chieu dai");
		double d= sc.nextDouble();
		System.out.println("nhap chieu rong");
		double r= sc.nextDouble();
		Hcn hc1 = new Hcn(d,r);
		System.out.println("Dien tich:"+hc1.getDienTich());
		System.out.println("Chu vi:"+hc1.getChuVi());
		h.setChieuDai(d);
		h.setChieuRong(r);
		System.out.println("Dien tich la:"+h.getDienTich());
		System.out.println("Chu vi la:"+h.getChuVi());
	}
}
