package tuan2;

import java.awt.Point;
import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.Period;

public class SoTK {
	private String maSo;
	private LocalDate ngayMo;
	private double tienGui;
	public double getTienGui() {
		return tienGui;
	}
	public void setTienGui(double tienGui) {
		if (tienGui>0) {
			this.tienGui = tienGui;
		} else {
			System.out.println("loi tien gui");
		}
	}
	private int kyHan;
	private double laiS;
	public String getMaSo() {
		return maSo;
	}
	public void setMaSo(String maSo) {
		if (maSo!=null) {
			this.maSo = maSo;
		} else {
			System.out.println("loi ma so");
		}
	}
	public LocalDate getNgayMo() {
		return ngayMo;
	}
	public void setNgayMo(LocalDate ngayMo) {
		if (ngayMo.isBefore(LocalDate.now())) {
			this.ngayMo = ngayMo;
		} else {
			System.out.println("ngay mo khong the la sau ngay hom nay");
		}	
	}
	public int getKyHan() {
		return kyHan;
	}
	public void setKyHan(int kyHan) {
		if (kyHan>0) {
			this.kyHan = kyHan;
		} else {
			System.out.println("loi ky han");
		}
	}
	public double getLaiS() {
		return laiS;
	}
	public void setLaiS(double laiS) {
		if (laiS>0) {
			this.laiS = laiS;
		} else {
			System.out.println("loi lai suat");
		}
	}
	public SoTK() {}
	public SoTK(String maSo, LocalDate ngayMo,double tienGui, int kyHan, double laiS) {
		super();
		this.maSo = maSo;
		this.ngayMo = ngayMo;
		this.tienGui= tienGui;
		this.kyHan = kyHan;
		this.laiS = laiS;
	}
	@Override
	public String toString() {
		return "Ma so =" + maSo + ", Ngay mo so =" + ngayMo + ", tien gui=" + tienGui + ", ky han=" + kyHan + ", lai suat ="
				+ laiS + "";
	}
	public int stgthuc() {
		Period date = Period.between(ngayMo, LocalDate.now());
		int nam= date.getYears();
		int thang= date.getMonths();
		int thanggui= nam*12+thang;
		if(thanggui % kyHan==0 ) return thanggui;
			else return thanggui/kyHan*kyHan ;
	}
	public String tienlai() {
		DecimalFormat formatter = new DecimalFormat("###,###,###");
		return formatter.format(getTienGui()*getLaiS()*stgthuc());
	}
}
