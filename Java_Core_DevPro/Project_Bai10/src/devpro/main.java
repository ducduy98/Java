package devpro;

import java.util.Scanner;

public class main {
	public static void main(String[] args) {
//		Scanner sc=new Scanner(System.in);
//		int a=sc.nextInt();
//		int b=sc.nextInt();
//		int c=a/b;
//		System.out.println("c= "+c);

		// xử lí ngoại lê

		// sd try-catch
		// bao toàn bộ đoạn code gây lỗi vào trong khối try,sau đó đặt sau khối try 1
		// khối catch có khai báo Exception
		//
/*		try {
			Scanner sc = new Scanner(System.in);
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = a / b;
			System.out.println("c= " + c);
			
		} catch (ArithmeticException ex) {
			//handler
			System.out.println("Lỗi chia 0!!!!!!");
		}
*/
		//khi Exception xảy ra thì quá trình thực thi code tỏng khối try sẽ dnwgf lại, chuyển sang pha xử lí lỗi catch 
		// trong pha xử lí lỗi :
		//nếu khối catch phía sau try có khai báo Exceeption khớp kiểu với Exception sinh ra thì exception sẽ được giao cho khối catch này xử lí,
		//các lệnh trong catch được chạy
		
		//theo sau 1 khối try có thể có nhiều khối catch
		
		/*try {
			
		} 
		catch (SomeException e) {
			// TODO: handle exception
		}
		catch (Exception e) {
			// TODO: handle exception
		}
		*/
		//mỗi khối catch có nhiệm vụ bát 1 loại exception 
		//nếu 1 khối catch được chạy thì toàn bộ các khối catch phía sau sẽ bị bỏ qua
		
		//MẸO: muốn ko để thoát exception thì phải luôn đặt 1 khối catch bắt exception ở cuối cùng sau tất cả các khối catch khác

		
/*		try {
			Scanner sc = new Scanner(System.in);
			int a = sc.nextInt();
			int b = sc.nextInt();
//			if(b==1) throw new Exception("Số chia là 1!!!");
			if(b==1) throw new DevideByOneException("Số chia là 1!!!");
			int c = a / b;
			System.out.println("c= " + c);
			
		} catch (ArithmeticException ex) {
			//handler
			System.out.println("Lỗi chia 0!!!!!!");
		}catch (NullPointerException e) {
			e.printStackTrace();
		}
		catch (DevideByOneException e) {
			System.out.println(e.getMessage());
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
	*/	
		//throw dùng để tự ném ra ngoại lê(chủ đọng)
		//throw phải đặt trong try -catch hoặc trong method đã được khai báo throw ngoại lệ(throws)
		
		//==========================
		//throws dùng để khai báo cho 1 method có thể ném ra các ngoại lệ nào , tên của các ngoại lệ được đạt sau từ khóa throws ,
		//và cách nhau 1 dấu phẩy
		//đặt phần khia báo này trước tahan hàm
		
		
		//sd hàm có throws ngoại lệ
//		try {
//			int c=calculate(10, 0);
//		} catch (DevideByOneException e) {
//			// TODO Auto-generated catch block
//			//e.printStackTrace();
//			System.out.println(e.getMessage());
//		}
		
		//============
		///finally-dùng để định nghĩa 1 khối code luôn được chạy
		//thường đi vs try-catch , hoặc là try 
		//try-catch-finally
		//try -finally
		//chỉ có duy nhất 1 khối finally theo sau 1 khối try-catch hoặc try
		
		//finally dùng để đặt các khối code mà cần chắc chắn phải chạy 
		//ví du:  đóng file, đóng kết nối vs csdl,ngắt kết nối mạng ...
	/*
		try {
			int c=calculate(10,2);
			System.out.println("kết quả c= "+c);
			c=5/0;
		} catch (DevideByOneException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println(e.message);
		}finally {
			System.out.println("Đã tính xong!!!");
		}
	*/
		
		//=========================================================
		//II: ĐA LUỒNG: Multithreading 
		//Luồng?
		//Luồng là 1 đơn vị mà code sẽ được thực thi trên đó
		//1 chương trình java luôn có 1 luồng chính là main thread --là luồng chịu trách nhiệm chạy hàm main
		//MỘt luồng có thể được tạo ra bằng 2 cách: kế thừa Class Thread của java hoặc sử dụng interface Runnable
		
		//tạo thread từ class MyThread
		MyThread t1=new MyThread("Luong-1");
		MyThread t2=new MyThread("Luong-2");
		MyThread t3=new MyThread("Luong-3");
		
		//khởi chạy t1
		//t1.start();
//		t2.start();
//		t3.start();
//		for (int i = 0; i <50; i++) {
//			System.out.println("Main thread: "+i);
//			try {
//				Thread.sleep(500);
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
//		}
		
//		t1.start();
		
		///tạo luồng từ class MyRunnable 
//		MyRunnable myRun =new MyRunnable();
//		Thread t4= new Thread(myRun);
//		System.out.println(t4.getState());
//		//chạy
//		t4.start();
		
		
		Data data = new Data();
		Sender sender=new Sender(data);
		Receiver receiver=new Receiver(data);
	    Thread senderThread = new Thread(sender);
	    Thread receiverThread = new Thread(receiver);
	     //
	    senderThread.start();
	    receiverThread.start();
		
		
		
	}
	
	
	
	
	
	
	
	
	
	public static int calculate(int a,int b) throws DevideByOneException {
		if(b<1) throw new DevideByOneException("ko chia được cho số này : "+b);
		return a/b;
	}
	
	
	
	
}
