package tuan3;

public class ListCD {
	public CD[]ls;
	public int sl;
	public ListCD(int n) {
		ls= new CD[n];
		sl=0;
	}
	public CD[] getHet() {
		return ls;
	}
	public void TangKT() {
		CD temp[] = new CD[ls.length * 2];
		for (int i = 0; i < ls.length; i++) {
			temp[i] = ls[i];
		}
		ls = temp;
	}
	public void ThemCD(CD c) {
		for(int i=0;i<ls.length;i++) {
		if(c.getMaCd()>ls[i].getMaCd()) ;
		else {
			if (sl == ls.length) {
				TangKT();}
			ls[sl] = c;
			sl++;
		}	
	}
	}
	public void sapxep() {
		for(int i=0; i < sl;i++)
			for(int j=0; j<sl;j++ ) {
				if(ls[i].getMaCd()<ls[j].getMaCd()){
					CD temp = ls[i];
					ls[i]=ls[j];
					ls[j]=temp;
				}
			}
	}
}
