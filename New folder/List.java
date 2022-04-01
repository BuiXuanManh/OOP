package taiKhoanNganHang;

public class List {
	private Acc a[];
	public int sl=0;
	public List(int so) {
		a=new Acc[so];
	}
	public Acc[] getlist() {
		return a;
	}
	public void TKTM() {
		Acc temp[]= new Acc[a.length*2];
		for(int i=0; i<a.length;i++) {
			temp[i]= a[i];
		}
		a= temp;
	}
	public int tim(int ma) {
		for(int i=0; i<sl;i++) {
			if(ma==a[i].getMaAcc()) return i;
		}
		return -1;
	}
	public void them(Acc a1 ) throws Exception {
		if(tim(a1.getMaAcc())==-1) {
			if(sl==a.length) TKTM();
			a[sl]= a1;
			sl++;
		}
	}
	public void xoa(int ma) throws Exception {
		int t=tim(ma);
		if(t==-1) throw new Exception("khong tim thay");
		for(int i=t; i<sl;i++) {
			a[i]=a[i+1];
			sl--;
		}
	}
	public void xep() {
		Acc temp= a[0];
		for(int i=0;i<sl;i++)
		for(int j=i;j<sl;j++){
			if(a[i].getMaAcc()>a[j].getMaAcc()) {
				temp= a[i];
				a[i]=a[j];
				a[j]=temp;
			} 	
		}
	}
	public void xepten() {
		Acc temp= a[0];
		for(int i=0;i<sl;i++)
		for(int j=i;j<sl;j++){
			if(a[i].getTenAcc().compareTo(a[j].getTenAcc())>0) {
				temp= a[i];
				a[i]=a[j];
				a[j]=temp;
			} 	
		}
	}
}
