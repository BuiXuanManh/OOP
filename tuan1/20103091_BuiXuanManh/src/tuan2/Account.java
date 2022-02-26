package tuan2;

import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Locale;

public class Account {
	private String tenTK;
	private String soTK;
	private double tienTK;
	public String getTenTK() {
		return tenTK;
	}
	public void setTenTK(String tenTK) {
		if (tenTK!="") {
			this.tenTK = tenTK;
		} else {
			System.out.println("loi");
		}
	}
	public String getSoTK() {
		return soTK;
	}
	public void setSoTK(String soTK) {
		if (soTK!="") {
			this.soTK = soTK;
		} else {
			System.out.println("loi");
		}
	}
	public double getTienTK() {
		return tienTK;
	}
	public void setTienTK(double tienTK) {
		if (tienTK>0) {
			this.tienTK = tienTK;
		} else {
			System.out.println("loi");
		}
	}
	@Override
	public java.lang.String toString() {
		String s="";
		s=s+s.format("|%10s| %10s | %12s", getTenTK(),getSoTK(),getTienTK());
		return s;
	}
	public Account() {}
	public Account(String ten, String so, double tien) {
		this.tenTK=ten;
		this.soTK=so;
		this.tienTK=tien;
	}
	public double rutTien(Account ac1,double tienRut) {
		if (tienRut>0 && ac1.getTienTK()>50000) {
			ac1.setTienTK(ac1.getTienTK()-tienRut);
			return tienRut;
		} else {
			return 0;
		}
	}
	public void napTien(Account ac2, double tienNap) {
		if (tienNap>0 && ac2!=null) {
			ac2.setTienTK(ac2.getTienTK()+tienNap);
		} else {
			System.out.println("loi");
		}
	}
	public void chuyenTien(Account ac1, Account ac2, double tien) {
		ac2.napTien(ac2, ac1.rutTien(ac1, tien));
	}
	
}
