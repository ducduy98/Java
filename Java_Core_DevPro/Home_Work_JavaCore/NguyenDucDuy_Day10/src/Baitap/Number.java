package Baitap;

import java.util.Random;

public class Number {
	private int number_A,number_B,number_C;
	private int flag=1;
	public int dem=0;
	public synchronized void Num_A() {
		if(flag ==1){
		flag=2;
		this.number_A= new Random().nextInt(101);
		System.out.println("A="+number_A);
		notifyAll();
		
		}
		else {
			try {
				this.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		//return this.number_A;
		
	}
	public synchronized void Num_B() {
		if(flag==2){
		flag=3;
		this.number_B=new Random().nextInt(101);
		notifyAll();
		System.out.println("B="+number_B);		
		}else {
			try {
				this.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	public synchronized void Num_Sum() {
		if(flag==3) {
		flag=1;
		notifyAll();
		number_C=number_A+number_B;
		//System.out.println("Lần thứ :"+(i+1));
		System.out.println("C= "+number_C);
		System.out.println("--------------------");
		}else {
			try {
				this.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
