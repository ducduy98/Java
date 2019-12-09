package Bai1;

import java.util.Random;

public class main {
public static void main(String[] args) {
	CharSequence s="aaaaaaafhf";
	MyChar m= new MyChar();
	m.setContent("Nguyênx Đức Duy");
	String daochuoi=m.dao();
	int dai=m.length();
	System.out.println(daochuoi);
	System.out.println("Độ dài chuỗi: "+dai);
	Random ran=new Random();
	int index=ran.nextInt(dai);
	System.out.println("Kí tự thứ "+(index+1)+" là:'"+m.charAt(index)+"'");
	int dau=ran.nextInt(dai);
	int cuoi=ran.nextInt(dai);
	if(dau>cuoi) {
		int tg=dau;
		dau=cuoi;
		cuoi=tg;
	}
	System.out.println("Cắt chuỗi từ vị trí "+(dau+1)+" đến vị trí "+(cuoi+1)+" ta được chuỗi mới:'"+m.subSequence(dau,cuoi)+"'");
}
}
