package tuan1;

public class ThongTinDangKyXe {
	private String chuxe, loaixe, maXe;
	private double trigiaxe;
	private int dungtich;
	static final double THUEBE = 0.01;
	static final double THUETB = 0.03;
	static final double THUELON = 0.05;

	public ThongTinDangKyXe() {
		super();
	}

	public ThongTinDangKyXe(String maXe, String chuxe, String loaixeString, double trigiaxe, int dungtich) {
		super();
		this.maXe = maXe;
		this.chuxe = chuxe;
		this.loaixe = loaixeString;
		this.trigiaxe = trigiaxe;
		this.dungtich = dungtich;
	}

	public String getChuxe() {
		return chuxe;
	}

	public void setChuxe(String chuxe) {
		this.chuxe = chuxe;
	}

	public String getLoaixeString() {
		return loaixe;
	}

	public void setLoaixeString(String loaixeString) {
		this.loaixe = loaixeString;
	}

	public double getTrigiaxe() {
		return trigiaxe;
	}

	public void setTrigiaxe(double trigiaxe) {
		if (trigiaxe >= 0)
			this.trigiaxe = trigiaxe;
	}

	public int getDungtich() {
		return dungtich;
	}

	public String getMaXe() {
		return maXe;
	}

	public void setMaXe(String maXe) throws Exception {
		if (!maXe.equals(""))
			this.maXe = maXe;
		else
			throw new Exception("Mã không được để trống");
	}

	public void setDungtich(int dungtich) {
		if (dungtich >= 0)
			this.dungtich = dungtich;
	}

	public double thue() {
		if (dungtich < 100)
			return THUEBE * trigiaxe;
		if (dungtich > 100 && dungtich < 200)
			return THUETB * trigiaxe;

		return THUELON * trigiaxe;
	}

	public String toString() {
		return String.format("%-10s %-20s %-15s %9d %23.2f %18.2f", maXe, chuxe, loaixe, dungtich, trigiaxe, thue());
	}
}
