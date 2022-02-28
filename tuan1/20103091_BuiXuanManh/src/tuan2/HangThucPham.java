package tuan2;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;

public class HangThucPham {
	private String  tenHang;
	private int maHang;
	private	Date ngaySx,ngayHh;
	private double donGia;
	public int getMaHang() {
		return maHang;
	}
	public void setNgaySx(Date ngaySx) {
        this.ngaySx = ngaySx;
    }
	public void setNgayHh(Date ngayHh) {
        this.ngayHh = ngayHh;
    }
	public void setMaHang(int maHang) {
			this.maHang = maHang;
	}
	public String getTenHang() {
		return tenHang;
	}
	public void setTenHang(String tenHang) {
		if (tenHang!="") {
			this.tenHang = tenHang;
		} else {
			this.tenHang= "xxx";
		}	
	}
	public Date getNgaySx() {
		return ngaySx;
	}
	public void setNgaySx(int year, int month, int day) {
		Calendar c = Calendar.getInstance();
        c.set(year, month - 1 , day);
        this.ngaySx = c.getTime();
	}
	public Date getNgayHh() {
		return ngayHh;
	}
	public void setNgayHh(int year, int month, int day) {
		Calendar c = Calendar.getInstance();
        c.set(year, month - 1, day);
        this.ngayHh =  c.getTime();
	}
	public double getDonGia() {
		return donGia;
	}
	public void setDonGia(double donGia) {
		this.donGia = donGia;
	}
	public boolean kiemTraTenHang(boolean k) {
        if (this.tenHang == "" || this.tenHang.isEmpty()) {
            System.out.println("Tên hàng không được để trống : ");
        } else {
            k = false;
        }
        return k;
    }
	public boolean kiemTraNgay(boolean t) {
        if (this.getNgaySx().compareTo(this.getNgayHh()) < 0) {
            t = false;
        } else {
            System.out.println("Ngày hết hạn không được nhỏ hơn ngày sản xuất : ");
        }
        return t;
    }
	public HangThucPham() {}
	public HangThucPham(int maHang, String tenHang, Date ngaySx, Date ngayHh, double donGia) {
		this.maHang=maHang;
		this.tenHang=tenHang;
		this.ngaySx=ngaySx;
		this.ngayHh=ngayHh;
		this.donGia=donGia;
	}
	public void kiemTraHSD() {
        Date today = new Date();
        today.getTime();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        String st = simpleDateFormat.format(today);
        if (this.getNgayHh().compareTo(today) < 0) {
            System.out.println("Hôm nay là ngày " + st + ", hàng hóa đã hết hạn ");
        } else {
            System.out.println("Hôm nay là ngày " + st + ", hàng hóa vẫn còn hạn ");
        }
    }
	public String toString() {
	DecimalFormat df = new DecimalFormat("#,##0.00");
	String str = df.format(donGia);
	SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
    String str1 = simpleDateFormat.format(ngaySx);
    String str2 = simpleDateFormat.format(ngayHh);
    return "Thong tin ve hang thuc pham: " +
    "Mã hàng : " + maHang +
    "\nTên hàng : " + tenHang +
    "\nĐơn giá : " + str +
    "\nNgày sản xuất : " + str1 +
    "\nHạn sử dụng : " + str2
    ;
}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        HangThucPham tp = new HangThucPham();
        boolean kt = true;
        boolean th = true;
        System.out.println("Nhập mã hàng : ");
        tp.setMaHang(scanner.nextInt());
        scanner.nextLine();
        do {
            System.out.println("Nhập tên hàng : ");
            tp.setTenHang(scanner.nextLine());
        } while (tp.kiemTraTenHang(kt));
        System.out.println("Nhập đơn giá : ");
        tp.setDonGia(scanner.nextDouble());
        do {
            System.out.println("Nhập năm,tháng,ngày sản xuất : ");
            tp.setNgaySx(scanner.nextInt(), scanner.nextInt(), scanner.nextInt());
            System.out.println("nhập năm,tháng,ngày hết hạn : ");
            tp.setNgayHh(scanner.nextInt(), scanner.nextInt(), scanner.nextInt());
        } while (tp.kiemTraNgay(th));
        System.out.println(tp);
        tp.kiemTraHSD();
    }
}
