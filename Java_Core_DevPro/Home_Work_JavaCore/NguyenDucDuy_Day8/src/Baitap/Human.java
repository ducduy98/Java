package Baitap;

public class Human {
	private  String ten;
	private int tuoi;
	private String soDT;
	private String diaChi;
	public Human(String ten, int tuoi, String diaChi,String soDT ) {
		super();
		this.ten = ten;
		this.soDT=soDT;
		this.diaChi = diaChi;
		this.tuoi = tuoi;
	}
	
	public String getTen() {
		return ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

	public int getTuoi() {
		return tuoi;
	}

	public void setTuoi(int tuoi) {
		this.tuoi = tuoi;
	}

	public String getSoDT() {
		return soDT;
	}

	public void setSoDT(String soDT) {
		this.soDT = soDT;
	}

	public String getDiaChi() {
		return diaChi;
	}

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}

	public void showInfo() {
		System.out.println("====================================");
		System.out.println("Thông tin:");
		System.out.println("Tên: "+this.ten);
		System.out.println("Tuổi: "+this.tuoi);
		System.out.println("Địa chỉ: "+this.diaChi);
		System.out.println("Số điện thoại: "+this.soDT);
	}
}
