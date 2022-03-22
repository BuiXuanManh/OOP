package tuan3;

import java.util.Scanner;
public class TextCD {
	static ListCD l;
	static void nhapCd(CD cd) {
		Scanner sc= new Scanner(System.in);
        System.out.println("nhap ma cd");
        cd.setMaCd(sc.nextInt());
        sc.nextLine();
        System.out.println("nhap tua cd");
        cd.setTuaCd(sc.nextLine());
        System.out.println("nhap ca sy");
        cd.setCaSy(sc.nextLine());
        System.out.println("nhap so bai hat");
        cd.setsBh(sc.nextInt());
        System.out.println("nhap gia thanh");
        cd.setGiaThanh(sc.nextDouble());
        l.ThemCD(cd);
    }
	static void xuatDanhSach() {
	int soLuongThuc = l.sl;
	CD c[];
	c = l.getHet();
	for (int i = 0; i < soLuongThuc; i++) {
		System.out.println(c[i]);
	}
	System.out.println("\n\n\n");
}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		l = new ListCD(1);
		CD a= new CD(1,"Mua thu","Son tung", 3000, 2000000);
		l.ThemCD(a);
		CD cd= new CD();
		int chon;
		do {
			System.out.println("Ban chon lam gi?");
            System.out.println("1.Nhap them cd \n" +
                    "2.Xuat danh sach\n" +"3.Sap Xep\n");
            chon= sc.nextInt();
            switch (chon) {
			case 1:{
				nhapCd(cd);
			}
			case 2:{
				xuatDanhSach();
			}
			break;
			default:System.out.println("bye");
			}
		} while (chon<4);
		
	}
}
