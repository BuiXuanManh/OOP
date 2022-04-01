package taiKhoanNganHang;

import java.util.Scanner;

public class test {
	static List l;
	static Scanner sc= new Scanner(System.in);
	static String Header() {
		return String.format("%-20s %20s %20s", "So tk","ten tk","so du");
	}
	static void inTK() {
		Acc a[]= l.getlist();
		for(int i=0;i<l.sl;i++) {
			System.out.println(a[i]);
		}
	}
	static void nhapcung() throws Exception {
		Acc a1= new Acc(1111,"li qua troi",60000);
		l.them(a1);
		Acc a2= new Acc(2222,"pha qua troi",70000);
		l.them(a2);
		Acc a3= new Acc(3333,"hu qua troi",80000);
		l.them(a3);
	}
	static void nhapmem(Acc a1) throws Exception {
		System.out.println("nhap ma tk");
		int ma= sc.nextInt();
		if(l.tim(ma)==-1) {
			System.out.println("nhap ten tk");
			String ten= sc.next();
			System.out.println("nhap so du tk");
			double s=sc.nextDouble();
			if(s<50000) s=50000;
			a1= new Acc(ma,ten,s);
			l.them(a1);
		}
		else throw new Exception("ma trung");
	}
	static void Menu() {
		System.out.println("\t**************************************************");
		System.out.println("\t**        Thông Tin Tài Khoản Khách Hàng        **");
		System.out.println("\t*   1. Thêm tài khoản                            *");
		System.out.println("\t*   2. In thông tin tài khoản ra màn hình        *");	
		System.out.println("\t*   3. Xoa	                                   *");
		System.out.println("\t*   4. Sua                         	           *");
		System.out.println("\t*   5. Xep                         		       *");
		System.out.println("\t*   6. Xep theo ten                              *");
		System.out.println("\t*  10. Thoát                                     *");
		System.out.println("\t**************************************************");
	}	
	static void menuSua() {
		System.out.println("\t*****************************************");
		System.out.println("\t**       Mời nhập thông tin cần sửa    **");
		System.out.println("\t*   1. mã tk          			      *");
		System.out.println("\t*   2. Ten tk          			      *");
		System.out.println("\t*   3. So du      		         	  *");
		System.out.println("\t* Nhập phím bất kì để trở về menu chính *");
		System.out.println("\t*****************************************");
	}
	static void xoa() throws Exception {
		System.out.println("nhap ma tk can xoa");
		int ma =sc.nextInt();
		if(ma==-1) throw new Exception("khong tim thay tk can xoa");
		System.out.println("ban co chac muon xoa khong (y/n)");
		String s= sc.next();
		if(s.equals("y")||s.equals("Y")) l.xoa(ma);
		else System.out.println("da huy xoa");
	}
	static void sua(Acc a1) throws Exception {
		System.out.println("nhap ma tk can sua");
		int ma= sc.nextInt();
		int t=l.tim(ma);
		if(t==-1) throw new Exception("khong tim thay tk can sua");
		a1= l.getlist()[t];
		int chon;
		do {
			menuSua();
			System.out.println("chon");
			chon=sc.nextInt();
			switch (chon) {
			case 1:
				System.out.println("nhap ma tk thay the");
				int m=sc.nextInt();
				a1.setMaAcc(m);
				System.out.println("sua thanh cong");
			break;
			case 2:
				System.out.println("nhap ten tk thay the");
				String ten=sc.next();
				a1.setTenAcc(ten);;
				System.out.println("sua thanh cong");
			break;
			case 3:
				System.out.println("nhap so du thay the");
				double s=sc.nextDouble();
				a1.setSoDu(s);;
				System.out.println("sua thanh cong");
			break;
			default:
				break;
			}
		}while (chon<4);
	}
	public static void main(String[] args) throws Exception {
		l= new List(3);
		nhapcung();
		Acc acc= new Acc();
		int chon;
		do {
			Menu();
			chon= sc.nextInt();
			switch (chon) {
			case 1:
				nhapmem(acc);
			break;
			case 2:
				System.out.println( Header());
				inTK();
			break;
			case 3:
				xoa();
			break;
			case 4:
				sua(acc);
			break;
			case 5:
				l.xep();
			break;
			case 6:
				l.xepten();
			break;
			default:
				break;
			}
		}while(chon<8);
	}
}
