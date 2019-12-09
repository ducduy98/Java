package devpro;

public class SinhVienCD extends SinhVien {
	private int soNamHoc;
	public SinhVienCD(String ten, String diaChi, int tuoi,int namHoc) {
		super(ten, diaChi, tuoi);
		this.soNamHoc=namHoc;
	}
	
	@Override
	public void showInfo() {
		System.out.println("Sinh viên cao đẳng:********** ");
		super.showInfo();
		System.out.println("Số năm học : "+soNamHoc);
	}
}
