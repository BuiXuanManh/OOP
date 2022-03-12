package album;

public class ListCD {
	public CD cd[];
	public int sl = 0;

	public ListCD(int soLuongKhoiTao) {
		cd = new CD[soLuongKhoiTao];
	}

	public CD[] getHetDanhSach() {
		return cd;
	}

	public void tangKichThuocMang() {
		CD tempAcc[] = new CD[cd.length * 2];
		for (int i = 0; i < cd.length; i++) {
			tempAcc[i] = cd[i];
		}
		cd = tempAcc;
	}

	public void them(CD acc) throws Exception {
		if (timKiem(acc.getMaCd()) == -1) {
			if (sl == cd.length)
				tangKichThuocMang();
			cd[sl] = acc;
			sl++;
		} else
			throw new Exception("Trùng mã");
	}

	public int timKiem(int maAcc) throws Exception {
		for (int i = 0; i < sl; i++) {
			if (maAcc == cd[i].getMaCd())
				return i;
		}
		return -1;
	}

	public CD timKiemMa(int maTim) throws Exception {
		for (int i = 0; i < sl; i++) {
			if (maTim == cd[i].getMaCd())
				;
			return cd[i];
		}
		return null;
	}

	public int timKiemTua(String t) throws Exception {
		for (int i = 0; i < sl; i++) {
			if (t == cd[i].getTuaCd())
				;
			return i;
		}
		return -1;
	}

	public int timKiemCs(String ten) throws Exception {
		for (int i = 0; i < sl; i++) {
			if (ten == cd[i].getCaSy())
				;
			return i;
		}
		return -1;
	}

	public int timKiemSbh(int s) throws Exception {
		for (int i = 0; i < sl; i++) {
			if (s == cd[i].getsBh())
				;
			return i;
		}
		return -1;
	}

	public int timKiemGia(double g) throws Exception {
		for (int i = 0; i < sl; i++) {
			if (g == cd[i].getGiaThanh())
				;
			return i;
		}
		return -1;
	}

	public boolean xoa(int ma) throws Exception {
		int temp = timKiem(ma);
		if (temp == -1)
			return false;
		for (int i = temp; i < sl - 1; i++) {
			cd[i] = cd[i + 1];
		}
		sl--;
		return true;
	}

	public void sua(CD Sua) throws Exception {
		int viTriTimThay = timKiem(Sua.getMaCd());
		if (viTriTimThay != -1)
			cd[viTriTimThay] = Sua;
	}

	public void suaThongTin(CD c, int diaChi) {
		cd[diaChi] = c;
	}

	public CD[] getDanhSach() {
		return cd;
	}
}
