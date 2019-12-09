package Baitap;

public class NvKinhDoanh extends Employee{
	private float doanhSoThang;
	private float thuong;
	public NvKinhDoanh(String ten, int tuoi, String diaChi, String maNV, String soDT, float luongCB,float doanhSoThang,float thuong) {
		super(ten, tuoi, diaChi, maNV, soDT, luongCB);
		this.doanhSoThang=doanhSoThang;
		this.thuong=thuong;
	}
	public float getDoanhSoThang() {
		return doanhSoThang;
	}
	public void setDoanhSoThang(float doanhSoThang) {
		this.doanhSoThang = doanhSoThang;
	}
	public float getThuong() {
		return thuong;
	}
	public void setThuong(float thuong) {
		this.thuong = thuong;
	}
	@Override
	public void display() {
		super.display();
		System.out.println("Doanh số tháng: "+doanhSoThang+"%");
		System.out.println("Thưởng: "+thuong);
	}

}
