package devpro;

public class Sinhvien {
	String name;
	int age;
	String phone;
	String address;
	final String PREFIX="SV";//hằng
	
	//instance initializer
	{
		System.out.println("instance initializer run");
		age=0;
		phone="unknow";
		address="unknow";
		name="noname";
	}
	
	//static initializer
	static {
		System.out.println("static initializer run");
		school="unknow";
	}
	static String school="Haui";
	//constructor 
	//---------------------------------------
	
	//---------------------------------------
	public Sinhvien(String name, int age,String phone, String addr) {
		System.out.println("constructor  runn....");
		this.name=name;
		this.age=age;
		this.phone=phone;
		address=addr;
		//gán giá trị cho các biến gobal
	}
	//instance method
	public void showInfo() {
		String info= String.format("Tên: %s, Tuổi: %d, Địa chỉ: %s, Sđt: %s",name,age,address,phone);
		System.out.println(info);
	}
	//static method
	public static void whatSchool() {
		System.out.println(school);
	}
}
