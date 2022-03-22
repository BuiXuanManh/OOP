package tuan1;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.chrono.ChronoLocalDate;

public class HangThucPham {
	private String  tenHang;
	private int maHang;
	private LocalDate ngaySx;
	private	LocalDate ngayHh;
	private double donGia;
	public int getMaHang() {
		return maHang;
	}
	public void setNgaySx(LocalDate localDate) {
        this.ngaySx = localDate;
    }
	public void setNgayHh(LocalDate localDate) {
        this.ngayHh = localDate;
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
	public LocalDate getNgaySx() {
		return ngaySx;
	}
	public LocalDate getNgayHh() {
		return ngayHh;
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
	public HangThucPham(int maHang, String tenHang, LocalDate ngaySx, LocalDate ngayHh, double donGia) {
		this.maHang=maHang;
		this.tenHang=tenHang;
		this.ngaySx=ngaySx;
		this.ngayHh=ngayHh;
		this.donGia=donGia;
	}
	@Override
	public String toString() {
		return  " tenHang=" + tenHang + 
				" maHang=" + maHang + ""
			+   " ngaySx=" + ngaySx + 
				" ngayHh=" + ngayHh
			+   " donGia=" + donGia;
	}
	public void kiemTraHSD() {
        if (this.getNgayHh().compareTo(LocalDate.now()) < 0) {
            System.out.println("Hôm nay là ngày "+ LocalDate.now()+", hàng hóa đã hết hạn ");
        } else {
            System.out.println("Hôm nay là ngày " +  LocalDate.now() + ", hàng hóa vẫn còn hạn ");
        }
    }
	public void nhapTP(HangThucPham tp){
		Scanner scanner= new Scanner(System.in);
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
            tp.setNgaySx(LocalDate.of(scanner.nextInt(), scanner.nextInt(), scanner.nextInt()));
            System.out.println("nhập năm,tháng,ngày hết hạn : ");
            tp.setNgayHh(LocalDate.of(scanner.nextInt(), scanner.nextInt(), scanner.nextInt()));
        } while (tp.kiemTraNgay(th));
	}
	static void inTP(HangThucPham tp) {
	    System.out.printf("%-10d %-20s %-20s \n", tp.getMaHang(), tp.getTenHang(), tp.getDonGia(),tp.getNgaySx(),tp.getNgayHh());
    }
}
