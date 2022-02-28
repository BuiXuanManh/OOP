package tuan2;
import java.util.Locale;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Locale;
public class Account {
	private String tenTK;
	private String soTK;
	private double tienTK;
	private final double LAISUAT = 0.035;
	private final double PHIRUT = 2000;
	
	public String getTenTK() {
		return tenTK;
	}
	public void setTenTK(String tenTK) {
		if (tenTK!="") {
			this.tenTK = tenTK;
		} else {
			System.out.println("loi");
		}
	}
	public String getSoTK() {
		return soTK;
	}
	public void setSoTK(String soTK) {
		if (soTK!="") {
			this.soTK = soTK;
		} else {
			System.out.println("loi");
		}
	}
	public double getTienTK() {
		return tienTK;
	}
	public void setTienTK(double tienTK) {
		if (tienTK>0) {
			this.tienTK = tienTK;
		} else {
			System.out.println("loi");
		}
	}
	@Override
	public java.lang.String toString() {
		Locale localeVN = new Locale("vi", "VN");
		NumberFormat currencyVN = NumberFormat.getCurrencyInstance(localeVN);
		String s="";
		s=s+s.format("|%10s| %10s | %12s ", getTenTK(),getSoTK(),currencyVN.format(getTienTK()));
		return s;
	}
	public Account() {}
	public Account(String ten, String so, double tien) {
		this.tenTK=ten;
		this.soTK=so;
		this.tienTK=tien;
	}
	public Account(String ten, String so) {
		this.tenTK=ten;
		this.soTK=so;
		this.tienTK=50000;
	}
	public double rutTien(Account ac1,double tienRut) {
		if (tienRut>0 && ac1.getTienTK()-(tienRut+PHIRUT)>50000) {
			ac1.setTienTK(ac1.getTienTK()-(tienRut+PHIRUT));
		} else {
			System.out.println("so du khong the nho hon 50000");
		}
		return tienRut;
	}
	public boolean napTien(Account ac2, double tienNap) {
		if (tienNap>0 && ac2!=null) {
			ac2.setTienTK(ac2.getTienTK()+tienNap);
			return true;
		} else {
			return false;
		}
	}
	public void tienLai(Account ac) {
		ac.setTienTK(ac.getTienTK() + (ac.getTienTK() * LAISUAT)) ;
	}
	public boolean chuyenTien(Account ac1, Account ac2, double tien) {
		if (ac2.napTien(ac2, ac1.rutTien(ac1, tien)))return true;
		else return false;
	}
	public static void main(String[] args) {
		Account ac1 = new Account("72354","Ted Murphy",  100000 );
		Account ac2 = new Account("69713","Jane Smith",  40000);
		Account ac3 = new Account("93757","Edward Demsey",  700000);
		ac1.napTien(ac1,25000);
		ac2.napTien(ac2,50000);
		ac2.rutTien(ac2, 43000);
		ac3.tienLai(ac3);
		System.out.println(ac1);
		System.out.println(ac2);
		System.out.println(ac3);
		ac2.chuyenTien(ac2, ac1, 50000);
		System.out.println(ac1);
		System.out.println(ac2);
}
	private static void fflush(Object stdin) {
		// TODO Auto-generated method stub
		
	}
}
