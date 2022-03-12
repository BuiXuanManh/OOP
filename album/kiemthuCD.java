package album;

import java.util.Scanner;
public class kiemthuCD {
	static Scanner scanner = new Scanner(System.in);
	static ListCD doiTuong;
	static String Header() {
		return String.format("%-10s %32s %13s %10s %20s", "Mã cd", "Tựa cd", "\tSa sỹ","\t\t\tSố bài hát","giá thành");
	}	
	static void nhapCung() throws Exception {
		CD c1 = new CD(1111,"mùa thu","Nguyen Xuan Phuc",100000,700000);
		doiTuong.them(c1);
		CD c2 = new CD(2222,"mùa hè","Nguyen Phu Trong",335000,800000);
		doiTuong.them(c2);
		CD c3 = new CD(3333,"mùa xuân","Nguyen Van Bay",220000,600000);
		doiTuong.them(c3);
	}
	static CD nhapMem() throws Exception {
			Scanner scn = new Scanner(System.in);
			int ma, sbh;
			String Ten, tua;
			double gia;
			CD c = new CD();
			System.out.println("Nhập mã tài khoản: ");
			ma = scn.nextInt();
			scn.nextLine();
			if(doiTuong.timKiemMa(ma) !=null) {
				System.out.println("Nhap tua Cd");
				tua= scn.nextLine();
				System.out.println("Nhập ten ca sy cua CD: ");
				Ten = scn.nextLine();
				System.out.println("Nhap so bai hat");
				sbh = scn.nextInt();
				System.out.println("Nhập giá thành: ");
				gia = scn.nextDouble();
				c = new CD(ma, tua,Ten,sbh, gia);
				return c;
			}
			else 
				return null;
		}
	static void xoaCD() throws Exception {
		Scanner scn = new Scanner(System.in);
		int ma;
		System.out.println("Nhập mã tài khoản cần xóa: ");
		ma = scn.nextInt();
		if(ma != -1) {
			System.out.println("Bạn có chắc chắn muốn xóa không [y/n]");
			String acpString = new Scanner(System.in).nextLine();
			if (acpString.equals("y") || acpString.equals("Y")) {
				doiTuong.xoa(ma);
				System.out.println("Xóa thành công");
			} else {
				System.out.println("Bạn đã không xóa ^^");
			}
		} 
		else {
			System.out.println("CD không tồn tại, xóa thất bại");
			}
	}
	
	static void suaThongTinCD() throws Exception {
		Scanner scn = new Scanner(System.in);
		int ma;
		System.out.println("Nhập mã tài khoản cần sửa: ");
		ma = scn.nextInt();
		int diaChi = doiTuong.timKiem(ma);
		CD c = doiTuong.getHetDanhSach()[diaChi];
		if (c == null) {
			System.out.println("Mã tài khoản không tồn tại");
		} else {
			System.out.println("Thông tin tài khoản trước khi sửa\n" + c);
			int luaChonSua = -1;
			do {
				menuSua();
				System.out.println("Mời nhập lựa chọn");
				luaChonSua = scanner.nextInt();
				scanner.nextLine();
				switch (luaChonSua) {
				case 1:
					System.out.println("Nhập mã cd: ");
					c.setTuaCd(scanner.next());
					break;
				case 2:
					System.out.println("Nhập tựa cd: ");
					c.setTuaCd(scanner.next());
					break;
				case 3:
					System.out.println("Nhập tên ca sỹ: ");
					c.setTuaCd(scanner.next());
					break;
				case 4:
					System.out.println("Nhập số bài hát: ");
					c.setTuaCd(scanner.next());
					break;
				case 5:
					System.out.println("Nhập giá thành: ");
					c.setTuaCd(scanner.next());
					break;
				default:
					doiTuong.suaThongTin(c, diaChi);
					System.out.println("Trở về menu chính!!");
					break;
				}
			} while (luaChonSua < 6);
		}
	}
	static void TimCD() throws Exception {
		Scanner scn = new Scanner(System.in);
		int lc=-1;
			do {
				menuTim();
				System.out.println("Mời nhập lựa chọn");
				lc = scanner.nextInt();
				scanner.nextLine();
				CD c= new CD();
				switch (lc) {
				case 1:
					System.out.println("Nhập mã cd: ");			
					c = doiTuong.cd[doiTuong.timKiem(scn.nextInt())];
					System.out.println(c);
					break;
				case 2:
					System.out.println("Nhập tựa cd: ");
					c = doiTuong.cd[doiTuong.timKiemTua(scn.nextLine())];
					System.out.println(c);
					break;
				case 3:
					System.out.println("Nhập tên ca sỹ: ");
					c = doiTuong.cd[doiTuong.timKiemCs(scn.nextLine())];
					System.out.println(c);
					break;
				case 4:
					System.out.println("Nhập số bài hát: ");
					c = doiTuong.getHetDanhSach()[doiTuong.timKiemSbh(scn.nextInt())];
					System.out.println(c);
					break;
				case 5:
					System.out.println("Nhập giá thành: ");
					c = doiTuong.getHetDanhSach()[doiTuong.timKiemGia(scn.nextDouble())];
					System.out.println(c);
					break;
				default:
					System.out.println("Trở về menu chính!!");
					break;
				}
			} while (lc < 6);
	}
	static void Menu() {
		System.out.println("\t**************************************************");
		System.out.println("\t**        Thông Tin Tài Khoản Khách Hàng        **");
		System.out.println("\t*   1. Thêm tài khoản                            *");
		System.out.println("\t*   2. In thông tin tài khoản ra màn hình        *");	
		System.out.println("\t*   3. Tìm                                       *");
		System.out.println("\t*   4. Xóa                                       *");
		System.out.println("\t*   5. Sửa	                                   *");
		System.out.println("\t*  10. Thoát                                     *");
		System.out.println("\t**************************************************");
	}

