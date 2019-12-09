package Bai1;

public class main {
	public static void main(String[] args) {
		Sophuc a=new Sophuc(2,-3);
		Sophuc b=new Sophuc(5,-1);
		Sophuc c=a.cong(b);
		System.out.println("a="+a);
		System.out.println("b="+b);
		System.out.println("c="+c);
		Sophuc d=new Sophuc(1,0);
		System.out.println(d);
		System.out.println(Sophuc.getRandomCmp());
	}
}
