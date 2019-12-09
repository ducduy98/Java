package devpro;

import java.util.Scanner;

public class main {
	public static void main(String[] args) {
		//Các nguyên lí của Hướng đối tượng trong Java
		//JAVA-OOP( OBJECT-ORIENTED PROGRAMMING)
		//I: Tính đóng gói-Encapsulation
		//là tính chất cho phép 1 đối tượng che giấu đi các thông tin cài đặt bên trong nó
		//các thông tin :  các dữ liệu chứa trogn properties và các methods
		//thể hiện thông qua các từ khóa mô tả phạm vi truy cập( access modifier) 
		//public , protected, private
		//Quy tắc khi thực hiện đóng gói:
		//các properties thường đặt private
		//các hàm(methods) thường đặt public
		//việc đưa dlieu vào và ra khỏi đối tượng sẽ thông qua các hàm get-set
		SinhVien sv=new SinhVien("NVA", "HD", 21);
		sv.setTen("NVB");
		String name=sv.getTen();
		
		//private properties và geter: cho đối tượng quyền tự chủ vs dl của nó.
		
		//-che giấu: gói kín lại
		//-gom lại 1 chỗ: gói lại thành 1 bó
		
		//II: Tính kế thừa:-Inheritance
		//là tính chất cho phép 1 class có thể sd lại các khuôn mẫu thiết kế của class mà ko cần viết lại
		//thực hiện thông qua từ khóa extend 
		
		//VD: class SinhVienDH
		SinhVienDH svdh=new SinhVienDH("Nguyễn văn AN", "HP", 22, "SV001", "an2305@gmail.com");
		
		//đối tượng svdh có thể gọi các hàm của class SinhVien bởi vì các hàm này được thừa kế từ clsaa SinhVien xuống cho class SinhVienDH
		svdh.getTen();
		svdh.getTuoi();
		svdh.getDiaChi();
		
		//các thành phần có thể trực tiếp sd ở class con
		//+các thành phần public
		//+các thành phần protected
		//+các thành phần default 
		
		//tác dụng của kế thừa: giúp sd lại code
		//tránh viết mã nhiều lần
		//tạo ra các hệ thống class như 1 cây phả hệ có quan hệ cha con
		//giúp tổ chức code chặt chẽ và rõ ràng hơn
		
		//+ Ghi đè method của lớp cha
		//là việc viết lại 1 method đã được thừa hưởng từ lớp cha
		//Tác dụng: giúp biến đổi các method của lớp cha cho phù hợp vs mục đích sd của lớp con
		//khi ghi đè nên đặt annotation
		//@Override
		svdh.showInfo();
		
		//ngăn chặn ghi đè ở lớp con;
		//các method mà muốn chặn ghi đè thì dặt từ khóa final ỏ đằng trước

		//Giúp duy trì sự toàn vẹn của method khi thừa kế 
		//+chặn kế thừa: (ko cho phép 1 class có class con)
		//thực hiện : đặt từ khóa final ở trước khai báo class
		
		//các class luôn mặc định thừa kế class Objects
		
		//Mối quan hệ: IS- A
		SinhVien svdh2= new SinhVienDH("ANh", "HN", 22, "SV002", "anh@gmail.com");
		//ten kiểu là class cha , nhưng có thể sd constructor của class con
		
		
		//III:TÍNH ĐA HÌNH: -- Polymorphism 
		//khi một tác vụ nào đó, có thể được thực hiện theo nhiều cách khác nhau thì gọi là đa hình
		//da hình là các hình thái khác nhau của cùng 1 đối tượng thể hiện ra trong các hoàn cảnh khác nhau
		// một lời gọi hàm có thể thực hiện nhiều nhiệm vụ khác nhau
		
		//có 2 loại đa hình: 
		//+đa hình lúc biên dịch ( compile time polymorphism - đa hình lúc biên dịch
		//+đa hình lúc chạy( run time polymorphism)
		
		
		//1.compile time polymorphism
		//thể hiện thông qua việc nạp chồng phương thức
		//method overloading
		
		//method overloading : là việc viết lại 1 phương thức có cùng tên , nhưng khác ds tham số truyền vào
		//sự khác biệt của ds tham số thể hiện ở: 
		//kiểu của tham số
		//số lượng tham số
		//thứ tự của các tham số  khác kiểu
		
		//ví dụ nạp chồng phương thức setTuoi() của class SinhVien
		//nạp chồng phương thức sẽ tại ra 1 họ các phương thức có cùng mục đích nhưng có cách truyền tham số khác nhau
		//việc này tạo ra 1 phowng thức có phổ đáp ứng rộng và có sự linh hoạt trong việc sd
		svdh2.setTuoi("21");			//có 1 phương thức settuoi
		svdh2.setTuoi(21, true);		//đáp ứng được nhiều cách truyền tham số 
		svdh2.setTuoi(22);				//khác nhau
		
		
		//2.đa hình lúc chạy( run time polymorphism)
		//thể hiện thông qua việc ghi đè phương thức ở lớp con
		//dùng 1 lời gọi duy nhất nhưng có thể gọi tới nhiều phương thức khác nhau
		//ví dụ: tạo ra 2 phương thức showInfo Override ở 2 class con
		//SinhVienSH, SinhVienCD
		
		
		//Đa hình : lời gọi phuqong thức showInfo trong hàm displayInfo sẽ gọi tới 2 hàm displayInfo khác nhau 
		//ở 2 class con khác nhau, tùy thuộc vào đối tượng truyền vào
		
		//ru time đa hình giúp viết các phương thức tổng quát
		//(displayInfo) mà có thể chạy được vs nhiều các đối tượng con khác nhau
		SinhVienCD svcd=new SinhVienCD("cao đẳng" , "hn", 22, 3);
//		displayInfo(svcd);
//		displayInfo(svdh);
		System.out.println("Moi ban chon ");
		int choose= new Scanner(System.in).nextInt();
		if(choose>0) {
			displayInfo(svcd);
		}else {
			displayInfo(svdh);
		}
		
		SinhVien sv2 = new SinhVien("Nguyen Van Hai", "hN", 22);
		displayInfo(sv2);
		
		
		// IV. Tính trừu tượng - Abstraction
		// là tính chất cho phép thiết kế các class mà không cần 
		// chỉ rõ toàn bộ các thông tin thiết kế
		
		// trong class trừu tượng có thể chứa các phương thức trừu tượng
		// là các phương thức không có phần thân, 
		// chỉ có khai báo prototype
		
		// thể hiện: đặt từ khóa abstracts trong khai báo class
		
		// class trừu tượng không thể trực tiếp tạo ra đối tượng được
		// nó chỉ dùng để làm class cha cho các class khác
		// khi các class con mà kế thừa class trừu tượng thì class con đó
		// có nhiệm vụ phải override các phương thức trừu tượng mà class 
		// cha đưa xuống (bắt buộc)
		
		// nếu không thì class con lại bắt buộc phải trở thành trừu tượng
		
		// sự khác biệt giữa class trừu tượng với class thường: 
		// chỉ có class trừu tượng mới chứa được phương thức trừu tượng
		
		Square aSquare = new Square(5);
		Circle aCircle= new Circle(3);
		
		float sq = getArea(aSquare);
		float cir = getArea(aCircle);
		
		// class trừu tượng giúp tạo ra các bộ khung method để các class
		// con tuân theo
		// và do đó có thể tạo ra các hàm tổng quát mà có thể làm 
		// việc được với tất cả các đối tượng của các class con đó
		// vd: hàm getArea
	}
	public static void displayInfo(SinhVien sv) {
		sv.showInfo();//một lới gọi duy nhất
	}
	public static float getArea(Shape s) {
		return s.tinhDienTich();
	}
}
