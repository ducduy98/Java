package Baitap;

public class main {
	public static void main(String[] args) {
		Number number=new Number();
		FirstNumber firstnum=new FirstNumber(number);
		SecondNumber secondnum=new SecondNumber(number);
		Sum sum=new Sum(number);
		
		
		Thread firstThread= new Thread(firstnum);
		Thread secondThread= new Thread(secondnum);
		Thread sumThread= new Thread(sum);
		firstThread.start();
		secondThread.start();
		sumThread.start(); 
	}
	
}
