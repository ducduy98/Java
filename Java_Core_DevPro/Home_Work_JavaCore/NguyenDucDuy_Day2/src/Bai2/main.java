package Bai2;

import java.util.Scanner;

public class main {
	public static void main(String args[]) {
		System.out.println("Nhập vào thông tin :");
		Scanner sc=new Scanner(System.in);
		System.out.println("Tuổi:");
		int tuoi= sc.nextInt();
		System.out.println("Cân nặng:");
		double can= sc.nextDouble();
		System.out.println("Chiều cao:(cm)");
		double cao= sc.nextDouble();
		System.out.println("Giới tính:Nam/Nữ??");
		sc.nextLine();
		String gt= sc.nextLine();
		boolean kq= tuoi<=45 && tuoi>=22 && can<=92 && can>=50 && cao>=170 &&gt.equals("Nam");
		System.out.println(kq); 
//		System.out.println(tuoi);
//		System.out.println(can);
//		System.out.println(cao);
//		System.out.println(gt);
		System.out.println("Đút lót bao nhiêu nào???");
		double dut=sc.nextDouble();
		System.out.println("Con ông cháu cha nào ko???(Có:Không)");
		sc.nextLine();
		String x= sc.nextLine();
		boolean kq2=dut>=10000000||x.equals("Có")||kq;
				
		System.out.println(kq2);
	}
}
