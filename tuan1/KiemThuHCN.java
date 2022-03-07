package tuan1;

import java.util.Scanner;

public class KiemThuHCN {
	static Scanner scanner = new Scanner(System.in);

	static String Header() {
		return String.format("%-10s %-20s %-15s %-25s %-12s", "Mã hcn", "chieu dai", "chieu rong", "chu vi", "dien tich");
	}
	static void nhapCung(DanhSachHCN dshcn) {
		HinhChuNhat hcn = new HinhChuNhat();
		hcn = new HinhChuNhat("001", 5, 6,22,30);
		dshcn.ThemHCN(hcn);
		hcn = new HinhChuNhat("002", 3, 4,14,12);
		dshcn.ThemHCN(hcn);
		hcn = new HinhChuNhat("003", 7, 9,32,63);
		dshcn.ThemHCN(hcn);
	}

	public static HinhChuNhat nhapThongTin() {
		HinhChuNhat hcn = new HinhChuNhat();
		String mahcn;
		double chieuDai;
		double chieuRong;
		double chuVi;
		double dienTich;
		try {
			System.out.println("nhap ma hcn: ");
			mahcn = scanner.nextLine();
			hcn.setMahcn(mahcn);
			System.out.println("nhap chieu dai: ");
			chieuDai = scanner.nextDouble();
			hcn.setChieuDai(chieuDai);
			System.out.println("nhap chieu rong: ");
			chieuRong = scanner.nextDouble();
			hcn.setChieuRong(chieuRong);
			chuVi=(chieuDai+chieuRong)*2;
			dienTich=chieuDai*chieuRong;
		} catch (Exception e) {
			System.out.println("Loi" + e.getMessage());
		}
		return hcn;
	}
	static void Menu() {
		System.out.println("\t****************************************");
		System.out.println("\t**       Chuong trinh quan ly hcn      *");
		System.out.println("\t* 1. nhap cung                         *");
		System.out.println("\t* 2. them                              *");
		System.out.println("\t* 3. tim kiem                          *");
		System.out.println("\t* 4. xuat                              *");
		System.out.println("\t****************************************");
	}
	static DanhSachHCN dshcn;
	static HinhChuNhat them() {
		HinhChuNhat hcn = new HinhChuNhat();
		Scanner scanner = new Scanner(System.in);
		double chieuDai;
		double chieuRong;
		double chuVi;
		double dienTich;
		String mahcn;
		System.out.println("nhap ma hcn: ");
		mahcn= scanner.nextLine();
		if (dshcn.timKiem(mahcn) != -1) {
			return null;
		} else {
		System.out.println("nhap chieu dai: ");
		chieuDai = scanner.nextInt();
		System.out.println("nhap chieu rong: ");
		chieuRong = scanner.nextInt();
		System.out.println("nhap ma hcn: ");
		chuVi=(chieuDai+chieuRong)*2;
		dienTich= chieuDai*chieuRong;
		hcn = new HinhChuNhat(mahcn,chieuDai, chieuRong,chuVi,dienTich );
		return hcn;}
		}
		static void timKiem(DanhSachHCN dshcn) {
			Scanner sc = new Scanner(System.in);
			String mahcn;
			int viTri;
			System.out.println("nhap ma hcn: ");
			mahcn = sc.nextLine();
			viTri = dshcn.timKiem(mahcn);
			if (viTri == -1) {
				System.out.println("ma khong ton tai");
			}
			System.out.println("vi tri:" + viTri);
		}
		static void xuatDanhSach(HinhChuNhat dshcn[], int soLuong) {
			for (int i = 0; i < soLuong; i++) {
				System.out.println(dshcn[i]);
			}
			System.out.println("\n\n\n");
		}
		public static void main(String[] args) {
			try {
				int chon;
				HinhChuNhat hcn = new HinhChuNhat();
				DanhSachHCN dshcn = new DanhSachHCN(3);
				do {
					Menu();
					System.out.println("Nhap lua chon: ");
					chon = scanner.nextInt();
					switch (chon) {
					case 1:
						nhapCung(dshcn);
						break;
					case 2:
						HinhChuNhat hcn1 = them();
						if(hcn1 !=null)
						{
							dshcn.ThemHCN(hcn);
							System.out.println("Them thanh cong");
						}else {
							System.out.println("Them that bai");
						}
						break;
					case 3: {
						timKiem(dshcn);
						break;
					}
					case 4:
						System.out.println(Header());
						System.out.println(
								"====================================================================================================");
						xuatDanhSach(dshcn.getDanhSachHCN(), dshcn.soLuongHcnHt);
						break;
					default:
						System.out.println("Cam on ban su dung chuong trinh!!");
						System.exit(0);
					}
				} while (chon < 5);
			} catch (ArithmeticException e1) {
				System.out.println("Khong duoc chia cho khong" + e1.getMessage());
			} catch (ArrayIndexOutOfBoundsException e2) {
				System.out.println("Loi mang" + e2.getMessage());
			} catch (Exception e) {
				System.out.println("Loi khong xac dinh" + e.getMessage());
			}

		}
}
