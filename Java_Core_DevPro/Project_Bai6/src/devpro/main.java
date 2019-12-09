package devpro;

import java.util.Calendar;

public class main {
	public static void main(String[] args) {
		Calendar cal=Calendar.getInstance();//single-ton
		
		Sinhvien sv = new Sinhvien("Duy",21,"037474728","HDuong");
//		sv.name="Nguyễn Văn A";//tạo đối tượng
//		sv.age=21;
//		sv.address="HD";
//		sv.phone="62742321133";
		System.out.println(sv.address);
		Sinhvien a= new Sinhvien("an", 22, "029383", "hN");
		
		//CLASS: 2 thành phần chính: 
		//+hàm
		//+các biến global
		//
		//thành phần khác: initializer, hằng số
		
		//constructor -hàm khởi tạo
		//là 1 hàm đặc biệt dùng để tạo dựng đối tượng
		//+tên hàm luôn trùng với tên class
		//+ko có khai báo kiểu trả về
		
		//trong class luôn có sẵn 1 constructor mặc định được trình biên dịch tạo tự động, nếu lập trình viên ko viết constructor
		//constructor mặc định ko có tham số đầu vào
		//constructor mặc định sẽ bị ghi đè bởi constructor của lập trình viên
		//constructor được gọi thông qua từ khóa new
		
		//------ĐỐI TƯỢNG- OBJECT----
		//là 1 biến hoặc hằng được tạo ra từ class(có kiểu là tên class)
		//+là một kiểu dữ liệu có cấu trúc
		//+cấu trúc của đối tượng được quy định trong class của nó
		//
		//Đối tượng là thể hiện của class, class là  bộ khung của đối tượng
		
		//+Instance variables : Biến thể hiện
		//=> là các biến thể hiện nằm trong class
		//+mỗi một đối tượng sẽ giữ 1 bản copy của các biến thể hiện có trong class
		//truy cập các biến thể hiện thông qua tên đối tượng và dấu chấm
		//note: biến thể hiện luôn đi kèm với đối tượng
		//
		
		//+Stactic variables: biến tĩnh, biến class
		//=> được khai báo trong thân class, có từ khóa static đứng trước tên kiểu trong khai báo
		//+biến static luôn đi liền vs class, truy cập thông qua tên class, chỉ có 1 bản duy nhất, kể cả khi truy cập thông qua đối tượng
		Sinhvien.school="TMA";
		System.out.println(sv.school);
		a.school="HUST";
		System.out.println(sv.school);
		//chỉ nên truy cập biến static thông qua tên class
		//
		
		//---------CÁC HÀM trong class(PHƯƠNG THỨC)--METHODS--------
		//chia làm 2 loại:
		//+Phương thức thể hiện(instance method)
		//+Phương thức tĩnh(static methods)
		
		
		//+Phương thức thể hiện:
		//+đi liền với đối tượng,  chỉ có thể truy cập và sử dụng thông qua đối tượng
		//có khẳ năng truy cập và sử dụng các biến thể hiện
		//tác dụng:  dùng để xử lí các thông tin lưu trong biến thể hiện
		//có thể truy cập các biến static
		
		sv.showInfo();
		a.showInfo();
		
		//+Phương thức tĩnh -static methods
		//+đi liền với class chứ ko đi vs đối tượng
		//+có thể truy cập trực tiếp thông qua tên class
		//+không thể truy cập tới các biến thể hiện
		//+chỉ làm việc vs các biến static
		//dùng để viết các hàm chức năng mà không xử lí dlieu của đối tượng hoặc dùng để xử lí các dlieu nội bộ của bản thân class(các biến static)
		Sinhvien.whatSchool();
		
		//Initializer
		//là các khối code được xác định bỏi 2 cặp ngoặc móc nằm trogn khối thân class
		
		//nhiệm vụ là khởi tạo giá trị mặc định cho các instance variables hoặc các static variables
		//
		
		//có 2 loại:
		//+instance initializer
		//+static initializer 
		
		//1.instance initializer:
		//+khởi tạo giá trị cho các biến instance
		//+sẽ tự động được chạy trước khi constructor được gọi
		
		//2.static initializer 
		//có từ khóa đứng trc khối code
		//+khởi tạo các giá trị cho biến static
		//sẽ tự động được gọi khi class được load vào bộ nhớ 
		//chỉ gọi 1 lần
				
	}
}
