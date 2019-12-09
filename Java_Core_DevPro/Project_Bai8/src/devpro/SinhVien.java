package devpro;

public class SinhVien {
	private String ten,diaChi;
	private int tuoi;
	//public int tuoi;
	//
	public SinhVien(String ten, String diaChi, int tuoi) {
		super();
		this.ten = ten;
		this.diaChi = diaChi;
		this.tuoi = tuoi;
	}
	public final String getTen() {
		return ten;
	}
	public void setTen(String ten) {
		this.ten = ten;
	}
	public String getDiaChi() {
		return diaChi;
	}
	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}
	public int getTuoi() {
		return tuoi;
	}
	public void setTuoi(int tuoi) {
		this.tuoi = tuoi;
	}
	//nạp chồng khác tên kiểu dl
	public void setTuoi(String t) {
		this.tuoi = Integer.parseInt(t);
	}
	//nạp chồng khác nhau về số lượng tham số
	public void setTuoi(int t,boolean check) {
		if (check) {
			if (t<0) return;
		}
		this.tuoi = t;
	}
	//nạp chồng khác về thứ tự tham số các kiểu
	public void setTuoi(boolean check,int t) {
		if (check) {
			if (t<0) return;
		}
		this.tuoi = t;
	}
	public void showInfo() {
		System.out.println("Tên: "+ten);
		System.out.println("Tuổi: "+tuoi);
		System.out.println("Địa chỉ: "+diaChi);
	}
}
