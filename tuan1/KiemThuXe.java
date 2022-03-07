package tuan1;

import java.util.Scanner;

public class KiemThuXe {
	static Scanner scanner = new Scanner(System.in);

	static String Header() {
		return String.format("%-10s %-20s %-15s %-25s %-12s %-15s", "Mã xe", "Tên chủ xe", "Loại xe", "Dung tích",
				"Trị giá", "Thuế phải nộp");
	}

	static void nhapCung(DanhSachXe dSXe) {
		ThongTinDangKyXe xe = new ThongTinDangKyXe();
		xe = new ThongTinDangKyXe("KH1", "Nguyễn Thu Loan", "Future Neo", 35000000, 100);
		dSXe.themXe(xe);
		xe = new ThongTinDangKyXe("KH2", "Võ Tấn Đạt", "R15", 135000000, 250);
		dSXe.themXe(xe);
		xe = new ThongTinDangKyXe("KH3", "Lê Hữu Hịu", "Ferari", 1350000000, 1000);
		dSXe.themXe(xe);
	}

	public static ThongTinDangKyXe nhapThongTin() {
		ThongTinDangKyXe xe = new ThongTinDangKyXe();
		String maXe;
		String chuXe;
		String loaiXe;
		int dungTich;
		double triGia;
		try {
			System.out.println("Nhập mã xe: ");
			maXe = scanner.nextLine();
			xe.setMaXe(maXe);
			System.out.println("Nhập chủ sở hữu xe: ");
			chuXe = scanner.nextLine();
			xe.setChuxe(chuXe);
			System.out.println("Nhập loại xe: ");
			loaiXe = scanner.nextLine();
			xe.setLoaixeString(loaiXe);
			System.out.println("Nhập dung tích xe: ");
			dungTich = scanner.nextInt();
			xe.setDungtich(dungTich);
			System.out.println("Nhập trị giá xe: ");
			triGia = scanner.nextDouble();
			xe.setTrigiaxe(triGia);
		} catch (Exception e) {
			System.out.println("Lỗi" + e.getMessage());
		}
		return xe;
	}

	static void Menu() {
		System.out.println("\t****************************************");
		System.out.println("\t**       Chương trình quản lí xe      **");
		System.out.println("\t* 1. Nhập cứng                         *");
		System.out.println("\t* 2. Thêm                              *");
		System.out.println("\t* 3. Xóa                               *");
		System.out.println("\t* 4. Sửa                               *");
		System.out.println("\t* 5. Tìm Kiếm                          *");
		System.out.println("\t* 6. Xuất                              *");
		System.out.println("\t* 7. Thoát                             *");
		System.out.println("\t****************************************");
	}

	static void menuSua() {
		System.out.println("\t****************************************");
		System.out.println("\t**       Mời nhập thông tin cần sửa    **");
		System.out.println("\t* 1. Tên chủ xe                         *");
		System.out.println("\t* 2. Loại xe                            *");
		System.out.println("\t* 3. Dung Tích                          *");
		System.out.println("\t* 4. Trị Giá                            *");
		System.out.println("\t* 5. Về menu chính                      *");
		System.out.println("\t*****************************************");
	}

	static DanhSachXe dsXe;

	static ThongTinDangKyXe them() {
		ThongTinDangKyXe xe = new ThongTinDangKyXe();
		Scanner scanner = new Scanner(System.in);
		String maXe;
		String tenChuXe;
		String loaiXe;
		int dungTich;
		double triGia;
		System.out.println("Nhập mã xe: ");
		maXe = scanner.nextLine();
		if (dsXe.timKiem(maXe) != -1) {
			return null;
		} else {
			System.out.println("Nhập tên chủ xe: ");
			tenChuXe = scanner.nextLine();
			System.out.println("Nhập loại xe: ");
			loaiXe = scanner.nextLine();
			System.out.println("Nhập dung tích xe: ");
			dungTich = scanner.nextInt();
			System.out.println("Nhập trị giá xe: ");
			triGia = scanner.nextDouble();
			xe = new ThongTinDangKyXe(maXe, tenChuXe, loaiXe, triGia, dungTich);
			return xe;
		}

	}

