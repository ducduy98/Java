package Baitap;

public class BaoVe extends Employee{
	private float phuCap;
	private int ngayCong;
	public BaoVe(String ten, int tuoi, String diaChi, String maNV, String soDT, float luongCB,float phuCap,int ngayCong) {
		super(ten, tuoi, diaChi, maNV, soDT, luongCB);
		this.phuCap=phuCap;
		this.ngayCong=ngayCong;
	}
	public float getPhuCap() {
		return phuCap;
	}
	public void setPhuCap(float phuCap) {
		this.phuCap = phuCap;
	}
	public int getNgayCong() {
		return ngayCong;
	}
	public void setNgayCong(int ngayCong) {
		this.ngayCong = ngayCong;
	}

	@Override
	public void display() {
		super.display();
		System.out.println("Phụ cấp: "+phuCap);
		System.out.println("Ngày công: "+ngayCong);
	}
	

}
