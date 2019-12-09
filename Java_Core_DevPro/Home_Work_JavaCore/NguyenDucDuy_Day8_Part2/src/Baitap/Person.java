package Baitap;

public abstract class Person {
	private String ten;
	private int tuoi;
	private String diaChi;

	public Person(String ten, int tuoi, String diaChi) {
		super();
		this.ten = ten;
		this.tuoi = tuoi;
		this.diaChi = diaChi;
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
	public String getDiaChi() {
		return diaChi;
	}
	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}
	
	
	public void showInfo() {
		System.out.println("=============================================");
		System.out.println("Tên: "+ten);
		System.out.println("Tuổi: "+tuoi);
		System.out.println("Địa chỉ: "+diaChi);
	}
	public abstract void display();
}
