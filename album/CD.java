package album;

import java.text.NumberFormat;
import java.util.Locale;

public class CD {
	    private String  tuaCd, caSy;
	    private int maCd, sBh;
	    private double giaThanh;
	    public String getTuaCd() {
	        return tuaCd;
	    }
	    public void setTuaCd(String tuaCd) {
	        if (tuaCd!=null) {
	            this.tuaCd = tuaCd;
	        } else {
	            this.tuaCd= "khong xac dinh";
	        }
	    }
	    public String getCaSy() {
	        return caSy;
	    }
	    public void setCaSy(String caSy) {
	        if (caSy!=null) {
	            this.caSy = caSy;
	        } else {
	            this.caSy = "khong xac dinh";
	        }
	        
	    }
	    public int getMaCd() {
	        return maCd;
	    }
	    public void setMaCd(int maCd)  {
	        if (maCd>0) {
	            this.maCd = maCd;
	        } else {
	            System.out.println( "loi ma");
	        }
	    }
	    public int getsBh() {
	        return sBh;
	    }
	    public void setsBh(int sBh) {
	        if (sBh>0) {
	            this.sBh = sBh;
	        } else {
	            System.out.println("loi so bai hat");
	             
	        }
	    }
	    public double getGiaThanh() {
	        return giaThanh;
	    }
	    public void setGiaThanh(double giaThanh) {
	        if (giaThanh>0) {
	            this.giaThanh = giaThanh;
	        } else {
	            System.out.println("loi gia thanh");
	        }
	    }
	    @Override
	    public String toString() {
	        Locale l = new Locale("vi", "VN");
	        NumberFormat currencyEN = NumberFormat.getCurrencyInstance(l);
	        String str1 = currencyEN.format(this.giaThanh);
	        return String.format("%-10d %35s %25s %15d %15s", maCd, tuaCd, caSy,sBh,str1);
	        }
		public CD(int ma,String tua, String cs, int so,double gia ){
		    this.maCd= ma;
		    this.tuaCd= tua;
		    this.caSy= cs;
		    this.sBh= so;
		    this.giaThanh= gia;
		}
		public CD(){}
		}
