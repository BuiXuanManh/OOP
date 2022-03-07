package tuan2;

import java.util.Scanner;

public class SinhVien {
	private int masv;
	private String hoten;
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
	public SinhVien() {}
	public SinhVien(int masv, String ht) {
		this.hoten= ht;
		this.masv=masv;
	}
	public String toString() {
		String s="";
		s=s+s.format("\tma sv\tten sinh vien\n%10d \t%10s",getMasv(),getHoten());
		return s;
	}
}
