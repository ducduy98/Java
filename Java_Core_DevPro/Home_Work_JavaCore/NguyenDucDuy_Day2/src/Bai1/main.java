package Bai1;

import java.util.Scanner;

public class main {
	public static void main(String args[]) {
		String hoten, diachi;
		int tuoi;
		System.out.println("Nhập vào thông tin cá nhân:");
		Scanner sc=new Scanner(System.in);
		System.out.println("Họ tên: ");
		hoten= sc.nextLine();
		System.out.println("Tuổi: ");
		tuoi = sc.nextInt();
		System.out.println("Địa chỉ: ");
		sc.nextLine();
		diachi=sc.nextLine();
		System.out.println("Thông tin bạn vừa nhập:\n");
		System.out.println("\tHọ tên: "+ hoten);
		System.out.println("\tTuổi: "+tuoi);
		System.out.println("\tĐịa chỉ : "+diachi);
	}

}
