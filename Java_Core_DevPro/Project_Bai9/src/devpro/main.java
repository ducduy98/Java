package devpro;

import Shape.circle;
import Shape.square;
import interfaces.Processor;
import interfaces.Receiver;

public class main {
	public static void main(String[] args) {
		//interface
		//là 1 kiểu dl chứa tham chiếu , tương tự class nhưng chỉ chứa phương thức trừu tượng và hằng static
		//tạo interface trong 1 file *java riêng, có tên file trùng với tên Interface
		//hoặc tạo interface trong class(inner interface)
		
		
		//vai trò :
		//+tạo bộ khung method cho các class
		//+DÙNG LÀM KIỂU DL CHUNG để giao tiếp giữa các class vơi nhau
		
		//1: Tọa khng cho class??
		//+ko thể trực tiếp dùng interface để khưởi tạo dối tượng
		//+interface dùng để cho các class khác implement(cài đặt)
		//+khi 1 class implement 1 interface ta gọi class đó tuân thủ interface đó
		//+khi class tuân thủ interface nó bắt buộc phải override tất cả các  phương thức trừu tượng có trong interface.
		//Do vậy bộ khung method được định nghĩa trong Interface sẽ được copy cho class
		
		MyClass object=new MyClass();
		boolean kq= check(object);
		//hàm check có thể làm việc được với 1 đối tượng của class bất kì , chỉ cần class đó đã implement interface "MyInterface"
		//2: Dùng làm kiểu dữ liệu chung
		//khi 1 class impement interface thì đối tượng của class đó cũng được coi là thuộc kiểu của Interface
		
		MyInterface doituong=new MyClass();
		//==> có nhiều class khác nhua cùng imlement 1 interface thì tất cả các đối tượng class đó đều có thể quy chung về 1 kiểu
		//với tên kiểu chính là tên của INterfae chung
		        //   \\
			   //     \\
		      //       \\
		//giả sử viết 1 hàm dùng chung cho nhiều đối tượng
		//hàm move(hướng_di_chuyển, khoảng_cách,object);
		//dùng hàm move để di chuyển đối tượng của các class khác nhau( square , circle,retangle) 
		square sq=new square(100, 100);
		move(Direction.up, 10, sq);
		move(Direction.left, 10, sq);
		move(Direction.down, 10, sq);
		move(Direction.right, 10, sq);
		circle cir=new circle(200,200);
		System.out.println("===============================");
		move(Direction.up, 10, cir);
		move(Direction.left, 10, cir);
		move(Direction.down, 10,cir);
		move(Direction.right, 10, cir);
		    //   \\
		   //     \\
	      //       \\
		
		
		
		
		//dùng Interface để truyền dl giữa các class 
		//giả sử có 2 class là:
		//Processor và Receiver
		//Receiver nhận dl từ mạng về(giả lập)
		//sau khi nhận dl thì gửi về cho Processor xử lí
		//
		//Để truyền nhận giwuax 2 đối tượng của 2 class này thì cần có 1 interface ở giữa 
		//Trong interface chứa: 1 hàm để truyền dl.
		//dữ liệu sẽ được truyền thông qua tham số đưa vào hàm
		//gải sử truyền 1 doạn String
		//xác định nơi truyền và nơi nhận
		//nhận: Processor
		//truyền:  receiver 
		//quy tắc: class nhận thì sẽ implement interface 
		//class nào truyền thì sẽ chứa 1 instance có kiểu là interface
		//trong class truyền cấn có hàm để set giá trị cho biến instance
		
		//viết class Processor
		//tạo đối tượng và thử truyền nhận
		
		Receiver rec=new Receiver();
		Processor pro= new Processor();
		//kết nối với pro
		rec.setCallback(pro);
		//thử
		rec.dataArrive("Xin chào");
		rec.setCallback(sq);
		rec.dataArrive("Hello");
		
		
		//interface ra đời để đáp ứng việc đa kế thừa
		
		
		//trong java các class  chỉ có thể có duy nhất 1 class cha(đơn kế thừa)
		//một class có thể cùng lúc implement nhiều interface khác nhau
		//ví dụ ở square
		
	}
	public static void move(Direction d,int distance,Moveable obj) {
		if(d==Direction.up) {
			obj.moveUp(distance);
		}else if(d==Direction.down) {
			obj.moveDown(distance);
		}else if(d==Direction.left) {
			obj.moveLeft(distance);
		}else {//right
			obj.moveRight(distance);
		}
	}
	
	public static boolean check(MyInterface in) {
		return in.isConnected()&&in.isOK();
	}
	
	//inner interface
	//sd thông qua tên class
	public interface MyInnerInterface {
		void someMethod();
		int anotherMethod();
	}
}