	static void menuSua() {
		System.out.println("\t*****************************************");
		System.out.println("\t**       Mời nhập thông tin cần sửa    **");
		System.out.println("\t*   1. mã cd          			      *");
		System.out.println("\t*   2. Tựa cd          			      *");
		System.out.println("\t*   3. Tên ca sỹ      		          *");
		System.out.println("\t*   4. số bài hát      		          *");
		System.out.println("\t*   5. Giá thành  		              *");
		System.out.println("\t* Nhập phím bất kì để trở về menu chính *");
		System.out.println("\t*****************************************");
	}
	static void menuTim() {
		System.out.println("\t*****************************************");
		System.out.println("\t**       Mời nhập thông tin cần tìm    **");
//		System.out.println("\t*   1. mã cd          			      *");
		System.out.println("\t*   2. Tựa cd          			      *");
		System.out.println("\t*   3. Tên ca sỹ      		          *");
		System.out.println("\t*   4. số bài hát      		          *");
		System.out.println("\t*   5. Giá thành  		              *");
		System.out.println("\t* Nhập phím bất kì để trở về menu chính *");
		System.out.println("\t*****************************************");
	}
	static void xuatDanhSach() {
		int soLuongThuc = doiTuong.sl;
		CD cd[];
		cd = doiTuong.getHetDanhSach();
		for (int i = 0; i < soLuongThuc; i++) {
			System.out.println(cd[i]);
		}
		System.out.println("\n\n\n");
	}
	
	public static void main(String[] args) {
		try {
			int chon;
			doiTuong = new ListCD(3);
			nhapCung();
			CD c = new CD();
			do {
				Menu();
				System.out.println("Nhập lựa chọn của bạn: ");
				chon = scanner.nextInt();
				switch (chon) {
				case 1:
					c = nhapMem();
					if(c == null)
						System.out.println("bị trùng mã");
					else
						doiTuong.them(c);
					break;
				case 2:
					System.out.println(Header());
					System.out.println("=========================================================================================");
					xuatDanhSach();
					break;
				case 3:
					TimCD();
					break;
				case 4:
					xoaCD();
					break;
				case 5:
					suaThongTinCD();
					break;
				default:
					System.out.println("Cảm ơn quý khách đã sử dụng dịch vụ!!");
					System.exit(0);
				}
			} while (chon != 10);
		} catch (Exception e) {
			System.out.println("" + e.getMessage());
		}
	}
}
