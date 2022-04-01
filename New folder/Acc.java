package taiKhoanNganHang;

import java.text.NumberFormat;
import java.util.Locale;

public class Acc {
	private int maAcc;
	private String tenAcc;
	private double soDu;
	public int getMaAcc() {
		return maAcc;
	}
	public void setMaAcc(int maAcc) {
		this.maAcc = maAcc;
	}
	public String getTenAcc() {
		return tenAcc;
	}
	public void setTenAcc(String tenAcc) {
		this.tenAcc = tenAcc;
	}
	public double getSoDu() {
		return soDu;
	}
	public void setSoDu(double soDu) {
		this.soDu = soDu;
	}
	public Acc() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Acc(int maAcc, String tenAcc, double soDu) {
		super();
		this.maAcc = maAcc;
		this.tenAcc = tenAcc;
		this.soDu = soDu;
	}
	@Override
	public String toString() {
		Locale l= new Locale("vi","VN");
		NumberFormat f= NumberFormat.getCurrencyInstance(l);
		String st= f.format(this.soDu);
		String s="";
		s=s+s.format("%-20d %20s %18s",this.maAcc,this.tenAcc, st);
		return s;
	}
}
