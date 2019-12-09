package Bai3;

public class main {
	public static void main(String arg[]) {
		int a=5,b=6,c=2;
		boolean kq = ((a + (b * c) > (a - b) * c++)) && (((c > b) && (a > b)) || a > (c + b));
		
		boolean kq1 = a + b * c > (a - b) * c++ &&( c > b && a > b || a > c + b);
		
		
		System.out.println(kq);
		System.out.println("Sửa thành : kq1");
		
		System.out.println(kq1);
	}

}
