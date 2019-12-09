package Bai2;

import java.util.Scanner;

public class main {
	public static void main(String args []) {
		System.out.println("Nhập n:");
		Scanner sc=new Scanner(System.in);
		int a = sc.nextInt();
		int kq1=dequy(a);
		System.out.println("S1= "+kq1);
		
		int kq2=0;
		for (int i = 1; i <= a; i++) {
			kq2+=i*i;
		}
		System.out.println("S2= "+kq2);
	}
	static int dequy(int n)
	{
		int s = 0;
		if(n==1) return 1;
		return s=n*n+dequy(n-1);
		//return s;
	}
}
