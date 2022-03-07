package tuan1;

import java.util.Scanner;

public class Toado {
	private double hoanhDo,tungDo;
	private String tenToado;
	public double getHoanhDo() {
		return hoanhDo;
	}
	public void setHoanhDo(double hoanhDo) {
		if (hoanhDo%1==0) {
			this.hoanhDo = hoanhDo;
		} else {
			System.out.println("loi");
		}	
	}
	public double getTungDo() {
		return tungDo;
	}
	public void setTungDo(double tungDo) {
		if (tungDo%1==0) {
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
		s=s+s.format("%20s( %f, %f)",getTenToado(),getHoanhDo(),getTungDo());
		return s;
	}
	public static void main(String[] args) {
		Toado t = new Toado();
		try {
			do {
				Scanner sc= new Scanner(System.in);
				System.out.println("ten toa do");
				String ten = sc.next();
				System.out.println("hoanh do");
				double h = sc.nextDouble();
				System.out.println("nhap tung do");
				double tg= sc.nextDouble();
				Toado t1 = new Toado(ten,h,tg);
				System.out.println(t1);	
			} while (t!=null);
		
		
		}catch (Exception e) {
			// TODO: handle exception
		}
	}
}
