package Bai1;

import java.util.Random;
import java.util.Vector;

public class main {
	public static void main(String args[]) {
		int[] mI = {14,11,23,16,47,35,62,17,28,39};
		tron(mI);
		for (int i = 0; i < mI.length; i++) {
			System.out.print(mI[i]+" ");
		}		
	}
	static void tron(int [] m) {
		int x= m.length;
		Random ran= new Random();
		for (int i = x-1; i >0; i--) {
			int id=ran.nextInt(i+1);
			int a= m[id];
			m[id]=m[i];
			m[i]=a;
		}
	}
}
