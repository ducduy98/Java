package Baitap;

public class main {
 public static void main(String[] args) {
	Human me=new Human("Nguyễn Đức Duy",21,"Hải Dương","0123456789");
	Human you=new Human("Phi Thanh Dat",26,"Lien Mac","23456737585");
	me.setSoDT("0357944440");
	me.showInfo();	
	
	you.showInfo();
	
	//===================================================================//Trả lời
	/*Câu hỏi: 
			Câu 1: Tính đóng gói được thực hiện như thế nào?
			-Các thành viên dữ liệu được đặ private, muốn đặt hoặc lấy dữ liệu cần sử dụng getter và setter
			
			Câu 2: Để tuân thủ tính đóng gói khi thiết kế class, cần tuân thủ những quy tắc nào?
			-Các properties thường đặt private
			-Các hàm(methods) thường đặt public
			-Việc đưa dữ liệu vào và ra khỏi đối tượng sẽ thông qua các hàm get-set
			
			Câu 3: Method có thể đặt mức truy nhập là private được không? Khi nào thì một method có thể được đặt là private?
			Method có thể được đặt là private, khi nó không cần dùng ở các code ngoài (chỉ dùng trong nội bộ lớp đó),
			hoăc người lập trình ko muốn hiển thị hàm đó ở các code bên ngoài,
			giúp giảm sự phức tạp hay là tính gọn gàng khi code ngoài và tuy nhiên nó vẫn được sử dụng trong class chứa nó
			Câu 4: Tại sao ta nên đặt các properties là private?
			Vì đây chính là các thông tin nội bộ của lớp không thể để truy cập 1 cách tuỳ tiện được (che giấu thông tin).
			-Bảo vệ thông tin nội bộ
			-Giảm sự rườm rà, tránh bớt rối khi code.
*/
 }
}
