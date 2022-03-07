package tuan1;

public class DanhSachXe {
	ThongTinDangKyXe dsXe[];
	public int soLuongXeHT = 0;

	public DanhSachXe(int soLuongXe) {
		dsXe = new ThongTinDangKyXe[soLuongXe];
	}
	public void tangKichThuocMang() {
		ThongTinDangKyXe tempXe[] = new ThongTinDangKyXe[dsXe.length * 2];
		for (int i = 0; i < dsXe.length; i++) {
			tempXe[i] = dsXe[i];
		}
		dsXe = tempXe;
	}

	public void xoa(int getIndex) {
		for (int i = getIndex; i < dsXe.length - 1; i++) {
			dsXe[i] = dsXe[i + 1];
		}
	}

	public boolean themXe(ThongTinDangKyXe xe) {
		if (soLuongXeHT == dsXe.length)
			tangKichThuocMang();

		if (timKiem(xe.getMaXe()) != -1) {
			return false;
		} else {
			dsXe[soLuongXeHT] = xe;
			soLuongXeHT++;
			return true;
		}
	}

	public int timKiem(String xe) {
		for (int i = 0; i < soLuongXeHT; i++) {
			if (xe.equals(dsXe[i].getMaXe()))
				return i;
		}
		return -1;
	}

	public boolean xoaXe(String xe) {
		int vt = timKiem(xe);
		if (vt == -1)
			return false;
		else
			xoa(vt);
		return true;
	}

	public void suaThongTin(ThongTinDangKyXe xe, int vt) {
		dsXe[vt] = xe;
	}

	public ThongTinDangKyXe[] getDanhSachXe() {
		return dsXe;
	}
}
