package tuan1;
import java.util.Calendar;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Scanner;

public class textHangTP {
	static HangThucPham htp[];
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n=0;
		boolean flag = true;
        do {
            System.out.println("Bạn chọn làm gì: ");
            System.out.println("1.Nhập them Hang Thuc Pham\n"
                    + "2.Xuất danh sách Hang Thuc Pham\n" + "3.Kiem tra HSD\n");
            int b=sc.nextInt();
            switch (b) {
            case 1:{
            	System.out.println("nhap so luong Hang thuc pham");
            	n= sc.nextInt();
            	htp= new HangThucPham[n];
            	for(int i=0; i<n;i++) {
            		htp[i]= new HangThucPham();
            		htp[i].nhapTP(htp[i]);
            	}
            }
            break;
            case 2:{
            	for(int i=0; i<n;i++) {
            		System.out.println(htp[i]); 
            	}
            }
            break;
            case 3:{
            	for(int i=0; i<n;i++) {
            		htp[i].kiemTraHSD();
            	}
            }
            break;
            default:
            System.out.println("Bye!!");
            flag = false;
            break;
    }
	}while (flag);   
	}
}
