package Baitap;

public class  Employee extends Person{
	private String maNV;
	private String soDT;
	private float luongCB;
	public Employee(String ten, int tuoi, String diaChi,String maNV,String soDT,float luongCB) {
		super(ten, tuoi, diaChi);
		this.maNV=maNV;
		this.soDT=soDT;
		this.luongCB=luongCB;
		
	}
	public String getMaNV() {
		return maNV;
	}
	public void setMaNV(String maNV) {
		this.maNV = maNV;
	}
	public String getSoDT() {
		return soDT;
	}
	public void setSoDT(String soDT) {
		this.soDT = soDT;
	}
	public float getLuongCB() {
		return luongCB;
	}
	public void setLuongCB(float luongCB) {
		this.luongCB = luongCB;
	}
	@Override
	public void display() {
		super.showInfo();
		System.out.println("Mã nhân viên: "+maNV);
		System.out.println("Số điện thoại: "+soDT);
		System.out.println("Lương cơ bản: "+luongCB); 
	}

}
