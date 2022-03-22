package  tuan3;

import java.util.Scanner;

public class mainCD {
    static Scanner sc= new Scanner(System.in);
    static void themCd(CD cd) {
        System.out.println("nhap ma cd");
        cd.setMaCd(sc.nextInt());
        sc.nextLine();
        System.out.println("nhap tua cd");
        cd.setTuaCd(sc.nextLine());
        System.out.println("nhap ca sy");
        cd.setCaSy(sc.nextLine());
        System.out.println("nhap so bai hat");
        cd.setsBh(sc.nextInt());
        System.out.println("nhap gia thanh");
        cd.setGiaThanh(sc.nextDouble());
    }	
    public static void main(String[] args)  {
        CD alb[] = null;
        int a, n = 0;
        boolean flag = true;
        do {
            System.out.println("Ban chon lam gi?");
            System.out.println("1.Nhap them cd \n" +
                    "2.Xuat danh sach\n" + "3.Tinh tong gia thanh \n" + "4.Tong so luong album \n" +
                    "5.Sap xep giam dan theo gia thanh\n"+"6.Sap xep tang dan theo tua cd\n"+"Nhap so khac de thoat");
            a = sc.nextInt();
            switch (a) {
                case 1:
                    System.out.println("Nhap so luong cd them : ");
                    n = sc.nextInt();
                    alb = new CD[n];
                    for (int i = 0; i < n; i++) {
                        alb[i] = new CD();
                        themCd(alb[i]);
                    }
                    break;
                case 2:
                    System.out.printf("%-10s %-20s %-20s %-10s %-20s \n", "ma cd", "Tua CD", "ten ca sy", "So bai hat", "gia thanh");
                    for (int i = 0; i < n; i++) {
                        alb[i].hienThiAlbum();
                    }
                    break;
                case 3:
                    int tong = 0;
                    for (int i = 0; i < n; i++) {
                        tong += alb[i].getGiaThanh();
                    }
                    System.out.println("" +
                            "Tong gia thanh la : " + tong);
                    break;
                case 4:
                    System.out.println("Tong so luong cd : " + n);
                    break;
                case 5:
                    CD temp = alb[0];
                    for (int i = 0; i < n - 1; i++) {
                        for (int j = i + 1; j < n; j++) {
                            if (alb[i].getGiaThanh() < alb[j].getGiaThanh()) {
                                temp = alb[j];
                                alb[j] = alb[i];
                                alb[i] = temp;
                            }
                        }
                    }
                    System.out.println("Sap xep thanh cong");
                    break;
                case 6:
                    temp = alb[0];
                    for (int i = 0; i < n - 1; i++) {
                        for (int j = i + 1; j < n; j++) {
                            if (alb[i].getTuaCd().compareTo(alb[j].getTuaCd())>0) {
                                temp = alb[j];
                                alb[j] = alb[i];
                                alb[i] = temp;
                            }
                        }
                    }
                    System.out.println("Sap xep thanh cong");
                    break;
                default:
                    System.out.println("Goodbye");
                    flag = false;
                    break;
            }
        }while (flag) ;
    }
}