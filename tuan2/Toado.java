package tuan2;

import java.util.Scanner;

public class Toado {
	private double hoanhDo,tungDo;
	private String tenToado;
	public double getHoanhDo() {
		return hoanhDo;
	}
	public void setHoanhDo(double hoanhDo) {
		if (hoanhDo!=0) {
			this.hoanhDo = hoanhDo;
		} else {
			System.out.println("loi");
		}	
	}
	public double getTungDo() {
		return tungDo;
	}
	public void setTungDo(double tungDo) {
		if (tungDo!=0) {
			this.tungDo = tungDo;
		} else {
			System.out.println("loi");
		}
	}
	public String getTenToado() {
		return tenToado;
	}
	public void setTenToado(String tenToado) {
		if (tenToado!="") {
			this.tenToado = tenToado;
		} else {
			System.out.println("loi");
		}	
	}
	public Toado() {}
	public Toado(String tenToado,double hoanhDo,double tungDo) {
		this.hoanhDo=hoanhDo;
		this.tungDo=tungDo;
		this.tenToado=tenToado;
	}
	@Override
	public String toString() {
		String s="";
		s=s+s.format("%10s(%.0f,%.0f)",getTenToado(),getHoanhDo(),getTungDo());
		return s;
	}
	public static void nhaptd(Toado t) {
				Scanner sc= new Scanner(System.in);
				System.out.println("ten toa do");
				t.setTenToado(sc.next());
				System.out.println("hoanh do");
				t.setHoanhDo(sc.nextDouble()); 
				System.out.println("nhap tung do");
				t.setTungDo(sc.nextDouble()); 
	}
}

