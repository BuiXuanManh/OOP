package tuan1;

import java.util.Scanner;

public class DanhSachHCN {
	HinhChuNhat DSHCN[];
	public int soLuongHcnHt = 0;
	public DanhSachHCN(int slhcn) {
		DSHCN = new HinhChuNhat[slhcn];
	}
	public void tangsize(){
		HinhChuNhat t[] = new HinhChuNhat[DSHCN.length*2];
		for (int i = 0; i < DSHCN.length; i++) {
			t[i] = DSHCN[i];
		}
		DSHCN = t;
	}
	public boolean ThemHCN(HinhChuNhat hcn) {
		if (soLuongHcnHt == DSHCN.length)
			tangsize();
		if (timKiem(hcn.getMahcn()) != -1) {
			return false;
		} else {
			DSHCN[soLuongHcnHt] = hcn;
			soLuongHcnHt++;
			return true;
		}
	}
	public int timKiem(String hcn) {
		for (int i = 0; i < soLuongHcnHt; i++) {
			if (hcn.equals(DSHCN[i].getMahcn()))
				return i;
		}
		return -1;
	}
	public HinhChuNhat[] getDanhSachHCN() {
		return DSHCN;
	}
	
}
