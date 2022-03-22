package tuan2;

import java.time.LocalDate;
import java.util.Scanner;

public class KhachHang {
	private String maKH, tenKH;
	private int solgSo;
	SoTK so[];
	public String getMaKH() {
		return maKH;
	}
	public void setMaKH(String maKH) {
		this.maKH = maKH;
	}
	public String getTenKH() {
		return tenKH;
	}
	public void setTenKH(String tenKH) {
		this.tenKH = tenKH;
	}
	public int getSolgSo() {
		return solgSo;
	}
	public void setSolgSo(int solgSo) {
		this.solgSo = solgSo;
	}
	public SoTK[] getSo() {
		return so;
	}
	public void setSo(SoTK[] so) {
		this.so = so;
	}
	public KhachHang() {}
	public KhachHang(String maKH, String tenKH, int solSo, SoTK so[]) {
		this.maKH= maKH;
		this.tenKH= tenKH;
		this.solgSo= solSo;
		this.so= so;
	}
	public static SoTK nhapSo(SoTK so) {
		int d,m,y;
		Scanner sc = new Scanner(System.in);
		System.out.println("nhap ma so");
		so.setMaSo(sc.next());
		sc.nextLine();
		System.out.println("nhap ngay mo so");
		System.out.println("nhap ngay");
		d=sc.nextInt();
		sc.nextLine();
		System.out.println("nhap thang");
		m= sc.nextInt();
		sc.nextLine();
		System.out.println("nhap nam");
		y= sc.nextInt();
		sc.nextLine();
		so.setNgayMo(LocalDate.of(y,m,d));
		System.out.println("nhap tien gui");
		so.setTienGui(sc.nextDouble());
		sc.nextLine();
		System.out.println("nhap ky han");
		so.setKyHan(sc.nextInt());
		sc.nextLine();
		System.out.println("nhap lai suat");
		so.setLaiS(sc.nextDouble());
		sc.nextLine();
		return so;
	}
	public static void main(String[] args) {
		int n=0;
		boolean flag=true;
		Scanner sc= new Scanner(System.in);
		KhachHang k = new KhachHang();
		SoTK so[] = null;
		do {
			System.out.println("chon\n 1. nhap\n 2. xuat\n 3. tinh so thang gui that\n 4. tinh lai suat\n nhap so khac de thoat");
			int chon=sc.nextInt();
		switch (chon) {
		case 1: {
			System.out.println("nhap ma khach hang");
			k.setMaKH(sc.next());
			System.out.println("nhap ten khach hang");
			k.setTenKH(sc.next());
			sc.nextLine();
			System.out.println("nhap so luong so hien co");
			n= sc.nextInt();
			k.setSolgSo(n);
			so= new SoTK[n];
			for(int i=0;i<n;i++) {
				System.out.println("so tiet kiem so " +(i+1));
				so[i]= new SoTK();
				so[i] = (nhapSo(so[i]));
			}
		}
		break;
		case 2: {
				System.out.println(   " ma khach hang :" + k.maKH + "\n"
									+ " ten khach hang :" + k.tenKH + "\n"
									+ " so luong so hien co :" + k.solgSo + "\n"
									+ " danh sach so");
				for (int i = 0; i < n; i++) {
				System.out.println(	  ""+so[i]+"\n");
            }
		}
		break;
		case 3:{
			for(int i=0; i<n;i++) {
				
				System.out.println("so thang gui that cua so tiet kiem  "+(i+1)+"\tla\t"+so[i].stgthuc());
			}
		}
		break;
		case 4:{
			for(int i=0; i<n;i++) {
				System.out.println("so tien lai cua so thu nhat  "+(i+1)+"\tla\t"+so[i].tienlai());
				
			}
		}
		break;
		default:
			System.out.println("bye");
			flag= false;
		}
		 } while (flag);
		
	}
}
