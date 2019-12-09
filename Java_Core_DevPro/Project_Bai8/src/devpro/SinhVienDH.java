package devpro;

 public final class SinhVienDH extends SinhVien {
	private String maSV;
	private String email;
	public SinhVienDH(String ten, String diaChi, int tuoi, String maSV, String email) {
		super(ten, diaChi, tuoi);
		this.email=email;
		this.maSV=maSV;
	}
	public String getMaSV() {
		return maSV;
	}
	public void setMaSV(String maSV) {
		this.maSV = maSV;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
//	public void showTuoi() {
//		System.out.println(tuoi);//biến đươc thừa hưởng từ class cha vì được để ở public
//	}
	public void showTen() {
		//ko thể trực tiếp truy cập thành phần private của class cha từ class con==> dùng phương thức get
		System.out.println(this.getTen());
	}
	//sd annotation để check cú pháp
	@Override
	public void showInfo() {
//		System.out.println("Tên: "+getTen());
//		System.out.println("Tuổi: "+getTuoi());
//		System.out.println("Địa chỉ: "+getDiaChi());
		System.out.println("Sinh viên đại học :********** ");
		super.showInfo();//gọi showInfo của lớp cha
		System.out.println("Mã Sv: "+maSV);
		System.out.println("Email: "+email);
	}
	
//	@Override
//	public String getTen() {
//		return super.getTen();    //==>>ko thể ghi đè vì ở lớp cha đã dặt final
//	}
	
}
