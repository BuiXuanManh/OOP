package tuan1;

import java.util.Scanner;

public class HinhChuNhat {
	private double chieuDai;
	private double chieuRong;
	private double chuVi;
	private double dienTich;
	private String mahcn;
	public HinhChuNhat() {
		super();
	}

	public double getChuVi() {
		return (chieuDai+chieuRong)*2;
	}

	public void setChuVi(double chuVi) {
		this.chuVi = chuVi;
	}

	public double getDienTich() {
		return chieuDai*chieuRong;
	}

	public void setDienTich(double dienTich) {
		this.dienTich = dienTich;
	}

	public HinhChuNhat(String mahcn,double chieuDai, double chieuRong,double chuVi,double dienTich) {
		super();
		this.mahcn = mahcn;
		this.chieuDai = chieuDai;
		this.chieuRong= chieuRong;
		this.chuVi= chuVi;
		this.dienTich= dienTich;
	}
	public double getChieuDai() {
		return chieuDai;
	}
	public String getMahcn() {
		return mahcn;
	}
	public void setMahcn(String mahcn) throws Exception {
		if (!mahcn.equals(""))
			this.mahcn = mahcn;
		else
			throw new Exception("Mã không được để trống");
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
//	public static void main(String[] args) {
//		HinhChuNhat hcn = new HinhChuNhat();
//		HinhChuNhat hcnc= new HinhChuNhat(3,7);
//		System.out.println("Dien Tich la :"+ hcnc.getdienTich());
//		System.out.println("Chu  vi la:"+ hcnc.getchuVi());
//		Scanner sc = new Scanner(System.in);
//		System.out.println("nhap chieu dai:");
//		double d=sc.nextDouble();
//		System.out.println("nhap chieu rong");
//		double r= sc.nextDouble();
//		HinhChuNhat hcn1= new HinhChuNhat(d,r);
//		System.out.println("Dien tich:"+hcn1.getdienTich());
//		System.out.println("Chu vi:"+hcn1.getchuVi());
//		hcn.setChieuDai(d);
//		hcn.setChieuRong(r);
//		System.out.println("Dien tich la:"+hcn.getdienTich());
//		System.out.println("Chu vi la:"+hcn.getchuVi());
//	}
	public String toString() {
		return String.format("%-10s %20.2f %15.2f %20.2f %20.2f ",mahcn, chieuDai, chieuRong, chuVi, dienTich);
	}
}
