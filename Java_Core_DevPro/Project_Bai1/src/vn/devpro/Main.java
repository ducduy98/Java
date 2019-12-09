package vn.devpro;

import java.time.LocalDate;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
//		System.out.println("Hello World!!!");
//		System.out.println("Xin chào tuổi " );
//		int a=20;
//		String n="first ";
//		char ch='a';
//		
//		
//		
//		System.out.println(ch);
//		System.out.print(n);
//		System.out.println(a+n);
//		char c =100;
//		c=(char) (ch+1);
//		System.out.println(c);
//		boolean bl=true;
//		float f=2.3454446f;
//		
////		định dạng đầu ra
//		System.out.format("\n kiểu char %c \n kiểu int: %d \n kiểu float: %f", ch,a,f);
//		System.out.format("\n kiểu char %c \n kiểu int: %d \n kiểu float: %-8.2f", ch,a,f);
//		System.out.format("\n kiểu char %c \n kiểu int: %d \n kiểu float: %+015.3f", ch,a,-10.2233);
//		System.out.format("\n so thuc:%1$5.2f %1$5.2f %1$5.2f \n", f);
//		//
//		Date today= new Date();
//		System.out.println(today);
//		System.out.format("%1$td -%1$tb-%1$tY",today);
//		
//		Locale vn= new Locale("vi","VN");
//		System.out.format(vn,"\n %1$td -%1$tB-%1$tY",today);
//		
//		Locale kr= Locale.KOREA;
//		System.out.format(kr,"\n %1$td -%1$tB-%1$tY",today);
//		
//		Locale df= Locale.getDefault();//lấy local mặc định của hệ thống
//		System.out.format(df,"\n %1$td -%1$tB-%1$tY",today);
//		
//		//Nhập dữ liệu:
////		Nhập từ bàn phím
//		//dùng scanner
		Scanner sc=new Scanner(System.in);
//		System.out.println("\nNhập vào 1 số nguyên: ");
//		int d=sc.nextInt();	
//		System.out.println();
//		System.out.println("\nNhập vào 1 số thực: ");
//		float e =sc.nextFloat();	
//		
//		System.out.println("\nNhập vào 1 byte ");
//		byte g =sc.nextByte();	
//		System.out.println("\nNhập vào tên ");
//		sc.nextLine();//xả bộ đệm
//		
//		String name =sc.nextLine();
//		System.out.println("d= "+d+"e= "+e+"g= "+g+"name= "+name);
//		//khi chuyển từ nhập số sang nhập chuỗi tên trên 1 đối tượng scanner sẽ bị trôi lệnh nhập chuỗi
//		//Xử ly: gọi trước 1 lệnh nextLine(); 1 lần sau khi nhập số===> xa bộ đệm bàn phím
//		
		//
		System.out.println("Nhập thông tin cá nhân:\n");
		System.out.println("Nhập tên:");	
		String ten= sc.nextLine();
		
		System.out.println("Nhập tuổi:");
		int tuoi=sc.nextInt();
		System.out.println("Nhập trường :");
		sc.nextLine();
		String truong=sc.nextLine();
		System.out.println("Quê quán: ");
		String que=sc.nextLine();
		System.out.println("Nhập mã tỉnh:");
		int ma= sc.nextInt();
		System.out.println("Tên: "+ten+"\nTuổi: "+tuoi+"\nTrường: "+truong+"\nQuê: "+que+"\nMã tỉnh: "+ma);
		
		
	}
}
//------------------------------
//tên biến không trùng vơi tên khóa, 
//Naming convention(quy định đặt tên)==dành cho biến
//+tên biến bắt đầu bằng chữ thường
//+Không nên viết tắt
//+Tên biến phải là một từ có nghĩa và có thể đọc được
//+Phân tách các từ bằng cách viết hoa các chữ cái đầu của các từ phía sau
//Ex: float diemTrungBinh;
//Naming convention==dành cho hằng số
//+Viết hoa các chữ cái
//+Phân tách các từ bằng dấu _
//Ex: float PI= 3.14f; double A=3.222d;String PROTOCOL="https";
//
//------------------------------
//--CÁC KIỂU DL CƠ BẢN---
//  DL kiểu số:: byte, char,long, short, int, float, double.
//  DL kí tự:: char;
//  Kiểu logic:: boolean. (1 byte true/false)
//-------------------------------
//II. Nhập xuất dl:
//	print:
//		System.out.println(); in xuống dòng
//		System.out.print();//in ko xuống dòng


