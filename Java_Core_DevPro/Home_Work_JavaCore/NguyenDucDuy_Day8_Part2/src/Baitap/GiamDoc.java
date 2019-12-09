package Baitap;
	
public class GiamDoc extends Person{
	private String SoDT;
	private String email;
	public GiamDoc(String ten, int tuoi, String diaChi,String soDT,String email) {
		super(ten, tuoi, diaChi);
		this.SoDT=soDT;
		this.email=email;
	}
	
	public String getSoDT() {
		return SoDT;
	}
	public void setSoDT(String soDT) {
		SoDT = soDT;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public void display() {
		
		super.showInfo();
		System.out.println("Số điện thoại: "+SoDT);
		System.out.println("Email: "+email);
	}
	
}
