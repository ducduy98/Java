package Bai1;

import java.util.Random;

public class Sophuc {
	int a;
	int b;
	public Sophuc() {
		this.a=0;
		this.b=0;
	}
	public Sophuc(int a,int b) {
		this.a=a;
		this.b=b;
	}
	public void cong(Sophuc sp1,Sophuc sp2) {
		
		System.out.println("Tổng 2 số là:"+(sp1.a+sp2.a)+"+"+(sp1.b+sp2.b)+"i");
		
	}
	public void tru(Sophuc sp1,Sophuc sp2) {
		System.out.println("Hiệu 2 số là:"+(sp1.a-sp2.a)+"+"+(sp1.b-sp2.b)+"i");
	}
	public void nhan(Sophuc sp1,Sophuc sp2) {
		int nguyen=sp1.a*sp2.a-sp1.b*sp2.b;
		int thuc=sp1.a*sp2.b+sp2.a*sp1.b;
		System.out.println("Tích 2 số là:"+nguyen+"+"+thuc+"i");
	}
	public void chia(Sophuc sp1,Sophuc sp2) {
		if(sp2.a==0&&sp2.b==0) {
			System.out.println("Ko thể chia");
		}
		else {
			int nguyen=(sp1.a*sp2.a+sp2.b*sp1.b)/(sp2.a*sp2.a+sp2.b*sp2.b);
			int thuc=(sp2.a*sp1.b-sp1.a*sp2.b)/(sp2.a*sp2.a+sp2.b*sp2.b);
			System.out.println("Thương 2 số là:"+nguyen+"+"+thuc+"i");
		}		
	}
	public static int trathuc(Sophuc x)
	{
		return x.a;		
	}
	public static int traao(Sophuc x)
	{
		return x.b;		
	}
	public void toString(Sophuc x) {
		if(x.a==0) {
			System.out.println("Số phức là:"+x.b+"i");
		}else if(x.b<0) {
			System.out.println("Số phức là:"+x.a+x.b+"i");
		}
		else {
			System.out.println("Số phức là:"+x.a+"+"+x.b+"i");
		}			
	}
	public static void getRandom() {
		Random ran = new Random();
		Sophuc x = new Sophuc(); 
		x.a = ran.nextInt(20) - 10;
		x.b  = ran.nextInt(20) - 10;
		System.out.println(x.a+"+"+x.b+"i");
		
	}

}
