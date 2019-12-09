package Bai1;

import java.util.Scanner;

public class main {
	public static void main(String args[]) {
		System.out.println("Nhập số điện tiêu thụ:");
		Scanner sc=new Scanner(System.in);
		int soDien= sc.nextInt();
		double giaDien;
		if(soDien<=50&&soDien>=0) giaDien=1678;
		else if(soDien<=100&&soDien>=51) giaDien=1734;
		else if(soDien<=200&&soDien>=101) giaDien=2014;
		else if(soDien<=300&&soDien>=201) giaDien=2536;
		else if(soDien<=400&&soDien>=301) giaDien=2834;
		else giaDien=2927;
		double tongTien=(soDien+soDien*0.1)*giaDien;
		System.out.println("Tổng tiền điện: "+ tongTien);
}
}