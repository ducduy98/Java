package Bai2;

import java.util.Scanner;

public class main {
	public static void main (String args[]) {
		double [] a = new double[10];
		int x;
		System.out.println("Nhập vào mảng : ");
		Scanner sc=new Scanner(System.in);
		for (int i = 0; i < a.length; i++) {
			System.out.println("a["+i+"]=");
			a[i]=sc.nextDouble();
		}
		System.out.print("Mảng đã nhập: ");
		for (int i= 0; i < a.length;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println("\nBạn muốn xóa phần tử thứ ?: ");
		x=sc.nextInt();
		a=xoa(a, x-1);
		System.out.print("Mảng sau khi xóa: ");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
		}
	}
	static double[] xoa(double[] a,int x) {
		int z=a.length;
		double [] b =new double[z-1];
		//x=x-1;
		if(x<0||x>=z) {
			return a;
			}
		int j=0;
			for (int i = 0; i <z; i++) {
				if (i!=x) {
					b[j]=a[i];
					j++;
				}
			}	
			return b;
		}
		
	}

