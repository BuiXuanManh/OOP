package tuan2;

public class textAccount {
	public static void main(String[] args) {
		Account ac1 = new Account("12242462342", "Nguyen Van A",1200000 );
		Account ac2 = new Account("232523625","Nguyen Van B", 4000000);
		ac1.chuyenTien(ac1, ac2,50000);
		System.out.println(ac1.getTienTK());
		System.out.println(ac2.getTienTK());
	}
}
