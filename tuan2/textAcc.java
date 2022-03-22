package tuan2;

import java.util.Scanner;
public class textAcc {
	static int  n;
	static Account a1[];
    static Scanner sc = new Scanner(System.in);
    public static int timkiem(long ma) {
    	for(int i=0;i<n;i++) {
        	if(a1[i]!=null&&a1[i].getSoTK()==ma) {System.out.println("so tai khoan trung");
        	return i;
        	}}
		return -1;
    }
    static void nhapTK(Account tk,int n) {
        System.out.println("Nhập số tài khoản: ");
        long b=sc.nextLong();
        sc.nextLine();
        if(a1[n]!=null && timkiem(b)>0) System.out.println("so tai khoan trung");
        System.out.println("Nhập tên tài khoản: ");
        tk.setTenTK(sc.nextLine());
        tk.setSoTienTrongTK(50000);
    }
    public static void main(String[] args) {
        int k, b;
        long s, d, c, f;
        boolean flag = true;
        do {
            System.out.println("Bạn chọn làm gì: ");
            System.out.println("1.Nhập thông tin của các khách hàng\n"
                    + "2.Xuất danh sách thông tin của các khách hàng\n" + "3.Nạp tiền\n" + "4.Rút tiền\n"
                    + "5.Đáo hạn\n" + "6.Chuyển khoản\n" + "Số khác để thoát");
            b = sc.nextInt();
            switch (b) {
                case 1:
                    System.out.println("Nhập số lượng khách hàng bạn muốn nhập: ");
                    n = sc.nextInt();
                    a1 = new Account[n];
                    for (int i = 0; i < (n); i++) {
                        System.out.println("Khách hàng số: " + (i+1));
                        a1[i] = new Account();
                        nhapTK(a1[i],n);
                    }
                    break;
                case 2:
                    System.out.printf("%-10s %-20s %-20s\n", "Số TK", "Tên TK", "Số tiền trong TK");
                    for (int i = 0; i < (n); i++) {
                        a1[i].inTK();
                    }
                    break;
                case 3:
                    System.out.println("Nhập số tài khoản khách hàng cần nạp tiền: ");
                    s = sc.nextLong();
                    for (int i = 0; i < n; i++) {
                        d = a1[i].getSoTK();
                        if (s == d) {
                            System.out.println("Bạn chọn tài khoản: " + d);
                            a1[i].napTien();
                        } else {
                            System.out.println("");
                        }
                    }
                    break;
                case 4:
                    System.out.println("Nhập số tài khoản khách hàng cần rút tiền: ");
                    s = sc.nextLong();
                    for (int i = 0; i < n; i++) {
                        d = a1[i].getSoTK();
                        if (s == d) {
                            System.out.println("Bạn chọn tài khoản: " + d);
                            a1[i].rutTien();
                        }
                    }
                    break;
                case 5:
                    System.out.println("Nhập số tài khoản khách hàng cần đáo hạn: ");
                    s = sc.nextLong();
                    for (int i = 0; i < n; i++) {
                        d = a1[i].getSoTK();
                        if (s == d) {
                            System.out.println("Bạn chọn tài khoản: " + d);
                            a1[i].daoHan();
                        } else {
                            System.out.println("");
                        }
                    }
                    break;
                case 6:
                    double chuyen,
                            nhan,
                            tienChuyen;
                    System.out.print("Nhập số tài khoản khách hàng chuyển tiền: ");
                    s = sc.nextLong();
                    System.out.print("Nhập số tài khoản khách hàng nhận tiền: ");
                    c = sc.nextLong();
                    for (int i = 0; i < n; i++) {
                        d = a1[i].getSoTK();
                        if (s == d) {
                            chuyen = a1[i].getSoTienTrongTK();
                            for (int j = 0; j < n; j++) {
                                f = a1[j].getSoTK();
                                if (c == f) {
                                    nhan = a1[j].getSoTienTrongTK();
                                    System.out.println("Nhập số tiền cần chuyển");
                                    tienChuyen = sc.nextDouble();
                                    if (tienChuyen <= chuyen) {
                                        chuyen = chuyen - tienChuyen;
                                        nhan = nhan + tienChuyen;
                                        a1[i].setSoTienTrongTK(chuyen);
                                        a1[j].setSoTienTrongTK(nhan);
                                        System.out.println("Tài khoản số " + d + " vừa chuyển: " + tienChuyen);
                                        System.out.println("Tài khoản số " + f + " vừa nhận: " + tienChuyen);
                                    } else {
                                        System.out.println("Số tiền nhập không hợp lệ!");
                                    }
                                } else {
                                    System.out.println("");
                                }
                            }
                        } else {
                            System.out.println("");
                        }
                    }
                    break;
                case 7:{
                	System.out.println("nhap ma tai khoan can tim");
                	long m = sc.nextLong();
                	for(int i=0;i<(n+3);i++) {
                		if(a1[i].getSoTK()==m ) {
                			a1[i].inTK();                		}
                	}
                }
                break;
                case 8:{
                	System.out.println("nhap ma can xoa");
                	long m = sc.nextLong();
                	for(int i=0;i<(n+3);i++) {
                		if(a1[i].getSoTK()==m ) {
                			a1[i]= a1[i+1]; 
                			n--;
                		}}
                }
                break;
                default:
                    System.out.println("Bye!!");
                    flag = false;
                    break;
            }
        } while (flag);
    }
}