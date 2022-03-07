package tuan2;

import java.util.Scanner;
public class LopHP {
	private String maLHP,tenLHP, tenGV, ttinLH;
	SinhVien sv[];
	public String getMaLHP() {
		return maLHP;
	}
	public void setMaLHP(String maLHP) {
		if (maLHP!=null) {
			this.maLHP = maLHP;
		} else {
			System.out.println("loi ma lop");
		}
	}
	public String getTenLHP() {
		return tenLHP;
	}
	public void setTenLHP(String tenLHP) {
		if (tenLHP!=null) {
			this.tenLHP = tenLHP;
		} else {
			System.out.println("loi ten lop");
		}
	}
	public String getTenGV() {
		return tenGV;
	}
	public void setTenGV(String tenGV) {
		if (tenGV!=null) {
			this.tenGV = tenGV;
		} else {
			System.out.println("loi ten giang vien");
		}
	}
	public String getTtinLH() {
		return ttinLH;
	}
	public void setTtinLH(String ttinLH) {
		if (ttinLH!=null) {
			this.ttinLH = ttinLH;
		} else {
			System.out.println("loi thong tin lop");
		}
	}
	public SinhVien[] getSv() {
		return sv;
	}
	public void setSv(SinhVien[] sv) {
		if (sv!=null) {
			this.sv = sv;
		} else {
			System.out.println("loi thong tin sinh vien");
		}
	}
	public LopHP() {}
	public LopHP(String maLHP, String tenLHP, String tenGV, String ttinLH, SinhVien[] sv) {
		super();
		this.maLHP = maLHP;
		this.tenLHP = tenLHP;
		this.tenGV = tenGV;
		this.ttinLH = ttinLH;
		this.sv = sv;
	}
	public static SinhVien nhapSv(SinhVien sv2) {
		Scanner sc= new Scanner(System.in);
		System.out.println("nhap ma sinh vien");
		sv2.setMasv(sc.nextInt());
		System.out.println("ten sinh vien");
		sv2.setHoten(sc.next());
		return sv2;
	}
	public static void main(String[] args) {
		int n=0;
		boolean flag=true;
		Scanner sc= new Scanner(System.in);
		LopHP l = new LopHP();
		SinhVien sv[] = null;
		do {
			System.out.println("chon\n 1. nhap\n 2. xuat\n so khac de thoat");
			int chon=sc.nextInt();
		switch (chon) {
		case 1: {
			System.out.println("nhap ma lop HP");
			l.setMaLHP(sc.next());
			System.out.println("nhap ten lop HP");
			l.setTenLHP(sc.next());
			sc.nextLine();
			System.out.println("nhap ten giang vien");
			l.setTenGV(sc.next());
			sc.nextLine();
			System.out.println("nhap thong tin lop hoc");
			l.setTtinLH(sc.next());
			sc.nextLine();
			System.out.println("nhap so luong sinh vien");
			n = sc.nextInt();
			sv= new SinhVien[n];
			for(int i=0;i<n;i++) {
				System.out.println("sinh vien so " +(i+1));
				sv[i]= new SinhVien();
				sv[i] = (nhapSv(sv[i]));
			}
		}
		break;
		case 2: {
				System.out.println(   " ma lop hoc phan :" + l.maLHP + "\n"
									+ " ten lop hoc phan :" + l.tenLHP + "\n"
									+ " ten giang vien :" + l.tenGV + "\n"
									+ " thong tin lop hoc" + l.ttinLH + "\n"
									+ " danh sach sinh vien");
				for (int i = 0; i < n; i++) {
				System.out.println(	  ""+sv[i]+"\n");
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
