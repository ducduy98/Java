package devpro;

import java.util.Scanner;

public class main {
	public static void main(String args[]) {
//		int a=9;
//		if(a>0)
//		{ 
//			System.out.println("a là số dương");
//		}else
//		{
//			System.out.println("a ko là số dương");
//		}
		//switch-case 
		//gồm nhiều case liệt kê giá trị và đằng sau là khối lệnh được thực thi khi giá trị của biến switch rơi vào case đó
		//một khối lệnh của 1 case sẽ nằm giữa dấu : cho đến hết case đó
		//switch -case sẽ có break sau mỗi case 
		//trong 1 khối switch case thì các case không được phép trùng nhau
		//nếu các công việc tương ứng vs các case mà giống nhau thì ta có thể gộp chúng lại
		//case default:  là 1 case đặc biệt thường được đặt ở cuối 1 khối switch , nhiệm vụ là để xử lý các trường hợp còn lại
		//các kiểu dl được phép switch
		//int, byte, short, char, string, enum
		
//		System.out.println("Nhập m: ");
//		//int m=new Scanner(System.in).nextInt();	
//		
//		String n=new Scanner(System.in).next();
//		
////		System.out.println(n);
//	switch (n) {
//		case "mot":
//			System.out.println("January");
//			break;
//		case "hai":
//			System.out.println("February");
//			break;
//		case "ba":
//			System.out.println("March");
//			break;
//		case "muoi":
//		case "muoimot":
//		case "muoihai":
//			System.out.println("Winter!!");
//			break;
//		default:
//			System.out.println("Nhập lại:x:");
//		}
		//----------------------------------------
		
		//------------Vòng While
		
		//luôn kiểm tra điều kiện trước khi thực hiện
		//có thể sé không thực hiện công việc lần nào nếu điều kiện sai ngay từ đầu
		//vòng lặp dừng khi điều kiện sai
		//nếu điều kiện  không bị thay đổi bởi coogn việc trong vòng lặp thì nếu dk đúng  thì vòng lặp sẽ chạy vô hạn
		//trong thân vòng lặp phải có lệnh break để chủ động thoát khỏi vòng while hoặc cần có lệnh làm thay đổi điều kiện để vòng lặp có thể dừng lại
		//----------------------------
//		int a=5;
//		while(a>0)
//		{
//			System.out.println(a);
//			a--;
//		}
		
		//-------Vòng lặp do-while
//		Scanner sc= new Scanner(System.in);
//		int n;
//		do {
//			System.out.println("Nhập vào 1 số nguyên trong khoảng 1-12");
//			n=sc.nextInt();
//		}while (n<1||n>12);
		//
		//------------------------
		
		//--------Vòng lặp for
		
//		for (int i = 0; i < n; i++) {
//			System.out.println(i);
//		}
		
		here:for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=10;j++)
			{
				if(j>3) break here;
				System.out.println(i+"--"+j);
				
			}
		}
	//lệnh continue
	//chỉ dùng vs vòng lặp
	//giúp bỏ dở 1 lần lặp để chuyển sang lần lặp tiếp theo
	
	for (int i = 0; i < 100; i++) {
		System.out.println("work1:"+i+"%");
		if(i!=20)continue;
		System.out.println("work2:"+i+"%");
		System.out.println("work3:"+i+"%");
		
	}
	}

}
