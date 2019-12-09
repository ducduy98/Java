package Bai3;

import java.util.Random;

public class main {
	public static void main(String args[]) {
		String str="1234567890qwertyuiopasdfghjklzxcvbnm"
				+ "QWERTYUIOPASDFGHJKLZXCVBNM";
		Random rd= new Random();
		String str2="";
		while(str2.length()<20) {
			str2+=str.charAt(rd.nextInt(str.length()));
		}
		
		System.out.print("Chuỗi được tạo ngẫu nhiên là: "+str2);
	}

}
