package tuan2;

import java.util.Scanner;

public class HinhTron {
	private Toado tam;
	private double bk;
	public Toado getTam() {
		return tam;
	}
	public void setTam(Toado tam) {
		this.tam = tam;
	}
	public double getBk() {
		return bk;
	}
	public void setBk(double bk) {
		this.bk = bk;
	}
	public double chuVi(double b) {
		return 2*3.14*b;
	}
	public double dienTich(double b) {
		return 3.14*Math.pow(b,2);
	}
	public HinhTron() {}
	@Override
	public String toString() {
		return ("Dien tich,Chu vi HinhTron tam"+tam+"bk=\t"+bk+"la\t"+dienTich(bk)+"\tva\t"+ chuVi(bk));
	}
	public HinhTron(Toado t, double b) {
		this.tam=t;
		this.bk=b;
	}
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		Toado a= new Toado();
		a.nhaptd(a);
		System.out.println("nhap ban kinh");
		double b= sc.nextDouble();
		HinhTron ht = new HinhTron(a,b);
		System.out.println(ht);
	}
}