	static void xoa(DanhSachXe dsXe) {
		Scanner scanner = new Scanner(System.in);
		String maXe;
		System.out.println("Nhập mã xe cần xóa");
		maXe = scanner.nextLine();
		int vt = dsXe.timKiem(maXe);
		if (vt != -1) {
			System.out.println("Bạn có chắc chắn muốn xóa không [y/n]");
			String acpString = new Scanner(System.in).nextLine();
			if (acpString.equals("y")) {
				dsXe.xoaXe(maXe);
				dsXe.soLuongXeHT--;
				System.out.println("Xóa thành công");
			} else {
				System.out.println("Bạn đã không xóa ^^");
			}

		} else {
			System.out.println("Mã xe không tồn tại, xóa thất bại");
		}
	}

	static void timKiem(DanhSachXe dsXe) {
		Scanner sc = new Scanner(System.in);
		String maXe;
		int viTri;
		System.out.println("Nhập mã xe: ");
		maXe = sc.nextLine();
		viTri = dsXe.timKiem(maXe);
		if (viTri == -1) {
			System.out.println("Mã xe này không tồn tại");
		}
		System.out.println("Vị trí:" + viTri);
	}

	static void xuatDanhSach(ThongTinDangKyXe dSXe[], int soLuong) {
		for (int i = 0; i < soLuong; i++) {
			System.out.println(dSXe[i]);
		}
		System.out.println("\n\n\n");
	}

	static void sua(DanhSachXe dsXe) {
		Scanner scanner = new Scanner(System.in);
		String maXe;
		System.out.println("Nhập mã xe: ");
		maXe = scanner.nextLine();
		int vt = dsXe.timKiem(maXe);
		ThongTinDangKyXe xes = dsXe.getDanhSachXe()[vt];
		if (xes == null) {
			System.out.println("Mã xe này không tồn tại");
		} else {
			System.out.println("Thông tin xe trước khi sửa\n" + xes);
			int luaChonSua = -1;
			do {
				menuSua();
				System.out.println("Mời nhập lựa chọn");
				luaChonSua = scanner.nextInt();
				scanner.nextLine();
				switch (luaChonSua) {
				case 1:
					System.out.println("Nhập tên chủ xe: ");
					xes.setChuxe(scanner.nextLine());
					break;
				case 2:
					System.out.println("Nhập loại xe: ");
					xes.setLoaixeString(scanner.nextLine());
					break;
				case 3:
					System.out.println("Nhập dung tích xe: ");
					xes.setDungtich(scanner.nextInt());
					break;
				case 4:
					System.out.println("Nhập trị giá xe: ");
					xes.setTrigiaxe(scanner.nextDouble());
					break;
				default:
					dsXe.suaThongTin(xes, vt);
					System.out.println("Trở về menu chính!!");
					break;
				}
			} while (luaChonSua < 5);
		}

	}

	public static void main(String[] args) {
		try {
			int chon;
			ThongTinDangKyXe xe = new ThongTinDangKyXe();
			DanhSachXe dsXe = new DanhSachXe(3);
			do {
				Menu();
				System.out.println("-Nhập lựa chọn: ");
				chon = scanner.nextInt();
				switch (chon) {
				case 1:
					nhapCung(dsXe);
					break;
				case 2:
					ThongTinDangKyXe xe1 = them();
					if(xe1 !=null)
					{
						dsXe.themXe(xe);
						System.out.println("Thêm thành công");
					}else {
						System.out.println("Thêm thất bại");
					}
					break;
				case 3: {
					xoa(dsXe);
					break;
				}
				case 4:
					sua(dsXe);
					break;
				case 5:
					timKiem(dsXe);
					break;
				case 6:
					System.out.println(Header());
					System.out.println(
							"====================================================================================================");
					xuatDanhSach(dsXe.getDanhSachXe(), dsXe.soLuongXeHT);
					break;
				default:
					System.out.println("Cảm ơn bạn đã sử dụng chương trình!!");
					System.exit(0);
				}
			} while (chon < 7);
		} catch (ArithmeticException e1) {
			System.out.println("Không được chia cho không" + e1.getMessage());
		} catch (ArrayIndexOutOfBoundsException e2) {
			System.out.println("Lỗi mảng" + e2.getMessage());
		} catch (Exception e) {
			System.out.println("Lỗi không xác định" + e.getMessage());
		}

	}
}
