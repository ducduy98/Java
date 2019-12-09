package Bai1;

import java.io.ObjectInputStream.GetField;
import java.util.Scanner;

public class main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Sophuc sp1=new Sophuc();
		Sophuc sp2=new Sophuc();
		Sophuc tinh = new Sophuc();
		System.out.println("Nhập vào số phức thứ nhất: ");
		sp1.a=sc.nextInt();
		sp1.b=sc.nextInt();
		System.out.println("Nhập vào số phức thứ hai: ");
		sp2.a=sc.nextInt();
		sp2.b=sc.nextInt();
		if(sp1.a==0) {
			System.out.println("Số phức thứ nhất là:"+sp1.b+"i");
		}else if(sp1.b<0) {
			System.out.println("Số phức thứ nhất là:"+sp1.a+sp1.b+"i");
		}
		else {
			System.out.println("Số phức thứ nhất là:"+sp1.a+"+"+sp1.b+"i");
		}
		if(sp2.a==0) {
			System.out.println("Số phức thứ nhất là:"+sp2.b+"i");
		}else if(sp2.b<0) {
			System.out.println("Số phức thứ nhất là:"+sp2.a+sp2.b+"i");
		}
		else {
			System.out.println("Số phức thứ nhất là:"+sp2.a+"+"+sp2.b+"i");
		}
		
		//lựa chọn phép tính
		System.out.println("Lựa chọn phép tính:");
		System.out.println("1: Cộng, 2: Trừ, 3: Nhân , 4: Chia");
		int key=sc.nextInt();
		
		switch (key) {
		case 1:
			tinh.cong(sp1,sp2);
			break;
		case 2:
			tinh.tru(sp1,sp2);
			break;
		case 3:
			tinh.nhan(sp1,sp2);
			break;
		case 4:
			tinh.chia(sp1,sp2);
			break;
		default:
			System.out.println("Chọn sai");
			break;
		}

		System.out.println("Phần thực của số thứ 1: "+Sophuc.trathuc(sp1));
		System.out.println("Phần ảo của số thứ 1:   "+Sophuc.traao(sp1));
		
		System.out.println("Phần thực của số thứ 2: "+Sophuc.trathuc(sp2));		
		System.out.println("Phần ảo của số thứ 2:   "+Sophuc.traao(sp2));
		
		//toString 
		tinh.toString(sp1);
		
		//random
		System.out.println("Random");
		Sophuc.getRandom();
		
	}
	
	
}
